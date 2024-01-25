import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class5_Sub2_Sub32 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!ta", name = "T", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!ta", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!ta", name = "S", descriptor = "[S")
	private final short[] aShortArray91 = new short[257];

	@OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
	private int anInt5754 = 0;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		if (this.anIntArrayArray47 == null) {
			this.anIntArrayArray47 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray47.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5754 == 2) {
			this.method5083();
		}
		Static10.method307();
		this.method5081();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5754 = arg0.method1832();
		this.anIntArrayArray47 = new int[arg0.method1832()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray47.length; local29++) {
			this.anIntArrayArray47[local29][0] = arg0.method1845();
			this.anIntArrayArray47[local29][1] = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(26) int[] local26 = this.method5808(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static15.anInt493; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray91[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)V")
	private void method5081() {
		@Pc(9) int local9 = this.anInt5754;
		@Pc(27) int local27;
		@Pc(25) int local25;
		@Pc(58) int[] local58;
		@Pc(63) int[] local63;
		@Pc(72) int local72;
		@Pc(76) int local76;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (local9 == 2) {
			for (local9 = 0; local9 < 257; local9++) {
				local25 = local9 << 4;
				for (local27 = 1; local27 < this.anIntArrayArray47.length - 1 && local25 >= this.anIntArrayArray47[local27][0]; local27++) {
				}
				local58 = this.anIntArrayArray47[local27 - 1];
				local63 = this.anIntArrayArray47[local27];
				local72 = this.method5084(local27 - 2)[1];
				local76 = local58[1];
				local80 = local63[1];
				local89 = this.method5084(local27 + 1)[1];
				@Pc(107) int local107 = (local25 - local58[0] << 12) / (local63[0] - local58[0]);
				@Pc(113) int local113 = local107 * local107 >> 12;
				@Pc(122) int local122 = local89 + local76 - local80 - local72;
				@Pc(129) int local129 = local72 - local76 - local122;
				@Pc(134) int local134 = local80 - local72;
				@Pc(146) int local146 = (local122 * local107 >> 12) * local113 >> 12;
				@Pc(152) int local152 = local129 * local113 >> 12;
				@Pc(158) int local158 = local134 * local107 >> 12;
				@Pc(166) int local166 = local152 + local146 + local158 + local76;
				if (local166 <= -32768) {
					local166 = -32767;
				}
				if (local166 >= 32768) {
					local166 = 32767;
				}
				this.aShortArray91[local9] = (short) local166;
			}
		} else if (local9 == 1) {
			for (local9 = 0; local9 < 257; local9++) {
				local25 = local9 << 4;
				for (local27 = 1; local27 < this.anIntArrayArray47.length - 1 && local25 >= this.anIntArrayArray47[local27][0]; local27++) {
				}
				local58 = this.anIntArrayArray47[local27 - 1];
				local63 = this.anIntArrayArray47[local27];
				local72 = (local25 - local58[0] << 12) / (local63[0] - local58[0]);
				local76 = 4096 - Static73.anIntArray94[local72 >> 5 & 0xFF] >> 1;
				local80 = 4096 - local76;
				local89 = local58[1] * local80 + local76 * local63[1] >> 12;
				if (local89 <= -32768) {
					local89 = -32767;
				}
				if (local89 >= 32768) {
					local89 = 32767;
				}
				this.aShortArray91[local9] = (short) local89;
			}
		} else {
			for (local9 = 0; local9 < 257; local9++) {
				local25 = local9 << 4;
				for (local27 = 1; local27 < this.anIntArrayArray47.length - 1 && this.anIntArrayArray47[local27][0] <= local25; local27++) {
				}
				local58 = this.anIntArrayArray47[local27 - 1];
				local63 = this.anIntArrayArray47[local27];
				local72 = (local25 - local58[0] << 12) / (local63[0] - local58[0]);
				local76 = 4096 - local72;
				local80 = local72 * local63[1] + local58[1] * local76 >> 12;
				if (local80 <= -32768) {
					local80 = -32767;
				}
				if (local80 >= 32768) {
					local80 = 32767;
				}
				this.aShortArray91[local9] = (short) local80;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V")
	private void method5083() {
		@Pc(8) int[] local8 = this.anIntArrayArray47[0];
		@Pc(13) int[] local13 = this.anIntArrayArray47[1];
		@Pc(22) int[] local22 = this.anIntArrayArray47[this.anIntArrayArray47.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray47[this.anIntArrayArray47.length - 1];
		this.anIntArray443 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + (local8[1] - local13[1]) };
		this.anIntArray442 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + -local31[1] + local22[1] };
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
	private int[] method5084(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray443;
		} else if (this.anIntArrayArray47.length <= arg0) {
			return this.anIntArray442;
		} else {
			return this.anIntArrayArray47[arg0];
		}
	}
}
