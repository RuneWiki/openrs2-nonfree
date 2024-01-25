import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!q", name = "P", descriptor = "I")
	public static int anInt5197;

	@OriginalMember(owner = "client!q", name = "S", descriptor = "I")
	public static int anInt5200;

	@OriginalMember(owner = "client!q", name = "W", descriptor = "I")
	public static int anInt5203;

	@OriginalMember(owner = "client!q", name = "I", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_91 = new Class186(62, -2);

	@OriginalMember(owner = "client!q", name = "T", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_84 = new Class25(42, 4);

	@OriginalMember(owner = "client!q", name = "U", descriptor = "I")
	public static final int anInt5201 = 1400;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!ia;IILclient!qh;)V")
	public static void method4549(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub3_Sub6_Sub1 arg3) {
		if ((arg0 & 0x1) != 0) {
			Static49.aByteArray15[arg2] = arg1.method3104();
		}
		@Pc(17) byte local17 = -1;
		if ((arg0 & 0x1000) != 0) {
			arg3.aBoolean377 = arg1.method3110() == 1;
		}
		@Pc(47) int local47;
		@Pc(51) int local51;
		if ((arg0 & 0x4) != 0) {
			local47 = arg1.method3090();
			local51 = arg1.method3110();
			arg3.method5509(local51, Static125.anInt2225, local47);
			arg3.anInt6746 = Static125.anInt2225 + 300;
			arg3.anInt6714 = arg1.method3111();
		}
		@Pc(81) int local81;
		if ((arg0 & 0x8000) != 0) {
			local47 = Static125.anInt2225;
			local51 = arg1.method3090();
			local81 = arg1.method3086();
			arg3.method5509(local81, local47, local51);
		}
		if ((arg0 & 0x800) != 0) {
			local17 = arg1.method3104();
		}
		if ((arg0 & 0x4000) != 0) {
			arg3.aString63 = arg1.method3093();
			if (arg3.aString63.charAt(0) == '~') {
				arg3.aString63 = arg3.aString63.substring(1);
				Static84.method1521(arg3.aString63, 2, arg3.method4690(), 0, arg3.method4685());
			} else if (Static134.aClass3_Sub3_Sub6_Sub1_1 == arg3) {
				Static84.method1521(arg3.aString63, 2, arg3.method4690(), 0, arg3.method4685());
			}
			arg3.anInt6701 = 0;
			arg3.anInt6750 = 0;
			arg3.anInt6721 = 150;
		}
		if ((arg0 & 0x20) != 0) {
			local51 = arg1.method3126();
			if (local51 == 65535) {
				local51 = -1;
			}
			arg3.anInt6690 = local51;
		}
		@Pc(206) int local206;
		if ((arg0 & 0x40) != 0) {
			local51 = arg1.method3108();
			local81 = arg1.method3111();
			local206 = arg1.method3110();
			@Pc(209) int local209 = arg1.anInt3487;
			@Pc(220) boolean local220 = (local51 & 0x8000) != 0;
			if (arg3.aString48 != null && arg3.aClass73_1 != null) {
				@Pc(228) boolean local228 = false;
				if (local81 <= 1) {
					if (!local220 && (Static311.aBoolean354 && !Static40.aBoolean73 || Static130.aBoolean175)) {
						local228 = true;
					} else if (Static250.method3853(arg3.aString48)) {
						local228 = true;
					}
				}
				if (!local228 && Static3.anInt6324 == 0) {
					Static414.aClass6_Sub15_7.anInt3487 = 0;
					arg1.method3127(Static414.aClass6_Sub15_7.aByteArray51, local206);
					Static414.aClass6_Sub15_7.anInt3487 = 0;
					@Pc(272) int local272 = -1;
					@Pc(291) String local291;
					if (local220) {
						local51 &= 0x7FFF;
						@Pc(282) Class157 local282 = Static178.method1006(Static414.aClass6_Sub15_7);
						local272 = local282.anInt3952;
						local291 = local282.aClass6_Sub1_Sub6_1.method1436(Static414.aClass6_Sub15_7);
					} else {
						local291 = Static296.method4364(Static176.method2770(Static414.aClass6_Sub15_7));
					}
					arg3.aString63 = local291.trim();
					arg3.anInt6701 = local51 >> 8;
					arg3.anInt6750 = local51 & 0xFF;
					arg3.anInt6721 = 150;
					@Pc(332) int local332;
					if (local81 == 1 || local81 == 2) {
						local332 = local220 ? 17 : 1;
					} else {
						local332 = local220 ? 17 : 2;
					}
					if (local81 == 2) {
						Static243.method3768(local291, local272, null, "<img=1>" + arg3.method4690(), 0, local332, "<img=1>" + arg3.method4685());
					} else if (local81 == 1) {
						Static243.method3768(local291, local272, null, "<img=0>" + arg3.method4690(), 0, local332, "<img=0>" + arg3.method4685());
					} else {
						Static243.method3768(local291, local272, null, arg3.method4690(), 0, local332, arg3.method4685());
					}
				}
			}
			arg1.anInt3487 = local206 + local209;
		}
		if ((arg0 & 0x200) != 0) {
			local51 = arg1.method3101();
			if (local51 == 65535) {
				local51 = -1;
			}
			local81 = arg1.method3124();
			local206 = arg1.method3111();
			arg3.method5523(local206, local81, false, local51);
		}
		if ((arg0 & 0x10) != 0) {
			local51 = arg1.method3126();
			if (local51 == 65535) {
				local51 = -1;
			}
			local81 = arg1.method3086();
			Static181.method2824(arg3, local51, local81);
		}
		if ((arg0 & 0x100) != 0) {
			local51 = arg1.method3126();
			arg3.anInt6682 = arg1.method3111();
			arg3.anInt6720 = arg1.method3111();
			arg3.anInt6711 = local51 & 0x7FFF;
			arg3.aBoolean454 = (local51 & 0x8000) != 0;
			arg3.anInt6689 = arg3.anInt6682 + Static125.anInt2225 + arg3.anInt6711;
		}
		if ((arg0 & 0x2) != 0) {
			arg3.anInt5530 = arg1.method3097();
			if (arg3.anInt6756 == 0) {
				arg3.method5516(arg3.anInt5530);
				arg3.anInt5530 = -1;
			}
		}
		if ((arg0 & 0x20000) != 0) {
			local51 = arg1.method3126();
			if (local51 == 65535) {
				local51 = -1;
			}
			local81 = arg1.method3129();
			local206 = arg1.method3131();
			arg3.method5523(local206, local81, true, local51);
		}
		if ((arg0 & 0x10000) != 0) {
			local51 = arg1.method3111();
			@Pc(593) int[] local593 = new int[local51];
			@Pc(596) int[] local596 = new int[local51];
			@Pc(599) int[] local599 = new int[local51];
			for (@Pc(601) int local601 = 0; local601 < local51; local601++) {
				@Pc(607) int local607 = arg1.method3101();
				if (local607 == 65535) {
					local607 = -1;
				}
				local593[local601] = local607;
				local596[local601] = arg1.method3111();
				local599[local601] = arg1.method3097();
			}
			Static233.method3638(local593, local596, local599, arg3);
		}
		if ((arg0 & 0x400) != 0) {
			arg3.anInt6719 = arg1.method3077();
			arg3.anInt6734 = arg1.method3099();
			arg3.anInt6751 = arg1.method3077();
			arg3.anInt6748 = arg1.method3077();
			arg3.anInt6686 = arg1.method3108() + Static125.anInt2225;
			arg3.anInt6700 = arg1.method3097() + Static125.anInt2225;
			arg3.anInt6718 = arg1.method3110();
			arg3.anInt6755 = 0;
			if (arg3.aBoolean378) {
				arg3.anInt6748 += arg3.anInt5531;
				arg3.anInt6719 += arg3.anInt5521;
				arg3.anInt6751 += arg3.anInt5521;
				arg3.anInt6734 += arg3.anInt5531;
				arg3.anInt6756 = 0;
			} else {
				arg3.anInt6748 += arg3.anIntArray583[0];
				arg3.anInt6719 += arg3.anIntArray582[0];
				arg3.anInt6734 += arg3.anIntArray583[0];
				arg3.anInt6751 += arg3.anIntArray582[0];
				arg3.anInt6756 = 1;
			}
		}
		if ((arg0 & 0x40000) != 0) {
			arg3.aByte95 = arg1.method3104();
			arg3.aByte98 = arg1.method3104();
			arg3.aByte97 = arg1.method3104();
			arg3.aByte96 = (byte) arg1.method3111();
			arg3.anInt6732 = Static125.anInt2225 + arg1.method3108();
			arg3.anInt6743 = Static125.anInt2225 + arg1.method3126();
		}
		if ((arg0 & 0x8) != 0) {
			local51 = arg1.method3111();
			@Pc(821) byte[] local821 = new byte[local51];
			@Pc(826) Class6_Sub15 local826 = new Class6_Sub15(local821);
			arg1.method3127(local821, local51);
			Static362.aClass6_Sub15Array1[arg2] = local826;
			arg3.method4694(local826);
		}
		if (!arg3.aBoolean378) {
			return;
		}
		if (local17 == 127) {
			arg3.method4691(arg3.anInt5531, arg3.anInt5521);
			return;
		}
		@Pc(859) byte local859;
		if (local17 == -1) {
			local859 = Static49.aByteArray15[arg2];
		} else {
			local859 = local17;
		}
		arg3.method4686(arg3.anInt5531, arg3.anInt5521, local859);
	}
}
