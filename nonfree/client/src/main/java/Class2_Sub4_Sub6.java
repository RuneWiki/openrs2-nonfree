import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class2_Sub4_Sub6 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
	private int anInt2253 = 0;

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "[S")
	private final short[] aShortArray68 = new short[257];

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(21) int[] local21 = this.method7568(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static143.anInt7434; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray68[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
	private void method1907() {
		@Pc(8) int[] local8 = this.anIntArrayArray28[0];
		@Pc(13) int[] local13 = this.anIntArrayArray28[1];
		@Pc(22) int[] local22 = this.anIntArrayArray28[this.anIntArrayArray28.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray28[this.anIntArrayArray28.length - 1];
		this.anIntArray188 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - -local8[1] + -local13[1] };
		this.anIntArray186 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + (local22[1] - local31[1]) };
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
	private void method1908() {
		@Pc(4) int local4 = this.anInt2253;
		@Pc(22) int local22;
		@Pc(20) int local20;
		@Pc(49) int[] local49;
		@Pc(54) int[] local54;
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(80) int local80;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray28.length - 1 && this.anIntArrayArray28[local22][0] <= local20; local22++) {
				}
				local49 = this.anIntArrayArray28[local22 - 1];
				local54 = this.anIntArrayArray28[local22];
				local63 = this.method1909(local22 - 2)[1];
				local67 = local49[1];
				local71 = local54[1];
				local80 = this.method1909(local22 + 1)[1];
				@Pc(97) int local97 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				@Pc(103) int local103 = local97 * local97 >> 12;
				@Pc(113) int local113 = local80 + local67 - local71 - local63;
				@Pc(120) int local120 = local63 - local67 - local113;
				@Pc(125) int local125 = local71 - local63;
				@Pc(137) int local137 = local103 * (local113 * local97 >> 12) >> 12;
				@Pc(143) int local143 = local120 * local103 >> 12;
				@Pc(149) int local149 = local125 * local97 >> 12;
				@Pc(158) int local158 = local67 + local137 + local143 + local149;
				if (local158 <= -32768) {
					local158 = -32767;
				}
				if (local158 >= 32768) {
					local158 = 32767;
				}
				this.aShortArray68[local4] = (short) local158;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray28.length - 1 && this.anIntArrayArray28[local22][0] <= local20; local22++) {
				}
				local49 = this.anIntArrayArray28[local22 - 1];
				local54 = this.anIntArrayArray28[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - Static135.anIntArray552[local63 >> 5 & 0xFF] >> 1;
				local71 = 4096 - local67;
				local80 = local71 * local49[1] + local54[1] * local67 >> 12;
				if (local80 <= -32768) {
					local80 = -32767;
				}
				if (local80 >= 32768) {
					local80 = 32767;
				}
				this.aShortArray68[local4] = (short) local80;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray28.length - 1 && this.anIntArrayArray28[local22][0] <= local20; local22++) {
				}
				local49 = this.anIntArrayArray28[local22 - 1];
				local54 = this.anIntArrayArray28[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - local63;
				local71 = local49[1] * local67 + local63 * local54[1] >> 12;
				if (local71 <= -32768) {
					local71 = -32767;
				}
				if (local71 >= 32768) {
					local71 = 32767;
				}
				this.aShortArray68[local4] = (short) local71;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)[I")
	private int[] method1909(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray188;
		} else if (this.anIntArrayArray28.length <= arg0) {
			return this.anIntArray186;
		} else {
			return this.anIntArrayArray28[arg0];
		}
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		if (this.anIntArrayArray28 == null) {
			this.anIntArrayArray28 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray28.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2253 == 2) {
			this.method1907();
		}
		Static59.method1017();
		this.method1908();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2253 = arg1.method4464();
		this.anIntArrayArray28 = new int[arg1.method4464()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray28.length; local28++) {
			this.anIntArrayArray28[local28][0] = arg1.method4518();
			this.anIntArrayArray28[local28][1] = arg1.method4518();
		}
	}
}
