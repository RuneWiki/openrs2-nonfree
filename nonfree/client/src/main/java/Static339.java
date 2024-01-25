import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!r", name = "f", descriptor = "I")
	public static int anInt5516;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "I")
	public static int anInt5517;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "[Lclient!wc;")
	public static final Class124_Sub1[] aClass124_Sub1Array2 = new Class124_Sub1[30];

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "[I")
	public static final int[] anIntArray442 = new int[8];

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!pc;I)V")
	public static void method4485(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class196 arg1) {
		while (true) {
			@Pc(6) Class45 local6 = arg1.method3917(arg0);
			while (local6.anInt1129 == 0) {
				Static435.method5777(10L);
			}
			if (local6.anInt1129 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static435.method5777(100L);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)I")
	public static int method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == arg2) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = (arg1 & 0x7F) * arg0 + (arg2 & 0x7F) * local17 >> 7;
		@Pc(50) int local50 = (arg1 & 0x380) * arg0 + (arg2 & 0x380) * local17 >> 7;
		@Pc(64) int local64 = (arg1 & 0xFC00) * arg0 + local17 * (arg2 & 0xFC00) >> 7;
		return local64 & 0xFC00 | local50 & 0x380 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(CZ)B")
	public static byte method4488(@OriginalArg(0) char arg0) {
		@Pc(33) byte local33;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local33 = (byte) arg0;
		} else if (arg0 == '€') {
			local33 = -128;
		} else if (arg0 == '‚') {
			local33 = -126;
		} else if (arg0 == 'ƒ') {
			local33 = -125;
		} else if (arg0 == '„') {
			local33 = -124;
		} else if (arg0 == '…') {
			local33 = -123;
		} else if (arg0 == '†') {
			local33 = -122;
		} else if (arg0 == '‡') {
			local33 = -121;
		} else if (arg0 == 'ˆ') {
			local33 = -120;
		} else if (arg0 == '‰') {
			local33 = -119;
		} else if (arg0 == 'Š') {
			local33 = -118;
		} else if (arg0 == '‹') {
			local33 = -117;
		} else if (arg0 == 'Œ') {
			local33 = -116;
		} else if (arg0 == 'Ž') {
			local33 = -114;
		} else if (arg0 == '‘') {
			local33 = -111;
		} else if (arg0 == '’') {
			local33 = -110;
		} else if (arg0 == '“') {
			local33 = -109;
		} else if (arg0 == '”') {
			local33 = -108;
		} else if (arg0 == '•') {
			local33 = -107;
		} else if (arg0 == '–') {
			local33 = -106;
		} else if (arg0 == '—') {
			local33 = -105;
		} else if (arg0 == '˜') {
			local33 = -104;
		} else if (arg0 == '™') {
			local33 = -103;
		} else if (arg0 == 'š') {
			local33 = -102;
		} else if (arg0 == '›') {
			local33 = -101;
		} else if (arg0 == 'œ') {
			local33 = -100;
		} else if (arg0 == 'ž') {
			local33 = -98;
		} else if (arg0 == 'Ÿ') {
			local33 = -97;
		} else {
			local33 = 63;
		}
		return local33;
	}
}
