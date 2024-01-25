import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[Lclient!ya;")
	public static Class125[] aClass125Array2;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!cr;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
	public static boolean aBoolean459 = false;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([BIIILjava/lang/String;I)I")
	public static int method5395(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg2.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[arg3 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg0[local17 + arg3] = -128;
			} else if (local25 == '‚') {
				arg0[arg3 + local17] = -126;
			} else if (local25 == 'ƒ') {
				arg0[local17 + arg3] = -125;
			} else if (local25 == '„') {
				arg0[arg3 + local17] = -124;
			} else if (local25 == '…') {
				arg0[local17 + arg3] = -123;
			} else if (local25 == '†') {
				arg0[arg3 + local17] = -122;
			} else if (local25 == '‡') {
				arg0[arg3 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg0[local17 + arg3] = -120;
			} else if (local25 == '‰') {
				arg0[local17 + arg3] = -119;
			} else if (local25 == 'Š') {
				arg0[arg3 + local17] = -118;
			} else if (local25 == '‹') {
				arg0[local17 + arg3] = -117;
			} else if (local25 == 'Œ') {
				arg0[arg3 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg0[local17 + arg3] = -114;
			} else if (local25 == '‘') {
				arg0[arg3 + local17] = -111;
			} else if (local25 == '’') {
				arg0[arg3 + local17] = -110;
			} else if (local25 == '“') {
				arg0[local17 + arg3] = -109;
			} else if (local25 == '”') {
				arg0[arg3 + local17] = -108;
			} else if (local25 == '•') {
				arg0[local17 + arg3] = -107;
			} else if (local25 == '–') {
				arg0[local17 + arg3] = -106;
			} else if (local25 == '—') {
				arg0[arg3 + local17] = -105;
			} else if (local25 == '˜') {
				arg0[local17 + arg3] = -104;
			} else if (local25 == '™') {
				arg0[arg3 + local17] = -103;
			} else if (local25 == 'š') {
				arg0[arg3 + local17] = -102;
			} else if (local25 == '›') {
				arg0[arg3 + local17] = -101;
			} else if (local25 == 'œ') {
				arg0[local17 + arg3] = -100;
			} else if (local25 == 'ž') {
				arg0[local17 + arg3] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[local17 + arg3] = -97;
			} else {
				arg0[arg3 + local17] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
	public static boolean method5397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static20.anInt423; local1++) {
			@Pc(6) Class247 local6 = Static323.aClass247Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt7105 == 1) {
				local15 = local6.anInt7102 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt7098 + (local6.anInt7099 * local15 >> 8);
					local37 = local6.anInt7112 + (local6.anInt7110 * local15 >> 8);
					local47 = local6.anInt7109 + (local6.anInt7100 * local15 >> 8);
					local57 = local6.anInt7103 + (local6.anInt7111 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7105 == 2) {
				local15 = arg0 - local6.anInt7102;
				if (local15 > 0) {
					local27 = local6.anInt7098 + (local6.anInt7099 * local15 >> 8);
					local37 = local6.anInt7112 + (local6.anInt7110 * local15 >> 8);
					local47 = local6.anInt7109 + (local6.anInt7100 * local15 >> 8);
					local57 = local6.anInt7103 + (local6.anInt7111 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7105 == 3) {
				local15 = local6.anInt7098 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt7102 + (local6.anInt7104 * local15 >> 8);
					local37 = local6.anInt7108 + (local6.anInt7107 * local15 >> 8);
					local47 = local6.anInt7109 + (local6.anInt7100 * local15 >> 8);
					local57 = local6.anInt7103 + (local6.anInt7111 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7105 == 4) {
				local15 = arg2 - local6.anInt7098;
				if (local15 > 0) {
					local27 = local6.anInt7102 + (local6.anInt7104 * local15 >> 8);
					local37 = local6.anInt7108 + (local6.anInt7107 * local15 >> 8);
					local47 = local6.anInt7109 + (local6.anInt7100 * local15 >> 8);
					local57 = local6.anInt7103 + (local6.anInt7111 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7105 == 5) {
				local15 = arg1 - local6.anInt7109;
				if (local15 > 0) {
					local27 = local6.anInt7102 + (local6.anInt7104 * local15 >> 8);
					local37 = local6.anInt7108 + (local6.anInt7107 * local15 >> 8);
					local47 = local6.anInt7098 + (local6.anInt7099 * local15 >> 8);
					local57 = local6.anInt7112 + (local6.anInt7110 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
