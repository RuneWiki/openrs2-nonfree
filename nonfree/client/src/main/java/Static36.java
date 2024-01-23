import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!de", name = "B", descriptor = "Lclient!nb;")
	public static Class15 aClass15_9;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "I")
	public static int anInt949;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "Lclient!i;")
	private static Class41 aClass41_267 = Static184.method2923("flash3:");

	@OriginalMember(owner = "client!de", name = "A", descriptor = "Lclient!i;")
	public static Class41 aClass41_266 = aClass41_267;

	@OriginalMember(owner = "client!de", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_268 = Static184.method2923("title)3jpg");

	@OriginalMember(owner = "client!de", name = "H", descriptor = "Lclient!i;")
	public static Class41 aClass41_269 = Static184.method2923("hint_mapedge");

	@OriginalMember(owner = "client!de", name = "N", descriptor = "Lclient!i;")
	public static Class41 aClass41_270 = aClass41_267;

	@OriginalMember(owner = "client!de", name = "P", descriptor = "I")
	public static int anInt953 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZI)I")
	public static int method694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub22 local18 = (Class2_Sub22) Static57.aClass70_3.method2205((long) arg1);
		if (local18 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local18.anIntArray397.length) {
			return local18.anIntArray397[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method695() {
		for (@Pc(15) Class2_Sub2_Sub3 local15 = (Class2_Sub2_Sub3) Static150.aClass108_13.method3322(); local15 != null; local15 = (Class2_Sub2_Sub3) Static150.aClass108_13.method3331()) {
			@Pc(20) Class12_Sub4 local20 = local15.aClass12_Sub4_1;
			if (local20.anInt1763 != Static134.anInt3147 || Static103.anInt2511 > local20.anInt1774) {
				local15.method3314();
			} else if (local20.anInt1751 <= Static103.anInt2511) {
				if (local20.anInt1760 > 0) {
					@Pc(53) Class12_Sub3_Sub2 local53 = Static199.aClass12_Sub3_Sub2Array1[local20.anInt1760 - 1];
					if (local53 != null && local53.anInt3961 >= 0 && local53.anInt3961 < 13312 && local53.anInt3949 >= 0 && local53.anInt3949 < 13312) {
						local20.method1234(local53.anInt3961, Static103.anInt2511, Static212.method3261(local53.anInt3961, local53.anInt3949, local20.anInt1763) - local20.anInt1766, local53.anInt3949);
					}
				}
				if (local20.anInt1760 < 0) {
					@Pc(107) int local107 = -local20.anInt1760 - 1;
					@Pc(116) Class12_Sub3_Sub1 local116;
					if (local107 == Static195.anInt4428) {
						local116 = Static213.aClass12_Sub3_Sub1_1;
					} else {
						local116 = Static216.aClass12_Sub3_Sub1Array1[local107];
					}
					if (local116 != null && local116.anInt3961 >= 0 && local116.anInt3961 < 13312 && local116.anInt3949 >= 0 && local116.anInt3949 < 13312) {
						local20.method1234(local116.anInt3961, Static103.anInt2511, Static212.method3261(local116.anInt3961, local116.anInt3949, local20.anInt1763) - local20.anInt1766, local116.anInt3949);
					}
				}
				local20.method1231(Static16.anInt432);
				Static111.method1899(Static134.anInt3147, (int) local20.aDouble9, (int) local20.aDouble6, (int) local20.aDouble4, 60, local20, local20.anInt1755, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method697() {
		@Pc(7) int local7 = Static208.anInt4650;
		@Pc(9) int local9 = Static75.anInt3784;
		@Pc(13) int local13 = Static210.anInt4696;
		@Pc(15) int local15 = Static43.anInt1299;
		Static64.method1164(local9, local7, local13, local15, 6116423);
		Static64.method1164(local9 + 1, local7 + 1, local13 - 2, 16, 0);
		Static64.method1162(local9 + 1, local7 + 18, local13 - 2, local15 - 19, 0);
		Static49.aClass2_Sub2_Sub4_3.method784(Static23.aClass41_137, local9 + 3, local7 + 14, 6116423, -1);
		@Pc(60) int local60 = Static26.anInt663;
		@Pc(62) int local62 = Static212.anInt4711;
		for (@Pc(69) int local69 = 0; local69 < Static179.anInt4150; local69++) {
			@Pc(85) int local85 = local7 + (Static179.anInt4150 - local69 - 1) * 15 + 31;
			@Pc(87) int local87 = 16777215;
			if (local9 < local60 && local60 < local13 + local9 && local62 > local85 - 13 && local62 < local85 + 3) {
				local87 = 16776960;
			}
			Static49.aClass2_Sub2_Sub4_3.method784(Static68.method1244(local69), local9 + 3, local85, local87, 0);
		}
		Static114.method1948(Static75.anInt3784, Static43.anInt1299, Static210.anInt4696, Static208.anInt4650);
	}
}
