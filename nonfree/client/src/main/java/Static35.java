import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cc", name = "xd", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array3;

	@OriginalMember(owner = "client!cc", name = "yd", descriptor = "I")
	public static int anInt1035;

	@OriginalMember(owner = "client!cc", name = "Sc", descriptor = "I")
	public static int anInt1011 = 0;

	@OriginalMember(owner = "client!cc", name = "Tc", descriptor = "[I")
	public static final int[] anIntArray151 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!cc", name = "Uc", descriptor = "Z")
	public static boolean aBoolean76 = true;

	@OriginalMember(owner = "client!cc", name = "Yc", descriptor = "I")
	public static int anInt1015 = 0;

	@OriginalMember(owner = "client!cc", name = "ed", descriptor = "Z")
	public static boolean aBoolean77 = true;

	@OriginalMember(owner = "client!cc", name = "jd", descriptor = "I")
	public static int anInt1025 = -1;

	@OriginalMember(owner = "client!cc", name = "ld", descriptor = "Ljava/lang/String;")
	public static String aString79 = "Loading - please wait.";

	@OriginalMember(owner = "client!cc", name = "td", descriptor = "Z")
	public static boolean aBoolean78 = true;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZZIZLclient!pe;ILclient!pe;ILclient!hq;IILclient!we;)Lclient!kb;")
	public static Class52 method821(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class89 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class89 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class94 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class214 arg10) {
		@Pc(15) Class52 local15 = Static51.method1098(arg5, arg10, arg8, arg4, arg9, arg6, arg2);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class138 local23 = Static17.method4472(arg6);
		@Pc(35) int local35;
		if (arg8 > 1 && local23.anIntArray553 != null) {
			@Pc(33) int local33 = -1;
			for (local35 = 0; local35 < 10; local35++) {
				if (arg8 >= local23.anIntArray551[local35] && local23.anIntArray551[local35] != 0) {
					local33 = local23.anIntArray553[local35];
				}
			}
			if (local33 != -1) {
				local23 = Static17.method4472(local33);
			}
		}
		@Pc(79) Class140 local79 = Static233.method4073(local23.anInt3986, Static246.aClass180_63);
		if (local79 == null) {
			return null;
		}
		if (local23.aShortArray67 != null) {
			for (local35 = 0; local35 < local23.aShortArray67.length; local35++) {
				if (local23.aByteArray55 == null || local35 >= local23.aByteArray55.length) {
					local79.method3672(local23.aShortArray67[local35], local23.aShortArray68[local35]);
				} else {
					local79.method3672(local23.aShortArray67[local35], Static280.aShortArray105[local23.aByteArray55[local35] & 0xFF]);
				}
			}
		}
		if (local23.aShortArray66 != null) {
			for (local35 = 0; local35 < local23.aShortArray66.length; local35++) {
				local79.method3685(local23.aShortArray66[local35], local23.aShortArray65[local35]);
			}
		}
		if (arg10 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				if (Static314.aShortArrayArray7[local35].length > arg10.anIntArray832[local35]) {
					local79.method3672(Static310.aShortArray112[local35], Static314.aShortArrayArray7[local35][arg10.anIntArray832[local35]]);
				}
				if (Static200.aShortArrayArray4[local35].length > arg10.anIntArray832[local35]) {
					local79.method3672(Static17.aShortArray110[local35], Static200.aShortArrayArray4[local35][arg10.anIntArray832[local35]]);
				}
			}
		}
		@Pc(224) short local224 = 1024;
		@Pc(226) boolean local226 = false;
		if (local23.anInt3966 != 128 || local23.anInt3991 != 128 || local23.anInt3956 != 128) {
			local226 = true;
			local224 = 1031;
		}
		@Pc(265) Class31 local265 = arg3.method5475(local79, local224, 0, local23.anInt3994 + 64, 768 - -local23.anInt3979);
		if (local226) {
			local265.method1926(local23.anInt3966, local23.anInt3991, local23.anInt3956);
		}
		@Pc(277) Class52 local277 = null;
		if (local23.anInt3962 != -1) {
			local277 = method821(true, true, 0, arg3, 1, arg5, local23.anInt4003, arg7, 10, 0, arg10);
			if (local277 == null) {
				return null;
			}
		} else if (local23.anInt4007 != -1) {
			local277 = method821(true, false, 0, arg3, arg4, arg5, local23.anInt4001, arg7, arg8, arg9, arg10);
			if (local277 == null) {
				return null;
			}
		}
		@Pc(328) int local328 = local23.anInt3982;
		if (arg1) {
			local328 = (int) ((double) local328 * 1.5D);
		} else if (arg4 == 2) {
			local328 = (int) ((double) local328 * 1.04D);
		}
		arg3.method5416(16, 16, 512, 512);
		@Pc(356) Class70 local356 = arg3.method5438();
		local356.method3705();
		arg3.method5467(local356);
		arg3.method5456(1.0F);
		arg3.method5462(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(375) Class70 local375 = arg3.method5427();
		local375.method3709(-local23.anInt4006 << 3);
		local375.method3712(local23.anInt3977 << 3);
		local375.method3706(local23.anInt4008, (Class147.anIntArray604[local23.anInt3992 << 3] * local328 >> 15) - (local265.method1920() / 2 - local23.anInt4013), (Class147.anIntArray603[local23.anInt3992 << 3] * local328 >> 15) - -local23.anInt4013);
		local375.method3721(local23.anInt3992 << 3);
		@Pc(433) int local433 = arg3.method5440();
		@Pc(436) int local436 = arg3.method5444();
		arg3.method5457(50, Integer.MAX_VALUE);
		arg3.method5480();
		arg3.method5425();
		arg3.method5439(0, 0, 36, 32, 0, 0);
		if (!local265.method1909()) {
			return null;
		}
		local265.method1928(local375, null, 1);
		arg3.method5457(local433, local436);
		@Pc(473) int[] local473 = arg3.method5406();
		if (arg4 >= 1) {
			local473 = Static172.method2486(-16777215, local473);
			if (arg4 >= 2) {
				local473 = Static172.method2486(-1, local473);
			}
		}
		if (arg9 != 0) {
			Static271.method4518(local473, arg9);
		}
		arg3.method5409(local473, 36, 36, 32).method4123(0, 0);
		if (local23.anInt3962 != -1) {
			local277.method4123(0, 0);
		} else if (local23.anInt4007 != -1) {
			local277.method4123(0, 0);
		}
		if (arg2 == 1 || arg2 == 2 && (local23.anInt4004 == 1 || arg8 != 1) && arg8 != -1) {
			arg7.method5692(0, -256, Static313.method5071(arg8), 9, -16777215);
		}
		local473 = arg3.method5406();
		for (@Pc(567) int local567 = 0; local567 < local473.length; local567++) {
			if ((local473[local567] & 0xFFFFFF) == 0) {
				local473[local567] = 0;
			} else {
				local473[local567] |= 0xFF000000;
			}
		}
		@Pc(607) Class52 local607;
		if (arg0) {
			local607 = arg3.method5409(local473, 36, 36, 32);
		} else {
			local607 = arg5.method5409(local473, 36, 36, 32);
		}
		if (!arg0) {
			@Pc(623) Class177 local623 = new Class177();
			local623.anInt5324 = arg5.anInt6390;
			local623.anInt5318 = arg2;
			local623.anInt5316 = arg4;
			local623.anInt5317 = arg8;
			local623.anInt5322 = arg9;
			local623.anInt5327 = arg6;
			local623.aBoolean396 = arg10 != null;
			Static17.aClass62_3.method1394(local607, local623);
		}
		return local607;
	}
}
