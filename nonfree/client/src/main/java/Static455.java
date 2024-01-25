import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Lclient!eq;")
	public static Class97 aClass97_116;

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "[Lclient!wh;")
	public static final Class368[] aClass368Array1 = new Class368[100];

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILclient!hn;I)V")
	public static void method6662(@OriginalArg(1) Class149 arg0, @OriginalArg(2) int arg1) {
		if (Static74.anInt1598 >= 50 || (arg0 == null || arg0.anIntArrayArray34 == null || arg1 >= arg0.anIntArrayArray34.length || arg0.anIntArrayArray34[arg1] == null)) {
			return;
		}
		@Pc(30) int local30 = arg0.anIntArrayArray34[arg1][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(53) int local53;
		if (arg0.anIntArrayArray34[arg1].length > 1) {
			local53 = (int) ((double) arg0.anIntArrayArray34[arg1].length * Math.random());
			if (local53 > 0) {
				local34 = arg0.anIntArrayArray34[arg1][local53];
			}
		}
		@Pc(71) int local71 = local30 >> 5 & 0x7;
		local53 = 256;
		if (arg0.anIntArray307 != null && arg0.anIntArray310 != null) {
			local53 = Static252.method4161(arg0.anIntArray310[arg1], arg0.anIntArray307[arg1]);
		}
		if (arg0.aBoolean378) {
			Static411.method6320(local53, local34, 255, local71, false, 0);
		} else {
			Static447.method6629(local53, local71, 255, local34, 0);
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method6664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 - arg0;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)Z")
	public static boolean method6665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static602.method8257(arg1, arg0) | (arg1 & 0x60000) != 0 || Static471.method6779(arg1, arg0);
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
	public static void method6666() {
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub26_2);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub26_1);
		Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.aClass33_Sub10_2);
		Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.aClass33_Sub10_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub17_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub18_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub14_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub19_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub15_1);
		Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.aClass33_Sub2_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub4_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub28_1);
		Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.aClass33_Sub20_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub13_1);
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub9_1);
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub9_2);
		Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.aClass33_Sub3_1);
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub16_1);
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub25_1);
		Static542.method7601();
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub12_1);
		Static404.aClass2_Sub13_2.method1383(4, Static404.aClass2_Sub13_2.aClass33_Sub5_1);
		Static53.method1014();
		Static57.method1058();
		Static179.aBoolean336 = true;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILclient!vk;Ljava/awt/Component;II)Lclient!vo;")
	public static Class39 method6667(@OriginalArg(0) int arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (Static66.anInt1396 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class39 local38 = (Class39) Class.forName("Class39_Sub1").getDeclaredConstructor().newInstance();
			local38.anIntArray247 = new int[(Static440.aBoolean586 ? 2 : 1) * 256];
			local38.anInt3512 = arg0;
			local38.method2876(arg2);
			local38.anInt3514 = (arg0 & 0xFFFFFC00) + 1024;
			if (local38.anInt3514 > 16384) {
				local38.anInt3514 = 16384;
			}
			local38.method2881(local38.anInt3514);
			if (Static288.anInt5416 > 0 && Static414.aClass51_1 == null) {
				Static414.aClass51_1 = new Class51();
				Static414.aClass51_1.aClass359_2 = arg1;
				arg1.method8278(Static288.anInt5416, Static414.aClass51_1);
			}
			if (Static414.aClass51_1 != null) {
				if (Static414.aClass51_1.aClass39Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static414.aClass51_1.aClass39Array1[arg3] = local38;
			}
			return local38;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class39_Sub2 local114 = new Class39_Sub2(arg1, arg3);
				local114.anInt3512 = arg0;
				local114.anIntArray247 = new int[(Static440.aBoolean586 ? 2 : 1) * 256];
				local114.method2876(arg2);
				local114.anInt3514 = 16384;
				local114.method2881(local114.anInt3514);
				if (Static288.anInt5416 > 0 && Static414.aClass51_1 == null) {
					Static414.aClass51_1 = new Class51();
					Static414.aClass51_1.aClass359_2 = arg1;
					arg1.method8278(Static288.anInt5416, Static414.aClass51_1);
				}
				if (Static414.aClass51_1 != null) {
					if (Static414.aClass51_1.aClass39Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static414.aClass51_1.aClass39Array1[arg3] = local114;
				}
				return local114;
			} catch (@Pc(173) Throwable local173) {
				return new Class39();
			}
		}
	}
}
