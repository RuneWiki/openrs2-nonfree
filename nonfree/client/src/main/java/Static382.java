import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!um;")
	public static Class245 aClass245_8;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "J")
	public static long aLong218 = 0L;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Z")
	public static boolean aBoolean780 = false;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;IIJZZB)V")
	public static void method5588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		if (!Static17.aBoolean39 && Static118.anInt2201 < 500) {
			@Pc(16) int local16 = arg6 == -1 ? Static33.anInt530 : arg6;
			@Pc(30) Class1_Sub19 local30 = new Class1_Sub19(arg3, arg4, local16, arg2, arg0, arg7, arg1, arg5, arg8, arg9);
			Static202.aClass227_21.method4972(local30);
			Static118.anInt2201++;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII)Z")
	public static boolean method5589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class68 local8 = Static341.aClass75_4.method1616(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local8.method1536(arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
	public static void method5590(@OriginalArg(0) int arg0) {
		@Pc(23) Class1_Sub5_Sub11 local23 = Static188.method2688(arg0, 11);
		local23.method2667();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)V")
	public static void method5592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static195.anInt3458 == 1) {
			Static35.method513(arg1, Static252.aClass1_Sub19_2, arg0);
		} else if (Static195.anInt3458 == 2) {
			Static179.method2597(arg1, arg0);
		}
		Static252.aClass1_Sub19_2 = null;
		Static195.anInt3458 = 0;
	}
}
