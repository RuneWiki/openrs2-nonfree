import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
	public static int anInt487;

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
	public static int anInt490;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "Lclient!of;")
	public static final Class174 aClass174_18 = new Class174("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "[I")
	public static final int[] anIntArray19 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "Lclient!la;")
	public static final Class136 aClass136_11 = new Class136(57, -2);

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "Lclient!ip;")
	public static final Class111 aClass111_1 = new Class111("", 15);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	public static void method494(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static378.aString60 = arg1;
		Static217.aString10 = arg0;
		if (Static395.anInt6596 != 3 && (Static378.aString60.equals("") || Static217.aString10.equals(""))) {
			Static92.method1569(3);
			return;
		}
		if (Static395.anInt6596 != 1) {
			Static333.anInt5545 = 0;
			Static14.anInt241 = -1;
		}
		Static346.aBoolean409 = false;
		Static92.method1569(-3);
		Static320.anInt1178 = 0;
		Static363.anInt6177 = 0;
		Static423.anInt7131 = 1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!wk;I)V")
	public static void method496(@OriginalArg(0) Class1_Sub2_Sub6_Sub2 arg0) {
		@Pc(16) Class3_Sub29 local16 = (Class3_Sub29) Static307.aClass140_32.method3490((long) arg0.anInt7621);
		if (local16 == null) {
			return;
		}
		if (local16.aClass3_Sub1_Sub3_2 != null) {
			Static440.aClass3_Sub1_Sub2_2.method5098(local16.aClass3_Sub1_Sub3_2);
			local16.aClass3_Sub1_Sub3_2 = null;
		}
		local16.method6288();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
	public static void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static330.anInt5523 = arg4;
		Static136.anInt2402 = arg3;
		Static199.anInt3573 = arg0;
		Static218.anInt7513 = arg1;
		Static416.anInt6989 = arg2;
		if (Static416.anInt6989 >= 100) {
			@Pc(32) int local32 = Static199.anInt3573 * 128 + 64;
			@Pc(38) int local38 = Static136.anInt2402 * 128 + 64;
			@Pc(46) int local46 = Static181.method4212(Static276.anInt4606, local38, local32) - Static218.anInt7513;
			@Pc(51) int local51 = local32 - Static266.anInt4433;
			@Pc(55) int local55 = local46 - Static410.anInt6946;
			@Pc(60) int local60 = local38 - Static152.anInt7561;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local60 * local60 + local51 * local51));
			Static419.anInt7092 = (int) (Math.atan2((double) local55, (double) local71) * 2607.5945876176133D) & 0x3FFF;
			Static372.anInt6317 = (int) (-2607.5945876176133D * Math.atan2((double) local51, (double) local60)) & 0x3FFF;
			Static205.anInt5939 = 0;
			if (Static419.anInt7092 < 1024) {
				Static419.anInt7092 = 1024;
			}
			if (Static419.anInt7092 > 3072) {
				Static419.anInt7092 = 3072;
			}
		}
		anInt490 = 2;
	}
}
