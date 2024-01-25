import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!od", name = "L", descriptor = "I")
	private static int anInt895;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "Z")
	private static boolean aBoolean54;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "Z")
	private static boolean aBoolean55;

	@OriginalMember(owner = "client!od", name = "O", descriptor = "Z")
	private static boolean aBoolean56;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	public static int anInt870 = 0;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public static final int anInt872 = 4;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI)V")
	public static void method704(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static269.aClass51_9 = Static459.method5294(arg1, Static351.anInterface4_5, Static95.aCanvas3, Static230.aClass61_4, Static130.aClass153_Sub1_1.anInt5244 * 2);
		} else {
			if (arg0) {
				Static269.aClass51_9 = Static459.method5294(0, Static351.anInterface4_5, Static95.aCanvas3, Static230.aClass61_4, 0);
				Static269.aClass51_9.p(0);
				@Pc(22) Class57 local22 = Static254.method3389(Static249.aClass178_74, Static37.anInt653);
				@Pc(31) Class63 local31 = Static269.aClass51_9.method5281(local22, Static469.method5146(Static25.aClass178_9, Static37.anInt653));
				Static374.method4823(local31, Static10.aClass55_6.method1205(Static5.anInt20), true);
				Static269.aClass51_9.method5353();
				Static108.method1875();
				Static269.aClass51_9.method5315();
			}
			try {
				Static269.aClass51_9 = Static459.method5294(arg1, Static351.anInterface4_5, Static95.aCanvas3, Static230.aClass61_4, Static130.aClass153_Sub1_1.anInt5244 * 2);
				if (Static269.aClass51_9.method5307()) {
					@Pc(62) boolean local62 = true;
					try {
						local62 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(72) Throwable local72) {
					}
					@Pc(78) Class7_Sub40 local78;
					if (local62) {
						local78 = Static269.aClass51_9.method5347(146800640);
					} else {
						local78 = Static269.aClass51_9.method5347(104857600);
					}
					Static269.aClass51_9.method5336(local78);
				}
			} catch (@Pc(89) Throwable local89) {
				arg1 = 0;
				Static269.aClass51_9 = Static459.method5294(0, Static351.anInterface4_5, Static95.aCanvas3, Static230.aClass61_4, 0);
			}
		}
		Static377.anInt6113 = arg1;
		Static90.method1615();
		if (!Static269.aClass51_9.method5284()) {
			Static367.anInt5880 = 1;
		}
		Static269.aClass51_9.method5340(Static367.anInt5880);
		Static269.aClass51_9.method5341(0);
		Static269.aClass51_9.MA(8);
		Static179.aClass33_11 = Static269.aClass51_9.method5293();
		Static379.aClass33_8 = Static269.aClass51_9.method5293();
		Static156.method2332();
		Static269.aClass51_9.method5279(!Static130.aClass153_Sub1_1.aBoolean340);
		if (Static269.aClass51_9.method5327()) {
			Static143.method2214(Static130.aClass153_Sub1_1.aBoolean352);
		}
		Static312.method4085(Static269.aClass51_9, Static102.anInt2086 >> 3, Static333.anInt3375 >> 3);
		Static379.method4655();
		Static169.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B[BLjava/lang/String;I)I")
	public static int method706(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = arg1.length();
		@Pc(19) int local19 = arg2;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			@Pc(27) char local27 = arg1.charAt(local21);
			if (local27 <= '\u007f') {
				arg0[local19++] = (byte) local27;
			} else if (local27 <= '\u07ff') {
				arg0[local19++] = (byte) (local27 >> 6 | 0xC0);
				arg0[local19++] = (byte) (local27 & 0x3F | 0x80);
			} else {
				arg0[local19++] = (byte) (local27 >> 12 | 0xE0);
				arg0[local19++] = (byte) (local27 >> 6 & 0x3F | 0x80);
				arg0[local19++] = (byte) (local27 & 0x3F | 0x80);
			}
		}
		return local19 - arg2;
	}

	@OriginalMember(owner = "client!od", name = "providesignlink", descriptor = "(Lclient!ec;)V")
	private static void method710(@OriginalArg(0) Class61 arg0) {
		Static230.aClass61_4 = arg0;
		Static217.aClass61_3 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public static int method714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static268.anIntArrayArray39 == null ? 0 : Static268.anIntArrayArray39[arg0][arg1] & 0xFFFFFF;
	}
}
