import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!re", name = "g", descriptor = "[I")
	public static int[] anIntArray477;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1361 = Static169.method2903(":chalreq:");

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!ob;")
	public static Class60 aClass60_13 = null;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!td;")
	public static Class79 aClass79_23 = new Class79(5);

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1362 = Static169.method2903("au");

	@OriginalMember(owner = "client!re", name = "s", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1364 = Static169.method2903("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1363 = aClass23_1364;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	public static int anInt3609 = 1;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1365 = Static169.method2903("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!re", name = "u", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1366 = aClass23_1365;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method2472() {
		if (Static44.anIntArray145 != null && Static110.anIntArray379 != null) {
			return;
		}
		Static110.anIntArray379 = new int[256];
		Static44.anIntArray145 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static44.anIntArray145[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static110.anIntArray379[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILclient!ga;)Z")
	public static boolean method2473(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(13) byte[] local13 = arg1.method1298(arg0);
		if (local13 == null) {
			return false;
		} else {
			Static92.method1615(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public static void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub21 local12 = (Class1_Sub21) Static82.aClass10_6.method256((long) arg1);
		if (local12 == null) {
			local12 = new Class1_Sub21();
			Static82.aClass10_6.method263(local12, (long) arg1);
		}
		if (arg2 >= local12.anIntArray513.length) {
			@Pc(44) int[] local44 = new int[arg2 + 1];
			@Pc(49) int[] local49 = new int[arg2 + 1];
			for (@Pc(51) int local51 = 0; local51 < local12.anIntArray513.length; local51++) {
				local44[local51] = local12.anIntArray513[local51];
				local49[local51] = local12.anIntArray515[local51];
			}
			for (@Pc(77) int local77 = local12.anIntArray513.length; local77 < arg2; local77++) {
				local44[local77] = -1;
				local49[local77] = 0;
			}
			local12.anIntArray513 = local44;
			local12.anIntArray515 = local49;
		}
		local12.anIntArray513[arg2] = arg0;
		local12.anIntArray515[arg2] = arg3;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	public static void method2475() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static38.anInt1037 - 1; local18++) {
				if (Static37.anIntArray124[local18] < 1000 && Static37.anIntArray124[local18 + 1] > 1000) {
					@Pc(38) Class23 local38 = Static104.aClass23Array12[local18];
					local12 = false;
					Static104.aClass23Array12[local18] = Static104.aClass23Array12[local18 + 1];
					Static104.aClass23Array12[local18 + 1] = local38;
					@Pc(58) Class23 local58 = Static102.aClass23Array11[local18];
					Static102.aClass23Array11[local18] = Static102.aClass23Array11[local18 + 1];
					Static102.aClass23Array11[local18 + 1] = local58;
					@Pc(76) int local76 = Static37.anIntArray124[local18];
					Static37.anIntArray124[local18] = Static37.anIntArray124[local18 + 1];
					Static37.anIntArray124[local18 + 1] = local76;
					@Pc(94) int local94 = Static104.anIntArray354[local18];
					Static104.anIntArray354[local18] = Static104.anIntArray354[local18 + 1];
					Static104.anIntArray354[local18 + 1] = local94;
					@Pc(112) int local112 = Static153.anIntArray506[local18];
					Static153.anIntArray506[local18] = Static153.anIntArray506[local18 + 1];
					Static153.anIntArray506[local18 + 1] = local112;
					@Pc(130) int local130 = Static178.anIntArray592[local18];
					Static178.anIntArray592[local18] = Static178.anIntArray592[local18 + 1];
					Static178.anIntArray592[local18 + 1] = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
	public static void method2476() {
		aClass23_1362 = null;
		aClass23_1361 = null;
		aClass23_1366 = null;
		aClass23_1365 = null;
		aClass60_13 = null;
		aClass23_1363 = null;
		anIntArray477 = null;
		aClass79_23 = null;
		aClass23_1364 = null;
	}
}
