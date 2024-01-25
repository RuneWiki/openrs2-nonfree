import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "[I")
	public static int[] anIntArray606;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "[I")
	public static final int[] anIntArray607 = new int[1];

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!mg;")
	public static Class4_Sub1 method6116(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class4_Sub1_Sub1");
			@Pc(14) Class4_Sub1 local14 = (Class4_Sub1) local6.getDeclaredConstructor().newInstance();
			local14.method7320(arg0);
			return local14;
		} catch (@Pc(21) Throwable local21) {
			@Pc(25) Class4_Sub1_Sub2 local25 = new Class4_Sub1_Sub2();
			local25.method7320(arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public static void method6117() {
		if (Static249.anInt4945 == -1) {
			return;
		}
		@Pc(16) int local16 = Static86.aClass50_1.method7100();
		@Pc(22) int local22 = Static86.aClass50_1.method7102();
		@Pc(27) Class4_Sub22 local27 = (Class4_Sub22) Static324.aClass124_28.method3267();
		if (local27 != null) {
			local16 = local27.method7271();
			local22 = local27.method7270();
		}
		Static368.method5537(0, Static2.anInt29, 0, 0, Static249.anInt4945, local16, 0, local22, Static19.anInt390);
		if (Static593.aClass115_15 != null) {
			Static410.method5898(local16, local22);
		}
	}
}
