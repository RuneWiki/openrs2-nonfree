import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!hi;")
	public static Class38 aClass38_2;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_19;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array6;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1060 = Static120.method1824("glow2:");

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1061 = Static120.method1824("Hierhin gehen");

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	public static int anInt2702 = 0;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public static int anInt2704 = 0;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1062 = aClass80_1060;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!of;")
	public static Class70 aClass70_17 = new Class70();

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1063 = aClass80_1060;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	public static int anInt2707 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/Object;ZLclient!na;)V")
	public static void method1862(@OriginalArg(0) Object arg0, @OriginalArg(2) Class61 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static135.method2059(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!bc;ILclient!bc;Lclient!bc;)V")
	public static void method1863(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) Class1 arg2) {
		Static19.anInt469 = arg0.method53(Static181.aClass80_1580);
		Static181.anInt4058 = arg1.method53(Static144.aClass80_1246);
		Static192.anInt4405 = arg1.method53(Static110.aClass80_974);
		Static158.anInt3508 = arg1.method53(Static63.aClass80_539);
		Static153.anInt686 = arg1.method53(Static48.aClass80_410);
		Static57.anInt1247 = arg1.method53(Static21.aClass80_161);
		Static60.anInt1327 = arg1.method53(Static120.aClass80_1042);
		Static157.anInt3501 = arg1.method53(Static84.aClass80_1650);
		Static78.anInt1724 = arg1.method53(Static145.aClass80_1255);
		Static184.anInt4148 = arg1.method53(Static64.aClass80_544);
		Static152.anInt3409 = arg1.method53(Static36.aClass80_286);
		Static96.anInt2027 = arg2.method53(Static106.aClass80_899);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(DB)V")
	public static void method1865(@OriginalArg(0) double arg0) {
		if (Static134.aDouble10 == arg0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = (int) (Math.pow((double) local19 / 255.0D, arg0) * 255.0D);
			Static27.anIntArray522[local19] = local31 > 255 ? 255 : local31;
		}
		Static134.aDouble10 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZZ)I")
	public static int method1866() {
		return Static44.anInt1015 + Static47.anInt1067;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1867() {
		for (@Pc(11) int local11 = 0; local11 < Static33.anInt779; local11++) {
			@Pc(17) int local17 = Static3.anIntArray24[local11];
			@Pc(21) Class3_Sub1_Sub5_Sub4_Sub1 local21 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local17];
			@Pc(25) int local25 = Static63.aClass3_Sub17_Sub1_2.method2107();
			if ((local25 & 0x80) != 0) {
				local21.anInt4279 = Static63.aClass3_Sub17_Sub1_2.method2141();
				local21.anInt4290 = Static63.aClass3_Sub17_Sub1_2.method2111();
			}
			@Pc(55) int local55;
			if ((local25 & 0x20) != 0) {
				local21.anInt4296 = Static63.aClass3_Sub17_Sub1_2.method2114();
				local55 = Static63.aClass3_Sub17_Sub1_2.method2140();
				if (local21.anInt4296 == 65535) {
					local21.anInt4296 = -1;
				}
				local21.anInt4317 = local55 >> 16;
				local21.anInt4276 = Static193.anInt4411 + (local55 & 0xFFFF);
				local21.anInt4313 = 0;
				local21.anInt4295 = 0;
				if (Static193.anInt4411 < local21.anInt4276) {
					local21.anInt4313 = -1;
				}
			}
			if ((local25 & 0x1) != 0) {
				local21.anInt4328 = Static63.aClass3_Sub17_Sub1_2.method2098();
				if (local21.anInt4328 == 65535) {
					local21.anInt4328 = -1;
				}
			}
			@Pc(121) int local121;
			if ((local25 & 0x4) != 0) {
				local55 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local121 = Static63.aClass3_Sub17_Sub1_2.method2135();
				local21.method3063(local121, local55, Static193.anInt4411);
			}
			if ((local25 & 0x2) != 0) {
				local21.aClass3_Sub1_Sub7_1 = Static84.method3022(Static63.aClass3_Sub17_Sub1_2.method2114());
				local21.anInt4288 = local21.aClass3_Sub1_Sub7_1.anInt904;
				local21.anInt4277 = local21.aClass3_Sub1_Sub7_1.anInt912;
				local21.anInt4283 = local21.aClass3_Sub1_Sub7_1.anInt920;
				local21.anInt4326 = local21.aClass3_Sub1_Sub7_1.anInt915;
				local21.anInt4311 = local21.aClass3_Sub1_Sub7_1.anInt909;
				local21.anInt4318 = local21.aClass3_Sub1_Sub7_1.anInt917;
				local21.anInt4324 = local21.aClass3_Sub1_Sub7_1.anInt899;
				local21.anInt4278 = local21.aClass3_Sub1_Sub7_1.anInt921;
				local21.anInt4302 = local21.aClass3_Sub1_Sub7_1.anInt907;
			}
			if ((local25 & 0x8) != 0) {
				local21.aClass80_1687 = Static63.aClass3_Sub17_Sub1_2.method2102();
				local21.anInt4327 = 100;
			}
			if ((local25 & 0x10) != 0) {
				local55 = Static63.aClass3_Sub17_Sub1_2.method2135();
				local121 = Static63.aClass3_Sub17_Sub1_2.method2135();
				local21.method3063(local121, local55, Static193.anInt4411);
				local21.anInt4322 = Static193.anInt4411 + 300;
				local21.anInt4300 = Static63.aClass3_Sub17_Sub1_2.method2107();
			}
			if ((local25 & 0x40) != 0) {
				local55 = Static63.aClass3_Sub17_Sub1_2.method2098();
				if (local55 == 65535) {
					local55 = -1;
				}
				local121 = Static63.aClass3_Sub17_Sub1_2.method2091();
				if (local55 == local21.anInt4323 && local55 != -1) {
					@Pc(319) Class3_Sub1_Sub15 local319 = Static148.method2368(local55);
					@Pc(322) int local322 = local319.anInt3554;
					if (local322 == 1) {
						local21.anInt4299 = 0;
						local21.anInt4286 = local121;
						local21.anInt4305 = 0;
						local21.anInt4275 = 0;
						Static75.method1113(local21.anInt4329, false, local21.anInt4275, local319, local21.anInt4315);
					}
					if (local322 == 2) {
						local21.anInt4299 = 0;
					}
				} else if (local55 == -1 || local21.anInt4323 == -1 || Static148.method2368(local55).anInt3562 >= Static148.method2368(local21.anInt4323).anInt3562) {
					local21.anInt4291 = local21.anInt4297;
					local21.anInt4286 = local121;
					local21.anInt4299 = 0;
					local21.anInt4323 = local55;
					local21.anInt4275 = 0;
					local21.anInt4305 = 0;
					if (local21.anInt4323 != -1) {
						Static75.method1113(local21.anInt4329, false, local21.anInt4275, Static148.method2368(local21.anInt4323), local21.anInt4315);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)Lclient!rd;")
	public static Class80 method1868(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static83.method1219(arg0) : Static35.aClass80_693;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!rd;ZI)V")
	public static void method1869(@OriginalArg(0) Class80 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(18) int local18 = Static134.aClass3_Sub1_Sub4_Sub3_Sub1_7.method2258(arg0, 250);
		@Pc(25) int local25 = Static134.aClass3_Sub1_Sub4_Sub3_Sub1_7.method2274(arg0, 250) * 13;
		Static24.method2576(6, 6, local18 + 4 + 4, local25 + 4 + 4, 0);
		Static24.method2564(6, 6, local18 + 8, local25 - -4 + 4, 16777215);
		Static134.aClass3_Sub1_Sub4_Sub3_Sub1_7.method2247(arg0, 10, 10, local18, local25, 16777215, -1, 1, 1, 0);
		Static89.method1311(6, 6, local18 + 4 + 4, local25 + 4 + 4);
		if (!arg1) {
			Static150.method2411(local18, local25, 10, 10);
			return;
		}
		try {
			@Pc(113) Graphics local113 = Static146.aCanvas1.getGraphics();
			Static60.aClass32_1.method1278(local113);
		} catch (@Pc(121) Exception local121) {
			Static146.aCanvas1.repaint();
		}
	}
}
