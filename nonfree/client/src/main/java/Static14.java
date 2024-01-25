import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aha", name = "N", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15;
		if (Static567.method8019(arg1)) {
			local15 = 0;
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = 0;
			if (Static144.aBoolean196) {
				local37 = Static590.anInt9656;
				local39 = Static606.anInt9939;
				local48 = Static386.anInt6769;
				local15 = Static294.anInt4740;
				local46 = Static98.anInt4153;
				Static386.anInt6769 = 1;
			}
			if (Static591.aClass357ArrayArray2[arg1] == null) {
				Static380.method8023(arg7, arg0, arg2, arg3, arg6 < 0, Static441.aClass357ArrayArray1[arg1], -1, arg5, arg6, arg4);
			} else {
				Static380.method8023(arg7, arg0, arg2, arg3, arg6 < 0, Static591.aClass357ArrayArray2[arg1], -1, arg5, arg6, arg4);
			}
			if (Static144.aBoolean196) {
				if (arg6 >= 0 && Static386.anInt6769 == 2) {
					Static354.method5603(Static606.anInt9939, Static294.anInt4740, Static98.anInt4153, Static590.anInt9656);
				}
				Static590.anInt9656 = local37;
				Static98.anInt4153 = local46;
				Static294.anInt4740 = local15;
				Static386.anInt6769 = local48;
				Static606.anInt9939 = local39;
			}
		} else if (arg6 == -1) {
			for (local15 = 0; local15 < 100; local15++) {
				Static609.aBooleanArray58[local15] = true;
			}
		} else {
			Static609.aBooleanArray58[arg6] = true;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method404(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static74.anInt1238; local16++) {
			if (arg0.equalsIgnoreCase(Static182.aStringArray13[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42);
	}
}
