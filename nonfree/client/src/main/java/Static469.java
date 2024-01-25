import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!saa", name = "v", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_125 = new Class276(26, 0);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BLclient!fd;Lclient!ufa;I)V")
	public static void method7212(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) Class326 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub3 local12 = new Class3_Sub3();
		local12.anInt610 = arg0.method6538();
		local12.anInt607 = arg0.method6497();
		local12.anIntArray14 = new int[local12.anInt610];
		local12.anIntArray13 = new int[local12.anInt610];
		local12.anIntArray12 = new int[local12.anInt610];
		local12.aClass66Array2 = new Class66[local12.anInt610];
		local12.aByteArrayArrayArray1 = new byte[local12.anInt610][][];
		local12.aClass66Array1 = new Class66[local12.anInt610];
		for (@Pc(54) int local54 = 0; local54 < local12.anInt610; local54++) {
			try {
				@Pc(59) int local59 = arg0.method6538();
				@Pc(75) String local75;
				@Pc(79) String local79;
				@Pc(81) int local81;
				if (local59 == 0 || local59 == 1 || local59 == 2) {
					local75 = arg0.method6536();
					local79 = arg0.method6536();
					local81 = 0;
					if (local59 == 1) {
						local81 = arg0.method6497();
					}
					local12.anIntArray13[local54] = local59;
					local12.anIntArray12[local54] = local81;
					local12.aClass66Array2[local54] = arg1.method7796(Static99.method2136(local75), local79);
				} else if (local59 == 3 || local59 == 4) {
					local75 = arg0.method6536();
					local79 = arg0.method6536();
					local81 = arg0.method6538();
					@Pc(131) String[] local131 = new String[local81];
					for (@Pc(133) int local133 = 0; local133 < local81; local133++) {
						local131[local133] = arg0.method6536();
					}
					@Pc(147) byte[][] local147 = new byte[local81][];
					@Pc(157) int local157;
					if (local59 == 3) {
						for (@Pc(152) int local152 = 0; local152 < local81; local152++) {
							local157 = arg0.method6497();
							local147[local152] = new byte[local157];
							arg0.method6540(local147[local152], local157);
						}
					}
					local12.anIntArray13[local54] = local59;
					@Pc(186) Class[] local186 = new Class[local81];
					for (local157 = 0; local157 < local81; local157++) {
						local186[local157] = Static99.method2136(local131[local157]);
					}
					local12.aClass66Array1[local54] = arg1.method7791(local79, Static99.method2136(local75), local186);
					local12.aByteArrayArrayArray1[local54] = local147;
				}
			} catch (@Pc(224) ClassNotFoundException local224) {
				local12.anIntArray14[local54] = -1;
			} catch (@Pc(231) SecurityException local231) {
				local12.anIntArray14[local54] = -2;
			} catch (@Pc(238) NullPointerException local238) {
				local12.anIntArray14[local54] = -3;
			} catch (@Pc(245) Exception local245) {
				local12.anIntArray14[local54] = -4;
			} catch (@Pc(252) Throwable local252) {
				local12.anIntArray14[local54] = -5;
			}
		}
		Static226.aClass183_27.method4792(local12);
	}
}
