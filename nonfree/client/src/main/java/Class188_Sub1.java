import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class188_Sub1 extends Class188 {

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;Lclient!ih;)V")
	public Class188_Sub1(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class56_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZBII)V")
	@Override
	protected void method7581(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(22) int local22 = this.method7583() * super.aClass56_5.anInt9422 / 10000;
		Static141.aClass13_27.aa(arg1, arg0 + 2, local22, super.aClass56_5.anInt9414 - 2, ((Class56_Sub3) super.aClass56_5).anInt4362, 0);
		Static141.aClass13_27.aa(local22 + arg1, arg0 + 2, super.aClass56_5.anInt9422 - local22, super.aClass56_5.anInt9414 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZIZI)V")
	@Override
	protected void method7582(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static141.aClass13_27.method8104(arg1 - 2, arg0, super.aClass56_5.anInt9422 + 4, super.aClass56_5.anInt9414 - -2, ((Class56_Sub3) super.aClass56_5).anInt4363, 0);
		Static141.aClass13_27.method8104(arg1 - 1, arg0 - -1, super.aClass56_5.anInt9422 + 2, super.aClass56_5.anInt9414, 0, 0);
	}
}
