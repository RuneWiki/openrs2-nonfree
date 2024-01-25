import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!il", name = "k", descriptor = "Lclient!eia;")
	public static Class88 aClass88_19;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I[Ljava/lang/String;[III)V")
	public static void method7871(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) String local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg3; local46++) {
			if (local20 == null || arg1[local46] != null && arg1[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(71) String local71 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local71;
				@Pc(85) int local85 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local85;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method7871(arg0, arg1, arg2, local16 - 1);
		method7871(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(B)Lclient!jp;")
	public static Class3_Sub25 method7877() {
		@Pc(11) Class3_Sub25 local11 = Static204.method3649();
		local11.method8603(0L);
		local11.method8583(Static492.aString90);
		local11.method8603(Static276.aLong146);
		local11.method8603(Static604.aLong289);
		local11.method8601(Static644.aBigInteger6, Static607.aBigInteger5);
		return local11;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!gfa;ZI[I)Lclient!vd;")
	public static Class363 method7879(@OriginalArg(0) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(18) float[][] local18 = null;
		if (arg0.aByteArray35 != null) {
			@Pc(24) int local24 = arg0.anInt3817;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			local9 = new int[local24];
			local11 = new int[local24];
			local18 = new float[local24][];
			@Pc(95) int local95;
			@Pc(149) int local149;
			for (@Pc(89) int local89 = 0; local89 < arg1; local89++) {
				local95 = arg2[local89];
				if (arg0.aByteArray35[local95] != -1) {
					@Pc(109) int local109 = arg0.aByteArray35[local95] & 0xFF;
					for (@Pc(111) int local111 = 0; local111 < 3; local111++) {
						@Pc(125) short local125;
						if (local111 == 0) {
							local125 = arg0.aShortArray54[local95];
						} else if (local111 == 1) {
							local125 = arg0.aShortArray57[local95];
						} else {
							local125 = arg0.aShortArray52[local95];
						}
						@Pc(144) int local144 = arg0.anIntArray335[local125];
						local149 = arg0.anIntArray333[local125];
						@Pc(154) int local154 = arg0.anIntArray325[local125];
						if (local144 < local27[local109]) {
							local27[local109] = local144;
						}
						if (local30[local109] < local144) {
							local30[local109] = local144;
						}
						if (local149 < local33[local109]) {
							local33[local109] = local149;
						}
						if (local149 > local36[local109]) {
							local36[local109] = local149;
						}
						if (local154 < local39[local109]) {
							local39[local109] = local154;
						}
						if (local42[local109] < local154) {
							local42[local109] = local154;
						}
					}
				}
			}
			local7 = new int[local24];
			for (local95 = 0; local95 < local24; local95++) {
				@Pc(236) byte local236 = arg0.aByteArray31[local95];
				if (local236 > 0) {
					local7[local95] = (local27[local95] + local30[local95]) / 2;
					local9[local95] = (local33[local95] + local36[local95]) / 2;
					local11[local95] = (local42[local95] + local39[local95]) / 2;
					@Pc(298) float local298;
					@Pc(323) float local323;
					@Pc(300) float local300;
					if (local236 == 1) {
						local149 = arg0.anIntArray330[local95];
						if (local149 == 0) {
							local298 = 1.0F;
							local300 = 1.0F;
						} else if (local149 <= 0) {
							local298 = (float) -local149 / 1024.0F;
							local300 = 1.0F;
						} else {
							local300 = (float) local149 / 1024.0F;
							local298 = 1.0F;
						}
						local323 = 64.0F / (float) arg0.anIntArray334[local95];
					} else if (local236 == 2) {
						local300 = 64.0F / (float) arg0.anIntArray327[local95];
						local323 = 64.0F / (float) arg0.anIntArray334[local95];
						local298 = 64.0F / (float) arg0.anIntArray330[local95];
					} else {
						local298 = (float) arg0.anIntArray330[local95] / 1024.0F;
						local323 = (float) arg0.anIntArray334[local95] / 1024.0F;
						local300 = (float) arg0.anIntArray327[local95] / 1024.0F;
					}
					local18[local95] = Static220.method3811(local323, arg0.aShortArray59[local95], arg0.aShortArray56[local95], arg0.aByteArray32[local95] & 0xFF, arg0.aShortArray55[local95], local298, local300);
				}
			}
		}
		return new Class363(local7, local9, local11, local18);
	}
}
