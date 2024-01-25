import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	public static int anInt3414;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_58 = new Class215(13, -2);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Z")
	public static boolean method3123() {
		@Pc(7) boolean local7 = true;
		if (Static14.aClass296_2 == null) {
			if (Static214.aClass157_106.method4575(Static507.anInt9339)) {
				Static14.aClass296_2 = Static652.method7574(Static214.aClass157_106, Static507.anInt9339);
			} else {
				local7 = false;
			}
		}
		if (Static176.aClass296_3 == null) {
			if (Static214.aClass157_106.method4575(Static474.anInt8886)) {
				Static176.aClass296_3 = Static652.method7574(Static214.aClass157_106, Static474.anInt8886);
			} else {
				local7 = false;
			}
		}
		if (Static4.aClass296_1 == null) {
			if (Static214.aClass157_106.method4575(Static619.anInt10831)) {
				Static4.aClass296_1 = Static652.method7574(Static214.aClass157_106, Static619.anInt10831);
			} else {
				local7 = false;
			}
		}
		if (Static596.aClass239_17 == null) {
			if (Static348.aClass157_177.method4575(Static213.anInt4832)) {
				Static596.aClass239_17 = Static392.method6465(Static213.anInt4832, Static348.aClass157_177);
			} else {
				local7 = false;
			}
		}
		if (Static644.aClass296Array1 == null) {
			if (Static214.aClass157_106.method4575(Static213.anInt4832)) {
				Static644.aClass296Array1 = Static652.method7585(Static214.aClass157_106, Static213.anInt4832);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
	public static int method3125(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
