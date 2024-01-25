import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "Lclient!j;")
	public static final Class153 aClass153_52 = new Class153("LIVE", 0);

	@OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
	public static int anInt3775 = 0;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)Z")
	public static boolean method3048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(ILjava/lang/String;I)V")
	public static void method3054(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static31.anInt499;
		@Pc(13) int[] local13 = Static315.anIntArray279;
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local11; local17++) {
			@Pc(25) Class25_Sub2_Sub2_Sub5_Sub1 local25 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local13[local17]];
			if (local25 != null && local25 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 && local25.aString183 != null && local25.aString183.equalsIgnoreCase(arg0)) {
				@Pc(50) Class3_Sub10 local50;
				if (arg1 == 1) {
					local50 = Static129.method2403(Static452.aClass353_2, Static115.aClass287_43);
					local50.aClass3_Sub26_Sub1_1.method6809(0);
					local50.aClass3_Sub26_Sub1_1.method6820(local13[local17]);
					Static193.method3398(local50);
				} else if (arg1 == 4) {
					local50 = Static129.method2403(Static452.aClass353_2, Static515.aClass287_140);
					local50.aClass3_Sub26_Sub1_1.method6820(local13[local17]);
					local50.aClass3_Sub26_Sub1_1.method6780(0);
					Static193.method3398(local50);
				} else if (arg1 == 5) {
					local50 = Static129.method2403(Static452.aClass353_2, Static456.aClass287_130);
					local50.aClass3_Sub26_Sub1_1.method6796(0);
					local50.aClass3_Sub26_Sub1_1.method6820(local13[local17]);
					Static193.method3398(local50);
				} else if (arg1 == 6) {
					local50 = Static129.method2403(Static452.aClass353_2, Static323.aClass287_98);
					local50.aClass3_Sub26_Sub1_1.method6809(0);
					local50.aClass3_Sub26_Sub1_1.method6769(local13[local17]);
					Static193.method3398(local50);
				} else if (arg1 == 7) {
					local50 = Static129.method2403(Static452.aClass353_2, Static50.aClass287_22);
					local50.aClass3_Sub26_Sub1_1.method6769(local13[local17]);
					local50.aClass3_Sub26_Sub1_1.method6809(0);
					Static193.method3398(local50);
				}
				local15 = true;
				break;
			}
		}
		if (!local15) {
			Static260.method4014(Static573.aClass350_25.method7730(Static201.anInt4321) + arg0);
		}
	}
}
