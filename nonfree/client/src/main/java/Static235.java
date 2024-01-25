import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "[I")
	public static final int[] anIntArray626 = new int[32];

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	public static int anInt4668 = 999999;

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
	public static int anInt4675 = 0;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!fo;ZZ)Z")
	public static boolean method4081(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) boolean local6 = Static331.aClass8Array5 == Static251.aClass8Array6;
		@Pc(8) int local8 = 0;
		arg0.method5058();
		if (arg0.aShort83 < 0 || arg0.aShort81 < 0 || arg0.aShort82 >= Static346.anInt6536 || arg0.aShort84 >= Static174.anInt3604) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort83; local30 <= arg0.aShort82; local30++) {
			for (local34 = arg0.aShort81; local34 <= arg0.aShort84; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort83) {
					local37++;
				}
				if (local30 < arg0.aShort82) {
					local37 += 4;
				}
				if (local34 > arg0.aShort81) {
					local37 += 8;
				}
				if (local34 < arg0.aShort84) {
					local37 += 2;
				}
				@Pc(66) Class49 local66 = Static229.aClass49ArrayArrayArray6[arg0.aByte69][local30][local34];
				if (local66 == null) {
					if (arg2) {
						@Pc(83) boolean local83 = Static229.aClass49ArrayArrayArray6[0][local30][local34].aClass49_1 != null;
						if (arg0.aByte69 == 3 && local83) {
							return false;
						}
						for (@Pc(93) int local93 = 1; local93 <= arg0.aByte69; local93++) {
							if (Static229.aClass49ArrayArrayArray6[local93][local30][local34] == null) {
								local66 = Static229.aClass49ArrayArrayArray6[local93][local30][local34] = new Class49(local93, local30, local34);
								if (local83) {
									local66.aByte24++;
								}
							}
						}
					} else {
						Static248.method4274(arg0.aByte69, local30, local34);
						local66 = Static229.aClass49ArrayArrayArray6[arg0.aByte69][local30][local34];
					}
				}
				@Pc(151) Class47 local151 = Static177.method3292(local37, arg0);
				@Pc(154) Class47 local154 = local66.aClass47_3;
				if (local154 == null) {
					local66.aClass47_3 = local151;
				} else {
					while (local154.aClass47_2 != null) {
						local154 = local154.aClass47_2;
					}
					local154.aClass47_2 = local151;
				}
				local66.aByte27 = (byte) (local66.aByte27 | local37);
				if (local6 && Static20.anIntArrayArray5[local30][local34] != 0) {
					local8 = Static20.anIntArrayArray5[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort83; local34 <= arg0.aShort82; local34++) {
				for (local37 = arg0.aShort81; local37 <= arg0.aShort84; local37++) {
					if (Static20.anIntArrayArray5[local34][local37] == 0) {
						Static20.anIntArrayArray5[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static282.aClass22_Sub2Array3[Static2.anInt9++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!ap;I)Ljava/lang/String;")
	public static String method4085(@OriginalArg(0) Class7_Sub3 arg0) {
		return Static354.method5698(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I")
	public static int method4087(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class7_Sub9 local15 = (Class7_Sub9) Static175.aClass10_32.method163((long) arg1);
		if (local15 == null) {
			return -1;
		} else if (arg0 >= 0 && local15.anIntArray262.length > arg0) {
			return local15.anIntArray262[arg0];
		} else {
			return -1;
		}
	}
}
