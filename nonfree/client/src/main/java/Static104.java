import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public static int anInt2340;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_39 = new Class145(36, 3);

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_40 = new Class145(33, 3);

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "[I")
	public static final int[] anIntArray173 = new int[1000];

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!oea;")
	public static final Class252 aClass252_2 = new Class252();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIBIIIII)V")
	public static void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static31.method728(arg3)) {
			return;
		}
		if (Static649.aClass303ArrayArray5[arg3] == null) {
			Static79.method1735(Static261.aClass303ArrayArray1[arg3], -1, arg8, arg9, arg5, arg4, arg6, arg0, arg10, arg1, arg7, arg2);
		} else {
			Static79.method1735(Static649.aClass303ArrayArray5[arg3], -1, arg8, arg9, arg5, arg4, arg6, arg0, arg10, arg1, arg7, arg2);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!vl;)I")
	public static int method1961(@OriginalArg(1) Class16_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt8130 == 0) {
			return 0;
		}
		@Pc(59) int local59;
		@Pc(53) int local53;
		if (arg0.anInt8100 != -1) {
			@Pc(14) Class16_Sub1_Sub1_Sub3 local14 = null;
			if (arg0.anInt8100 < 32768) {
				@Pc(40) Class2_Sub32 local40 = (Class2_Sub32) Static514.aClass323_32.method7484((long) arg0.anInt8100);
				if (local40 != null) {
					local14 = local40.aClass16_Sub1_Sub1_Sub3_Sub1_2;
				}
			} else if (arg0.anInt8100 >= 32768) {
				local14 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[arg0.anInt8100 - 32768];
			}
			if (local14 != null) {
				local53 = arg0.anInt8037 - local14.anInt8037;
				local59 = arg0.anInt8034 - local14.anInt8034;
				if (local53 != 0 || local59 != 0) {
					arg0.method7003((int) (Math.atan2((double) local53, (double) local59) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class16_Sub1_Sub1_Sub3_Sub2) {
			@Pc(88) Class16_Sub1_Sub1_Sub3_Sub2 local88 = (Class16_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local88.anInt8170 != -1 && (local88.anInt8133 == 0 || local88.anInt8136 > 0)) {
				local88.method7003(local88.anInt8170);
				local88.anInt8170 = -1;
			}
		} else if (arg0 instanceof Class16_Sub1_Sub1_Sub3_Sub1) {
			@Pc(117) Class16_Sub1_Sub1_Sub3_Sub1 local117 = (Class16_Sub1_Sub1_Sub3_Sub1) arg0;
			if (local117.anInt1683 != -1 && (local117.anInt8133 == 0 || local117.anInt8136 > 0)) {
				local53 = local117.anInt8037 - (local117.anInt1683 - Static406.anInt6899 - Static406.anInt6899) * 256;
				local59 = local117.anInt8034 - (local117.anInt1673 - Static338.anInt5885 - Static338.anInt5885) * 256;
				if (local53 != 0 || local59 != 0) {
					local117.method7003((int) (Math.atan2((double) local53, (double) local59) * 2607.5945876176133D) & 0x3FFF);
				}
				local117.anInt1683 = -1;
			}
		}
		return arg0.method7011();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[B)V")
	public static void method1962(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub17 local10 = new Class2_Sub17(arg0);
		@Pc(12) boolean local12 = false;
		while (true) {
			while (true) {
				@Pc(16) int local16 = local10.method2859();
				if (local16 == 0) {
					if (local12) {
						return;
					}
					if (Static229.anIntArray272 == null) {
						Static229.anIntArray272 = new int[4];
						Static74.anIntArray611 = new int[4];
						Static6.anInt127 = 4;
					}
					for (local16 = 0; local16 < Static229.anIntArray272.length; local16++) {
						Static229.anIntArray272[local16] = 0;
						Static74.anIntArray611[local16] = local16 * 20;
					}
					return;
				}
				if (local16 == 1) {
					if (Static229.anIntArray272 == null) {
						Static229.anIntArray272 = new int[4];
						Static6.anInt127 = 4;
						Static74.anIntArray611 = new int[4];
					}
					local12 = true;
					for (@Pc(39) int local39 = 0; local39 < Static229.anIntArray272.length; local39++) {
						Static229.anIntArray272[local39] = local10.method2836();
						Static74.anIntArray611[local39] = local10.method2836();
					}
				} else if (local16 == 2) {
					Static132.anInt2869 = local10.method2825();
				} else if (local16 == 3) {
					Static6.anInt127 = local10.method2859();
					Static74.anIntArray611 = new int[Static6.anInt127];
					Static229.anIntArray272 = new int[Static6.anInt127];
				}
			}
		}
	}
}
