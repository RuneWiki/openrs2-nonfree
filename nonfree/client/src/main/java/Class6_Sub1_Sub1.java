import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!md", name = "Wb", descriptor = "Lclient!jv;")
	private Class137 aClass137_1;

	@OriginalMember(owner = "client!md", name = "Xb", descriptor = "I")
	private int anInt4493;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!md", name = "m", descriptor = "(B)V")
	public void method3791() {
		this.anInt4493 = super.anInt7898 * 8;
	}

	@OriginalMember(owner = "client!md", name = "v", descriptor = "(I)Z")
	public boolean method3793() {
		@Pc(17) int local17 = super.aByteArray96[super.anInt7898] - this.aClass137_1.method3125() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BII)V")
	public void method3794(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray96[super.anInt7898++] - this.aClass137_1.method3127());
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[I)V")
	public void method3795(@OriginalArg(1) int[] arg0) {
		this.aClass137_1 = new Class137(arg0);
	}

	@OriginalMember(owner = "client!md", name = "n", descriptor = "(B)I")
	public int method3796() {
		@Pc(21) int local21 = super.aByteArray96[super.anInt7898++] - this.aClass137_1.method3127() & 0xFF;
		return local21 < 128 ? local21 : (super.aByteArray96[super.anInt7898++] - this.aClass137_1.method3127() & 0xFF) + (local21 - 128 << 8);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(IB)I")
	public int method3797(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt4493;
	}

	@OriginalMember(owner = "client!md", name = "w", descriptor = "(I)V")
	public void method3801() {
		super.anInt7898 = (this.anInt4493 + 7) / 8;
	}

	@OriginalMember(owner = "client!md", name = "o", descriptor = "(II)I")
	public int method3803(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt4493 >> 3;
		@Pc(22) int local22 = 8 - (this.anInt4493 & 0x7);
		@Pc(24) int local24 = 0;
		this.anInt4493 += arg0;
		while (arg0 > local22) {
			local24 += (super.aByteArray96[local10++] & Static398.anIntArray129[local22]) << arg0 - local22;
			arg0 -= local22;
			local22 = 8;
		}
		if (local22 == arg0) {
			local24 += super.aByteArray96[local10] & Static398.anIntArray129[local22];
		} else {
			local24 += super.aByteArray96[local10] >> local22 - arg0 & Static398.anIntArray129[arg0];
		}
		return local24;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IZ)V")
	public void method3804(@OriginalArg(0) int arg0) {
		super.aByteArray96[super.anInt7898++] = (byte) (arg0 + this.aClass137_1.method3127());
	}
}
