import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_96 = new Class171(67, 7);

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "[I")
	public static final int[] anIntArray330 = new int[256];

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
	public static int anInt6077 = 1;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(III)V")
	public static void method5147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg0, 13);
		local9.method8832();
		local9.anInt10754 = arg1;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IZZ)V")
	public static void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class3_Sub26 local9 = arg1 ? Static121.aClass3_Sub26_1 : Static213.aClass3_Sub26_2;
		if (local9 == null || arg0 < 0 || local9.anInt4134 <= arg0) {
			return;
		}
		@Pc(30) Class78 local30 = local9.aClass78Array1[arg0];
		if (local30.aByte39 != -1) {
			return;
		}
		@Pc(38) String local38 = local30.aString30;
		@Pc(43) Class3_Sub37 local43 = Static90.method1509(Static124.aClass240_26, Static226.aClass144_2);
		local43.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(local38) + 3);
		local43.aClass3_Sub4_Sub1_2.method7948(arg1 ? 1 : 0);
		local43.aClass3_Sub4_Sub1_2.method7956(arg0);
		local43.aClass3_Sub4_Sub1_2.method7901(local38);
		Static301.method2678(local43);
	}
}
