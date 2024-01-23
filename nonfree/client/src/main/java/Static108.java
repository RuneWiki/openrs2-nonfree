import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "[Lclient!jg;")
	public static Class85[] aClass85Array2;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Lclient!l;")
	public static Class98 aClass98_14 = new Class98(64);

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString79 = "Attack";

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
	public static int anInt2013 = 0;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	public static int anInt2014 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I")
	public static int method1764(@OriginalArg(0) int arg0) {
		if (Static150.aClass139_3 != null) {
			Static150.aClass139_3.method3559();
			Static150.aClass139_3 = null;
		}
		Static255.anInt5259++;
		if (Static255.anInt5259 > 4) {
			Static255.anInt5259 = 0;
			Static89.anInt1663 = 0;
			return arg0;
		}
		Static89.anInt1663 = 0;
		if (Static311.anInt6114 == Static94.anInt1707) {
			Static311.anInt6114 = Static239.anInt4856;
		} else {
			Static311.anInt6114 = Static94.anInt1707;
		}
		return -1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V")
	public static void method1766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class95 local13 = local7.aClass95_1;
		if (local13 != null) {
			local13.anInt2813 = local13.anInt2813 * arg3 / 16;
			local13.anInt2806 = local13.anInt2806 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Lclient!jg;")
	public static Class85 method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt4483; local13++) {
			@Pc(22) Class85 local22 = local7.aClass85Array3[local13];
			if ((local22.aLong107 >> 29 & 0x3L) == 2L && local22.anInt2482 == arg1 && local22.anInt2480 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BILclient!rn;)Lclient!nj;")
	public static Class3_Sub22 method1770(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(8) byte[] local8 = arg1.method4137(arg0);
		return local8 == null ? null : new Class3_Sub22(local8);
	}
}
