import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "client!hf", name = "J", descriptor = "[I")
	public static int[] anIntArray116 = new int[500];

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "Lclient!qc;")
	public static Class60 aClass60_483 = Static121.method2047("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "Lclient!qc;")
	public static Class60 aClass60_484 = Static121.method2047("null");

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
	public static int anInt1234 = 0;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "Lclient!qc;")
	public static Class60 aClass60_485 = Static121.method2047(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method849() {
		aClass60_485 = null;
		aClass60_483 = null;
		anIntArray116 = null;
		anIntArray117 = null;
		aClass60_484 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
	public static void method852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static7.aClass28_3.method796(arg2, arg0, arg1);
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(63) int local63;
		@Pc(69) int local69;
		if (local16 != 0) {
			local28 = Static7.aClass28_3.method760(arg2, arg0, arg1, local16);
			local34 = local28 >> 6 & 0x3;
			local38 = local28 & 0x1F;
			local40 = arg3;
			if (local16 > 0) {
				local40 = arg4;
			}
			@Pc(47) int[] local47 = Static131.aClass4_Sub4_Sub3_Sub2_5.anIntArray121;
			local63 = (103 - arg1) * 4 * 512 + arg0 * 4 + 24624;
			local69 = local16 >> 14 & 0x7FFF;
			@Pc(73) Class4_Sub4_Sub5 local73 = Static24.method477(local69);
			if (local73.anInt1092 == -1) {
				if (local38 == 0 || local38 == 2) {
					if (local34 == 0) {
						local47[local63] = local40;
						local47[local63 + 512] = local40;
						local47[local63 + 1024] = local40;
						local47[local63 + 1536] = local40;
					} else if (local34 == 1) {
						local47[local63] = local40;
						local47[local63 + 1] = local40;
						local47[local63 + 2] = local40;
						local47[local63 + 3] = local40;
					} else if (local34 == 2) {
						local47[local63 + 3] = local40;
						local47[local63 + 515] = local40;
						local47[local63 + 1027] = local40;
						local47[local63 + 1539] = local40;
					} else if (local34 == 3) {
						local47[local63 + 1536] = local40;
						local47[local63 + 1537] = local40;
						local47[local63 + 1536 + 2] = local40;
						local47[local63 + 3 + 1536] = local40;
					}
				}
				if (local38 == 3) {
					if (local34 == 0) {
						local47[local63] = local40;
					} else if (local34 == 1) {
						local47[local63 + 3] = local40;
					} else if (local34 == 2) {
						local47[local63 + 3 + 1536] = local40;
					} else if (local34 == 3) {
						local47[local63 + 1536] = local40;
					}
				}
				if (local38 == 2) {
					if (local34 == 3) {
						local47[local63] = local40;
						local47[local63 + 512] = local40;
						local47[local63 + 1024] = local40;
						local47[local63 + 1536] = local40;
					} else if (local34 == 0) {
						local47[local63] = local40;
						local47[local63 + 1] = local40;
						local47[local63 + 2] = local40;
						local47[local63 + 3] = local40;
					} else if (local34 == 1) {
						local47[local63 + 3] = local40;
						local47[local63 + 3 + 512] = local40;
						local47[local63 + 1024 + 3] = local40;
						local47[local63 + 1536 + 3] = local40;
					} else if (local34 == 2) {
						local47[local63 + 1536] = local40;
						local47[local63 + 1 + 1536] = local40;
						local47[local63 + 2 + 1536] = local40;
						local47[local63 + 1536 + 3] = local40;
					}
				}
			} else {
				@Pc(386) Class4_Sub4_Sub3_Sub1 local386 = Static122.aClass4_Sub4_Sub3_Sub1Array11[local73.anInt1092];
				if (local386 != null) {
					@Pc(398) int local398 = (local73.anInt1085 * 4 - local386.anInt633) / 2;
					@Pc(409) int local409 = (local73.anInt1075 * 4 - local386.anInt635) / 2;
					local386.method431(local409 + arg0 * 4 + 48, local398 + 48 - -((-arg1 + 104 + -local73.anInt1085) * 4));
				}
			}
		}
		local16 = Static7.aClass28_3.method783(arg2, arg0, arg1);
		if (local16 != 0) {
			local40 = local16 >> 14 & 0x7FFF;
			local28 = Static7.aClass28_3.method760(arg2, arg0, arg1, local16);
			local38 = local28 & 0x1F;
			local34 = local28 >> 6 & 0x3;
			@Pc(472) Class4_Sub4_Sub5 local472 = Static24.method477(local40);
			@Pc(504) int local504;
			if (local472.anInt1092 != -1) {
				@Pc(481) Class4_Sub4_Sub3_Sub1 local481 = Static122.aClass4_Sub4_Sub3_Sub1Array11[local472.anInt1092];
				if (local481 != null) {
					local69 = (local472.anInt1075 * 4 - local481.anInt635) / 2;
					local504 = (local472.anInt1085 * 4 - local481.anInt633) / 2;
					local481.method431(local69 + arg0 * 4 + 48, (-local472.anInt1085 + 104 - arg1) * 4 + 48 + local504);
				}
			} else if (local38 == 9) {
				@Pc(534) int[] local534 = Static131.aClass4_Sub4_Sub3_Sub2_5.anIntArray121;
				local504 = arg0 * 4 + (-arg1 + 103) * 512 * 4 + 24624;
				local63 = 15658734;
				if (local16 > 0) {
					local63 = 15597568;
				}
				if (local34 == 0 || local34 == 2) {
					local534[local504 + 1536] = local63;
					local534[local504 + 1 + 1024] = local63;
					local534[local504 + 514] = local63;
					local534[local504 + 3] = local63;
				} else {
					local534[local504] = local63;
					local534[local504 + 512 + 1] = local63;
					local534[local504 + 1024 + 2] = local63;
					local534[local504 + 1539] = local63;
				}
			}
		}
		local16 = Static7.aClass28_3.method759(arg2, arg0, arg1);
		if (local16 == 0) {
			return;
		}
		local28 = local16 >> 14 & 0x7FFF;
		@Pc(646) Class4_Sub4_Sub5 local646 = Static24.method477(local28);
		if (local646.anInt1092 == -1) {
			return;
		}
		@Pc(656) Class4_Sub4_Sub3_Sub1 local656 = Static122.aClass4_Sub4_Sub3_Sub1Array11[local646.anInt1092];
		if (local656 != null) {
			local40 = (local646.anInt1075 * 4 - local656.anInt635) / 2;
			@Pc(680) int local680 = (local646.anInt1085 * 4 - local656.anInt633) / 2;
			local656.method431(local40 + arg0 * 4 + 48, 48 - (-((-local646.anInt1085 + -arg1 + 104) * 4) - local680));
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[BIB)Z")
	public static boolean method854(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(8) Class4_Sub13 local8 = new Class4_Sub13(arg1);
		@Pc(14) int local14 = -1;
		label70: while (true) {
			@Pc(18) int local18 = local8.method1237();
			if (local18 == 0) {
				return local3;
			}
			@Pc(22) boolean local22 = false;
			local14 += local18;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(65) int local65;
				@Pc(90) Class4_Sub4_Sub5 local90;
				do {
					@Pc(59) int local59;
					@Pc(69) int local69;
					do {
						do {
							do {
								do {
									@Pc(34) int local34;
									while (local22) {
										local34 = local8.method1237();
										if (local34 == 0) {
											continue label70;
										}
										local8.method1223();
									}
									local34 = local8.method1237();
									if (local34 == 0) {
										continue label70;
									}
									local28 += local34 - 1;
									@Pc(49) int local49 = local28 & 0x3F;
									@Pc(55) int local55 = local28 >> 6 & 0x3F;
									local59 = arg2 + local55;
									local65 = local8.method1223() >> 2;
									local69 = local49 + arg0;
								} while (local59 <= 0);
							} while (local69 <= 0);
						} while (local59 >= 103);
					} while (local69 >= 103);
					local90 = Static24.method477(local14);
				} while (local65 == 22 && Static61.aBoolean57 && local90.anInt1102 == 0 && local90.anInt1080 != 1 && !local90.aBoolean36);
				if (!local90.method733()) {
					Static77.anInt1904++;
					local3 = false;
				}
				local22 = true;
			}
		}
	}
}
