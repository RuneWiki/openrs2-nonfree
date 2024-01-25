import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!qo", name = "R", descriptor = "I")
	public static int anInt7470;

	@OriginalMember(owner = "client!qo", name = "Q", descriptor = "I")
	public static int anInt7469 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method6197(@OriginalArg(1) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(28) int local28 = arg0[local15] & 0xFF;
			if (local28 >= 128) {
				if (local28 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
				}
				@Pc(54) int local54;
				if (local28 < 224) {
					if (local15 + 1 >= local8) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local54 = arg0[local15] & 0xFF;
					if (local54 < 128 || local54 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local28 & 0xFFFFFF3F) << 6 | local54 & 0xFFFFFF7F);
				} else if (local28 < 240) {
					if (local8 <= local15 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local54 = arg0[local15] & 0xFF;
					if (local54 < 128 || local54 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(150) int local150 = arg0[local15] & 0xFF;
					if (local150 < 128 || local150 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local54 & 0x3FFFF7F) << 6 | local28 << 12 & 0xFFF1F000 | local150 & 0xFFFFFF7F);
				} else if (local28 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
				}
			} else {
				local11[local13++] = (char) local28;
			}
		}
		return new String(local11, 0, local13);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
	public static void method6198() {
		Static246.aClass121_7.ha(((float) Static480.aClass6_Sub37_Sub1_1.anInt6064 * 0.1F + 0.7F) * 1.1523438F);
		Static246.aClass121_7.YA(Static276.anInt4600, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static246.aClass121_7.X(Static252.anInt4138, -1, 0);
		Static246.aClass121_7.method7108(Static443.aClass17_4);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method6199(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static30.method4028(0, arg1.length - 1, arg1, arg0);
	}
}
