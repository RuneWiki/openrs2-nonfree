import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
	public static int anInt5500 = 0;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!wga;[IB[II)Lclient!lp;")
	public static Class1_Sub2 method4729(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (!arg1.method1514(Static29.aClass26_4, Static155.aClass375_18)) {
			@Pc(71) int[] local71 = new int[arg0 * arg4];
			for (local25 = 0; local25 < arg0; local25++) {
				local35 = arg2[local25] + local25 * arg4;
				for (local37 = 0; local37 < arg3[local25]; local37++) {
					local71[local35++] = -16777216;
				}
			}
			return new Class1_Sub2(arg1, arg4, arg0, local71);
		}
		@Pc(23) byte[] local23 = new byte[arg0 * arg4];
		for (local25 = 0; local25 < arg0; local25++) {
			local35 = arg2[local25] + arg4 * local25;
			for (local37 = 0; local37 < arg3[local25]; local37++) {
				local23[local35++] = -1;
			}
		}
		return new Class1_Sub2(arg1, arg4, arg0, local23);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "([BI)Lclient!jk;")
	public static Class2_Sub6_Sub11 method4730(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class2_Sub6_Sub11 local14 = new Class2_Sub6_Sub11();
		@Pc(19) Class2_Sub11 local19 = new Class2_Sub11(arg0);
		local19.anInt10066 = local19.aByteArray128.length - 2;
		@Pc(30) int local30 = local19.method8326();
		@Pc(41) int local41 = local19.aByteArray128.length - local30 - 12 - 2;
		local19.anInt10066 = local41;
		@Pc(48) int local48 = local19.method8381();
		local14.anInt5667 = local19.method8326();
		local14.anInt5668 = local19.method8326();
		local14.anInt5670 = local19.method8326();
		local14.anInt5669 = local19.method8326();
		@Pc(72) int local72 = local19.method8383();
		@Pc(80) int local80;
		@Pc(86) int local86;
		if (local72 > 0) {
			local14.aClass99Array1 = new Class99[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local86 = local19.method8326();
				@Pc(93) Class99 local93 = new Class99(Static231.method4407(local86));
				local14.aClass99Array1[local80] = local93;
				while (local86-- > 0) {
					@Pc(104) int local104 = local19.method8381();
					@Pc(108) int local108 = local19.method8381();
					local93.method3059((long) local104, new Class2_Sub43(local108));
				}
			}
		}
		local19.anInt10066 = 0;
		local14.aString57 = local19.method8380();
		local14.anIntArray325 = new int[local48];
		local14.anIntArray326 = new int[local48];
		local14.aStringArray22 = new String[local48];
		local80 = 0;
		while (local41 > local19.anInt10066) {
			local86 = local19.method8326();
			if (local86 == 3) {
				local14.aStringArray22[local80] = local19.method8373().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local14.anIntArray325[local80] = local19.method8383();
			} else {
				local14.anIntArray325[local80] = local19.method8381();
			}
			local14.anIntArray326[local80++] = local86;
		}
		return local14;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method4731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg3 % 8;
		@Pc(15) int local15;
		if (local9 == 0) {
			local15 = 0;
		} else {
			local15 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg4 + 8 - 1) / 8);
		@Pc(48) int local48 = -((arg3 + 8 - 1) / 8);
		for (@Pc(50) int local50 = local28; local50 < 0; local50++) {
			for (@Pc(54) int local54 = local48; local54 < 0; local54++) {
				if (arg2[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local15;
			if (arg2[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg0;
		}
		return false;
	}
}
