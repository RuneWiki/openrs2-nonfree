import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_96 = new Class71(116, 2);

	@OriginalMember(owner = "client!oca", name = "v", descriptor = "[I")
	public static final int[] anIntArray407 = new int[14];

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method6168(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg0 ? Static105.aClass49_1.anInt1953 : Static105.aClass49_1.anInt1949);
		@Pc(75) int local75;
		for (@Pc(32) int local32 = local19; local32 < local30; local32++) {
			@Pc(39) Class8_Sub5_Sub17 local39 = Static105.aClass49_1.method1677(local32);
			if (local39.aBoolean668 && local39.method7705().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static621.aShortArray148 = null;
					Static474.anInt8507 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local32;
			}
		}
		Static474.anInt8507 = local13;
		Static621.aShortArray148 = local11;
		Static169.anInt4129 = 0;
		@Pc(116) String[] local116 = new String[Static474.anInt8507];
		for (local75 = 0; local75 < Static474.anInt8507; local75++) {
			local116[local75] = Static105.aClass49_1.method1677(local11[local75]).method7705();
		}
		Static290.method4842(Static621.aShortArray148, local116);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(II[BZ)I")
	public static int method6172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg0; local14++) {
			local12 = Class122.anIntArray238[(local12 ^ arg2[local14]) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}
}
