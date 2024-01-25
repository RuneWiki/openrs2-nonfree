import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "Lclient!ms;")
	public static Class137 aClass137_15;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "[I")
	public static final int[] anIntArray379 = new int[32];

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString46 = null;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(BI)I")
	public static int method4231(@OriginalArg(1) int arg0) {
		@Pc(12) Class208 local12 = Static66.method1708(arg0);
		@Pc(15) int local15 = local12.anInt6542;
		@Pc(18) int local18 = local12.anInt6544;
		@Pc(21) int local21 = local12.anInt6548;
		@Pc(28) int local28 = Class174.anIntArray413[local21 - local18];
		return local28 & Static198.anIntArray311[local15] >> local18;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)I")
	public static int method4232(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!ja;)Lclient!uo;")
	public static Class129 method4235(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface2 arg2) {
		return new Class129_Sub1(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V")
	public static void method4236() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static292.aBooleanArray22[local12] = true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BIIILjava/lang/String;)I")
	public static int method4237(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(20) int local20 = arg1;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(30) char local30 = arg3.charAt(local22);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				arg0[arg2 + local22] = (byte) local30;
			} else if (local30 == '€') {
				arg0[local22 + arg2] = -128;
			} else if (local30 == '‚') {
				arg0[arg2 + local22] = -126;
			} else if (local30 == 'ƒ') {
				arg0[local22 + arg2] = -125;
			} else if (local30 == '„') {
				arg0[arg2 + local22] = -124;
			} else if (local30 == '…') {
				arg0[local22 + arg2] = -123;
			} else if (local30 == '†') {
				arg0[local22 + arg2] = -122;
			} else if (local30 == '‡') {
				arg0[local22 + arg2] = -121;
			} else if (local30 == 'ˆ') {
				arg0[arg2 + local22] = -120;
			} else if (local30 == '‰') {
				arg0[local22 + arg2] = -119;
			} else if (local30 == 'Š') {
				arg0[arg2 + local22] = -118;
			} else if (local30 == '‹') {
				arg0[local22 + arg2] = -117;
			} else if (local30 == 'Œ') {
				arg0[local22 + arg2] = -116;
			} else if (local30 == 'Ž') {
				arg0[arg2 + local22] = -114;
			} else if (local30 == '‘') {
				arg0[arg2 + local22] = -111;
			} else if (local30 == '’') {
				arg0[local22 + arg2] = -110;
			} else if (local30 == '“') {
				arg0[arg2 + local22] = -109;
			} else if (local30 == '”') {
				arg0[arg2 + local22] = -108;
			} else if (local30 == '•') {
				arg0[arg2 + local22] = -107;
			} else if (local30 == '–') {
				arg0[arg2 + local22] = -106;
			} else if (local30 == '—') {
				arg0[arg2 + local22] = -105;
			} else if (local30 == '˜') {
				arg0[local22 + arg2] = -104;
			} else if (local30 == '™') {
				arg0[local22 + arg2] = -103;
			} else if (local30 == 'š') {
				arg0[arg2 + local22] = -102;
			} else if (local30 == '›') {
				arg0[local22 + arg2] = -101;
			} else if (local30 == 'œ') {
				arg0[local22 + arg2] = -100;
			} else if (local30 == 'ž') {
				arg0[arg2 + local22] = -98;
			} else if (local30 == 'Ÿ') {
				arg0[local22 + arg2] = -97;
			} else {
				arg0[local22 + arg2] = 63;
			}
		}
		return local20;
	}
}
