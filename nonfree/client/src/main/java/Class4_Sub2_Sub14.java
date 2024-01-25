import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class4_Sub2_Sub14 extends Class4_Sub2 {

	@OriginalMember(owner = "client!jk", name = "K", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!jk", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!jk", name = "N", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
	private int anInt4529 = 0;

	@OriginalMember(owner = "client!jk", name = "E", descriptor = "[S")
	private final short[] aShortArray61 = new short[257];

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
	private void method4090() {
		@Pc(8) int local8 = this.anInt4529;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray24.length - 1 && this.anIntArrayArray24[local28][0] <= local26; local28++) {
				}
				local63 = this.anIntArrayArray24[local28 - 1];
				local68 = this.anIntArrayArray24[local28];
				local77 = this.method4094(local28 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method4094(local28 + 1)[1];
				@Pc(111) int local111 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(117) int local117 = local111 * local111 >> 12;
				@Pc(126) int local126 = local81 + local94 - local77 - local85;
				@Pc(134) int local134 = local77 - local81 - local126;
				@Pc(139) int local139 = local85 - local77;
				@Pc(151) int local151 = local117 * (local126 * local111 >> 12) >> 12;
				@Pc(157) int local157 = local117 * local134 >> 12;
				@Pc(163) int local163 = local139 * local111 >> 12;
				@Pc(171) int local171 = local151 + local157 + local163 + local81;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray61[local8] = (short) local171;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray24.length - 1 > local28 && this.anIntArrayArray24[local28][0] <= local26; local28++) {
				}
				local63 = this.anIntArrayArray24[local28 - 1];
				local68 = this.anIntArrayArray24[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static190.anIntArray170[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local68[1] * local81 + local63[1] * local85 >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray61[local8] = (short) local94;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray24.length - 1 > local28 && local26 >= this.anIntArrayArray24[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray24[local28 - 1];
				local68 = this.anIntArrayArray24[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local68[1] * local77 + local63[1] * local81 >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray61[local8] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "(I)V")
	private void method4093() {
		@Pc(13) int[] local13 = this.anIntArrayArray24[0];
		@Pc(18) int[] local18 = this.anIntArrayArray24[1];
		@Pc(27) int[] local27 = this.anIntArrayArray24[this.anIntArrayArray24.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray24[this.anIntArrayArray24.length - 1];
		this.anIntArray349 = new int[] { local27[0] + local27[0] - local36[0], local27[1] - (local36[1] + -local27[1]) };
		this.anIntArray348 = new int[] { local13[0] + local13[0] - local18[0], local13[1] - (local18[1] + -local13[1]) };
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)[I")
	private int[] method4094(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray348;
		} else if (this.anIntArrayArray24.length <= arg0) {
			return this.anIntArray349;
		} else {
			return this.anIntArrayArray24[arg0];
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt4529 = arg1.method8865();
		this.anIntArrayArray24 = new int[arg1.method8865()][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray24.length; local22++) {
			this.anIntArrayArray24[local22][0] = arg1.method8859();
			this.anIntArrayArray24[local22][1] = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		if (this.anIntArrayArray24 == null) {
			this.anIntArrayArray24 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray24.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4529 == 2) {
			this.method4093();
		}
		Static282.method4074();
		this.method4090();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(25) int[] local25 = this.method8768(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static269.anInt4330; local27++) {
				@Pc(35) int local35 = local25[local27] >> 4;
				if (local35 < 0) {
					local35 = 0;
				}
				if (local35 > 256) {
					local35 = 256;
				}
				local11[local27] = this.aShortArray61[local35];
			}
		}
		return local11;
	}
}
