import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!qs;")
	public static Class211 aClass211_88;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Lclient!qs;")
	public static Class211 aClass211_89;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Lclient!ui;")
	public static final Class248 aClass248_10 = new Class248("WTI", 5);

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "Lclient!eo;")
	public static Class1_Sub15 aClass1_Sub15_2 = null;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "Lclient!bs;")
	public static final Class37 aClass37_5 = new Class37(2);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method5873(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1) {
		Static396.aClass96Array5[arg0] = arg1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5877(@OriginalArg(0) String arg0) {
		return Static272.method4041(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V")
	public static void method5881() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static209.anInt4283; local7++) {
			for (@Pc(10) int local10 = 0; local10 < Static211.anInt4295; local10++) {
				if (Static163.method2682(true, local7, local10, local5, Static67.aClass252ArrayArrayArray2)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5883(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static127.method2083(Static26.method555(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
