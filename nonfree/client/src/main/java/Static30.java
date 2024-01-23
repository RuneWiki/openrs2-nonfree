import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)J")
	public static long method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass160_1 == null ? 0L : local7.aClass160_1.aLong170;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIFIIZII)[I")
	public static int[] method496(@OriginalArg(2) float arg0) {
		@Pc(2) int[] local2 = new int[2048];
		@Pc(16) Class1_Sub4_Sub20 local16 = new Class1_Sub4_Sub20();
		local16.anInt2668 = 4;
		local16.anInt2673 = (int) (arg0 * 4096.0F);
		local16.anInt2676 = 8;
		local16.anInt2663 = 8;
		local16.aBoolean167 = true;
		local16.anInt2665 = 35;
		local16.method4755();
		Static225.method3499(1, 2048);
		local16.method2318(0, local2);
		return local2;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIZILclient!hi;)V")
	public static void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class66 arg6) {
		if (Static251.aBoolean314) {
			Static175.anInt3407 = 32;
		} else {
			Static175.anInt3407 = 0;
		}
		Static251.aBoolean314 = false;
		@Pc(116) int local116;
		if (Static281.anInt5089 != 0) {
			if (arg4 >= arg1 && arg1 + 16 > arg4 && arg0 <= arg2 && arg0 + 16 > arg2) {
				arg6.anInt2216 -= 4;
				Static103.method1865(arg6);
			} else if (arg1 <= arg4 && arg4 < arg1 + 16 && arg0 + arg3 - 16 <= arg2 && arg0 + arg3 > arg2) {
				arg6.anInt2216 += 4;
				Static103.method1865(arg6);
			} else if (arg1 - Static175.anInt3407 <= arg4 && arg4 < Static175.anInt3407 + arg1 + 16 && arg0 + 16 <= arg2 && arg2 < arg3 + arg0 - 16) {
				local116 = (arg3 - 32) * arg3 / arg5;
				if (local116 < 8) {
					local116 = 8;
				}
				@Pc(128) int local128 = arg3 - local116 - 32;
				@Pc(140) int local140 = arg2 - arg0 - local116 / 2 - 16;
				arg6.anInt2216 = local140 * (arg5 - arg3) / local128;
				Static103.method1865(arg6);
				Static251.aBoolean314 = true;
			}
		}
		if (Static20.anInt382 == 0) {
			return;
		}
		local116 = arg6.anInt2204;
		if (arg4 >= arg1 - local116 && arg0 <= arg2 && arg1 + 16 > arg4 && arg0 + arg3 >= arg2) {
			arg6.anInt2216 += Static20.anInt382 * 45;
			Static103.method1865(arg6);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)Lclient!s;")
	public static Class1_Sub2_Sub17 method498(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub17 local10 = (Class1_Sub2_Sub17) Static263.aClass148_10.method3600((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static219.aClass121_94.method3115(11, arg0);
		local10 = new Class1_Sub2_Sub17();
		if (local27 != null) {
			local10.method3964(new Class1_Sub14(local27));
		}
		Static263.aClass148_10.method3602(local10, (long) arg0);
		return local10;
	}
}
