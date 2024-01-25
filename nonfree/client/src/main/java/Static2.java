import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "J", descriptor = "[Z")
	public static final boolean[] aBooleanArray32 = new boolean[200];

	@OriginalMember(owner = "client!aaa", name = "P", descriptor = "[I")
	public static final int[] anIntArray660 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!aaa", name = "R", descriptor = "I")
	public static final int anInt10014 = 52;

	@OriginalMember(owner = "client!aaa", name = "Z", descriptor = "Lclient!ul;")
	public static final Class357 aClass357_28 = new Class357("", 15);

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method8463(@OriginalArg(1) String arg0) {
		if (Class344.aString133.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class344.aString133.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class344.aString133.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(II)I")
	public static int method8466(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(CI)B")
	public static byte method8467(@OriginalArg(0) char arg0) {
		@Pc(43) byte local43;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local43 = (byte) arg0;
		} else if (arg0 == '€') {
			local43 = -128;
		} else if (arg0 == '‚') {
			local43 = -126;
		} else if (arg0 == 'ƒ') {
			local43 = -125;
		} else if (arg0 == '„') {
			local43 = -124;
		} else if (arg0 == '…') {
			local43 = -123;
		} else if (arg0 == '†') {
			local43 = -122;
		} else if (arg0 == '‡') {
			local43 = -121;
		} else if (arg0 == 'ˆ') {
			local43 = -120;
		} else if (arg0 == '‰') {
			local43 = -119;
		} else if (arg0 == 'Š') {
			local43 = -118;
		} else if (arg0 == '‹') {
			local43 = -117;
		} else if (arg0 == 'Œ') {
			local43 = -116;
		} else if (arg0 == 'Ž') {
			local43 = -114;
		} else if (arg0 == '‘') {
			local43 = -111;
		} else if (arg0 == '’') {
			local43 = -110;
		} else if (arg0 == '“') {
			local43 = -109;
		} else if (arg0 == '”') {
			local43 = -108;
		} else if (arg0 == '•') {
			local43 = -107;
		} else if (arg0 == '–') {
			local43 = -106;
		} else if (arg0 == '—') {
			local43 = -105;
		} else if (arg0 == '˜') {
			local43 = -104;
		} else if (arg0 == '™') {
			local43 = -103;
		} else if (arg0 == 'š') {
			local43 = -102;
		} else if (arg0 == '›') {
			local43 = -101;
		} else if (arg0 == 'œ') {
			local43 = -100;
		} else if (arg0 == 'ž') {
			local43 = -98;
		} else if (arg0 == 'Ÿ') {
			local43 = -97;
		} else {
			local43 = 63;
		}
		return local43;
	}

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "(B)V")
	public static void method8468() {
		Static614.aClass290Array1 = null;
	}
}
