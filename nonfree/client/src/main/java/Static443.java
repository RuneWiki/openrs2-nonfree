import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)Lclient!hr;")
	public static Class12_Sub3 method5793(@OriginalArg(0) int arg0) {
		@Pc(7) Class220[] local7 = Class352.aClass220Array1;
		synchronized (Class352.aClass220Array1) {
			@Pc(31) Class12_Sub3 local31;
			if (arg0 >= Class352.aClass220Array1.length || Class352.aClass220Array1[arg0].method4656()) {
				local31 = new Class12_Sub3();
				local31.aClass12_Sub6Array1 = new Class12_Sub6[arg0];
				for (@Pc(53) int local53 = 0; local53 < arg0; local53++) {
					local31.aClass12_Sub6Array1[local53] = new Class12_Sub6();
				}
			} else {
				local31 = (Class12_Sub3) Class352.aClass220Array1[arg0].method4653();
				local31.method7630();
				@Pc(38) int local38 = Static563.anIntArray598[arg0]--;
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZIBIIF)[I")
	public static int[] method5794(@OriginalArg(7) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class2_Sub4_Sub26 local15 = new Class2_Sub4_Sub26();
		local15.anInt7134 = 4;
		local15.anInt7126 = 35;
		local15.anInt7135 = 8;
		local15.anInt7133 = 8;
		local15.anInt7130 = (int) (arg0 * 4096.0F);
		local15.aBoolean586 = true;
		local15.method7562();
		Static95.method1452(2048, 1);
		local15.method5823(0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([Ljava/lang/String;B)V")
	public static void method5796(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static280.aString57 = Static280.aString57 + arg0[0];
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11].startsWith("pause")) {
				@Pc(21) int local21 = 5;
				try {
					local21 = Integer.parseInt(arg0[local11].substring(6));
				} catch (@Pc(30) Exception local30) {
				}
				Static144.method1990("Pausing for " + local21 + " seconds...");
				Static61.anInt1123 = local11 + 1;
				Static31.aStringArray5 = arg0;
				Static417.aLong249 = (long) (local21 * 1000) + Static362.method5133();
				return;
			}
			Static280.aString57 = arg0[local11];
			Static431.method5689(false);
		}
	}
}
