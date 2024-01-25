import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class167 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
	private final int[] anIntArray391;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "[I")
	private final int[] anIntArray395;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "[I")
	private final int[] anIntArray389;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "[I")
	private final int[] anIntArray393;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "[[I")
	private final int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	private final int anInt5136;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[I")
	private final int[] anIntArray390;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class167() {
		@Pc(4) int local4 = Static32.method840(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static32.method840(5);
		@Pc(16) int local16 = 0;
		this.anIntArray391 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static32.method840(4);
			this.anIntArray391[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray395 = new int[local16];
		this.anIntArray389 = new int[local16];
		this.anIntArray393 = new int[local16];
		this.anIntArrayArray53 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray395[local26] = Static32.method840(3) + 1;
			local77 = this.anIntArray389[local26] = Static32.method840(2);
			if (local77 != 0) {
				this.anIntArray393[local26] = Static32.method840(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray53[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static32.method840(8) - 1;
			}
		}
		this.anInt5136 = Static32.method840(2) + 1;
		local77 = Static32.method840(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray395[this.anIntArray391[local99]];
		}
		this.anIntArray390 = new int[local126];
		this.anIntArray390[0] = 0;
		this.anIntArray390[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray391[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray395[local169]; local171++) {
				this.anIntArray390[local126++] = Static32.method840(local77);
			}
		}
		if (Static252.anIntArray394 == null || Static252.anIntArray394.length < local126) {
			Static252.anIntArray394 = new int[local126];
			Static252.anIntArray392 = new int[local126];
			Static252.aBooleanArray27 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII[FI)V")
	private void method4734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static252.aFloatArray27[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(61) int local61 = arg0 + 1; local61 < arg2; local61++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4[local61] *= Static252.aFloatArray27[local20];
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()Z")
	public boolean method4737() {
		@Pc(5) boolean local5 = Static32.method833() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray390.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static252.anIntArray394[local15] = this.anIntArray390[local15];
		}
		@Pc(34) int local34 = Static252.anIntArray396[this.anInt5136 - 1];
		@Pc(40) int local40 = Static96.method2070(local34 - 1);
		Static252.anIntArray392[0] = Static32.method840(local40);
		Static252.anIntArray392[1] = Static32.method840(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray391.length; local54++) {
			@Pc(60) int local60 = this.anIntArray391[local54];
			@Pc(65) int local65 = this.anIntArray395[local60];
			@Pc(70) int local70 = this.anIntArray389[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static32.aClass150Array1[this.anIntArray393[local60]].method4117();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray53[local60][local78 & local76];
				local78 >>>= local70;
				Static252.anIntArray392[local52++] = local100 >= 0 ? Static32.aClass150Array1[local100].method4117() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	private void method4738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static252.anIntArray394[arg0];
		@Pc(13) int local13 = Static252.anIntArray392[arg0];
		@Pc(17) boolean local17 = Static252.aBooleanArray27[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static252.anIntArray394[local21];
			if (local26 < local9) {
				Static252.anIntArray394[local5] = local26;
				Static252.anIntArray392[local5] = Static252.anIntArray392[local21];
				Static252.aBooleanArray27[local5] = Static252.aBooleanArray27[local21];
				local5++;
				Static252.anIntArray394[local21] = Static252.anIntArray394[local5];
				Static252.anIntArray392[local21] = Static252.anIntArray392[local5];
				Static252.aBooleanArray27[local21] = Static252.aBooleanArray27[local5];
			}
		}
		Static252.anIntArray394[local5] = local9;
		Static252.anIntArray392[local5] = local13;
		Static252.aBooleanArray27[local5] = local17;
		this.method4738(arg0, local5 - 1);
		this.method4738(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)I")
	private int method4739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([FI)V")
	public void method4741(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray390.length;
		@Pc(10) int local10 = Static252.anIntArray396[this.anInt5136 - 1];
		Static252.aBooleanArray27[0] = Static252.aBooleanArray27[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static252.method4735(Static252.anIntArray394, local20);
			local29 = Static252.method4736(Static252.anIntArray394, local20);
			local47 = this.method4739(Static252.anIntArray394[local25], Static252.anIntArray392[local25], Static252.anIntArray394[local29], Static252.anIntArray392[local29], Static252.anIntArray394[local20]);
			local51 = Static252.anIntArray392[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static252.aBooleanArray27[local20] = false;
				Static252.anIntArray392[local20] = local47;
			} else {
				Static252.aBooleanArray27[local25] = Static252.aBooleanArray27[local29] = true;
				Static252.aBooleanArray27[local20] = true;
				if (local51 >= local66) {
					Static252.anIntArray392[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static252.anIntArray392[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method4738(0, local3 - 1);
		local25 = 0;
		local29 = Static252.anIntArray392[0] * this.anInt5136;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static252.aBooleanArray27[local47]) {
				local51 = Static252.anIntArray394[local47];
				local55 = Static252.anIntArray392[local47] * this.anInt5136;
				this.method4734(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static252.aFloatArray27[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}
}
