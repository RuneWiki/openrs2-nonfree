import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!o", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!o", name = "N", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!o", name = "R", descriptor = "Lclient!as;")
	public static final Class2_Sub4 aClass2_Sub4_1 = new Class2_Sub4(0, 0);

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method4241() {
		if (Static323.aFloat71 < 1024.0F) {
			Static323.aFloat71 = 1024.0F;
		}
		while (Static350.aFloat74 >= 16384.0F) {
			Static350.aFloat74 -= 16384.0F;
		}
		if (Static323.aFloat71 > 3072.0F) {
			Static323.aFloat71 = 3072.0F;
		}
		while (Static350.aFloat74 < 0.0F) {
			Static350.aFloat74 += 16384.0F;
		}
		@Pc(41) int local41 = Static74.anInt1635 >> 7;
		@Pc(45) int local45 = Static211.anInt4264 >> 7;
		@Pc(51) int local51 = Static36.method2335(Static211.anInt4264, Static241.anInt2711, Static74.anInt1635);
		@Pc(53) int local53 = 0;
		@Pc(69) int local69;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local69 = local41 - 4; local69 <= local41 + 4; local69++) {
				for (@Pc(75) int local75 = local45 - 4; local75 <= local45 + 4; local75++) {
					@Pc(79) int local79 = Static241.anInt2711;
					if (local79 < 3 && Static155.method2770(local69, local75)) {
						local79++;
					}
					@Pc(92) int local92 = 0;
					if (Static57.aClass133_Sub1_2.aByteArrayArrayArray13 != null && Static57.aClass133_Sub1_2.aByteArrayArrayArray13[local79] != null) {
						local92 = (Static57.aClass133_Sub1_2.aByteArrayArrayArray13[local79][local69][local75] & 0xFF) * 8;
					}
					@Pc(125) int local125 = local92 + local51 - Static128.aClass149Array1[local79].method5837(local69, local75);
					if (local53 < local125) {
						local53 = local125;
					}
				}
			}
		}
		local69 = local53 * 1536;
		if (local69 > 786432) {
			local69 = 786432;
		}
		if (local69 < 262144) {
			local69 = 262144;
		}
		if (local69 > Static119.anInt2636) {
			Static119.anInt2636 += (local69 - Static119.anInt2636) / 24;
		} else if (local69 < Static119.anInt2636) {
			Static119.anInt2636 += (local69 - Static119.anInt2636) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIILclient!gn;)V")
	public static void method4242(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class1_Sub2_Sub1 arg3) {
		Static119.method2127(0, arg2, arg3.aByte73, arg3.anInt6798, arg1, arg0, arg3.anInt6800);
	}
}
