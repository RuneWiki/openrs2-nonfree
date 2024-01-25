import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	public static int anInt2806;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "Lclient!mg;")
	public static Class214 aClass214_1;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_5 = new Class181(13, 3);

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!sj;")
	public static final Class296 aClass296_1 = new Class296();

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "J")
	public static long aLong134 = -1L;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
	public static void method2364() {
		for (@Pc(6) Class20_Sub6 local6 = (Class20_Sub6) Static334.aClass349_9.method7658(); local6 != null; local6 = (Class20_Sub6) Static334.aClass349_9.method7658()) {
			Static584.method7819(local6);
		}
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609)) {
			local33 = 3;
			local35 = 0;
		} else {
			local33 = Static296.anInt5478;
			local35 = Static296.anInt5478;
		}
		Static72.method1559();
		for (@Pc(44) int local44 = local35; local44 <= local33; local44++) {
			Static72.method1570();
			Static72.method1558(local44);
			Static72.method1564(local44);
		}
		Static72.method1563();
		Static72.method1560();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIBII)V")
	public static void method2366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class20_Sub10 local10 = (Class20_Sub10) Static456.aClass349_13.method7653(); local10 != null; local10 = (Class20_Sub10) Static456.aClass349_13.method7660()) {
			if (local10.anInt9321 <= Static81.anInt1910) {
				local10.method7704();
			} else {
				Static559.method7537(local10.anInt9320, arg2 >> 1, local10.anInt9317 * 2, arg0 >> 1, (local10.anInt9323 << 9) + 256, (local10.anInt9319 << 9) + 256);
				Static260.aClass35_7.method4942(0, Static480.anIntArray537[0] + arg1, local10.anInt9318 | 0xFF000000, local10.aString93, Static480.anIntArray537[1] + arg3);
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method2367(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}
}
