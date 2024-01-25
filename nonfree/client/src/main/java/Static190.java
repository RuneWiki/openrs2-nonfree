import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	public static int anInt3819 = 0;

	@OriginalMember(owner = "client!gp", name = "E", descriptor = "Lclient!pha;")
	public static final Class256 aClass256_2 = new Class256();

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_64 = new Class268(42, -2);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIILclient!ka;Lclient!ha;IILclient!ao;III)Lclient!ka;")
	public static Class24 method3385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(7) Class100 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class21 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg5 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg9 != null) {
			local11 = arg9.method352(arg10, false, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(51) long local51 = ((long) arg2 << 48) + (long) ((arg11 << 24) + arg3 + (arg12 << 16)) + ((long) arg7 << 32);
		@Pc(53) Class166 local53 = Static201.aClass166_20;
		@Pc(61) Class24 local61;
		synchronized (Static201.aClass166_20) {
			local61 = (Class24) Static201.aClass166_20.method4805(local51);
		}
		if (local61 == null || arg6.method8821(local61.ua(), local11) != 0) {
			if (local61 != null) {
				local11 = arg6.method8820(local11, local61.ua());
			}
			@Pc(90) byte local90;
			if (arg3 == 1) {
				local90 = 9;
			} else if (arg3 == 2) {
				local90 = 12;
			} else if (arg3 == 3) {
				local90 = 15;
			} else if (arg3 == 4) {
				local90 = 18;
			} else {
				local90 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(148) Class64 local148 = new Class64(local90 * 3 + 1, -local90 + local90 * 6, 0);
			@Pc(155) int local155 = local148.method1659(0, 0, 0);
			@Pc(159) int[][] local159 = new int[3][local90];
			@Pc(167) int local167;
			@Pc(171) int local171;
			@Pc(173) int local173;
			@Pc(197) int local197;
			for (@Pc(161) int local161 = 0; local161 < 3; local161++) {
				local167 = local130[local161];
				local171 = local130[local161];
				for (local173 = 0; local173 < local90; local173++) {
					@Pc(181) int local181 = (local173 << 14) / local90;
					@Pc(189) int local189 = Class100_Sub1.anIntArray428[local181] * local167 >> 14;
					local197 = local171 * Class100_Sub1.anIntArray429[local181] >> 14;
					local159[local161][local173] = local148.method1659(0, local197, local189);
				}
			}
			for (local167 = 0; local167 < 3; local167++) {
				local171 = (local167 * 256 + 128) / 3;
				local173 = 256 - local171;
				@Pc(248) byte local248 = (byte) (local173 * arg12 + local171 * arg11 >> 8);
				@Pc(293) short local293 = (short) ((local171 * (arg2 & 0x380) + local173 * (arg7 & 0x380) & 0x38000) + ((arg2 & 0xFC00) * local171 + (arg7 & 0xFC00) * local173 & 0xFC0000) + (local171 * (arg2 & 0x7F) + (arg7 & 0x7F) * local173 & 0x7F00) >> 8);
				for (local197 = 0; local197 < local90; local197++) {
					if (local167 == 0) {
						local148.method1658(local159[0][local197], (byte) -1, (byte) 1, local293, local248, local159[0][(local197 + 1) % local90], local155, (short) -1);
					} else {
						local148.method1658(local159[local167][(local197 + 1) % local90], (byte) -1, (byte) 1, local293, local248, local159[local167 - 1][(local197 + 1) % local90], local159[local167 - 1][local197], (short) -1);
						local148.method1658(local159[local167][local197], (byte) -1, (byte) 1, local293, local248, local159[local167][(local197 + 1) % local90], local159[local167 - 1][local197], (short) -1);
					}
				}
			}
			local61 = arg6.method8770(local148, local11, Static291.anInt5751, 64, 768);
			@Pc(417) Class166 local417 = Static201.aClass166_20;
			synchronized (Static201.aClass166_20) {
				Static201.aClass166_20.method4803(local61, local51);
			}
		}
		@Pc(439) int local439 = arg5.V();
		@Pc(442) int local442 = arg5.RA();
		@Pc(445) int local445 = arg5.HA();
		@Pc(448) int local448 = arg5.G();
		@Pc(450) Class6_Sub2_Sub1 local450 = null;
		if (arg9 != null) {
			@Pc(457) int local457 = arg9.anIntArray15[arg10];
			local450 = Static294.aClass373_2.method8741(local457 >> 16);
			arg10 = local457 & 0xFFFF;
		}
		if (local450 == null) {
			local61 = local61.method6850((byte) 3, local11, true);
			local61.O(local442 - local439 >> 1, 128, local448 - local445 >> 1);
			local61.H(local442 + local439 >> 1, 0, local448 + local445 >> 1);
		} else {
			local61 = local61.method6850((byte) 3, local11, true);
			local61.O(local442 - local439 >> 1, 128, local448 - local445 >> 1);
			local61.H(local442 + local439 >> 1, 0, local448 + local445 >> 1);
			local61.method6860(arg10, local450);
		}
		if (arg8 != 0) {
			local61.FA(arg8);
		}
		if (arg0 != 0) {
			local61.VA(arg0);
		}
		if (arg4 != 0) {
			local61.H(0, arg4, 0);
		}
		return local61;
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)I")
	public static int method3387() {
		@Pc(7) int local7 = 0;
		@Pc(22) Field[] local22 = hb.class.getDeclaredFields();
		for (@Pc(26) int local26 = 0; local26 < local22.length; local26++) {
			@Pc(32) Field local32 = local22[local26];
			if (vw.class.isAssignableFrom(local32.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)I")
	public static int method3388(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)V")
	public static void method3390(@OriginalArg(0) int arg0) {
		if (Static554.anInt1821 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static362.aString82 == null) {
				Static108.method1760(Static286.aString63, Static19.anInt323, Static459.aString91);
			} else {
				Static231.method3957(Static19.anInt323);
			}
		}
		if (arg0 != 13 && Static582.aClass29_2 != null) {
			Static582.aClass29_2.method4606();
			Static582.aClass29_2 = null;
		}
		if (arg0 == 3) {
			Static41.method797(Static554.anInt1822 != Static583.anInt9673);
		}
		if (arg0 == 7) {
			Static551.method7995(Static15.anInt5890 != Static554.anInt1822);
		}
		if (arg0 == 5) {
			if (Static362.aString82 == null) {
				Static140.method2272(Static459.aString91, Static286.aString63);
			} else {
				Static59.method1055();
			}
		} else if (arg0 == 6) {
			if (Static362.aString82 == null) {
				Static108.method1760(Static286.aString63, Static19.anInt323, Static459.aString91);
			} else {
				Static231.method3957(Static19.anInt323);
			}
		} else if (arg0 == 9) {
			if (Static362.aString82 == null) {
				Static108.method1760(Static286.aString63, Static19.anInt323, Static459.aString91);
			} else {
				Static231.method3957(Static19.anInt323);
			}
		} else if (arg0 == 12) {
			if (Static362.aString82 == null) {
				Static140.method2272(Static459.aString91, Static286.aString63);
			} else {
				Static59.method1055();
			}
		}
		if (Static217.method3690(Static554.anInt1821)) {
			Static648.aClass353_138.anInt9949 = 2;
			Static335.aClass353_56.anInt9949 = 2;
			Static390.aClass353_78.anInt9949 = 2;
			Static496.aClass353_99.anInt9949 = 2;
			Static428.aClass353_79.anInt9949 = 2;
			Static278.aClass353_50.anInt9949 = 2;
			Static608.aClass353_131.anInt9949 = 2;
		}
		if (Static217.method3690(arg0)) {
			Static49.anInt913 = 1;
			Static617.anInt10205 = 1;
			Static57.anInt1236 = 0;
			Static482.anInt8364 = 0;
			Static600.anInt10019 = 0;
			Static78.method1370(true);
			Static648.aClass353_138.anInt9949 = 1;
			Static335.aClass353_56.anInt9949 = 1;
			Static390.aClass353_78.anInt9949 = 1;
			Static496.aClass353_99.anInt9949 = 1;
			Static428.aClass353_79.anInt9949 = 1;
			Static278.aClass353_50.anInt9949 = 1;
			Static608.aClass353_131.anInt9949 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static139.method2254();
		}
		@Pc(226) boolean local226 = arg0 == 2 || Static578.method5706(arg0) || Static578.method5704(arg0);
		@Pc(243) boolean local243 = Static554.anInt1821 == 2 || Static578.method5706(Static554.anInt1821) || Static578.method5704(Static554.anInt1821);
		if (local226 != local243) {
			if (local226) {
				Static152.anInt5128 = Static416.anInt7577;
				if (Static348.aClass6_Sub22_19.aClass15_Sub18_1.method5678() == 0) {
					Static357.method1358();
				} else {
					Static155.method2439(Static416.anInt7577, Static348.aClass6_Sub22_19.aClass15_Sub18_1.method5678(), Static364.aClass353_60);
					Static259.method4619();
				}
				Static34.aClass296_2.method7438(false);
			} else {
				Static357.method1358();
				Static34.aClass296_2.method7438(true);
			}
		}
		if (Static217.method3690(arg0) || arg0 == 13) {
			Static162.aClass100_7.method8806();
		}
		Static554.anInt1821 = arg0;
	}
}
