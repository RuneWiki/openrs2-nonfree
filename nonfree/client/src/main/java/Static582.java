import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static582 {

	@OriginalMember(owner = "client!wea", name = "h", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_128;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_69 = new Class361();

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
	public static int anInt9457 = 0;

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "Lclient!jd;")
	public static final Class153 aClass153_14 = new Class153(3, 2);

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
	public static int anInt9460 = 0;

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "[J")
	public static final long[] aLongArray16 = new long[100];

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_149 = new Class47(38, 3);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!ns;I)I")
	public static int method7724(@OriginalArg(0) Class228 arg0) {
		if (Static568.aClass228_14 == arg0) {
			return 7681;
		} else if (Static41.aClass228_10 == arg0) {
			return 8448;
		} else if (Static581.aClass228_15 == arg0) {
			return 34165;
		} else if (arg0 == Static350.aClass228_12) {
			return 260;
		} else if (arg0 == Static164.aClass228_9) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V")
	public static void method7725() {
		if (Static557.anInt9206 == 9) {
			Static449.method6350(5);
		} else if (Static557.anInt9206 == 5 || Static557.anInt9206 == 6) {
			Static449.method6350(3);
		} else if (Static557.anInt9206 == 12) {
			Static449.method6350(3);
		}
	}
}
