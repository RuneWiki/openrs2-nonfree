import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!c", name = "I", descriptor = "Lclient!ct;")
	public static Class30 aClass30_7;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!ct;")
	public static Class30 aClass30_8;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_35 = new Class21(50);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)V")
	public static void method878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 >= Static93.anInt5014 && Static122.anInt1360 >= arg5 && arg3 >= Static131.anInt2843 && Static38.anInt945 >= arg6) {
			Static164.method3105(arg4, arg6, arg1, arg2, arg0, arg3, arg5);
		} else {
			Static96.method2058(arg4, arg6, arg2, arg0, arg1, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(I)V")
	public static void method880() {
		Static193.aClass21_107.method857();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)I")
	public static int method881(@OriginalArg(0) boolean arg0) {
		@Pc(13) long local13 = Static183.method3462();
		for (@Pc(25) Class1_Sub14 local25 = arg0 ? (Class1_Sub14) Static228.aClass38_25.method1474() : (Class1_Sub14) Static228.aClass38_25.method1470(); local25 != null; local25 = (Class1_Sub14) Static228.aClass38_25.method1470()) {
			if ((local25.aLong54 & 0x3FFFFFFFFFFFFFFFL) < local13) {
				if ((local25.aLong54 & 0x4000000000000000L) != 0L) {
					@Pc(56) int local56 = (int) local25.aLong217;
					Static87.anIntArray147[local56] = Static277.anIntArray417[local56];
					local25.method6045();
					return local56;
				}
				local25.method6045();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
	public static void method882() {
		@Pc(5) Class21 local5 = Static232.aClass21_125;
		synchronized (Static232.aClass21_125) {
			Static232.aClass21_125.method851();
		}
		local5 = aClass21_35;
		synchronized (aClass21_35) {
			aClass21_35.method851();
		}
		local5 = Static244.aClass21_134;
		synchronized (Static244.aClass21_134) {
			Static244.aClass21_134.method851();
		}
	}
}
