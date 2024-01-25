import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
	public static int anInt6790;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "[Lclient!vg;")
	public static Class201[] aClass201Array124;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "Lclient!jm;")
	public static Class103 aClass103_164 = new Class103();

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Z")
	public static boolean aBoolean591 = false;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "Lclient!om;")
	public static final Class153 aClass153_123 = new Class153();

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
	public static void method6002() {
		@Pc(12) Class109 local12 = Static176.aClass109_40;
		synchronized (Static176.aClass109_40) {
			Static176.aClass109_40.method2859(5);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public static void method6003(@OriginalArg(0) int arg0) {
		Static211.anInt4169 = -1;
		Static314.anInt6098 = arg0;
		Static211.anInt4169 = -1;
		Static255.method4513();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method6004() {
		if (Static27.aBoolean37) {
			return;
		}
		Static214.method3928(Static104.aClass174ArrayArrayArray2);
		if (Static52.aClass174ArrayArrayArray1 != null) {
			Static214.method3928(Static52.aClass174ArrayArrayArray1);
		}
		Static27.aBoolean37 = true;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZB)I")
	public static int method6007(@OriginalArg(0) boolean arg0) {
		@Pc(11) long local11 = Static340.method5863();
		for (@Pc(23) Class5_Sub28 local23 = arg0 ? (Class5_Sub28) Static276.aClass190_30.method5471() : (Class5_Sub28) Static276.aClass190_30.method5465(); local23 != null; local23 = (Class5_Sub28) Static276.aClass190_30.method5465()) {
			if (local11 > (local23.aLong159 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local23.aLong159 & 0x4000000000000000L) != 0L) {
					@Pc(48) int local48 = (int) local23.aLong235;
					Static134.anIntArray205[local48] = Static251.anIntArray486[local48];
					local23.method6005();
					return local48;
				}
				local23.method6005();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BC)B")
	public static byte method6009(@OriginalArg(1) char arg0) {
		@Pc(22) byte local22;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local22 = (byte) arg0;
		} else if (arg0 == '€') {
			local22 = -128;
		} else if (arg0 == '‚') {
			local22 = -126;
		} else if (arg0 == 'ƒ') {
			local22 = -125;
		} else if (arg0 == '„') {
			local22 = -124;
		} else if (arg0 == '…') {
			local22 = -123;
		} else if (arg0 == '†') {
			local22 = -122;
		} else if (arg0 == '‡') {
			local22 = -121;
		} else if (arg0 == 'ˆ') {
			local22 = -120;
		} else if (arg0 == '‰') {
			local22 = -119;
		} else if (arg0 == 'Š') {
			local22 = -118;
		} else if (arg0 == '‹') {
			local22 = -117;
		} else if (arg0 == 'Œ') {
			local22 = -116;
		} else if (arg0 == 'Ž') {
			local22 = -114;
		} else if (arg0 == '‘') {
			local22 = -111;
		} else if (arg0 == '’') {
			local22 = -110;
		} else if (arg0 == '“') {
			local22 = -109;
		} else if (arg0 == '”') {
			local22 = -108;
		} else if (arg0 == '•') {
			local22 = -107;
		} else if (arg0 == '–') {
			local22 = -106;
		} else if (arg0 == '—') {
			local22 = -105;
		} else if (arg0 == '˜') {
			local22 = -104;
		} else if (arg0 == '™') {
			local22 = -103;
		} else if (arg0 == 'š') {
			local22 = -102;
		} else if (arg0 == '›') {
			local22 = -101;
		} else if (arg0 == 'œ') {
			local22 = -100;
		} else if (arg0 == 'ž') {
			local22 = -98;
		} else if (arg0 == 'Ÿ') {
			local22 = -97;
		} else {
			local22 = 63;
		}
		return local22;
	}
}
