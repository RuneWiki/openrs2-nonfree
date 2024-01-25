import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
	public static int anInt3966;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_63 = new Class286(32, -1);

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "Lclient!nw;")
	public static final Class236 aClass236_1 = new Class236();

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	public static int anInt3969 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!hv;II)Z")
	public static boolean method3295(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1) {
		Static434.aClass68_3.method6467(arg0.anIntArray252[arg1], arg0.anIntArray250[arg1], arg0.anIntArray251[arg1], Static427.anIntArray497);
		@Pc(22) int local22 = Static427.anIntArray497[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray59[arg1] = (short) (Static51.anInt1261 * Static427.anIntArray497[0] / local22 + Static230.anInt4316);
			arg0.aShortArray60[arg1] = (short) (Static47.anInt1133 * Static427.anIntArray497[1] / local22 + Static101.anInt2055);
			arg0.aShortArray58[arg1] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method3296() {
		if (Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846) || Static426.anInt7278 == Static566.anInt9278) {
			Static33.method583(Static307.aClass100_6);
			if (Static469.anInt8019 != Static566.anInt9278) {
				Static282.method4207();
			}
		} else {
			Static277.method4190(11, false, Static584.anInt9529, Static274.anInt4959);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!ql;III)V")
	public static void method3297(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt7744 == -1 && arg1.anIntArray514 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg1.anInt7749 < arg2) {
			local15 = arg2 - arg1.anInt7749;
		} else if (arg1.anInt7751 > arg2) {
			local15 = arg1.anInt7751 - arg2;
		}
		@Pc(49) int local49 = Static72.aClass2_Sub12_Sub1_1.anInt1926 * arg1.anInt7754 >> 8;
		if (arg1.anInt7748 < arg3) {
			local15 += arg3 - arg1.anInt7748;
		} else if (arg1.anInt7745 > arg3) {
			local15 += arg1.anInt7745 - arg3;
		}
		if (arg1.anInt7747 == 0 || local15 - 256 > arg1.anInt7747 || Static72.aClass2_Sub12_Sub1_1.anInt1926 == 0 || arg4 != arg1.anInt7753) {
			if (arg1.aClass2_Sub10_Sub4_3 != null) {
				Static122.aClass2_Sub10_Sub1_2.method1012(arg1.aClass2_Sub10_Sub4_3);
				arg1.aClass2_Sub7_Sub1_2 = null;
				arg1.aClass2_Sub20_1 = null;
				arg1.aClass2_Sub10_Sub4_3 = null;
			}
			if (arg1.aClass2_Sub10_Sub4_2 != null) {
				Static122.aClass2_Sub10_Sub1_2.method1012(arg1.aClass2_Sub10_Sub4_2);
				arg1.aClass2_Sub10_Sub4_2 = null;
				arg1.aClass2_Sub20_2 = null;
				arg1.aClass2_Sub7_Sub1_3 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(159) int local159 = local49 * (arg1.anInt7747 - local15) / arg1.anInt7747;
		@Pc(241) Class2_Sub10_Sub4 local241;
		if (arg1.aClass2_Sub10_Sub4_3 != null) {
			arg1.aClass2_Sub10_Sub4_3.method3392(local159);
		} else if (arg1.anInt7744 >= 0) {
			if (arg1.aBoolean611) {
				if (arg1.aClass2_Sub20_1 == null) {
					arg1.aClass2_Sub20_1 = Static178.method3063(Static493.aClass259_155, arg1.anInt7744);
				}
				if (arg1.aClass2_Sub20_1 != null) {
					if (arg1.aClass2_Sub7_Sub1_2 == null) {
						arg1.aClass2_Sub7_Sub1_2 = arg1.aClass2_Sub20_1.method3065(new int[] { 22050 });
					}
					if (arg1.aClass2_Sub7_Sub1_2 != null) {
						local241 = Static600.method3373(arg1.aClass2_Sub7_Sub1_2, local159);
						local241.method3403(-1);
						Static122.aClass2_Sub10_Sub1_2.method1013(local241);
						arg1.aClass2_Sub10_Sub4_3 = local241;
					}
				}
			} else {
				@Pc(183) Class331 local183 = Static604.method7303(Static261.aClass259_146, arg1.anInt7744, 0);
				if (local183 != null) {
					@Pc(190) Class2_Sub7_Sub1 local190 = local183.method7305().method5536(Static275.aClass335_1);
					@Pc(195) Class2_Sub10_Sub4 local195 = Static600.method3373(local190, local159);
					local195.method3403(-1);
					Static122.aClass2_Sub10_Sub1_2.method1013(local195);
					arg1.aClass2_Sub10_Sub4_3 = local195;
				}
			}
		}
		if (arg1.aClass2_Sub10_Sub4_2 != null) {
			arg1.aClass2_Sub10_Sub4_2.method3392(local159);
			if (!arg1.aClass2_Sub10_Sub4_2.method7968()) {
				arg1.aClass2_Sub20_2 = null;
				arg1.aClass2_Sub10_Sub4_2 = null;
				arg1.aClass2_Sub7_Sub1_3 = null;
			}
		} else if (arg1.anIntArray514 != null && (arg1.anInt7752 -= arg0) <= 0) {
			@Pc(297) int local297;
			if (arg1.aBoolean609) {
				if (arg1.aClass2_Sub20_2 == null) {
					local297 = (int) ((double) arg1.anIntArray514.length * Math.random());
					arg1.aClass2_Sub20_2 = Static178.method3063(Static493.aClass259_155, arg1.anIntArray514[local297]);
				}
				if (arg1.aClass2_Sub20_2 != null) {
					if (arg1.aClass2_Sub7_Sub1_3 == null) {
						arg1.aClass2_Sub7_Sub1_3 = arg1.aClass2_Sub20_2.method3065(new int[] { 22050 });
					}
					if (arg1.aClass2_Sub7_Sub1_3 != null) {
						local241 = Static600.method3373(arg1.aClass2_Sub7_Sub1_3, local159);
						local241.method3403(0);
						Static122.aClass2_Sub10_Sub1_2.method1013(local241);
						arg1.anInt7752 = (int) ((double) (arg1.anInt7741 - arg1.anInt7743) * Math.random()) + arg1.anInt7743;
						arg1.aClass2_Sub10_Sub4_2 = local241;
						return;
					}
				}
				return;
			}
			local297 = (int) (Math.random() * (double) arg1.anIntArray514.length);
			@Pc(372) Class331 local372 = Static604.method7303(Static261.aClass259_146, arg1.anIntArray514[local297], 0);
			if (local372 != null) {
				@Pc(379) Class2_Sub7_Sub1 local379 = local372.method7305().method5536(Static275.aClass335_1);
				@Pc(384) Class2_Sub10_Sub4 local384 = Static600.method3373(local379, local159);
				local384.method3403(0);
				Static122.aClass2_Sub10_Sub1_2.method1013(local384);
				arg1.aClass2_Sub10_Sub4_2 = local384;
				arg1.anInt7752 = arg1.anInt7743 + (int) (Math.random() * (double) (arg1.anInt7741 - arg1.anInt7743));
				return;
			}
		}
	}
}
