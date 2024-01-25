import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLjava/lang/String;[BI)I")
	public static int method1606(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(23) int local23 = 0; local23 < local8; local23++) {
			@Pc(29) char local29 = arg0.charAt(local23);
			if (local29 <= '\u007f') {
				arg1[local10++] = (byte) local29;
			} else if (local29 > '\u07ff') {
				arg1[local10++] = (byte) (local29 >> 12 | 0xE0);
				arg1[local10++] = (byte) (local29 >> 6 & 0x3F | 0x80);
				arg1[local10++] = (byte) (local29 & 0x3F | 0x80);
			} else {
				arg1[local10++] = (byte) (local29 >> 6 | 0xC0);
				arg1[local10++] = (byte) (local29 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZZLjava/lang/String;ILjava/lang/String;II)V")
	public static void method1608(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5) {
		Static255.aClass229_62.anInt5920 = 1;
		@Pc(11) String local11 = arg2.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(27) Class57 local27 = Static537.aClass191_2.method3971(arg3);
			if (local27 == null || arg1 != local27.method1108()) {
				return;
			}
			if (local27.method1108()) {
				local18 = local27.aString16;
			} else {
				local16 = local27.anInt1160;
			}
		}
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static466.aClass130_2.anInt2699; local58++) {
			@Pc(65) Class164 local65 = Static466.aClass130_2.method2311(local58);
			if ((!arg0 || local65.aBoolean291) && local65.anInt3874 == -1 && local65.anInt3888 == -1 && local65.anInt3848 == 0 && local65.aString48.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg1) {
						if (!arg4.equals(local65.method3329(arg3, local18))) {
							continue;
						}
					} else if (arg5 != local65.method3320(local16, arg3)) {
						continue;
					}
				}
				if (local56 >= 250) {
					Static380.anInt8020 = -1;
					Static496.aShortArray121 = null;
					return;
				}
				if (local56 >= local14.length) {
					@Pc(140) short[] local140 = new short[local14.length * 2];
					for (@Pc(142) int local142 = 0; local142 < local56; local142++) {
						local140[local142] = local14[local142];
					}
					local14 = local140;
				}
				local14[local56++] = (short) local58;
			}
		}
		Static380.anInt8020 = local56;
		Static496.aShortArray121 = local14;
		Static507.anInt8114 = 0;
		@Pc(184) String[] local184 = new String[Static380.anInt8020];
		for (@Pc(186) int local186 = 0; local186 < Static380.anInt8020; local186++) {
			local184[local186] = Static466.aClass130_2.method2311(local14[local186]).aString48;
		}
		Static595.method7743(local184, Static496.aShortArray121);
		Static255.aClass229_62.method4965();
		Static255.aClass229_62.anInt5920 = 2;
	}
}
