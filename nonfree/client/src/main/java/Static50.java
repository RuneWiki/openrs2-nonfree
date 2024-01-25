import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
	public static int anInt1272;

	@OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
	public static int anInt1278;

	@OriginalMember(owner = "client!bt", name = "N", descriptor = "Lclient!ga;")
	public static Class111 aClass111_8;

	@OriginalMember(owner = "client!bt", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!bt", name = "K", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_29 = new Class81(74, 2);

	@OriginalMember(owner = "client!bt", name = "L", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_7 = new Class201(12, 0, 1, 0);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!he;IB)V")
	public static void method1157(@OriginalArg(0) Class20_Sub2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray429 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anIntArray429[arg1 + 1];
		if (local13 == arg0.anInt6438) {
			return;
		}
		arg0.anInt6438 = local13;
		arg0.anInt6441 = 0;
		arg0.anInt6392 = 0;
		arg0.anInt6420 = 1;
		arg0.anInt6466 = arg0.anInt6469;
		arg0.anInt6447 = 0;
		if (arg0.anInt6438 != -1) {
			Static171.method2603(arg0.anInt6392, arg0.anInt8796, Static594.aClass311_2.method7009(arg0.anInt6438), arg0.anInt8795, arg0.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B[B)Ljava/lang/String;")
	public static String method1158(@OriginalArg(1) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(28) int local28 = arg0[local20] & 0xFF;
			if (local28 >= 128) {
				if (local28 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
				}
				@Pc(75) int local75;
				if (local28 < 224) {
					if (local20 + 1 >= local8) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local75 = arg0[local20] & 0xFF;
					if (local75 < 128 || local75 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local18++] = (char) (local75 & 0xFFFFFF7F | (local28 & 0xFFFFFF3F) << 6);
				} else if (local28 < 240) {
					if (local20 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local75 = arg0[local20] & 0xFF;
					if (local75 < 128 || local75 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local20++;
					@Pc(165) int local165 = arg0[local20] & 0xFF;
					if (local165 < 128 || local165 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local18++] = (char) (local165 & 0xFFFFFF7F | (local28 & 0xFFFFFF1F) << 12 | (local75 & 0xFFFFFF7F) << 6);
				} else if (local28 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
				}
			} else {
				local11[local18++] = (char) local28;
			}
		}
		return new String(local11, 0, local18);
	}
}
