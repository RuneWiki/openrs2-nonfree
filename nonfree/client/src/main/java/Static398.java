import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!qq", name = "D", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_100 = new Class306("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
	public static int anInt7152 = -2;

	@OriginalMember(owner = "client!qq", name = "L", descriptor = "[B")
	public static final byte[] aByteArray102 = new byte[520];

	@OriginalMember(owner = "client!qq", name = "S", descriptor = "[I")
	public static final int[] anIntArray690 = new int[4096];

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method6004(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg0 ? Static480.aClass32_2.anInt909 : Static480.aClass32_2.anInt907);
		for (@Pc(36) int local36 = local19; local36 < local30; local36++) {
			@Pc(43) Class1_Sub1_Sub10 local43 = Static480.aClass32_2.method922(local36);
			if (local43.aBoolean362 && local43.method4430().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static482.aShortArray130 = null;
					Static161.anInt2921 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(72) short[] local72 = new short[local11.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local13; local74++) {
						local72[local74] = local11[local74];
					}
					local11 = local72;
				}
				local11[local13++] = (short) local36;
			}
		}
		Static445.anInt7648 = 0;
		Static161.anInt2921 = local13;
		Static482.aShortArray130 = local11;
		@Pc(111) String[] local111 = new String[Static161.anInt2921];
		for (@Pc(113) int local113 = 0; local113 < Static161.anInt2921; local113++) {
			local111[local113] = Static480.aClass32_2.method922(local11[local113]).method4430();
		}
		Static412.method5617(Static482.aShortArray130, local111);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method6005(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(26) int local26 = arg0[local15] & 0xFF;
			if (local26 < 128) {
				local11[local13++] = (char) local26;
			} else if (local26 >= 194) {
				@Pc(80) int local80;
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
					local80 = arg0[local15] & 0xFF;
					if (local80 >= 128 && local80 <= 191) {
						local15++;
						@Pc(98) int local98 = arg0[local15] & 0xFF;
						if (local98 >= 128 && local98 <= 191) {
							local11[local13++] = (char) ((local26 & 0xFFFFFF1F) << 12 | (local80 & 0x3FFFF7F) << 6 | local98 & 0xFFFFFF7F);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local15 + 1 < local8) {
					local15++;
					local80 = arg0[local15] & 0xFF;
					if (local80 < 128 || local80 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local80 & 0xFFFFFF7F | (local26 & 0xFFFFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local26);
			}
		}
		return new String(local11, 0, local13);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!gj;I)V")
	public static void method6006(@OriginalArg(0) Class72_Sub3 arg0) {
		arg0.aClass49_Sub2_Sub2_1 = null;
		if (Static321.anInt5889 < 20) {
			Static365.aClass299_8.method7027(arg0);
			Static321.anInt5889++;
		}
	}
}
