import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!vfa;B)I")
	public static int method1245(@OriginalArg(0) int arg0, @OriginalArg(1) Class357 arg1) {
		if (!Static74.method1225(arg1).method8727(arg0) && arg1.anObjectArray24 == null) {
			return -1;
		} else if (arg1.anIntArray797 == null || arg0 >= arg1.anIntArray797.length) {
			return -1;
		} else {
			return arg1.anIntArray797[arg0];
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZBIIIII)V")
	public static void method1246(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static148.anInt4148 = arg2;
		Static576.anInt9475 = arg1;
		Static178.anInt3172 = arg3;
		Static512.anInt9960 = arg5;
		Static636.anInt10317 = arg4;
		if (arg0 && Static178.anInt3172 >= 100) {
			Static646.anInt10445 = Static148.anInt4148 * 512 + 256;
			Static70.anInt9231 = Static512.anInt9960 * 512 + 256;
			Static216.anInt3726 = Static600.method8378(Static646.anInt10445, Static70.anInt9231, Static299.anInt4751) - Static636.anInt10317;
		}
		Static609.anInt9978 = -1;
		Static394.anInt6873 = -1;
		Static584.anInt9543 = 2;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
	public static int method1247(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static616.method8515(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!kn;II)V")
	public static void method1248(@OriginalArg(0) Class14_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray243 == null) {
			return;
		}
		@Pc(23) int local23 = arg0.anIntArray243[arg1 + 1];
		if (local23 == arg0.anInt2930) {
			return;
		}
		arg0.anInt2914 = 0;
		arg0.anInt2903 = 1;
		arg0.anInt2973 = arg0.anInt2972;
		arg0.anInt2913 = 0;
		arg0.anInt2947 = 0;
		arg0.anInt2930 = local23;
		if (arg0.anInt2930 != -1) {
			Static270.method4083(Static396.aClass359_2.method8415(arg0.anInt2930), arg0.anInt2914, arg0);
			return;
		}
	}
}
