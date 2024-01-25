import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!qj;")
	public static Class165 aClass165_58;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString158 = "slide:";

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	public static int anInt3926 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method3650() {
		@Pc(8) int local8 = Static346.aByteArrayArray21.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static346.aByteArrayArray21[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static210.anInt4177; local20++) {
					if (Static80.anIntArray184[local10] == Static299.anIntArray725[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static299.anIntArray725[Static210.anInt4177] = Static80.anIntArray184[local10];
					local18 = Static210.anInt4177++;
				}
				@Pc(63) Class1_Sub7 local63 = new Class1_Sub7(Static346.aByteArrayArray21[local10]);
				@Pc(65) int local65 = 0;
				while (Static346.aByteArrayArray21[local10].length > local63.anInt3368 && local65 < 511 && Static338.anInt6419 < 1023) {
					@Pc(82) int local82 = local18 | local65++ << 6;
					@Pc(86) int local86 = local63.method3115();
					@Pc(90) int local90 = local86 >> 14;
					@Pc(96) int local96 = local86 >> 7 & 0x3F;
					@Pc(100) int local100 = local86 & 0x3F;
					@Pc(113) int local113 = local96 + (Static80.anIntArray184[local10] >> 8) * 64 - Static182.anInt3775;
					@Pc(126) int local126 = local100 + (Static80.anIntArray184[local10] & 0xFF) * 64 - Static161.anInt3315;
					@Pc(132) Class122 local132 = Static232.method5539(local63.method3115());
					if (Static169.aClass5_Sub3_Sub3_Sub2Array2[local82] == null && (local132.aByte36 & 0x1) > 0 && Static47.anInt1095 == local90 && local113 >= 0 && Static48.anInt1107 > local113 + local132.anInt3819 && local126 >= 0 && Static337.anInt6402 > local132.anInt3819 + local126) {
						Static169.aClass5_Sub3_Sub3_Sub2Array2[local82] = new Class5_Sub3_Sub3_Sub2();
						Static169.aClass5_Sub3_Sub3_Sub2Array2[local82].anInt4920 = local82;
						@Pc(178) Class5_Sub3_Sub3_Sub2 local178 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local82];
						Static25.anIntArray83[Static338.anInt6419++] = local82;
						local178.anInt4932 = Static215.anInt4246;
						local178.method4549(local132);
						local178.method4531(local178.aClass122_1.anInt3819);
						local178.anInt4935 = local178.aClass122_1.anInt3790 << 3;
						if (local178.anInt4935 == 0) {
							local178.method4548(0);
						} else {
							local178.method4548(Static93.anIntArray226[local178.aClass122_1.aByte35 - 1]);
						}
						local178.method4528(local178.method4541(), local90, local113, local126, true);
					}
				}
			}
		}
	}
}
