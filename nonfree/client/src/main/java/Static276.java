import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "[[Lclient!jw;")
	public static Class4_Sub1[][] aClass4_Sub1ArrayArray1;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	public static int anInt4979;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
	public static int anInt4980;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
	public static int anInt4985 = -1;

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "[I")
	public static final int[] anIntArray265 = new int[3];

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
	public static int anInt4992 = 0;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIZ)V")
	public static void method4486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 >= Static630.anInt10099 && arg1 <= Static16.anInt4339) {
			@Pc(23) int local23 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg0);
			@Pc(29) int local29 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg3);
			Static366.method5972(local29, arg1, local23, arg2);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!s;)V")
	public static void method4487(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		Static364.aClass51Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public static void method4490() {
		@Pc(5) int local5 = 0;
		if (Static262.aClass3_Sub27_12 != null) {
			local5 = Static262.aClass3_Sub27_12.aClass21_Sub17_1.method6184();
		}
		@Pc(27) int local27;
		@Pc(36) int local36;
		if (local5 == 2) {
			local27 = Static463.anInt7087 <= 800 ? Static463.anInt7087 : 800;
			Static109.anInt2357 = local27;
			local36 = Static73.anInt1757 > 600 ? 600 : Static73.anInt1757;
			Static349.anInt6748 = (Static463.anInt7087 - local27) / 2;
			Static603.anInt9836 = 0;
			Static330.anInt6165 = local36;
		} else if (local5 == 1) {
			local27 = Static463.anInt7087 <= 1024 ? Static463.anInt7087 : 1024;
			local36 = Static73.anInt1757 > 768 ? 768 : Static73.anInt1757;
			Static109.anInt2357 = local27;
			Static349.anInt6748 = (Static463.anInt7087 - local27) / 2;
			Static603.anInt9836 = 0;
			Static330.anInt6165 = local36;
		} else {
			Static330.anInt6165 = Static73.anInt1757;
			Static349.anInt6748 = 0;
			Static603.anInt9836 = 0;
			Static109.anInt2357 = Static463.anInt7087;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!gt;[I)V")
	public static void method4494(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub2_Sub1_Sub1 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg1.anIntArray306 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg1.anIntArray306.length; local8++) {
				if (arg2[local8] != arg1.anIntArray306[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg1.anInt5718 != -1) {
				@Pc(44) Class361 local44 = Static115.aClass227_1.method5968(arg1.anInt5718);
				@Pc(47) int local47 = local44.anInt9867;
				if (local47 == 1) {
					arg1.anInt5777 = 1;
					arg1.anInt5710 = arg0;
					arg1.anInt5763 = 0;
					arg1.anInt5770 = 0;
					arg1.anInt5723 = 0;
					if (!arg1.aBoolean405) {
						Static74.method1765(arg1.anInt5770, local44, arg1);
					}
				}
				if (local47 == 2) {
					arg1.anInt5763 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg1.anIntArray306 == null || arg1.anIntArray306[local8] == -1 || Static115.aClass227_1.method5968(arg2[local8]).anInt9855 >= Static115.aClass227_1.method5968(arg1.anIntArray306[local8]).anInt9855) {
				arg1.anInt5710 = arg0;
				arg1.anIntArray306 = arg2;
				arg1.anInt5793 = arg1.anInt5792;
			}
		}
		if (local6) {
			arg1.anIntArray306 = arg2;
			arg1.anInt5710 = arg0;
			arg1.anInt5793 = arg1.anInt5792;
		}
	}
}
