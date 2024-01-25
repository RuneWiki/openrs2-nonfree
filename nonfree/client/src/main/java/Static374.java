import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
	public static int anInt9753;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
	public static int anInt9757;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)V")
	public static void method7973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class186 local28 = Static26.aClass186ArrayArrayArray1[local9][arg0][arg1] = Static26.aClass186ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class168 local33 = local28.aClass168_3; local33 != null; local33 = local33.aClass168_2) {
					@Pc(37) Class9_Sub4_Sub2 local37 = local33.aClass9_Sub4_Sub2_1;
					if (local37.aShort115 == arg0 && local37.aShort114 == arg1) {
						local37.aByte135--;
					}
				}
				if (local28.aClass9_Sub4_Sub3_1 != null) {
					local28.aClass9_Sub4_Sub3_1.aByte135--;
				}
				if (local28.aClass9_Sub4_Sub5_1 != null) {
					local28.aClass9_Sub4_Sub5_1.aByte135--;
				}
				if (local28.aClass9_Sub4_Sub5_2 != null) {
					local28.aClass9_Sub4_Sub5_2.aByte135--;
				}
				if (local28.aClass9_Sub4_Sub1_2 != null) {
					local28.aClass9_Sub4_Sub1_2.aByte135--;
				}
				if (local28.aClass9_Sub4_Sub1_1 != null) {
					local28.aClass9_Sub4_Sub1_1.aByte135--;
				}
			}
		}
		if (Static26.aClass186ArrayArrayArray1[0][arg0][arg1] == null) {
			Static26.aClass186ArrayArrayArray1[0][arg0][arg1] = new Class186(0);
			Static26.aClass186ArrayArrayArray1[0][arg0][arg1].aByte73 = 1;
		}
		Static26.aClass186ArrayArrayArray1[0][arg0][arg1].aClass186_1 = local7;
		Static26.aClass186ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V")
	public static void method7974() {
		if (Static266.anInt5702 <= 0) {
			Static91.aString16 = "";
			return;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static363.aStringArray36.length; local11++) {
			if (Static363.aStringArray36[local11].indexOf("--> ") != -1) {
				@Pc(23) int local23 = ~Static266.anInt5702;
				local9++;
				if (local23 == ~local9) {
					Static91.aString16 = Static363.aStringArray36[local11].substring(Static363.aStringArray36[local11].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)Z")
	public static boolean method7975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
	public static void method7977() {
		if (Static412.aBoolean597) {
			return;
		}
		Static241.method4387(Static52.aClass186ArrayArrayArray2);
		if (Static444.aClass186ArrayArrayArray3 != null) {
			Static241.method4387(Static444.aClass186ArrayArrayArray3);
		}
		Static412.aBoolean597 = true;
	}
}
