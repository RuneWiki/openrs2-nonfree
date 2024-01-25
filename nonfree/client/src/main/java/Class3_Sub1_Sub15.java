import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "[I")
	private int[] anIntArray410;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "[S")
	private final short[] aShortArray84 = new short[257];

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
	private int anInt4455 = 0;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
	private int[] method3729(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray410;
		} else if (this.anIntArrayArray46.length <= arg0) {
			return this.anIntArray411;
		} else {
			return this.anIntArrayArray46[arg0];
		}
	}

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "(I)V")
	private void method3730() {
		@Pc(16) int[] local16 = this.anIntArrayArray46[0];
		@Pc(21) int[] local21 = this.anIntArrayArray46[1];
		@Pc(30) int[] local30 = this.anIntArrayArray46[this.anIntArrayArray46.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray46[this.anIntArrayArray46.length - 1];
		this.anIntArray411 = new int[] { local30[0] + local30[0] - local39[0], local30[1] - local39[1] + local30[1] };
		this.anIntArray410 = new int[] { local16[0] + local16[0] - local21[0], local16[1] + -local21[1] + local16[1] };
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(21) int[] local21 = this.method7778(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static307.anInt4846; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray84[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt4455 = arg1.method7548();
		this.anIntArrayArray46 = new int[arg1.method7548()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray46.length; local29++) {
			this.anIntArrayArray46[local29][0] = arg1.method7591();
			this.anIntArrayArray46[local29][1] = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		if (this.anIntArrayArray46 == null) {
			this.anIntArrayArray46 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray46.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4455 == 2) {
			this.method3730();
		}
		Static353.method5563();
		this.method3732();
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "(I)V")
	private void method3732() {
		@Pc(8) int local8 = this.anInt4455;
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
				for (local28 = 1; this.anIntArrayArray46.length - 1 > local28 && local26 >= this.anIntArrayArray46[local28][0]; local28++) {
				}
				local55 = this.anIntArrayArray46[local28 - 1];
				local60 = this.anIntArrayArray46[local28];
				local69 = this.method3729(local28 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method3729(local28 + 1)[1];
				@Pc(103) int local103 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(109) int local109 = local103 * local103 >> 12;
				@Pc(119) int local119 = local86 + local73 - local69 - local77;
				@Pc(126) int local126 = local69 - local73 - local119;
				@Pc(131) int local131 = local77 - local69;
				@Pc(143) int local143 = (local119 * local103 >> 12) * local109 >> 12;
				@Pc(149) int local149 = local126 * local109 >> 12;
				@Pc(155) int local155 = local103 * local131 >> 12;
				@Pc(163) int local163 = local73 + local143 + local149 + local155;
				if (local163 <= -32768) {
					local163 = -32767;
				}
				if (local163 >= 32768) {
					local163 = 32767;
				}
				this.aShortArray84[local8] = (short) local163;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray46.length - 1 && local26 >= this.anIntArrayArray46[local28][0]; local28++) {
				}
				local55 = this.anIntArrayArray46[local28 - 1];
				local60 = this.anIntArrayArray46[local28];
				local69 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static247.anIntArray452[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local55[1] * local77 + local60[1] * local73 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray84[local8] = (short) local86;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray46.length - 1 && local26 >= this.anIntArrayArray46[local28][0]; local28++) {
				}
				local55 = this.anIntArrayArray46[local28 - 1];
				local60 = this.anIntArrayArray46[local28];
				local69 = (local26 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local69 * local60[1] + local73 * local55[1] >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray84[local8] = (short) local77;
			}
		}
	}
}
