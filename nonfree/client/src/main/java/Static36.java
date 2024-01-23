import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cl", name = "jb", descriptor = "Lclient!ea;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!cl", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString38 = "wave:";

	@OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
	public static int anInt1022 = 0;

	@OriginalMember(owner = "client!cl", name = "kb", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(ZI)V")
	public static void method799(@OriginalArg(1) int arg0) {
		Static169.anInt3863 = arg0;
		Static94.anInt6155 = 20;
		Static180.anInt4067 = 3;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(B)V")
	public static void method802() {
		Static125.aClass155_22.method4354();
		Static183.aClass155_35.method4354();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(CZ)Z")
	public static boolean method804(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V")
	public static void method805() {
		Static83.aClass155_14.method4364(5);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!im;)V")
	public static void method806(@OriginalArg(1) Class1_Sub16 arg0) {
		label86: while (true) {
			if (arg0.anInt3328 < arg0.aByteArray39.length) {
				@Pc(17) int local17 = 0;
				@Pc(19) int local19 = 0;
				@Pc(21) boolean local21 = false;
				if (arg0.method2655() == 1) {
					local21 = true;
					local17 = arg0.method2655();
					local19 = arg0.method2655();
				}
				@Pc(42) int local42 = arg0.method2655();
				@Pc(48) int local48 = arg0.method2655();
				@Pc(54) int local54 = local42 * 64 - Static234.anInt5158;
				@Pc(65) int local65 = Static48.anInt1347 + Static173.anInt3932 - local48 * 64 - 1;
				@Pc(103) byte local103;
				@Pc(88) int local88;
				if (local54 >= 0 && local65 - 63 >= 0 && local54 + 63 < Static178.anInt4022 && local65 < Static173.anInt3932) {
					local88 = local54 >> 6;
					@Pc(128) int local128 = local65 >> 6;
					@Pc(130) int local130 = 0;
					while (true) {
						if (local130 >= 64) {
							continue label86;
						}
						for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
							if (!local21 || local130 >= local17 * 8 && local17 * 8 + 8 > local130 && local137 >= local19 * 8 && local137 < local19 * 8 + 8) {
								local103 = arg0.method2633();
								if (local103 != 0) {
									if (Static164.aByteArrayArrayArray31[local88][local128] == null) {
										Static164.aByteArrayArrayArray31[local88][local128] = new byte[4096];
									}
									Static164.aByteArrayArrayArray31[local88][local128][(63 - local137 << 6) + local130] = local103;
									@Pc(226) byte local226 = arg0.method2633();
									if (Static136.aByteArrayArrayArray26[local88][local128] == null) {
										Static136.aByteArrayArrayArray26[local88][local128] = new byte[4096];
									}
									Static136.aByteArrayArrayArray26[local88][local128][(63 - local137 << 6) + local130] = local226;
								}
							}
						}
						local130++;
					}
				}
				local88 = 0;
				while (true) {
					if ((local21 ? 64 : 4096) <= local88) {
						continue label86;
					}
					local103 = arg0.method2633();
					if (local103 != 0) {
						arg0.anInt3328++;
					}
					local88++;
				}
			}
			return;
		}
	}
}
