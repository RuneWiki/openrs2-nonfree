import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
	public static int anInt4537;

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "Lclient!wo;")
	public static Class364 aClass364_1;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!jj;")
	public static final Class174 aClass174_1 = new Class174(0, 3, Static243.aClass172_13);

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Lclient!jj;")
	public static final Class174 aClass174_2 = new Class174(1, 3, Static243.aClass172_13);

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "Lclient!jj;")
	public static final Class174 aClass174_3 = new Class174(2, 4, Static243.aClass172_9);

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!jj;")
	public static final Class174 aClass174_4 = new Class174(3, 1, Static243.aClass172_13);

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Lclient!jj;")
	public static final Class174 aClass174_5 = new Class174(4, 2, Static243.aClass172_13);

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "Lclient!jj;")
	public static final Class174 aClass174_6 = new Class174(5, 3, Static243.aClass172_13);

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!jj;")
	public static final Class174 aClass174_7 = new Class174(6, 4, Static243.aClass172_13);

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
	public static final int anInt4536 = Static77.method7407(16);

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "[S")
	public static short[] aShortArray36 = new short[256];

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_56 = new Class208(82, 1);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!la;)V")
	public static void method3618(@OriginalArg(0) Class96 arg0) {
		Static120.aClass96_7 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method3619() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static458.anInt9736; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static378.anInt6747; local13++) {
				if (Static461.method6446(local9, true, Static568.aClass360ArrayArrayArray22, local7, local13)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lclient!jj;")
	public static Class174 method3621(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass174_1;
		} else if (arg0 == 1) {
			return aClass174_2;
		} else if (arg0 == 2) {
			return aClass174_3;
		} else if (arg0 == 3) {
			return aClass174_4;
		} else if (arg0 == 4) {
			return aClass174_5;
		} else if (arg0 == 5) {
			return aClass174_6;
		} else if (arg0 == 6) {
			return aClass174_7;
		} else {
			return null;
		}
	}
}
