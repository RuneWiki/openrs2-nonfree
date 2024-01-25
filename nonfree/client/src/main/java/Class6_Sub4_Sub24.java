import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class6_Sub4_Sub24 extends Class6_Sub4 {

	@OriginalMember(owner = "client!oba", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!oba", name = "M", descriptor = "[I")
	private int[] anIntArray472;

	@OriginalMember(owner = "client!oba", name = "O", descriptor = "[I")
	private int[] anIntArray473;

	@OriginalMember(owner = "client!oba", name = "F", descriptor = "[S")
	private final short[] aShortArray81 = new short[257];

	@OriginalMember(owner = "client!oba", name = "P", descriptor = "I")
	private int anInt6330 = 0;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "(B)V")
	private void method5414() {
		@Pc(14) int[] local14 = this.anIntArrayArray58[0];
		@Pc(19) int[] local19 = this.anIntArrayArray58[1];
		@Pc(28) int[] local28 = this.anIntArrayArray58[this.anIntArrayArray58.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray58[this.anIntArrayArray58.length - 1];
		this.anIntArray473 = new int[] { local28[0] + local28[0] - local37[0], local28[1] - (local37[1] - local28[1]) };
		this.anIntArray472 = new int[] { local14[0] + local14[0] - local19[0], local14[1] - (local19[1] + -local14[1]) };
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(29) int[] local29 = this.method7748(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static408.anInt7209; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local19[local31] = this.aShortArray81[local39];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt6330 = arg1.method6069();
		this.anIntArrayArray58 = new int[arg1.method6069()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray58.length; local21++) {
			this.anIntArrayArray58[local21][0] = arg1.method6003();
			this.anIntArrayArray58[local21][1] = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		if (this.anIntArrayArray58 == null) {
			this.anIntArrayArray58 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray58.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt6330 == 2) {
			this.method5414();
		}
		Static571.method7641();
		this.method5416();
	}

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "(I)V")
	private void method5416() {
		@Pc(8) int local8 = this.anInt6330;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray58.length - 1 && local28 >= this.anIntArrayArray58[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray58[local30 - 1];
				local66 = this.anIntArrayArray58[local30];
				local75 = this.method5417(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method5417(local30 + 1)[1];
				@Pc(110) int local110 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(116) int local116 = local110 * local110 >> 12;
				@Pc(125) int local125 = local79 + local92 - local83 - local75;
				@Pc(133) int local133 = local75 - local79 - local125;
				@Pc(137) int local137 = local83 - local75;
				@Pc(149) int local149 = local116 * (local125 * local110 >> 12) >> 12;
				@Pc(155) int local155 = local116 * local133 >> 12;
				@Pc(161) int local161 = local110 * local137 >> 12;
				@Pc(171) int local171 = local79 + local149 + local155 + local161;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray81[local8] = (short) local171;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray58.length - 1 && local28 >= this.anIntArrayArray58[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray58[local30 - 1];
				local66 = this.anIntArrayArray58[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static300.anIntArray410[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local61[1] * local83 + local66[1] * local79 >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray81[local8] = (short) local92;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; this.anIntArrayArray58.length - 1 > local30 && local28 >= this.anIntArrayArray58[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray58[local30 - 1];
				local66 = this.anIntArrayArray58[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local66[1] * local75 + local61[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray81[local8] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZI)[I")
	private int[] method5417(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray472;
		} else if (arg0 >= this.anIntArrayArray58.length) {
			return this.anIntArray473;
		} else {
			return this.anIntArrayArray58[arg0];
		}
	}
}
