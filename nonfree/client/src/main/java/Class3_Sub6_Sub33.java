import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class3_Sub6_Sub33 extends Class3_Sub6 {

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "[I")
	private int[] anIntArray551;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray188;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "[I")
	private int[] anIntArray552;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
	private int anInt8420 = 0;

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "[S")
	private final short[] aShortArray130 = new short[257];

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		if (this.anIntArrayArray188 == null) {
			this.anIntArrayArray188 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray188.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt8420 == 2) {
			this.method7013();
		}
		Static195.method3275();
		this.method7015();
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)[I")
	private int[] method7012(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray552;
		} else if (arg0 >= this.anIntArrayArray188.length) {
			return this.anIntArray551;
		} else {
			return this.anIntArrayArray188[arg0];
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	private void method7013() {
		@Pc(8) int[] local8 = this.anIntArrayArray188[0];
		@Pc(13) int[] local13 = this.anIntArrayArray188[1];
		@Pc(26) int[] local26 = this.anIntArrayArray188[this.anIntArrayArray188.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray188[this.anIntArrayArray188.length - 1];
		this.anIntArray551 = new int[] { local26[0] + local26[0] - local35[0], local26[1] + local26[1] + -local35[1] };
		this.anIntArray552 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - -local8[1] + -local13[1] };
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(28) int[] local28 = this.method7769(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static521.anInt8383; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local11[local30] = this.aShortArray130[local38];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	private void method7015() {
		@Pc(8) int local8 = this.anInt8420;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray188.length - 1 && this.anIntArrayArray188[local28][0] <= local26; local28++) {
				}
				local55 = this.anIntArrayArray188[local28 - 1];
				local60 = this.anIntArrayArray188[local28];
				local69 = this.method7012(local28 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method7012(local28 + 1)[1];
				@Pc(103) int local103 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(109) int local109 = local103 * local103 >> 12;
				@Pc(118) int local118 = local73 + local86 - local77 - local69;
				@Pc(124) int local124 = local69 - local73 - local118;
				@Pc(129) int local129 = local77 - local69;
				@Pc(141) int local141 = (local103 * local118 >> 12) * local109 >> 12;
				@Pc(147) int local147 = local124 * local109 >> 12;
				@Pc(153) int local153 = local129 * local103 >> 12;
				@Pc(161) int local161 = local73 + local147 + local141 + local153;
				if (local161 <= -32768) {
					local161 = -32767;
				}
				if (local161 >= 32768) {
					local161 = 32767;
				}
				this.aShortArray130[local8] = (short) local161;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray188.length - 1 > local28 && this.anIntArrayArray188[local28][0] <= local26; local28++) {
				}
				local55 = this.anIntArrayArray188[local28 - 1];
				local60 = this.anIntArrayArray188[local28];
				local69 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static411.anIntArray438[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local60[1] * local73 + local55[1] * local77 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray130[local8] = (short) local86;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray188.length - 1 && local26 >= this.anIntArrayArray188[local28][0]; local28++) {
				}
				local55 = this.anIntArrayArray188[local28 - 1];
				local60 = this.anIntArrayArray188[local28];
				local69 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local55[1] * local73 + local69 * local60[1] >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray130[local8] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt8420 = arg0.method5175();
		this.anIntArrayArray188 = new int[arg0.method5175()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray188.length; local21++) {
			this.anIntArrayArray188[local21][0] = arg0.method5198();
			this.anIntArrayArray188[local21][1] = arg0.method5198();
		}
	}
}
