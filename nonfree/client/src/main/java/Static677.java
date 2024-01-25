import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!wja", name = "C", descriptor = "I")
	public static int anInt11036;

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIIIIII)V")
	public static void method9361(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(11) Class4_Sub2 local11 = (Class4_Sub2) Static505.aClass283_12.method6791(); local11 != null; local11 = (Class4_Sub2) Static505.aClass283_12.method6792()) {
			if (Static530.anInt9105 >= local11.anInt210) {
				local11.method9473();
			} else {
				Static9.method113((local11.anInt211 << 9) + 256, arg3 >> 1, local11.anInt207, (local11.anInt209 << 9) + 256, local11.anInt212 * 2, arg1 >> 1);
				Static255.aClass68_4.method9441(0, local11.anInt208 | 0xFF000000, local11.aString6, arg0 + Static172.anIntArray151[1], Static172.anIntArray151[0] + arg2);
			}
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(BI)V")
	public static void method9362() {
		Static391.aClass317_36.method7870(50);
	}
}
