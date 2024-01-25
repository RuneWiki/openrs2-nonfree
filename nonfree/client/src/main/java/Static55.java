import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "Lclient!iq;")
	public static Class104 aClass104_40;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_33 = new Class157(59, 18);

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "[S")
	public static final short[] aShortArray18 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!iq;Lclient!iq;B)I")
	public static int method1204(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method2755(Static344.anInt6693)) {
			local5++;
		}
		if (arg0.method2755(Static213.anInt4642)) {
			local5++;
		}
		if (arg0.method2755(Static313.anInt6151)) {
			local5++;
		}
		if (arg1.method2755(Static344.anInt6693)) {
			local5++;
		}
		if (arg1.method2755(Static213.anInt4642)) {
			local5++;
		}
		if (arg1.method2755(Static313.anInt6151)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
	public static void method1205(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub9_Sub4 local16 = Static98.method1971(13, arg1);
		local16.method1801();
		local16.anInt1723 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method1207() {
		for (@Pc(13) Class2_Sub33 local13 = (Class2_Sub33) Static108.aClass180_15.method4919(); local13 != null; local13 = (Class2_Sub33) Static108.aClass180_15.method4916()) {
			if (local13.anInt5553 == -1) {
				local13.anInt5556 = 0;
				Static184.method3492(local13);
			} else {
				local13.method5723();
			}
		}
	}
}
