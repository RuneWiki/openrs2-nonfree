import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!k", name = "t", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString59 = null;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	public static void method4827() {
		Static473.aClass75_14.method6660(Static496.aFloat163, Static255.aFloat98, Static548.aFloat178);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!rfa;Z[[[BIB)Z")
	public static boolean method4829(@OriginalArg(0) Class60_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static681.aBoolean769) {
			return false;
		}
		@Pc(9) int local9 = arg0.anInt9048 >> Static594.anInt9440;
		@Pc(11) int local11 = local9;
		@Pc(16) int local16 = arg0.anInt9057 >> Static594.anInt9440;
		@Pc(18) int local18 = local16;
		if (arg0 instanceof Class60_Sub1_Sub1) {
			local11 = ((Class60_Sub1_Sub1) arg0).aShort101;
			local18 = ((Class60_Sub1_Sub1) arg0).aShort99;
			local9 = ((Class60_Sub1_Sub1) arg0).aShort100;
			local16 = ((Class60_Sub1_Sub1) arg0).aShort102;
		}
		for (@Pc(39) int local39 = local9; local39 <= local11; local39++) {
			for (@Pc(42) int local42 = local16; local42 <= local18; local42++) {
				if (arg0.aByte134 < Static66.anInt802 && local39 >= Static599.anInt5622 && local39 < Static199.anInt4052 && local42 >= Static115.anInt2266 && local42 < Static636.anInt9920) {
					if ((arg2 == null || arg0.aByte135 < arg3 || arg2[arg0.aByte135][local39][local42] != arg4) && arg0.method7912() && !arg0.method7925(Static277.aClass75_7)) {
						return false;
					}
					if (!arg1 && local39 >= Static506.anInt8446 - 16 && local39 <= Static506.anInt8446 + 16 && local42 >= Static676.anInt10368 - 16 && local42 <= Static676.anInt10368 + 16) {
						if (Static398.aBoolean515) {
							Static489.aClass15Array1[Static655.anInt10166++].method202(arg0);
							Static655.anInt10166 %= Static243.anInt4677;
						} else {
							arg0.method7909(Static277.aClass75_7, 0);
						}
					}
				}
			}
		}
		return true;
	}
}
