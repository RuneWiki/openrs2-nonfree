import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qca", name = "Jb", descriptor = "[I")
	public static int[] anIntArray446;

	@OriginalMember(owner = "client!qca", name = "Ib", descriptor = "[S")
	public static short[] aShortArray87 = new short[256];

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method6769(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static105.anInt2258;
		@Pc(7) int[] local7 = Static321.anIntArray339;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < local5; local11++) {
			@Pc(18) Class28_Sub1_Sub4_Sub2_Sub2 local18 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local7[local11]];
			if (local18 != null && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 != local18 && local18.aString45 != null && local18.aString45.equalsIgnoreCase(arg0)) {
				@Pc(48) Class5_Sub21 local48;
				if (arg1 == 1) {
					local48 = Static64.method905(Static263.aClass49_1, Static95.aClass305_59);
					local48.aClass5_Sub41_Sub2_1.method7840(0);
					local48.aClass5_Sub41_Sub2_1.method7828(local7[local11]);
					Static495.method7092(local48);
				} else if (arg1 == 4) {
					local48 = Static64.method905(Static263.aClass49_1, Static218.aClass305_36);
					local48.aClass5_Sub41_Sub2_1.method7828(local7[local11]);
					local48.aClass5_Sub41_Sub2_1.method7798(0);
					Static495.method7092(local48);
				} else if (arg1 == 5) {
					local48 = Static64.method905(Static263.aClass49_1, Static457.aClass305_71);
					local48.aClass5_Sub41_Sub2_1.method7840(0);
					local48.aClass5_Sub41_Sub2_1.method7809(local7[local11]);
					Static495.method7092(local48);
				} else if (arg1 == 6) {
					local48 = Static64.method905(Static263.aClass49_1, Static235.aClass305_39);
					local48.aClass5_Sub41_Sub2_1.method7798(0);
					local48.aClass5_Sub41_Sub2_1.method7828(local7[local11]);
					Static495.method7092(local48);
				} else if (arg1 == 7) {
					local48 = Static64.method905(Static263.aClass49_1, Static412.aClass305_62);
					local48.aClass5_Sub41_Sub2_1.method7800(0);
					local48.aClass5_Sub41_Sub2_1.method7848(local7[local11]);
					Static495.method7092(local48);
				} else if (arg1 == 9) {
					local48 = Static64.method905(Static263.aClass49_1, Static207.aClass305_33);
					local48.aClass5_Sub41_Sub2_1.method7848(local7[local11]);
					local48.aClass5_Sub41_Sub2_1.method7840(0);
					Static495.method7092(local48);
				}
				local9 = true;
				break;
			}
		}
		if (!local9) {
			Static491.method7052(Static64.aClass52_21.method907(Static544.anInt8937) + arg0);
		}
	}

	@OriginalMember(owner = "client!qca", name = "z", descriptor = "(I)V")
	public static void method6770() {
		if (Static31.anInt483 == 1 || Static31.anInt483 == 3 || Static589.anInt9683 != Static31.anInt483 && (Static31.anInt483 == 0 || Static589.anInt9683 == 0)) {
			Static37.anInt617 = 0;
			Static36.anInt607 = 0;
			Static56.aClass300_8.method7189();
		}
		Static589.anInt9683 = Static31.anInt483;
	}
}
