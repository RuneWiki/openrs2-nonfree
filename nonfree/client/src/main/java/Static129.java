import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "[Lclient!ma;")
	public static Class5_Sub19[] aClass5_Sub19Array1;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	public static int anInt2696;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	public static int anInt2698;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Lclient!mb;")
	public static Class65 aClass65_8;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[J")
	public static final long[] aLongArray29 = new long[200];

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	public static int anInt2691 = 0;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_984 = Static161.method2452("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_985 = Static161.method2452("rect_debug=");

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
	public static int anInt2700 = 0;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
	public static int anInt2701 = -1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)I")
	public static int method2005(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!wa;III)[Lclient!jc;")
	public static Class47[] method2007(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static167.method2532(arg0, arg2, arg1) ? Static69.method1142() : null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[IIIIII[BI)V")
	public static void method2008(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = -(arg8 >> 2);
		@Pc(15) int local15 = -(arg8 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			for (@Pc(31) int local31 = local10; local31 < 0; local31++) {
				if (arg7[arg2++] == 0) {
					arg3++;
				} else {
					arg1[arg3++] = arg6;
				}
				if (arg7[arg2++] == 0) {
					arg3++;
				} else {
					arg1[arg3++] = arg6;
				}
				if (arg7[arg2++] == 0) {
					arg3++;
				} else {
					arg1[arg3++] = arg6;
				}
				if (arg7[arg2++] == 0) {
					arg3++;
				} else {
					arg1[arg3++] = arg6;
				}
			}
			for (@Pc(96) int local96 = local15; local96 < 0; local96++) {
				if (arg7[arg2++] == 0) {
					arg3++;
				} else {
					arg1[arg3++] = arg6;
				}
			}
			arg3 += arg4;
			arg2 += arg0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!wa;Lclient!dc;Lclient!wa;BLclient!dc;)Lclient!ig;")
	public static Class5_Sub2_Sub8 method2009(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(4) Class20 arg3) {
		@Pc(8) int local8 = arg2.method734(arg3);
		@Pc(23) int local23 = arg2.method737(arg1, local8);
		return Static66.method1094(arg2, local23, local8, arg0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)I")
	public static int method2010(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static137.method2138(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BILclient!wa;ZLclient!wa;)Lclient!pd;")
	public static Class5_Sub2_Sub16 method2011(@OriginalArg(1) int arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(4) Class23 arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(20) int[] local20 = arg1.method731(arg0);
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(32) byte[] local32 = arg1.method749(local20[local22], arg0);
			if (local32 == null) {
				local15 = false;
			} else {
				@Pc(52) int local52 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
				@Pc(60) byte[] local60 = arg2.method749(0, local52);
				if (local60 == null) {
					local15 = false;
				}
			}
		}
		if (!local15) {
			return null;
		}
		try {
			return new Class5_Sub2_Sub16(arg1, arg2, arg0, false);
		} catch (@Pc(90) Exception local90) {
			return null;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
	public static int method2012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class5_Sub17 local10 = (Class5_Sub17) Static38.aClass75_5.method2072((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray233.length > arg0) {
			return local10.anIntArray233[arg0];
		} else {
			return -1;
		}
	}
}
