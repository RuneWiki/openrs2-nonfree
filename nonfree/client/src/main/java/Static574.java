import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "I")
	public static int anInt9449;

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
	public static int anInt9453;

	@OriginalMember(owner = "client!uga", name = "g", descriptor = "Z")
	public static boolean aBoolean676;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "F")
	public static float aFloat203 = 0.25F;

	@OriginalMember(owner = "client!uga", name = "h", descriptor = "Z")
	public static boolean aBoolean677 = false;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!l;IB[I)V")
	public static void method8145(@OriginalArg(0) Class4_Sub1_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray306 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray306.length; local8++) {
				if (arg2[local8] != arg0.anIntArray306[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt5718 != -1) {
				@Pc(49) Class361 local49 = Static115.aClass227_1.method5968(arg0.anInt5718);
				@Pc(52) int local52 = local49.anInt9867;
				if (local52 == 1) {
					arg0.anInt5710 = arg1;
					arg0.anInt5770 = 0;
					arg0.anInt5777 = 1;
					arg0.anInt5763 = 0;
					arg0.anInt5723 = 0;
					if (!arg0.aBoolean405) {
						Static74.method1765(arg0.anInt5770, local49, arg0);
					}
				}
				if (local52 == 2) {
					arg0.anInt5763 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray306 == null || arg0.anIntArray306[local8] == -1 || Static115.aClass227_1.method5968(arg2[local8]).anInt9855 >= Static115.aClass227_1.method5968(arg0.anIntArray306[local8]).anInt9855) {
				arg0.anIntArray306 = arg2;
				arg0.anInt5710 = arg1;
				break;
			}
		}
		if (local6) {
			arg0.anInt5710 = arg1;
			arg0.anIntArray306 = arg2;
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method8146(@OriginalArg(0) String arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local17 > local19 + 2) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(70) int local70;
				if (local25 >= '0' && local25 <= '9') {
					local70 = local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local70 = local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local70 = local25 + '\n' - 65;
				}
				local70 *= 16;
				local25 = arg0.charAt(local19 + 2);
				if (local25 >= '0' && local25 <= '9') {
					local70 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local70 += local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local70 += local25 - 55;
				}
				if (local70 != 0 && Static73.method1751((byte) local70)) {
					local14.append(Static242.method3969((byte) local70));
				}
				local19 += 2;
			} else if (local25 == '+') {
				local14.append(' ');
			} else {
				local14.append(local25);
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(III)V")
	public static void method8147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static475.method7133(local7.aClass4_Sub1_Sub5_1);
			if (local7.aClass4_Sub1_Sub5_1 != null) {
				local7.aClass4_Sub1_Sub5_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!lia;)V")
	public static void method8148(@OriginalArg(0) Class206 arg0) {
		if (Static99.anInt2252 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub16 local6 = arg0.aClass3_Sub16_3;
		Static89.aClass206Array1[Static99.anInt2252] = arg0;
		Static303.aBooleanArray16[Static99.anInt2252] = false;
		Static99.anInt2252++;
		@Pc(21) int local21 = arg0.anInt6053;
		if (arg0.aBoolean429) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6053;
		if (arg0.aBoolean428) {
			local29 = Static442.anInt7929 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4783() + Static161.anInt3180 - local6.method4781() >> Static308.anInt5834;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4783() + local6.method4781() - Static161.anInt3180 >> Static308.anInt5834;
			if (local73 >= Static293.anInt5181) {
				local73 = Static293.anInt5181 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray78[local41++];
				@Pc(105) int local105 = (local6.method4778() + Static161.anInt3180 - local6.method4781() >> Static308.anInt5834) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static569.anInt9425) {
					local113 = Static569.anInt9425 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static207.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static207.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static99.anInt2252;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static207.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static99.anInt2252 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static207.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static99.anInt2252 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static207.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static99.anInt2252 << 48;
					}
				}
			}
		}
	}
}
