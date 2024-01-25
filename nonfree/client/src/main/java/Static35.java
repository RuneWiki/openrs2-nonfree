import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!be", name = "B", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!ps;)Lclient!ki;")
	private static Class160 method701(@OriginalArg(1) Class2_Sub29 arg0) {
		@Pc(7) Class160 local7 = new Class160();
		local7.anInt4567 = arg0.method5229();
		local7.aClass2_Sub13_Sub17_1 = Static389.aClass64_1.method1878(local7.anInt4567);
		return local7;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!hca;IBLclient!no;)V")
	public static void method703(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub29_Sub2 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		@Pc(27) int local27;
		if ((arg2 & 0x20) != 0) {
			local18 = arg3.method5196();
			if (local18 == 65535) {
				local18 = -1;
			}
			local27 = arg3.method5224();
			Static481.method7156(local27, local18, arg1);
		}
		@Pc(49) int local49;
		if ((arg2 & 0x1000) != 0) {
			local18 = Static115.anInt2326;
			local27 = arg3.method5182();
			local49 = arg3.method5183();
			arg1.method4378(local18, local27, local49);
		}
		if ((arg2 & 0x8000) != 0) {
			local18 = arg3.method5229();
			arg1.anInt5025 = arg3.method5209();
			arg1.anInt5035 = arg3.method5183();
			arg1.aBoolean386 = (local18 & 0x8000) != 0;
			arg1.anInt5047 = local18 & 0x7FFF;
			arg1.anInt5100 = arg1.anInt5047 + Static115.anInt2326 + arg1.anInt5025;
		}
		if ((arg2 & 0x40) != 0) {
			arg1.anInt3271 = arg3.method5196();
			if (arg1.anInt5102 == 0) {
				arg1.method4380(arg1.anInt3271);
				arg1.anInt3271 = -1;
			}
		}
		if ((arg2 & 0x800) != 0) {
			local7 = arg3.method5207();
		}
		if ((arg2 & 0x4000) != 0) {
			local18 = arg3.method5230();
			if (local18 == 65535) {
				local18 = -1;
			}
			local27 = arg3.method5197();
			local49 = arg3.method5183();
			arg1.method4387(local18, local49, false, local27);
		}
		if ((arg2 & 0x1) != 0) {
			local18 = arg3.method5229();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg1.anInt5062 = local18;
		}
		if ((arg2 & 0x2000) != 0) {
			arg1.aBoolean259 = arg3.method5224() == 1;
		}
		if ((arg2 & 0x400) != 0) {
			arg1.aString108 = arg3.method5194();
			if (arg1.aString108.charAt(0) == '~') {
				arg1.aString108 = arg1.aString108.substring(1);
				Static62.method1145(arg1.aString108, arg1.method2948(), 0, arg1.method2952(), 2);
			} else if (Static266.aClass1_Sub1_Sub2_Sub1_1 == arg1) {
				Static62.method1145(arg1.aString108, arg1.method2948(), 0, arg1.method2952(), 2);
			}
			arg1.anInt5085 = 0;
			arg1.anInt5078 = 0;
			arg1.anInt5054 = 150;
		}
		if ((arg2 & 0x4) != 0) {
			Static452.aByteArray107[arg0] = arg3.method5235();
		}
		if ((arg2 & 0x20000) != 0) {
			local18 = arg3.method5229();
			local27 = arg3.method5197();
			if (local18 == 65535) {
				local18 = -1;
			}
			local49 = arg3.method5209();
			arg1.method4387(local18, local49, true, local27);
		}
		if ((arg2 & 0x40000) != 0) {
			local18 = arg3.method5170();
			@Pc(322) int[] local322 = new int[local18];
			@Pc(325) int[] local325 = new int[local18];
			@Pc(328) int[] local328 = new int[local18];
			for (@Pc(330) int local330 = 0; local330 < local18; local330++) {
				@Pc(336) int local336 = arg3.method5229();
				if (local336 == 65535) {
					local336 = -1;
				}
				local322[local330] = local336;
				local325[local330] = arg3.method5209();
				local328[local330] = arg3.method5230();
			}
			Static230.method3620(local325, arg1, local322, local328);
		}
		if ((arg2 & 0x2) != 0) {
			local18 = arg3.method5229();
			local27 = arg3.method5224();
			local49 = arg3.method5209();
			@Pc(389) int local389 = arg3.anInt6132;
			@Pc(400) boolean local400 = (local18 & 0x8000) != 0;
			if (arg1.aString83 != null && arg1.aClass146_1 != null) {
				@Pc(408) boolean local408 = false;
				if (local27 <= 1) {
					if (!local400 && (Static89.aBoolean131 && !Static100.aBoolean147 || Static391.aBoolean559)) {
						local408 = true;
					} else if (Static196.method3174(arg1.aString83)) {
						local408 = true;
					}
				}
				if (!local408 && Static178.anInt3302 == 0) {
					Static94.aClass2_Sub29_1.anInt6132 = 0;
					arg3.method5169(local49, Static94.aClass2_Sub29_1.aByteArray96);
					Static94.aClass2_Sub29_1.anInt6132 = 0;
					@Pc(452) int local452 = -1;
					@Pc(460) String local460;
					if (local400) {
						local18 &= 0x7FFF;
						@Pc(470) Class160 local470 = method701(Static94.aClass2_Sub29_1);
						local452 = local470.anInt4567;
						local460 = local470.aClass2_Sub13_Sub17_1.method7047(Static94.aClass2_Sub29_1);
					} else {
						local460 = Static187.method3067(Static292.method4616(Static94.aClass2_Sub29_1));
					}
					arg1.aString108 = local460.trim();
					arg1.anInt5054 = 150;
					arg1.anInt5078 = local18 & 0xFF;
					arg1.anInt5085 = local18 >> 8;
					@Pc(512) int local512;
					if (local27 == 1 || local27 == 2) {
						local512 = local400 ? 17 : 1;
					} else {
						local512 = local400 ? 17 : 2;
					}
					if (local27 == 2) {
						Static485.method7210(0, local460, local452, "<img=1>" + arg1.method2952(), null, local512, "<img=1>" + arg1.method2948());
					} else if (local27 == 1) {
						Static485.method7210(0, local460, local452, "<img=0>" + arg1.method2952(), null, local512, "<img=0>" + arg1.method2948());
					} else {
						Static485.method7210(0, local460, local452, arg1.method2952(), null, local512, arg1.method2948());
					}
				}
			}
			arg3.anInt6132 = local389 + local49;
		}
		if ((arg2 & 0x8) != 0) {
			local18 = arg3.method5182();
			local27 = arg3.method5224();
			arg1.method4378(Static115.anInt2326, local18, local27);
			arg1.anInt5058 = Static115.anInt2326 + 300;
			arg1.anInt5042 = arg3.method5183();
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt5043 = arg3.method5213();
			arg1.anInt5056 = arg3.method5213();
			arg1.anInt5046 = arg3.method5207();
			arg1.anInt5064 = arg3.method5207();
			arg1.anInt5068 = arg3.method5196() + Static115.anInt2326;
			arg1.anInt5033 = arg3.method5225() + Static115.anInt2326;
			arg1.anInt5093 = arg3.method5170();
			if (arg1.aBoolean260) {
				arg1.anInt5056 += arg1.anInt3273;
				arg1.anInt5064 += arg1.anInt3273;
				arg1.anInt5102 = 0;
				arg1.anInt5046 += arg1.anInt3247;
				arg1.anInt5043 += arg1.anInt3247;
			} else {
				arg1.anInt5102 = 1;
				arg1.anInt5043 += arg1.anIntArray450[0];
				arg1.anInt5046 += arg1.anIntArray450[0];
				arg1.anInt5064 += arg1.anIntArray449[0];
				arg1.anInt5056 += arg1.anIntArray449[0];
			}
			arg1.anInt5105 = 0;
		}
		if ((arg2 & 0x10000) != 0) {
			arg1.aByte70 = arg3.method5235();
			arg1.aByte72 = arg3.method5207();
			arg1.aByte69 = arg3.method5179();
			arg1.aByte71 = (byte) arg3.method5209();
			arg1.anInt5091 = Static115.anInt2326 + arg3.method5230();
			arg1.anInt5095 = Static115.anInt2326 + arg3.method5230();
		}
		if ((arg2 & 0x80) != 0) {
			local18 = arg3.method5209();
			@Pc(810) byte[] local810 = new byte[local18];
			@Pc(815) Class2_Sub29 local815 = new Class2_Sub29(local810);
			arg3.method5187(local810, local18);
			Static12.aClass2_Sub29Array1[arg0] = local815;
			arg1.method2942(local815);
		}
		if (!arg1.aBoolean260) {
			return;
		}
		if (local7 == 127) {
			arg1.method2949(arg1.anInt3247, arg1.anInt3273);
			return;
		}
		@Pc(842) byte local842;
		if (local7 == -1) {
			local842 = Static452.aByteArray107[arg0];
		} else {
			local842 = local7;
		}
		arg1.method2953(arg1.anInt3247, arg1.anInt3273, local842);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)I")
	public static int method704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
