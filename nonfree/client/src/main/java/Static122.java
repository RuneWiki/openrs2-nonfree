import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!wo;")
	public static Class216 aClass216_42;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	public static int anInt2773;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "[I")
	public static final int[] anIntArray251 = new int[5];

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "[I")
	public static final int[] anIntArray252 = new int[25];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lclient!aq;I)V")
	public static void method2568(@OriginalArg(0) int arg0, @OriginalArg(1) Class12[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class12 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt416 == 0) {
					if (local13.aClass12Array3 != null) {
						method2568(arg0, local13.aClass12Array3);
					}
					@Pc(37) Class1_Sub37 local37 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local13.anInt465);
					if (local37 != null) {
						Static110.method5416(local37.anInt6281, arg0);
					}
				}
				@Pc(56) Class1_Sub16 local56;
				if (arg0 == 0 && local13.anObjectArray7 != null) {
					local56 = new Class1_Sub16();
					local56.aClass12_5 = local13;
					local56.anObjectArray34 = local13.anObjectArray7;
					Static196.method3777(local56);
				}
				if (arg0 == 1 && local13.anObjectArray17 != null) {
					if (local13.anInt410 >= 0) {
						@Pc(82) Class12 local82 = Static9.method319(local13.anInt465);
						if (local82 == null || local82.aClass12Array3 == null || local82.aClass12Array3.length <= local13.anInt410 || local82.aClass12Array3[local13.anInt410] != local13) {
							continue;
						}
					}
					local56 = new Class1_Sub16();
					local56.anObjectArray34 = local13.anObjectArray17;
					local56.aClass12_5 = local13;
					Static196.method3777(local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method2569() {
		Static150.aClass87_29.method2477();
		Static82.aClass87_17.method2477();
		Static271.aClass87_48.method2477();
		Static241.aClass87_42.method2477();
		Static234.aClass87_40.method2477();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method2570() {
		for (@Pc(3) int local3 = 0; local3 < Static37.aClass165ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static37.aClass165ArrayArray1[local3].length; local7++) {
				Static37.aClass165ArrayArray1[local3][local7] = Static86.aClass165_1;
			}
		}
	}
}
