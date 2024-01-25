import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class2_Sub10_Sub9 extends Class2_Sub10 {

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!fl", name = "O", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "[S")
	private final short[] aShortArray43 = new short[257];

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
	private int anInt3579 = 0;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(21) int[] local21 = this.method8402(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static93.anInt1862; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray43[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)[I")
	private int[] method2946(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray252;
		} else if (this.anIntArrayArray23.length <= arg0) {
			return this.anIntArray253;
		} else {
			return this.anIntArrayArray23[arg0];
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	private void method2948() {
		@Pc(8) int[] local8 = this.anIntArrayArray23[0];
		@Pc(13) int[] local13 = this.anIntArrayArray23[1];
		@Pc(22) int[] local22 = this.anIntArrayArray23[this.anIntArrayArray23.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray23[this.anIntArrayArray23.length - 1];
		this.anIntArray253 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - -local22[1] - local31[1] };
		this.anIntArray252 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (local13[1] + -local8[1]) };
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	private void method2949() {
		@Pc(12) int local12 = this.anInt3579;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; this.anIntArrayArray23.length - 1 > local30 && this.anIntArrayArray23[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray23[local30 - 1];
				local66 = this.anIntArrayArray23[local30];
				local75 = this.method2946(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method2946(local30 + 1)[1];
				@Pc(109) int local109 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(125) int local125 = local79 + local92 - local83 - local75;
				@Pc(132) int local132 = local75 - local125 - local79;
				@Pc(137) int local137 = local83 - local75;
				@Pc(149) int local149 = (local109 * local125 >> 12) * local115 >> 12;
				@Pc(155) int local155 = local132 * local115 >> 12;
				@Pc(161) int local161 = local109 * local137 >> 12;
				@Pc(169) int local169 = local79 + local161 + local155 + local149;
				if (local169 <= -32768) {
					local169 = -32767;
				}
				if (local169 >= 32768) {
					local169 = 32767;
				}
				this.aShortArray43[local12] = (short) local169;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; this.anIntArrayArray23.length - 1 > local30 && this.anIntArrayArray23[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray23[local30 - 1];
				local66 = this.anIntArrayArray23[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static68.anIntArray145[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local79 * local66[1] + local61[1] * local83 >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray43[local12] = (short) local92;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; this.anIntArrayArray23.length - 1 > local30 && this.anIntArrayArray23[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray23[local30 - 1];
				local66 = this.anIntArrayArray23[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local66[1] * local75 + local61[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray43[local12] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3579 = arg0.method6904();
		this.anIntArrayArray23 = new int[arg0.method6904()][2];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArrayArray23.length; local25++) {
			this.anIntArrayArray23[local25][0] = arg0.method6884();
			this.anIntArrayArray23[local25][1] = arg0.method6884();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		if (this.anIntArrayArray23 == null) {
			this.anIntArrayArray23 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray23.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3579 == 2) {
			this.method2948();
		}
		Static385.method5800();
		this.method2949();
	}
}
