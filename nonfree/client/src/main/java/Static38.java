import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array2;

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!lg;")
	public static Class119 aClass119_24 = new Class119(64);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjava/awt/Canvas;ILclient!ul;)Lclient!ae;")
	public static Class4 method867(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface7 arg2) {
		return new Class4_Sub2(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public static void method868() {
		if (Static157.aClass173_1 != null) {
			Static157.aClass173_1.method5027();
			Static157.aClass173_1 = null;
		}
		Static224.method3940();
		Static312.method5482();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static169.aClass151Array1[local17].method4101();
		}
		Static12.method424(false);
		System.gc();
		Static169.method3192();
		Static216.anInt4152 = -1;
		Static8.aBoolean11 = false;
		Static288.method5250(true);
		Static108.aBoolean206 = false;
		Static138.anInt2879 = 0;
		Static278.anInt5657 = 0;
		Static146.anInt3013 = 0;
		Static342.anInt6864 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static264.aClass189Array1.length; local56++) {
			Static264.aClass189Array1[local56] = null;
		}
		Static169.anInt3463 = 0;
		Static214.anInt4133 = 0;
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static129.aClass62_Sub1_Sub2_Sub2Array1[local77] = null;
			Static338.aClass2_Sub10Array1[local77] = null;
		}
		for (@Pc(93) int local93 = 0; local93 < 32768; local93++) {
			Static37.aClass62_Sub1_Sub2_Sub1Array1[local93] = null;
		}
		Static136.aClass199_12.method5750();
		Static60.method1380();
		Static352.anInt6926 = 0;
		Static321.method5613();
		Static266.method4815();
		Static347.method3873();
		Static117.method2497(true);
		try {
			Static358.method3(Static177.aClass168_2.anApplet1, "loggedout");
		} catch (@Pc(129) Throwable local129) {
		}
	}
}
