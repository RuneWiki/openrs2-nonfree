import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "Lclient!cja;")
	public static Class14_Sub12 aClass14_Sub12_1;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ZIIZ)Lclient!rg;")
	public static Class310 method7811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) Class384 local5 = null;
		if (Static230.aClass243_2 != null) {
			local5 = new Class384(arg1, Static230.aClass243_2, Static349.aClass243Array1[arg1], 1000000);
		}
		Static84.aClass293_Sub1Array2[arg1] = Static343.aClass52_1.method1027(local5, arg1, Static166.aClass384_2);
		Static84.aClass293_Sub1Array2[arg1].method7322();
		return new Class310(Static84.aClass293_Sub1Array2[arg1], arg2, arg0);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)V")
	public static void method7814() {
		Static576.aClass317_65.method7870(50);
		Static472.aClass317_54.method7870(50);
		Static421.aClass317_43.method7870(50);
		Static106.aClass317_10.method7870(50);
	}
}
