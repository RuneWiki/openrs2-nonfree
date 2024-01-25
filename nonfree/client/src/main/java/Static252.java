import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method4226() {
		@Pc(10) Class198 local10 = Static323.aClass198_56;
		synchronized (Static323.aClass198_56) {
			Static323.aClass198_56.method5236();
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public static void method4228() {
		Static42.method731();
		Static65.method1709();
		Static20.method419();
		Static307.method5173();
		Static155.method1564();
		Static92.method1459();
		Static91.method1450();
		Static107.method1838();
		Static50.method850();
		Static144.method2368();
		Static140.method2301();
		Static238.method4071();
		Static118.method2062();
		Static165.method2609();
		Static164.method5311();
		Static163.method2597();
		Static168.method2722();
		Static255.method5158();
		Static300.method5081();
		Static236.method4018();
		Static41.method725();
		Static305.method5101();
		Static263.method4426();
		Static258.aClass198_48.method5230();
		Static2.aClass198_1.method5230();
		Static99.aClass198_19.method5230();
		Static115.aClass198_21.method5230();
		Static139.aClass198_22.method5230();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class160 local13 = local7.aClass160_1; local13 != null; local13 = local13.aClass160_3) {
			@Pc(17) Class5_Sub4 local17 = local13.aClass5_Sub4_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort86 == arg1 && local17.aShort87 == arg2) {
				Static222.method3880(local17);
				return;
			}
		}
	}
}
