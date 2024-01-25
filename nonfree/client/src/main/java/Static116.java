import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[6][];

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
	public static int anInt5389 = 0;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	public static int anInt5392 = -1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIII)V")
	public static void method4221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg0 - arg3;
		@Pc(21) int local21 = arg2 - arg1;
		if (local8 == 0) {
			if (local21 != 0) {
				Static87.method4801(arg1, arg4, arg2, arg3);
			}
		} else if (local21 == 0) {
			Static50.method914(arg4, arg0, arg3, arg1);
		} else {
			@Pc(47) int local47 = (local21 << 12) / local8;
			@Pc(56) int local56 = arg1 - (arg3 * local47 >> 12);
			@Pc(76) int local76;
			@Pc(74) int local74;
			if (arg3 < Static452.anInt7626) {
				local76 = Static452.anInt7626;
				local74 = (Static452.anInt7626 * local47 >> 12) + local56;
			} else if (Static82.anInt3956 < arg3) {
				local74 = (local47 * Static82.anInt3956 >> 12) + local56;
				local76 = Static82.anInt3956;
			} else {
				local74 = arg1;
				local76 = arg3;
			}
			@Pc(100) int local100;
			@Pc(102) int local102;
			if (Static452.anInt7626 > arg0) {
				local100 = Static452.anInt7626;
				local102 = (Static452.anInt7626 * local47 >> 12) + local56;
			} else if (arg0 <= Static82.anInt3956) {
				local100 = arg0;
				local102 = arg2;
			} else {
				local102 = local56 + (local47 * Static82.anInt3956 >> 12);
				local100 = Static82.anInt3956;
			}
			if (Static341.anInt5789 > local102) {
				local100 = (Static341.anInt5789 - local56 << 12) / local47;
				local102 = Static341.anInt5789;
			} else if (local102 > Static309.anInt5495) {
				local102 = Static309.anInt5495;
				local100 = (Static309.anInt5495 - local56 << 12) / local47;
			}
			if (Static341.anInt5789 > local74) {
				local76 = (Static341.anInt5789 - local56 << 12) / local47;
				local74 = Static341.anInt5789;
			} else if (Static309.anInt5495 < local74) {
				local74 = Static309.anInt5495;
				local76 = (Static309.anInt5495 - local56 << 12) / local47;
			}
			Static245.method3728(local100, local74, arg4, local102, local76);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public static void method4222() {
		for (@Pc(10) Class3_Sub4_Sub9 local10 = (Class3_Sub4_Sub9) Static92.aClass243_14.method5208(); local10 != null; local10 = (Class3_Sub4_Sub9) Static92.aClass243_14.method5203()) {
			@Pc(15) Class7_Sub2_Sub6 local15 = local10.aClass7_Sub2_Sub6_1;
			if (local15.aByte77 != Static6.anInt93 || local15.anInt3785 < Static253.anInt4787) {
				local10.method5977();
				local15.method3012();
			} else if (Static253.anInt4787 >= local15.anInt3775) {
				if (local15.anInt3773 > 0) {
					@Pc(48) Class7_Sub2_Sub3_Sub1 local48 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local15.anInt3773 - 1];
					if (local48 != null && local48.anInt4318 >= 0 && local48.anInt4318 < Static40.anInt1089 * 128 && local48.anInt4321 >= 0 && local48.anInt4321 < Static44.anInt7276 * 128) {
						local15.method3008(Static231.method3482(local15.aByte77, local48.anInt4318, local48.anInt4321) - local15.anInt3786, local48.anInt4321, Static253.anInt4787, local48.anInt4318);
					}
				}
				if (local15.anInt3773 < 0) {
					@Pc(107) int local107 = -local15.anInt3773 - 1;
					@Pc(112) Class7_Sub2_Sub3_Sub2 local112;
					if (local107 == Static319.anInt1936) {
						local112 = Static379.aClass7_Sub2_Sub3_Sub2_2;
					} else {
						local112 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local107];
					}
					if (local112 != null && local112.anInt4318 >= 0 && local112.anInt4318 < Static40.anInt1089 * 128 && local112.anInt4321 >= 0 && local112.anInt4321 < Static44.anInt7276 * 128) {
						local15.method3008(Static231.method3482(local15.aByte77, local112.anInt4318, local112.anInt4321) - local15.anInt3786, local112.anInt4321, Static253.anInt4787, local112.anInt4318);
					}
				}
				local15.method3014(Static115.anInt2498);
				Static149.method2419(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!cu;II)Ljava/lang/String;")
	public static String method4223(@OriginalArg(0) Class3_Sub7 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2638();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt3235 += Static73.aClass33_1.method834(local7, arg0.aByteArray46, 0, arg0.anInt3235, local19);
			return Static198.method3127(local19, local7, 0);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;ZIILclient!mq;Lclient!eu;Lclient!ea;Lclient!oa;IIII)V")
	public static void method4225(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class156 arg3, @OriginalArg(5) Class70 arg4, @OriginalArg(6) Class58 arg5, @OriginalArg(7) Class59 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static161.anInt3316 == 4) {
			local13 = (int) Static252.aFloat47 & 0x3FFF;
		} else {
			local13 = (int) Static252.aFloat47 + Static20.anInt696 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg3.anInt4853 / 2, arg3.anInt4823 / 2) + 10;
		@Pc(41) int local41 = arg1 * arg1 + arg10 * arg10;
		if (local41 > local33 * local33) {
			return;
		}
		@Pc(55) int local55 = Class3_Sub2_Sub17.anIntArray289[local13];
		@Pc(59) int local59 = Class3_Sub2_Sub17.anIntArray290[local13];
		if (Static161.anInt3316 != 4) {
			local59 = local59 * 256 / (Static341.anInt5790 + 256);
			local55 = local55 * 256 / (Static341.anInt5790 + 256);
		}
		@Pc(88) int local88 = arg10 * local59 + local55 * arg1 >> 15;
		@Pc(103) int local103 = local59 * arg1 - arg10 * local55 >> 15;
		@Pc(110) int local110 = arg4.method1752(null, 100, arg0);
		@Pc(116) int local116 = local88 - local110 / 2;
		@Pc(124) int local124 = arg4.method1751(null, arg0);
		if (local116 >= -arg3.anInt4853 && arg3.anInt4853 >= local116 && local103 >= -arg3.anInt4823 && arg3.anInt4823 >= local103) {
			arg6.method5783(0, arg8, null, arg5, local110, 0, arg0, arg2, 50, arg7, arg8 + local116 + arg3.anInt4853 / 2, null, arg3.anInt4823 / 2 + arg7 - arg9 - local103 - local124);
		}
	}
}
