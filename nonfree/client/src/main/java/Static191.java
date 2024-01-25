import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "F")
	public static float aFloat61 = 0.0F;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public static void method3099() {
		if (Static456.anInt1594 == -1) {
			return;
		}
		@Pc(13) int local13 = Static336.aClass87_1.method1919();
		@Pc(17) int local17 = Static336.aClass87_1.method1909();
		@Pc(22) Class1_Sub25 local22 = (Class1_Sub25) Static341.aClass203_43.method4548();
		if (local22 != null) {
			local13 = local22.method3349();
			local17 = local22.method3347();
		}
		Static211.method3325(0, local17, Static342.anInt6292, Static152.anInt3234, 0, 0, 0, local13, Static456.anInt1594);
		if (Static98.aClass68_5 != null) {
			Static429.method5775(local17, local13);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI[BI)Ljava/lang/String;")
	public static String method3100(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg2];
		@Pc(17) int local17 = 0;
		@Pc(21) int local21 = arg2 + arg0;
		for (@Pc(23) int local23 = arg0; local23 < local21; local23++) {
			@Pc(30) int local30 = arg1[local23] & 0xFF;
			if (local30 < 128) {
				local6[local17++] = (char) local30;
			} else if (local30 >= 194) {
				@Pc(93) int local93;
				if (local30 >= 224) {
					if (local30 >= 240) {
						if (local30 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local30);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local21 <= local23 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local23++;
					local93 = arg1[local23] & 0xFF;
					if (local93 < 128 || local93 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local23++;
					@Pc(115) int local115 = arg1[local23] & 0xFF;
					if (local115 < 128 || local115 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local6[local17++] = (char) ((local30 & 0xFFF1F) << 12 | (local93 & 0xFFFFFF7F) << 6 | local115 & 0xFFFFFF7F);
				} else if (local23 + 1 < local21) {
					local23++;
					local93 = arg1[local23] & 0xFF;
					if (local93 < 128 || local93 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local6[local17++] = (char) (local93 & 0xFFFFFF7F | (local30 & 0x3FFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local30);
			}
		}
		return new String(local6, 0, local17);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZZ)V")
	public static void method3101(@OriginalArg(0) boolean arg0) {
		Static149.method2369(Static152.anInt3234, arg0, Static342.anInt6292, Static456.anInt1594);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BII)Z")
	public static boolean method3102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
