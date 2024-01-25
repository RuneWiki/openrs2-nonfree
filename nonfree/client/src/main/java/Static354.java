import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wq", name = "M", descriptor = "Lclient!l;")
	public static Class57 aClass57_27;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)Lclient!ks;")
	public static Class118 method5735(@OriginalArg(1) int arg0) {
		@Pc(10) Class118 local10 = (Class118) Static216.aClass198_39.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static149.aClass100_66.method2319(33, arg0);
		local10 = new Class118();
		if (local20 != null) {
			local10.method2873(new Class3_Sub4(local20), arg0);
		}
		Static216.aClass198_39.method5231((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[B)Lclient!qg;")
	public static Class3_Sub7_Sub18 method5736(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class3_Sub7_Sub18 local9 = new Class3_Sub7_Sub18();
		@Pc(19) Class3_Sub4 local19 = new Class3_Sub4(arg0);
		local19.anInt4268 = local19.aByteArray70.length - 2;
		@Pc(32) int local32 = local19.method3649();
		@Pc(43) int local43 = local19.aByteArray70.length - local32 - 2 - 12;
		local19.anInt4268 = local43;
		@Pc(50) int local50 = local19.method3642();
		local9.anInt4999 = local19.method3649();
		local9.anInt5001 = local19.method3649();
		local9.anInt5002 = local19.method3649();
		local9.anInt5003 = local19.method3649();
		@Pc(76) int local76 = local19.method3643();
		@Pc(87) int local87;
		@Pc(95) int local95;
		if (local76 > 0) {
			local9.aClass24Array1 = new Class24[local76];
			for (local87 = 0; local87 < local76; local87++) {
				local95 = local19.method3649();
				@Pc(102) Class24 local102 = new Class24(Static83.method1300(local95));
				local9.aClass24Array1[local87] = local102;
				while (local95-- > 0) {
					@Pc(113) int local113 = local19.method3642();
					@Pc(117) int local117 = local19.method3642();
					local102.method598((long) local113, new Class3_Sub22(local117));
				}
			}
		}
		local19.anInt4268 = 0;
		local9.aString181 = local19.method3631();
		local9.anIntArray410 = new int[local50];
		local9.aStringArray30 = new String[local50];
		local9.anIntArray408 = new int[local50];
		local87 = 0;
		while (local19.anInt4268 < local43) {
			local95 = local19.method3649();
			if (local95 == 3) {
				local9.aStringArray30[local87] = local19.method3671().intern();
			} else if (local95 >= 100 || local95 == 21 || local95 == 38 || local95 == 39) {
				local9.anIntArray408[local87] = local19.method3643();
			} else {
				local9.anIntArray408[local87] = local19.method3642();
			}
			local9.anIntArray410[local87++] = local95;
		}
		return local9;
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(B)V")
	public static void method5737() {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(0, 15);
		local8.method2502();
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(II)V")
	public static void method5739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class45 local28 = Static256.aClass45ArrayArrayArray2[local9][arg0][arg1] = Static256.aClass45ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte5--;
				for (@Pc(40) Class160 local40 = local28.aClass160_1; local40 != null; local40 = local40.aClass160_3) {
					@Pc(44) Class5_Sub4 local44 = local40.aClass5_Sub4_1;
					if (local44.aShort86 == arg0 && local44.aShort87 == arg1) {
						local44.aByte69--;
					}
				}
			}
		}
		if (Static256.aClass45ArrayArrayArray2[0][arg0][arg1] == null) {
			Static256.aClass45ArrayArrayArray2[0][arg0][arg1] = new Class45(0, arg0, arg1);
			Static256.aClass45ArrayArrayArray2[0][arg0][arg1].aByte7 = 1;
		}
		Static256.aClass45ArrayArrayArray2[0][arg0][arg1].aClass45_1 = local7;
		Static256.aClass45ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
