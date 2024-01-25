import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Lclient!su;")
	public static Class234 aClass234_2;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "[[Lclient!hd;")
	public static Class110[][] aClass110ArrayArray1;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJLclient!ya;)V")
	public static void method2556(@OriginalArg(1) long arg0, @OriginalArg(2) Class135 arg1) {
		Static294.anInt4827 = 0;
		Static82.anInt1612 = Static226.anInt3895;
		Static226.anInt3895 = 0;
		@Pc(22) long local22 = Static266.method3498();
		for (@Pc(27) Class20_Sub3 local27 = (Class20_Sub3) Static73.aClass248_3.method5583(); local27 != null; local27 = (Class20_Sub3) Static73.aClass248_3.method5577()) {
			if (local27.method2130(arg1, arg0)) {
				Static294.anInt4827++;
			}
		}
		if (Static15.aBoolean9 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static73.aClass248_3.method5580() + ", running: " + Static294.anInt4827 + ". Particles: " + Static226.anInt3895 + ". Time taken: " + (Static266.method3498() - local22) + "ms");
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!hd;)V")
	public static void method2558(@OriginalArg(1) Class110 arg0) {
		if (Static456.anInt7658 != arg0.anInt2638) {
			return;
		}
		if (Static401.aClass8_Sub3_Sub1_Sub1_2.aString60 == null) {
			arg0.anInt2599 = 0;
			arg0.anInt2658 = 0;
			return;
		}
		arg0.anInt2619 = 150;
		arg0.anInt2597 = (int) (Math.sin((double) Static265.anInt4371 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2658 = Static12.anInt187;
		arg0.anInt2593 = 5;
		arg0.anInt2599 = Static429.method5630(Static401.aClass8_Sub3_Sub1_Sub1_2.aString60);
		arg0.anInt2624 = 0;
		arg0.anInt2667 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7389;
		arg0.anInt2660 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7403;
		arg0.anInt2664 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7371;
	}
}
