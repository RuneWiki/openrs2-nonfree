import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "[Lclient!rh;")
	public static Class78_Sub1[] aClass78_Sub1Array3;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "Lclient!ee;")
	public static Class27 aClass27_3;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
	public static int anInt2060;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!oj;")
	public static Class84 aClass84_21 = new Class84(50);

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_668 = Static186.method3527("::rect_debug");

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "Lclient!hh;")
	private static Class50 aClass50_671 = Static186.method3527("glow2:");

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "Lclient!hh;")
	public static Class50 aClass50_669 = aClass50_671;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_670 = aClass50_671;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_672 = Static186.method3527(" <col=ffff00>");

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_673 = Static186.method3527("<img=0>");

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBIII)V")
	public static void method1585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static57.aClass90_8.method2819((long) arg3);
		if (local12 == null) {
			local12 = new Class1_Sub14();
			Static57.aClass90_8.method2817(local12, (long) arg3);
		}
		if (local12.anIntArray142.length <= arg1) {
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(43) int[] local43 = new int[arg1 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray142.length; local45++) {
				local38[local45] = local12.anIntArray142[local45];
				local43[local45] = local12.anIntArray140[local45];
			}
			for (@Pc(75) int local75 = local12.anIntArray142.length; local75 < arg1; local75++) {
				local38[local75] = -1;
				local43[local75] = 0;
			}
			local12.anIntArray142 = local38;
			local12.anIntArray140 = local43;
		}
		local12.anIntArray142[arg1] = arg2;
		local12.anIntArray140[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lclient!ke;")
	public static Class63 method1586(@OriginalArg(0) int arg0) {
		@Pc(6) Class63 local6 = (Class63) Static31.aClass84_12.method2579((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static63.aClass86_24.method3325(16, arg0);
		local6 = new Class63();
		if (local25 != null) {
			local6.method1731(new Class1_Sub17(local25));
		}
		Static31.aClass84_12.method2582(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
	public static void method1589(@OriginalArg(0) boolean arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static103.anInt2065; local15++) {
			@Pc(23) Class20_Sub3_Sub2 local23 = Static78.aClass20_Sub3_Sub2Array1[Static21.anIntArray44[local15]];
			@Pc(32) long local32 = (long) Static21.anIntArray44[local15] << 32 | 0x20000000L;
			if (local23 != null && local23.method2467() && local23.aClass105_1.aBoolean182 == arg0 && local23.aClass105_1.method3120()) {
				@Pc(61) int local61 = local23.anInt3022 >> 7;
				@Pc(66) int local66 = local23.anInt3008 >> 7;
				if (local61 >= 0 && local61 < 104 && local66 >= 0 && local66 < 104) {
					if (local23.anInt3034 == 1 && (local23.anInt3022 & 0x7F) == 64 && (local23.anInt3008 & 0x7F) == 64) {
						if (Static231.anIntArrayArray39[local61][local66] == Static1.anInt41) {
							continue;
						}
						Static231.anIntArrayArray39[local61][local66] = Static1.anInt41;
					}
					if (!local23.aClass105_1.aBoolean181) {
						local32 |= Long.MIN_VALUE;
					}
					local23.anInt3011 = Static131.method2213(local23.anInt3008 + local23.anInt3034 * 64 - 64, local23.anInt3022 - 64 - -(local23.anInt3034 * 64), Static212.anInt4195);
					Static229.method3476(Static212.anInt4195, local23.anInt3022, local23.anInt3008, local23.anInt3011, local23.anInt3034 * 64 + 60 - 64, local23, local23.anInt3054, local32, local23.aBoolean128);
				}
			}
		}
	}
}
