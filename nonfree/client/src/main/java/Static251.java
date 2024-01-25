import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
	public static int anInt4689;

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "Lclient!gg;")
	public static Class131_Sub1 aClass131_Sub1_1;

	@OriginalMember(owner = "client!ho", name = "D", descriptor = "Lclient!oba;")
	public static Class19_Sub1_Sub3_Sub2_Sub2 aClass19_Sub1_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)V")
	public static void method3929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class262 local28 = Static584.aClass262ArrayArrayArray2[local9][arg0][arg1] = Static584.aClass262ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class343 local33 = local28.aClass343_2; local33 != null; local33 = local33.aClass343_4) {
					@Pc(37) Class19_Sub1_Sub3 local37 = local33.aClass19_Sub1_Sub3_1;
					if (local37.aShort121 == arg0 && local37.aShort124 == arg1) {
						local37.aByte146--;
					}
				}
				if (local28.aClass19_Sub1_Sub5_1 != null) {
					local28.aClass19_Sub1_Sub5_1.aByte146--;
				}
				if (local28.aClass19_Sub1_Sub2_2 != null) {
					local28.aClass19_Sub1_Sub2_2.aByte146--;
				}
				if (local28.aClass19_Sub1_Sub2_1 != null) {
					local28.aClass19_Sub1_Sub2_1.aByte146--;
				}
				if (local28.aClass19_Sub1_Sub1_2 != null) {
					local28.aClass19_Sub1_Sub1_2.aByte146--;
				}
				if (local28.aClass19_Sub1_Sub1_1 != null) {
					local28.aClass19_Sub1_Sub1_1.aByte146--;
				}
			}
		}
		if (Static584.aClass262ArrayArrayArray2[0][arg0][arg1] == null) {
			Static584.aClass262ArrayArrayArray2[0][arg0][arg1] = new Class262(0);
			Static584.aClass262ArrayArrayArray2[0][arg0][arg1].aByte113 = 1;
		}
		Static584.aClass262ArrayArrayArray2[0][arg0][arg1].aClass262_1 = local7;
		Static584.aClass262ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method3930(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static510.method9008(-1, -1, arg1, arg0);
	}
}
