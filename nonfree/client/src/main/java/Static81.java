import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)Lclient!fk;")
	public static Class26_Sub3 method1400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass26_Sub3_3;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIBII)V")
	public static void method1402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static258.anInt7179 == 1) {
			Static75.aClass80Array2[Static158.anInt2678 / 100].method6099(Static203.anInt3696 - 8, Static105.anInt1938 - 8);
		}
		if (Static258.anInt7179 == 2) {
			Static75.aClass80Array2[Static158.anInt2678 / 100 + 4].method6099(Static203.anInt3696 - 8, Static105.anInt1938 + -8);
		}
		Static352.method4873();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V")
	public static void method1403() {
		if (Static239.aClass110_2 != null) {
			Static239.aClass110_2.method4777();
		}
		if (Static220.aClass110_1 != null) {
			Static220.aClass110_1.method4777();
		}
	}
}
