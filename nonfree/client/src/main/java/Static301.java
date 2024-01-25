import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!bp;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!oa;")
	public static final Class170 aClass170_7 = new Class170();

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_183 = new Class48(31, 8);

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_128 = new Class211(103, 3);

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
	public static int anInt5122 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	public static void method4496() {
		Static229.anInt3862 = 2;
		Static355.aBoolean431 = false;
		Static315.aClass230_71 = null;
		Static157.anInt2868 = -1;
		Static271.anInt4720 = 1;
		Static243.anInt4123 = 0;
		Static211.anInt3648 = -1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg4;
		@Pc(14) int local14 = arg6 - arg4;
		for (@Pc(16) int local16 = arg5; local16 < local9; local16++) {
			Static382.method5419(Static369.anIntArrayArray35[local16], arg3, arg2, arg1);
		}
		@Pc(34) int local34 = arg4 + arg3;
		@Pc(39) int local39 = arg2 - arg4;
		for (@Pc(41) int local41 = arg6; local41 > local14; local41--) {
			Static382.method5419(Static369.anIntArrayArray35[local41], arg3, arg2, arg1);
		}
		for (@Pc(57) int local57 = local9; local57 <= local14; local57++) {
			@Pc(63) int[] local63 = Static369.anIntArrayArray35[local57];
			Static382.method5419(local63, arg3, local34, arg1);
			Static382.method5419(local63, local34, local39, arg0);
			Static382.method5419(local63, local39, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4498(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static198.anInt3499 > 0) {
			local21 = Static138.aByteArrayArray6[--Static198.anInt3499];
			Static138.aByteArrayArray6[Static198.anInt3499] = null;
			return local21;
		} else if (arg0 == 5000 && Static181.anInt5500 > 0) {
			local21 = Static383.aByteArrayArray22[--Static181.anInt5500];
			Static383.aByteArrayArray22[Static181.anInt5500] = null;
			return local21;
		} else if (arg0 == 30000 && Static262.anInt6339 > 0) {
			local21 = Static342.aByteArrayArray19[--Static262.anInt6339];
			Static342.aByteArrayArray19[Static262.anInt6339] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}
}
