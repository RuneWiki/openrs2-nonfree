import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	public static int anInt5197;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Lclient!bo;")
	public static Class28_Sub1 aClass28_Sub1_1;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "I")
	public static int anInt5199 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)Lclient!gl;")
	public static Class57_Sub2 method4377(@OriginalArg(1) int arg0) {
		@Pc(7) Class111[] local7 = Class6_Sub2_Sub4.aClass111Array3;
		synchronized (Class6_Sub2_Sub4.aClass111Array3) {
			@Pc(32) Class57_Sub2 local32;
			if (Class6_Sub2_Sub4.aClass111Array3.length <= arg0 || Class6_Sub2_Sub4.aClass111Array3[arg0].method2686()) {
				local32 = new Class57_Sub2();
				local32.aClass57_Sub5Array1 = new Class57_Sub5[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass57_Sub5Array1[local38] = new Class57_Sub5();
				}
			} else {
				local32 = (Class57_Sub2) Class6_Sub2_Sub4.aClass111Array3[arg0].method2691();
				local32.method5359();
				@Pc(71) int local71 = Static29.anIntArray50[arg0]--;
			}
			return local32;
		}
	}
}
