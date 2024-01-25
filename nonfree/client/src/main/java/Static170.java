import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!o;")
	public static Class49 aClass49_14;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_50 = new Class194(52, -1);

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "J")
	public static volatile long aLong94 = 0L;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "[I")
	public static final int[] anIntArray160 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	public static int anInt2907 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!za;Lclient!ps;III)V")
	public static void method2356(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class258 local12;
		if (arg3 < Static439.anInt7318) {
			local12 = Static319.aClass258ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass2_Sub3_2 != null && local12.aClass2_Sub3_2.method6024()) {
				arg1.method6023(arg0, 0, Static92.anInt1592, local12.aClass2_Sub3_2, 0, true);
			}
		}
		if (arg4 < Static439.anInt7318) {
			local12 = Static319.aClass258ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass2_Sub3_2 != null && local12.aClass2_Sub3_2.method6024()) {
				arg1.method6023(arg0, 0, 0, local12.aClass2_Sub3_2, Static92.anInt1592, true);
			}
		}
		if (arg3 < Static439.anInt7318 && arg4 < Static459.anInt4775) {
			local12 = Static319.aClass258ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass2_Sub3_2 != null && local12.aClass2_Sub3_2.method6024()) {
				arg1.method6023(arg0, 0, Static92.anInt1592, local12.aClass2_Sub3_2, Static92.anInt1592, true);
			}
		}
		if (arg3 < Static439.anInt7318 && arg4 > 0) {
			local12 = Static319.aClass258ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass2_Sub3_2 != null && local12.aClass2_Sub3_2.method6024()) {
				arg1.method6023(arg0, 0, Static92.anInt1592, local12.aClass2_Sub3_2, -Static92.anInt1592, true);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	public static void method2357() {
		for (@Pc(15) Class88_Sub6 local15 = (Class88_Sub6) Static348.aClass107_11.method2326(); local15 != null; local15 = (Class88_Sub6) Static348.aClass107_11.method2327()) {
			local15.method5041();
		}
	}
}
