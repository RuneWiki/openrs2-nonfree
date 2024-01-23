import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class4_Sub6_Sub37 extends Class4_Sub6 {

	@OriginalMember(owner = "client!vh", name = "R", descriptor = "[I")
	private int[] anIntArray473;

	@OriginalMember(owner = "client!vh", name = "T", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!vh", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!vh", name = "M", descriptor = "[S")
	private short[] aShortArray90 = new short[257];

	@OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
	private int anInt5318 = 0;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5318 = arg0.method1874();
		this.anIntArrayArray45 = new int[arg0.method1874()][2];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArrayArray45.length; local23++) {
			this.anIntArrayArray45[local23][0] = arg0.method1837();
			this.anIntArrayArray45[local23][1] = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(22) int[] local22 = this.method4372(0, arg0);
			for (@Pc(24) int local24 = 0; local24 < Static2.anInt19; local24++) {
				@Pc(37) int local37 = local22[local24] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local24] = this.aShortArray90[local37];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IB)[I")
	private int[] method4228(@OriginalArg(0) int arg0) {
		if (arg0 >= 0) {
			return this.anIntArrayArray45.length <= arg0 ? this.anIntArray474 : this.anIntArrayArray45[arg0];
		} else {
			return this.anIntArray473;
		}
	}

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)V")
	private void method4230() {
		@Pc(8) int local8 = this.anInt5318;
		@Pc(27) int local27;
		@Pc(25) int local25;
		@Pc(61) int[] local61;
		@Pc(54) int[] local54;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local25 = local8 << 4;
				for (local27 = 1; this.anIntArrayArray45.length - 1 > local27 && this.anIntArrayArray45[local27][0] <= local25; local27++) {
				}
				local54 = this.anIntArrayArray45[local27];
				local61 = this.anIntArrayArray45[local27 - 1];
				local70 = this.method4228(local27 - 2)[1];
				local74 = local61[1];
				local78 = local54[1];
				local87 = this.method4228(local27 + 1)[1];
				@Pc(105) int local105 = (local25 - local61[0] << 12) / (local54[0] - local61[0]);
				@Pc(111) int local111 = local105 * local105 >> 12;
				@Pc(119) int local119 = local87 + local74 - local78 - local70;
				@Pc(126) int local126 = local78 - local70;
				@Pc(136) int local136 = (local119 * local105 >> 12) * local111 >> 12;
				@Pc(144) int local144 = local70 - local119 - local74;
				@Pc(150) int local150 = local144 * local111 >> 12;
				@Pc(156) int local156 = local105 * local126 >> 12;
				@Pc(164) int local164 = local156 + local150 + local136 + local74;
				if (local164 <= -32768) {
					local164 = -32767;
				}
				if (local164 >= 32768) {
					local164 = 32767;
				}
				this.aShortArray90[local8] = (short) local164;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local25 = local8 << 4;
				for (local27 = 1; local27 < this.anIntArrayArray45.length - 1 && this.anIntArrayArray45[local27][0] <= local25; local27++) {
				}
				local54 = this.anIntArrayArray45[local27];
				local61 = this.anIntArrayArray45[local27 - 1];
				local70 = (local25 - local61[0] << 12) / (local54[0] - local61[0]);
				local74 = 4096 - Static79.anIntArray165[local70 >> 5 & 0xFF] >> 1;
				local78 = 4096 - local74;
				local87 = local54[1] * local74 + local78 * local61[1] >> 12;
				if (local87 <= -32768) {
					local87 = -32767;
				}
				if (local87 >= 32768) {
					local87 = 32767;
				}
				this.aShortArray90[local8] = (short) local87;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local25 = local8 << 4;
				for (local27 = 1; local27 < this.anIntArrayArray45.length - 1 && this.anIntArrayArray45[local27][0] <= local25; local27++) {
				}
				local61 = this.anIntArrayArray45[local27 - 1];
				local54 = this.anIntArrayArray45[local27];
				local70 = (local25 - local61[0] << 12) / (local54[0] - local61[0]);
				local74 = 4096 - local70;
				local78 = local74 * local61[1] + local54[1] * local70 >> 12;
				if (local78 <= -32768) {
					local78 = -32767;
				}
				if (local78 >= 32768) {
					local78 = 32767;
				}
				this.aShortArray90[local8] = (short) local78;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		if (this.anIntArrayArray45 == null) {
			this.anIntArrayArray45 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray45.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5318 == 2) {
			this.method4231();
		}
		Static197.method3082();
		this.method4230();
	}

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "(I)V")
	private void method4231() {
		@Pc(8) int[] local8 = this.anIntArrayArray45[0];
		@Pc(13) int[] local13 = this.anIntArrayArray45[1];
		@Pc(22) int[] local22 = this.anIntArrayArray45[this.anIntArrayArray45.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray45[this.anIntArrayArray45.length - 1];
		this.anIntArray473 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (local13[1] - local8[1]) };
		this.anIntArray474 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (local31[1] + -local22[1]) };
	}
}
