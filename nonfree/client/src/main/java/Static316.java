import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_113 = new Class322(8, 1);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIBIZI)V")
	public static void method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(28) int local28 = arg0 - 334;
		if (local28 < 0) {
			local28 = 0;
		} else if (local28 > 100) {
			local28 = 100;
		}
		@Pc(55) int local55 = local28 * (Static495.aShort103 - Static593.aShort123) / 100 + Static593.aShort123;
		if (Static426.aShort131 > local55) {
			local55 = Static426.aShort131;
		} else if (local55 > Static427.aShort81) {
			local55 = Static427.aShort81;
		}
		@Pc(83) int local83 = arg0 * 512 * local55 / (arg1 * 334);
		@Pc(113) int local113;
		@Pc(120) int local120;
		@Pc(88) short local88;
		if (local83 < Static398.aShort76) {
			local88 = Static398.aShort76;
			local55 = arg1 * 334 * local88 / (arg0 * 512);
			if (local55 > Static427.aShort81) {
				local55 = Static427.aShort81;
				local113 = arg0 * 512 * local55 / (local88 * 334);
				local120 = (arg1 - local113) / 2;
				if (arg3) {
					Static202.aClass75_5.la();
					Static202.aClass75_5.method6631(local120, arg2, arg0, -16777216, arg4);
					Static202.aClass75_5.method6631(local120, arg1 + arg2 - local120, arg0, -16777216, arg4);
				}
				arg2 += local120;
				arg1 -= local120 * 2;
			}
		} else if (local83 > Static443.aShort28) {
			local88 = Static443.aShort28;
			local55 = local88 * arg1 * 334 / (arg0 * 512);
			if (Static426.aShort131 > local55) {
				local55 = Static426.aShort131;
				local113 = arg1 * 334 * local88 / (local55 * 512);
				local120 = (arg0 - local113) / 2;
				if (arg3) {
					Static202.aClass75_5.la();
					Static202.aClass75_5.method6631(arg1, arg2, local120, -16777216, arg4);
					Static202.aClass75_5.method6631(arg1, arg2, local120, -16777216, arg0 + arg4 - local120);
				}
				arg0 -= local120 * 2;
				arg4 += local120;
			}
		}
		Static391.anInt6746 = (short) arg0;
		Static147.anInt3100 = arg2;
		Static348.anInt5924 = (short) arg1;
		Static221.anInt4359 = arg4;
		Static70.anInt935 = arg0 * local55 / 334;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5658(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(21) int local21 = arg0.indexOf("--> ");
		if (local21 >= 0) {
			local7 = arg0.substring(0, local21 + 4);
			arg0 = arg0.substring(local21 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(53) int local53 = arg0.indexOf(" ", "directlogin ".length());
			if (local53 >= 0) {
				@Pc(58) int local58 = arg0.length();
				arg0 = arg0.substring(0, local53) + " ";
				for (@Pc(74) int local74 = local53 + 1; local74 < local58; local74++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}
}
