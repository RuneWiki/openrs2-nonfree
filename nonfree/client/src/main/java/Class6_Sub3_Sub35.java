import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class6_Sub3_Sub35 extends Class6_Sub3 {

	@OriginalMember(owner = "client!tm", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!tm", name = "I", descriptor = "[I")
	private int[] anIntArray620;

	@OriginalMember(owner = "client!tm", name = "M", descriptor = "[I")
	private int[] anIntArray621;

	@OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
	private int anInt8737 = 0;

	@OriginalMember(owner = "client!tm", name = "T", descriptor = "[S")
	private final short[] aShortArray141 = new short[257];

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt8737 = arg1.method6019();
		this.anIntArrayArray74 = new int[arg1.method6019()][2];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray74.length; local32++) {
			this.anIntArrayArray74[local32][0] = arg1.method6044();
			this.anIntArrayArray74[local32][1] = arg1.method6044();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(29) int[] local29 = this.method7950(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static35.anInt670; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local11[local31] = this.aShortArray141[local39];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		if (this.anIntArrayArray74 == null) {
			this.anIntArrayArray74 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray74.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt8737 == 2) {
			this.method6955();
		}
		Static583.method7925();
		this.method6956();
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)V")
	private void method6955() {
		@Pc(8) int[] local8 = this.anIntArrayArray74[0];
		@Pc(19) int[] local19 = this.anIntArrayArray74[1];
		@Pc(28) int[] local28 = this.anIntArrayArray74[this.anIntArrayArray74.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray74[this.anIntArrayArray74.length - 1];
		this.anIntArray621 = new int[] { local28[0] + local28[0] - local37[0], -local37[1] - -local28[1] + local28[1] };
		this.anIntArray620 = new int[] { local8[0] + local8[0] - local19[0], local8[1] + -local19[1] + local8[1] };
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V")
	private void method6956() {
		@Pc(4) int local4 = this.anInt8737;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray74.length - 1 && local22 >= this.anIntArrayArray74[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray74[local24 - 1];
				local60 = this.anIntArrayArray74[local24];
				local69 = this.method6957(local24 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method6957(local24 + 1)[1];
				@Pc(103) int local103 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(109) int local109 = local103 * local103 >> 12;
				@Pc(119) int local119 = local73 + local86 - local69 - local77;
				@Pc(126) int local126 = local69 - local73 - local119;
				@Pc(131) int local131 = local77 - local69;
				@Pc(143) int local143 = local109 * (local119 * local103 >> 12) >> 12;
				@Pc(149) int local149 = local126 * local109 >> 12;
				@Pc(155) int local155 = local131 * local103 >> 12;
				@Pc(163) int local163 = local73 + local155 + local149 + local143;
				if (local163 <= -32768) {
					local163 = -32767;
				}
				if (local163 >= 32768) {
					local163 = 32767;
				}
				this.aShortArray141[local4] = (short) local163;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray74.length - 1 && this.anIntArrayArray74[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray74[local24 - 1];
				local60 = this.anIntArrayArray74[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static6.anIntArray5[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local55[1] * local77 + local60[1] * local73 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray141[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray74.length - 1 > local24 && this.anIntArrayArray74[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray74[local24 - 1];
				local60 = this.anIntArrayArray74[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local55[1] * local73 + local60[1] * local69 >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray141[local4] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(II)[I")
	private int[] method6957(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray620;
		} else if (this.anIntArrayArray74.length <= arg0) {
			return this.anIntArray621;
		} else {
			return this.anIntArrayArray74[arg0];
		}
	}
}
