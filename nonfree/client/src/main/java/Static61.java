import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!bd;")
	public static Class21 aClass21_4;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_18 = new Class183(49, 16);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!oj;)V")
	public static void method1154(@OriginalArg(1) Class48 arg0) {
		@Pc(7) int local7 = Static30.anInt453;
		@Pc(9) int local9 = Static92.anInt1974;
		@Pc(11) int local11 = Static392.anInt7142;
		@Pc(13) int local13 = Static10.anInt6517;
		arg0.method2509(local13, local11, local9, -10660793, local7);
		arg0.method2509(16, local11 - 2, local9 + 1, -16777216, local7 + 1);
		arg0.method2484(local13 - 19, local7 + 1, local11 - 2, -16777216, local9 + 18);
		Static180.aClass44_4.method4652(-1, local9 + 14, local7 + 3, -10660793, Static148.aClass62_108.method1389(Static200.anInt4144));
		@Pc(80) int local80 = Static136.aClass91_2.method5223();
		@Pc(84) int local84 = Static136.aClass91_2.method5224();
		@Pc(86) int local86 = 0;
		for (@Pc(91) Class2_Sub43 local91 = (Class2_Sub43) Static262.aClass238_29.method5795(); local91 != null; local91 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
			@Pc(106) int local106 = local9 + (Static233.anInt4642 + -1 + -local86) * 16 + 31;
			@Pc(108) short local108 = -1;
			if (local7 < local80 && local7 + local11 > local80 && local84 > local106 - 13 && local84 < local106 + 3 && local91.aBoolean509) {
				local108 = -256;
			}
			@Pc(146) int[] local146 = null;
			if (Static102.method1833(local91.anInt7126)) {
				local146 = Static57.aClass196_1.method4827((int) local91.aLong212).anIntArray314;
			} else if (local91.anInt7124 != -1) {
				local146 = Static57.aClass196_1.method4827(local91.anInt7124).anIntArray314;
			} else if (Static379.method5976(local91.anInt7126)) {
				@Pc(184) Class1_Sub2_Sub1_Sub2 local184 = Static223.aClass1_Sub2_Sub1_Sub2Array1[(int) local91.aLong212];
				if (local184 != null) {
					@Pc(189) Class197 local189 = local184.aClass197_1;
					if (local189.anIntArray468 != null) {
						local189 = local189.method4832(Static179.aClass115_1);
					}
					if (local189 != null) {
						local146 = local189.anIntArray467;
					}
				}
			} else if (Static54.method845(local91.anInt7126)) {
				@Pc(221) Class47 local221;
				if (local91.anInt7126 == 1004) {
					local221 = Static230.aClass96_4.method2303((int) local91.aLong212);
				} else {
					local221 = Static230.aClass96_4.method2303((int) (local91.aLong212 >>> 32 & 0x7FFFFFFFL));
				}
				if (local221.anIntArray95 != null) {
					local221 = local221.method903(Static179.aClass115_1);
				}
				if (local221 != null) {
					local146 = local221.anIntArray93;
				}
			}
			@Pc(250) String local250 = Static264.method3357(local91);
			if (local146 != null) {
				local250 = local250 + Static350.method5582(local146);
			}
			Static180.aClass44_4.method4658(Static315.aClass27Array51, local250, local108, local7 + 3, local106, Static2.anIntArray588);
			if (local91.aBoolean510) {
				Static62.aClass27_19.method5318(local7 + Static121.aClass24_10.method325(local250) + 5, local106 - 12);
			}
			local86++;
		}
		Static108.method1962(Static392.anInt7142, Static92.anInt1974, Static10.anInt6517, Static30.anInt453);
	}
}
