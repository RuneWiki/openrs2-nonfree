import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class81_Sub2_Sub1 extends Class81_Sub2 {

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;Lclient!ga;)V")
	public Class81_Sub2_Sub1(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class21_Sub3_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method6790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = super.aClass9_24.method8619();
		@Pc(26) int local26 = ((Class21_Sub3_Sub1) super.aClass21_5).anInt3481 * Static365.method5206() / 10 % local14;
		super.aClass9_24.method8614(local26 + arg0 - local14, arg1, arg2 + local14 - local26, arg3);
	}
}
