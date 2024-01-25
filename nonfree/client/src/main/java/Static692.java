import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static692 {

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "[I")
	public static final int[] anIntArray739 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	public static final int anInt10649 = 4;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(CI)I")
	public static int method9326(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class5.anIntArray31.length ? Class5.anIntArray31[arg0] : -1;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)V")
	public static void method9327() {
		@Pc(7) int[] local7 = Static597.anIntArray677;
		for (@Pc(9) int local9 = 0; local9 < Static268.anInt4162; local9++) {
			@Pc(17) Class4_Sub2_Sub1_Sub2_Sub1 local17 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local7[local9]];
			if (local17 != null) {
				local17.method2058();
			}
		}
		for (@Pc(39) int local39 = 0; local39 < Static217.anInt3445; local39++) {
			@Pc(48) long local48 = (long) Static266.anIntArray305[local39];
			@Pc(54) Class2_Sub49 local54 = (Class2_Sub49) Static467.aClass218_37.method5095(local48, 0);
			if (local54 != null) {
				local54.aClass4_Sub2_Sub1_Sub2_Sub2_3.method2058();
			}
		}
		if (Static166.anInt2884 != 3) {
			return;
		}
		for (@Pc(79) int local79 = 0; local79 < Static199.aClass61Array1.length; local79++) {
			@Pc(85) Class61 local85 = Static199.aClass61Array1[local79];
			if (local85.aBoolean151) {
				local85.method1238().method2058();
			}
		}
	}
}
