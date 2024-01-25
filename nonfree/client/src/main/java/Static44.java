import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "Z")
	public static boolean aBoolean87;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "Lclient!lf;")
	public static Class90 aClass90_4;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
	public static int anInt963 = -50;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_25 = new Class140(64);

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "[I")
	public static final int[] anIntArray119 = new int[5];

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
	public static void method1006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(19) int local19 = -1;
		Static97.method1784(arg1 - arg0, Static327.anIntArrayArray63[arg3], arg2, arg1 + arg0);
		while (local7 < local9) {
			local19 += 2;
			local12 += local19;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(56) int[] local56 = Static327.anIntArrayArray63[arg3 + local9];
				@Pc(62) int[] local62 = Static327.anIntArrayArray63[arg3 - local9];
				@Pc(66) int local66 = arg1 + local7;
				@Pc(71) int local71 = arg1 - local7;
				Static97.method1784(local71, local56, arg2, local66);
				Static97.method1784(local71, local62, arg2, local66);
			}
			@Pc(88) int local88 = arg1 + local9;
			@Pc(93) int local93 = arg1 - local9;
			@Pc(100) int[] local100 = Static327.anIntArrayArray63[arg3 + local7];
			@Pc(107) int[] local107 = Static327.anIntArrayArray63[arg3 - local7];
			Static97.method1784(local93, local100, arg2, local88);
			Static97.method1784(local93, local107, arg2, local88);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method1007() {
		@Pc(7) Class99 local7 = null;
		try {
			@Pc(11) Class134 local11 = Static180.aClass110_6.method3356();
			while (local11.anInt4033 == 0) {
				Static134.method2598(1L);
			}
			if (local11.anInt4033 == 1) {
				local7 = (Class99) local11.anObject6;
				@Pc(41) Class1_Sub7 local41 = new Class1_Sub7(Static177.anInt3675 * 6 + 3);
				local41.method3108(1);
				local41.method3128(Static177.anInt3675);
				for (@Pc(51) int local51 = 0; local51 < Static302.anIntArray607.length; local51++) {
					if (Static162.aBooleanArray13[local51]) {
						local41.method3128(local51);
						local41.method3098(Static302.anIntArray607[local51]);
					}
				}
				local7.method2723(0, local41.anInt3368, local41.aByteArray58);
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local7 != null) {
				local7.method2725();
			}
		} catch (@Pc(93) Exception local93) {
		}
		Static74.aLong117 = Static349.method5647();
		Static131.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!vk;)V")
	public static void method1014(@OriginalArg(1) Class1_Sub41 arg0) {
		if (!Static179.aBoolean310) {
			arg0.method5710();
			Static277.anInt6207--;
		}
	}
}
