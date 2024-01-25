import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!o", name = "X", descriptor = "I")
	public static int anInt4322;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_73 = new Class66(20);

	@OriginalMember(owner = "client!o", name = "S", descriptor = "I")
	public static int anInt4318 = 0;

	@OriginalMember(owner = "client!o", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString250 = " ";

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "[I")
	public static final int[] anIntArray306 = new int[1000];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILjava/lang/String;[BII)I")
	public static int method3817(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3) {
		@Pc(10) int local10 = arg3;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg1.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg2[local12 + arg0] = (byte) local20;
			} else if (local20 == '€') {
				arg2[local12 + arg0] = -128;
			} else if (local20 == '‚') {
				arg2[local12 + arg0] = -126;
			} else if (local20 == 'ƒ') {
				arg2[arg0 + local12] = -125;
			} else if (local20 == '„') {
				arg2[local12 + arg0] = -124;
			} else if (local20 == '…') {
				arg2[local12 + arg0] = -123;
			} else if (local20 == '†') {
				arg2[arg0 + local12] = -122;
			} else if (local20 == '‡') {
				arg2[local12 + arg0] = -121;
			} else if (local20 == 'ˆ') {
				arg2[arg0 + local12] = -120;
			} else if (local20 == '‰') {
				arg2[arg0 + local12] = -119;
			} else if (local20 == 'Š') {
				arg2[arg0 + local12] = -118;
			} else if (local20 == '‹') {
				arg2[local12 + arg0] = -117;
			} else if (local20 == 'Œ') {
				arg2[arg0 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg2[arg0 + local12] = -114;
			} else if (local20 == '‘') {
				arg2[local12 + arg0] = -111;
			} else if (local20 == '’') {
				arg2[local12 + arg0] = -110;
			} else if (local20 == '“') {
				arg2[arg0 + local12] = -109;
			} else if (local20 == '”') {
				arg2[local12 + arg0] = -108;
			} else if (local20 == '•') {
				arg2[local12 + arg0] = -107;
			} else if (local20 == '–') {
				arg2[local12 + arg0] = -106;
			} else if (local20 == '—') {
				arg2[local12 + arg0] = -105;
			} else if (local20 == '˜') {
				arg2[arg0 + local12] = -104;
			} else if (local20 == '™') {
				arg2[local12 + arg0] = -103;
			} else if (local20 == 'š') {
				arg2[local12 + arg0] = -102;
			} else if (local20 == '›') {
				arg2[arg0 + local12] = -101;
			} else if (local20 == 'œ') {
				arg2[arg0 + local12] = -100;
			} else if (local20 == 'ž') {
				arg2[local12 + arg0] = -98;
			} else if (local20 == 'Ÿ') {
				arg2[arg0 + local12] = -97;
			} else {
				arg2[local12 + arg0] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
	public static void method3818() {
		Static161.anImage3 = null;
		Static8.aFont1 = null;
	}

	@OriginalMember(owner = "client!o", name = "j", descriptor = "(I)Lclient!lk;")
	public static Class79 method3822() {
		try {
			return (Class79) Class.forName("Class79_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(B)V")
	public static void method3823() {
		if (Static290.anInt5566 <= 0) {
			Static236.aString265 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static206.aStringArray28.length; local7++) {
			if (Static206.aStringArray28[local7].startsWith("--> ")) {
				local5++;
				if (local5 == Static290.anInt5566) {
					Static236.aString265 = Static206.aStringArray28[local7].substring(4);
					break;
				}
			}
		}
	}
}
