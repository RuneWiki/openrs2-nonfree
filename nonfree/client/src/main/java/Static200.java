import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
	public static int anInt4245;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!wf;")
	public static Class1_Sub28 aClass1_Sub28_1;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
	public static int anInt4248;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "Lclient!ld;")
	public static Class67 aClass67_8;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "Lclient!ff;")
	public static Class42 aClass42_2;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1457 = Static64.method1101("<br>(X100(U(Y");

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger6 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
	public static int anInt4250 = 0;

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
	public static int anInt4254 = -1;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
	public static void method3301() {
		Static225.aClass1_Sub16_Sub1_4.method3827();
		@Pc(7) int local7 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
		if (local7 == 0) {
			return;
		}
		@Pc(28) int local28 = Static225.aClass1_Sub16_Sub1_4.method3824(2);
		if (local28 == 0) {
			Static145.anIntArray216[Static226.anInt4738++] = 2047;
			return;
		}
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (local28 == 1) {
			local50 = Static225.aClass1_Sub16_Sub1_4.method3824(3);
			Static73.aClass5_Sub1_Sub1_1.method2795(local50, false);
			local60 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
			if (local60 == 1) {
				Static145.anIntArray216[Static226.anInt4738++] = 2047;
			}
			return;
		}
		@Pc(100) int local100;
		if (local28 == 2) {
			local50 = Static225.aClass1_Sub16_Sub1_4.method3824(3);
			Static73.aClass5_Sub1_Sub1_1.method2795(local50, true);
			local60 = Static225.aClass1_Sub16_Sub1_4.method3824(3);
			Static73.aClass5_Sub1_Sub1_1.method2795(local60, true);
			local100 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
			if (local100 == 1) {
				Static145.anIntArray216[Static226.anInt4738++] = 2047;
			}
		} else if (local28 == 3) {
			local50 = Static225.aClass1_Sub16_Sub1_4.method3824(7);
			local60 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
			if (local60 == 1) {
				Static145.anIntArray216[Static226.anInt4738++] = 2047;
			}
			local100 = Static225.aClass1_Sub16_Sub1_4.method3824(7);
			@Pc(148) int local148 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
			Static197.anInt2422 = Static225.aClass1_Sub16_Sub1_4.method3824(2);
			Static73.aClass5_Sub1_Sub1_1.method2797(local50, local148 == 1, local100);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!of;B)V")
	public static void method3302(@OriginalArg(0) Applet_Sub1 arg0) {
		Static13.method265();
		if (Static32.aClass113_1 != null) {
			return;
		}
		if (!Static118.aBoolean104) {
			Static44.method786();
		} else if (Static15.anInt371 == 1) {
			@Pc(29) int local29 = Static140.anInt3103 / 5;
			@Pc(36) int local36 = Static147.anInt3196 + local29 + 140;
			if (local36 <= Static148.anInt3214 && Static148.anInt3214 <= local36 + 14 && Static106.anInt2346 >= Static82.anInt1827 + 4 && Static82.anInt1827 + 18 >= Static106.anInt2346) {
				Static103.method3798(0, 0);
				return;
			}
			if (Static148.anInt3214 >= local36 + 15 && local36 + 80 >= Static148.anInt3214 && Static82.anInt1827 + 4 <= Static106.anInt2346 && Static82.anInt1827 + 18 >= Static106.anInt2346) {
				Static103.method3798(0, 1);
				return;
			}
			@Pc(102) int local102 = local29 + Static147.anInt3196 + 250;
			if (local102 <= Static148.anInt3214 && Static148.anInt3214 <= local102 + 14 && Static82.anInt1827 + 4 <= Static106.anInt2346 && Static106.anInt2346 <= Static82.anInt1827 + 18) {
				Static103.method3798(1, 0);
				return;
			}
			if (Static148.anInt3214 >= local102 + 15 && Static148.anInt3214 <= local102 + 80 && Static82.anInt1827 + 4 <= Static106.anInt2346 && Static106.anInt2346 <= Static82.anInt1827 + 18) {
				Static103.method3798(1, 1);
				return;
			}
			@Pc(178) int local178 = local29 + Static147.anInt3196 + 360;
			if (local178 <= Static148.anInt3214 && local178 + 14 >= Static148.anInt3214 && Static82.anInt1827 + 4 <= Static106.anInt2346 && Static106.anInt2346 <= Static82.anInt1827 + 18) {
				Static103.method3798(2, 0);
				return;
			}
			if (local178 + 15 <= Static148.anInt3214 && local178 + 80 >= Static148.anInt3214 && Static106.anInt2346 >= Static82.anInt1827 + 4 && Static106.anInt2346 <= Static82.anInt1827 + 18) {
				Static103.method3798(2, 1);
				return;
			}
			@Pc(246) int local246 = local29 + Static147.anInt3196 + 470;
			if (Static148.anInt3214 >= local246 && Static148.anInt3214 <= local246 + 14 && Static106.anInt2346 >= Static82.anInt1827 + 4 && Static82.anInt1827 + 18 >= Static106.anInt2346) {
				Static103.method3798(3, 0);
				return;
			}
			if (Static148.anInt3214 >= local246 + 15 && Static148.anInt3214 <= local246 + 80 && Static106.anInt2346 >= Static82.anInt1827 + 4 && Static82.anInt1827 + 18 >= Static106.anInt2346) {
				Static103.method3798(3, 1);
				return;
			}
			if (Static132.anInt2980 != -1) {
				@Pc(321) Class48 local321 = Static48.aClass48Array1[Static132.anInt2980];
				if (local321.aBoolean81 == Static206.aBoolean199) {
					@Pc(349) byte[] local349 = Static150.method2574(new Class51[] { local321.aClass51_602, Static150.aClass51_1158 }).method1387();
					Static161.aString6 = new String(local349, 0, local349.length);
					Static192.anInt4159 = local321.anInt1788;
					if (Static147.anInt3191 != 0) {
						Static216.anInt4590 = Static192.anInt4159 + 50000;
						Static13.anInt329 = Static192.anInt4159 + 40000;
						Static192.anInt4167 = Static13.anInt329;
					}
					if (Static159.aClass71_27 != null) {
						Static159.aClass71_27.aBoolean121 = true;
						Static82.method1438(Static159.aClass71_27);
					}
					return;
				}
				@Pc(384) Class51 local384 = Static160.aClass51_1223;
				if (Static147.anInt3191 != 0) {
					local384 = Static150.method2574(new Class51[] { Static6.aClass51_49, Static27.method511(local321.anInt1788 + 7000) });
				}
				@Pc(478) Class51 local478 = Static150.method2574(new Class51[] { Static159.aClass51_1222, local321.aClass51_602, Static150.aClass51_1158, local384, Static11.aClass51_73, Static27.method511(Static179.anInt3919), Static25.aClass51_202, Static27.method511(Static14.anInt340), Static192.aClass51_1431, Static27.method511(0), Static120.aClass51_946, Static27.method511(Static24.anInt606), Static99.aClass51_722, Static27.method511(Static222.anInt4662) });
				try {
					arg0.getAppletContext().showDocument(local478.method1427(), "_self");
					return;
				} catch (@Pc(487) Exception local487) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)I")
	public static int method3304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static150.aByteArrayArrayArray9[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static150.aByteArrayArrayArray9[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
