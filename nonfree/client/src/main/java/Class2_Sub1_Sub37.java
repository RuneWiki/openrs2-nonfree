import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class2_Sub1_Sub37 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "[I")
	private int[] anIntArray513;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "[I")
	private int[] anIntArray514;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "[S")
	private short[] aShortArray84 = new short[257];

	@OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
	private int anInt5278 = 0;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5278 = arg0.method2146();
		this.anIntArrayArray36 = new int[arg0.method2146()][2];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArrayArray36.length; local23++) {
			this.anIntArrayArray36[local23][0] = arg0.method2130();
			this.anIntArrayArray36[local23][1] = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	private void method4265() {
		@Pc(16) int local16 = this.anInt5278;
		@Pc(38) int local38;
		@Pc(36) int local36;
		@Pc(76) int[] local76;
		@Pc(69) int[] local69;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(93) int local93;
		@Pc(102) int local102;
		if (local16 == 2) {
			for (local16 = 0; local16 < 257; local16++) {
				local36 = local16 << 4;
				for (local38 = 1; this.anIntArrayArray36.length - 1 > local38 && local36 >= this.anIntArrayArray36[local38][0]; local38++) {
				}
				local69 = this.anIntArrayArray36[local38];
				local76 = this.anIntArrayArray36[local38 - 1];
				local85 = this.method4269(local38 - 2)[1];
				local89 = local76[1];
				local93 = local69[1];
				local102 = this.method4269(local38 + 1)[1];
				@Pc(120) int local120 = (local36 - local76[0] << 12) / (local69[0] - local76[0]);
				@Pc(126) int local126 = local120 * local120 >> 12;
				@Pc(138) int local138 = local89 + local102 - local85 - local93;
				@Pc(143) int local143 = local93 - local85;
				@Pc(151) int local151 = local85 - local138 - local89;
				@Pc(161) int local161 = (local120 * local138 >> 12) * local126 >> 12;
				@Pc(167) int local167 = local126 * local151 >> 12;
				@Pc(173) int local173 = local143 * local120 >> 12;
				@Pc(181) int local181 = local173 + local161 + local167 + local89;
				if (local181 <= -32768) {
					local181 = -32767;
				}
				if (local181 >= 32768) {
					local181 = 32767;
				}
				this.aShortArray84[local16] = (short) local181;
			}
		} else if (local16 == 1) {
			for (local16 = 0; local16 < 257; local16++) {
				local36 = local16 << 4;
				for (local38 = 1; this.anIntArrayArray36.length - 1 > local38 && local36 >= this.anIntArrayArray36[local38][0]; local38++) {
				}
				local69 = this.anIntArrayArray36[local38];
				local76 = this.anIntArrayArray36[local38 - 1];
				local85 = (local36 - local76[0] << 12) / (local69[0] - local76[0]);
				local89 = 4096 - Static290.anIntArray541[local85 >> 5 & 0xFF] >> 1;
				local93 = 4096 - local89;
				local102 = local89 * local69[1] + local93 * local76[1] >> 12;
				if (local102 <= -32768) {
					local102 = -32767;
				}
				if (local102 >= 32768) {
					local102 = 32767;
				}
				this.aShortArray84[local16] = (short) local102;
			}
		} else {
			for (local16 = 0; local16 < 257; local16++) {
				local36 = local16 << 4;
				for (local38 = 1; local38 < this.anIntArrayArray36.length - 1 && this.anIntArrayArray36[local38][0] <= local36; local38++) {
				}
				local76 = this.anIntArrayArray36[local38 - 1];
				local69 = this.anIntArrayArray36[local38];
				local85 = (local36 - local76[0] << 12) / (local69[0] - local76[0]);
				local89 = 4096 - local85;
				local93 = local89 * local76[1] + local69[1] * local85 >> 12;
				if (local93 <= -32768) {
					local93 = -32767;
				}
				if (local93 >= 32768) {
					local93 = 32767;
				}
				this.aShortArray84[local16] = (short) local93;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(26) int[] local26 = this.method4601(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static281.anInt5558; local28++) {
				@Pc(37) int local37 = local26[local28] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local14[local28] = this.aShortArray84[local37];
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)V")
	private void method4267() {
		@Pc(15) int[] local15 = this.anIntArrayArray36[0];
		@Pc(20) int[] local20 = this.anIntArrayArray36[1];
		@Pc(29) int[] local29 = this.anIntArrayArray36[this.anIntArrayArray36.length - 2];
		@Pc(38) int[] local38 = this.anIntArrayArray36[this.anIntArrayArray36.length - 1];
		this.anIntArray514 = new int[] { local29[0] + local29[0] - local38[0], -local38[1] - -local29[1] + local29[1] };
		this.anIntArray513 = new int[] { local15[0] + local15[0] - local20[0], local15[1] - (local20[1] - local15[1]) };
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[I")
	private int[] method4269(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray513;
		} else if (this.anIntArrayArray36.length > arg0) {
			return this.anIntArrayArray36[arg0];
		} else {
			return this.anIntArray514;
		}
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		if (this.anIntArrayArray36 == null) {
			this.anIntArrayArray36 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray36.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5278 == 2) {
			this.method4267();
		}
		Static66.method1205();
		this.method4265();
	}
}
