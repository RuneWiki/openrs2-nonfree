import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class10_Sub2_Sub19 extends Class10_Sub2 {

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
	private int anInt3611 = 0;

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "[S")
	private final short[] aShortArray51 = new short[257];

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		if (this.anIntArrayArray31 == null) {
			this.anIntArrayArray31 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray31.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3611 == 2) {
			this.method2917();
		}
		Static44.method657();
		this.method2918();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3611 = arg1.method2502();
		this.anIntArrayArray31 = new int[arg1.method2502()][2];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray31.length; local32++) {
			this.anIntArrayArray31[local32][0] = arg1.method2485();
			this.anIntArrayArray31[local32][1] = arg1.method2485();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(21) int[] local21 = this.method6041(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static121.anInt2458; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray51[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
	private void method2917() {
		@Pc(8) int[] local8 = this.anIntArrayArray31[0];
		@Pc(13) int[] local13 = this.anIntArrayArray31[1];
		@Pc(22) int[] local22 = this.anIntArrayArray31[this.anIntArrayArray31.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray31[this.anIntArrayArray31.length - 1];
		this.anIntArray337 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - local31[1] + local22[1] };
		this.anIntArray338 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - (-local8[1] - local8[1]) };
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
	private void method2918() {
		@Pc(4) int local4 = this.anInt3611;
		@Pc(22) int local22;
		@Pc(20) int local20;
		@Pc(53) int[] local53;
		@Pc(58) int[] local58;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(84) int local84;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray31.length - 1 && this.anIntArrayArray31[local22][0] <= local20; local22++) {
				}
				local53 = this.anIntArrayArray31[local22 - 1];
				local58 = this.anIntArrayArray31[local22];
				local67 = this.method2919(local22 - 2)[1];
				local71 = local53[1];
				local75 = local58[1];
				local84 = this.method2919(local22 + 1)[1];
				@Pc(102) int local102 = (local20 - local53[0] << 12) / (local58[0] - local53[0]);
				@Pc(108) int local108 = local102 * local102 >> 12;
				@Pc(118) int local118 = local84 + local71 - local67 - local75;
				@Pc(125) int local125 = local67 - local71 - local118;
				@Pc(130) int local130 = local75 - local67;
				@Pc(142) int local142 = (local102 * local118 >> 12) * local108 >> 12;
				@Pc(148) int local148 = local125 * local108 >> 12;
				@Pc(154) int local154 = local130 * local102 >> 12;
				@Pc(162) int local162 = local154 + local148 + local142 + local71;
				if (local162 <= -32768) {
					local162 = -32767;
				}
				if (local162 >= 32768) {
					local162 = 32767;
				}
				this.aShortArray51[local4] = (short) local162;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray31.length - 1 && this.anIntArrayArray31[local22][0] <= local20; local22++) {
				}
				local53 = this.anIntArrayArray31[local22 - 1];
				local58 = this.anIntArrayArray31[local22];
				local67 = (local20 - local53[0] << 12) / (local58[0] - local53[0]);
				local71 = 4096 - Static132.anIntArray275[local67 >> 5 & 0xFF] >> 1;
				local75 = 4096 - local71;
				local84 = local53[1] * local75 + local58[1] * local71 >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray51[local4] = (short) local84;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray31.length - 1 > local22 && this.anIntArrayArray31[local22][0] <= local20; local22++) {
				}
				local53 = this.anIntArrayArray31[local22 - 1];
				local58 = this.anIntArrayArray31[local22];
				local67 = (local20 - local53[0] << 12) / (local58[0] - local53[0]);
				local71 = 4096 - local67;
				local75 = local71 * local53[1] + local67 * local58[1] >> 12;
				if (local75 <= -32768) {
					local75 = -32767;
				}
				if (local75 >= 32768) {
					local75 = 32767;
				}
				this.aShortArray51[local4] = (short) local75;
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)[I")
	private int[] method2919(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray338;
		} else if (arg0 >= this.anIntArrayArray31.length) {
			return this.anIntArray337;
		} else {
			return this.anIntArrayArray31[arg0];
		}
	}
}
