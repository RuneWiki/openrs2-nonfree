import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "[I")
	public static final int[] anIntArray438 = new int[32];

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray438[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub13(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		return Static4.method50(super.aClass5_Sub36_31.aClass2_Sub23_1.method7836()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)I")
	public int method6692() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		super.anInt10576 = arg0;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		if (super.aClass5_Sub36_31.aClass2_Sub23_1.method7837() && !Static4.method50(super.aClass5_Sub36_31.aClass2_Sub23_1.method7836())) {
			super.anInt10576 = 0;
		}
		if (super.anInt10576 < 0 || super.anInt10576 > 1) {
			super.anInt10576 = this.method8764();
		}
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)Z")
	public boolean method6693() {
		return Static4.method50(super.aClass5_Sub36_31.aClass2_Sub23_1.method7836());
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		return 0;
	}
}
