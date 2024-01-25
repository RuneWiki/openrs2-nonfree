import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!no", name = "g", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_24 = new Class211();

	@OriginalMember(owner = "client!no", name = "i", descriptor = "[I")
	public static final int[] anIntArray460 = new int[] { 0, 0, 0, 0, -1, 0, 0, 2, -1, 0, 0, 5, 0, 1, 0, -2, 6, 0, 0, 0, 3, 0, 0, 0, 0, 0, -2, 0, 3, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 15, 0, -1, 0, 2, 0, 4, 0, 0, 1, -1, 5, 0, 5, 2, 6, 0, 11, 0, 0, -1, 0, 0, 6, 0, 0, 0, 8, 0, 4, 0, 0, 0, -2, 0, 0, -2, 0, 12, 0, -2, -2, -1, 0, 10, 6, 9, 3, 0, 8, 0, 0, 8, 0, 8, 10, -2, 3, 0, 0, 0, 2, 8, 0, 0, 0, 0, 0, 7, 0, 0, 2, 0, 2, -1, 0, 6, 6, -1, 17, 5, -2, 0, 0, -2, 28, 0, 0, -1, -1, 0, 0, 12, 0, 0, 3, 0, 12, 0, 0, 0, 0, 0, 6, 1, 0, 0, 3, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 8, 0, 0, 4, 0, 0, 6, 1, -1, -2, -2, 20, 7, 0, 0, 0, 1, 10, 0, 8, 0, 0, 0, 0, 0, -1, 0, 4, 6, 0, 0, 0, 0, 0, 15, -1, 2, 0, 6, 0, 0, 12, 0, 7, 2, 0, 0, 0, 0, 0, 0, -1, 3, 0, 12, 8, 6, 0, 14, 0, 0, 10, 0, -1, 7, 0, 0, 0, 6, 0, 0, 0, 0, -1, 0, 0, 14, 0, 0, 8, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 2, -2 };

	@OriginalMember(owner = "client!no", name = "j", descriptor = "Lclient!mb;")
	public static Class132 aClass132_14 = null;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean293 = true;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "I")
	public static int anInt3932 = 0;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	public static int anInt3933 = -1;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	public static void method3832() {
		Static12.aClass70_7.method1399();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	public static void method3833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static41.anIntArray721[arg1] = arg0;
		@Pc(17) Class6_Sub37 local17 = (Class6_Sub37) Static56.aClass108_19.method2900((long) arg1);
		if (local17 == null) {
			local17 = new Class6_Sub37(Static245.method4300() + 500L);
			Static56.aClass108_19.method2898((long) arg1, local17);
		} else {
			local17.aLong193 = Static245.method4300() + 500L;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIII)Lclient!li;")
	public static Class125 method3835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) Class122[] local15 = null;
		@Pc(19) Class79 local19 = Static99.method5558(arg0);
		if (local19.anIntArray244 != null) {
			local15 = new Class122[local19.anIntArray244.length];
			for (@Pc(29) int local29 = 0; local29 < local15.length; local29++) {
				@Pc(38) Class133 local38 = Static212.method3768(local19.anIntArray244[local29]);
				local15[local29] = new Class122(local38.anInt3608, local38.anInt3610, local38.anInt3612, local38.anInt3600, local38.anInt3605, local38.anInt3606, local38.anInt3603, local38.aBoolean273);
			}
		}
		return new Class125(local19.anInt1730, local15, local19.anInt1729, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V")
	public static void method3836(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(9, arg0);
		local8.method2645();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method3837(@OriginalArg(0) Class44_Sub4_Sub4 arg0) {
		@Pc(9) int local9 = arg0.anInt5084 - Static76.anInt2853;
		@Pc(21) int local21 = arg0.anInt5109 * 128 + arg0.method4714() * 64;
		@Pc(33) int local33 = arg0.anInt5097 * 128 + arg0.method4714() * 64;
		arg0.anInt6340 += (local21 - arg0.anInt6340) / local9;
		arg0.anInt6339 += (local33 - arg0.anInt6339) / local9;
		arg0.anInt5155 = 0;
		if (arg0.anInt5143 == 0) {
			arg0.method4706(8192);
		}
		if (arg0.anInt5143 == 1) {
			arg0.method4706(12288);
		}
		if (arg0.anInt5143 == 2) {
			arg0.method4706(0);
		}
		if (arg0.anInt5143 == 3) {
			arg0.method4706(4096);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([BI)Z")
	public static boolean method3838(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub10 local8 = new Class6_Sub10(arg0);
		@Pc(12) int local12 = local8.method3972();
		if (local12 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local8.method3972() == 1;
		if (local33) {
			Static180.method3742(local8);
		}
		Static122.method2428(local8);
		return true;
	}
}
