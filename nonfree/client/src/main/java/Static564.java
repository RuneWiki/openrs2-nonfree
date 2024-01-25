import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
	public static int anInt9223 = 0;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "Z")
	public static boolean aBoolean711 = false;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZZZLclient!tt;)V")
	public static void method7655(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class2_Sub44 arg2) {
		@Pc(13) int local13 = arg2.anInt8608;
		@Pc(17) int local17 = (int) arg2.aLong268;
		arg2.method7966();
		if (arg1) {
			Static309.method4628(local13);
		}
		Static318.method4932(local13);
		@Pc(32) Class196 local32 = Static117.method1748(local17);
		if (local32 != null) {
			Static515.method7134(local32);
		}
		Static227.method3536();
		if (!arg0 && Static554.anInt9121 != -1) {
			Static58.method952(Static554.anInt9121, 1);
		}
		@Pc(54) Class333 local54 = new Class333(Static217.aClass162_20);
		for (@Pc(59) Class2_Sub44 local59 = (Class2_Sub44) local54.method7310(); local59 != null; local59 = (Class2_Sub44) local54.method7308()) {
			if (!local59.method7968()) {
				local59 = (Class2_Sub44) local54.method7310();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt8607 == 3) {
				@Pc(81) int local81 = (int) local59.aLong268;
				if (local81 >>> 16 == local13) {
					method7655(arg0, true, local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)I")
	public static int method7656(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!es;)Lclient!tl;")
	public static Class321 method7657(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method4307();
		return new Class321(local7);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static538.aClass148Array4[Static56.anInt1297++] = new Class148(4, arg1, arg0, arg4, arg4, arg0, arg5, arg6, arg6, arg5, arg3, arg3, arg2, arg2);
	}
}
