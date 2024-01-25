import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dm", name = "v", descriptor = "[Lclient!na;")
	public static Class106[] aClass106Array12;

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
	public static int anInt7118;

	@OriginalMember(owner = "client!dm", name = "z", descriptor = "[Lclient!ni;")
	public static Class168[] aClass168Array9;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_179 = new Class81(10, 6);

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
	public static int anInt7113 = 0;

	@OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
	public static int anInt7116 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
	public static String method5565(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg1[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg0 + arg2;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg2; local34 < local30; local34++) {
				@Pc(40) String local40 = arg1[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local32);
			for (@Pc(66) int local66 = arg2; local66 < local30; local66++) {
				@Pc(72) String local72 = arg1[local66];
				if (local72 == null) {
					local64.append("null");
				} else {
					local64.append(local72);
				}
			}
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)V")
	public static void method5566(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static169.aFloat100 = 3.0F;
		} else if (arg0 == 50) {
			Static169.aFloat100 = 4.0F;
		} else if (arg0 == 75) {
			Static169.aFloat100 = 6.0F;
		} else if (arg0 == 100) {
			Static169.aFloat100 = 8.0F;
		} else if (arg0 == 200) {
			Static169.aFloat100 = 16.0F;
		}
		Static168.anInt3256 = -1;
		Static168.anInt3256 = -1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method5567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg0 < 1 || Static81.anInt1950 - 2 < arg7 || Static171.anInt3288 - 2 < arg0) {
			return;
		}
		@Pc(36) int local36 = arg1;
		if (arg1 < 3 && Static173.method2713(arg0, arg7)) {
			local36 = arg1 + 1;
		}
		if (!Static399.aClass167_Sub1_1.method4528(Static281.anInt5126) && !Static330.method4706(local36, arg0, arg7, Static179.anInt6503)) {
			return;
		}
		if (Static176.aClass113ArrayArrayArray3 == null) {
			return;
		}
		Static123.aClass33_Sub1_1.method923(arg7, arg0, arg1, Static332.aClass37Array1[arg1], arg4, Static387.aClass26_9);
		if (arg3 < 0) {
			return;
		}
		@Pc(81) boolean local81 = Static399.aClass167_Sub1_1.aBoolean491;
		Static399.aClass167_Sub1_1.aBoolean491 = true;
		Static123.aClass33_Sub1_1.method924(arg6, Static387.aClass26_9, arg0, Static332.aClass37Array1[arg1], arg5, arg3, arg7, local36, arg1, arg2);
		Static399.aClass167_Sub1_1.aBoolean491 = local81;
		return;
	}
}
