import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	public static int anInt3763 = 0;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
	public static int anInt3764 = -1;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public static int anInt3765 = 16777215;

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
	public static int anInt3768 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!lm;ZLclient!lm;)V")
	public static void method3174(@OriginalArg(0) Class134 arg0, @OriginalArg(2) Class134 arg1) {
		Static253.aClass134_119 = arg0;
		Static346.aClass134_149 = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IC)B")
	public static byte method3176(@OriginalArg(1) char arg0) {
		@Pc(28) byte local28;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local28 = (byte) arg0;
		} else if (arg0 == '€') {
			local28 = -128;
		} else if (arg0 == '‚') {
			local28 = -126;
		} else if (arg0 == 'ƒ') {
			local28 = -125;
		} else if (arg0 == '„') {
			local28 = -124;
		} else if (arg0 == '…') {
			local28 = -123;
		} else if (arg0 == '†') {
			local28 = -122;
		} else if (arg0 == '‡') {
			local28 = -121;
		} else if (arg0 == 'ˆ') {
			local28 = -120;
		} else if (arg0 == '‰') {
			local28 = -119;
		} else if (arg0 == 'Š') {
			local28 = -118;
		} else if (arg0 == '‹') {
			local28 = -117;
		} else if (arg0 == 'Œ') {
			local28 = -116;
		} else if (arg0 == 'Ž') {
			local28 = -114;
		} else if (arg0 == '‘') {
			local28 = -111;
		} else if (arg0 == '’') {
			local28 = -110;
		} else if (arg0 == '“') {
			local28 = -109;
		} else if (arg0 == '”') {
			local28 = -108;
		} else if (arg0 == '•') {
			local28 = -107;
		} else if (arg0 == '–') {
			local28 = -106;
		} else if (arg0 == '—') {
			local28 = -105;
		} else if (arg0 == '˜') {
			local28 = -104;
		} else if (arg0 == '™') {
			local28 = -103;
		} else if (arg0 == 'š') {
			local28 = -102;
		} else if (arg0 == '›') {
			local28 = -101;
		} else if (arg0 == 'œ') {
			local28 = -100;
		} else if (arg0 == 'ž') {
			local28 = -98;
		} else if (arg0 == 'Ÿ') {
			local28 = -97;
		} else {
			local28 = 63;
		}
		return local28;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)I")
	public static int method3180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static307.anIntArray589[arg0 & 0x3] : Static282.anIntArray339[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
	public static void method3188(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) Static158.aClass207_24.method5555((long) arg0);
		if (local15 != null) {
			local15.method5796();
		}
	}
}
