import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static653 {

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!daa;Lclient!daa;I)V")
	public static void method9593(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		if (arg1.aClass2_Sub1_66 != null) {
			arg1.method9377();
		}
		arg1.aClass2_Sub1_67 = arg0;
		arg1.aClass2_Sub1_66 = arg0.aClass2_Sub1_66;
		arg1.aClass2_Sub1_66.aClass2_Sub1_67 = arg1;
		arg1.aClass2_Sub1_67.aClass2_Sub1_66 = arg1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BIJ)Lclient!eq;")
	public static Class2_Sub1_Sub5 method9595(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(22) Class2_Sub1_Sub5 local22 = (Class2_Sub1_Sub5) Static288.aClass335_15.method8357((long) arg0 << 56 | arg1);
		if (local22 == null) {
			local22 = new Class2_Sub1_Sub5(arg0, arg1);
			Static288.aClass335_15.method8356(local22, local22.aLong313);
		}
		return local22;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)I")
	public static int method9596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) byte local17;
		if (arg0 > 20000) {
			local17 = 4;
			Static380.method6434();
		} else if (arg0 > 10000) {
			Static481.method7650();
			local17 = 3;
		} else if (arg0 > 5000) {
			Static631.method9340();
			local17 = 2;
		} else {
			local17 = 1;
			Static520.method8043();
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() != arg1) {
			Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, arg1);
			Static389.method6560(false, arg1);
		}
		Static482.method7663();
		return local17;
	}
}
