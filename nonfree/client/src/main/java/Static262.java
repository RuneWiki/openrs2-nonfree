import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "[I")
	public static int[] anIntArray269;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_43 = new Class240(8, -1);

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "[I")
	public static final int[] anIntArray270 = new int[1];

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!td;B)Ljava/lang/String;")
	public static String method3910(@OriginalArg(0) Class3_Sub5_Sub18 arg0) {
		if (arg0.aString104 == null || arg0.aString104.length() == 0) {
			return arg0.aString106 == null || arg0.aString106.length() <= 0 ? arg0.aString105 : arg0.aString105 + Static114.aClass84_32.method1729(Static654.anInt10668) + arg0.aString106;
		} else if (arg0.aString106 == null || arg0.aString106.length() <= 0) {
			return arg0.aString105 + Static114.aClass84_32.method1729(Static654.anInt10668) + arg0.aString104;
		} else {
			return arg0.aString105 + Static114.aClass84_32.method1729(Static654.anInt10668) + arg0.aString106 + Static114.aClass84_32.method1729(Static654.anInt10668) + arg0.aString104;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
	public static void method3911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class368 local28 = Static254.aClass368ArrayArrayArray2[local9][arg0][arg1] = Static254.aClass368ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class205 local33 = local28.aClass205_4; local33 != null; local33 = local33.aClass205_3) {
					@Pc(37) Class34_Sub1_Sub1 local37 = local33.aClass34_Sub1_Sub1_1;
					if (local37.aShort98 == arg0 && local37.aShort99 == arg1) {
						local37.aByte132--;
					}
				}
				if (local28.aClass34_Sub1_Sub2_1 != null) {
					local28.aClass34_Sub1_Sub2_1.aByte132--;
				}
				if (local28.aClass34_Sub1_Sub5_2 != null) {
					local28.aClass34_Sub1_Sub5_2.aByte132--;
				}
				if (local28.aClass34_Sub1_Sub5_1 != null) {
					local28.aClass34_Sub1_Sub5_1.aByte132--;
				}
				if (local28.aClass34_Sub1_Sub3_1 != null) {
					local28.aClass34_Sub1_Sub3_1.aByte132--;
				}
				if (local28.aClass34_Sub1_Sub3_2 != null) {
					local28.aClass34_Sub1_Sub3_2.aByte132--;
				}
			}
		}
		if (Static254.aClass368ArrayArrayArray2[0][arg0][arg1] == null) {
			Static254.aClass368ArrayArrayArray2[0][arg0][arg1] = new Class368(0);
			Static254.aClass368ArrayArrayArray2[0][arg0][arg1].aByte143 = 1;
		}
		Static254.aClass368ArrayArrayArray2[0][arg0][arg1].aClass368_1 = local7;
		Static254.aClass368ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)V")
	public static void method3912(@OriginalArg(0) int arg0) {
		Static426.anInt6954 = -1;
		if (arg0 == 37) {
			Static671.aFloat182 = 3.0F;
		} else if (arg0 == 50) {
			Static671.aFloat182 = 4.0F;
		} else if (arg0 == 75) {
			Static671.aFloat182 = 6.0F;
		} else if (arg0 == 100) {
			Static671.aFloat182 = 8.0F;
		} else if (arg0 == 200) {
			Static671.aFloat182 = 16.0F;
		}
		Static426.anInt6954 = -1;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(IB)V")
	public static void method3913(@OriginalArg(0) int arg0) {
		Static599.anInt7771 = arg0;
		@Pc(13) Class295 local13 = Static582.aClass295_66;
		synchronized (Static582.aClass295_66) {
			Static582.aClass295_66.method6464();
		}
	}
}
