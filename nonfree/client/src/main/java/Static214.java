import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!eh;")
	public static Class28 aClass28_202;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
	public static int anInt4263;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1215 = Static181.method2795("Please contact customer support)3");

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1214 = aClass83_1215;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	public static int anInt4256 = 0;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
	public static int anInt4257 = 0;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1216 = Static181.method2795("null");

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	public static int anInt4258 = 2;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
	public static int anInt4259 = 0;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1217 = Static181.method2795(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	public static int anInt4261 = 0;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1218 = Static181.method2795("(U");

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([Lclient!ae;II)V")
	public static void method3236(@OriginalArg(0) Class5[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class5 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt130 == 0) {
					if (local9.aClass5Array1 != null) {
						method3236(local9.aClass5Array1, arg1);
					}
					@Pc(33) Class2_Sub13 local33 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local9.anInt159);
					if (local33 != null) {
						Static169.method2640(local33.anInt1869, arg1);
					}
				}
				@Pc(52) Class2_Sub4 local52;
				if (arg1 == 0 && local9.anObjectArray12 != null) {
					local52 = new Class2_Sub4();
					local52.anObjectArray27 = local9.anObjectArray12;
					local52.aClass5_3 = local9;
					Static89.method3267(local52);
				}
				if (arg1 == 1 && local9.anObjectArray10 != null) {
					if (local9.anInt131 >= 0) {
						@Pc(78) Class5 local78 = Static74.method1401(local9.anInt159);
						if (local78 == null || local78.aClass5Array1 == null || local78.aClass5Array1.length <= local9.anInt131 || local9 != local78.aClass5Array1[local9.anInt131]) {
							continue;
						}
					}
					local52 = new Class2_Sub4();
					local52.aClass5_3 = local9;
					local52.anObjectArray27 = local9.anObjectArray10;
					Static89.method3267(local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)I")
	public static int method3237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 >> 31 & arg1 - 1;
		return local16 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I")
	public static int method3239() {
		if (Static49.aDouble10 == 3.0D) {
			return 37;
		} else if (Static49.aDouble10 == 4.0D) {
			return 50;
		} else if (Static49.aDouble10 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}
}
