import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "[I")
	public static final int[] anIntArray548 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V")
	public static void method7170(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class6_Sub26 local6 = Static4.method111();
		local6.aClass6_Sub23_Sub1_2.method8366(Static367.aClass105_7.anInt2549);
		local6.aClass6_Sub23_Sub1_2.method8347(0);
		@Pc(21) int local21 = local6.aClass6_Sub23_Sub1_2.anInt9901;
		local6.aClass6_Sub23_Sub1_2.method8347(646);
		@Pc(30) int[] local30 = Static605.method8307(local6);
		@Pc(34) int local34 = local6.aClass6_Sub23_Sub1_2.anInt9901;
		local6.aClass6_Sub23_Sub1_2.method8398(arg0);
		local6.aClass6_Sub23_Sub1_2.method8347(Static506.anInt8485);
		local6.aClass6_Sub23_Sub1_2.method8398(arg2);
		local6.aClass6_Sub23_Sub1_2.method8392(Static106.aLong65);
		local6.aClass6_Sub23_Sub1_2.method8366(Static616.anInt10077);
		local6.aClass6_Sub23_Sub1_2.method8366(Static457.aClass176_6.anInt4801);
		Static356.method5145(local6.aClass6_Sub23_Sub1_2);
		@Pc(71) String local71 = Static355.aString76;
		local6.aClass6_Sub23_Sub1_2.method8366(local71 == null ? 0 : 1);
		if (local71 != null) {
			local6.aClass6_Sub23_Sub1_2.method8398(local71);
		}
		local6.aClass6_Sub23_Sub1_2.method8366(arg3);
		local6.aClass6_Sub23_Sub1_2.method8366(arg1 ? 1 : 0);
		local6.aClass6_Sub23_Sub1_2.anInt9901 += 7;
		local6.aClass6_Sub23_Sub1_2.method8360(local34, local6.aClass6_Sub23_Sub1_2.anInt9901, local30);
		local6.aClass6_Sub23_Sub1_2.method8394(local6.aClass6_Sub23_Sub1_2.anInt9901 - local21);
		Static670.method9077(local6);
		Static131.anInt2291 = 1;
		Static400.anInt6735 = -3;
		Static102.anInt1887 = 0;
		Static35.anInt855 = 0;
		if (arg3 < 13) {
			Static67.aBoolean67 = true;
			Static301.method4339();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(CB)Z")
	public static boolean method7171(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
