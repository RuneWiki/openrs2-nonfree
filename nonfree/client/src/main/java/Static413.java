import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "Lclient!qa;")
	public static Class167 aClass167_11;

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
	public static int anInt6975;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "[I")
	public static final int[] anIntArray439 = new int[2];

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
	public static int anInt6972 = 0;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean473 = false;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
	public static int anInt6976 = -1;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!dq;Lclient!l;IIILjava/awt/Canvas;)Lclient!qa;")
	public static Class167 method5688(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Canvas arg4) {
		return new Class167_Sub1(arg2, arg4, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIZIZB)V")
	public static void method5689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(24) int local24 = (arg1 + arg2) / 2;
		@Pc(26) int local26 = arg1;
		@Pc(30) Class41_Sub1 local30 = Static121.aClass41_Sub1Array1[local24];
		Static121.aClass41_Sub1Array1[local24] = Static121.aClass41_Sub1Array1[arg2];
		Static121.aClass41_Sub1Array1[arg2] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg2; local42++) {
			if (Static172.method2629(Static121.aClass41_Sub1Array1[local42], local30, arg0, arg3, arg4, arg5) <= 0) {
				@Pc(59) Class41_Sub1 local59 = Static121.aClass41_Sub1Array1[local42];
				Static121.aClass41_Sub1Array1[local42] = Static121.aClass41_Sub1Array1[local26];
				Static121.aClass41_Sub1Array1[local26++] = local59;
			}
		}
		Static121.aClass41_Sub1Array1[arg2] = Static121.aClass41_Sub1Array1[local26];
		Static121.aClass41_Sub1Array1[local26] = local30;
		method5689(arg0, arg1, local26 - 1, arg3, arg4, arg5);
		method5689(arg0, local26 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ga;Lclient!qa;II)V")
	public static void method5690(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class167 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class14 local10 = arg0.method1970(arg1);
		if (local10 == null) {
			return;
		}
		arg1.w(arg3, arg2, arg0.anInt2192 + arg3, arg0.anInt2216 + arg2);
		if (Static439.anInt7311 == 2 || Static439.anInt7311 == 5 || Static391.aClass2_16 == null) {
			arg1.GA(-16777216, local10, arg3, arg2);
			return;
		}
		@Pc(50) int local50;
		@Pc(53) int local53;
		@Pc(61) int local61;
		@Pc(68) int local68;
		if (Static27.anInt490 == 4) {
			local53 = Static180.anInt3334;
			local50 = Static370.anInt6269;
			local61 = (int) -Static19.aFloat6 & 0x3FFF;
			local68 = 4096;
		} else {
			local50 = Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560;
			local53 = Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557;
			local61 = Static139.anInt2475 + (int) -Static19.aFloat6 & 0x3FFF;
			local68 = 4096 - Static197.anInt3551 * 16;
		}
		@Pc(95) int local95 = local50 / 32 + 48 - (Static373.anInt6324 - 104) * 2;
		@Pc(111) int local111 = Static291.anInt5062 * 4 + 48 - local53 / 32 - (Static291.anInt5062 - 104) * 2;
		Static391.aClass2_16.method5837((float) arg0.anInt2192 / 2.0F + (float) arg3, (float) arg2 + (float) arg0.anInt2216 / 2.0F, (float) local95, (float) local111, local68, local61 << 2, local10, arg3, arg2);
		@Pc(162) int local162;
		@Pc(171) int local171;
		@Pc(182) int local182;
		@Pc(192) int local192;
		for (@Pc(145) Class3_Sub30 local145 = (Class3_Sub30) Static336.aClass193_55.method4519(); local145 != null; local145 = (Class3_Sub30) Static336.aClass193_55.method4525()) {
			@Pc(150) int local150 = local145.anInt3957;
			local162 = (Static329.aClass118_3.anIntArray216[local150] >> 14 & 0x3FFF) - Static59.anInt1127;
			local171 = (Static329.aClass118_3.anIntArray216[local150] & 0x3FFF) - Static49.anInt873;
			local182 = local162 * 4 + 2 - local50 / 32;
			local192 = local171 * 4 + 2 - local53 / 32;
			Static85.method1527(local182, local10, Static329.aClass118_3.anIntArray215[local150], arg3, arg0, local192, arg1, arg2);
		}
		for (local162 = 0; local162 < Static230.anInt3922; local162++) {
			local171 = Static420.anIntArray454[local162] * 4 + 2 - local50 / 32;
			local182 = Static130.anIntArray119[local162] * 4 + 2 - local53 / 32;
			@Pc(248) Class31 local248 = Static9.aClass149_1.method3573(Static182.anIntArray198[local162]);
			if (local248.anIntArray44 != null) {
				local248 = local248.method863(Static119.aClass47_1);
				if (local248 == null || local248.anInt796 == -1) {
					continue;
				}
			}
			Static85.method1527(local171, local10, local248.anInt796, arg3, arg0, local182, arg1, arg2);
		}
		@Pc(331) int local331;
		@Pc(342) int local342;
		for (@Pc(285) Class3_Sub13 local285 = (Class3_Sub13) Static242.aClass140_26.method3486(); local285 != null; local285 = (Class3_Sub13) Static242.aClass140_26.method3485()) {
			local182 = (int) (local285.aLong248 >> 28 & 0x3L);
			if (local182 == Static57.anInt1114) {
				local192 = (int) (local285.aLong248 & 0x3FFFL) - Static59.anInt1127;
				@Pc(320) int local320 = (int) (local285.aLong248 >> 14 & 0x3FFFL) - Static49.anInt873;
				local331 = local192 * 4 + 2 - local50 / 32;
				local342 = local320 * 4 + 2 - local53 / 32;
				Static358.method5004(local342, arg0, local331, Static3.aClass2Array1[0], local10, arg3, arg2);
			}
		}
		@Pc(429) int local429;
		for (local182 = 0; local182 < Static379.anInt6398; local182++) {
			@Pc(375) Class3_Sub40 local375 = (Class3_Sub40) Static63.aClass140_37.method3490((long) Static198.anIntArray225[local182]);
			if (local375 != null) {
				@Pc(380) Class1_Sub2_Sub6_Sub1 local380 = local375.aClass1_Sub2_Sub6_Sub1_2;
				if (local380.method5636() && Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 == local380.aByte101) {
					@Pc(392) Class158 local392 = local380.aClass158_1;
					if (local392 != null && local392.anIntArray294 != null) {
						local392 = local392.method3705(Static119.aClass47_1);
					}
					if (local392 != null && local392.aBoolean325 && local392.aBoolean323) {
						local342 = local380.anInt7560 / 32 - local50 / 32;
						local429 = local380.anInt7557 / 32 - local53 / 32;
						if (local392.anInt4451 == -1) {
							Static358.method5004(local429, arg0, local342, Static3.aClass2Array1[1], local10, arg3, arg2);
						} else {
							Static85.method1527(local342, local10, local392.anInt4451, arg3, arg0, local429, arg1, arg2);
						}
					}
				}
			}
		}
		local192 = Static271.anInt4534;
		@Pc(471) int[] local471 = Static215.anIntArray267;
		@Pc(514) int local514;
		@Pc(518) int local518;
		@Pc(547) int local547;
		for (local331 = 0; local331 < local192; local331++) {
			@Pc(481) Class1_Sub2_Sub6_Sub2 local481 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local471[local331]];
			if (local481 != null && local481.method6208() && Static203.aClass1_Sub2_Sub6_Sub2_1 != local481 && local481.aByte101 == Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101) {
				local429 = local481.anInt7560 / 32 - local50 / 32;
				local514 = local481.anInt7557 / 32 - local53 / 32;
				@Pc(516) boolean local516 = false;
				for (local518 = 0; local518 < Static12.anInt180; local518++) {
					if (local481.aString69.equals(Static296.aStringArray32[local518]) && Static216.anIntArray238[local518] != 0) {
						local516 = true;
						break;
					}
				}
				@Pc(545) boolean local545 = false;
				for (local547 = 0; local547 < anInt6975; local547++) {
					if (local481.aString69.equals(Static169.aClass54Array131[local547].aString26)) {
						local545 = true;
						break;
					}
				}
				@Pc(571) boolean local571 = false;
				if (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7655 != 0 && local481.anInt7655 != 0 && local481.anInt7655 == Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7655) {
					local571 = true;
				}
				if (local481.aBoolean512) {
					Static358.method5004(local514, arg0, local429, Static3.aClass2Array1[6], local10, arg3, arg2);
				} else if (local516) {
					Static358.method5004(local514, arg0, local429, Static3.aClass2Array1[3], local10, arg3, arg2);
				} else if (local545) {
					Static358.method5004(local514, arg0, local429, Static3.aClass2Array1[5], local10, arg3, arg2);
				} else if (local571) {
					Static358.method5004(local514, arg0, local429, Static3.aClass2Array1[4], local10, arg3, arg2);
				} else {
					Static358.method5004(local514, arg0, local429, Static3.aClass2Array1[2], local10, arg3, arg2);
				}
			}
		}
		@Pc(671) Class36[] local671 = Static138.aClass36Array1;
		@Pc(755) int local755;
		for (local429 = 0; local429 < local671.length; local429++) {
			@Pc(679) Class36 local679 = local671[local429];
			if (local679 != null && local679.anInt1123 != 0 && Static172.anInt3107 % 20 < 10) {
				@Pc(716) int local716;
				if (local679.anInt1123 == 1) {
					@Pc(701) Class3_Sub40 local701 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local679.anInt1122);
					if (local701 != null) {
						@Pc(706) Class1_Sub2_Sub6_Sub1 local706 = local701.aClass1_Sub2_Sub6_Sub1_2;
						local716 = local706.anInt7560 / 32 - local50 / 32;
						local547 = local706.anInt7557 / 32 - local53 / 32;
						Static34.method2874(local679.anInt1119, local10, arg3, arg2, 360000L, arg0, local716, local547);
					}
				}
				if (local679.anInt1123 == 2) {
					local755 = local679.anInt1120 / 32 - local50 / 32;
					local518 = local679.anInt1126 / 32 - local53 / 32;
					@Pc(771) long local771 = (long) (local679.anInt1116 << 5);
					@Pc(775) long local775 = local771 * local771;
					Static34.method2874(local679.anInt1119, local10, arg3, arg2, local775, arg0, local755, local518);
				}
				if (local679.anInt1123 == 10 && local679.anInt1122 >= 0 && local679.anInt1122 < Static216.aClass1_Sub2_Sub6_Sub2Array1.length) {
					@Pc(810) Class1_Sub2_Sub6_Sub2 local810 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local679.anInt1122];
					if (local810 != null) {
						local518 = local810.anInt7560 / 32 - local50 / 32;
						local716 = local810.anInt7557 / 32 - local53 / 32;
						Static34.method2874(local679.anInt1119, local10, arg3, arg2, 360000L, arg0, local518, local716);
					}
				}
			}
		}
		if (Static27.anInt490 == 4) {
			return;
		}
		if (Static31.anInt592 != 0) {
			local514 = Static31.anInt592 * 4 + Static203.aClass1_Sub2_Sub6_Sub2_1.method6204() * 2 + 2 - local50 / 32 - 2;
			local755 = Static392.anInt6568 * 4 + (Static203.aClass1_Sub2_Sub6_Sub2_1.method6204() + -1) * 2 + 2 - local53 / 32;
			Static358.method5004(local755, arg0, local514, Static230.aClass2Array11[Static356.aBoolean488 ? 1 : 0], local10, arg3, arg2);
		}
		arg1.method5951(3, arg0.anInt2216 / 2 + arg2 - 1, -1, arg3 + arg0.anInt2192 / 2 - 1, 3);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!qw;I)Ljava/lang/String;")
	public static String method5691(@OriginalArg(0) Class3_Sub38 arg0) {
		return arg0.aString57 == null || arg0.aString57.length() <= 0 ? arg0.aString58 : arg0.aString58 + Static54.aClass174_34.method4208(Static300.anInt5192) + arg0.aString57;
	}
}
