import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
	public static int anInt7564;

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_11 = new Class395(9, 7);

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "Lclient!au;")
	public static Class14_Sub4 aClass14_Sub4_2 = null;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BILclient!aa;IIIILclient!mea;Lclient!ha;)V")
	public static void method6216(@OriginalArg(1) int arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class230 arg6, @OriginalArg(8) Class137 arg7) {
		@Pc(17) Class42 local17 = Static196.aClass116_2.method2783(arg5);
		if (local17 == null || !local17.aBoolean104 || !local17.method1109(Static595.aClass241_1)) {
			return;
		}
		@Pc(37) int local37;
		if (local17.anIntArray91 != null) {
			@Pc(35) int[] local35 = new int[local17.anIntArray91.length];
			@Pc(50) int local50;
			@Pc(61) int local61;
			@Pc(65) int local65;
			for (local37 = 0; local37 < local35.length / 2; local37++) {
				if (Static378.anInt6935 == 4) {
					local50 = (int) Static543.aFloat228 & 0x3FFF;
				} else {
					local50 = (int) Static543.aFloat228 + Static470.anInt10171 & 0x3FFF;
				}
				local61 = Class32.anIntArray76[local50];
				local65 = Class32.anIntArray77[local50];
				if (Static378.anInt6935 != 4) {
					local65 = local65 * 256 / (Static422.anInt7593 + 256);
					local61 = local61 * 256 / (Static422.anInt7593 + 256);
				}
				local35[local37 * 2] = (local65 * (arg3 + local17.anIntArray91[local37 * 2] * 4) + local61 * (arg4 + local17.anIntArray91[local37 * 2 + 1] * 4) >> 14) + (arg0 + (arg6.anInt6703 / 2));
				local35[local37 * 2 + 1] = arg2 + arg6.anInt6701 / 2 - ((arg4 + local17.anIntArray91[local37 * 2 + 1] * 4) * local65 - (arg3 + local17.anIntArray91[local37 * 2] * 4) * local61 >> 14);
			}
			Static57.method1196(arg7, local35, local17.anInt1291, arg6.anIntArray481, arg6.anIntArray483);
			if (local17.anInt1294 <= 0) {
				for (local50 = 0; local50 < local35.length / 2 - 1; local50++) {
					arg7.method7940(local35[local50 * 2], local35[local50 * 2 + 1], local35[local50 * 2 + 2], local35[local50 * 2 + 2 + 1], local17.anIntArray92[local17.aByteArray19[local50] & 0xFF], arg1, arg0, arg2);
				}
				arg7.method7940(local35[local35.length - 2], local35[local35.length - 1], local35[0], local35[1], local17.anIntArray92[local17.aByteArray19[local17.aByteArray19.length - 1] & 0xFF], arg1, arg0, arg2);
			} else {
				@Pc(326) int local326;
				@Pc(336) int local336;
				@Pc(345) int local345;
				@Pc(349) int local349;
				for (local50 = 0; local50 < local35.length / 2 - 1; local50++) {
					local61 = local35[local50 * 2];
					local65 = local35[local50 * 2 + 1];
					local326 = local35[(local50 + 1) * 2];
					local336 = local35[(local50 + 1) * 2 + 1];
					if (local326 < local61) {
						local345 = local61;
						local61 = local326;
						local349 = local65;
						local65 = local336;
						local326 = local345;
						local336 = local349;
					} else if (local61 == local326 && local336 < local65) {
						local345 = local65;
						local65 = local336;
						local336 = local345;
					}
					arg7.method7886(local61, local65, local326, local336, local17.anIntArray92[local17.aByteArray19[local50] & 0xFF], arg1, arg0, arg2, local17.anInt1294, local17.anInt1276, local17.anInt1287);
				}
				local61 = local35[local35.length - 2];
				local65 = local35[local35.length - 1];
				local326 = local35[0];
				local336 = local35[1];
				if (local326 < local61) {
					local345 = local61;
					local349 = local65;
					local61 = local326;
					local326 = local345;
					local65 = local336;
					local336 = local349;
				} else if (local61 == local326 && local336 < local65) {
					local345 = local65;
					local65 = local336;
					local336 = local345;
				}
				arg7.method7886(local61, local65, local326, local336, local17.anIntArray92[local17.aByteArray19[local17.aByteArray19.length - 1] & 0xFF], arg1, arg0, arg2, local17.anInt1294, local17.anInt1276, local17.anInt1287);
			}
		}
		@Pc(493) Class20 local493 = null;
		if (local17.anInt1281 != -1) {
			local493 = local17.method1111(false, arg7);
			if (local493 != null) {
				Static236.method3562(arg0, arg6, arg3, local493, arg1, arg4, arg2);
			}
		}
		if (local17.aString12 == null) {
			return;
		}
		local37 = 0;
		if (local493 != null) {
			local37 = local493.method7393();
		}
		@Pc(527) Class38 local527 = Static294.aClass38_9;
		@Pc(529) Class158 local529 = Static254.aClass158_7;
		if (local17.anInt1279 == 1) {
			local529 = Static586.aClass158_12;
			local527 = Static242.aClass38_5;
		}
		if (local17.anInt1279 == 2) {
			local527 = Static448.aClass38_10;
			local529 = Static48.aClass158_1;
		}
		Static342.method5284(local37, local529, arg2, local17.anInt1293, arg4, arg3, arg0, arg1, arg6, local17.aString12, local527);
		return;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
	public static boolean method6218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!mea;Lclient!mea;)V")
	public static void method6220(@OriginalArg(1) Class230 arg0, @OriginalArg(2) Class230 arg1) {
		@Pc(12) Class14_Sub19 local12 = Static286.method4081(Static205.aClass394_1, Static153.aClass100_46);
		local12.aClass14_Sub29_Sub1_1.method5861(arg0.anInt6663);
		local12.aClass14_Sub29_Sub1_1.method5894(arg0.anInt6646);
		local12.aClass14_Sub29_Sub1_1.method5859(arg1.anInt6679);
		local12.aClass14_Sub29_Sub1_1.method5859(arg0.anInt6679);
		local12.aClass14_Sub29_Sub1_1.method5892(arg1.anInt6646);
		local12.aClass14_Sub29_Sub1_1.method5861(arg1.anInt6663);
		Static576.method8234(local12);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6221(@OriginalArg(1) String arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer();
		@Pc(19) int local19 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 == '%' && local21 + 2 < local19) {
				local27 = arg0.charAt(local21 + 1);
				@Pc(75) int local75;
				if (local27 >= '0' && local27 <= '9') {
					local75 = local27 - '0';
				} else if (local27 >= 'a' && local27 <= 'f') {
					local75 = local27 + 10 - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local16.append('%');
						continue;
					}
					local75 = local27 + 10 - 65;
				}
				local75 *= 16;
				local27 = arg0.charAt(local21 + 2);
				if (local27 >= '0' && local27 <= '9') {
					local75 += local27 - '0';
				} else if (local27 >= 'a' && local27 <= 'f') {
					local75 += local27 + 10 - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local16.append('%');
						continue;
					}
					local75 += local27 + '\n' - 65;
				}
				local21 += 2;
				if (local75 != 0 && Static141.method1561((byte) local75)) {
					local16.append(Static462.method6790((byte) local75));
				}
			} else if (local27 == '+') {
				local16.append(' ');
			} else {
				local16.append(local27);
			}
		}
		return local16.toString();
	}
}
