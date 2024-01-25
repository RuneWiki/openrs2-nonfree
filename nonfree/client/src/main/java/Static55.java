import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "Lclient!jn;")
	public static Class176 aClass176_104;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "[Lclient!a;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array7;

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_99 = new Class173(22, 8);

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	public static void method6494() {
		@Pc(7) int local7 = Static413.anInt8212;
		@Pc(9) int[] local9 = Static229.anIntArray201;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class1_Sub4_Sub2_Sub1_Sub2 local24 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local9[local16]];
			if (local24 != null) {
				Static220.method3592(local24, local24.method6925());
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!un;)Lclient!ko;")
	public static Class194_Sub1 method6495(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(12) Class194 local12 = Static372.method5972(arg0);
		@Pc(16) int local16 = arg0.method4895();
		return new Class194_Sub1(local12.anInt5695, local12.aClass258_4, local12.aClass250_6, local12.anInt5694, local12.anInt5698, local16);
	}
}
