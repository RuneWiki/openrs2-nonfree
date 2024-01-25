import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "F")
	public static float aFloat160;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_152 = new Class81(14, 8);

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "[I")
	public static final int[] anIntArray438 = new int[14];

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	public static void method5366() {
		@Pc(1) Class326 local1 = Static11.aClass326_1;
		synchronized (Static11.aClass326_1) {
			Static11.aClass326_1.method7234();
		}
		local1 = Static282.aClass326_26;
		synchronized (Static282.aClass326_26) {
			Static282.aClass326_26.method7234();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BC)B")
	public static byte method5367(@OriginalArg(1) char arg0) {
		@Pc(21) byte local21;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local21 = (byte) arg0;
		} else if (arg0 == '€') {
			local21 = -128;
		} else if (arg0 == '‚') {
			local21 = -126;
		} else if (arg0 == 'ƒ') {
			local21 = -125;
		} else if (arg0 == '„') {
			local21 = -124;
		} else if (arg0 == '…') {
			local21 = -123;
		} else if (arg0 == '†') {
			local21 = -122;
		} else if (arg0 == '‡') {
			local21 = -121;
		} else if (arg0 == 'ˆ') {
			local21 = -120;
		} else if (arg0 == '‰') {
			local21 = -119;
		} else if (arg0 == 'Š') {
			local21 = -118;
		} else if (arg0 == '‹') {
			local21 = -117;
		} else if (arg0 == 'Œ') {
			local21 = -116;
		} else if (arg0 == 'Ž') {
			local21 = -114;
		} else if (arg0 == '‘') {
			local21 = -111;
		} else if (arg0 == '’') {
			local21 = -110;
		} else if (arg0 == '“') {
			local21 = -109;
		} else if (arg0 == '”') {
			local21 = -108;
		} else if (arg0 == '•') {
			local21 = -107;
		} else if (arg0 == '–') {
			local21 = -106;
		} else if (arg0 == '—') {
			local21 = -105;
		} else if (arg0 == '˜') {
			local21 = -104;
		} else if (arg0 == '™') {
			local21 = -103;
		} else if (arg0 == 'š') {
			local21 = -102;
		} else if (arg0 == '›') {
			local21 = -101;
		} else if (arg0 == 'œ') {
			local21 = -100;
		} else if (arg0 == 'ž') {
			local21 = -98;
		} else if (arg0 == 'Ÿ') {
			local21 = -97;
		} else {
			local21 = 63;
		}
		return local21;
	}
}
