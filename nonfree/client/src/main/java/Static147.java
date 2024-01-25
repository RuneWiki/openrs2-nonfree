import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public static int anInt3260 = 0;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "F")
	public static float aFloat59 = 0.0F;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
	public static final int[] anIntArray240 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!pl;")
	public static Class1_Sub17 method2826(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class1_Sub17_Sub2");
			@Pc(10) Class1_Sub17 local10 = (Class1_Sub17) local6.getDeclaredConstructor().newInstance();
			local10.method5953(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub17_Sub1 local26 = new Class1_Sub17_Sub1();
			local26.method5953(arg0);
			return local26;
		}
	}
}
