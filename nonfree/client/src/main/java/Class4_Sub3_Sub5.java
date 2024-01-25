import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class4_Sub3_Sub5 extends Class4_Sub3 {

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "[S")
	private final short[] aShortArray21 = new short[257];

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
	private int anInt1593 = 0;

	static {
		new Class21("Player ", "Spieler ", "Joueur ", "Jogador ");
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1593 = arg1.method4614();
		this.anIntArrayArray7 = new int[arg1.method4614()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray7.length; local17++) {
			this.anIntArrayArray7[local17][0] = arg1.method4560();
			this.anIntArrayArray7[local17][1] = arg1.method4560();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)[I")
	private int[] method1453(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray116;
		} else if (this.anIntArrayArray7.length <= arg0) {
			return this.anIntArray115;
		} else {
			return this.anIntArrayArray7[arg0];
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		if (this.anIntArrayArray7 == null) {
			this.anIntArrayArray7 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray7.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1593 == 2) {
			this.method1455();
		}
		Static58.method1272();
		this.method1456();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(26) int[] local26 = this.method6337(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static304.anInt5637; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray21[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(B)V")
	private void method1455() {
		@Pc(8) int[] local8 = this.anIntArrayArray7[0];
		@Pc(13) int[] local13 = this.anIntArrayArray7[1];
		@Pc(22) int[] local22 = this.anIntArrayArray7[this.anIntArrayArray7.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray7[this.anIntArrayArray7.length - 1];
		this.anIntArray116 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + local8[1] - local13[1] };
		this.anIntArray115 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] - (-local22[1] - local22[1]) };
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(B)V")
	private void method1456() {
		@Pc(9) int local9 = this.anInt1593;
		@Pc(29) int local29;
		@Pc(27) int local27;
		@Pc(64) int[] local64;
		@Pc(69) int[] local69;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(86) int local86;
		@Pc(95) int local95;
		if (local9 == 2) {
			for (local9 = 0; local9 < 257; local9++) {
				local27 = local9 << 4;
				for (local29 = 1; local29 < this.anIntArrayArray7.length - 1 && local27 >= this.anIntArrayArray7[local29][0]; local29++) {
				}
				local64 = this.anIntArrayArray7[local29 - 1];
				local69 = this.anIntArrayArray7[local29];
				local78 = this.method1453(local29 - 2)[1];
				local82 = local64[1];
				local86 = local69[1];
				local95 = this.method1453(local29 + 1)[1];
				@Pc(112) int local112 = (local27 - local64[0] << 12) / (local69[0] - local64[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(129) int local129 = local95 + local82 - local78 - local86;
				@Pc(136) int local136 = local78 - local82 - local129;
				@Pc(141) int local141 = local86 - local78;
				@Pc(153) int local153 = (local129 * local112 >> 12) * local118 >> 12;
				@Pc(159) int local159 = local136 * local118 >> 12;
				@Pc(165) int local165 = local141 * local112 >> 12;
				@Pc(174) int local174 = local159 + local153 + local165 + local82;
				if (local174 <= -32768) {
					local174 = -32767;
				}
				if (local174 >= 32768) {
					local174 = 32767;
				}
				this.aShortArray21[local9] = (short) local174;
			}
		} else if (local9 == 1) {
			for (local9 = 0; local9 < 257; local9++) {
				local27 = local9 << 4;
				for (local29 = 1; local29 < this.anIntArrayArray7.length - 1 && this.anIntArrayArray7[local29][0] <= local27; local29++) {
				}
				local64 = this.anIntArrayArray7[local29 - 1];
				local69 = this.anIntArrayArray7[local29];
				local78 = (local27 - local64[0] << 12) / (local69[0] - local64[0]);
				local82 = 4096 - Static131.anIntArray179[local78 >> 5 & 0xFF] >> 1;
				local86 = 4096 - local82;
				local95 = local86 * local64[1] + local82 * local69[1] >> 12;
				if (local95 <= -32768) {
					local95 = -32767;
				}
				if (local95 >= 32768) {
					local95 = 32767;
				}
				this.aShortArray21[local9] = (short) local95;
			}
		} else {
			for (local9 = 0; local9 < 257; local9++) {
				local27 = local9 << 4;
				for (local29 = 1; local29 < this.anIntArrayArray7.length - 1 && local27 >= this.anIntArrayArray7[local29][0]; local29++) {
				}
				local64 = this.anIntArrayArray7[local29 - 1];
				local69 = this.anIntArrayArray7[local29];
				local78 = (local27 - local64[0] << 12) / (local69[0] - local64[0]);
				local82 = 4096 - local78;
				local86 = local82 * local64[1] + local69[1] * local78 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray21[local9] = (short) local86;
			}
		}
	}
}
