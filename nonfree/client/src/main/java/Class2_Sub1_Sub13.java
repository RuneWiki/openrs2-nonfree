import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fa", name = "X", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!fa", name = "bb", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!fa", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
	private int anInt1283;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt1283 = arg0.method1402();
		this.anIntArrayArray19 = new int[arg0.method1402()][2];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray19.length; local30++) {
			this.anIntArrayArray19[local30][0] = arg0.method1397();
			this.anIntArrayArray19[local30][1] = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(28) int[] local28 = this.method2796(0, arg0);
			@Pc(31) int local31 = this.anInt1283;
			@Pc(53) int local53;
			@Pc(51) int local51;
			@Pc(84) int[] local84;
			@Pc(89) int[] local89;
			@Pc(98) int local98;
			@Pc(102) int local102;
			@Pc(106) int local106;
			if (local31 == 2) {
				for (local31 = 0; local31 < Static120.anInt2812; local31++) {
					local51 = local28[local31];
					for (local53 = 1; this.anIntArrayArray19.length - 1 > local53 && this.anIntArrayArray19[local53][0] <= local51; local53++) {
					}
					local84 = this.anIntArrayArray19[local53 - 1];
					local89 = this.anIntArrayArray19[local53];
					local98 = this.method838(local53 - 2)[1];
					local102 = local84[1];
					local106 = local89[1];
					@Pc(115) int local115 = this.method838(local53 + 1)[1];
					@Pc(126) int local126 = local115 + local102 - local98 - local106;
					@Pc(142) int local142 = (local51 - local84[0] << 12) / (local89[0] - local84[0]);
					@Pc(148) int local148 = local142 * local142 >> 12;
					@Pc(156) int local156 = local98 - local126 - local102;
					@Pc(160) int local160 = local106 - local98;
					@Pc(168) int local168 = local148 * local156 >> 12;
					@Pc(178) int local178 = local148 * (local142 * local126 >> 12) >> 12;
					@Pc(184) int local184 = local160 * local142 >> 12;
					local18[local31] = local184 + local168 + local178 + local102;
				}
			} else if (local31 == 1) {
				for (local31 = 0; local31 < Static120.anInt2812; local31++) {
					local51 = local28[local31];
					for (local53 = 1; this.anIntArrayArray19.length - 1 > local53 && local51 >= this.anIntArrayArray19[local53][0]; local53++) {
					}
					local84 = this.anIntArrayArray19[local53 - 1];
					local89 = this.anIntArrayArray19[local53];
					local98 = (local51 - local84[0] << 12) / (local89[0] - local84[0]);
					local102 = 4096 - Static159.anIntArray376[local98 >> 5 & 0xFF] >> 1;
					local106 = 4096 - local102;
					local18[local31] = local102 * local89[1] + local106 * local84[1] >> 12;
				}
			} else {
				for (local31 = 0; local31 < Static120.anInt2812; local31++) {
					local51 = local28[local31];
					for (local53 = 1; local53 < this.anIntArrayArray19.length - 1 && local51 >= this.anIntArrayArray19[local53][0]; local53++) {
					}
					local84 = this.anIntArrayArray19[local53 - 1];
					local89 = this.anIntArrayArray19[local53];
					local98 = (local51 - local84[0] << 12) / (local89[0] - local84[0]);
					local102 = 4096 - local98;
					local18[local31] = local84[1] * local102 + local89[1] * local98 >> 12;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V")
	private void method834() {
		@Pc(4) int[] local4 = this.anIntArrayArray19[1];
		@Pc(13) int[] local13 = this.anIntArrayArray19[0];
		@Pc(22) int[] local22 = this.anIntArrayArray19[this.anIntArrayArray19.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray19[this.anIntArrayArray19.length - 1];
		this.anIntArray67 = new int[] { local22[0] + local22[0] - local37[0], -local37[1] + local22[1] + local22[1] };
		this.anIntArray66 = new int[] { local13[0] + local13[0] - local4[0], local13[1] + -local4[1] + local13[1] };
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		if (this.anIntArrayArray19 == null) {
			this.anIntArrayArray19 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray19.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1283 == 2) {
			this.method834();
		}
		Static51.method913();
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[I")
	private int[] method838(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray66;
		} else if (arg0 >= this.anIntArrayArray19.length) {
			return this.anIntArray67;
		} else {
			return this.anIntArrayArray19[arg0];
		}
	}
}
