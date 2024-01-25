import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public static int anInt5983 = -1;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_287 = new Class12(26, -1);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4731(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static342.anInt6234 >= 100 && !Static97.aBoolean142 || Static342.anInt6234 >= 200) {
			Static353.method5059(Static66.aClass96_21.method1935(Static389.anInt7061));
			return;
		}
		@Pc(31) String local31 = Static305.method4200(arg0);
		if (local31 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(36) int local36 = 0; local36 < Static342.anInt6234; local36++) {
			@Pc(44) String local44 = Static305.method4200(Static396.aStringArray40[local36]);
			if (local44 != null && local44.equals(local31)) {
				Static353.method5059(arg0 + Static246.aClass96_69.method1935(Static389.anInt7061));
				return;
			}
			if (Static16.aStringArray3[local36] != null) {
				local74 = Static305.method4200(Static16.aStringArray3[local36]);
				if (local74 != null && local74.equals(local31)) {
					Static353.method5059(arg0 + Static246.aClass96_69.method1935(Static389.anInt7061));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static321.anInt5589; local100++) {
			local74 = Static305.method4200(Static104.aStringArray14[local100]);
			if (local74 != null && local74.equals(local31)) {
				Static353.method5059(Static23.aClass96_4.method1935(Static389.anInt7061) + arg0 + Static270.aClass96_41.method1935(Static389.anInt7061));
				return;
			}
			if (Static49.aStringArray5[local100] != null) {
				@Pc(143) String local143 = Static305.method4200(Static49.aStringArray5[local100]);
				if (local143 != null && local143.equals(local31)) {
					Static353.method5059(Static23.aClass96_4.method1935(Static389.anInt7061) + arg0 + Static270.aClass96_41.method1935(Static389.anInt7061));
					return;
				}
			}
		}
		if (Static305.method4200(Static255.aClass47_Sub1_Sub5_Sub2_2.aString66).equals(local31)) {
			Static353.method5059(Static89.aClass96_30.method1935(Static389.anInt7061));
		} else {
			Static224.method3272(Static315.aClass254_109);
			Static201.aClass1_Sub14_Sub2_2.method4553(Static388.method5637(arg0));
			Static201.aClass1_Sub14_Sub2_2.method4512(arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
	public static void method4732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static237.anInt4171 = arg1;
		Static138.anInt7421 = arg3;
		Static256.anInt4392 = arg2;
		Static449.anInt7763 = arg0;
	}
}
