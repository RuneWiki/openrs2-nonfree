import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cq", name = "Q", descriptor = "Lclient!rc;")
	public static Class285 aClass285_4;

	@OriginalMember(owner = "client!cq", name = "tb", descriptor = "[Lclient!fi;")
	public static Class15_Sub5_Sub1_Sub1[] aClass15_Sub5_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!cq", name = "P", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!cq", name = "ib", descriptor = "Lclient!sn;")
	public static final Class313 aClass313_4 = new Class313("WTWIP", 3);

	@OriginalMember(owner = "client!cq", name = "jb", descriptor = "Lclient!tp;")
	public static Class331 aClass331_6 = null;

	@OriginalMember(owner = "client!cq", name = "sb", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_24 = new Class71(94, 3);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIII)V")
	public static void method2056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static345.anInt6703 = arg2;
		Static567.anInt9757 = arg3;
		Class15_Sub1_Sub2_Sub2.lb = arg0;
		Static258.anInt5552 = arg4;
		Static324.anInt6509 = arg1;
		if (Static258.anInt5552 >= 100) {
			@Pc(22) int local22 = Static345.anInt6703 * 512 + 256;
			@Pc(28) int local28 = Static567.anInt9757 * 512 + 256;
			@Pc(37) int local37 = Static177.method3098(local28, local22, Static128.anInt3428) - Class15_Sub1_Sub2_Sub2.lb;
			@Pc(42) int local42 = local22 - Static637.anInt10650;
			@Pc(47) int local47 = local37 - Static504.anInt8868;
			@Pc(52) int local52 = local28 - Static377.anInt7114;
			@Pc(64) int local64 = (int) Math.sqrt((double) (local42 * local42 + local52 * local52));
			Static443.anInt8245 = (int) (Math.atan2((double) local47, (double) local64) * 2607.5945876176133D) & 0x3FFF;
			Static25.anInt1035 = (int) (-2607.5945876176133D * Math.atan2((double) local42, (double) local52)) & 0x3FFF;
			Static512.anInt8976 = 0;
			if (Static443.anInt8245 < 1024) {
				Static443.anInt8245 = 1024;
			}
			if (Static443.anInt8245 > 3072) {
				Static443.anInt8245 = 3072;
			}
		}
		Static621.anInt10407 = -1;
		Static460.anInt8416 = -1;
		Static427.anInt8005 = 2;
	}
}
