import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
	public static int anInt1578;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_42 = new Class136(98, -1);

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray3 = new int[2][][];

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	public static int anInt1573 = -1;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "[I")
	public static final int[] anIntArray135 = new int[14];

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	public static int anInt1576 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!kn;)V")
	public static void method1467(@OriginalArg(1) Class14_Sub1_Sub1_Sub3 arg0) {
		@Pc(13) boolean local13 = false;
		if (Static235.anInt3998 == arg0.anInt2942 || arg0.anInt2930 == -1 || arg0.anInt2918 != 0) {
			local13 = true;
		} else {
			@Pc(39) Class200 local39 = Static396.aClass359_2.method8415(arg0.anInt2930);
			if (local39.aBoolean401 || arg0.anInt2947 + 1 > local39.anIntArray388[arg0.anInt2914]) {
				local13 = true;
			}
		}
		if (local13) {
			@Pc(62) int local62 = arg0.anInt2942 - arg0.anInt2912;
			@Pc(68) int local68 = Static235.anInt3998 - arg0.anInt2912;
			@Pc(79) int local79 = arg0.anInt2911 * 512 + arg0.method2509() * 256;
			@Pc(91) int local91 = arg0.anInt2920 * 512 + arg0.method2509() * 256;
			@Pc(102) int local102 = arg0.anInt2916 * 512 + arg0.method2509() * 256;
			@Pc(113) int local113 = arg0.anInt2909 * 512 + arg0.method2509() * 256;
			arg0.anInt9317 = (local102 * local68 + (local62 - local68) * local79) / local62;
			arg0.anInt9315 = ((local62 - local68) * local91 + local68 * local113) / local62;
		}
		arg0.anInt2971 = 0;
		if (arg0.anInt2943 == 0) {
			arg0.method2521(8192, false);
		}
		if (arg0.anInt2943 == 1) {
			arg0.method2521(12288, false);
		}
		if (arg0.anInt2943 == 2) {
			arg0.method2521(0, false);
		}
		if (arg0.anInt2943 == 3) {
			arg0.method2521(4096, false);
		}
	}
}
