import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "Lclient!gp;")
	public static Class117 aClass117_233;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "Lclient!ed;")
	public static final Class77 aClass77_13 = new Class77();

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_156 = new Class40("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)I")
	public static int method7392(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!oh;I)V")
	public static void method7393(@OriginalArg(0) Class220 arg0) {
		if (!Static479.aBoolean594) {
			return;
		}
		if (arg0.anObjectArray24 != null) {
			@Pc(21) Class220 local21 = Static485.method6724(Static496.anInt8516, Static207.anInt3882);
			if (local21 != null) {
				@Pc(27) Class5_Sub17 local27 = new Class5_Sub17();
				local27.aClass220_5 = arg0;
				local27.anObjectArray3 = arg0.anObjectArray24;
				local27.aClass220_6 = local21;
				Static266.method4403(local27);
			}
		}
		Static415.method5995(Static495.aClass236_88);
		Static164.aClass5_Sub3_Sub1_2.method4184(arg0.anInt6661);
		Static164.aClass5_Sub3_Sub1_2.method4224(arg0.anInt6674);
		Static164.aClass5_Sub3_Sub1_2.method4200(arg0.anInt6641);
		Static164.aClass5_Sub3_Sub1_2.method4185(Static207.anInt3882);
		Static164.aClass5_Sub3_Sub1_2.method4181(Static496.anInt8516);
		Static164.aClass5_Sub3_Sub1_2.method4181(Static383.anInt7004);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([BZB)V")
	public static void method7394(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static78.aClass5_Sub3_7 == null) {
			Static78.aClass5_Sub3_7 = new Class5_Sub3(20000);
		}
		Static78.aClass5_Sub3_7.method4207(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static425.method6096(Static78.aClass5_Sub3_7.aByteArray66);
		Static74.aClass35_Sub1Array1 = new Class35_Sub1[Static482.anInt8343];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static420.anInt9019; local33 <= Static403.anInt7216; local33++) {
			@Pc(39) Class35_Sub1 local39 = Static3.method208(local33);
			if (local39 != null) {
				Static74.aClass35_Sub1Array1[local31++] = local39;
			}
		}
		Static248.aBoolean407 = false;
		Static361.aLong183 = Static105.method2132();
		Static78.aClass5_Sub3_7 = null;
	}
}
