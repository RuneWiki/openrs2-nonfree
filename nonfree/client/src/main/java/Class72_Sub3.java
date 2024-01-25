import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class72_Sub3 extends Class72 {

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;Lclient!ob;)V")
	public Class72_Sub3(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class175_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZIBI)V")
	@Override
	protected void method5061(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static136.aClass12_8.method6435(arg0 - 2, arg1, super.aClass175_5.anInt9468 + 4, super.aClass175_5.anInt9476 + 2, ((Class175_Sub3) super.aClass175_5).anInt6565, 0);
		Static136.aClass12_8.method6435(arg0 - 1, arg1 - -1, super.aClass175_5.anInt9468 + 2, super.aClass175_5.anInt9476, 0, 0);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(BZII)V")
	@Override
	protected void method5060(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(17) int local17 = this.method5059() * super.aClass175_5.anInt9468 / 10000;
		Static136.aClass12_8.J(arg1, arg0 + 2, local17, super.aClass175_5.anInt9476 - 2, ((Class175_Sub3) super.aClass175_5).anInt6566, 0);
		Static136.aClass12_8.J(local17 + arg1, arg0 + 2, super.aClass175_5.anInt9468 - local17, super.aClass175_5.anInt9476 - 2, 0, 0);
	}
}
