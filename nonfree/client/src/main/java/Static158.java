import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array7;

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "Lclient!oe;")
	public static Class72 aClass72_220;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "Lclient!qe;")
	public static Class78 aClass78_647 = Static199.method3560(":trade:");

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "Lclient!wc;")
	public static Class110 aClass110_15 = new Class110(64);

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
	public static int anInt3655 = 1;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!nh;)Lclient!ha;")
	public static Class14_Sub2 method2846(@OriginalArg(1) Class2_Sub23 arg0) {
		return new Class14_Sub2(arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2091(), arg0.method2122());
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V")
	public static void method2847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static109.anInt2416; local5++) {
			if (Static202.anIntArray728[local5] + Static123.anIntArray461[local5] > arg3 && arg2 + arg3 > Static123.anIntArray461[local5] && arg1 < Static56.anIntArray160[local5] + Static92.anIntArray363[local5] && Static56.anIntArray160[local5] < arg0 + arg1) {
				Static84.aBooleanArray57[local5] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(III)Lclient!qe;")
	public static Class78 method2848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static225.aClass78_868;
		} else if (local8 < -6) {
			return Static175.aClass78_703;
		} else if (local8 < -3) {
			return Static72.aClass78_841;
		} else if (local8 < 0) {
			return Static219.aClass78_852;
		} else if (local8 > 9) {
			return Static174.aClass78_700;
		} else if (local8 > 6) {
			return Static156.aClass78_645;
		} else if (local8 > 3) {
			return Static27.aClass78_92;
		} else if (local8 > 0) {
			return Static129.aClass78_581;
		} else {
			return Static153.aClass78_642;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method2849(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static231.method2214(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!qe;Z)I")
	public static int method2850(@OriginalArg(0) Class78 arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(14) int local14 = 0; local14 < Static140.anInt3196; local14++) {
			if (arg0.method3038(Static159.aClass78Array31[local14])) {
				return local14;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
	public static void method2851() {
		for (@Pc(1) int local1 = 0; local1 < Static49.anInt897; local1++) {
			@Pc(6) Class100 local6 = Static38.aClass100Array2[local1];
			Static55.method715(local6);
			Static38.aClass100Array2[local1] = null;
		}
		Static49.anInt897 = 0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZIIIII)V")
	public static void method2852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg4; local7++) {
			Static221.method3893(arg1, arg0, Static183.anIntArrayArray40[local7], arg3);
		}
	}
}
