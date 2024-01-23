import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!kg;")
	public static Class4_Sub2_Sub12_Sub1 aClass4_Sub2_Sub12_Sub1_2;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BC)B")
	public static byte method482(@OriginalArg(1) char arg0) {
		@Pc(39) byte local39;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local39 = (byte) arg0;
		} else if (arg0 == '€') {
			local39 = -128;
		} else if (arg0 == '‚') {
			local39 = -126;
		} else if (arg0 == 'ƒ') {
			local39 = -125;
		} else if (arg0 == '„') {
			local39 = -124;
		} else if (arg0 == '…') {
			local39 = -123;
		} else if (arg0 == '†') {
			local39 = -122;
		} else if (arg0 == '‡') {
			local39 = -121;
		} else if (arg0 == 'ˆ') {
			local39 = -120;
		} else if (arg0 == '‰') {
			local39 = -119;
		} else if (arg0 == 'Š') {
			local39 = -118;
		} else if (arg0 == '‹') {
			local39 = -117;
		} else if (arg0 == 'Œ') {
			local39 = -116;
		} else if (arg0 == 'Ž') {
			local39 = -114;
		} else if (arg0 == '‘') {
			local39 = -111;
		} else if (arg0 == '’') {
			local39 = -110;
		} else if (arg0 == '“') {
			local39 = -109;
		} else if (arg0 == '”') {
			local39 = -108;
		} else if (arg0 == '•') {
			local39 = -107;
		} else if (arg0 == '–') {
			local39 = -106;
		} else if (arg0 == '—') {
			local39 = -105;
		} else if (arg0 == '˜') {
			local39 = -104;
		} else if (arg0 == '™') {
			local39 = -103;
		} else if (arg0 == 'š') {
			local39 = -102;
		} else if (arg0 == '›') {
			local39 = -101;
		} else if (arg0 == 'œ') {
			local39 = -100;
		} else if (arg0 == 'ž') {
			local39 = -98;
		} else if (arg0 == 'Ÿ') {
			local39 = -97;
		} else {
			local39 = 63;
		}
		return local39;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public static void method483() {
		aClass4_Sub2_Sub12_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
	public static void method484(@OriginalArg(0) int arg0) {
		Static291.method4313(Static291.anInt5435, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static291.method4317(-50.0F, -60.0F, -50.0F);
		Static291.method4312(Static291.anInt5436, 0, false);
		Static291.method4311();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method486() {
		Static151.aClass33_26.method839();
	}
}
