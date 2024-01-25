import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	public static int anInt9990;

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "[S")
	public static short[] aShortArray154;

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
	public static int anInt9991;

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "Lclient!me;")
	public static final Class211 aClass211_63 = new Class211(4);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method8113(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) char[] local14 = new char[local6];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local6; local18++) {
			@Pc(25) int local25 = arg0[local18] & 0xFF;
			if (local25 < 128) {
				local14[local16++] = (char) local25;
			} else if (local25 >= 194) {
				@Pc(60) int local60;
				if (local25 < 224) {
					if (local6 <= local18 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local18++;
					local60 = arg0[local18] & 0xFF;
					if (local60 < 128 || local60 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local14[local16++] = (char) (local60 & 0xFFFFFF7F | (local25 & 0xFFFFFF3F) << 6);
				} else if (local25 < 240) {
					if (local6 <= local18 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local18++;
					local60 = arg0[local18] & 0xFF;
					if (local60 < 128 || local60 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local18++;
					@Pc(153) int local153 = arg0[local18] & 0xFF;
					if (local153 < 128 || local153 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local14[local16++] = (char) ((local25 & 0xFFFFFF1F) << 12 | (local60 & 0xFFFFFF7F) << 6 | local153 & 0xFFFFFF7F);
				} else if (local25 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local25);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local25);
			}
		}
		return new String(local14, 0, local16);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I")
	public static int method8114() {
		return Static500.anIntArray611 == null ? 0 : Static500.anIntArray611.length * 2;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public static void method8115() {
		Static322.aClass15_10.ha(((float) Static455.aClass3_Sub27_Sub1_1.anInt4805 * 0.1F + 0.7F) * 1.1523438F);
		Static322.aClass15_10.YA(Static97.anInt2346, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static322.aClass15_10.X(Static542.anInt9777, -1, 0);
		Static322.aClass15_10.method5344(Static407.aClass108_7);
	}
}
