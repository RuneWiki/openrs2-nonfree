import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!im", name = "r", descriptor = "I")
	public static int anInt2580;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "Lclient!wi;")
	public static Class193 aClass193_6;

	@OriginalMember(owner = "client!im", name = "w", descriptor = "Lclient!pd;")
	public static Class1_Sub3_Sub5_Sub1 aClass1_Sub3_Sub5_Sub1_1;

	@OriginalMember(owner = "client!im", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString162 = "glow1:";

	@OriginalMember(owner = "client!im", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString163 = "glow3:";

	@OriginalMember(owner = "client!im", name = "z", descriptor = "I")
	public static int anInt2584 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLclient!th;II)Lclient!lb;")
	public static Class46_Sub1 method1931(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int arg1) {
		return Static131.method2257(0, arg0, arg1) ? Static158.method1928() : null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)Lclient!lm;")
	public static Class103 method1932(@OriginalArg(0) int arg0) {
		@Pc(16) Class103 local16 = (Class103) Static290.aClass89_48.method2268((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static266.aClass168_180.method4058(arg0, 16);
		local16 = new Class103();
		if (local27 != null) {
			local16.method2567(new Class1_Sub14(local27));
		}
		Static290.aClass89_48.method2272((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZILclient!th;)Lclient!ek;")
	public static Class1_Sub8 method1933(@OriginalArg(1) int arg0, @OriginalArg(2) Class168 arg1) {
		@Pc(8) byte[] local8 = arg1.method4062(arg0);
		return local8 == null ? null : new Class1_Sub8(local8);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!th;)V")
	public static void method1935(@OriginalArg(1) Class168 arg0) {
		if (Static198.aBoolean268) {
			return;
		}
		if (Static294.aBoolean367) {
			Static156.method2541();
		} else {
			Static231.method3627();
		}
		Static108.aClass1_Sub3_Sub13_6 = Static141.method4429(arg0, Static122.anInt2670);
		@Pc(19) int local19 = Static270.anInt5412;
		@Pc(25) int local25 = local19 * 956 / 503;
		Static108.aClass1_Sub3_Sub13_6.method4205((Static38.anInt950 - local25) / 2, 0, local25, local19);
		Static300.aClass46_1 = Static68.method1160(arg0, Static169.anInt3799);
		Static300.aClass46_1.method3523(Static38.anInt950 / 2 - Static300.aClass46_1.anInt4753 / 2, 18);
		Static198.aBoolean268 = true;
	}
}
