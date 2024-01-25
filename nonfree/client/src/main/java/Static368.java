import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "Lclient!qm;")
	public static Class278 aClass278_1;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_125 = new Class56(16, 2);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	public static void method5387() {
		Static314.method4613(false);
		if (Static177.anInt3457 >= 0 && Static177.anInt3457 != 0) {
			Static486.method6610(Static177.anInt3457);
			Static177.anInt3457 = -1;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5388(@OriginalArg(1) String arg0) {
		return Static290.method7792(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)Z")
	public static boolean method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!r;IIILclient!fa;I)V")
	public static void method5395(@OriginalArg(1) Class45 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) int arg5) {
		if (Static454.anInt7639 < 100) {
			Static295.method4385(arg0, arg4);
		}
		arg0.da(arg3, arg5, arg3 + arg2, arg5 + arg1);
		@Pc(31) int local31;
		@Pc(41) int local41;
		if (Static454.anInt7639 < 100) {
			local31 = arg2 / 2 + arg3;
			local41 = arg1 / 2 + arg5 - 38;
			arg0.J(arg3, arg5, arg2, arg1, -16777216, 0);
			arg0.method7402(local31 - 152, local41, 304, 34, Static109.aColorArray2[Static546.anInt8712].getRGB(), 0);
			arg0.J(local31 - 150, local41 + 2, Static454.anInt7639 * 3, 30, Static473.aColorArray3[Static546.anInt8712].getRGB(), 0);
			Static460.aClass54_10.method7803(Static544.aClass343_22.method7222(Static256.anInt4535), Static77.aColorArray1[Static546.anInt8712].getRGB(), -1, local41 + 20, local31);
			return;
		}
		@Pc(105) int local105 = Static56.anInt1176 - (int) ((float) arg2 / Static44.aFloat204);
		local31 = (int) ((float) arg1 / Static44.aFloat204) + Static334.anInt5600;
		local41 = Static56.anInt1176 + (int) ((float) arg2 / Static44.aFloat204);
		@Pc(131) int local131 = Static334.anInt5600 - (int) ((float) arg1 / Static44.aFloat204);
		Static207.anInt3792 = (int) ((float) (arg2 * 2) / Static44.aFloat204);
		Static411.anInt7040 = Static56.anInt1176 - (int) ((float) arg2 / Static44.aFloat204);
		Static274.anInt4810 = Static334.anInt5600 - (int) ((float) arg1 / Static44.aFloat204);
		Static446.anInt7473 = (int) ((float) (arg1 * 2) / Static44.aFloat204);
		Static44.method7646(Static44.anInt9258 + local105, local31 + Static44.anInt9263, local41 + Static44.anInt9258, Static44.anInt9263 + local131, arg3, arg5, arg3 + arg2, arg5 + 1 - -arg1);
		Static44.method7667(arg0);
		@Pc(196) Class112 local196 = Static44.method7656(arg0);
		Static201.method3333(local196, arg0);
		if (Static555.anInt8826 > 0) {
			Static369.anInt6362--;
			if (Static369.anInt6362 == 0) {
				Static369.anInt6362 = 20;
				Static555.anInt8826--;
			}
		}
		if (!Static25.aBoolean45) {
			return;
		}
		@Pc(227) int local227 = arg2 + arg3 - 5;
		@Pc(234) int local234 = arg5 + arg1 - 8;
		Static569.aClass54_9.method7789(16776960, local227, "Fps:" + Static286.anInt4910, -1, local234);
		@Pc(249) int local249 = local234 - 15;
		@Pc(251) Runtime local251 = Runtime.getRuntime();
		@Pc(260) int local260 = (int) ((local251.totalMemory() - local251.freeMemory()) / 1024L);
		@Pc(262) int local262 = 16776960;
		if (local260 > 65536) {
			local262 = 16711680;
		}
		Static569.aClass54_9.method7789(local262, local227, "Mem:" + local260 + "k", -1, local249);
		local234 = local249 - 15;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public static String method5397(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static544.aClass343_37.method7222(Static256.anInt4535) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static544.aClass343_39.method7222(Static256.anInt4535) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(II)Lclient!gu;")
	public static Class119_Sub1 method5399(@OriginalArg(1) int arg0) {
		return Static49.aBoolean76 && arg0 >= Static245.anInt4334 && arg0 <= Static24.anInt485 ? Static317.aClass119_Sub1Array1[arg0 - Static245.anInt4334] : null;
	}
}
