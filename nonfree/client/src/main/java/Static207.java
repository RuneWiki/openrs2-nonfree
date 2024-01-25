import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public static int anInt6028;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public static int anInt6026 = -1;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!bu;")
	public static final Class30 aClass30_11 = new Class30("WTQA", 2);

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_153 = new Class12(26, 1);

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLjava/lang/String;Lclient!ug;)I")
	public static int method4750(@OriginalArg(1) String arg0, @OriginalArg(2) Class1_Sub28 arg1) {
		@Pc(11) int local11 = arg1.anInt6812;
		@Pc(15) byte[] local15 = Static71.method1146(arg0);
		arg1.method5360(local15.length);
		arg1.anInt6812 += Static453.aClass239_1.method5180(arg1.anInt6812, local15.length, 0, arg1.aByteArray86, local15);
		return arg1.anInt6812 - local11;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!fo;BI)Lclient!vi;")
	public static Class1_Sub41 method4751(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1815(arg1);
		return local8 == null ? null : new Class1_Sub41(local8);
	}
}
