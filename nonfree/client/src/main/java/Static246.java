import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "[Lclient!st;")
	public static final Class10_Sub1_Sub2_Sub2[] aClass10_Sub1_Sub2_Sub2Array1 = new Class10_Sub1_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;CB)[Ljava/lang/String;")
	public static String[] method4172(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static9.method7343(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0.charAt(local25) != arg1; local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(III)Z")
	public static boolean method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static327.anIntArrayArrayArray21[arg0][arg1][arg2];
		if (local7 == -Static287.anInt5340) {
			return false;
		} else if (local7 == Static287.anInt5340) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static41.anInt810;
			@Pc(26) int local26 = arg2 << Static41.anInt810;
			if (Static452.method6398(local22 + 1, Static112.aClass16Array3[arg0].JA(arg1, arg2), local26 + 1) && Static452.method6398(local22 + Static514.anInt8839 - 1, Static112.aClass16Array3[arg0].JA(arg1 + 1, arg2), local26 + 1) && Static452.method6398(local22 + Static514.anInt8839 - 1, Static112.aClass16Array3[arg0].JA(arg1 + 1, arg2 + 1), local26 + Static514.anInt8839 - 1) && Static452.method6398(local22 + 1, Static112.aClass16Array3[arg0].JA(arg1, arg2 + 1), local26 + Static514.anInt8839 - 1) && Static452.method6398(local22 + Static436.anInt7494, Static112.aClass16Array3[arg0].JA(arg1, arg2), local26 + 1) && Static452.method6398(local22 + Static514.anInt8839 - 1, Static112.aClass16Array3[arg0].JA(arg1 + 1, arg2), local26 + Static436.anInt7494) && Static452.method6398(local22 + Static436.anInt7494, Static112.aClass16Array3[arg0].JA(arg1, arg2 + 1), local26 + Static514.anInt8839 - 1) && Static452.method6398(local22 + Static514.anInt8839 - 1, Static112.aClass16Array3[arg0].JA(arg1, arg2), local26 + Static436.anInt7494) && Static452.method6398(local22 + Static436.anInt7494, Static112.aClass16Array3[arg0].JA(arg1, arg2), local26 + Static436.anInt7494)) {
				Static327.anIntArrayArrayArray21[arg0][arg1][arg2] = Static287.anInt5340;
				return true;
			} else {
				Static327.anIntArrayArrayArray21[arg0][arg1][arg2] = -Static287.anInt5340;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
	public static void method4175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static68.anInt1306 && arg2 <= Static589.anInt9684) {
			@Pc(19) int local19 = Static572.method7817(Static252.anInt4971, arg0, Static359.anInt6232);
			@Pc(27) int local27 = Static572.method7817(Static252.anInt4971, arg3, Static359.anInt6232);
			Static373.method5588(local27, arg2, local19, arg1);
		}
	}
}
