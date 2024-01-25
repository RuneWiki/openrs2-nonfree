import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
	public static int anInt474;

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_16 = new Class151("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_5 = new Class167(8);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBIZ)V")
	public static void method395(@OriginalArg(3) boolean arg0) {
		Static220.anInt3558 = 2;
		Static25.aBoolean39 = arg0;
		Static155.anInt2607 = 22050;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII[Lclient!vg;Z)V")
	public static void method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class250[] arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(17) int local17 = 0; local17 < arg3.length; local17++) {
			@Pc(23) Class250 local23 = arg3[local17];
			if (local23 != null && local23.anInt7002 == arg1) {
				Static241.method3138(arg0, arg4, local23, arg2);
				Static355.method4565(local23, arg2, arg0);
				if (local23.anInt7037 - local23.anInt7041 < local23.anInt7015) {
					local23.anInt7015 = local23.anInt7037 - local23.anInt7041;
				}
				if (local23.anInt6998 - local23.anInt6997 < local23.anInt6966) {
					local23.anInt6966 = local23.anInt6998 - local23.anInt6997;
				}
				if (local23.anInt7015 < 0) {
					local23.anInt7015 = 0;
				}
				if (local23.anInt6966 < 0) {
					local23.anInt6966 = 0;
				}
				if (local23.anInt7009 == 0) {
					Static325.method4180(local23, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method400(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg6 < 128 || arg4 < 128 || Static425.anInt6922 * 128 - 256 < arg6 || Static251.anInt4072 * 128 - 256 < arg4) {
			Static80.anIntArray72[0] = Static80.anIntArray72[1] = -1;
			return;
		}
		@Pc(46) int local46 = Static183.method4175(arg4, arg6, arg5) - arg2;
		Static217.aClass40_5.ZA(arg1, 0, 0);
		Static213.aClass128_22.m(Static217.aClass40_5);
		Static213.aClass128_22.ia(arg6, local46, arg4, Static80.anIntArray72);
		Static217.aClass40_5.ZA(-arg1, 0, 0);
		Static213.aClass128_22.m(Static217.aClass40_5);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method406(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(18) long local18 = 0L;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local18 = (local18 << 5) + (long) arg0.charAt(local20) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(B)V")
	public static void method413() {
		Static104.aClass98Array2 = new Class98[50];
		Static353.anInt5858 = 0;
	}
}
