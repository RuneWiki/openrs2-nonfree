import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	public static final int anInt1283 = 1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method1072(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static125.aClass243_70.anInt6915 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static306.aClass67_3.anInt1775; local18++) {
			@Pc(25) Class40 local25 = Static306.aClass67_3.method1452(local18);
			if ((!arg1 || local25.aBoolean93) && local25.anInt1190 == -1 && local25.anInt1175 == -1 && local25.anInt1172 == 0 && local25.aString5.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static244.aShortArray63 = null;
					Static52.anInt930 = -1;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(73) short[] local73 = new short[local14.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local16; local75++) {
						local73[local75] = local14[local75];
					}
					local14 = local73;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static52.anInt930 = local16;
		Static244.aShortArray63 = local14;
		Static15.anInt343 = 0;
		@Pc(113) String[] local113 = new String[Static52.anInt930];
		for (@Pc(115) int local115 = 0; local115 < Static52.anInt930; local115++) {
			local113[local115] = Static306.aClass67_3.method1452(local14[local115]).aString5;
		}
		Static258.method3329(local113, Static244.aShortArray63);
		Static125.aClass243_70.method5452();
		Static125.aClass243_70.anInt6915 = 2;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BII)Lclient!lb;")
	public static Class5_Sub2_Sub9 method1073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class5_Sub2_Sub9 local20 = (Class5_Sub2_Sub9) Static80.aClass252_10.method5659((long) arg1 | (long) arg0 << 32);
		if (local20 == null) {
			local20 = new Class5_Sub2_Sub9(arg0, arg1);
			Static80.aClass252_10.method5658(local20, local20.aLong234);
		}
		return local20;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method1076() {
		if (Static80.aClass191_1 != null) {
			Static80.aClass191_1.method5005();
		}
		if (Static152.aClass191_2 != null) {
			Static152.aClass191_2.method5005();
		}
	}
}
