import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Z")
	public static boolean aBoolean403;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Lclient!og;")
	public static Class127 aClass127_13 = null;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!hh;")
	public static Class69 aClass69_26 = new Class69();

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public static int anInt5256 = 0;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	public static int anInt5258 = 0;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public static int anInt5259 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Lclient!bk;")
	public static Class1_Sub2_Sub4 method4028(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub4 local10 = (Class1_Sub2_Sub4) Static247.aClass31_36.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static212.method3960(arg0, Static254.aClass7_239, Static27.aClass7_30);
		if (local10 != null) {
			Static247.aClass31_36.method851(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	public static void method4030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class69 local13 = Static4.aClass69ArrayArrayArray1[Static159.anInt2978][arg1][arg0];
		if (local13 == null) {
			Static92.method1521(Static159.anInt2978, arg1, arg0);
			return;
		}
		@Pc(24) Class1_Sub2_Sub5 local24 = null;
		@Pc(26) int local26 = -99999999;
		@Pc(31) Class1_Sub2_Sub5 local31;
		for (local31 = (Class1_Sub2_Sub5) local13.method1636(); local31 != null; local31 = (Class1_Sub2_Sub5) local13.method1631()) {
			@Pc(39) Class120 local39 = Static183.method4458(local31.aClass6_Sub7_1.anInt4998);
			@Pc(42) int local42 = local39.anInt3275;
			if (local39.anInt3266 == 1) {
				local42 *= local31.aClass6_Sub7_1.anInt4999 + 1;
			}
			if (local26 < local42) {
				local24 = local31;
				local26 = local42;
			}
		}
		if (local24 == null) {
			Static92.method1521(Static159.anInt2978, arg1, arg0);
			return;
		}
		local13.method1627(local24);
		@Pc(88) Class6_Sub7 local88 = null;
		local31 = (Class1_Sub2_Sub5) local13.method1636();
		@Pc(97) Class6_Sub7 local97 = null;
		while (local31 != null) {
			@Pc(103) Class6_Sub7 local103 = local31.aClass6_Sub7_1;
			if (local24.aClass6_Sub7_1.anInt4998 != local103.anInt4998) {
				if (local88 == null) {
					local88 = local103;
				}
				if (local88.anInt4998 != local103.anInt4998 && local97 == null) {
					local97 = local103;
				}
			}
			local31 = (Class1_Sub2_Sub5) local13.method1631();
		}
		@Pc(142) long local142 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static18.method324(Static159.anInt2978, arg1, arg0, Static124.method1919(Static159.anInt2978, arg1 * 128 + 64, arg0 * 128 + 64), local24.aClass6_Sub7_1, local142, local88, local97);
	}
}
