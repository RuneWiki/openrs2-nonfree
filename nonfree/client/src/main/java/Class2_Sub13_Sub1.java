import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!wa", name = "Db", descriptor = "I")
	private int anInt3976;

	@OriginalMember(owner = "client!wa", name = "Fb", descriptor = "Lclient!bd;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "(I)I")
	public int method2971() {
		return super.aByteArray49[super.anInt3940++] - this.aClass9_1.method207() & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z[I)V")
	public void method2972(@OriginalArg(1) int[] arg0) {
		this.aClass9_1 = new Class9(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(Z)V")
	public void method2974() {
		super.anInt3940 = (this.anInt3976 + 7) / 8;
	}

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "(I)V")
	public void method2975() {
		this.anInt3976 = super.anInt3940 * 8;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(BI)V")
	public void method2976(@OriginalArg(1) int arg0) {
		super.aByteArray49[super.anInt3940++] = (byte) (this.aClass9_1.method207() + arg0);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IB)I")
	public int method2977(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3976;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(BI)I")
	public int method2978(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt3976 >> 3;
		@Pc(14) int local14 = 8 - (this.anInt3976 & 0x7);
		@Pc(23) int local23 = 0;
		this.anInt3976 += arg0;
		while (arg0 > local14) {
			local23 += (Static26.anIntArray50[local14] & super.aByteArray49[local6++]) << arg0 - local14;
			arg0 -= local14;
			local14 = 8;
		}
		if (local14 == arg0) {
			local23 += super.aByteArray49[local6] & Static26.anIntArray50[local14];
		} else {
			local23 += super.aByteArray49[local6] >> local14 - arg0 & Static26.anIntArray50[arg0];
		}
		return local23;
	}
}
