import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "Lclient!maa;")
	public static final Class227 aClass227_6 = new Class227();

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString71 = "";

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
	public static void method5477() {
		@Pc(7) int local7 = Static383.anInt7249;
		@Pc(9) int[] local9 = Static404.anIntArray362;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class15_Sub3_Sub3_Sub1_Sub1 local19 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt4011 > 0) {
				local19.anInt4011--;
				if (local19.anInt4011 == 0) {
					local19.aString45 = null;
				}
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static532.anInt9330; local57++) {
			@Pc(64) long local64 = (long) Static84.anIntArray73[local57];
			@Pc(70) Class2_Sub6 local70 = (Class2_Sub6) Static630.aClass335_29.method8357(local64);
			if (local70 != null) {
				@Pc(75) Class15_Sub3_Sub3_Sub1_Sub2 local75 = local70.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				if (local75.anInt4011 > 0) {
					local75.anInt4011--;
					if (local75.anInt4011 == 0) {
						local75.aString45 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!bn;I)Z")
	public static boolean method5478(@OriginalArg(0) Class37 arg0) {
		return arg0 == Static612.aClass37_10 || Static415.aClass37_3 == arg0 || arg0 == Static188.aClass37_8 || arg0 == Static357.aClass37_7;
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V")
	public static void method5480() {
		for (@Pc(15) Class2_Sub1_Sub19 local15 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7293(); local15 != null; local15 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7298()) {
			if (local15.anInt9806 > 1) {
				local15.anInt9806 = 0;
				Static130.aClass22_11.method470(((Class2_Sub1_Sub13) local15.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67).aLong180, local15);
				local15.aClass279_13.method7297();
			}
		}
		Static276.anInt5124 = 0;
		Static488.anInt8750 = 0;
		Static61.aClass271_6.method7181();
		Static539.aClass335_39.method8353();
		Static112.aClass279_6.method7297();
		Static531.method8225(Static167.aClass2_Sub1_Sub13_1);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIZII)V")
	public static void method5481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg2 + 1;
		Static567.method8614(arg3, arg1, Static186.anIntArrayArray12[arg2], arg0);
		@Pc(19) int local19 = arg4 - 1;
		Static567.method8614(arg3, arg1, Static186.anIntArrayArray12[arg4], arg0);
		for (@Pc(25) int local25 = local6; local25 <= local19; local25++) {
			@Pc(36) int[] local36 = Static186.anIntArrayArray12[local25];
			local36[arg3] = local36[arg1] = arg0;
		}
	}
}
