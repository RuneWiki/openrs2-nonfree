import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIII)V")
	public static void method6265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class6_Sub4_Sub18 local11 = Static565.method7924((long) arg3, 10);
		local11.method7976();
		local11.anInt9463 = arg2;
		local11.anInt9466 = arg1;
		local11.anInt9464 = arg0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method6267(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static475.anInt8165;
		@Pc(9) int[] local9 = Static75.anIntArray82;
		@Pc(11) boolean local11 = false;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class2_Sub1_Sub1_Sub3_Sub1 local25 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local9[local17]];
			if (local25 != null && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 != local25 && local25.aString45 != null && local25.aString45.equalsIgnoreCase(arg0)) {
				local11 = true;
				@Pc(62) Class6_Sub26 local62;
				if (arg1 == 1) {
					local62 = Static268.method3981(Static377.aClass15_2, Static441.aClass289_107);
					local62.aClass6_Sub23_Sub1_2.method8366(0);
					local62.aClass6_Sub23_Sub1_2.method8405(local9[local17]);
					Static670.method9077(local62);
				} else if (arg1 == 4) {
					local62 = Static268.method3981(Static377.aClass15_2, Static221.aClass289_55);
					local62.aClass6_Sub23_Sub1_2.method8338(local9[local17]);
					local62.aClass6_Sub23_Sub1_2.method8362(0);
					Static670.method9077(local62);
				} else if (arg1 == 5) {
					local62 = Static268.method3981(Static377.aClass15_2, Static372.aClass289_88);
					local62.aClass6_Sub23_Sub1_2.method8347(local9[local17]);
					local62.aClass6_Sub23_Sub1_2.method8396(0);
					Static670.method9077(local62);
				} else if (arg1 == 6) {
					local62 = Static268.method3981(Static377.aClass15_2, Static540.aClass289_129);
					local62.aClass6_Sub23_Sub1_2.method8342(local9[local17]);
					local62.aClass6_Sub23_Sub1_2.method8396(0);
					Static670.method9077(local62);
				} else if (arg1 == 7) {
					local62 = Static268.method3981(Static377.aClass15_2, Static650.aClass289_150);
					local62.aClass6_Sub23_Sub1_2.method8366(0);
					local62.aClass6_Sub23_Sub1_2.method8405(local9[local17]);
					Static670.method9077(local62);
				} else if (arg1 == 9) {
					local62 = Static268.method3981(Static377.aClass15_2, Static565.aClass289_136);
					local62.aClass6_Sub23_Sub1_2.method8338(local9[local17]);
					local62.aClass6_Sub23_Sub1_2.method8349(0);
					Static670.method9077(local62);
				}
				break;
			}
		}
		if (!local11) {
			Static270.method3991(Static52.aClass41_21.method1007(Static616.anInt10077) + arg0);
		}
	}
}
