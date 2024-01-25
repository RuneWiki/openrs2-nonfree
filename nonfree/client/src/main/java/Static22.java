import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	public static int anInt541;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!b", name = "r", descriptor = "[I")
	public static final int[] anIntArray44 = new int[32];

	@OriginalMember(owner = "client!b", name = "t", descriptor = "[I")
	public static final int[] anIntArray45 = new int[1];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIILclient!ya;)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class39 arg4) {
		arg4.OA(arg2, arg3, arg2 + arg1, arg0 + arg3);
		arg4.method4563(arg3, -16777216, arg1, arg2, arg0);
		if (Static301.anInt5202 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static168.anInt431 / (float) Static168.anInt433;
		@Pc(38) int local38 = arg1;
		@Pc(48) int local48 = arg0;
		if (local36 < 1.0F) {
			local48 = (int) (local36 * (float) arg1);
		} else {
			local38 = (int) ((float) arg0 / local36);
		}
		@Pc(74) int local74 = arg3 + (arg0 - local48) / 2;
		@Pc(83) int local83 = arg2 + (arg1 - local38) / 2;
		if (Static343.aClass143_32 == null || Static343.aClass143_32.la() != arg1 || arg0 != Static343.aClass143_32.ma()) {
			Static168.method433(Static168.anInt432, Static168.anInt430 + Static168.anInt431, Static168.anInt432 + Static168.anInt433, Static168.anInt430, local83, local74, local83 + local38, local74 + local48);
			Static168.method422(arg4);
			Static343.aClass143_32 = arg4.method4495(local83, local74, local38, local48, false);
		}
		Static343.aClass143_32.method5723(local83, local74);
		@Pc(134) int local134 = local38 * Static207.anInt3928 / Static168.anInt433;
		@Pc(140) int local140 = Static421.anInt2083 * local48 / Static168.anInt431;
		@Pc(148) int local148 = local38 * Static379.anInt4315 / Static168.anInt433 + local83;
		@Pc(163) int local163 = local74 + local48 - local140 - local48 * Static145.anInt2781 / Static168.anInt431;
		@Pc(165) int local165 = -1996554240;
		if (Static337.aClass61_5 == Static147.aClass61_4) {
			local165 = -1996488705;
		}
		arg4.O(local148, local163, local134, local140, local165, 1);
		arg4.method4513(local148, local163, local134, local140, local165, 0);
		if (Static440.anInt7076 <= 0) {
			return;
		}
		@Pc(197) int local197;
		if (Static434.anInt7031 > 50) {
			local197 = 500 - Static434.anInt7031 * 5;
		} else {
			local197 = Static434.anInt7031 * 5;
		}
		for (@Pc(208) Class1_Sub26 local208 = (Class1_Sub26) Static168.aClass181_3.method4112(); local208 != null; local208 = (Class1_Sub26) Static168.aClass181_3.method4104()) {
			@Pc(216) Class202 local216 = Static168.aClass78_2.method2110(local208.anInt3922);
			if (Static114.method2108(local216)) {
				@Pc(238) int local238;
				@Pc(251) int local251;
				if (Static304.anInt5263 == local208.anInt3922) {
					local238 = local83 + local208.anInt3920 * local38 / Static168.anInt433;
					local251 = local74 + (Static168.anInt431 - local208.anInt3924) * local48 / Static168.anInt431;
					arg4.method4563(local251 - 2, local197 << 24 | 0xFFFF00, 4, local238 - 2, 4);
				} else if (Static92.anInt1947 != -1 && Static92.anInt1947 == local216.anInt5561) {
					local238 = local208.anInt3920 * local38 / Static168.anInt433 + local83;
					local251 = (Static168.anInt431 - local208.anInt3924) * local48 / Static168.anInt431 + local74;
					arg4.method4563(local251 - 2, local197 << 24 | 0xFFFF00, 4, local238 - 2, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ya;J)V")
	public static void method525(@OriginalArg(1) Class39 arg0, @OriginalArg(2) long arg1) {
		Static64.anInt1503 = 0;
		Static206.anInt3915 = Static397.anInt6373;
		Static397.anInt6373 = 0;
		@Pc(16) long local16 = Static279.method4058();
		for (@Pc(21) Class4_Sub7 local21 = (Class4_Sub7) Static356.aClass141_8.method3357(); local21 != null; local21 = (Class4_Sub7) Static356.aClass141_8.method3360()) {
			if (local21.method3778(arg0, arg1)) {
				Static64.anInt1503++;
			}
		}
		if (Static18.aBoolean211 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static356.aClass141_8.method3361() + ", running: " + Static64.anInt1503 + ". Particles: " + Static397.anInt6373 + ". Time taken: " + (Static279.method4058() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BJ)V")
	public static void method526(@OriginalArg(1) long arg0) {
		if (client.lb != null) {
			if (Static345.anInt5797 == 1 || Static345.anInt5797 == 5) {
				Static60.method1281(arg0);
			} else if (Static345.anInt5797 == 4) {
				Static452.method5930(arg0);
			}
		}
		method525(Static415.aClass39_11, (long) Static378.anInt4244);
		if (Static407.anInt6564 != -1) {
			Static164.method2646(Static407.anInt6564);
		}
		for (@Pc(43) int local43 = 0; local43 < Static121.anInt2467; local43++) {
			if (Static71.aBooleanArray25[local43]) {
				Static391.aBooleanArray46[local43] = true;
			}
			Static193.aBooleanArray27[local43] = Static71.aBooleanArray25[local43];
			Static71.aBooleanArray25[local43] = false;
		}
		Static27.anInt601 = Static378.anInt4244;
		if (Static415.aClass39_11.method4551()) {
			Static300.aBoolean490 = true;
		}
		if (Static407.anInt6564 != -1) {
			Static121.anInt2467 = 0;
			Static270.method3987();
		}
		Static415.aClass39_11.e();
		Static316.method4486(Static415.aClass39_11);
		@Pc(95) int local95 = Static51.method6021();
		if (local95 == -1) {
			local95 = Static221.anInt2659;
		}
		if (local95 == -1) {
			local95 = Static402.anInt6499;
		}
		Static38.method696(local95);
		Static268.method3949(Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298, Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300, Static4.anInt115);
		Static4.anInt115 = 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIZLclient!ul;I)V")
	public static void method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) Class246 arg2) {
		Static23.anInt5191 = 2;
		Static157.aClass246_114 = arg2;
		Static53.anInt991 = arg0;
		Static286.anInt5015 = 0;
		Static59.aBoolean86 = false;
		Static390.anInt6278 = 1;
		Static152.anInt2905 = arg1;
	}
}
