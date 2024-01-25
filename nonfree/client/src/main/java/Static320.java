import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public static int anInt4977;

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "Lclient!wk;")
	public static Class268 aClass268_7;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Z")
	public static boolean method3942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)V")
	public static void method3944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg1 != Static148.anInt2666) {
			Static224.anIntArray234 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static224.anIntArray234[local13] = (local13 << 12) / arg1;
			}
			Static273.anInt4299 = arg1 - 1;
			Static331.anInt5292 = arg1 * 32;
			Static148.anInt2666 = arg1;
		}
		if (arg0 == Static458.anInt7496) {
			return;
		}
		if (Static148.anInt2666 == arg0) {
			Static346.anIntArray401 = Static224.anIntArray234;
		} else {
			Static346.anIntArray401 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static346.anIntArray401[local13] = (local13 << 12) / arg0;
			}
		}
		Static458.anInt7496 = arg0;
		Static157.anInt2733 = arg0 - 1;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)Lclient!em;")
	public static Class2_Sub4 method3947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub4_3;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)I")
	public static int method3948(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
