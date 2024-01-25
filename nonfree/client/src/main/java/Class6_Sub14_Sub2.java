import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class6_Sub14_Sub2 extends Class6_Sub14 {

	@OriginalMember(owner = "client!qe", name = "Fb", descriptor = "Lclient!ov;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!qe", name = "Hb", descriptor = "I")
	private int anInt7282;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I)V")
	public Class6_Sub14_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(Z)Z")
	public boolean method6044() {
		@Pc(21) int local21 = super.aByteArray88[super.anInt7244] - this.aClass235_1.method5474() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "(I)V")
	public void method6045() {
		this.anInt7282 = super.anInt7244 * 8;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[BII)V")
	public void method6046(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray88[super.anInt7244++] - this.aClass235_1.method5479());
		}
	}

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "(II)I")
	public int method6047(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt7282;
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(B)I")
	public int method6048() {
		@Pc(29) int local29 = super.aByteArray88[super.anInt7244++] - this.aClass235_1.method5479() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.aByteArray88[super.anInt7244++] - this.aClass235_1.method5479() & 0xFF);
	}

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "(II)V")
	public void method6049(@OriginalArg(1) int arg0) {
		super.aByteArray88[super.anInt7244++] = (byte) (this.aClass235_1.method5479() + arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([IB)V")
	public void method6050(@OriginalArg(0) int[] arg0) {
		this.aClass235_1 = new Class235(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "(I)V")
	public void method6051() {
		super.anInt7244 = (this.anInt7282 + 7) / 8;
	}

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "(II)I")
	public int method6052(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt7282 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt7282 & 0x7);
		this.anInt7282 += arg0;
		@Pc(25) int local25 = 0;
		while (arg0 > local17) {
			local25 += (super.aByteArray88[local10++] & Static316.anIntArray514[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local25 += Static316.anIntArray514[local17] & super.aByteArray88[local10];
		} else {
			local25 += super.aByteArray88[local10] >> local17 - arg0 & Static316.anIntArray514[arg0];
		}
		return local25;
	}
}
