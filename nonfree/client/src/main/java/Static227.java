import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "Lclient!dk;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "Lclient!j;")
	public static final Class127 aClass127_3 = new Class127("LIVE", 0);

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
	public static int anInt3810 = -1;

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
	public static int anInt3811 = 0;

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_87 = new Class25(64, 1);

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Lclient!j;")
	public static Class127 method3104(@OriginalArg(0) int arg0) {
		@Pc(8) Class127[] local8 = Static154.method2313();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class127 local16 = local8[local10];
			if (arg0 == local16.anInt3340) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method3105(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(19) char local19 = arg0.charAt(local13);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				local11[local13] = (byte) local19;
			} else if (local19 == '€') {
				local11[local13] = -128;
			} else if (local19 == '‚') {
				local11[local13] = -126;
			} else if (local19 == 'ƒ') {
				local11[local13] = -125;
			} else if (local19 == '„') {
				local11[local13] = -124;
			} else if (local19 == '…') {
				local11[local13] = -123;
			} else if (local19 == '†') {
				local11[local13] = -122;
			} else if (local19 == '‡') {
				local11[local13] = -121;
			} else if (local19 == 'ˆ') {
				local11[local13] = -120;
			} else if (local19 == '‰') {
				local11[local13] = -119;
			} else if (local19 == 'Š') {
				local11[local13] = -118;
			} else if (local19 == '‹') {
				local11[local13] = -117;
			} else if (local19 == 'Œ') {
				local11[local13] = -116;
			} else if (local19 == 'Ž') {
				local11[local13] = -114;
			} else if (local19 == '‘') {
				local11[local13] = -111;
			} else if (local19 == '’') {
				local11[local13] = -110;
			} else if (local19 == '“') {
				local11[local13] = -109;
			} else if (local19 == '”') {
				local11[local13] = -108;
			} else if (local19 == '•') {
				local11[local13] = -107;
			} else if (local19 == '–') {
				local11[local13] = -106;
			} else if (local19 == '—') {
				local11[local13] = -105;
			} else if (local19 == '˜') {
				local11[local13] = -104;
			} else if (local19 == '™') {
				local11[local13] = -103;
			} else if (local19 == 'š') {
				local11[local13] = -102;
			} else if (local19 == '›') {
				local11[local13] = -101;
			} else if (local19 == 'œ') {
				local11[local13] = -100;
			} else if (local19 == 'ž') {
				local11[local13] = -98;
			} else if (local19 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)V")
	public static void method3106() {
		if (Static147.aClass75_7 != null) {
			Static147.aClass75_7.method5989();
			Static417.aClass14_4 = null;
			Static147.aClass75_7 = null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZIZ)V")
	public static void method3107(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class2_Sub12 local10 = Static92.method1397(arg0, arg1);
		if (local10 != null) {
			for (@Pc(20) int local20 = 0; local20 < local10.anIntArray212.length; local20++) {
				local10.anIntArray212[local20] = -1;
				local10.anIntArray213[local20] = 0;
			}
		}
	}
}
