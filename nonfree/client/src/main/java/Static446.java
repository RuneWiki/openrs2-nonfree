import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array14;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "[S")
	public static final short[] aShortArray115 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public static int anInt7154 = 0;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	public static int anInt7163 = -1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method5862(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(19) char[] local19 = new char[local8];
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local8; local23++) {
			@Pc(31) int local31 = arg0[local23] & 0xFF;
			if (local31 >= 128) {
				if (local31 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local31);
				}
				@Pc(74) int local74;
				if (local31 < 224) {
					if (local23 + 1 >= local8) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local23++;
					local74 = arg0[local23] & 0xFF;
					if (local74 < 128 || local74 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local19[local21++] = (char) ((local31 & 0x3FFFF3F) << 6 | local74 & 0xFFFFFF7F);
				} else if (local31 < 240) {
					if (local23 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local23++;
					local74 = arg0[local23] & 0xFF;
					if (local74 < 128 || local74 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local23++;
					@Pc(160) int local160 = arg0[local23] & 0xFF;
					if (local160 < 128 || local160 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local19[local21++] = (char) (local160 & 0xFFFFFF7F | (local31 & 0xFFFFFF1F) << 12 | (local74 & 0x3FFFF7F) << 6);
				} else if (local31 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local31);
				}
			} else {
				local19[local21++] = (char) local31;
			}
		}
		return new String(local19, 0, local21);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public static void method5863() {
		Static80.aClass134_14.method3272();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!hp;BLjava/lang/String;)I")
	public static int method5864(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) String arg1) {
		@Pc(14) int local14 = arg0.anInt6475;
		@Pc(18) byte[] local18 = Static187.method2939(arg1);
		arg0.method5408(local18.length);
		arg0.anInt6475 += Static390.aClass215_1.method4887(arg0.aByteArray89, local18, 0, local18.length, arg0.anInt6475);
		return arg0.anInt6475 - local14;
	}
}
