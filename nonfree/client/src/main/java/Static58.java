import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "I")
	public static int anInt1235;

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
	public static int anInt1234 = 0;

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "I")
	public static final int anInt1241 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)V")
	public static void method981(@OriginalArg(0) boolean arg0) {
		if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 >> 7 == Static37.anInt934 && Static86.anInt3522 == Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 >> 7) {
			Static37.anInt934 = 0;
		}
		@Pc(25) int local25 = Static139.anInt2969;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(48) Class2_Sub2_Sub3_Sub7_Sub2 local48;
			@Pc(42) long local42;
			if (arg0) {
				local48 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1;
				local42 = 8791798054912L;
			} else {
				local42 = (long) Static110.anIntArray221[local31] << 32;
				local48 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[Static110.anIntArray221[local31]];
			}
			if (local48 != null && local48.method2733()) {
				@Pc(65) int local65 = local48.anInt3529 >> 7;
				local48.aBoolean151 = false;
				if ((Static159.aBoolean148 && Static139.anInt2969 > 50 || Static139.anInt2969 > 200) && !arg0 && local48.anInt3554 == local48.anInt3525) {
					local48.aBoolean151 = true;
				}
				@Pc(93) int local93 = local48.anInt3578 >> 7;
				if (local65 >= 0 && local65 < 104 && local93 >= 0 && local93 < 104) {
					if (local48.aClass2_Sub2_Sub3_Sub4_1 == null || local48.anInt3606 > Static127.anInt2757 || local48.anInt3594 <= Static127.anInt2757) {
						if ((local48.anInt3529 & 0x7F) == 64 && (local48.anInt3578 & 0x7F) == 64) {
							if (Static51.anInt1164 == Static78.anIntArrayArray17[local65][local93]) {
								continue;
							}
							Static78.anIntArrayArray17[local65][local93] = Static51.anInt1164;
						}
						local48.anInt3558 = Static18.method346(local48.anInt3578, Static66.anInt1396, local48.anInt3529);
						Static86.method2730(Static66.anInt1396, local48.anInt3529, local48.anInt3578, local48.anInt3558, 60, local48, local48.anInt3536, local42, local48.aBoolean150);
					} else {
						local48.aBoolean151 = false;
						local48.anInt3558 = Static18.method346(local48.anInt3578, Static66.anInt1396, local48.anInt3529);
						Static124.method2148(Static66.anInt1396, local48.anInt3529, local48.anInt3578, local48.anInt3558, local48, local48.anInt3536, local42, local48.anInt3591, local48.anInt3587, local48.anInt3586, local48.anInt3597);
					}
				}
			}
		}
	}
}
