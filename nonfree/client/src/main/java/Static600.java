import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!uga", name = "E", descriptor = "Lclient!el;")
	public static final Class109 aClass109_210 = new Class109(96, 5);

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "(B)V")
	public static void method8643() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static544.anInt9261; local17++) {
			for (@Pc(21) int local21 = 0; local21 < Static282.anInt4887; local21++) {
				if (Static200.method2869(Static260.aClass174ArrayArrayArray2, local21, true, local15, local17)) {
					local15++;
				}
				if (local15 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IZ)V")
	public static void method8644(@OriginalArg(1) boolean arg0) {
		if (Static492.aClass295_1 != null) {
			Static492.aClass295_1.method7023();
			Static492.aClass295_1 = null;
		}
		Static68.method1106();
		Static234.method3394(-6177);
		Static427.method9314();
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			Static670.aClass88Array1[local23].method1595();
		}
		Static511.method6253(false);
		System.gc();
		Static408.method6017();
		Static252.anInt4340 = -1;
		Static152.aBoolean200 = false;
		Static664.method9163();
		Static296.method9089(true, (byte) -101);
		Static353.anInt6205 = 0;
		Static668.anInt10683 = 0;
		Static128.anInt6986 = 0;
		Static622.anInt10188 = 0;
		Static452.anInt7483 = 0;
		Static143.anInt2319 = 0;
		for (@Pc(68) int local68 = 0; local68 < Static598.aClass28Array1.length; local68++) {
			Static598.aClass28Array1[local68] = null;
		}
		Static478.method6969();
		for (@Pc(87) int local87 = 0; local87 < 2048; local87++) {
			Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local87] = null;
		}
		Static247.anInt4256 = 0;
		Static623.aClass291_43.method6986(-104);
		Static230.anInt3776 = 0;
		Static466.aClass291_33.method6986(-100);
		Static110.method1585();
		Static237.anInt1804 = 0;
		Static413.aClass118_1.method2144();
		Static108.method1562();
		Static83.method1277();
		Static208.aClass5_Sub53_9 = null;
		Static662.aLong309 = 0L;
		Static335.aClass5_Sub53_6 = null;
		Static347.aClass5_Sub7_3 = null;
		Static209.aClass205_2 = null;
		Static514.aClass205_3 = null;
		if (arg0) {
			Static21.method316(12);
			return;
		}
		Static21.method316(3);
		try {
			Static681.method743(Static492.anApplet2, "loggedout");
		} catch (@Pc(156) Throwable local156) {
		}
	}
}
