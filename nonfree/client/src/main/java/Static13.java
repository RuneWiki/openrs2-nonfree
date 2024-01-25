import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aq", name = "O", descriptor = "Lclient!gw;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!aq", name = "R", descriptor = "I")
	public static int anInt222;

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_2 = new Class268(260);

	@OriginalMember(owner = "client!aq", name = "L", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "Z")
	public static final boolean aBoolean14 = false;

	@OriginalMember(owner = "client!aq", name = "Q", descriptor = "Lclient!wh;")
	public static final Class267 aClass267_1 = new Class267("WIP", 2);

	@OriginalMember(owner = "client!aq", name = "S", descriptor = "Lclient!la;")
	public static final Class136 aClass136_7 = new Class136(81, 7);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BJLclient!qa;)V")
	public static void method239(@OriginalArg(1) long arg0, @OriginalArg(2) Class167 arg1) {
		Static30.anInt543 = 0;
		Static198.anInt3555 = Static380.anInt6413;
		Static380.anInt6413 = 0;
		@Pc(19) long local19 = Static354.method4966();
		for (@Pc(24) Class23_Sub3 local24 = (Class23_Sub3) Static77.aClass194_2.method4577(); local24 != null; local24 = (Class23_Sub3) Static77.aClass194_2.method4580()) {
			if (local24.method2965(arg1, arg0)) {
				Static30.anInt543++;
			}
		}
		if (Static12.aBoolean10 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static77.aClass194_2.method4585() + ", running: " + Static30.anInt543 + ". Particles: " + Static380.anInt6413 + ". Time taken: " + (Static354.method4966() - local19) + "ms");
		}
	}
}
