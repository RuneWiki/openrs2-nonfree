import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!af", name = "L", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!af", name = "V", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!af", name = "M", descriptor = "[S")
	private final short[] aShortArray1 = new short[257];

	@OriginalMember(owner = "client!af", name = "W", descriptor = "I")
	private int anInt205 = 0;

	static {
		new Class34("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)[I")
	private int[] method189(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray24;
		} else if (this.anIntArrayArray1.length <= arg0) {
			return this.anIntArray23;
		} else {
			return this.anIntArrayArray1[arg0];
		}
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
	private void method191() {
		@Pc(8) int[] local8 = this.anIntArrayArray1[0];
		@Pc(13) int[] local13 = this.anIntArrayArray1[1];
		@Pc(22) int[] local22 = this.anIntArrayArray1[this.anIntArrayArray1.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray1[this.anIntArrayArray1.length - 1];
		this.anIntArray24 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] - -local8[1] };
		this.anIntArray23 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (-local22[1] - -local31[1]) };
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt205 = arg1.method4532();
		this.anIntArrayArray1 = new int[arg1.method4532()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray1.length; local20++) {
			this.anIntArrayArray1[local20][0] = arg1.method4556();
			this.anIntArrayArray1[local20][1] = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V")
	private void method193() {
		@Pc(9) int local9 = this.anInt205;
		@Pc(29) int local29;
		@Pc(27) int local27;
		@Pc(60) int[] local60;
		@Pc(65) int[] local65;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(93) int local93;
		if (local9 == 2) {
			for (local9 = 0; local9 < 257; local9++) {
				local27 = local9 << 4;
				for (local29 = 1; this.anIntArrayArray1.length - 1 > local29 && local27 >= this.anIntArrayArray1[local29][0]; local29++) {
				}
				local60 = this.anIntArrayArray1[local29 - 1];
				local65 = this.anIntArrayArray1[local29];
				local74 = this.method189(local29 - 2)[1];
				local78 = local60[1];
				local82 = local65[1];
				local93 = this.method189(local29 + 1)[1];
				@Pc(110) int local110 = (local27 - local60[0] << 12) / (local65[0] - local60[0]);
				@Pc(116) int local116 = local110 * local110 >> 12;
				@Pc(125) int local125 = local78 + local93 - local82 - local74;
				@Pc(133) int local133 = local74 - local125 - local78;
				@Pc(138) int local138 = local82 - local74;
				@Pc(150) int local150 = (local125 * local110 >> 12) * local116 >> 12;
				@Pc(156) int local156 = local116 * local133 >> 12;
				@Pc(162) int local162 = local110 * local138 >> 12;
				@Pc(171) int local171 = local162 + local150 + local156 + local78;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray1[local9] = (short) local171;
			}
		} else if (local9 == 1) {
			for (local9 = 0; local9 < 257; local9++) {
				local27 = local9 << 4;
				for (local29 = 1; local29 < this.anIntArrayArray1.length - 1 && local27 >= this.anIntArrayArray1[local29][0]; local29++) {
				}
				local60 = this.anIntArrayArray1[local29 - 1];
				local65 = this.anIntArrayArray1[local29];
				local74 = (local27 - local60[0] << 12) / (local65[0] - local60[0]);
				local78 = 4096 - Static31.anIntArray94[local74 >> 5 & 0xFF] >> 1;
				local82 = 4096 - local78;
				local93 = local60[1] * local82 + local78 * local65[1] >> 12;
				if (local93 <= -32768) {
					local93 = -32767;
				}
				if (local93 >= 32768) {
					local93 = 32767;
				}
				this.aShortArray1[local9] = (short) local93;
			}
		} else {
			for (local9 = 0; local9 < 257; local9++) {
				local27 = local9 << 4;
				for (local29 = 1; local29 < this.anIntArrayArray1.length - 1 && this.anIntArrayArray1[local29][0] <= local27; local29++) {
				}
				local60 = this.anIntArrayArray1[local29 - 1];
				local65 = this.anIntArrayArray1[local29];
				local74 = (local27 - local60[0] << 12) / (local65[0] - local60[0]);
				local78 = 4096 - local74;
				local82 = local74 * local65[1] + local60[1] * local78 >> 12;
				if (local82 <= -32768) {
					local82 = -32767;
				}
				if (local82 >= 32768) {
					local82 = 32767;
				}
				this.aShortArray1[local9] = (short) local82;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		if (this.anIntArrayArray1 == null) {
			this.anIntArrayArray1 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray1.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt205 == 2) {
			this.method191();
		}
		Static280.method4876();
		this.method193();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5532(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static153.anInt3378; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local11[local31] = this.aShortArray1[local39];
			}
		}
		return local11;
	}
}
