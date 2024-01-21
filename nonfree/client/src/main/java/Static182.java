import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!wd", name = "lb", descriptor = "I")
	public static int anInt4063;

	@OriginalMember(owner = "client!wd", name = "mb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
	public static int anInt4058 = 0;

	@OriginalMember(owner = "client!wd", name = "jb", descriptor = "Lclient!tf;")
	public static Class81 aClass81_15 = new Class81();

	@OriginalMember(owner = "client!wd", name = "kb", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array24 = new Class49[8];

	@OriginalMember(owner = "client!wd", name = "ob", descriptor = "I")
	public static int anInt4064 = 0;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)Lclient!lf;")
	public static Class49 method3024(@OriginalArg(1) int arg0) {
		@Pc(14) Class49 local14 = Static48.method882(arg0);
		for (@Pc(20) int local20 = local14.method1653() - 3; local20 > 0; local20 -= 3) {
			local14 = Static33.method692(new Class49[] { local14.method1661(local20, 0), Static81.aClass49_871, local14.method1665(local20) });
		}
		if (local14.method1653() > 9) {
			return Static33.method692(new Class49[] { Static63.aClass49_689, local14.method1661(local14.method1653() - 8, 0), Static13.aClass49_133, Static27.aClass49_334, local14, Static19.aClass49_258 });
		} else if (local14.method1653() > 6) {
			return Static33.method692(new Class49[] { Static149.aClass49_1435, local14.method1661(local14.method1653() - 4, 0), Static49.aClass49_561, Static27.aClass49_334, local14, Static19.aClass49_258 });
		} else {
			return Static33.method692(new Class49[] { Static40.aClass49_499, local14, Static66.aClass49_733 });
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIILclient!ka;IJ)Z")
	public static boolean method3025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub3 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static108.method1829(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([BIIZ)Lclient!lf;")
	public static Class49 method3026(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class49 local9 = new Class49();
		local9.aByteArray28 = new byte[arg1];
		local9.anInt2058 = 0;
		for (@Pc(23) int local23 = arg2; local23 < arg2 + arg1; local23++) {
			if (arg0[local23] != 0) {
				local9.aByteArray28[local9.anInt2058++] = arg0[local23];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
	public static void method3028() {
		anIntArrayArrayArray8 = null;
		aClass81_15 = null;
		aClass49Array24 = null;
	}
}
