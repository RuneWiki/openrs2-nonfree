import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[250][];

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method5049(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static242.aClass22Array3 != Static134.aClass22Array1) {
			@Pc(12) int local12 = Static220.aClass22Array2[arg1].method8032(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class22 local19 = Static220.aClass22Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8032(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method8037(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIII)V")
	public static void method5052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(14) Class8_Sub1_Sub2 local14 = local7.aClass8_Sub1_Sub2_1;
		@Pc(17) Class8_Sub1_Sub2 local17 = local7.aClass8_Sub1_Sub2_2;
		if (local14 != null) {
			local14.aShort104 = (short) (local14.aShort104 * arg3 / (0x10 << Static611.anInt10115 - 7));
			local14.aShort105 = (short) (local14.aShort105 * arg3 / (0x10 << Static611.anInt10115 - 7));
		}
		if (local17 != null) {
			local17.aShort104 = (short) (local17.aShort104 * arg3 / (0x10 << Static611.anInt10115 - 7));
			local17.aShort105 = (short) (local17.aShort105 * arg3 / (0x10 << Static611.anInt10115 - 7));
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "([Lclient!fs;B)V")
	public static void method5053(@OriginalArg(0) Class134[] arg0) {
		Static463.anInt7896 = arg0.length;
		Static494.aClass134Array13 = new Class134[Static463.anInt7896 + 10];
		Static118.anIntArray17 = new int[Static463.anInt7896 + 10];
		Static682.method797(arg0, 0, Static494.aClass134Array13, 0, Static463.anInt7896);
		for (@Pc(33) int local33 = 0; local33 < Static463.anInt7896; local33++) {
			Static118.anIntArray17[local33] = Static494.aClass134Array13[local33].method9232();
		}
		for (@Pc(54) int local54 = Static463.anInt7896; local54 < Static494.aClass134Array13.length; local54++) {
			Static118.anIntArray17[local54] = 12;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZIIIIIIII)V")
	public static void method5055(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static394.aClass337Array5[Static57.anInt865++] = new Class337(4, arg2, arg4, arg6, arg6, arg4, arg5, arg1, arg1, arg5, arg0, arg0, arg3, arg3);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!la;I)Lclient!fs;")
	public static Class134 method5056(@OriginalArg(1) Class208 arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class134 local20 = (Class134) Static16.aClass391_1.method9275((long) arg1);
		if (local20 == null) {
			if (Static457.aBoolean592) {
				local20 = Static457.aClass57_11.method7654(Static684.method3649(arg0, arg1), true);
			} else {
				local20 = Static128.method6003(arg0.method4997(arg1));
			}
			Static16.aClass391_1.method9273((long) arg1, local20, 1);
		}
		return local20;
	}
}
