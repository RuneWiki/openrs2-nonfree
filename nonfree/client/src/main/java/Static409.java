import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!qs", name = "G", descriptor = "Lclient!cba;")
	public static Class43 aClass43_3;

	@OriginalMember(owner = "client!qs", name = "K", descriptor = "Z")
	public static boolean aBoolean517;

	@OriginalMember(owner = "client!qs", name = "N", descriptor = "Lclient!gp;")
	public static Class117 aClass117_173;

	@OriginalMember(owner = "client!qs", name = "E", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_66 = new Class236(32, -1);

	@OriginalMember(owner = "client!qs", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[8];

	@OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
	public static int anInt7303 = 0;

	@OriginalMember(owner = "client!qs", name = "J", descriptor = "[I")
	public static final int[] anIntArray565 = new int[32];

	@OriginalMember(owner = "client!qs", name = "M", descriptor = "Z")
	public static boolean aBoolean518 = true;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIZ)V")
	public static void method5944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static79.anInt1504 = arg3;
		Static373.anInt6920 = arg2;
		Static147.anInt3077 = arg1;
		Static324.anInt6228 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method5945(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(26) int local26 = arg0[local15] & 0xFF;
			if (local26 >= 128) {
				if (local26 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local26);
				}
				@Pc(84) int local84;
				if (local26 >= 224) {
					if (local26 >= 240) {
						if (local26 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local26);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local15 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local84 = arg0[local15] & 0xFF;
					if (local84 < 128 || local84 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(104) int local104 = arg0[local15] & 0xFF;
					if (local104 < 128 || local104 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local26 & 0xFFF1F) << 12 | (local84 & 0xFFFFFF7F) << 6 | local104 & 0xFFFFFF7F);
				} else if (local15 + 1 < local8) {
					local15++;
					local84 = arg0[local15] & 0xFF;
					if (local84 < 128 || local84 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local26 & 0xFFFFFF3F) << 6 | local84 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local11[local13++] = (char) local26;
			}
		}
		return new String(local11, 0, local13);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "([BI)Lclient!ah;")
	public static Class5_Sub2_Sub1 method5946(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class5_Sub2_Sub1 local9 = new Class5_Sub2_Sub1();
		@Pc(14) Class5_Sub3 local14 = new Class5_Sub3(arg0);
		local14.anInt4960 = local14.aByteArray66.length - 2;
		@Pc(25) int local25 = local14.method4227();
		@Pc(36) int local36 = local14.aByteArray66.length - local25 - 12 - 2;
		local14.anInt4960 = local36;
		@Pc(43) int local43 = local14.method4230();
		local9.anInt213 = local14.method4227();
		local9.anInt209 = local14.method4227();
		local9.anInt211 = local14.method4227();
		local9.anInt210 = local14.method4227();
		@Pc(69) int local69 = local14.method4220();
		@Pc(80) int local80;
		@Pc(86) int local86;
		if (local69 > 0) {
			local9.aClass42Array1 = new Class42[local69];
			for (local80 = 0; local80 < local69; local80++) {
				local86 = local14.method4227();
				@Pc(95) Class42 local95 = new Class42(Static179.method3071(local86));
				local9.aClass42Array1[local80] = local95;
				while (local86-- > 0) {
					@Pc(106) int local106 = local14.method4230();
					@Pc(110) int local110 = local14.method4230();
					local95.method1106((long) local106, new Class5_Sub27(local110));
				}
			}
		}
		local14.anInt4960 = 0;
		local9.aString9 = local14.method4193();
		local9.aStringArray5 = new String[local43];
		local9.anIntArray16 = new int[local43];
		local9.anIntArray17 = new int[local43];
		local80 = 0;
		while (local36 > local14.anInt4960) {
			local86 = local14.method4227();
			if (local86 == 3) {
				local9.aStringArray5[local80] = local14.method4234().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local9.anIntArray17[local80] = local14.method4220();
			} else {
				local9.anIntArray17[local80] = local14.method4230();
			}
			local9.anIntArray16[local80++] = local86;
		}
		return local9;
	}
}
