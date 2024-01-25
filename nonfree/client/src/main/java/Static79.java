import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "[I")
	public static int[] anIntArray426;

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "[I")
	public static final int[] anIntArray427 = new int[5];

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString148 = " is already on your friend list.";

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V")
	public static void method3436(@OriginalArg(0) int arg0) {
		Static339.anInt6429 = arg0;
		@Pc(7) Class140 local7 = Static249.aClass140_129;
		synchronized (Static249.aClass140_129) {
			Static249.aClass140_129.method3819();
		}
		local7 = Static152.aClass140_78;
		synchronized (Static152.aClass140_78) {
			Static152.aClass140_78.method3819();
		}
		local7 = Static210.aClass140_111;
		synchronized (Static210.aClass140_111) {
			Static210.aClass140_111.method3819();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!mo;Lclient!mo;B)V")
	public static void method3437(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (arg0.aClass1_Sub1_62 != null) {
			arg0.method5564();
		}
		arg0.aClass1_Sub1_61 = arg1.aClass1_Sub1_61;
		arg0.aClass1_Sub1_62 = arg1;
		arg0.aClass1_Sub1_62.aClass1_Sub1_61 = arg0;
		arg0.aClass1_Sub1_61.aClass1_Sub1_62 = arg0;
	}
}
