import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!pr", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(IB)V")
	public static void method4301(@OriginalArg(0) int arg0) {
		if (!Static95.method5202(arg0)) {
			return;
		}
		@Pc(14) Class107[] local14 = Static45.aClass107ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class107 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2590 = 0;
				local22.anInt2619 = 0;
				local22.anInt2662 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V")
	public static void method4302(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static430.aClass1_Sub3_Sub16_2 != null) {
			Static80.anInt1103 = Static430.aClass1_Sub3_Sub16_2.anInt6333;
		} else {
			Static80.anInt1103 = -1;
		}
		Static350.aClass14_40 = null;
		Static8.anInt126 = 0;
		Static399.aClass107_14 = null;
		Static430.aClass1_Sub3_Sub16_2 = null;
		Static430.method3276();
		Static430.aClass14_23.method204();
		Static454.anInt7226 = -1;
		Static430.aClass144_2 = null;
		Static209.aClass263_24 = null;
		Static159.aClass263_19 = null;
		Static112.anInt1711 = -1;
		Static360.aClass85_18 = null;
		Static86.aClass263_34 = null;
		Static437.aClass263_33 = null;
		Static157.aClass263_18 = null;
		Static132.aClass263_32 = null;
		Static40.aClass263_9 = null;
		Static326.aClass263_27 = null;
		Static430.aClass36_4.method661();
		Static430.aClass223_3.method4709(64, 64);
		Static430.aClass36_4.method660(128, 64);
		Static430.aClass248_5.method5250(64);
		Static197.aClass76_1.method1373(64);
	}
}
