import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
	public static int anInt3598;

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "Lclient!dn;")
	public static final Class56 aClass56_5 = new Class56("WTWIP", 3);

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "[I")
	public static final int[] anIntArray316 = new int[6];

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	public static int anInt3600 = 100;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2947(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static46.anInt861 >= 100 && !Static192.aBoolean280 || Static46.anInt861 >= 200) {
			Static321.method4516(Static43.aClass209_53.method4562(Static388.anInt6533));
			return;
		}
		@Pc(29) String local29 = Static259.method3902(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(34) int local34 = 0; local34 < Static46.anInt861; local34++) {
			@Pc(42) String local42 = Static259.method3902(Static284.aStringArray35[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static321.method4516(arg0 + Static371.aClass209_91.method4562(Static388.anInt6533));
				return;
			}
			if (Static297.aStringArray36[local34] != null) {
				local74 = Static259.method3902(Static297.aStringArray36[local34]);
				if (local74 != null && local74.equals(local29)) {
					Static321.method4516(arg0 + Static371.aClass209_91.method4562(Static388.anInt6533));
					return;
				}
			}
		}
		for (@Pc(104) int local104 = 0; local104 < Static393.anInt6567; local104++) {
			local74 = Static259.method3902(Static367.aStringArray45[local104]);
			if (local74 != null && local74.equals(local29)) {
				Static321.method4516(Static16.aClass209_13.method4562(Static388.anInt6533) + arg0 + Static366.aClass209_142.method4562(Static388.anInt6533));
				return;
			}
			if (Static160.aStringArray31[local104] != null) {
				@Pc(147) String local147 = Static259.method3902(Static160.aStringArray31[local104]);
				if (local147 != null && local147.equals(local29)) {
					Static321.method4516(Static16.aClass209_13.method4562(Static388.anInt6533) + arg0 + Static366.aClass209_142.method4562(Static388.anInt6533));
					return;
				}
			}
		}
		if (Static259.method3902(Static375.aClass3_Sub2_Sub1_Sub2_7.aString56).equals(local29)) {
			Static321.method4516(Static288.aClass209_116.method4562(Static388.anInt6533));
		} else {
			Static159.method2586(Static404.aClass54_98);
			Static424.aClass2_Sub23_Sub2_1.method5449(Static287.method4138(arg0));
			Static424.aClass2_Sub23_Sub2_1.method5496(arg0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)I")
	public static int method2948(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
