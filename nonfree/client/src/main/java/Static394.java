import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
	public static int anInt6422;

	@OriginalMember(owner = "client!wt", name = "L", descriptor = "[I")
	public static int[] anIntArray751;

	@OriginalMember(owner = "client!wt", name = "N", descriptor = "Lclient!ui;")
	public static Class230 aClass230_94;

	@OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
	public static int anInt6421 = 0;

	@OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
	public static int anInt6424 = 16777215;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!vg;I)V")
	public static void method5586(@OriginalArg(0) Class1_Sub33_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static143.anInt2673; local7++) {
			@Pc(13) int local13 = Static144.anIntArray324[local7];
			@Pc(17) Class25_Sub1_Sub1_Sub1 local17 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local13];
			@Pc(21) int local21 = arg0.method5174();
			if ((local21 & 0x10) != 0) {
				local21 += arg0.method5174() << 8;
			}
			Static125.method1831(arg0, local17, local21, local13);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "([Lclient!dp;I)V")
	public static void method5587(@OriginalArg(0) Class51[] arg0) {
		Static151.anInt2794 = arg0.length;
		Static134.aClass51Array10 = new Class51[Static151.anInt2794 + 10];
		Static87.anIntArray210 = new int[Static151.anInt2794 + 10];
		Static404.method4338(arg0, 0, Static134.aClass51Array10, 0, Static151.anInt2794);
		for (@Pc(26) int local26 = 0; local26 < Static151.anInt2794; local26++) {
			Static87.anIntArray210[local26] = Static134.aClass51Array10[local26].method4673();
		}
		for (@Pc(45) int local45 = Static151.anInt2794; local45 < Static134.aClass51Array10.length; local45++) {
			Static87.anIntArray210[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IJ)V")
	public static void method5589(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static319.anInt5425 + Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080;
		@Pc(15) int local15 = Static8.anInt119 + Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077;
		if (Static305.anInt5159 - local10 < -500 || Static305.anInt5159 - local10 > 500 || Static92.anInt1674 - local15 < -500 || Static92.anInt1674 - local15 > 500) {
			Static305.anInt5159 = local10;
			Static92.anInt1674 = local15;
		}
		@Pc(56) int local56;
		@Pc(64) int local64;
		if (Static305.anInt5159 != local10) {
			local56 = local10 - Static305.anInt5159;
			local64 = (int) ((long) local56 * arg0 / 320L);
			if (local56 <= 0) {
				if (local64 == 0) {
					local64 = -1;
				} else if (local64 < local56) {
					local64 = local56;
				}
			} else if (local64 == 0) {
				local64 = 1;
			} else if (local64 > local56) {
				local64 = local56;
			}
			Static305.anInt5159 += local64;
		}
		if (!Static188.aClass135_Sub1_1.aBoolean329) {
			Static386.aFloat82 += (float) arg0 * Static356.aFloat22 / 6.0F;
			Static19.aFloat1 += Static37.aFloat2 * (float) arg0 / 6.0F;
		}
		if (Static92.anInt1674 != local15) {
			local56 = local15 - Static92.anInt1674;
			local64 = (int) (arg0 * (long) local56 / 320L);
			if (local56 > 0) {
				if (local64 == 0) {
					local64 = 1;
				} else if (local64 > local56) {
					local64 = local56;
				}
			} else if (local64 == 0) {
				local64 = -1;
			} else if (local64 < local56) {
				local64 = local56;
			}
			Static92.anInt1674 += local64;
		}
		Static227.method4202();
	}
}
