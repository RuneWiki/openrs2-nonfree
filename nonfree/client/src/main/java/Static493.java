import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "Lclient!sb;")
	public static Class296 aClass296_4;

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString228 = null;

	@OriginalMember(owner = "client!sn", name = "A", descriptor = "[I")
	public static final int[] anIntArray505 = new int[13];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZZ)V")
	public static void method6636() {
		@Pc(18) Class3_Sub10 local18 = Static129.method2403(Static452.aClass353_2, Static28.aClass287_7);
		Static193.method3398(local18);
		for (@Pc(26) Class3_Sub49 local26 = (Class3_Sub49) Static204.aClass297_16.method6529(); local26 != null; local26 = (Class3_Sub49) Static204.aClass297_16.method6532()) {
			if (!local26.method8129()) {
				local26 = (Class3_Sub49) Static204.aClass297_16.method6529();
				if (local26 == null) {
					break;
				}
			}
			if (local26.anInt9245 == 0) {
				Static46.method1171(true, true, local26);
			}
		}
		if (Static463.aClass251_12 != null) {
			Static588.method8016(Static463.aClass251_12);
			Static463.aClass251_12 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method6637(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(24) int local24 = arg0 ? 32768 : 0;
		@Pc(35) int local35 = local24 + (arg0 ? Static212.aClass294_3.anInt8225 : Static212.aClass294_3.anInt8224);
		for (@Pc(37) int local37 = local24; local37 < local35; local37++) {
			@Pc(44) Class3_Sub7_Sub8 local44 = Static212.aClass294_3.method6455(local37);
			if (local44.aBoolean265 && local44.method3050().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static214.aShortArray72 = null;
					Static121.anInt2822 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local37;
			}
		}
		Static121.anInt2822 = local13;
		Static495.anInt8603 = 0;
		Static214.aShortArray72 = local11;
		@Pc(112) String[] local112 = new String[Static121.anInt2822];
		for (@Pc(114) int local114 = 0; local114 < Static121.anInt2822; local114++) {
			local112[local114] = Static212.aClass294_3.method6455(local11[local114]).method3050();
		}
		Static524.method7241(local112, Static214.aShortArray72);
	}
}
