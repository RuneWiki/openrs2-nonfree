import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray138;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public static int anInt6113;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "Lclient!kb;")
	public static Class83 aClass83_201;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
	public static int anInt6119 = 0;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "[I")
	public static int[] anIntArray606 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBI)V")
	public static void method4738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2_Sub6 local12 = Static104.method831(arg0, 6);
		local12.method1192();
		local12.anInt1565 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4739(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = Static84.method1484(arg0);
		if (local15 != -1) {
			@Pc(47) int[] local47 = Static176.aClass1_Sub2_Sub9_2.method1638(Static159.aClass78_2.anIntArray264[local15] >> 28 & 0x3, Static159.aClass78_2.anIntArray264[local15] & 0x3FFF, Static159.aClass78_2.anIntArray264[local15] >> 14 & 0x3FFF);
			Static169.method3142(local47[2], local47[1]);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4741(@OriginalArg(1) int arg0) {
		@Pc(4) String local4 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local4.length() - 3; local13 > 0; local13 -= 3) {
			local4 = local4.substring(0, local13) + "," + local4.substring(local13);
		}
		if (local4.length() <= 9) {
			return local4.length() <= 6 ? " <col=ffff00>" + local4 + "</col>" : " <col=ffffff>" + local4.substring(0, local4.length() - 4) + Static271.aString191 + " (" + local4 + ")</col>";
		} else {
			return " <col=00ff80>" + local4.substring(0, local4.length() - 8) + Static25.aString18 + " (" + local4 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BC)B")
	public static byte method4744(@OriginalArg(1) char arg0) {
		@Pc(35) byte local35;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local35 = (byte) arg0;
		} else if (arg0 == '€') {
			local35 = -128;
		} else if (arg0 == '‚') {
			local35 = -126;
		} else if (arg0 == 'ƒ') {
			local35 = -125;
		} else if (arg0 == '„') {
			local35 = -124;
		} else if (arg0 == '…') {
			local35 = -123;
		} else if (arg0 == '†') {
			local35 = -122;
		} else if (arg0 == '‡') {
			local35 = -121;
		} else if (arg0 == 'ˆ') {
			local35 = -120;
		} else if (arg0 == '‰') {
			local35 = -119;
		} else if (arg0 == 'Š') {
			local35 = -118;
		} else if (arg0 == '‹') {
			local35 = -117;
		} else if (arg0 == 'Œ') {
			local35 = -116;
		} else if (arg0 == 'Ž') {
			local35 = -114;
		} else if (arg0 == '‘') {
			local35 = -111;
		} else if (arg0 == '’') {
			local35 = -110;
		} else if (arg0 == '“') {
			local35 = -109;
		} else if (arg0 == '”') {
			local35 = -108;
		} else if (arg0 == '•') {
			local35 = -107;
		} else if (arg0 == '–') {
			local35 = -106;
		} else if (arg0 == '—') {
			local35 = -105;
		} else if (arg0 == '˜') {
			local35 = -104;
		} else if (arg0 == '™') {
			local35 = -103;
		} else if (arg0 == 'š') {
			local35 = -102;
		} else if (arg0 == '›') {
			local35 = -101;
		} else if (arg0 == 'œ') {
			local35 = -100;
		} else if (arg0 == 'ž') {
			local35 = -98;
		} else if (arg0 == 'Ÿ') {
			local35 = -97;
		} else {
			local35 = 63;
		}
		return local35;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;B)I")
	public static int method4745(@OriginalArg(1) String arg0) {
		return Static82.method1472(16, arg0);
	}
}
