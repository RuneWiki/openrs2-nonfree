import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!rd;")
	public static final Class293 aClass293_1 = Static448.method6298();

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Z")
	public static boolean aBoolean596 = false;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method6282(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZIIB)V")
	public static void method6284(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static154.aLong76 = 0L;
		@Pc(8) int local8 = Static470.method2475();
		if (arg2 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (!Static31.aClass78_18.method6828()) {
			arg1 = true;
		}
		Static266.method3885(arg0, arg2, local8, arg1, arg3);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!fa;Ljava/awt/Canvas;B)Lclient!r;")
	public static Class78 method6285(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Canvas arg1) {
		return new l(arg1, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!ir;")
	public static Class1_Sub8_Sub6 method6286(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub8_Sub6 local10 = (Class1_Sub8_Sub6) Static319.aClass16_3.method471((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static220.aClass308_111.method6569(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static236.method7223(local20);
		} catch (@Pc(36) Exception local36) {
			throw new RuntimeException(local36.getMessage() + " S: " + arg0);
		}
		Static319.aClass16_3.method476((long) arg0, local10);
		return local10;
	}
}
