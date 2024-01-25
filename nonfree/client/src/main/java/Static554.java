import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!to", name = "t", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_14 = new Class168(11, -1);

	@OriginalMember(owner = "client!to", name = "x", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_304 = new Class288(75, 6);

	@OriginalMember(owner = "client!to", name = "y", descriptor = "[Lclient!ek;")
	public static Class91[] aClass91Array1 = null;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIII)I")
	public static int method7605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(19) int local19 = local7 < 8 ? arg0 : arg1;
		@Pc(38) int local38 = local7 < 4 ? arg1 : local7 == 12 || local7 == 14 ? arg0 : arg2;
		return ((local7 & 0x1) == 0 ? local19 : -local19) + ((local7 & 0x2) == 0 ? local38 : -local38);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BC)Z")
	public static boolean method7606(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([IBILclient!kda;)Lclient!iha;")
	public static Class152 method7607(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class186 arg2) {
		@Pc(15) int[] local15 = null;
		@Pc(17) int[] local17 = null;
		@Pc(19) int[] local19 = null;
		@Pc(21) float[][] local21 = null;
		if (arg2.aByteArray59 != null) {
			@Pc(27) int local27 = arg2.anInt4695;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(33) int[] local33 = new int[local27];
			@Pc(36) int[] local36 = new int[local27];
			@Pc(39) int[] local39 = new int[local27];
			@Pc(42) int[] local42 = new int[local27];
			@Pc(45) int[] local45 = new int[local27];
			for (@Pc(47) int local47 = 0; local47 < local27; local47++) {
				local30[local47] = Integer.MAX_VALUE;
				local33[local47] = -2147483647;
				local36[local47] = Integer.MAX_VALUE;
				local39[local47] = -2147483647;
				local42[local47] = Integer.MAX_VALUE;
				local45[local47] = -2147483647;
			}
			@Pc(89) int local89;
			@Pc(146) int local146;
			for (@Pc(83) int local83 = 0; local83 < arg1; local83++) {
				local89 = arg0[local83];
				if (arg2.aByteArray59[local89] != -1) {
					@Pc(103) int local103 = arg2.aByteArray59[local89] & 0xFF;
					for (@Pc(105) int local105 = 0; local105 < 3; local105++) {
						@Pc(122) short local122;
						if (local105 == 0) {
							local122 = arg2.aShortArray53[local89];
						} else if (local105 == 1) {
							local122 = arg2.aShortArray54[local89];
						} else {
							local122 = arg2.aShortArray50[local89];
						}
						@Pc(141) int local141 = arg2.anIntArray312[local122];
						local146 = arg2.anIntArray317[local122];
						@Pc(151) int local151 = arg2.anIntArray315[local122];
						if (local30[local103] > local141) {
							local30[local103] = local141;
						}
						if (local33[local103] < local141) {
							local33[local103] = local141;
						}
						if (local146 < local36[local103]) {
							local36[local103] = local146;
						}
						if (local146 > local39[local103]) {
							local39[local103] = local146;
						}
						if (local151 < local42[local103]) {
							local42[local103] = local151;
						}
						if (local151 > local45[local103]) {
							local45[local103] = local151;
						}
					}
				}
			}
			local15 = new int[local27];
			local17 = new int[local27];
			local21 = new float[local27][];
			local19 = new int[local27];
			for (local89 = 0; local89 < local27; local89++) {
				@Pc(242) byte local242 = arg2.aByteArray57[local89];
				if (local242 > 0) {
					local15[local89] = (local33[local89] + local30[local89]) / 2;
					local17[local89] = (local39[local89] + local36[local89]) / 2;
					local19[local89] = (local42[local89] + local45[local89]) / 2;
					@Pc(295) float local295;
					@Pc(297) float local297;
					@Pc(329) float local329;
					if (local242 == 1) {
						local146 = arg2.anIntArray310[local89];
						if (local146 == 0) {
							local295 = 1.0F;
							local297 = 1.0F;
						} else if (local146 <= 0) {
							local295 = (float) -local146 / 1024.0F;
							local297 = 1.0F;
						} else {
							local297 = (float) local146 / 1024.0F;
							local295 = 1.0F;
						}
						local329 = 64.0F / (float) arg2.anIntArray318[local89];
					} else if (local242 == 2) {
						local297 = 64.0F / (float) arg2.anIntArray309[local89];
						local295 = 64.0F / (float) arg2.anIntArray310[local89];
						local329 = 64.0F / (float) arg2.anIntArray318[local89];
					} else {
						local297 = (float) arg2.anIntArray309[local89] / 1024.0F;
						local329 = (float) arg2.anIntArray318[local89] / 1024.0F;
						local295 = (float) arg2.anIntArray310[local89] / 1024.0F;
					}
					local21[local89] = Static179.method2932(local297, arg2.aShortArray57[local89], arg2.aShortArray49[local89], arg2.aShortArray58[local89], local329, local295, arg2.aByteArray58[local89] & 0xFF);
				}
			}
		}
		return new Class152(local15, local17, local19, local21);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
	public static void method7608(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub4 local12 = Static566.method7763(arg0, 9);
		local12.method669();
	}
}
