import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	public static int anInt378;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	public static int anInt371 = 0;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "[I")
	public static final int[] anIntArray13 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
	public static int anInt376 = 16777215;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ra;I)V")
	public static void method393(@OriginalArg(0) Class170 arg0) {
		Static288.aClass170_96 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)Lclient!ja;")
	public static Class5_Sub9_Sub11 method396(@OriginalArg(0) int arg0) {
		@Pc(5) Class66 local5 = Static68.aClass66_27;
		@Pc(14) Class5_Sub9_Sub11 local14;
		synchronized (Static68.aClass66_27) {
			local14 = (Class5_Sub9_Sub11) Static68.aClass66_27.method1939((long) arg0);
			if (local14 == null) {
				local14 = new Class5_Sub9_Sub11(arg0);
				Static68.aClass66_27.method1936((long) arg0, local14);
			}
		}
		synchronized (local14) {
			return local14.method2614() ? local14 : null;
		}
	}
}
