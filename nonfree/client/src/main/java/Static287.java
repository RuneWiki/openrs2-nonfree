import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "[Lclient!ti;")
	public static Class168[] aClass168Array1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public static int anInt5650 = 0;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	public static int anInt5651 = 255;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	public static int anInt5652 = -1;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString200 = "Please wait...";

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Lclient!ob;")
	public static Class93 method4459() {
		@Pc(33) Class93 local33;
		if (Static116.aBoolean184) {
			local33 = new Class93_Sub2(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[0], Static275.anIntArray522[0], Static299.anIntArray561[0], Static187.anIntArray397[0], Static165.aByteArrayArray9[0], Static199.anIntArray438);
		} else {
			local33 = new Class93_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[0], Static275.anIntArray522[0], Static299.anIntArray561[0], Static187.anIntArray397[0], Static165.aByteArrayArray9[0], Static199.anIntArray438);
		}
		Static293.method4502();
		return local33;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;IZI)Z")
	public static boolean method4460(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(30) boolean local30 = false;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local33; local40++) {
			@Pc(51) char local51 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local51 == '-') {
					local30 = true;
					continue;
				}
				if (local51 == '+') {
					continue;
				}
			}
			@Pc(83) int local83;
			if (local51 >= '0' && local51 <= '9') {
				local83 = local51 - '0';
			} else if (local51 >= 'A' && local51 <= 'Z') {
				local83 = local51 - '7';
			} else if (local51 >= 'a' && local51 <= 'z') {
				local83 = local51 - 'W';
			} else {
				return false;
			}
			if (local83 >= 10) {
				return false;
			}
			if (local30) {
				local83 = -local83;
			}
			@Pc(122) int local122 = local83 + local28 * 10;
			if (local122 / 10 != local28) {
				return false;
			}
			local26 = true;
			local28 = local122;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)I")
	public static int method4461(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Lclient!qo;")
	public static Class147 method4463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class147 local14 = local7.aClass147_1;
			local7.aClass147_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method4464(@OriginalArg(1) Class15_Sub2 arg0) {
		if (Static268.anInt5236 == arg0.anInt5328 || arg0.anInt5332 == -1 || arg0.anInt5343 != 0 || arg0.anInt5368 + 1 > Static208.method3496(arg0.anInt5332).anIntArray377[arg0.anInt5377]) {
			@Pc(43) int local43 = arg0.anInt5328 - arg0.anInt5335;
			@Pc(49) int local49 = Static268.anInt5236 - arg0.anInt5335;
			@Pc(61) int local61 = arg0.anInt5346 * 128 + arg0.method4286() * 64;
			@Pc(72) int local72 = arg0.anInt5350 * 128 + arg0.method4286() * 64;
			@Pc(83) int local83 = arg0.anInt5376 * 128 + arg0.method4286() * 64;
			@Pc(95) int local95 = arg0.anInt5331 * 128 + arg0.method4286() * 64;
			arg0.anInt5358 = (local83 * local49 + local61 * (local43 - local49)) / local43;
			arg0.anInt5371 = (local49 * local95 + local72 * (local43 - local49)) / local43;
		}
		arg0.anInt5296 = 0;
		if (arg0.anInt5320 == 0) {
			arg0.anInt5313 = 1024;
		}
		if (arg0.anInt5320 == 1) {
			arg0.anInt5313 = 1536;
		}
		if (arg0.anInt5320 == 2) {
			arg0.anInt5313 = 0;
		}
		if (arg0.anInt5320 == 3) {
			arg0.anInt5313 = 512;
		}
		arg0.anInt5373 = arg0.anInt5313;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4465(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static197.method3389("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!g;)V")
	public static void method4466(@OriginalArg(1) Class56 arg0) {
		if (Static42.anInt1111 == arg0.anInt2081) {
			Static293.aBooleanArray23[arg0.anInt2090] = true;
		}
	}
}
