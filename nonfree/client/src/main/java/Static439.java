import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_74 = new Class77(79, 7);

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
	public static final int anInt8072 = 1405;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)I")
	public static int method6675(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	public static void method6676() {
		for (@Pc(6) Class12_Sub22 local6 = (Class12_Sub22) Static316.aClass73_49.method2005(); local6 != null; local6 = (Class12_Sub22) Static316.aClass73_49.method2009()) {
			if (local6.aBoolean352) {
				local6.method3775();
			}
		}
		for (@Pc(38) Class12_Sub22 local38 = (Class12_Sub22) Static325.aClass73_50.method2005(); local38 != null; local38 = (Class12_Sub22) Static325.aClass73_50.method2009()) {
			if (local38.aBoolean352) {
				local38.method3775();
			}
		}
	}
}
