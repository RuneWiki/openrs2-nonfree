import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gh", name = "yc", descriptor = "Lclient!sc;")
	public static Class223 aClass223_2;

	@OriginalMember(owner = "client!gh", name = "hd", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!gh", name = "kd", descriptor = "[I")
	public static final int[] anIntArray198 = new int[13];

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	public static void method2101() {
		for (@Pc(15) Class28_Sub3 local15 = (Class28_Sub3) Static155.aClass97_3.method2149(); local15 != null; local15 = (Class28_Sub3) Static155.aClass97_3.method2149()) {
			Static46.method731(local15);
		}
		@Pc(36) int local36;
		@Pc(34) int local34;
		if (Static434.aClass165_Sub1_1.method3397(Static404.anInt2752)) {
			local34 = 3;
			local36 = 0;
		} else {
			local34 = Static184.anInt3250;
			local36 = Static184.anInt3250;
		}
		Static53.method869();
		for (@Pc(45) int local45 = local36; local45 <= local34; local45++) {
			Static53.method878();
			Static53.method867(local45);
			Static53.method863(local45);
		}
		Static53.method862();
		Static53.method873();
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(BI)Z")
	public static boolean method2108(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
