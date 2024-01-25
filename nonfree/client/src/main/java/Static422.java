import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "[[[Lclient!gn;")
	public static Class125[][][] aClass125ArrayArrayArray2;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
	public static int[] anIntArray504;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Z")
	public static boolean aBoolean674 = false;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6753(@OriginalArg(1) String arg0) {
		if (!Static594.aBoolean851) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static455.anInt8611;
		@Pc(21) int[] local21 = Static492.anIntArray589;
		for (@Pc(23) int local23 = 0; local23 < local19; local23++) {
			@Pc(30) Class2_Sub2_Sub1_Sub1 local30 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local21[local23]];
			if (local30 != null && Static443.aClass2_Sub2_Sub1_Sub1_2 != local30 && local30.aString23 != null && local30.aString23.equalsIgnoreCase(arg0)) {
				@Pc(52) Class3_Sub9 local52 = Static587.method8316(Static187.aClass40_2, Static48.aClass230_13);
				local52.aClass3_Sub7_Sub1_1.method6528(Static317.anInt9395);
				local52.aClass3_Sub7_Sub1_1.method6537(local21[local23]);
				local52.aClass3_Sub7_Sub1_1.method6546(0);
				local52.aClass3_Sub7_Sub1_1.method6495(Static352.anInt7064);
				local52.aClass3_Sub7_Sub1_1.method6537(Static153.anInt3371);
				Static230.method3933(local52);
				local17 = true;
				Static85.method1895(0, -2, true, local30.anIntArray488[0], local30.anIntArray487[0], local30.method6311(), local30.method6311(), 0);
				break;
			}
		}
		if (!local17) {
			Static477.method7310(Static139.aClass101_20.method2841(Static126.anInt2904) + arg0);
		}
		if (Static594.aBoolean851) {
			Static583.method7888();
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I")
	public static int method6755() {
		if (Static360.aClass305_3 == null) {
			if (!Static256.aBoolean474 && Static309.anInt6170 > 0) {
				if (Static42.aBoolean85 && Static212.aClass193_1.method6323(81) && Static309.anInt6170 > 2) {
					return ((Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287.aClass3_287).anInt7323;
				}
				return ((Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287).anInt7323;
			}
			@Pc(17) int local17 = Static258.aClass116_1.method8249();
			@Pc(21) int local21 = Static258.aClass116_1.method8250();
			@Pc(23) int local23 = Static386.anInt7409;
			@Pc(25) int local25 = Static489.anInt9112;
			@Pc(27) int local27 = Static277.anInt5863;
			if (local23 < local17 && local17 < local23 + local27) {
				@Pc(45) int local45 = -1;
				@Pc(63) int local63;
				for (@Pc(47) int local47 = 0; local47 < Static309.anInt6170; local47++) {
					if (Static254.aBoolean661) {
						local63 = local25 + (Static309.anInt6170 - local47 - 1) * 16 + 33;
						if (local63 - 13 < local21 && local63 + 3 >= local21) {
							local45 = local47;
						}
					} else {
						local63 = (Static309.anInt6170 - local47 - 1) * 16 + local25 + 31;
						if (local21 > local63 - 13 && local63 + 3 >= local21) {
							local45 = local47;
						}
					}
				}
				if (local45 != -1) {
					local63 = 0;
					@Pc(132) Class327 local132 = new Class327(Static342.aClass183_44);
					for (@Pc(137) Class3_Sub40 local137 = (Class3_Sub40) local132.method7867(); local137 != null; local137 = (Class3_Sub40) local132.method7864()) {
						if (local45 == local63++) {
							return local137.anInt7323;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[BILjava/lang/String;)I")
	public static int method6759(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		for (@Pc(16) int local16 = 0; local16 < local8; local16 += 4) {
			@Pc(23) int local23 = Static57.method1332(arg2.charAt(local16));
			@Pc(38) int local38 = local16 + 1 < local8 ? Static57.method1332(arg2.charAt(local16 + 1)) : -1;
			@Pc(57) int local57 = local16 + 2 >= local8 ? -1 : Static57.method1332(arg2.charAt(local16 + 2));
			@Pc(72) int local72 = local8 > local16 + 3 ? Static57.method1332(arg2.charAt(local16 + 3)) : -1;
			arg0[arg1++] = (byte) (local23 << 2 | local38 >>> 4);
			if (local57 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local38 & 0xF) << 4 | local57 >>> 2);
			if (local72 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local57 & 0x3) << 6 | local72);
		}
		return arg1;
	}
}
