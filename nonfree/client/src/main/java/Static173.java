import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
	public static int anInt3444;

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
	public static int anInt3449;

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "Lclient!aj;")
	public static Class15 aClass15_52;

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
	public static int anInt3446 = 0;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	public static void method3145() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static607.aClass89Array1[local3] = null;
		}
		Static223.anInt4198 = 0;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(BI)Lclient!hs;")
	public static Class143 method3146(@OriginalArg(1) int arg0) {
		@Pc(10) Class143 local10 = (Class143) Static578.aClass165_65.method4389((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static512.aClass15_129.method517(arg0, 0);
		local10 = new Class143();
		if (local25 != null) {
			local10.method3920(new Class3_Sub25(local25), arg0);
		}
		Static578.aClass165_65.method4392(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;IZI)V")
	public static void method3148(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static474.aClass15_121.anInt425 = 1;
		@Pc(11) String local11 = arg2.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(26) Class322 local26 = Static467.aClass367_1.method8812(arg3);
			if (local26 == null || arg4 != local26.method7885()) {
				return;
			}
			if (local26.method7885()) {
				local18 = local26.aString106;
			} else {
				local16 = local26.anInt9033;
			}
		}
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static170.aClass370_1.anInt10161; local58++) {
			@Pc(65) Class374 local65 = Static170.aClass370_1.method8900(local58);
			if ((!arg1 || local65.aBoolean777) && local65.anInt10284 == -1 && local65.anInt10299 == -1 && local65.anInt10306 == -1 && local65.anInt10334 == 0 && local65.aString121.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg4) {
						if (!arg0.equals(local65.method8996(arg3, local18))) {
							continue;
						}
					} else if (local65.method8997(local16, arg3) != arg5) {
						continue;
					}
				}
				if (local56 >= 250) {
					Static478.anInt7943 = -1;
					Static436.aShortArray104 = null;
					return;
				}
				if (local56 >= local14.length) {
					@Pc(145) short[] local145 = new short[local14.length * 2];
					for (@Pc(147) int local147 = 0; local147 < local56; local147++) {
						local145[local147] = local14[local147];
					}
					local14 = local145;
				}
				local14[local56++] = (short) local58;
			}
		}
		Static436.aShortArray104 = local14;
		Static478.anInt7943 = local56;
		Static492.anInt8115 = 0;
		@Pc(185) String[] local185 = new String[Static478.anInt7943];
		for (@Pc(187) int local187 = 0; local187 < Static478.anInt7943; local187++) {
			local185[local187] = Static170.aClass370_1.method8900(local14[local187]).aString121;
		}
		Static128.method2420(local185, Static436.aShortArray104);
		Static474.aClass15_121.method541();
		Static474.aClass15_121.anInt425 = 2;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3149(@OriginalArg(0) String arg0) {
		if (Static41.aClass189Array1 != null) {
			@Pc(15) Class3_Sub34 local15 = Static172.method3123(Static163.aClass375_1, Static24.aClass218_3);
			local15.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(arg0));
			local15.aClass3_Sub25_Sub1_2.method8583(arg0);
			Static441.method6275(local15);
		}
	}
}
