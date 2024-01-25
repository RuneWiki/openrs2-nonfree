import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method206() {
		@Pc(7) int local7 = Static103.anInt992;
		@Pc(9) int[] local9 = Static523.anIntArray682;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class15_Sub2_Sub1_Sub1 local19 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt4751 > 0) {
				local19.anInt4751--;
				if (local19.anInt4751 == 0) {
					local19.aString47 = null;
				}
			}
		}
		for (@Pc(42) int local42 = 0; local42 < Static438.anInt7689; local42++) {
			@Pc(49) long local49 = (long) Static547.anIntArray731[local42];
			@Pc(55) Class5_Sub51 local55 = (Class5_Sub51) Static521.aClass42_42.method1109(local49);
			if (local55 != null) {
				@Pc(60) Class15_Sub2_Sub1_Sub2 local60 = local55.aClass15_Sub2_Sub1_Sub2_2;
				if (local60.anInt4751 > 0) {
					local60.anInt4751--;
					if (local60.anInt4751 == 0) {
						local60.aString47 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(BI)Lclient!bo;")
	public static Class35_Sub1 method208(@OriginalArg(1) int arg0) {
		return Static86.aBoolean91 && Static420.anInt9019 <= arg0 && Static403.anInt7216 >= arg0 ? Static315.aClass35_Sub1Array2[arg0 - Static420.anInt9019] : null;
	}
}
