import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Lclient!ns;")
	public static Class166 aClass166_163;

	@OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
	public static int anInt4162;

	@OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
	public static int anInt4176;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3151(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static22.anInt6850 >= 100 && !Static404.aBoolean463 || Static22.anInt6850 >= 200) {
			Static196.method2835(Static114.aClass242_33.method5320(Static139.anInt2670));
			return;
		}
		@Pc(31) String local31 = Static402.method1650(arg0);
		if (local31 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(36) int local36 = 0; local36 < Static22.anInt6850; local36++) {
			@Pc(44) String local44 = Static402.method1650(Static291.aStringArray33[local36]);
			if (local44 != null && local44.equals(local31)) {
				Static196.method2835(arg0 + Static385.aClass242_76.method5320(Static139.anInt2670));
				return;
			}
			if (Static58.aStringArray28[local36] != null) {
				local74 = Static402.method1650(Static58.aStringArray28[local36]);
				if (local74 != null && local74.equals(local31)) {
					Static196.method2835(arg0 + Static385.aClass242_76.method5320(Static139.anInt2670));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static422.anInt7120; local100++) {
			local74 = Static402.method1650(Static71.aStringArray9[local100]);
			if (local74 != null && local74.equals(local31)) {
				Static196.method2835(Static384.aClass242_83.method5320(Static139.anInt2670) + arg0 + Static306.aClass242_68.method5320(Static139.anInt2670));
				return;
			}
			if (Static447.aStringArray44[local100] != null) {
				@Pc(143) String local143 = Static402.method1650(Static447.aStringArray44[local100]);
				if (local143 != null && local143.equals(local31)) {
					Static196.method2835(Static384.aClass242_83.method5320(Static139.anInt2670) + arg0 + Static306.aClass242_68.method5320(Static139.anInt2670));
					return;
				}
			}
		}
		if (Static402.method1650(Static375.aClass6_Sub2_Sub1_Sub1_3.aString11).equals(local31)) {
			Static196.method2835(Static320.aClass242_72.method5320(Static139.anInt2670));
		} else {
			Static209.method2982(Static203.aClass36_74);
			Static116.aClass4_Sub30_Sub1_1.method4871(Static226.method592(arg0));
			Static116.aClass4_Sub30_Sub1_1.method4849(arg0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[II[II)V")
	public static void method3154(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg2) / 2;
		@Pc(25) int local25 = arg2;
		@Pc(29) int local29 = arg3[local23];
		arg3[local23] = arg3[arg0];
		arg3[arg0] = local29;
		@Pc(43) int local43 = arg1[local23];
		arg1[local23] = arg1[arg0];
		arg1[arg0] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg2; local62 < arg0; local62++) {
			if (local29 + (local60 & local62) > arg3[local62]) {
				@Pc(81) int local81 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25] = local81;
				@Pc(95) int local95 = arg1[local62];
				arg1[local62] = arg1[local25];
				arg1[local25++] = local95;
			}
		}
		arg3[arg0] = arg3[local25];
		arg3[local25] = local29;
		arg1[arg0] = arg1[local25];
		arg1[local25] = local43;
		method3154(local25 - 1, arg1, arg2, arg3);
		method3154(arg0, arg1, local25 + 1, arg3);
	}
}
