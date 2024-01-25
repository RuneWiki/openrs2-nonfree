import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Z")
	public static boolean aBoolean319;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
	public static final int[] anIntArray309 = new int[4096];

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
	public static final int[] anIntArray310 = new int[32];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
	public static String[] method3847(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(15) int local15 = Static180.method3326(arg0, arg1);
		@Pc(20) String[] local20 = new String[local15 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local15; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0 != arg1.charAt(local30); local30++) {
			}
			local20[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local15] = arg1.substring(local24);
		return local20;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method3849() {
		Static322.anInt6105 = 0;
		@Pc(12) int local12 = (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7) + Static263.anInt5063;
		@Pc(25) int local25 = (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7) + Static28.anInt773;
		if (local12 >= 3053 && local12 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static322.anInt6105 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static322.anInt6105 = 1;
		}
		if (Static322.anInt6105 == 1 && local12 >= 3139 && local12 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static322.anInt6105 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)I")
	public static int method3850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class5_Sub9_Sub12.anIntArray170[arg3 * 8192 / arg2] >> 1;
		return (local21 * arg1 >> 16) + ((65536 - local21) * arg0 >> 16);
	}
}
