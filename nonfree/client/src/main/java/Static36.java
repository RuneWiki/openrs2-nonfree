import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "Lclient!dda;")
	public static Class53 aClass53_9;

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "Lclient!dda;")
	public static Class53 aClass53_10;

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
	public static int anInt644 = 0;

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_22 = new Class202("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(CI)B")
	public static byte method706(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg3 && arg1 == arg4 && arg5 == arg8 && arg0 == arg6) {
			Static493.method7267(arg3, arg7, arg5, arg1, arg0);
			return;
		}
		@Pc(27) int local27 = arg3;
		@Pc(29) int local29 = arg1;
		@Pc(33) int local33 = arg3 * 3;
		@Pc(37) int local37 = arg1 * 3;
		@Pc(41) int local41 = arg2 * 3;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(53) int local53 = arg6 * 3;
		@Pc(63) int local63 = local41 + arg5 - local49 - arg3;
		@Pc(72) int local72 = local45 + arg0 - arg1 - local53;
		@Pc(81) int local81 = local33 + local49 - local41 - local41;
		@Pc(90) int local90 = local53 + local37 - local45 - local45;
		@Pc(95) int local95 = local41 - local33;
		@Pc(100) int local100 = local45 - local37;
		for (@Pc(102) int local102 = 128; local102 <= 4096; local102 += 128) {
			@Pc(110) int local110 = local102 * local102 >> 12;
			@Pc(116) int local116 = local102 * local110 >> 12;
			@Pc(120) int local120 = local116 * local63;
			@Pc(124) int local124 = local116 * local72;
			@Pc(128) int local128 = local110 * local81;
			@Pc(132) int local132 = local110 * local90;
			@Pc(136) int local136 = local102 * local95;
			@Pc(140) int local140 = local102 * local100;
			@Pc(151) int local151 = arg3 + (local136 + local120 + local128 >> 12);
			@Pc(162) int local162 = arg1 + (local140 + local124 + local132 >> 12);
			Static493.method7267(local27, arg7, local151, local29, local162);
			local29 = local162;
			local27 = local151;
		}
	}
}
