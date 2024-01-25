import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "Lclient!sl;")
	public static final Class229 aClass229_7 = new Class229("", 13);

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_63 = new Class253(10, 4);

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "Z")
	public static final boolean aBoolean178 = false;

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "[I")
	public static final int[] anIntArray264 = new int[14];

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(B)Z")
	public static boolean method2399() {
		if (Static193.aBoolean205) {
			try {
				Static468.method5098(Static230.aClass61_4.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JB)V")
	public static void method2400(@OriginalArg(0) long arg0) {
		if (Static19.aClass223ArrayArrayArray1 != null) {
			if (Static9.anInt60 == 1 || Static9.anInt60 == 5) {
				Static193.method2784(arg0);
			} else if (Static9.anInt60 == 4) {
				Static420.method5270(arg0);
			}
		}
		Static432.method5595(Static269.aClass51_9, (long) Static274.anInt4617);
		if (Static183.anInt3293 != -1) {
			Static459.method5332(Static183.anInt3293);
		}
		for (@Pc(39) int local39 = 0; local39 < Static57.anInt967; local39++) {
			if (Static69.aBooleanArray2[local39]) {
				Static308.aBooleanArray28[local39] = true;
			}
			Static271.aBooleanArray26[local39] = Static69.aBooleanArray2[local39];
			Static69.aBooleanArray2[local39] = false;
		}
		Static370.anInt5910 = Static274.anInt4617;
		if (Static269.aClass51_9.method5316()) {
			Static367.aBoolean390 = true;
		}
		if (Static183.anInt3293 != -1) {
			Static57.anInt967 = 0;
			Static272.method3651();
		}
		Static269.aClass51_9.e();
		Static239.method3257(Static269.aClass51_9);
		@Pc(85) int local85 = Static154.method2308();
		if (local85 == -1) {
			local85 = Static194.anInt3446;
		}
		if (local85 == -1) {
			local85 = Static313.anInt5179;
		}
		Static109.method1890(local85);
		Static9.method50(Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388, Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102, Static436.anInt7296);
		Static436.anInt7296 = 0;
	}
}
