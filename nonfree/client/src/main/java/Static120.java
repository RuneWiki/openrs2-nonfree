import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!io", name = "g", descriptor = "I")
	public static int anInt2453;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!io", name = "k", descriptor = "Lclient!nm;")
	public static Class119 aClass119_44;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "Lclient!ui;")
	public static Class175 aClass175_20 = new Class175(64);

	@OriginalMember(owner = "client!io", name = "h", descriptor = "I")
	public static int anInt2454 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)I")
	public static int method2192(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local25 >> 12) + 40960;
		return local34 * local19 >> 12;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
	public static void method2193() {
		Static149.method761();
		Static199.method3412();
		Static138.method3845();
		Static192.method3297();
		Static48.method901();
		Static11.method174();
		Static258.method4024();
		Static138.method3846();
		Static238.method3349();
		Static259.method4029();
		Static302.method4523();
		Static88.method1728();
		Static76.method3985();
		Static225.method3631();
		Static18.method299();
		Static46.method877();
		Static283.method4283();
		Static312.method4650();
		Static130.method2280();
		Static218.method3528();
		Static5.method106();
		Static31.aClass175_6.method4288(5);
		Static238.aClass175_30.method4288(5);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZII)V")
	public static void method2194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class1_Sub5_Sub21 local11 = Static278.method4266(6, arg0);
		local11.method4062();
		local11.anInt4863 = arg1;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	public static void method2195() {
		@Pc(3) int local3;
		@Pc(17) int local17;
		for (local3 = -1; local3 < Static275.anInt5043; local3++) {
			if (local3 == -1) {
				local17 = 2047;
			} else {
				local17 = Static135.anIntArray210[local3];
			}
			@Pc(25) Class11_Sub4_Sub1 local25 = Static14.aClass11_Sub4_Sub1Array1[local17];
			if (local25 != null && local25.anInt3809 > 0) {
				local25.anInt3809--;
				if (local25.anInt3809 == 0) {
					local25.aString130 = null;
				}
			}
		}
		for (local3 = 0; local3 < Static1.anInt48; local3++) {
			local17 = Static288.anIntArray572[local3];
			@Pc(78) Class11_Sub4_Sub2 local78 = Static138.aClass11_Sub4_Sub2Array2[local17];
			if (local78 != null && local78.anInt3809 > 0) {
				local78.anInt3809--;
				if (local78.anInt3809 == 0) {
					local78.aString130 = null;
				}
			}
		}
	}
}
