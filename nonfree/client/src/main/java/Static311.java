import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!wm;")
	public static Class396 aClass396_3;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "[I")
	public static final int[] anIntArray317 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Lclient!ko;")
	public static final Class208 aClass208_4 = new Class208("", 11);

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "Lclient!eea;")
	public static Class5_Sub16 aClass5_Sub16_1 = null;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
	public static final int[] anIntArray318 = new int[13];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBILjava/lang/String;I[B)I")
	public static int method4808(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(29) char local29 = arg1.charAt(local19);
			if (local29 > '\u0000' && local29 < '\u0080' || !(local29 < ' ' || local29 > 'ÿ')) {
				arg3[local19 + arg0] = (byte) local29;
			} else if (local29 == '€') {
				arg3[arg0 + local19] = -128;
			} else if (local29 == '‚') {
				arg3[arg0 + local19] = -126;
			} else if (local29 == 'ƒ') {
				arg3[arg0 + local19] = -125;
			} else if (local29 == '„') {
				arg3[local19 + arg0] = -124;
			} else if (local29 == '…') {
				arg3[local19 + arg0] = -123;
			} else if (local29 == '†') {
				arg3[local19 + arg0] = -122;
			} else if (local29 == '‡') {
				arg3[local19 + arg0] = -121;
			} else if (local29 == 'ˆ') {
				arg3[local19 + arg0] = -120;
			} else if (local29 == '‰') {
				arg3[arg0 + local19] = -119;
			} else if (local29 == 'Š') {
				arg3[local19 + arg0] = -118;
			} else if (local29 == '‹') {
				arg3[arg0 + local19] = -117;
			} else if (local29 == 'Œ') {
				arg3[local19 + arg0] = -116;
			} else if (local29 == 'Ž') {
				arg3[local19 + arg0] = -114;
			} else if (local29 == '‘') {
				arg3[local19 + arg0] = -111;
			} else if (local29 == '’') {
				arg3[arg0 + local19] = -110;
			} else if (local29 == '“') {
				arg3[arg0 + local19] = -109;
			} else if (local29 == '”') {
				arg3[local19 + arg0] = -108;
			} else if (local29 == '•') {
				arg3[local19 + arg0] = -107;
			} else if (local29 == '–') {
				arg3[local19 + arg0] = -106;
			} else if (local29 == '—') {
				arg3[local19 + arg0] = -105;
			} else if (local29 == '˜') {
				arg3[arg0 + local19] = -104;
			} else if (local29 == '™') {
				arg3[local19 + arg0] = -103;
			} else if (local29 == 'š') {
				arg3[local19 + arg0] = -102;
			} else if (local29 == '›') {
				arg3[local19 + arg0] = -101;
			} else if (local29 == 'œ') {
				arg3[local19 + arg0] = -100;
			} else if (local29 == 'ž') {
				arg3[local19 + arg0] = -98;
			} else if (local29 == 'Ÿ') {
				arg3[arg0 + local19] = -97;
			} else {
				arg3[arg0 + local19] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method4809(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(63) char local63;
			if (local17 == '\u0000') {
				local63 = arg2.charAt(local13++);
			} else {
				local63 = local17;
			}
			@Pc(76) char local76;
			if (local19 == '\u0000') {
				local76 = arg1.charAt(local15++);
			} else {
				local76 = local19;
			}
			local17 = Static476.method6743(local63);
			local19 = Static476.method6743(local76);
			local63 = Static405.method9204(local63, arg0);
			local76 = Static405.method9204(local76, arg0);
			if (local76 != local63 && Character.toUpperCase(local63) != Character.toUpperCase(local76)) {
				local63 = Character.toLowerCase(local63);
				local76 = Character.toLowerCase(local76);
				if (local76 != local63) {
					return Static129.method1924(local63, arg0) - Static129.method1924(local76, arg0);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local8, local11);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg0 == 2) {
				local13 = local8 - local140 - 1;
				local15 = local11 - local140 - 1;
			} else {
				local15 = local140;
				local13 = local140;
			}
			@Pc(170) char local170 = arg2.charAt(local13);
			@Pc(174) char local174 = arg1.charAt(local15);
			if (local174 != local170 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local174 != local170) {
					return Static129.method1924(local170, arg0) - Static129.method1924(local174, arg0);
				}
			}
		}
		@Pc(221) int local221 = local8 - local11;
		if (local221 != 0) {
			return local221;
		}
		for (@Pc(231) int local231 = 0; local231 < local138; local231++) {
			@Pc(239) char local239 = arg2.charAt(local231);
			@Pc(243) char local243 = arg1.charAt(local231);
			if (local243 != local239) {
				return Static129.method1924(local239, arg0) - Static129.method1924(local243, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Z")
	public static boolean method4810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return (arg1 & 0x180) != 0;
	}
}
