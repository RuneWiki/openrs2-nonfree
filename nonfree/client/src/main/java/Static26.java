import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_204 = Static120.method1824("mapdots");

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	public static final int anInt605 = 7759444;

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_205 = Static120.method1824("::gc");

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)I")
	public static int method423(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
	public static void method424() {
		for (@Pc(10) Class3_Sub22 local10 = (Class3_Sub22) Static97.aClass70_9.method1953(); local10 != null; local10 = (Class3_Sub22) Static97.aClass70_9.method1948()) {
			if (local10.anInt3779 == -1) {
				local10.anInt3778 = 0;
				Static145.method2316(local10);
			} else {
				local10.method3159();
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(III)Lclient!qf;")
	public static Class77 method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class77 local7 = Static92.method2208(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass77Array1 == null || arg1 >= local7.aClass77Array1.length) {
			return null;
		} else {
			return local7.aClass77Array1[arg1];
		}
	}
}
