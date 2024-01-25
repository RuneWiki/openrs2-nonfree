import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;Lclient!tca;)V")
	public Class124_Sub1(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class35_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method6753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static266.aClass82_8.method6179(arg1 - 2, arg0, super.aClass35_5.anInt9053 + 4, super.aClass35_5.anInt9046 - -2, ((Class35_Sub3) super.aClass35_5).anInt9057, 0);
		Static266.aClass82_8.method6179(arg1 - 1, arg0 - -1, super.aClass35_5.anInt9053 + 2, super.aClass35_5.anInt9046, 0, 0);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIZB)V")
	@Override
	protected void method6755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.method6756() * super.aClass35_5.anInt9053 / 10000;
		Static266.aClass82_8.aa(arg1, arg0 + 2, local22, super.aClass35_5.anInt9046 - 2, ((Class35_Sub3) super.aClass35_5).anInt9059, 0);
		Static266.aClass82_8.aa(arg1 + local22, arg0 + 2, super.aClass35_5.anInt9053 - local22, super.aClass35_5.anInt9046 + -2, 0, 0);
	}
}
