import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
	public static int anInt6506;

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
	public static int anInt6507;

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_187 = new Class34("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "Lclient!tm;")
	public static Class197 aClass197_30 = new Class197(64);

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "[Lclient!bo;")
	public static final Class24[] aClass24Array2 = new Class24[14];

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(14) int local14 = arg4 + arg2;
		for (@Pc(16) int local16 = arg2; local16 < local14; local16++) {
			Static39.method919(arg1, Static344.anIntArrayArray65[local16], arg6, arg3);
		}
		@Pc(37) int local37 = arg3 + arg4;
		for (@Pc(39) int local39 = arg0; local39 > local10; local39--) {
			Static39.method919(arg1, Static344.anIntArrayArray65[local39], arg6, arg3);
		}
		@Pc(60) int local60 = arg6 - arg4;
		for (@Pc(74) int local74 = local14; local74 <= local10; local74++) {
			@Pc(80) int[] local80 = Static344.anIntArrayArray65[local74];
			Static39.method919(arg1, local80, local37, arg3);
			Static39.method919(arg5, local80, local60, local37);
			Static39.method919(arg1, local80, arg6, local60);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
	public static void method5471() {
		for (@Pc(10) Class8_Sub6 local10 = (Class8_Sub6) Static140.aClass217_5.method5683(); local10 != null; local10 = (Class8_Sub6) Static140.aClass217_5.method5679()) {
			local10.method3274();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!la;)V")
	public static void method5472(@OriginalArg(1) Class1_Sub23 arg0) {
		if (arg0 == null || Static188.aClass16_22.aClass1_25 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt3587;
		@Pc(18) int local18 = arg0.anInt3589;
		@Pc(21) int local21 = arg0.anInt3588;
		@Pc(25) int local25 = (int) arg0.aLong121;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg0.aLong121;
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (Static305.aClass1_Sub21_1 == null) {
			local40 = Static36.anInt1195;
			local44 = Static22.anInt5199;
		} else {
			local40 = Static305.aClass1_Sub21_1.method2704();
			local44 = Static305.aClass1_Sub21_1.method2703();
		}
		if (local21 == 1011) {
			Static311.anInt6069 = local44;
			Static159.anInt3527 = local40;
			Static290.anInt5761 = 2;
			Static44.anInt1403 = 0;
			Static342.aClass1_Sub8_Sub1_7.method3229(12);
			Static342.aClass1_Sub8_Sub1_7.method4561(local25);
		}
		if (local21 == 11) {
			Static311.anInt6069 = local44;
			Static290.anInt5761 = 2;
			Static44.anInt1403 = 0;
			Static159.anInt3527 = local40;
			Static342.aClass1_Sub8_Sub1_7.method3229(230);
			Static342.aClass1_Sub8_Sub1_7.method4561(local25);
			Static342.aClass1_Sub8_Sub1_7.method4557(Static234.anInt4783 + local15);
			Static342.aClass1_Sub8_Sub1_7.method4548(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4561(Static32.anInt2224 + local18);
			Static199.method3808(local18, local15);
		}
		if (local21 == 47) {
			Static290.anInt5761 = 2;
			Static311.anInt6069 = local44;
			Static159.anInt3527 = local40;
			Static44.anInt1403 = 0;
			Static342.aClass1_Sub8_Sub1_7.method3229(86);
			Static342.aClass1_Sub8_Sub1_7.method4515(local18 + Static32.anInt2224);
			Static342.aClass1_Sub8_Sub1_7.method4553(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4515(local25);
			Static342.aClass1_Sub8_Sub1_7.method4561(Static234.anInt4783 + local15);
			Static199.method3808(local18, local15);
		}
		@Pc(191) Class17_Sub1_Sub1_Sub1 local191;
		if (local21 == 8) {
			local191 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local25];
			if (local191 != null) {
				Static159.anInt3527 = local40;
				Static44.anInt1403 = 0;
				Static290.anInt5761 = 2;
				Static311.anInt6069 = local44;
				Static342.aClass1_Sub8_Sub1_7.method3229(215);
				Static342.aClass1_Sub8_Sub1_7.method4524(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static342.aClass1_Sub8_Sub1_7.method4561(local25);
				Static63.method4860(local191.anIntArray438[0], local191.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local191.method4318(), local191.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		@Pc(262) Class17_Sub1_Sub1_Sub2 local262;
		if (local21 == 23) {
			local262 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local25];
			if (local262 != null) {
				Static159.anInt3527 = local40;
				Static311.anInt6069 = local44;
				Static290.anInt5761 = 2;
				Static44.anInt1403 = 0;
				Static342.aClass1_Sub8_Sub1_7.method3229(200);
				Static342.aClass1_Sub8_Sub1_7.method4557(local25);
				Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static63.method4860(local262.anIntArray438[0], local262.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local262.method4318(), local262.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		@Pc(334) Class12 local334;
		if (local21 == 57) {
			local334 = Static209.method3975(local15, local18);
			if (local334 != null) {
				Static148.method2960(local334);
			}
		}
		if (local21 == 4) {
			local262 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local25];
			if (local262 != null) {
				Static290.anInt5761 = 2;
				Static159.anInt3527 = local40;
				Static311.anInt6069 = local44;
				Static44.anInt1403 = 0;
				Static342.aClass1_Sub8_Sub1_7.method3229(130);
				Static342.aClass1_Sub8_Sub1_7.method4515(local25);
				Static342.aClass1_Sub8_Sub1_7.method4515(Static97.anInt5544);
				Static342.aClass1_Sub8_Sub1_7.method4529(Static349.anInt6682);
				Static342.aClass1_Sub8_Sub1_7.method4548(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static63.method4860(local262.anIntArray438[0], local262.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local262.method4318(), local262.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 9) {
			Static290.anInt5761 = 2;
			Static159.anInt3527 = local40;
			Static311.anInt6069 = local44;
			Static44.anInt1403 = 0;
			Static342.aClass1_Sub8_Sub1_7.method3229(223);
			Static342.aClass1_Sub8_Sub1_7.method4561(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static342.aClass1_Sub8_Sub1_7.method4515(Static32.anInt2224 + local18);
			Static342.aClass1_Sub8_Sub1_7.method4524(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4542(local15 + Static234.anInt4783);
			Static57.method1492(local32, local15, local18);
		}
		if (local21 == 18) {
			local191 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local25];
			if (local191 != null) {
				Static44.anInt1403 = 0;
				Static311.anInt6069 = local44;
				Static159.anInt3527 = local40;
				Static290.anInt5761 = 2;
				Static342.aClass1_Sub8_Sub1_7.method3229(237);
				Static342.aClass1_Sub8_Sub1_7.method4542(local25);
				Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static63.method4860(local191.anIntArray438[0], local191.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local191.method4318(), local191.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 19) {
			local262 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local25];
			if (local262 != null) {
				Static159.anInt3527 = local40;
				Static44.anInt1403 = 0;
				Static290.anInt5761 = 2;
				Static311.anInt6069 = local44;
				Static342.aClass1_Sub8_Sub1_7.method3229(113);
				Static342.aClass1_Sub8_Sub1_7.method4515(local25);
				Static342.aClass1_Sub8_Sub1_7.method4524(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static63.method4860(local262.anIntArray438[0], local262.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local262.method4318(), local262.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 1003 || local21 == 1007 || local21 == 1006 || local21 == 1008 || local21 == 1004) {
			Static8.method5007(local15, local21, local25);
		}
		if (local21 == 3) {
			Static290.anInt5761 = 2;
			Static159.anInt3527 = local40;
			Static311.anInt6069 = local44;
			Static44.anInt1403 = 0;
			Static342.aClass1_Sub8_Sub1_7.method3229(128);
			Static342.aClass1_Sub8_Sub1_7.method4561(local18 + Static32.anInt2224);
			Static342.aClass1_Sub8_Sub1_7.method4561(local15 + Static234.anInt4783);
			Static342.aClass1_Sub8_Sub1_7.method4542((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static342.aClass1_Sub8_Sub1_7.method4553(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static57.method1492(local32, local15, local18);
		}
		if (local21 == 49) {
			local262 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local25];
			if (local262 != null) {
				Static290.anInt5761 = 2;
				Static159.anInt3527 = local40;
				Static311.anInt6069 = local44;
				Static44.anInt1403 = 0;
				Static342.aClass1_Sub8_Sub1_7.method3229(190);
				Static342.aClass1_Sub8_Sub1_7.method4557(local25);
				Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static63.method4860(local262.anIntArray438[0], local262.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local262.method4318(), local262.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 12) {
			Static290.anInt5761 = 2;
			Static159.anInt3527 = local40;
			Static311.anInt6069 = local44;
			Static44.anInt1403 = 0;
			Static342.aClass1_Sub8_Sub1_7.method3229(164);
			Static342.aClass1_Sub8_Sub1_7.method4515(local25);
			Static342.aClass1_Sub8_Sub1_7.method4542(local15 + Static234.anInt4783);
			Static342.aClass1_Sub8_Sub1_7.method4553(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4515(Static32.anInt2224 + local18);
			Static199.method3808(local18, local15);
		}
		if (local21 == 45) {
			Static44.anInt1403 = 0;
			Static159.anInt3527 = local40;
			Static290.anInt5761 = 2;
			Static311.anInt6069 = local44;
			Static342.aClass1_Sub8_Sub1_7.method3229(107);
			Static342.aClass1_Sub8_Sub1_7.method4515(Static32.anInt2224 + local18);
			Static342.aClass1_Sub8_Sub1_7.method4557(local15 + Static234.anInt4783);
			Static342.aClass1_Sub8_Sub1_7.method4561(local25);
			Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static199.method3808(local18, local15);
		}
		if (local21 == 2 && Static111.aClass12_7 == null) {
			Static355.method5661(local18, local15);
			Static111.aClass12_7 = Static209.method3975(local15, local18);
			Static6.method247(Static111.aClass12_7);
		}
		if (local21 == 58 || local21 == 1010) {
			Static62.method1539(arg0.aString34, local15, local25, local18);
		}
		if (local21 == 44) {
			Static44.anInt1403 = 0;
			Static290.anInt5761 = 2;
			Static159.anInt3527 = local40;
			Static311.anInt6069 = local44;
			Static342.aClass1_Sub8_Sub1_7.method3229(93);
			Static342.aClass1_Sub8_Sub1_7.method4515((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static342.aClass1_Sub8_Sub1_7.method4561(Static234.anInt4783 + local15);
			Static342.aClass1_Sub8_Sub1_7.method4515(Static32.anInt2224 + local18);
			Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4542(Static97.anInt5544);
			Static342.aClass1_Sub8_Sub1_7.method4523(Static349.anInt6682);
			Static57.method1492(local32, local15, local18);
		}
		if (local21 == 51) {
			Static44.anInt1403 = 0;
			Static311.anInt6069 = local44;
			Static290.anInt5761 = 2;
			Static159.anInt3527 = local40;
			Static342.aClass1_Sub8_Sub1_7.method3229(150);
			Static342.aClass1_Sub8_Sub1_7.method4557(Static32.anInt2224 + local18);
			Static342.aClass1_Sub8_Sub1_7.method4515((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static342.aClass1_Sub8_Sub1_7.method4553(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4561(Static234.anInt4783 + local15);
			Static57.method1492(local32, local15, local18);
		}
		if (local21 == 21) {
			if (Static342.anInt2998 > 0 && Static57.aClass171_1.method4638(82) && Static57.aClass171_1.method4638(81)) {
				Static88.method1916(Static32.anInt2224 + local18, Static242.anInt6745, Static234.anInt4783 + local15);
			} else {
				Static77.method1753(local25, local18, local15);
				if (local25 == 1) {
					Static342.aClass1_Sub8_Sub1_7.method4562(-1);
					Static342.aClass1_Sub8_Sub1_7.method4562(-1);
					Static342.aClass1_Sub8_Sub1_7.method4542((int) Static75.aFloat13);
					Static342.aClass1_Sub8_Sub1_7.method4562(57);
					Static342.aClass1_Sub8_Sub1_7.method4562(Static337.anInt6461);
					Static342.aClass1_Sub8_Sub1_7.method4562(Static287.anInt5748);
					Static342.aClass1_Sub8_Sub1_7.method4562(89);
					Static342.aClass1_Sub8_Sub1_7.method4542(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109);
					Static342.aClass1_Sub8_Sub1_7.method4542(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108);
					Static342.aClass1_Sub8_Sub1_7.method4562(63);
				} else {
					Static290.anInt5761 = 1;
					Static159.anInt3527 = local40;
					Static44.anInt1403 = 0;
					Static311.anInt6069 = local44;
				}
				Static63.method4860(local15, local18, -4, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], 1, 1, 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 59) {
			if (Static342.anInt2998 > 0 && Static57.aClass171_1.method4638(82) && Static57.aClass171_1.method4638(81)) {
				Static88.method1916(Static32.anInt2224 + local18, Static242.anInt6745, Static234.anInt4783 + local15);
			} else {
				Static159.anInt3527 = local40;
				Static290.anInt5761 = 1;
				Static311.anInt6069 = local44;
				Static44.anInt1403 = 0;
				Static342.aClass1_Sub8_Sub1_7.method3229(193);
				Static342.aClass1_Sub8_Sub1_7.method4515(Static32.anInt2224 + local18);
				Static342.aClass1_Sub8_Sub1_7.method4557(local15 + Static234.anInt4783);
			}
		}
		if (local21 == 13) {
			local191 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local25];
			if (local191 != null) {
				Static290.anInt5761 = 2;
				Static159.anInt3527 = local40;
				Static44.anInt1403 = 0;
				Static311.anInt6069 = local44;
				Static342.aClass1_Sub8_Sub1_7.method3229(4);
				Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static342.aClass1_Sub8_Sub1_7.method4542(local25);
				Static63.method4860(local191.anIntArray438[0], local191.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local191.method4318(), local191.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 6) {
			Static311.anInt6069 = local44;
			Static44.anInt1403 = 0;
			Static290.anInt5761 = 2;
			Static159.anInt3527 = local40;
			Static342.aClass1_Sub8_Sub1_7.method3229(201);
			Static342.aClass1_Sub8_Sub1_7.method4524(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4542(Static97.anInt5544);
			Static342.aClass1_Sub8_Sub1_7.method4527(Static349.anInt6682);
			Static342.aClass1_Sub8_Sub1_7.method4561(Static234.anInt4783 + local15);
			Static342.aClass1_Sub8_Sub1_7.method4561(Static32.anInt2224 + local18);
			Static342.aClass1_Sub8_Sub1_7.method4542(local25);
			Static199.method3808(local18, local15);
		}
		if (local21 == 60) {
			Static311.anInt6069 = local44;
			Static159.anInt3527 = local40;
			Static44.anInt1403 = 0;
			Static290.anInt5761 = 1;
			Static342.aClass1_Sub8_Sub1_7.method3229(155);
			Static342.aClass1_Sub8_Sub1_7.method4529(Static349.anInt6682);
			Static342.aClass1_Sub8_Sub1_7.method4542(local18 + Static32.anInt2224);
			Static342.aClass1_Sub8_Sub1_7.method4542(Static97.anInt5544);
			Static342.aClass1_Sub8_Sub1_7.method4557(local15 + Static234.anInt4783);
			Static63.method4860(local15, local18, -4, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], 1, 1, 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
		}
		if (local21 == 48) {
			local191 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local25];
			if (local191 != null) {
				Static159.anInt3527 = local40;
				Static44.anInt1403 = 0;
				Static290.anInt5761 = 2;
				Static311.anInt6069 = local44;
				Static342.aClass1_Sub8_Sub1_7.method3229(3);
				Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static342.aClass1_Sub8_Sub1_7.method4515(local25);
				Static63.method4860(local191.anIntArray438[0], local191.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local191.method4318(), local191.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 17) {
			Static44.anInt1403 = 0;
			Static290.anInt5761 = 2;
			Static311.anInt6069 = local44;
			Static159.anInt3527 = local40;
			Static342.aClass1_Sub8_Sub1_7.method3229(176);
			Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4561(Static32.anInt2224 + local18);
			Static342.aClass1_Sub8_Sub1_7.method4561(Static234.anInt4783 + local15);
			Static342.aClass1_Sub8_Sub1_7.method4561((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static57.method1492(local32, local15, local18);
		}
		if (local21 == 15) {
			local191 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local25];
			if (local191 != null) {
				Static290.anInt5761 = 2;
				Static311.anInt6069 = local44;
				Static159.anInt3527 = local40;
				Static44.anInt1403 = 0;
				Static342.aClass1_Sub8_Sub1_7.method3229(88);
				Static342.aClass1_Sub8_Sub1_7.method4553(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static342.aClass1_Sub8_Sub1_7.method4561(local25);
				Static63.method4860(local191.anIntArray438[0], local191.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local191.method4318(), local191.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 5) {
			local262 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local25];
			if (local262 != null) {
				Static290.anInt5761 = 2;
				Static159.anInt3527 = local40;
				Static44.anInt1403 = 0;
				Static311.anInt6069 = local44;
				Static342.aClass1_Sub8_Sub1_7.method3229(146);
				Static342.aClass1_Sub8_Sub1_7.method4561(local25);
				Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static63.method4860(local262.anIntArray438[0], local262.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local262.method4318(), local262.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 25) {
			local191 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local25];
			if (local191 != null) {
				Static159.anInt3527 = local40;
				Static290.anInt5761 = 2;
				Static311.anInt6069 = local44;
				Static44.anInt1403 = 0;
				Static342.aClass1_Sub8_Sub1_7.method3229(58);
				Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static342.aClass1_Sub8_Sub1_7.method4561(local25);
				Static63.method4860(local191.anIntArray438[0], local191.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local191.method4318(), local191.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 1002) {
			Static311.anInt6069 = local44;
			Static44.anInt1403 = 0;
			Static290.anInt5761 = 2;
			Static159.anInt3527 = local40;
			Static342.aClass1_Sub8_Sub1_7.method3229(75);
			Static342.aClass1_Sub8_Sub1_7.method4561(local18 + Static32.anInt2224);
			Static342.aClass1_Sub8_Sub1_7.method4548(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4561(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static342.aClass1_Sub8_Sub1_7.method4542(Static234.anInt4783 + local15);
			Static57.method1492(local32, local15, local18);
		}
		if (local21 == 20) {
			local191 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local25];
			if (local191 != null) {
				Static290.anInt5761 = 2;
				Static159.anInt3527 = local40;
				Static44.anInt1403 = 0;
				Static311.anInt6069 = local44;
				Static342.aClass1_Sub8_Sub1_7.method3229(29);
				Static342.aClass1_Sub8_Sub1_7.method4557(local25);
				Static342.aClass1_Sub8_Sub1_7.method4524(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static63.method4860(local191.anIntArray438[0], local191.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local191.method4318(), local191.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 50) {
			local191 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local25];
			if (local191 != null) {
				Static44.anInt1403 = 0;
				Static311.anInt6069 = local44;
				Static159.anInt3527 = local40;
				Static290.anInt5761 = 2;
				Static342.aClass1_Sub8_Sub1_7.method3229(50);
				Static342.aClass1_Sub8_Sub1_7.method4524(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static342.aClass1_Sub8_Sub1_7.method4561(local25);
				Static63.method4860(local191.anIntArray438[0], local191.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local191.method4318(), local191.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 46) {
			Static44.anInt1403 = 0;
			Static290.anInt5761 = 2;
			Static311.anInt6069 = local44;
			Static159.anInt3527 = local40;
			Static342.aClass1_Sub8_Sub1_7.method3229(240);
			Static342.aClass1_Sub8_Sub1_7.method4562(Static57.aClass171_1.method4638(82) ? 1 : 0);
			Static342.aClass1_Sub8_Sub1_7.method4515(local25);
			Static342.aClass1_Sub8_Sub1_7.method4542(local18 + Static32.anInt2224);
			Static342.aClass1_Sub8_Sub1_7.method4515(Static234.anInt4783 + local15);
			Static199.method3808(local18, local15);
		}
		if (local21 == 10) {
			local334 = Static209.method3975(local15, local18);
			if (local334 != null) {
				Static96.method5290();
				@Pc(2030) Class1_Sub42 local2030 = Static44.method1023(local334);
				Static231.method4263(local2030.method5589(), local2030.anInt6675, local334.anInt462, local334.anInt392, local18, local15);
				Static24.aString15 = Static143.method2869(local334);
				if (Static24.aString15 == null) {
					Static24.aString15 = "Null";
				}
				Static281.aString56 = local334.aString5 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 1001) {
			Static311.anInt6069 = local44;
			Static290.anInt5761 = 2;
			Static44.anInt1403 = 0;
			Static159.anInt3527 = local40;
			local262 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local25];
			if (local262 != null) {
				@Pc(2084) Class213 local2084 = local262.aClass213_1;
				if (local2084.anIntArray517 != null) {
					local2084 = local2084.method5480();
				}
				if (local2084 != null) {
					Static342.aClass1_Sub8_Sub1_7.method3229(80);
					Static342.aClass1_Sub8_Sub1_7.method4515(local2084.anInt6512);
				}
			}
		}
		if (local21 == 30) {
			local191 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local25];
			if (local191 != null) {
				Static311.anInt6069 = local44;
				Static159.anInt3527 = local40;
				Static290.anInt5761 = 2;
				Static44.anInt1403 = 0;
				Static342.aClass1_Sub8_Sub1_7.method3229(35);
				Static342.aClass1_Sub8_Sub1_7.method4524(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static342.aClass1_Sub8_Sub1_7.method4527(Static349.anInt6682);
				Static342.aClass1_Sub8_Sub1_7.method4542(Static97.anInt5544);
				Static342.aClass1_Sub8_Sub1_7.method4515(local25);
				Static63.method4860(local191.anIntArray438[0], local191.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local191.method4318(), local191.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 22) {
			local262 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local25];
			if (local262 != null) {
				Static44.anInt1403 = 0;
				Static311.anInt6069 = local44;
				Static290.anInt5761 = 2;
				Static159.anInt3527 = local40;
				Static342.aClass1_Sub8_Sub1_7.method3229(90);
				Static342.aClass1_Sub8_Sub1_7.method4561(local25);
				Static342.aClass1_Sub8_Sub1_7.method4553(Static57.aClass171_1.method4638(82) ? 1 : 0);
				Static63.method4860(local262.anIntArray438[0], local262.anIntArray439[0], -2, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local262.method4318(), local262.method4318(), 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			}
		}
		if (local21 == 1009) {
			Static290.anInt5761 = 2;
			Static159.anInt3527 = local40;
			Static311.anInt6069 = local44;
			Static44.anInt1403 = 0;
			Static342.aClass1_Sub8_Sub1_7.method3229(179);
			Static342.aClass1_Sub8_Sub1_7.method4561(local25);
		}
		if (Static91.aBoolean214) {
			Static96.method5290();
		}
		if (Static226.aClass12_13 != null && Static338.anInt6485 == 0) {
			Static6.method247(Static226.aClass12_13);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method5475(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static342.aClass1_Sub8_Sub1_7.method3229(110);
		Static342.aClass1_Sub8_Sub1_7.method4562(Static321.method5243(arg1) + 1);
		Static342.aClass1_Sub8_Sub1_7.method4553(arg0);
		Static342.aClass1_Sub8_Sub1_7.method4531(arg1);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	public static void method5476() {
		if (Static175.anInt3788 < 0) {
			return;
		}
		@Pc(16) long local16 = Static162.method3252();
		Static175.anInt3788 = (int) ((long) Static175.anInt3788 + Static35.aLong38 - local16);
		if (Static175.anInt3788 <= 0) {
			Static175.anInt3788 = -1;
			Static153.aClass114_1 = Static340.aClass165_2.aClass114_3;
			Static168.aFloat48 = Static340.aClass165_2.aFloat70;
			Static29.aFloat2 = Static340.aClass165_2.aFloat69;
			Static303.anInt2314 = Static340.aClass165_2.anInt4975;
			Static249.aFloat72 = Static340.aClass165_2.aFloat66;
			Static157.anInt4858 = Static340.aClass165_2.anInt4981;
			Static146.aFloat41 = Static340.aClass165_2.aFloat68;
			Static107.aFloat38 = Static340.aClass165_2.aFloat71;
			Static171.anInt3677 = Static340.aClass165_2.anInt4980;
			Static33.aFloat3 = Static340.aClass165_2.aFloat67;
		} else {
			@Pc(67) int local67 = (Static175.anInt3788 << 8) / Static182.anInt3945;
			@Pc(72) int local72 = 255 - local67;
			@Pc(77) float local77 = (float) local67 / 255.0F;
			Static171.anInt3677 = ((Static340.aClass165_2.anInt4980 & 0xFF00) * local72 + (Static275.anInt5614 & 0xFF00) * local67 & 0xFF0000) + ((Static275.anInt5614 & 0xFF00FF) * local67 + local72 * (Static340.aClass165_2.anInt4980 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(114) float local114 = 1.0F - local77;
			Static29.aFloat2 = Static273.aFloat75 + local114 * (Static340.aClass165_2.aFloat69 - Static273.aFloat75);
			Static107.aFloat38 = local114 * (Static340.aClass165_2.aFloat71 - Static74.aFloat12) + Static74.aFloat12;
			Static157.anInt4858 = (local67 * (Static335.anInt6433 & 0xFF00FF) + (Static340.aClass165_2.anInt4981 & 0xFF00FF) * local72 & 0xFF00FF00) + ((Static335.anInt6433 & 0xFF00) * local67 + local72 * (Static340.aClass165_2.anInt4981 & 0xFF00) & 0xFF0000) >>> 8;
			Static249.aFloat72 = (Static340.aClass165_2.aFloat66 - Static131.aFloat39) * local114 + Static131.aFloat39;
			Static168.aFloat48 = local114 * (Static340.aClass165_2.aFloat70 - Static77.aFloat14) + Static77.aFloat14;
			Static146.aFloat41 = (Static340.aClass165_2.aFloat68 - Static285.aFloat65) * local114 + Static285.aFloat65;
			Static303.anInt2314 = Static198.anInt1218 * local67 + Static340.aClass165_2.anInt4975 * local72 >> 8;
			Static33.aFloat3 = Static33.aFloat4 + local114 * (Static340.aClass165_2.aFloat67 - Static33.aFloat4);
			if (Static307.aClass114_4 != Static340.aClass165_2.aClass114_3) {
				Static153.aClass114_1 = Static324.aClass32_14.method2139(Static307.aClass114_4, Static340.aClass165_2.aClass114_3, local114, Static153.aClass114_1);
			}
		}
		Static35.aLong38 = local16;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
	public static void method5477() {
		Static304.aClass87_52.method2485();
	}
}
