import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_25 = new Class211(28, -2);

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_26 = new Class211(70, -1);

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_34 = new Class48(62, 7);

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!gp;")
	public static final Class94 aClass94_3 = new Class94("runescape", 0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
	public static void method970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static25.aClass132ArrayArrayArray1[0][arg1][arg2] != null && Static25.aClass132ArrayArrayArray1[0][arg1][arg2].aClass132_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static25.aClass132ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class132 local46 = Static25.aClass132ArrayArrayArray1[local22][arg1][arg2] = new Class132(local22, arg1, arg2);
				if (local20) {
					local46.aByte47++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Lclient!fc;")
	public static Class79 method971(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static353.aFloat15 == 3.0D) {
				return Static121.aClass79_4;
			}
			if ((double) Static353.aFloat15 == 4.0D) {
				return Static89.aClass79_3;
			}
			if ((double) Static353.aFloat15 == 6.0D) {
				return Static213.aClass79_7;
			}
			if ((double) Static353.aFloat15 >= 8.0D) {
				return Static38.aClass79_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static353.aFloat15 == 3.0D) {
				return Static213.aClass79_7;
			}
			if ((double) Static353.aFloat15 == 4.0D) {
				return Static38.aClass79_1;
			}
			if ((double) Static353.aFloat15 == 6.0D) {
				return Static188.aClass79_5;
			}
			if ((double) Static353.aFloat15 >= 8.0D) {
				return Static85.aClass79_2;
			}
		} else if (arg0 == 2) {
			if ((double) Static353.aFloat15 == 3.0D) {
				return Static188.aClass79_5;
			}
			if ((double) Static353.aFloat15 == 4.0D) {
				return Static85.aClass79_2;
			}
			if ((double) Static353.aFloat15 == 6.0D) {
				return Static270.aClass79_8;
			}
			if ((double) Static353.aFloat15 >= 8.0D) {
				return Static203.aClass79_6;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public static void method975() {
		Static203.anInt3552 = 0;
		@Pc(13) int local13 = (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >> 7) + Static256.anInt4410;
		@Pc(20) int local20 = (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >> 7) + Static293.anInt5053;
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static203.anInt3552 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static203.anInt3552 = 1;
		}
		if (Static203.anInt3552 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static203.anInt3552 = 0;
		}
	}
}
