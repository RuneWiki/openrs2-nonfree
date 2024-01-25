import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "Lclient!n;")
	public static Class72 aClass72_2;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
	public static int anInt2426 = -1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method2201(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static258.aClass38_38.anInt1056 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static139.aClass193_1.anInt5591; local18++) {
			@Pc(25) Class274 local25 = Static139.aClass193_1.method4650(local18);
			if ((!arg1 || local25.aBoolean579) && local25.anInt7893 == -1 && local25.anInt7924 == -1 && local25.anInt7867 == 0 && local25.aString82.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static148.aShortArray90 = null;
					Static412.anInt7173 = -1;
					return;
				}
				if (local14.length <= local16) {
					@Pc(75) short[] local75 = new short[local14.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local16; local77++) {
						local75[local77] = local14[local77];
					}
					local14 = local75;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static412.anInt7173 = local16;
		Static253.anInt4882 = 0;
		Static148.aShortArray90 = local14;
		@Pc(119) String[] local119 = new String[Static412.anInt7173];
		for (@Pc(121) int local121 = 0; local121 < Static412.anInt7173; local121++) {
			local119[local121] = Static139.aClass193_1.method4650(local14[local121]).aString82;
		}
		Static319.method4776(Static148.aShortArray90, local119);
		Static258.aClass38_38.method1036();
		Static258.aClass38_38.anInt1056 = 2;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ha;BLclient!ha;)V")
	public static void method2203(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg0.aClass4_270 != null) {
			arg0.method6330();
		}
		arg0.aClass4_269 = arg1;
		arg0.aClass4_270 = arg1.aClass4_270;
		arg0.aClass4_270.aClass4_269 = arg0;
		arg0.aClass4_269.aClass4_270 = arg0;
	}
}
