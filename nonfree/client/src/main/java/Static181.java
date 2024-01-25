import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
	public static int anInt3243;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_57 = new Class186(39, -2);

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "Z")
	public static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIBII)I")
	public static int method2787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22 = 65536 - Class3_Sub2_Sub21.anIntArray356[arg3 * 8192 / arg2] >> 1;
		return (local22 * arg0 >> 16) + ((65536 - local22) * arg1 >> 16);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(JIB)Ljava/lang/String;")
	public static String method2789(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static490.method7108(arg0);
		@Pc(10) int local10 = Static321.aCalendar10.get(5);
		@Pc(22) int local22 = Static321.aCalendar10.get(2) + 1;
		@Pc(26) int local26 = Static321.aCalendar10.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local22 / 10 + local22 % 10 + "/" + local26 % 100 / 10 + local26 % 10;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method2790(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static476.aClass279_33.method6992(Static141.anInt2658) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static476.aClass279_35.method6992(Static141.anInt2658) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IC)B")
	public static byte method2791(@OriginalArg(1) char arg0) {
		@Pc(46) byte local46;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local46 = (byte) arg0;
		} else if (arg0 == '€') {
			local46 = -128;
		} else if (arg0 == '‚') {
			local46 = -126;
		} else if (arg0 == 'ƒ') {
			local46 = -125;
		} else if (arg0 == '„') {
			local46 = -124;
		} else if (arg0 == '…') {
			local46 = -123;
		} else if (arg0 == '†') {
			local46 = -122;
		} else if (arg0 == '‡') {
			local46 = -121;
		} else if (arg0 == 'ˆ') {
			local46 = -120;
		} else if (arg0 == '‰') {
			local46 = -119;
		} else if (arg0 == 'Š') {
			local46 = -118;
		} else if (arg0 == '‹') {
			local46 = -117;
		} else if (arg0 == 'Œ') {
			local46 = -116;
		} else if (arg0 == 'Ž') {
			local46 = -114;
		} else if (arg0 == '‘') {
			local46 = -111;
		} else if (arg0 == '’') {
			local46 = -110;
		} else if (arg0 == '“') {
			local46 = -109;
		} else if (arg0 == '”') {
			local46 = -108;
		} else if (arg0 == '•') {
			local46 = -107;
		} else if (arg0 == '–') {
			local46 = -106;
		} else if (arg0 == '—') {
			local46 = -105;
		} else if (arg0 == '˜') {
			local46 = -104;
		} else if (arg0 == '™') {
			local46 = -103;
		} else if (arg0 == 'š') {
			local46 = -102;
		} else if (arg0 == '›') {
			local46 = -101;
		} else if (arg0 == 'œ') {
			local46 = -100;
		} else if (arg0 == 'ž') {
			local46 = -98;
		} else if (arg0 == 'Ÿ') {
			local46 = -97;
		} else {
			local46 = 63;
		}
		return local46;
	}
}
