import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "[Lclient!fc;")
	public static Class93[] aClass93Array1;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Lclient!us;")
	public static final Class344 aClass344_111 = new Class344(51, 8);

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	public static int anInt9075 = 503;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "[I")
	public static final int[] anIntArray567 = new int[14];

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "J")
	public static long aLong229 = 0L;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public static void method7472() {
		@Pc(9) int local9 = 0;
		if (Static552.aClass3_Sub48_30 != null) {
			local9 = Static552.aClass3_Sub48_30.aClass23_Sub6_1.method2793();
		}
		@Pc(28) int local28;
		@Pc(39) int local39;
		if (local9 == 2) {
			local28 = Static354.anInt6929 <= 800 ? Static354.anInt6929 : 800;
			Static114.anInt2970 = local28;
			local39 = Static396.anInt7575 > 600 ? 600 : Static396.anInt7575;
			Static342.anInt6741 = (Static354.anInt6929 - local28) / 2;
			Static256.anInt5669 = local39;
			Static159.anInt3855 = 0;
		} else if (local9 == 1) {
			local28 = Static354.anInt6929 <= 1024 ? Static354.anInt6929 : 1024;
			Static114.anInt2970 = local28;
			local39 = Static396.anInt7575 > 768 ? 768 : Static396.anInt7575;
			Static342.anInt6741 = (Static354.anInt6929 - local28) / 2;
			Static256.anInt5669 = local39;
			Static159.anInt3855 = 0;
		} else {
			Static114.anInt2970 = Static354.anInt6929;
			Static256.anInt5669 = Static396.anInt7575;
			Static342.anInt6741 = 0;
			Static159.anInt3855 = 0;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZI)Z")
	public static boolean method7473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
