import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!gga;Z)I")
	public static int method3228(@OriginalArg(0) Class120 arg0) {
		if (Static490.aClass120_5 == arg0) {
			return 7681;
		} else if (Static65.aClass120_1 == arg0) {
			return 8448;
		} else if (arg0 == Static162.aClass120_2) {
			return 34165;
		} else if (Static220.aClass120_4 == arg0) {
			return 260;
		} else if (arg0 == Static189.aClass120_3) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "([BII)I")
	public static int method3231(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static567.method8160(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)V")
	public static void method3237(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class3 local11 = Static258.aClass25_22.method949(); local11 != null; local11 = Static258.aClass25_22.method947()) {
			if ((long) arg0 == (local11.aLong262 >> 48 & 0xFFFFL)) {
				local11.method8412();
			}
		}
	}
}
