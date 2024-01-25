import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wk", name = "Z", descriptor = "Lclient!lr;")
	public static Class25_Sub5_Sub1_Sub2 aClass25_Sub5_Sub1_Sub2_4;

	@OriginalMember(owner = "client!wk", name = "Rb", descriptor = "Lclient!fo;")
	public static Class82 aClass82_54;

	@OriginalMember(owner = "client!wk", name = "nb", descriptor = "[I")
	public static int[] anIntArray280 = new int[2];

	@OriginalMember(owner = "client!wk", name = "ac", descriptor = "[Lclient!as;")
	public static final Class14[] aClass14Array3 = new Class14[4];

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)I")
	public static int method3424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(26) int local26 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | arg2 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg2;
		return ((local31 * (arg0 & 0xFF00) & 0xFF0000 | local31 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLclient!uc;)V")
	public static void method3430(@OriginalArg(1) Class4_Sub7 arg0) {
		arg0.aClass25_1 = null;
		@Pc(16) int local16 = arg0.aClass4_Sub8Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			arg0.aClass4_Sub8Array1[local18].aBoolean779 = false;
		}
		@Pc(32) Class262[] local32 = Class38_Sub8.aClass262Array1;
		synchronized (Class38_Sub8.aClass262Array1) {
			if (Class38_Sub8.aClass262Array1.length > local16 && Static183.anIntArray205[local16] < 200) {
				Class38_Sub8.aClass262Array1[local16].method5815(arg0);
				@Pc(55) int local55 = Static183.anIntArray205[local16]++;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method3432(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2 + arg1;
		for (@Pc(21) int local21 = arg1; local21 < local19; local21++) {
			@Pc(29) int local29 = arg0[local21] & 0xFF;
			if (local29 >= 128) {
				if (local29 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
				}
				@Pc(92) int local92;
				if (local29 >= 224) {
					if (local29 >= 240) {
						if (local29 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
					}
					if (local21 + 2 >= local19) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local92 = arg0[local21] & 0xFF;
					if (local92 < 128 || local92 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(112) int local112 = arg0[local21] & 0xFF;
					if (local112 < 128 || local112 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) ((local29 & 0xFFFFFF1F) << 12 | (local92 & 0xFFFFFF7F) << 6 | local112 & 0xFFFFFF7F);
				} else if (local21 + 1 < local19) {
					local21++;
					local92 = arg0[local21] & 0xFF;
					if (local92 < 128 || local92 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) (local92 & 0xFFFFFF7F | (local29 & 0xFFFFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local13[local15++] = (char) local29;
			}
		}
		return new String(local13, 0, local15);
	}
}
