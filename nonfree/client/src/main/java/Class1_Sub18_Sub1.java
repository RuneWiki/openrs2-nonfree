import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class1_Sub18_Sub1 extends Class1_Sub18 {

	@OriginalMember(owner = "client!pf", name = "Ob", descriptor = "I")
	private int anInt3951;

	@OriginalMember(owner = "client!pf", name = "Vb", descriptor = "Lclient!fg;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub18_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[BI)V")
	public void method3124(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			arg0[local9] = (byte) (this.aByteArray71[this.anInt3911++] - this.aClass53_1.method1280());
		}
	}

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "(II)I")
	public int method3125(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3951;
	}

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "(I)V")
	public void method3126() {
		this.anInt3951 = this.anInt3911 * 8;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I)V")
	public void method3127(@OriginalArg(1) int[] arg0) {
		this.aClass53_1 = new Class53(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(Z)I")
	public int method3128() {
		return this.aByteArray71[this.anInt3911++] - this.aClass53_1.method1280() & 0xFF;
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(IB)I")
	public int method3129(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = 8 - (this.anInt3951 & 0x7);
		@Pc(22) int local22 = this.anInt3951 >> 3;
		@Pc(24) int local24 = 0;
		this.anInt3951 += arg0;
		while (local17 < arg0) {
			local24 += (Static163.anIntArray530[local17] & this.aByteArray71[local22++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local24 += Static163.anIntArray530[local17] & this.aByteArray71[local22];
		} else {
			local24 += this.aByteArray71[local22] >> local17 - arg0 & Static163.anIntArray530[arg0];
		}
		return local24;
	}

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "(II)V")
	public void method3130(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (this.aClass53_1.method1280() + arg0);
	}

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "(B)V")
	public void method3132() {
		this.anInt3911 = (this.anInt3951 + 7) / 8;
	}
}
