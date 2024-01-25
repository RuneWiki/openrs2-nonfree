import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public static int anInt4061;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public static int anInt4054 = -1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)I")
	public static int method3362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!wd;)Z")
	public static boolean method3364(@OriginalArg(1) Class260 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean486) {
			return false;
		} else if (!arg0.method6336(Static7.anInterface6_2)) {
			return false;
		} else if (Static292.aClass74_22.method1883((long) arg0.anInt7736) == null) {
			return Static386.aClass74_27.method1883((long) arg0.anInt7733) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method3365() {
		if (Static327.anInt5634 < 0) {
			return;
		}
		@Pc(16) long local16 = Static449.method6552();
		Static327.anInt5634 = (int) ((long) Static327.anInt5634 + Static41.aLong44 - local16);
		if (Static327.anInt5634 > 0) {
			@Pc(36) int local36 = (Static327.anInt5634 << 8) / Static182.anInt3600;
			@Pc(41) int local41 = 255 - local36;
			@Pc(46) float local46 = (float) local36 / 255.0F;
			Static220.anInt3990 = ((Static34.anInt7200 & 0xFF00) * local36 + local41 * (Static262.aClass219_2.anInt6308 & 0xFF00) & 0xFF0000) + ((Static262.aClass219_2.anInt6308 & 0xFF00FF) * local41 + local36 * (Static34.anInt7200 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(83) float local83 = 1.0F - local46;
			Static147.anInt2986 = Static262.aClass219_2.anInt6310 * local41 + Static361.anInt6426 * local36 >> 8;
			Static65.aFloat20 = local83 * (Static262.aClass219_2.aFloat88 - Static47.aFloat9) + Static47.aFloat9;
			Static268.aFloat52 = Static343.aFloat65 + local83 * (Static262.aClass219_2.aFloat89 - Static343.aFloat65);
			Static191.anInt3693 = ((Static432.anInt7683 & 0xFF00FF) * local36 + (Static262.aClass219_2.anInt6309 & 0xFF00FF) * local41 & 0xFF00FF00) + (local36 * (Static432.anInt7683 & 0xFF00) + ((Static262.aClass219_2.anInt6309 & 0xFF00) * local41) & 0xFF0000) >>> 8;
			Static49.aFloat10 = Static245.aFloat37 + (Static262.aClass219_2.aFloat90 - Static245.aFloat37) * local83;
			Static145.aFloat25 = Static334.aFloat64 + (Static262.aClass219_2.aFloat91 - Static334.aFloat64) * local83;
			Static154.aFloat27 = Static195.aFloat96 + local83 * (Static262.aClass219_2.aFloat93 - Static195.aFloat96);
			Static350.aFloat87 = local83 * (Static262.aClass219_2.aFloat92 - Static140.aFloat24) + Static140.aFloat24;
			if (Static262.aClass219_2.aClass82_5 != Static259.aClass82_4) {
				Static58.aClass82_3 = Static47.aClass66_3.method5051(Static259.aClass82_4, Static262.aClass219_2.aClass82_5, local83, Static58.aClass82_3);
			}
		} else {
			Static65.aFloat20 = Static262.aClass219_2.aFloat88;
			Static145.aFloat25 = Static262.aClass219_2.aFloat91;
			Static147.anInt2986 = Static262.aClass219_2.anInt6310;
			Static350.aFloat87 = Static262.aClass219_2.aFloat92;
			Static49.aFloat10 = Static262.aClass219_2.aFloat90;
			Static327.anInt5634 = -1;
			Static58.aClass82_3 = Static262.aClass219_2.aClass82_5;
			Static220.anInt3990 = Static262.aClass219_2.anInt6308;
			Static191.anInt3693 = Static262.aClass219_2.anInt6309;
			Static154.aFloat27 = Static262.aClass219_2.aFloat93;
			Static268.aFloat52 = Static262.aClass219_2.aFloat89;
		}
		Static41.aLong44 = local16;
	}
}
