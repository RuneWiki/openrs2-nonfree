import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_271 = new Class184(90, -2);

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "[I")
	public static final int[] anIntArray517 = new int[13];

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	public static int anInt7317 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V")
	public static void method5679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
		Static302.aClass3_Sub2_Sub2_2.method6001(Static410.aClass49_6.anInt1611);
		Static302.aClass3_Sub2_Sub2_2.method6001(arg3);
		Static302.aClass3_Sub2_Sub2_2.method6001(arg1);
		Static302.aClass3_Sub2_Sub2_2.method6045(arg0);
		Static302.aClass3_Sub2_Sub2_2.method6045(arg2);
		Static418.anInt7207 = 0;
		Static284.anInt5211 = 1;
		Static4.anInt817 = 0;
		Static407.anInt7061 = -3;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
	public static void method5682() {
		for (@Pc(10) Class13_Sub5 local10 = (Class13_Sub5) Static92.aClass40_2.method1192(); local10 != null; local10 = (Class13_Sub5) Static92.aClass40_2.method1192()) {
			Static329.method4788(local10);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static123.aClass21_Sub1_1.method787(Static347.anInt6318)) {
			local31 = 0;
			local30 = 3;
		} else {
			local30 = Static367.anInt6555;
			local31 = Static367.anInt6555;
		}
		Static56.method1159();
		for (@Pc(44) int local44 = local31; local44 <= local30; local44++) {
			Static56.method1170();
			Static56.method1164(local44);
			Static56.method1167(local44);
		}
		Static56.method1154();
		Static56.method1162();
	}
}
