import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!nk;")
	public static Class121 aClass121_116;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Z")
	public static boolean aBoolean326 = true;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lclient!ld;")
	public static Class99 method4114(@OriginalArg(0) int arg0) {
		@Pc(10) Class99 local10 = (Class99) Static192.aClass187_102.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static28.aClass121_14.method3115(Static295.method4496(arg0), Static163.method2813(arg0));
		local10 = new Class99();
		local10.anInt3039 = arg0;
		if (local25 != null) {
			local10.method2642(new Class1_Sub14(local25));
		}
		local10.method2654();
		Static192.aClass187_102.method4524((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIBI[[II)I")
	public static int method4116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4) {
		@Pc(26) int local26 = (128 - arg2) * arg3[arg0][arg1] + arg2 * arg3[arg0 + 1][arg1] >> 7;
		@Pc(53) int local53 = arg3[arg0][arg1 + 1] * (128 - arg2) + arg3[arg0 + 1][arg1 + 1] * arg2 >> 7;
		return (128 - arg4) * local26 + local53 * arg4 >> 7;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLclient!qn;I)V")
	public static void method4118(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub25 arg1) {
		@Pc(8) int local8 = arg1.anInt4289;
		@Pc(12) int local12 = (int) arg1.aLong214;
		arg1.method4779();
		if (arg0) {
			Static125.method2193(local8);
		}
		Static1.method9(local8);
		@Pc(35) Class66 local35 = Static53.method968(local12);
		if (local35 != null) {
			Static103.method1865(local35);
		}
		@Pc(43) int local43 = Static110.anInt2281;
		@Pc(45) int local45;
		for (local45 = 0; local45 < local43; local45++) {
			if (Static88.method1624(Static17.aShortArray2[local45])) {
				Static115.method2063(local45);
			}
		}
		if (Static110.anInt2281 == 1) {
			Static249.aBoolean307 = false;
			Static86.method1605(Static36.anInt685, Static207.anInt3960, Static93.anInt1898, Static83.anInt1650);
		} else {
			Static86.method1605(Static36.anInt685, Static207.anInt3960, Static93.anInt1898, Static83.anInt1650);
			local45 = Static307.aClass1_Sub2_Sub6_4.method4023(Static244.aString255);
			for (@Pc(80) int local80 = 0; local80 < Static110.anInt2281; local80++) {
				@Pc(89) int local89 = Static307.aClass1_Sub2_Sub6_4.method4023(Static213.method3842(local80));
				if (local89 > local45) {
					local45 = local89;
				}
			}
			Static83.anInt1650 = Static110.anInt2281 * 15 + (Static41.aBoolean46 ? 26 : 22);
			Static93.anInt1898 = local45 + 8;
		}
		if (Static270.anInt4897 != -1) {
			Static290.method4438(1, Static270.anInt4897);
		}
	}
}
