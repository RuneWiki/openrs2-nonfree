import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mw", name = "Pb", descriptor = "Lclient!ni;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!mw", name = "Rb", descriptor = "I")
	private int anInt6152;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "(Z)Z")
	public boolean method4989() {
		@Pc(23) int local23 = super.aByteArray104[super.anInt9802] - this.aClass235_1.method5199() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "(II)V")
	public void method4990(@OriginalArg(1) int arg0) {
		super.aByteArray104[super.anInt9802++] = (byte) (this.aClass235_1.method5195() + arg0);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLclient!ni;)V")
	public void method4991(@OriginalArg(1) Class235 arg0) {
		this.aClass235_1 = arg0;
	}

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "(II)I")
	public int method4992(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt6152;
	}

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "(I)I")
	public int method4993() {
		@Pc(26) int local26 = super.aByteArray104[super.anInt9802++] - this.aClass235_1.method5195() & 0xFF;
		return local26 < 128 ? local26 : (super.aByteArray104[super.anInt9802++] - this.aClass235_1.method5195() & 0xFF) + (local26 - 128 << 8);
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(BI)I")
	public int method4994(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt6152 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt6152 & 0x7);
		@Pc(28) int local28 = 0;
		this.anInt6152 += arg0;
		while (local26 < arg0) {
			local28 += (Static288.anIntArray304[local26] & super.aByteArray104[local10++]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local28 += super.aByteArray104[local10] & Static288.anIntArray304[local26];
		} else {
			local28 += super.aByteArray104[local10] >> local26 - arg0 & Static288.anIntArray304[arg0];
		}
		return local28;
	}

	@OriginalMember(owner = "client!mw", name = "j", descriptor = "(Z)V")
	public void method4996() {
		this.anInt6152 = super.anInt9802 * 8;
	}

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "(I)V")
	public void method4997() {
		super.anInt9802 = (this.anInt6152 + 7) / 8;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B[I)V")
	public void method4998(@OriginalArg(1) int[] arg0) {
		this.aClass235_1 = new Class235(arg0);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II[BZ)V")
	public void method4999(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (super.aByteArray104[super.anInt9802++] - this.aClass235_1.method5195());
		}
	}
}
