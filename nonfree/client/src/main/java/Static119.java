import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	public static int anInt3131 = 0;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!ld;")
	public static Class47 aClass47_24 = new Class47(64);

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1050 = Static161.method2971("(U4");

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "Lclient!ld;")
	public static Class47 aClass47_25 = new Class47(5);

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	public static int anInt3146 = 0;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1051 = Static161.method2971("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lclient!fd;")
	public static Class20 method2230(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(11) int local11 = arg0 >> 16;
		if (Static145.aClass20ArrayArray1[local11] == null || Static145.aClass20ArrayArray1[local11][local7] == null) {
			@Pc(25) boolean local25 = Static171.method2892(local11);
			if (!local25) {
				return null;
			}
		}
		return Static145.aClass20ArrayArray1[local11][local7];
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method2231() {
		@Pc(12) Class23 local12 = Static99.aClass23_1;
		synchronized (Static99.aClass23_1) {
			Static165.anInt3887 = Static157.anInt3721;
			@Pc(27) int local27;
			if (Static70.anInt2007 >= 0) {
				while (Static70.anInt2007 != Static78.anInt2175) {
					local27 = Static64.anIntArray198[Static78.anInt2175];
					Static78.anInt2175 = Static78.anInt2175 + 1 & 0x7F;
					if (local27 >= 0) {
						Static176.aBooleanArray53[local27] = true;
					} else {
						Static176.aBooleanArray53[~local27] = false;
					}
				}
			} else {
				for (local27 = 0; local27 < 112; local27++) {
					Static176.aBooleanArray53[local27] = false;
				}
				Static70.anInt2007 = Static78.anInt2175;
			}
			Static157.anInt3721 = Static103.anInt2854;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
	public static void method2232(@OriginalArg(1) int arg0) {
		Static154.anInt3651 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method2233() {
		aClass13_1051 = null;
		aClass47_25 = null;
		aClass13_1050 = null;
		aClass47_24 = null;
	}
}
