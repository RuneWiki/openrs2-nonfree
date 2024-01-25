import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "Lclient!r;")
	public static Class43 aClass43_5;

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
	public static int anInt2839 = 0;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_11 = new Class130();

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIZ)I")
	public static int method2570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!mu;I)V")
	public static void method2572(@OriginalArg(0) Class3_Sub34 arg0) {
		Static409.aClass130_38.method3548(arg0);
		arg0.anInt6004 = arg0.aClass3_Sub11_Sub1_2.anInt3520;
		arg0.aClass3_Sub11_Sub1_2.anInt3520 = 0;
		Static474.anInt7707 += arg0.anInt6004;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IBZI)I")
	public static int method2573(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub48 local8 = Static144.method2729(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray674.length) {
			return local8.anIntArray674[arg0];
		} else {
			return -1;
		}
	}
}
