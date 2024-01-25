import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "Lclient!mea;")
	public static Class246 aClass246_1;

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "[Lclient!wfa;")
	public static Class401[] aClass401Array1;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
	public static int anInt2600 = 0;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILclient!kea;I)V")
	public static void method2371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		Static343.aClass208ArrayArray1[arg1][arg0] = arg2;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BI)V")
	public static void method2372(@OriginalArg(1) int arg0) {
		if (Static405.anIntArray483 == null || arg0 > Static405.anIntArray483.length) {
			Static405.anIntArray483 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BII)Z")
	public static boolean method2373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static414.method5529(arg1, arg0) || Static571.method7409(arg0, arg1) || Static82.method1789(arg0, arg1);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZZZ)V")
	public static void method2374(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static698.anInt10887--;
			if (Static698.anInt10887 == 0) {
				Static546.anIntArray610 = null;
			}
		}
		if (arg1) {
			Static478.anInt5830--;
			if (Static478.anInt5830 == 0) {
				Static537.anIntArray601 = null;
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIZB)Lclient!ik;")
	public static Class182 method2375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Class199 local5 = null;
		if (Static314.aClass203_3 != null) {
			local5 = new Class199(arg0, Static314.aClass203_3, Static430.aClass203Array1[arg0], 1000000);
		}
		Static384.aClass102_Sub1Array2[arg0] = Static100.aClass33_1.method1153(local5, Static257.aClass199_3, arg0);
		Static384.aClass102_Sub1Array2[arg0].method2520();
		return new Class182(Static384.aClass102_Sub1Array2[arg0], arg2, arg1);
	}
}
