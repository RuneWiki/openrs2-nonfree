import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fga", name = "q", descriptor = "[Lclient!i;")
	public static Class115[] aClass115Array1;

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "[I")
	public static final int[] anIntArray146 = new int[4096];

	@OriginalMember(owner = "client!fga", name = "s", descriptor = "[Lclient!vb;")
	public static final Class337[] aClass337Array1 = new Class337[2048];

	@OriginalMember(owner = "client!fga", name = "u", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_17 = new Class344(48, 2);

	@OriginalMember(owner = "client!fga", name = "v", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_46 = new Class90(36, 3);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZZI)I")
	public static int method2497(@OriginalArg(2) int arg0) {
		@Pc(14) Class4_Sub30 local14 = Static289.method4604(arg0, false);
		if (local14 == null) {
			return Static157.aClass150_1.method3527(arg0).anInt5140;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray329.length; local26++) {
			if (local14.anIntArray329[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static157.aClass150_1.method3527(arg0).anInt5140 - local14.anIntArray329.length;
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V")
	public static void method2498() {
		@Pc(12) Class4_Sub39 local12 = Static32.method999(Static402.aClass356_1, Static326.aClass344_55);
		local12.aClass4_Sub13_Sub2_1.method7038(Static11.anInt816);
		Static50.method1166(local12);
	}
}
