import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "Lclient!fk;")
	public static Class71 aClass71_5;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "Lclient!ij;")
	public static Class93 aClass93_52;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_63 = new Class85("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
	public static int anInt2579 = 0;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "Z")
	public static boolean aBoolean202 = false;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "[I")
	public static final int[] anIntArray263 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Z")
	public static final boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIIIII)Z")
	public static boolean method2379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg4; local16 <= arg2; local16++) {
				if (Static141.anIntArrayArray48[local12][local16] == arg3 && Static109.anIntArrayArray36[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
	public static void method2381() {
		@Pc(8) int local8 = Static150.aByteArrayArray12.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static150.aByteArrayArray12[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static307.anInt5993; local20++) {
					if (Static198.anIntArray387[local10] == Static325.anIntArray596[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static325.anIntArray596[Static307.anInt5993] = Static198.anIntArray387[local10];
					local18 = Static307.anInt5993++;
				}
				@Pc(60) Class5_Sub12 local60 = new Class5_Sub12(Static150.aByteArrayArray12[local10]);
				@Pc(62) int local62 = 0;
				while (local60.anInt5731 < Static150.aByteArrayArray12[local10].length && local62 < 511 && anInt2579 < 1023) {
					@Pc(81) int local81 = local62++ << 6 | local18;
					@Pc(85) int local85 = local60.method5106();
					@Pc(89) int local89 = local85 >> 14;
					@Pc(95) int local95 = local85 >> 7 & 0x3F;
					@Pc(99) int local99 = local85 & 0x3F;
					@Pc(111) int local111 = local95 + (Static198.anIntArray387[local10] >> 8) * 64 - Static172.anInt4394;
					@Pc(123) int local123 = (Static198.anIntArray387[local10] & 0xFF) * 64 + local99 - Static12.anInt3797;
					@Pc(129) Class106 local129 = Static22.method442(local60.method5106());
					if (Static280.aClass4_Sub5_Sub2_Sub2Array1[local81] == null && (local129.aByte15 & 0x1) > 0 && Static322.anInt611 == local89 && local111 >= 0 && Static22.anInt481 > local111 + local129.anInt3135 && local123 >= 0 && Static269.anInt5281 > local123 + local129.anInt3135) {
						Static280.aClass4_Sub5_Sub2_Sub2Array1[local81] = new Class4_Sub5_Sub2_Sub2();
						Static280.aClass4_Sub5_Sub2_Sub2Array1[local81].anInt5386 = local81;
						@Pc(176) Class4_Sub5_Sub2_Sub2 local176 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local81];
						Static95.anIntArray160[anInt2579++] = local81;
						local176.anInt5350 = Static283.anInt5563;
						local176.method4821(local129);
						local176.method4813(local176.aClass106_1.anInt3135);
						local176.anInt5392 = local176.aClass106_1.anInt3130 << 3;
						if (local176.anInt5392 == 0) {
							local176.method4812(0);
						} else {
							local176.method4812((local176.aClass106_1.aByte12 + 4 & 0x7C200007) << 11);
						}
						local176.method4802(local176.method4807(), true, local111, local123, local89);
					}
				}
			}
		}
	}
}
