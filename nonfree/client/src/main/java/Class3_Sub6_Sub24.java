import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class3_Sub6_Sub24 extends Class3_Sub6 {

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
	private int anInt7576 = 0;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "[S")
	private final short[] aShortArray111 = new short[257];

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
	private void method5922() {
		@Pc(16) int local16 = this.anInt7576;
		@Pc(36) int local36;
		@Pc(34) int local34;
		@Pc(67) int[] local67;
		@Pc(72) int[] local72;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(98) int local98;
		if (local16 == 2) {
			for (local16 = 0; local16 < 257; local16++) {
				local34 = local16 << 4;
				for (local36 = 1; this.anIntArrayArray78.length - 1 > local36 && this.anIntArrayArray78[local36][0] <= local34; local36++) {
				}
				local67 = this.anIntArrayArray78[local36 - 1];
				local72 = this.anIntArrayArray78[local36];
				local81 = this.method5925(local36 - 2)[1];
				local85 = local67[1];
				local89 = local72[1];
				local98 = this.method5925(local36 + 1)[1];
				@Pc(116) int local116 = (local34 - local67[0] << 12) / (local72[0] - local67[0]);
				@Pc(122) int local122 = local116 * local116 >> 12;
				@Pc(132) int local132 = local85 + local98 - local81 - local89;
				@Pc(140) int local140 = local81 - local85 - local132;
				@Pc(144) int local144 = local89 - local81;
				@Pc(156) int local156 = (local116 * local132 >> 12) * local122 >> 12;
				@Pc(162) int local162 = local122 * local140 >> 12;
				@Pc(168) int local168 = local116 * local144 >> 12;
				@Pc(177) int local177 = local156 + local162 + local168 + local85;
				if (local177 <= -32768) {
					local177 = -32767;
				}
				if (local177 >= 32768) {
					local177 = 32767;
				}
				this.aShortArray111[local16] = (short) local177;
			}
		} else if (local16 == 1) {
			for (local16 = 0; local16 < 257; local16++) {
				local34 = local16 << 4;
				for (local36 = 1; this.anIntArrayArray78.length - 1 > local36 && local34 >= this.anIntArrayArray78[local36][0]; local36++) {
				}
				local67 = this.anIntArrayArray78[local36 - 1];
				local72 = this.anIntArrayArray78[local36];
				local81 = (local34 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - Static392.anIntArray389[local81 >> 5 & 0xFF] >> 1;
				local89 = 4096 - local85;
				local98 = local72[1] * local85 + local89 * local67[1] >> 12;
				if (local98 <= -32768) {
					local98 = -32767;
				}
				if (local98 >= 32768) {
					local98 = 32767;
				}
				this.aShortArray111[local16] = (short) local98;
			}
		} else {
			for (local16 = 0; local16 < 257; local16++) {
				local34 = local16 << 4;
				for (local36 = 1; local36 < this.anIntArrayArray78.length - 1 && this.anIntArrayArray78[local36][0] <= local34; local36++) {
				}
				local67 = this.anIntArrayArray78[local36 - 1];
				local72 = this.anIntArrayArray78[local36];
				local81 = (local34 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - local81;
				local89 = local81 * local72[1] + local85 * local67[1] >> 12;
				if (local89 <= -32768) {
					local89 = -32767;
				}
				if (local89 >= 32768) {
					local89 = 32767;
				}
				this.aShortArray111[local16] = (short) local89;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(27) int[] local27 = this.method8001(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static481.anInt8358; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray111[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V")
	private void method5924() {
		@Pc(8) int[] local8 = this.anIntArrayArray78[0];
		@Pc(13) int[] local13 = this.anIntArrayArray78[1];
		@Pc(22) int[] local22 = this.anIntArrayArray78[this.anIntArrayArray78.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray78[this.anIntArrayArray78.length - 1];
		this.anIntArray434 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + -local31[1] + local22[1] };
		this.anIntArray433 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[I")
	private int[] method5925(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray433;
		} else if (this.anIntArrayArray78.length <= arg0) {
			return this.anIntArray434;
		} else {
			return this.anIntArrayArray78[arg0];
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		if (this.anIntArrayArray78 == null) {
			this.anIntArrayArray78 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray78.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7576 == 2) {
			this.method5924();
		}
		Static578.method7854();
		this.method5922();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt7576 = arg0.method6814();
		this.anIntArrayArray78 = new int[arg0.method6814()][2];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray78.length; local30++) {
			this.anIntArrayArray78[local30][0] = arg0.method6811();
			this.anIntArrayArray78[local30][1] = arg0.method6811();
		}
	}
}
