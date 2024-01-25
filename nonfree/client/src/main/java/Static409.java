import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array9;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_50 = new Class238();

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "Lclient!kg;")
	public static final Class188 aClass188_6 = new Class188("", 11);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)I")
	public static int method6284(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([BB)V")
	public static synchronized void method6285(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static553.anInt9134 < 1000) {
			Static625.aByteArrayArray27[Static553.anInt9134++] = arg0;
		} else if (arg0.length == 5000 && Static286.anInt7994 < 250) {
			Static476.aByteArrayArray17[Static286.anInt7994++] = arg0;
		} else if (arg0.length == 30000 && Static150.anInt3487 < 50) {
			Static474.aByteArrayArray16[Static150.anInt3487++] = arg0;
		} else if (Static23.aByteArrayArrayArray1 != null) {
			for (@Pc(71) int local71 = 0; local71 < Static239.anIntArray566.length; local71++) {
				if (Static239.anIntArray566[local71] == arg0.length && Static628.anIntArray727[local71] < Static23.aByteArrayArrayArray1[local71].length) {
					Static23.aByteArrayArrayArray1[local71][Static628.anIntArray727[local71]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6287(@OriginalArg(0) String arg0) {
		Static369.method5571("", "", arg0, 0, 0, "");
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)Z")
	public static boolean method6288(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BII)I")
	public static int method6289(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(41) int local41 = (arg0 & 0x7F) * 96 >> 7;
			if (local41 < 2) {
				local41 = 2;
			} else if (local41 > 126) {
				local41 = 126;
			}
			return local41 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method6290(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static553.anInt9134 > 0) {
			local21 = Static625.aByteArrayArray27[--Static553.anInt9134];
			Static625.aByteArrayArray27[Static553.anInt9134] = null;
			return local21;
		} else if (arg0 == 5000 && Static286.anInt7994 > 0) {
			local21 = Static476.aByteArrayArray17[--Static286.anInt7994];
			Static476.aByteArrayArray17[Static286.anInt7994] = null;
			return local21;
		} else if (arg0 == 30000 && Static150.anInt3487 > 0) {
			local21 = Static474.aByteArrayArray16[--Static150.anInt3487];
			Static474.aByteArrayArray16[Static150.anInt3487] = null;
			return local21;
		} else {
			if (Static23.aByteArrayArrayArray1 != null) {
				for (@Pc(79) int local79 = 0; local79 < Static239.anIntArray566.length; local79++) {
					if (arg0 == Static239.anIntArray566[local79] && Static628.anIntArray727[local79] > 0) {
						@Pc(109) byte[] local109 = Static23.aByteArrayArrayArray1[local79][--Static628.anIntArray727[local79]];
						Static23.aByteArrayArrayArray1[local79][Static628.anIntArray727[local79]] = null;
						return local109;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
