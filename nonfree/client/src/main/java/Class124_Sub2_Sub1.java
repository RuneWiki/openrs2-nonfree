import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class124_Sub2_Sub1 extends Class124_Sub2 {

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;Lclient!bl;)V")
	public Class124_Sub2_Sub1(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class35_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIBII)V")
	@Override
	protected void method6758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = super.aClass103_42.method7454();
		@Pc(23) int local23 = ((Class35_Sub1_Sub1) super.aClass35_5).anInt840 * Static89.method5578() / 10 % local11;
		super.aClass103_42.method7455(local23 + arg2 - local11, arg3, arg0 + local11 - local23, arg1);
	}
}
