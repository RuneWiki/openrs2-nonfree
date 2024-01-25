import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Lclient!ha;")
	public static Class25 aClass25_19;

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
	public static int anInt6386 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[BIIII)V")
	public static void method5315(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg1) {
			return;
		}
		arg3 += arg1;
		@Pc(24) int local24 = arg2 - arg1 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg2 - arg1 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(29) int local29 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg0[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local34] = 1;
			arg3 = local39 + 1;
			arg0[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZZLclient!sf;)V")
	public static void method5317(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class5_Sub43 arg2) {
		@Pc(18) int local18 = arg2.anInt7801;
		@Pc(22) int local22 = (int) arg2.aLong253;
		arg2.method7425();
		if (arg0) {
			Static492.method6830(local18);
		}
		Static299.method4955(local18);
		@Pc(39) Class220 local39 = Static352.method5447(local22);
		if (local39 != null) {
			Static377.method5650(local39);
		}
		Static238.method4072();
		if (!arg1 && Static395.anInt7085 != -1) {
			Static207.method3360(Static395.anInt7085, 1);
		}
		@Pc(60) Class258 local60 = new Class258(Static307.aClass42_24);
		for (@Pc(65) Class5_Sub43 local65 = (Class5_Sub43) local60.method6134(); local65 != null; local65 = (Class5_Sub43) local60.method6135()) {
			if (!local65.method7426()) {
				local65 = (Class5_Sub43) local60.method6134();
				if (local65 == null) {
					return;
				}
			}
			if (local65.anInt7805 == 3) {
				@Pc(91) int local91 = (int) local65.aLong253;
				if (local18 == local91 >>> 16) {
					method5317(true, arg1, local65);
				}
			}
		}
	}
}
