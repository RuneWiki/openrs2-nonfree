import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
	public static int anInt5834;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_152 = new Class77(32, -2);

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Z")
	public static boolean aBoolean448 = false;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I")
	public static int method5091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = (local12 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local12 & 0xFF0000) >>> 8;
		return ((local17 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local17 & 0xFF0000) >>> 8) + local35;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!uq;[[B)V")
	public static void method5092(@OriginalArg(1) Class134_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt6287; local11++) {
			Static209.method3549();
			for (@Pc(17) int local17 = 0; local17 < Static392.anInt6751 >> 3; local17++) {
				for (@Pc(21) int local21 = 0; local21 < Static307.anInt5484 >> 3; local21++) {
					@Pc(31) int local31 = Static32.anIntArrayArrayArray14[local11][local17][local21];
					if (local31 != -1) {
						@Pc(41) int local41 = local31 >> 24 & 0x3;
						if (!arg0.aBoolean468 || local41 == 0) {
							@Pc(52) int local52 = local31 >> 1 & 0x3;
							@Pc(58) int local58 = local31 >> 14 & 0x3FF;
							@Pc(64) int local64 = local31 >> 3 & 0x7FF;
							@Pc(74) int local74 = (local58 / 8 << 8) + local64 / 8;
							for (@Pc(76) int local76 = 0; local76 < Static372.anIntArray785.length; local76++) {
								if (Static372.anIntArray785[local76] == local74 && arg1[local76] != null) {
									arg0.method5428((local64 & 0x7) * 8, local21 * 8, (local58 & 0x7) * 8, local17 * 8, local52, Static304.aClass82_4, Static190.aClass239Array1, local41, arg1[local76], local11);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public static void method5093() {
		if (Static255.anInt1792 == 0) {
			return;
		}
		try {
			if (++Static244.anInt1016 > 1500) {
				if (Static169.aClass124_3 != null) {
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
				}
				if (Static155.anInt2780 >= 1) {
					Static255.anInt1792 = 0;
					Static217.anInt4042 = -5;
					return;
				}
				if (Static109.anInt2177 == Static314.anInt5577) {
					Static109.anInt2177 = Static225.anInt4150;
				} else {
					Static109.anInt2177 = Static314.anInt5577;
				}
				Static244.anInt1016 = 0;
				Static155.anInt2780++;
				Static255.anInt1792 = 1;
			}
			if (Static255.anInt1792 == 1) {
				Static383.aClass1_10 = Static92.aClass53_2.method1179(Static203.aString31, Static109.anInt2177);
				Static255.anInt1792 = 2;
			}
			@Pc(130) int local130;
			if (Static255.anInt1792 == 2) {
				if (Static383.aClass1_10.anInt2 == 2) {
					throw new IOException();
				}
				if (Static383.aClass1_10.anInt2 != 1) {
					return;
				}
				Static169.aClass124_3 = new Class124((Socket) Static383.aClass1_10.anObject1, Static92.aClass53_2);
				Static383.aClass1_10 = null;
				Static169.aClass124_3.method2717(Static39.aClass2_Sub13_Sub2_4.anInt4788, Static39.aClass2_Sub13_Sub2_4.aByteArray77);
				if (Static124.aClass45_3 != null) {
					Static124.aClass45_3.method3371();
				}
				if (Static267.aClass45_2 != null) {
					Static267.aClass45_2.method3371();
				}
				local130 = Static169.aClass124_3.method2712();
				if (Static124.aClass45_3 != null) {
					Static124.aClass45_3.method3371();
				}
				if (Static267.aClass45_2 != null) {
					Static267.aClass45_2.method3371();
				}
				if (local130 != 101) {
					Static217.anInt4042 = local130;
					Static255.anInt1792 = 0;
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
					return;
				}
				Static255.anInt1792 = 3;
			}
			if (Static255.anInt1792 == 3 && Static169.aClass124_3.method2716() >= 2) {
				local130 = Static169.aClass124_3.method2712() << 8 | Static169.aClass124_3.method2712();
				Static246.method3927(local130);
				if (Static259.anInt4618 == -1) {
					Static217.anInt4042 = 6;
					Static255.anInt1792 = 0;
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
				} else {
					Static255.anInt1792 = 0;
					Static169.aClass124_3.method2714();
					Static169.aClass124_3 = null;
					Static359.method5438();
				}
			}
		} catch (@Pc(209) IOException local209) {
			if (Static169.aClass124_3 != null) {
				Static169.aClass124_3.method2714();
				Static169.aClass124_3 = null;
			}
			if (Static155.anInt2780 >= 1) {
				Static255.anInt1792 = 0;
				Static217.anInt4042 = -4;
			} else {
				Static155.anInt2780++;
				Static244.anInt1016 = 0;
				if (Static314.anInt5577 == Static109.anInt2177) {
					Static109.anInt2177 = Static225.anInt4150;
				} else {
					Static109.anInt2177 = Static314.anInt5577;
				}
				Static255.anInt1792 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method5094(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 > '\u0000' && local26 < '\u0080' || !(local26 < ' ' || local26 > 'ÿ')) {
				local11[local20] = (byte) local26;
			} else if (local26 == '€') {
				local11[local20] = -128;
			} else if (local26 == '‚') {
				local11[local20] = -126;
			} else if (local26 == 'ƒ') {
				local11[local20] = -125;
			} else if (local26 == '„') {
				local11[local20] = -124;
			} else if (local26 == '…') {
				local11[local20] = -123;
			} else if (local26 == '†') {
				local11[local20] = -122;
			} else if (local26 == '‡') {
				local11[local20] = -121;
			} else if (local26 == 'ˆ') {
				local11[local20] = -120;
			} else if (local26 == '‰') {
				local11[local20] = -119;
			} else if (local26 == 'Š') {
				local11[local20] = -118;
			} else if (local26 == '‹') {
				local11[local20] = -117;
			} else if (local26 == 'Œ') {
				local11[local20] = -116;
			} else if (local26 == 'Ž') {
				local11[local20] = -114;
			} else if (local26 == '‘') {
				local11[local20] = -111;
			} else if (local26 == '’') {
				local11[local20] = -110;
			} else if (local26 == '“') {
				local11[local20] = -109;
			} else if (local26 == '”') {
				local11[local20] = -108;
			} else if (local26 == '•') {
				local11[local20] = -107;
			} else if (local26 == '–') {
				local11[local20] = -106;
			} else if (local26 == '—') {
				local11[local20] = -105;
			} else if (local26 == '˜') {
				local11[local20] = -104;
			} else if (local26 == '™') {
				local11[local20] = -103;
			} else if (local26 == 'š') {
				local11[local20] = -102;
			} else if (local26 == '›') {
				local11[local20] = -101;
			} else if (local26 == 'œ') {
				local11[local20] = -100;
			} else if (local26 == 'ž') {
				local11[local20] = -98;
			} else if (local26 == 'Ÿ') {
				local11[local20] = -97;
			} else {
				local11[local20] = 63;
			}
		}
		return local11;
	}
}
