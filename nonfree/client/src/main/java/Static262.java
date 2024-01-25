import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!nc", name = "tb", descriptor = "Lclient!od;")
	public static Class174 aClass174_1;

	@OriginalMember(owner = "client!nc", name = "wb", descriptor = "[I")
	public static int[] anIntArray327;

	@OriginalMember(owner = "client!nc", name = "xb", descriptor = "[[I")
	public static int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_156 = new Class189("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!nc", name = "vb", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!nc", name = "yb", descriptor = "J")
	public static long aLong148 = 0L;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BIII)I")
	public static int method3811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 & 0x3;
		if (local8 == 0) {
			return arg2;
		} else if (local8 == 1) {
			return 7 - arg1;
		} else if (local8 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method3814(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) byte[] local9 = new byte[local6];
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(16) char local16 = arg0.charAt(local11);
			if (local16 > '\u0000' && local16 < '\u0080' || !(local16 < ' ' || local16 > 'ÿ')) {
				local9[local11] = (byte) local16;
			} else if (local16 == '€') {
				local9[local11] = -128;
			} else if (local16 == '‚') {
				local9[local11] = -126;
			} else if (local16 == 'ƒ') {
				local9[local11] = -125;
			} else if (local16 == '„') {
				local9[local11] = -124;
			} else if (local16 == '…') {
				local9[local11] = -123;
			} else if (local16 == '†') {
				local9[local11] = -122;
			} else if (local16 == '‡') {
				local9[local11] = -121;
			} else if (local16 == 'ˆ') {
				local9[local11] = -120;
			} else if (local16 == '‰') {
				local9[local11] = -119;
			} else if (local16 == 'Š') {
				local9[local11] = -118;
			} else if (local16 == '‹') {
				local9[local11] = -117;
			} else if (local16 == 'Œ') {
				local9[local11] = -116;
			} else if (local16 == 'Ž') {
				local9[local11] = -114;
			} else if (local16 == '‘') {
				local9[local11] = -111;
			} else if (local16 == '’') {
				local9[local11] = -110;
			} else if (local16 == '“') {
				local9[local11] = -109;
			} else if (local16 == '”') {
				local9[local11] = -108;
			} else if (local16 == '•') {
				local9[local11] = -107;
			} else if (local16 == '–') {
				local9[local11] = -106;
			} else if (local16 == '—') {
				local9[local11] = -105;
			} else if (local16 == '˜') {
				local9[local11] = -104;
			} else if (local16 == '™') {
				local9[local11] = -103;
			} else if (local16 == 'š') {
				local9[local11] = -102;
			} else if (local16 == '›') {
				local9[local11] = -101;
			} else if (local16 == 'œ') {
				local9[local11] = -100;
			} else if (local16 == 'ž') {
				local9[local11] = -98;
			} else if (local16 == 'Ÿ') {
				local9[local11] = -97;
			} else {
				local9[local11] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Z")
	public static boolean method3815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIII[Lclient!mq;I)V")
	public static void method3816(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class156[] arg4) {
		for (@Pc(10) int local10 = 0; local10 < arg4.length; local10++) {
			@Pc(15) Class156 local15 = arg4[local10];
			if (local15 != null && arg3 == local15.anInt4839) {
				Static401.method5187(arg2, arg0, arg1, local15);
				Static344.method4557(local15, arg1, arg2);
				if (local15.anInt4821 > local15.anInt4877 - local15.anInt4853) {
					local15.anInt4821 = local15.anInt4877 - local15.anInt4853;
				}
				if (local15.anInt4796 - local15.anInt4823 < local15.anInt4801) {
					local15.anInt4801 = local15.anInt4796 - local15.anInt4823;
				}
				if (local15.anInt4821 < 0) {
					local15.anInt4821 = 0;
				}
				if (local15.anInt4801 < 0) {
					local15.anInt4801 = 0;
				}
				if (local15.anInt4792 == 0) {
					Static317.method4367(arg0, local15);
				}
			}
		}
	}
}
