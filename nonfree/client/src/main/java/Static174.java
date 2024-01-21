import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
	public static int anInt3931;

	@OriginalMember(owner = "client!tg", name = "R", descriptor = "Lclient!lc;")
	public static final Class54 aClass54_15 = new Class54(4096);

	@OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
	public static int anInt3928 = 0;

	@OriginalMember(owner = "client!tg", name = "Z", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1508 = Static120.method1824("blaugr-Un:");

	@OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
	public static int anInt3934 = 0;

	@OriginalMember(owner = "client!tg", name = "ib", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1509 = Static120.method1824(":assist:");

	@OriginalMember(owner = "client!tg", name = "lb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1512 = Static120.method1824("This computers address has been blocked");

	@OriginalMember(owner = "client!tg", name = "jb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1510 = aClass80_1512;

	@OriginalMember(owner = "client!tg", name = "kb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1511 = Static120.method1824("(U2");

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
	public static void method2811() {
		while (true) {
			if (Static63.aClass3_Sub17_Sub1_2.method2145(Static41.anInt905) >= 27) {
				@Pc(24) int local24 = Static63.aClass3_Sub17_Sub1_2.method2152(15);
				if (local24 != 32767) {
					@Pc(29) boolean local29 = false;
					if (Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local24] == null) {
						local29 = true;
						Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local24] = new Class3_Sub1_Sub5_Sub4_Sub1();
					}
					@Pc(45) Class3_Sub1_Sub5_Sub4_Sub1 local45 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local24];
					Static125.anIntArray359[Static59.anInt1317++] = local24;
					local45.anInt4314 = Static193.anInt4411;
					local45.aClass3_Sub1_Sub7_1 = Static84.method3022(Static63.aClass3_Sub17_Sub1_2.method2152(14));
					@Pc(69) int local69 = Static63.aClass3_Sub17_Sub1_2.method2152(5);
					@Pc(76) int local76 = Static122.anIntArray354[Static63.aClass3_Sub17_Sub1_2.method2152(3)];
					if (local69 > 15) {
						local69 -= 32;
					}
					if (local29) {
						local45.anInt4309 = local45.anInt4301 = local76;
					}
					@Pc(93) int local93 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
					if (local93 == 1) {
						Static3.anIntArray24[Static33.anInt779++] = local24;
					}
					@Pc(111) int local111 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
					@Pc(116) int local116 = Static63.aClass3_Sub17_Sub1_2.method2152(5);
					local45.anInt4326 = local45.aClass3_Sub1_Sub7_1.anInt915;
					local45.anInt4311 = local45.aClass3_Sub1_Sub7_1.anInt909;
					local45.anInt4278 = local45.aClass3_Sub1_Sub7_1.anInt921;
					local45.anInt4318 = local45.aClass3_Sub1_Sub7_1.anInt917;
					if (local116 > 15) {
						local116 -= 32;
					}
					local45.anInt4288 = local45.aClass3_Sub1_Sub7_1.anInt904;
					local45.anInt4324 = local45.aClass3_Sub1_Sub7_1.anInt899;
					local45.anInt4277 = local45.aClass3_Sub1_Sub7_1.anInt912;
					local45.anInt4302 = local45.aClass3_Sub1_Sub7_1.anInt907;
					if (local45.anInt4302 == 0) {
						local45.anInt4301 = 0;
					}
					local45.anInt4283 = local45.aClass3_Sub1_Sub7_1.anInt920;
					local45.method3061(local111 == 1, local69 + Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], local116 + Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0]);
					continue;
				}
			}
			Static63.aClass3_Sub17_Sub1_2.method2148();
			return;
		}
	}

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V")
	public static void method2812() {
		if (Static54.aClass38_1 != null) {
			Static54.aClass38_1.method2945();
		}
		if (Static126.aClass38_2 != null) {
			Static126.aClass38_2.method2945();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
	public static void method2813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class3_Sub7 local11 = (Class3_Sub7) Static6.aClass54_2.method1496((long) arg3);
		if (local11 == null) {
			local11 = new Class3_Sub7();
			Static6.aClass54_2.method1494((long) arg3, local11);
		}
		if (arg1 >= local11.anIntArray103.length) {
			@Pc(41) int[] local41 = new int[arg1 + 1];
			@Pc(46) int[] local46 = new int[arg1 + 1];
			for (@Pc(48) int local48 = 0; local48 < local11.anIntArray103.length; local48++) {
				local41[local48] = local11.anIntArray103[local48];
				local46[local48] = local11.anIntArray102[local48];
			}
			for (@Pc(74) int local74 = local11.anIntArray103.length; local74 < arg1; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local11.anIntArray103 = local41;
			local11.anIntArray102 = local46;
		}
		local11.anIntArray103[arg1] = arg2;
		local11.anIntArray102[arg1] = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static188.method3068(arg5)) {
			Static157.aClass77Array2 = null;
			Static145.method2318(-1, arg7, arg2, arg0, arg4, arg3, arg1, Static57.aClass77ArrayArray1[arg5], arg6);
			if (Static157.aClass77Array2 != null) {
				Static145.method2318(-1412584499, arg7, Static144.anInt3152, arg0, arg4, arg3, arg1, Static157.aClass77Array2, Static150.anInt3388);
				Static157.aClass77Array2 = null;
			}
		} else if (arg1 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static63.aBooleanArray8[local19] = true;
			}
		} else {
			Static63.aBooleanArray8[arg1] = true;
		}
	}
}
