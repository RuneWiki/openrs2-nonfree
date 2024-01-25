import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
	private int anInt4623 = 12288;

	@OriginalMember(owner = "client!jw", name = "I", descriptor = "I")
	private int anInt4624 = 4096;

	@OriginalMember(owner = "client!jw", name = "Q", descriptor = "I")
	private int anInt4631 = 2048;

	@OriginalMember(owner = "client!jw", name = "C", descriptor = "I")
	private int anInt4620 = 0;

	@OriginalMember(owner = "client!jw", name = "M", descriptor = "I")
	private int anInt4628 = 0;

	@OriginalMember(owner = "client!jw", name = "S", descriptor = "I")
	private int anInt4633 = 2048;

	@OriginalMember(owner = "client!jw", name = "R", descriptor = "I")
	private int anInt4632 = 8192;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4631 = arg0.method5771();
		} else if (arg1 == 1) {
			this.anInt4628 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt4620 = arg0.method5771();
		} else if (arg1 == 3) {
			this.anInt4633 = arg0.method5771();
		} else if (arg1 == 4) {
			this.anInt4623 = arg0.method5771();
		} else if (arg1 == 5) {
			this.anInt4624 = arg0.method5771();
		} else if (arg1 == 6) {
			this.anInt4632 = arg0.method5771();
		}
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(III)Z")
	private boolean method3750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = this.anInt4623 * (arg1 - arg0) >> 12;
		@Pc(31) int local31 = Static359.anIntArray435[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt4623;
		@Pc(45) int local45 = (local38 << 12) / this.anInt4632;
		@Pc(52) int local52 = local45 * this.anInt4624 >> 12;
		return arg0 + arg1 < local52 && -local52 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(29) int local29 = Static445.anIntArray590[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static279.anInt4906; local31++) {
				@Pc(39) int local39 = Static557.anIntArray708[local31] - 2048;
				@Pc(44) int local44 = this.anInt4631 + local39;
				@Pc(53) int local53 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(64) int local64 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(69) int local69 = this.anInt4628 + local29;
				@Pc(80) int local80 = local69 < -2048 ? local69 + 4096 : local69;
				@Pc(91) int local91 = local80 <= 2048 ? local80 : local80 - 4096;
				@Pc(96) int local96 = this.anInt4620 + local39;
				@Pc(105) int local105 = local96 < -2048 ? local96 + 4096 : local96;
				@Pc(116) int local116 = local105 <= 2048 ? local105 : local105 - 4096;
				@Pc(121) int local121 = local29 + this.anInt4633;
				@Pc(130) int local130 = local121 < -2048 ? local121 + 4096 : local121;
				@Pc(141) int local141 = local130 > 2048 ? local130 - 4096 : local130;
				local11[local31] = this.method3750(local64, local91) || this.method3753(local141, local116) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		Static499.method3357();
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBI)Z")
	private boolean method3753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = (arg0 + arg1) * this.anInt4623 >> 12;
		@Pc(31) int local31 = Static359.anIntArray435[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt4623;
		@Pc(45) int local45 = (local38 << 12) / this.anInt4632;
		@Pc(52) int local52 = this.anInt4624 * local45 >> 12;
		return local52 > arg0 - arg1 && -local52 < arg0 - arg1;
	}
}
