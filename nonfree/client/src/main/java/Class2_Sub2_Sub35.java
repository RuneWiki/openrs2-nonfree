import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub2_Sub35 extends Class2_Sub2 {

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "[I")
	private int[] anIntArray472;

	@OriginalMember(owner = "client!uc", name = "V", descriptor = "[S")
	private final short[] aShortArray57 = new short[257];

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
	private int anInt4358 = 0;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)[I")
	private int[] method3351(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray471;
		} else if (this.anIntArrayArray29.length <= arg0) {
			return this.anIntArray472;
		} else {
			return this.anIntArrayArray29[arg0];
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	private void method3352() {
		@Pc(8) int[] local8 = this.anIntArrayArray29[0];
		@Pc(13) int[] local13 = this.anIntArrayArray29[1];
		@Pc(22) int[] local22 = this.anIntArrayArray29[this.anIntArrayArray29.length - 1];
		@Pc(31) int[] local31 = this.anIntArrayArray29[this.anIntArrayArray29.length - 2];
		this.anIntArray471 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - -local8[1] - local13[1] };
		this.anIntArray472 = new int[] { local31[0] + local31[0] - local22[0], -local22[1] - (-local31[1] - local31[1]) };
	}

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V")
	private void method3354() {
		@Pc(4) int local4 = this.anInt4358;
		@Pc(22) int local22;
		@Pc(20) int local20;
		@Pc(58) int[] local58;
		@Pc(51) int[] local51;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(84) int local84;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray29.length - 1 && local20 >= this.anIntArrayArray29[local22][0]; local22++) {
				}
				local51 = this.anIntArrayArray29[local22];
				local58 = this.anIntArrayArray29[local22 - 1];
				local67 = this.method3351(local22 - 2)[1];
				local71 = local58[1];
				local75 = local51[1];
				local84 = this.method3351(local22 + 1)[1];
				@Pc(102) int local102 = (local20 - local58[0] << 12) / (local51[0] - local58[0]);
				@Pc(112) int local112 = local71 + local84 - local67 - local75;
				@Pc(118) int local118 = local102 * local102 >> 12;
				@Pc(122) int local122 = local75 - local67;
				@Pc(130) int local130 = local67 - local71 - local112;
				@Pc(140) int local140 = local118 * (local102 * local112 >> 12) >> 12;
				@Pc(146) int local146 = local130 * local118 >> 12;
				@Pc(152) int local152 = local122 * local102 >> 12;
				@Pc(160) int local160 = local71 + local152 + local146 + local140;
				if (local160 <= -32768) {
					local160 = -32767;
				}
				if (local160 >= 32768) {
					local160 = 32767;
				}
				this.aShortArray57[local4] = (short) local160;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray29.length - 1 && this.anIntArrayArray29[local22][0] <= local20; local22++) {
				}
				local51 = this.anIntArrayArray29[local22];
				local58 = this.anIntArrayArray29[local22 - 1];
				local67 = (local20 - local58[0] << 12) / (local51[0] - local58[0]);
				local71 = 4096 - Static122.anIntArray389[local67 >> 5 & 0xFF] >> 1;
				local75 = 4096 - local71;
				local84 = local51[1] * local71 + local58[1] * local75 >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray57[local4] = (short) local84;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray29.length - 1 > local22 && local20 >= this.anIntArrayArray29[local22][0]; local22++) {
				}
				local51 = this.anIntArrayArray29[local22];
				local58 = this.anIntArrayArray29[local22 - 1];
				local67 = (local20 - local58[0] << 12) / (local51[0] - local58[0]);
				local71 = 4096 - local67;
				local75 = local67 * local51[1] + local71 * local58[1] >> 12;
				if (local75 <= -32768) {
					local75 = -32767;
				}
				if (local75 >= 32768) {
					local75 = 32767;
				}
				this.aShortArray57[local4] = (short) local75;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		if (this.anIntArrayArray29 == null) {
			this.anIntArrayArray29 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray29.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4358 == 2) {
			this.method3352();
		}
		Static53.method1249();
		this.method3354();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(21) int[] local21 = this.method3569(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static106.anInt3045; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray57[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt4358 = arg1.method218();
		this.anIntArrayArray29 = new int[arg1.method218()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray29.length; local17++) {
			this.anIntArrayArray29[local17][0] = arg1.method234();
			this.anIntArrayArray29[local17][1] = arg1.method234();
		}
	}
}
