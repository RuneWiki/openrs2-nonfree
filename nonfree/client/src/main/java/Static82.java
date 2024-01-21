import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!s;")
	public static Class1_Sub2_Sub21 aClass1_Sub2_Sub21_1;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray51;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1218 = Static118.method2249("null");

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1219 = Static118.method2249("loc)3dat");

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt2025 = 0;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1220 = Static118.method2249("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBILclient!sd;)Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1 method1437(@OriginalArg(2) int arg0, @OriginalArg(3) Class60 arg1) {
		return Static178.method3023(0, arg1, arg0) ? Static127.method2412() : null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static void method1438() {
		for (@Pc(6) Class1_Sub24 local6 = (Class1_Sub24) Static159.aClass91_19.method3148(); local6 != null; local6 = (Class1_Sub24) Static159.aClass91_19.method3150()) {
			if (local6.anInt4094 == -1) {
				local6.anInt4098 = 0;
				Static185.method3078(local6);
			} else {
				local6.method3295();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!wa;)Lclient!cf;")
	public static Class5_Sub2 method1440(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class5_Sub2(arg0.method1729(), arg0.method1729(), arg0.method1729(), arg0.method1729(), arg0.method1713(), arg0.method1713(), arg0.method1738());
	}
}
