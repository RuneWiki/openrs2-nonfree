import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "I")
	public static int anInt3825;

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "Lclient!wa;")
	public static final Class354 aClass354_17 = new Class354(64);

	@OriginalMember(owner = "client!hv", name = "E", descriptor = "Lclient!ps;")
	public static final Class262 aClass262_9 = new Class262(10, 19);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method3412(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static403.anInt6982;
		@Pc(9) int[] local9 = Static430.anIntArray447;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class41_Sub2_Sub1_Sub4_Sub2 local21 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local9[local13]];
			if (local21 != null && Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 != local21 && local21.aString95 != null && local21.aString95.equalsIgnoreCase(arg0)) {
				local11 = true;
				@Pc(68) Class3_Sub42 local68;
				if (arg1 == 1) {
					local68 = Static591.method7910(Static9.aClass199_3, Static63.aClass303_19);
					local68.aClass3_Sub11_Sub1_1.method5213(0);
					local68.aClass3_Sub11_Sub1_1.method5167(local9[local13]);
					Static511.method6885(local68);
				} else if (arg1 == 4) {
					local68 = Static591.method7910(Static9.aClass199_3, Static435.aClass303_77);
					local68.aClass3_Sub11_Sub1_1.method5177(0);
					local68.aClass3_Sub11_Sub1_1.method5201(local9[local13]);
					Static511.method6885(local68);
				} else if (arg1 == 5) {
					local68 = Static591.method7910(Static9.aClass199_3, Static71.aClass303_21);
					local68.aClass3_Sub11_Sub1_1.method5200(local9[local13]);
					local68.aClass3_Sub11_Sub1_1.method5188(0);
					Static511.method6885(local68);
				} else if (arg1 == 6) {
					local68 = Static591.method7910(Static9.aClass199_3, Static586.aClass303_28);
					local68.aClass3_Sub11_Sub1_1.method5170(0);
					local68.aClass3_Sub11_Sub1_1.method5200(local9[local13]);
					Static511.method6885(local68);
				} else if (arg1 == 7) {
					local68 = Static591.method7910(Static9.aClass199_3, Static526.aClass303_94);
					local68.aClass3_Sub11_Sub1_1.method5201(local9[local13]);
					local68.aClass3_Sub11_Sub1_1.method5170(0);
					Static511.method6885(local68);
				}
				break;
			}
		}
		if (!local11) {
			Static550.method7295(Static544.aClass343_25.method7222(Static256.anInt4535) + arg0);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3413(@OriginalArg(0) String arg0) {
		Static180.method3112(arg0, "", "", 0, 0, "");
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BIIII)I")
	public static int method3414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class356.anIntArray598[arg0 * 8192 / arg2] >> 1;
		return (arg3 * local21 >> 16) + (arg1 * (65536 - local21) >> 16);
	}
}
