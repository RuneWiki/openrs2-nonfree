import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "Lclient!qj;")
	public static Class165 aClass165_47;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	public static void method2431() {
		while (true) {
			if (Static232.aClass1_Sub7_Sub1_4.method726(Static230.anInt4529) >= 27) {
				@Pc(24) int local24 = Static232.aClass1_Sub7_Sub1_4.method733(15);
				if (local24 != 32767) {
					@Pc(29) boolean local29 = false;
					if (Static169.aClass5_Sub3_Sub3_Sub2Array2[local24] == null) {
						Static169.aClass5_Sub3_Sub3_Sub2Array2[local24] = new Class5_Sub3_Sub3_Sub2();
						Static169.aClass5_Sub3_Sub3_Sub2Array2[local24].anInt4920 = local24;
						local29 = true;
					}
					@Pc(50) Class5_Sub3_Sub3_Sub2 local50 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local24];
					Static25.anIntArray83[Static338.anInt6419++] = local24;
					local50.anInt4932 = Static215.anInt4246;
					if (local50.aClass122_1 != null && local50.aClass122_1.method3570()) {
						Static235.method4218(local50);
					}
					@Pc(79) int local79 = Static232.aClass1_Sub7_Sub1_4.method733(1);
					@Pc(84) int local84 = Static232.aClass1_Sub7_Sub1_4.method733(5);
					local50.method4549(Static232.method5539(Static232.aClass1_Sub7_Sub1_4.method733(14)));
					if (local84 > 15) {
						local84 -= 32;
					}
					@Pc(106) int local106 = Static232.aClass1_Sub7_Sub1_4.method733(5);
					if (local106 > 15) {
						local106 -= 32;
					}
					@Pc(117) int local117 = Static232.aClass1_Sub7_Sub1_4.method733(1);
					if (local117 == 1) {
						Static320.anIntArray768[Static125.anInt2470++] = local24;
					}
					@Pc(135) int local135 = Static93.anIntArray226[Static232.aClass1_Sub7_Sub1_4.method733(3)];
					local50.method4531(local50.aClass122_1.anInt3819);
					local50.anInt4935 = local50.aClass122_1.anInt3790 << 3;
					if (local50.anInt4935 == 0) {
						local50.method4548(0);
					} else if (local29) {
						local50.method4548(local135);
					}
					local50.method4528(local50.method4541(), Static285.anInt5511, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0] + local106, local84 + Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], local79 == 1);
					if (local50.aClass122_1.method3570()) {
						Static222.method4056(local50.anIntArray637[0], local50, Static285.anInt5511, 0, null, local50.anIntArray638[0], null);
					}
					continue;
				}
			}
			Static232.aClass1_Sub7_Sub1_4.method727();
			return;
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
	public static void method2432() {
		Static277.anIntArray774 = null;
		Static126.anIntArray296 = null;
		Static233.aByteArrayArrayArray11 = null;
		Static3.aByteArrayArrayArray1 = null;
		Static235.anIntArray590 = null;
		Static159.aByteArrayArrayArray5 = null;
		Static337.aByteArrayArrayArray12 = null;
		Static181.anIntArray443 = null;
		Static178.aByteArrayArrayArray6 = null;
		Static35.anIntArray106 = null;
		Static213.anIntArrayArrayArray10 = null;
		Static352.anIntArray810 = null;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)I")
	public static int method2434(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}
}
