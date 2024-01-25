import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray5;

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
	public static int anInt9028;

	@OriginalMember(owner = "client!mda", name = "k", descriptor = "Lclient!td;")
	public static Class24 aClass24_31;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BII)Z")
	public static boolean method7761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static447.aBoolean555) {
			return false;
		}
		@Pc(21) int local21 = arg1 >> 16;
		@Pc(25) int local25 = arg1 & 0xFFFF;
		if (Static92.aClass279ArrayArray1[local21] == null || Static92.aClass279ArrayArray1[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class279 local43 = Static92.aClass279ArrayArray1[local21][local25];
		@Pc(57) Class3_Sub4_Sub13 local57;
		if (arg0 == -1 && local43.anInt8204 == 0) {
			for (local57 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local57 != null; local57 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
				if (local57.anInt4577 == 25 || local57.anInt4577 == 1002 || local57.anInt4577 == 16 || local57.anInt4577 == 45 || local57.anInt4577 == 4) {
					for (@Pc(147) Class279 local147 = Static433.method6771(local57.anInt4579); local147 != null; local147 = Static329.method5388(local147)) {
						if (local43.anInt8185 == local147.anInt8185) {
							return true;
						}
					}
				}
			}
		} else {
			for (local57 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local57 != null; local57 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
				if (local57.anInt4574 == arg0 && local57.anInt4579 == local43.anInt8185 && (local57.anInt4577 == 25 || local57.anInt4577 == 1002 || local57.anInt4577 == 16 || local57.anInt4577 == 45 || local57.anInt4577 == 4)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!ha;BII)V")
	public static void method7765(@OriginalArg(0) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static401.aClass16ArrayArray1 = new Class16[arg2][arg1];
		Static383.aClass5_12 = arg0;
		if (Static274.anIntArray262 != null) {
			Static526.aClass205_3 = Static226.method1811(Static274.anIntArray262[1], Static274.anIntArray262[2], Static274.anIntArray262[3], Static274.anIntArray262[5], Static274.anIntArray262[0], Static274.anIntArray262[4]);
		}
		Static314.aClass16_2 = new Class16();
		Static625.method8731();
	}
}
