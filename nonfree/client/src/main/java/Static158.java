import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public static int anInt3032;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!tm;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	public static int anInt3041 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2850(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static81.aClass171_29.anInt4076 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static15.aClass81_1.anInt2148; local18++) {
			@Pc(25) Class179 local25 = Static15.aClass81_1.method2175(local18);
			if ((!arg0 || local25.aBoolean333) && local25.anInt4398 == -1 && local25.anInt4404 == -1 && local25.anInt4395 == 0 && local25.aString51.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static161.aShortArray53 = null;
					Static264.anInt4609 = -1;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(77) short[] local77 = new short[local14.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local16; local79++) {
						local77[local79] = local14[local79];
					}
					local14 = local77;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static264.anInt4609 = local16;
		Static235.anInt4194 = 0;
		Static161.aShortArray53 = local14;
		@Pc(117) String[] local117 = new String[Static264.anInt4609];
		for (@Pc(119) int local119 = 0; local119 < Static264.anInt4609; local119++) {
			local117[local119] = Static15.aClass81_1.method2175(local14[local119]).aString51;
		}
		Static280.method4257(local117, Static161.aShortArray53);
		Static81.aClass171_29.method3763();
		Static81.aClass171_29.anInt4076 = 2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!fo;)V")
	public static void method2855(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(14) int local14 = 0;
		if (Static253.anInt4469 < arg1.anInt6412) {
			Static334.method4935(arg1);
		} else if (arg1.anInt6441 < Static253.anInt4469) {
			Static376.method5493(false, arg1);
			local7 = Static38.anInt806;
			local14 = Static209.anInt3826;
		} else {
			Static360.method5253(arg1);
		}
		if (arg1.anInt6390 < 128 || arg1.anInt6386 < 128 || Static246.anInt4374 * 128 - 128 <= arg1.anInt6390 || arg1.anInt6386 >= (Static185.anInt3485 - 1) * 128) {
			arg1.anInt6441 = 0;
			arg1.anInt6412 = 0;
			arg1.anInt6405 = -1;
			local7 = -1;
			local14 = 0;
			arg1.anInt6420 = -1;
			arg1.anInt6390 = arg1.anIntArray1324[0] * 128 + arg1.method5547() * 64;
			arg1.anInt6386 = arg1.anIntArray1323[0] * 128 + arg1.method5547() * 64;
			arg1.method5555();
		}
		if (Static206.aClass1_Sub5_Sub1_Sub1_1 == arg1 && (arg1.anInt6390 < 1536 || arg1.anInt6386 < 1536 || Static246.anInt4374 * 128 - 1536 <= arg1.anInt6390 || arg1.anInt6386 >= (Static185.anInt3485 - 12) * 128)) {
			arg1.anInt6405 = -1;
			local14 = 0;
			arg1.anInt6412 = 0;
			local7 = -1;
			arg1.anInt6420 = -1;
			arg1.anInt6441 = 0;
			arg1.anInt6390 = arg1.anIntArray1324[0] * 128 + arg1.method5547() * 64;
			arg1.anInt6386 = arg1.anIntArray1323[0] * 128 + arg1.method5547() * 64;
			arg1.method5555();
		}
		@Pc(218) int local218 = Static367.method5423(arg1);
		Static131.method2588(arg1, local14, local7, local218);
		Static38.method689(arg1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2856(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
