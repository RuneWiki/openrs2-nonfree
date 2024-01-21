import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!eb", name = "cb", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	private void method759() {
		@Pc(8) int[] local8 = this.anIntArrayArray9[0];
		@Pc(13) int[] local13 = this.anIntArrayArray9[1];
		@Pc(22) int[] local22 = this.anIntArrayArray9[this.anIntArrayArray9.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray9[this.anIntArrayArray9.length - 1];
		this.anIntArray73 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
		this.anIntArray72 = new int[] { local22[0] + local22[0] - local36[0], local22[1] - (local36[1] - local22[1]) };
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt922 = arg1.method1461();
		this.anIntArrayArray9 = new int[arg1.method1461()][2];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray9.length; local24++) {
			this.anIntArrayArray9[local24][0] = arg1.method1456();
			this.anIntArrayArray9[local24][1] = arg1.method1456();
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		if (this.anIntArrayArray9 == null) {
			this.anIntArrayArray9 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray9.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt922 == 2) {
			this.method759();
		}
		Static100.method1657();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)[I")
	private int[] method763(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray73;
		} else if (arg0 >= this.anIntArrayArray9.length) {
			return this.anIntArray72;
		} else {
			return this.anIntArrayArray9[arg0];
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(28) int[] local28 = this.method2573(arg0, 0);
			@Pc(31) int local31 = this.anInt922;
			@Pc(53) int local53;
			@Pc(51) int local51;
			@Pc(88) int[] local88;
			@Pc(93) int[] local93;
			@Pc(102) int local102;
			@Pc(106) int local106;
			@Pc(110) int local110;
			if (local31 == 2) {
				for (local31 = 0; local31 < Static149.anInt3233; local31++) {
					local51 = local28[local31];
					for (local53 = 1; this.anIntArrayArray9.length - 1 > local53 && local51 >= this.anIntArrayArray9[local53][0]; local53++) {
					}
					local88 = this.anIntArrayArray9[local53 - 1];
					local93 = this.anIntArrayArray9[local53];
					local102 = this.method763(local53 - 2)[1];
					local106 = local88[1];
					local110 = local93[1];
					@Pc(119) int local119 = this.method763(local53 + 1)[1];
					@Pc(135) int local135 = (local51 - local88[0] << 12) / (local93[0] - local88[0]);
					@Pc(146) int local146 = local119 + local106 - local110 - local102;
					@Pc(152) int local152 = local135 * local135 >> 12;
					@Pc(159) int local159 = local102 - local106 - local146;
					@Pc(164) int local164 = local110 - local102;
					@Pc(170) int local170 = local152 * local159 >> 12;
					@Pc(180) int local180 = (local135 * local146 >> 12) * local152 >> 12;
					@Pc(186) int local186 = local135 * local164 >> 12;
					local14[local31] = local186 + local180 + local170 + local106;
				}
			} else if (local31 == 1) {
				for (local31 = 0; local31 < Static149.anInt3233; local31++) {
					local51 = local28[local31];
					for (local53 = 1; this.anIntArrayArray9.length - 1 > local53 && this.anIntArrayArray9[local53][0] <= local51; local53++) {
					}
					local93 = this.anIntArrayArray9[local53];
					local88 = this.anIntArrayArray9[local53 - 1];
					local102 = (local51 - local88[0] << 12) / (local93[0] - local88[0]);
					local106 = 4096 - Static45.anIntArray135[local102 >> 5 & 0xFF] >> 1;
					local110 = 4096 - local106;
					local14[local31] = local88[1] * local110 + local106 * local93[1] >> 12;
				}
			} else {
				for (local31 = 0; local31 < Static149.anInt3233; local31++) {
					local51 = local28[local31];
					for (local53 = 1; this.anIntArrayArray9.length - 1 > local53 && this.anIntArrayArray9[local53][0] <= local51; local53++) {
					}
					local93 = this.anIntArrayArray9[local53];
					local88 = this.anIntArrayArray9[local53 - 1];
					local102 = (local51 - local88[0] << 12) / (local93[0] - local88[0]);
					local106 = 4096 - local102;
					local14[local31] = local88[1] * local106 + local102 * local93[1] >> 12;
				}
			}
		}
		return local14;
	}
}
