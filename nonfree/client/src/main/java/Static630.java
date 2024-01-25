import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!vg", name = "O", descriptor = "Lclient!eba;")
	public static final Class98 aClass98_9 = new Class98();

	@OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
	public static int anInt10252 = -1;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)I")
	public static int method8820(@OriginalArg(0) boolean arg0) {
		if (Static351.anIntArray339 == null) {
			return 0;
		} else if (arg0 || Static344.aClass81Array1 == null) {
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < Static351.anIntArray339.length; local33++) {
				@Pc(41) int local41 = Static351.anIntArray339[local33];
				if (Static341.aClass208_75.method4977(local41)) {
					local31++;
				}
				if (Static367.aClass208_140.method4977(local41)) {
					local31++;
				}
			}
			return local31;
		} else {
			return Static351.anIntArray339.length * 2;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "()V")
	public static void method8821() {
		for (@Pc(1) int local1 = Static89.anInt1507; local1 < Static490.anInt9715; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static328.anInt5870; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static526.anInt8863; local7++) {
					@Pc(16) Class174 local16 = Static260.aClass174ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class8_Sub1_Sub4 local21 = local16.aClass8_Sub1_Sub4_2;
						@Pc(24) Class8_Sub1_Sub4 local24 = local16.aClass8_Sub1_Sub4_1;
						if (local21 != null && local21.method8899((byte) 94)) {
							Static418.method6240(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8899((byte) 94)) {
								Static418.method6240(local24, local1, local4, local7, 1, 1);
								local24.method8901(local21, 0, false, 0, 0, Static205.aClass57_5);
								local24.method8898(-38);
							}
							local21.method8898(-38);
						}
						for (@Pc(76) Class273 local76 = local16.aClass273_67; local76 != null; local76 = local76.aClass273_114) {
							@Pc(80) Class8_Sub1_Sub3 local80 = local76.aClass8_Sub1_Sub3_1;
							if (local80 != null && local80.method8899((byte) 94)) {
								Static418.method6240(local80, local1, local4, local7, local80.aShort110 + 1 - local80.aShort109, local80.aShort107 - local80.aShort108 + 1);
								local80.method8898(-38);
							}
						}
						@Pc(120) Class8_Sub1_Sub1 local120 = local16.aClass8_Sub1_Sub1_1;
						if (local120 != null && local120.method8899((byte) 94)) {
							Static207.method2973(local120, local1, local4, local7);
							local120.method8898(-38);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
	public static void method8823() {
		if (Static440.anInt7528 <= 0) {
			Static497.aString134 = "";
			return;
		}
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < Static117.aStringArray15.length; local22++) {
			if (Static117.aStringArray15[local22].indexOf("--> ") != -1) {
				local20++;
				if (local20 == Static440.anInt7528) {
					Static497.aString134 = Static117.aStringArray15[local22].substring(Static117.aStringArray15[local22].indexOf(">") + 2);
					return;
				}
			}
		}
	}
}
