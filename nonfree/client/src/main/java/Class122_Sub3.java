import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class122_Sub3 extends Class122 {

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!eq;Lclient!eq;Lclient!k;)V")
	public Class122_Sub3(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class8_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBZI)V")
	@Override
	protected void method7101(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(18) int local18 = this.method7099() * super.aClass8_5.anInt5334 / 10000;
		Static600.aClass87_15.aa(arg0, arg1 + 2, local18, super.aClass8_5.anInt5330 - 2, ((Class8_Sub3) super.aClass8_5).anInt5343, 0);
		Static600.aClass87_15.aa(arg0 + local18, arg1 + 2, super.aClass8_5.anInt5334 - local18, super.aClass8_5.anInt5330 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method7105(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static600.aClass87_15.method7954(arg1 - 2, arg0, super.aClass8_5.anInt5334 + 4, super.aClass8_5.anInt5330 + 2, ((Class8_Sub3) super.aClass8_5).anInt5342, 0);
		Static600.aClass87_15.method7954(arg1 - 1, arg0 + 1, super.aClass8_5.anInt5334 + 2, super.aClass8_5.anInt5330, 0, 0);
	}
}
