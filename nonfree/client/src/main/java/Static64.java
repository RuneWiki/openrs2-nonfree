import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "Lclient!fc;")
	public static Class71 aClass71_17;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_42 = new Class221("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_3 = new Class17(11, 17);

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!mr;III[Z)V")
	public static void method1166(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static17.aClass33Array1 == Static345.aClass33Array3) {
			return;
		}
		@Pc(9) int local9 = Static39.aClass33Array2[arg1].method4055(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class33 local22 = Static39.aClass33Array2[local11];
				if (local22 != null) {
					local22.method4056(arg0, arg2, local9 - local22.method4055(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!dq;Ljava/awt/Frame;I)V")
	public static void method1167(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(6) Class1 local6 = arg0.method1191(arg1);
			while (local6.anInt2 == 0) {
				Static185.method3004(10L);
			}
			if (local6.anInt2 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static185.method3004(100L);
		}
	}
}
