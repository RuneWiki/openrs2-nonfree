import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "[I")
	public static int[] anIntArray603;

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	public static int anInt3619 = 0;

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "Lclient!qe;")
	public static Class78 aClass78_646 = Static199.method3560("Nehmen");

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
	public static int anInt3622 = 1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2816(@OriginalArg(1) Component arg0) {
		@Pc(9) Method local9 = Static76.aMethod2;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static10.aClass36_1);
		arg0.addFocusListener(Static10.aClass36_1);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
	public static void method2818() {
		if (!Static48.method633() && Static137.anInt3136 != Static150.anInt3435) {
			Static149.method1486(Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], Static90.anInt2014, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], Static137.anInt3136, Static225.anInt4878);
		} else if (Static137.anInt3136 != Static66.anInt1313) {
			Static66.anInt1313 = Static137.anInt3136;
			Static116.method2151(Static137.anInt3136);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public static void method2819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static64.anInt1246 > 0) {
			Static3.method77(Static64.anInt1246);
			Static64.anInt1246 = 0;
		}
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg0 * Static217.anInt4732;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 1; local24 < 255; local24++) {
			@Pc(37) int local37 = (256 - local24) * Static97.anIntArray376[local24] / 256;
			if (local37 < 0) {
				local37 = 0;
			}
			local16 += local37;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = local37; local50 < 128; local50++) {
				local57 = Static17.anIntArray51[local16++];
				@Pc(65) int local65 = Static217.anIntArray752[arg1 + local20++];
				if (local57 == 0) {
					Static220.aClass2_Sub3_Sub8_Sub1_1.anIntArray470[local22++] = local65;
				} else {
					@Pc(82) int local82 = local57 + 18;
					if (local82 > 255) {
						local82 = 255;
					}
					@Pc(94) int local94 = 256 - local57 - 18;
					local57 = Static66.anIntArray235[local57];
					if (local94 > 255) {
						local94 = 255;
					}
					Static220.aClass2_Sub3_Sub8_Sub1_1.anIntArray470[local22++] = (local82 * (local57 & 0xFF00FF) + (local65 & 0xFF00FF) * local94 & 0xFF00FF00) + ((local57 & 0xFF00) * local82 + local94 * (local65 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			for (local57 = 0; local57 < local37; local57++) {
				Static220.aClass2_Sub3_Sub8_Sub1_1.anIntArray470[local22++] = Static217.anIntArray752[local20++ + arg1];
			}
			local20 += Static217.anInt4732 - 128;
		}
		Static220.aClass2_Sub3_Sub8_Sub1_1.method2256(arg1, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IJ)Lclient!qe;")
	public static Class78 method2820(@OriginalArg(1) long arg0) {
		return Static210.method3686(arg0);
	}
}
