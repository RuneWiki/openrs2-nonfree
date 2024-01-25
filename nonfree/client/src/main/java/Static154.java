import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public static int anInt2385 = -1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public static void method1922() {
		Static31.aClass204_1.method4348();
		Static425.aClass60_5.method967();
		Static241.aClass97_1.method1754();
		Static86.aClass248_7.method5248();
		Static428.aClass196_1.method4165();
		Static285.aClass226_2.method4789();
		Static402.aClass37_2.method669();
		Static46.aClass123_5.method2681();
		Static197.aClass76_1.method1376();
		Static186.aClass233_1.method4878();
		Static106.aClass199_131.method4203();
		Static205.aClass36_2.method662();
		Static60.aClass223_1.method4708();
		Static256.aClass136_1.method3020();
		Static111.aClass26_1.method361();
		Static202.aClass237_27.method5079();
		Static429.aClass126_1.method2692();
		Static331.aClass42_1.method813();
		Static285.aClass3_2.method26();
		Static257.aClass153_1.method3526();
		Static92.method3330();
		Static263.method3653();
		Static114.method1410();
		Static216.method3113();
		Static13.aClass77_6.method1386(5);
		Static12.aClass77_5.method1386(5);
		Static4.aClass77_3.method1386(5);
		Static439.aClass77_59.method1386(5);
		Static198.aClass77_30.method1386(5);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)V")
	public static void method1923(@OriginalArg(0) int arg0) {
		if (arg0 == Static135.anInt2114) {
			return;
		}
		if (Static135.anInt2114 == 0) {
			Static97.method1144();
		}
		if (arg0 == 12) {
			Static418.method5350(Static88.aString13, Static99.aString14, Static212.anInt3924);
		}
		if (arg0 != 12 && Static261.aClass110_3 != null) {
			Static261.aClass110_3.method3781();
			Static261.aClass110_3 = null;
		}
		if (arg0 == 2) {
			Static126.method1559(Static118.anInt1785 != Static264.anInt4592);
		}
		if (arg0 == 6) {
			Static441.method3974(Static118.anInt1785 != Static249.anInt4441);
		}
		if (arg0 == 4) {
			Static148.method1862(Static99.aString14, Static88.aString13);
		} else if (arg0 == 5) {
			Static418.method5350(Static88.aString13, Static99.aString14, Static212.anInt3924);
		} else if (arg0 == 8) {
			Static418.method5350(Static88.aString13, Static99.aString14, Static212.anInt3924);
		} else if (arg0 == 11) {
			Static148.method1862(Static99.aString14, Static88.aString13);
		}
		if (Static197.method2828(Static135.anInt2114)) {
			Static98.aClass185_30.anInt5029 = 2;
			Static192.aClass185_57.anInt5029 = 2;
			Static92.aClass185_65.anInt5029 = 2;
			Static417.aClass185_112.anInt5029 = 2;
			Static350.aClass185_88.anInt5029 = 2;
			Static313.aClass185_81.anInt5029 = 2;
			Static267.aClass185_72.anInt5029 = 2;
		}
		if (Static197.method2828(arg0)) {
			Static36.anInt543 = 1;
			Static20.anInt302 = 1;
			Static95.anInt6483 = 0;
			Static448.anInt7120 = 0;
			Static374.anInt6022 = 0;
			Static327.method4302(true);
			Static98.aClass185_30.anInt5029 = 1;
			Static192.aClass185_57.anInt5029 = 1;
			Static92.aClass185_65.anInt5029 = 1;
			Static417.aClass185_112.anInt5029 = 1;
			Static350.aClass185_88.anInt5029 = 1;
			Static313.aClass185_81.anInt5029 = 1;
			Static267.aClass185_72.anInt5029 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static40.method545();
		}
		if (arg0 == 1) {
			Static236.method3367(Static178.aClass185_49, Static186.aClass117_3);
		} else {
			Static90.method1063();
		}
		@Pc(208) boolean local208 = arg0 == 1 || Static356.method4681(arg0) || Static309.method4100(arg0);
		@Pc(223) boolean local223 = Static135.anInt2114 == 1 || Static356.method4681(Static135.anInt2114) || Static309.method4100(Static135.anInt2114);
		if (local208 != local223) {
			if (local208) {
				Static299.anInt5002 = Static91.anInt1224;
				if (Static126.aClass19_Sub1_1.anInt4225 == 0) {
					Static247.method3518();
				} else {
					Static333.method4378(Static91.anInt1224, Static126.aClass19_Sub1_1.anInt4225, Static355.aClass185_89);
				}
				Static270.aClass269_3.method5765(false);
			} else {
				Static247.method3518();
				Static270.aClass269_3.method5765(true);
			}
		}
		if (Static197.method2828(arg0) || arg0 == 12) {
			Static186.aClass117_3.method5672();
		}
		Static135.anInt2114 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!nt;IILjava/awt/Component;I)Lclient!vn;")
	public static Class101 method1924(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static234.anInt4244 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(34) Class101 local34 = (Class101) Class.forName("Class101_Sub2").getDeclaredConstructor().newInstance();
			local34.anInt6038 = arg1;
			local34.anIntArray454 = new int[(Static167.aBoolean276 ? 2 : 1) * 256];
			local34.method4848(arg2);
			local34.anInt6043 = (arg1 & 0xFFFFFC00) + 1024;
			if (local34.anInt6043 > 16384) {
				local34.anInt6043 = 16384;
			}
			local34.method4854(local34.anInt6043);
			if (Static355.anInt5747 > 0 && Static355.aClass175_1 == null) {
				Static355.aClass175_1 = new Class175();
				Static355.aClass175_1.aClass177_3 = arg0;
				arg0.method3840(Static355.aClass175_1, Static355.anInt5747);
			}
			if (Static355.aClass175_1 != null) {
				if (Static355.aClass175_1.aClass101Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static355.aClass175_1.aClass101Array1[arg3] = local34;
			}
			return local34;
		} catch (@Pc(104) Throwable local104) {
			try {
				@Pc(120) Class101_Sub1 local120 = new Class101_Sub1(arg0, arg3);
				local120.anInt6038 = arg1;
				local120.anIntArray454 = new int[(Static167.aBoolean276 ? 2 : 1) * 256];
				local120.method4848(arg2);
				local120.anInt6043 = 16384;
				local120.method4854(local120.anInt6043);
				if (Static355.anInt5747 > 0 && Static355.aClass175_1 == null) {
					Static355.aClass175_1 = new Class175();
					Static355.aClass175_1.aClass177_3 = arg0;
					arg0.method3840(Static355.aClass175_1, Static355.anInt5747);
				}
				if (Static355.aClass175_1 != null) {
					if (Static355.aClass175_1.aClass101Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static355.aClass175_1.aClass101Array1[arg3] = local120;
				}
				return local120;
			} catch (@Pc(182) Throwable local182) {
				return new Class101();
			}
		}
	}
}
