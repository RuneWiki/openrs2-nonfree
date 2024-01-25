import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
	public static int anInt1248 = -1;

	@OriginalMember(owner = "client!bp", name = "P", descriptor = "Z")
	public static boolean aBoolean102 = true;

	@OriginalMember(owner = "client!bp", name = "S", descriptor = "[Lclient!pp;")
	public static final Class259[] aClass259Array1 = new Class259[100];

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZBZLclient!uaa;)V")
	public static void method1171(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class3_Sub49 arg2) {
		@Pc(8) int local8 = arg2.anInt9244;
		@Pc(12) int local12 = (int) arg2.aLong262;
		arg2.method8128();
		if (arg0) {
			Static530.method7269(local8);
		}
		Static478.method6533(local8);
		@Pc(29) Class251 local29 = Static105.method2180(local12);
		if (local29 != null) {
			Static588.method8016(local29);
		}
		Static57.method1396();
		if (!arg1 && Static79.anInt2118 != -1) {
			Static51.method4569(1, Static79.anInt2118);
		}
		@Pc(52) Class242 local52 = new Class242(Static204.aClass297_16);
		for (@Pc(61) Class3_Sub49 local61 = (Class3_Sub49) local52.method5560(); local61 != null; local61 = (Class3_Sub49) local52.method5563()) {
			if (!local61.method8129()) {
				local61 = (Class3_Sub49) local52.method5560();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt9245 == 3) {
				@Pc(83) int local83 = (int) local61.aLong262;
				if (local8 == local83 >>> 16) {
					method1171(true, arg1, local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)V")
	public static void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1003) {
			Static583.method7931(Static353.aClass161_7, arg1, arg0);
		} else if (arg2 == 1008) {
			Static583.method7931(Static318.aClass161_5, arg1, arg0);
		} else if (arg2 == 1011) {
			Static583.method7931(Static176.aClass161_3, arg1, arg0);
		} else if (arg2 == 1001) {
			Static583.method7931(Static347.aClass161_6, arg1, arg0);
		} else if (arg2 == 1004) {
			Static583.method7931(Static248.aClass161_4, arg1, arg0);
		}
	}
}
