import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[112];

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_524 = Static181.method2795("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_525 = Static181.method2795("<)4col>");

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_526 = Static181.method2795("Mem:");

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
	public static int anInt1688 = -1;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_527 = Static181.method2795("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "[I")
	public static final int[] anIntArray167 = new int[100];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[Lclient!qe;)[Lclient!qe;")
	public static Class83[] method1372(@OriginalArg(1) Class83[] arg0) {
		@Pc(9) Class83[] local9 = new Class83[5];
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			local9[local11] = Static67.method1268(new Class83[] { Static129.method2179(local11), Static37.aClass83_298 });
			if (arg0 != null && arg0[local11] != null) {
				local9[local11] = Static67.method1268(new Class83[] { local9[local11], arg0[local11] });
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZII)I")
	public static int method1373(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 / arg1;
		@Pc(18) int local18 = arg2 & arg1 - 1;
		@Pc(24) int local24 = arg0 & arg1 - 1;
		@Pc(28) int local28 = arg0 / arg1;
		@Pc(33) int local33 = Static176.method2707(local28, local12);
		@Pc(40) int local40 = Static176.method2707(local28, local12 + 1);
		@Pc(47) int local47 = Static176.method2707(local28 + 1, local12);
		@Pc(56) int local56 = Static176.method2707(local28 + 1, local12 - -1);
		@Pc(63) int local63 = Static160.method2458(local18, arg1, local33, local40);
		@Pc(70) int local70 = Static160.method2458(local18, arg1, local47, local56);
		return Static160.method2458(local24, arg1, local63, local70);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
	public static void method1374(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class2_Sub10 local10 = (Class2_Sub10) Static27.aClass63_4.method2114(); local10 != null; local10 = (Class2_Sub10) Static27.aClass63_4.method2108()) {
			if ((long) arg0 == (local10.aLong149 >> 48 & 0xFFFFL)) {
				local10.method3254();
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method1375(@OriginalArg(1) Class24_Sub4 arg0) {
		@Pc(8) int local8 = arg0.anInt3294 - Static13.anInt386;
		if (arg0.anInt3347 == 0) {
			arg0.anInt3318 = 1024;
		}
		@Pc(24) int local24 = arg0.anInt3332 * 64 + arg0.anInt3315 * 128;
		arg0.anInt3316 += (local24 - arg0.anInt3316) / local8;
		@Pc(46) int local46 = arg0.anInt3332 * 64 + arg0.anInt3314 * 128;
		arg0.anInt3349 += (local46 - arg0.anInt3349) / local8;
		if (arg0.anInt3347 == 1) {
			arg0.anInt3318 = 1536;
		}
		arg0.anInt3339 = 0;
		if (arg0.anInt3347 == 2) {
			arg0.anInt3318 = 0;
		}
		if (arg0.anInt3347 == 3) {
			arg0.anInt3318 = 512;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public static void method1377() {
		if (Static111.anInt2577 > 0) {
			Static193.method2906();
		} else {
			Static197.method2972(40);
			Static36.aClass25_3 = Static175.aClass25_5;
			Static175.aClass25_5 = null;
		}
	}
}
