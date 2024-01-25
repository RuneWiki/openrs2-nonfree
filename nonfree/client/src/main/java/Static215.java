import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!mm", name = "H", descriptor = "Lclient!rp;")
	public static Class21 aClass21_3;

	@OriginalMember(owner = "client!mm", name = "I", descriptor = "Lclient!ja;")
	public static Class114 aClass114_1;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!nl;)I")
	public static int method3584(@OriginalArg(1) Class171 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3739(Static26.anInt586)) {
			local5++;
		}
		if (arg0.method3739(Static204.anInt3783)) {
			local5++;
		}
		if (arg0.method3739(Static33.anInt694)) {
			local5++;
		}
		if (arg0.method3739(Static181.anInt6175)) {
			local5++;
		}
		if (arg0.method3739(Static348.anInt5919)) {
			local5++;
		}
		if (arg0.method3739(Static365.anInt6199)) {
			local5++;
		}
		if (arg0.method3739(Static181.anInt6174)) {
			local5++;
		}
		if (arg0.method3739(Static207.anInt4909)) {
			local5++;
		}
		if (arg0.method3739(Static2.anInt28)) {
			local5++;
		}
		if (arg0.method3739(Static309.anInt5192)) {
			local5++;
		}
		if (arg0.method3739(Static291.anInt5054)) {
			local5++;
		}
		if (arg0.method3739(Static368.anInt5297)) {
			local5++;
		}
		if (arg0.method3739(Static284.anInt4923)) {
			local5++;
		}
		if (arg0.method3739(Static60.anInt1158)) {
			local5++;
		}
		if (arg0.method3739(Static264.anInt4610)) {
			local5++;
		}
		if (arg0.method3739(Static181.anInt6177)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!wg;)V")
	public static void method3587(@OriginalArg(1) Class1_Sub5_Sub1_Sub2 arg0) {
		for (@Pc(14) Class2_Sub29 local14 = (Class2_Sub29) Static386.aClass30_44.method694(); local14 != null; local14 = (Class2_Sub29) Static386.aClass30_44.method682()) {
			if (local14.aClass1_Sub5_Sub1_Sub2_1 == arg0) {
				if (local14.aClass2_Sub2_Sub2_3 != null) {
					Static324.aClass2_Sub2_Sub1_2.method58(local14.aClass2_Sub2_Sub2_3);
					local14.aClass2_Sub2_Sub2_3 = null;
				}
				local14.method5617();
				return;
			}
		}
	}
}
