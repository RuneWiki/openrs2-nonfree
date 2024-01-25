import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class2_Sub6_Sub25 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ns", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!ns", name = "S", descriptor = "[I")
	private int[] anIntArray546;

	@OriginalMember(owner = "client!ns", name = "T", descriptor = "[I")
	private int[] anIntArray547;

	@OriginalMember(owner = "client!ns", name = "W", descriptor = "I")
	private int anInt4440 = 0;

	@OriginalMember(owner = "client!ns", name = "Y", descriptor = "[S")
	private final short[] aShortArray88 = new short[257];

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		if (this.anIntArrayArray32 == null) {
			this.anIntArrayArray32 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray32.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4440 == 2) {
			this.method3926();
		}
		Static155.method2588();
		this.method3928();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(26) int[] local26 = this.method5635(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static151.anInt2711; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray88[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[I")
	private int[] method3924(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray546;
		} else if (arg0 >= this.anIntArrayArray32.length) {
			return this.anIntArray547;
		} else {
			return this.anIntArrayArray32[arg0];
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt4440 = arg0.method4240();
		this.anIntArrayArray32 = new int[arg0.method4240()][2];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray32.length; local30++) {
			this.anIntArrayArray32[local30][0] = arg0.method4245();
			this.anIntArrayArray32[local30][1] = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(Z)V")
	private void method3926() {
		@Pc(14) int[] local14 = this.anIntArrayArray32[0];
		@Pc(19) int[] local19 = this.anIntArrayArray32[1];
		@Pc(28) int[] local28 = this.anIntArrayArray32[this.anIntArrayArray32.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray32[this.anIntArrayArray32.length - 1];
		this.anIntArray546 = new int[] { local14[0] + local14[0] - local19[0], local14[1] - -local14[1] - local19[1] };
		this.anIntArray547 = new int[] { local28[0] + local28[0] - local37[0], -local37[1] + local28[1] + local28[1] };
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	private void method3928() {
		@Pc(9) int local9 = this.anInt4440;
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
				for (local27 = 1; this.anIntArrayArray32.length - 1 > local27 && local25 >= this.anIntArrayArray32[local27][0]; local27++) {
				}
				local58 = this.anIntArrayArray32[local27 - 1];
				local63 = this.anIntArrayArray32[local27];
				local72 = this.method3924(local27 - 2)[1];
				local76 = local58[1];
				local80 = local63[1];
				local89 = this.method3924(local27 + 1)[1];
				@Pc(107) int local107 = (local25 - local58[0] << 12) / (local63[0] - local58[0]);
				@Pc(113) int local113 = local107 * local107 >> 12;
				@Pc(123) int local123 = local76 + local89 - local72 - local80;
				@Pc(130) int local130 = local72 - local76 - local123;
				@Pc(135) int local135 = local80 - local72;
				@Pc(147) int local147 = (local107 * local123 >> 12) * local113 >> 12;
				@Pc(153) int local153 = local130 * local113 >> 12;
				@Pc(159) int local159 = local135 * local107 >> 12;
				@Pc(168) int local168 = local76 + local159 + local147 + local153;
				if (local168 <= -32768) {
					local168 = -32767;
				}
				if (local168 >= 32768) {
					local168 = 32767;
				}
				this.aShortArray88[local9] = (short) local168;
			}
		} else if (local9 == 1) {
			for (local9 = 0; local9 < 257; local9++) {
				local25 = local9 << 4;
				for (local27 = 1; local27 < this.anIntArrayArray32.length - 1 && local25 >= this.anIntArrayArray32[local27][0]; local27++) {
				}
				local58 = this.anIntArrayArray32[local27 - 1];
				local63 = this.anIntArrayArray32[local27];
				local72 = (local25 - local58[0] << 12) / (local63[0] - local58[0]);
				local76 = 4096 - Static60.anIntArray160[local72 >> 5 & 0xFF] >> 1;
				local80 = 4096 - local76;
				local89 = local63[1] * local76 + local80 * local58[1] >> 12;
				if (local89 <= -32768) {
					local89 = -32767;
				}
				if (local89 >= 32768) {
					local89 = 32767;
				}
				this.aShortArray88[local9] = (short) local89;
			}
		} else {
			for (local9 = 0; local9 < 257; local9++) {
				local25 = local9 << 4;
				for (local27 = 1; this.anIntArrayArray32.length - 1 > local27 && local25 >= this.anIntArrayArray32[local27][0]; local27++) {
				}
				local58 = this.anIntArrayArray32[local27 - 1];
				local63 = this.anIntArrayArray32[local27];
				local72 = (local25 - local58[0] << 12) / (local63[0] - local58[0]);
				local76 = 4096 - local72;
				local80 = local76 * local58[1] + local63[1] * local72 >> 12;
				if (local80 <= -32768) {
					local80 = -32767;
				}
				if (local80 >= 32768) {
					local80 = 32767;
				}
				this.aShortArray88[local9] = (short) local80;
			}
		}
	}
}
