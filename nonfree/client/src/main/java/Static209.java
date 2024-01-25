import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
	public static int anInt4374 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([I[IB)V")
	public static void method3627(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static239.anIntArray566 = null;
			Static23.aByteArrayArrayArray1 = null;
			Static628.anIntArray727 = null;
			return;
		}
		Static239.anIntArray566 = arg0;
		Static628.anIntArray727 = new int[arg0.length];
		Static23.aByteArrayArrayArray1 = new byte[arg0.length][][];
		for (@Pc(33) int local33 = 0; local33 < Static239.anIntArray566.length; local33++) {
			Static23.aByteArrayArrayArray1[local33] = new byte[arg1[local33]][];
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public static void method3628() {
		@Pc(10) Class44 local10 = null;
		try {
			@Pc(16) Class26 local16 = Static375.aClass359_4.method8260("");
			while (local16.anInt762 == 0) {
				Static57.method1062(1L);
			}
			if (local16.anInt762 == 1) {
				local10 = (Class44) local16.anObject3;
				@Pc(35) Class2_Sub34 local35 = Static404.aClass2_Sub13_2.method1376();
				local10.method956(0, local35.aByteArray77, local35.anInt8188);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local10 != null) {
				local10.method960();
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B[IILclient!ww;)Lclient!oc;")
	public static Class240 method3629(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class379 arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg2.aByteArray106 != null) {
			@Pc(24) int local24 = arg2.anInt10279;
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
			@Pc(86) int local86;
			@Pc(137) int local137;
			for (@Pc(80) int local80 = 0; local80 < arg1; local80++) {
				local86 = arg0[local80];
				if (arg2.aByteArray106[local86] != -1) {
					@Pc(99) int local99 = arg2.aByteArray106[local86] & 0xFF;
					for (@Pc(101) int local101 = 0; local101 < 3; local101++) {
						@Pc(113) short local113;
						if (local101 == 0) {
							local113 = arg2.aShortArray158[local86];
						} else if (local101 == 1) {
							local113 = arg2.aShortArray152[local86];
						} else {
							local113 = arg2.aShortArray161[local86];
						}
						@Pc(132) int local132 = arg2.anIntArray743[local113];
						local137 = arg2.anIntArray752[local113];
						@Pc(142) int local142 = arg2.anIntArray751[local113];
						if (local27[local99] > local132) {
							local27[local99] = local132;
						}
						if (local132 > local30[local99]) {
							local30[local99] = local132;
						}
						if (local137 < local33[local99]) {
							local33[local99] = local137;
						}
						if (local36[local99] < local137) {
							local36[local99] = local137;
						}
						if (local142 < local39[local99]) {
							local39[local99] = local142;
						}
						if (local142 > local42[local99]) {
							local42[local99] = local142;
						}
					}
				}
			}
			local18 = new float[local24][];
			local9 = new int[local24];
			local7 = new int[local24];
			local16 = new int[local24];
			for (local86 = 0; local86 < local24; local86++) {
				@Pc(239) byte local239 = arg2.aByteArray107[local86];
				if (local239 > 0) {
					local7[local86] = (local30[local86] + local27[local86]) / 2;
					local9[local86] = (local36[local86] + local33[local86]) / 2;
					local16[local86] = (local42[local86] + local39[local86]) / 2;
					@Pc(307) float local307;
					@Pc(298) float local298;
					@Pc(305) float local305;
					if (local239 == 1) {
						local137 = arg2.anIntArray747[local86];
						local298 = 64.0F / (float) arg2.anIntArray749[local86];
						if (local137 == 0) {
							local305 = 1.0F;
							local307 = 1.0F;
						} else if (local137 > 0) {
							local307 = 1.0F;
							local305 = (float) local137 / 1024.0F;
						} else {
							local305 = 1.0F;
							local307 = (float) -local137 / 1024.0F;
						}
					} else if (local239 == 2) {
						local298 = 64.0F / (float) arg2.anIntArray749[local86];
						local305 = 64.0F / (float) arg2.anIntArray745[local86];
						local307 = 64.0F / (float) arg2.anIntArray747[local86];
					} else {
						local307 = (float) arg2.anIntArray747[local86] / 1024.0F;
						local298 = (float) arg2.anIntArray749[local86] / 1024.0F;
						local305 = (float) arg2.anIntArray745[local86] / 1024.0F;
					}
					local18[local86] = Static247.method4485(local305, local307, local298, arg2.aShortArray157[local86], arg2.aShortArray156[local86], arg2.aByteArray101[local86] & 0xFF, arg2.aShortArray160[local86]);
				}
			}
		}
		return new Class240(local7, local9, local16, local18);
	}
}
