import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public static int anInt6068 = 2;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
	public static final int[] anIntArray394 = new int[1];

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
	public static final int[] anIntArray395 = new int[5];

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method4742() {
		@Pc(14) int[] local14 = new int[Static314.aClass12_2.anInt408];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static314.aClass12_2.anInt408; local18++) {
			@Pc(25) Class81 local25 = Static314.aClass12_2.method327(local18);
			if (local25.anInt2562 >= 0 || local25.anInt2555 >= 0) {
				local14[local16++] = local18;
			}
		}
		Static378.anIntArray405 = new int[local16];
		for (@Pc(49) int local49 = 0; local49 < local16; local49++) {
			Static378.anIntArray405[local49] = local14[local49];
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!cu;)V")
	public static void method4743(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(12) int local12 = arg0.method2638();
		Static84.aClass186Array1 = new Class186[local12];
		for (@Pc(17) int local17 = 0; local17 < local12; local17++) {
			Static84.aClass186Array1[local17] = new Class186();
			Static84.aClass186Array1[local17].anInt5395 = arg0.method2638();
			Static84.aClass186Array1[local17].aString52 = arg0.method2591();
		}
		Static73.anInt1827 = arg0.method2638();
		Static398.anInt6550 = arg0.method2638();
		Static181.anInt3617 = arg0.method2638();
		Static292.aClass117_Sub1Array4 = new Class117_Sub1[Static398.anInt6550 + 1 - Static73.anInt1827];
		for (@Pc(68) int local68 = 0; local68 < Static181.anInt3617; local68++) {
			@Pc(73) int local73 = arg0.method2638();
			@Pc(81) Class117_Sub1 local81 = Static292.aClass117_Sub1Array4[local73] = new Class117_Sub1();
			local81.anInt7348 = arg0.method2582();
			local81.anInt7350 = arg0.method2589();
			local81.anInt7359 = local73 + Static73.anInt1827;
			local81.aString66 = arg0.method2591();
			local81.aString65 = arg0.method2591();
		}
		Static244.anInt4662 = arg0.method2589();
		Static422.aBoolean593 = true;
	}
}
