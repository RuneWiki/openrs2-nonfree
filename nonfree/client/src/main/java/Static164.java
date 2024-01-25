import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public static int anInt2731;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_119 = new Class103(13, 3);

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_84 = new Class12(71, 10);

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_77 = new Class119("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_120 = new Class103(52, 6);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public static void method2369(@OriginalArg(1) int arg0) {
		if (Static255.anInt1147 == 0) {
			Static420.aClass1_Sub6_Sub2_3.method4479(arg0);
		} else {
			Static48.anInt814 = arg0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method2371(@OriginalArg(0) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) char[] local17 = new char[local14];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local14; local21++) {
			@Pc(29) int local29 = arg0[local21] & 0xFF;
			if (local29 >= 128) {
				if (local29 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
				}
				@Pc(94) int local94;
				if (local29 >= 224) {
					if (local29 >= 240) {
						if (local29 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
					}
					if (local21 + 2 >= local14) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local94 = arg0[local21] & 0xFF;
					if (local94 < 128 || local94 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(116) int local116 = arg0[local21] & 0xFF;
					if (local116 < 128 || local116 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local17[local19++] = (char) ((local29 & 0xFFF1F) << 12 | (local94 & 0xFFFFFF7F) << 6 | local116 & 0xFFFFFF7F);
				} else if (local14 > local21 + 1) {
					local21++;
					local94 = arg0[local21] & 0xFF;
					if (local94 < 128 || local94 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local17[local19++] = (char) (local94 & 0xFFFFFF7F | (local29 & 0xFFFFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local17[local19++] = (char) local29;
			}
		}
		return new String(local17, 0, local19);
	}
}
