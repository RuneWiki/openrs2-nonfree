import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jn", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!jn", name = "P", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!jn", name = "R", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!jn", name = "X", descriptor = "I")
	private int anInt4473 = 0;

	@OriginalMember(owner = "client!jn", name = "ab", descriptor = "[S")
	private final short[] aShortArray74 = new short[257];

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)V")
	private void method4156() {
		@Pc(8) int[] local8 = this.anIntArrayArray50[0];
		@Pc(21) int[] local21 = this.anIntArrayArray50[1];
		@Pc(30) int[] local30 = this.anIntArrayArray50[this.anIntArrayArray50.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray50[this.anIntArrayArray50.length - 1];
		this.anIntArray348 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
		this.anIntArray349 = new int[] { local8[0] + local8[0] - local21[0], local8[1] - (local21[1] + -local8[1]) };
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		if (this.anIntArrayArray50 == null) {
			this.anIntArrayArray50 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray50.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4473 == 2) {
			this.method4156();
		}
		Static371.method5980();
		this.method4157();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	private void method4157() {
		@Pc(4) int local4 = this.anInt4473;
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
				for (local24 = 1; this.anIntArrayArray50.length - 1 > local24 && local22 >= this.anIntArrayArray50[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray50[local24 - 1];
				local60 = this.anIntArrayArray50[local24];
				local69 = this.method4160(local24 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method4160(local24 + 1)[1];
				@Pc(104) int local104 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(110) int local110 = local104 * local104 >> 12;
				@Pc(119) int local119 = local73 + local86 - local69 - local77;
				@Pc(126) int local126 = local69 - local119 - local73;
				@Pc(131) int local131 = local77 - local69;
				@Pc(143) int local143 = (local119 * local104 >> 12) * local110 >> 12;
				@Pc(149) int local149 = local126 * local110 >> 12;
				@Pc(155) int local155 = local104 * local131 >> 12;
				@Pc(163) int local163 = local155 + local143 + local149 + local73;
				if (local163 <= -32768) {
					local163 = -32767;
				}
				if (local163 >= 32768) {
					local163 = 32767;
				}
				this.aShortArray74[local4] = (short) local163;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray50.length - 1 && this.anIntArrayArray50[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray50[local24 - 1];
				local60 = this.anIntArrayArray50[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static246.anIntArray361[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local73 * local60[1] + local55[1] * local77 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray74[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray50.length - 1 && local22 >= this.anIntArrayArray50[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray50[local24 - 1];
				local60 = this.anIntArrayArray50[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local69 * local60[1] + local73 * local55[1] >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray74[local4] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(21) int[] local21 = this.method8201(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static254.anInt4973; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray74[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt4473 = arg1.method4487();
		this.anIntArrayArray50 = new int[arg1.method4487()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray50.length; local17++) {
			this.anIntArrayArray50[local17][0] = arg1.method4494();
			this.anIntArrayArray50[local17][1] = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)[I")
	private int[] method4160(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray349;
		} else if (arg0 >= this.anIntArrayArray50.length) {
			return this.anIntArray348;
		} else {
			return this.anIntArrayArray50[arg0];
		}
	}
}
