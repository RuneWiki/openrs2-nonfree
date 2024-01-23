import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class1_Sub2_Sub37 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
	private int anInt4473 = 8192;

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
	private int anInt4476 = 0;

	@OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
	private int anInt4483 = 4096;

	@OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
	private int anInt4472 = 2048;

	@OriginalMember(owner = "client!vc", name = "hb", descriptor = "I")
	private int anInt4482 = 12288;

	@OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
	private int anInt4486 = 2048;

	@OriginalMember(owner = "client!vc", name = "ob", descriptor = "I")
	private int anInt4488 = 0;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZII)Z")
	private boolean method3282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = (arg1 - arg0) * this.anInt4482 >> 12;
		@Pc(25) int local25 = Static55.anIntArray169[local9 * 255 >> 12 & 0xFF];
		@Pc(32) int local32 = (local25 << 12) / this.anInt4482;
		@Pc(43) int local43 = (local32 << 12) / this.anInt4473;
		@Pc(50) int local50 = local43 * this.anInt4483 >> 12;
		return arg1 + arg0 < local50 && -local50 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(21) int local21 = Static128.anIntArray362[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static105.anInt2391; local23++) {
				@Pc(31) int local31 = Static63.anIntArray182[local23] - 2048;
				@Pc(36) int local36 = this.anInt4476 + local31;
				@Pc(41) int local41 = this.anInt4488 + local21;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(56) int local56 = local31 + this.anInt4486;
				@Pc(65) int local65 = local36 < -2048 ? local36 + 4096 : local36;
				@Pc(74) int local74 = local50 <= 2048 ? local50 : local50 - 4096;
				@Pc(83) int local83 = local65 > 2048 ? local65 - 4096 : local65;
				@Pc(89) int local89 = local21 + this.anInt4472;
				@Pc(100) int local100 = local89 >= -2048 ? local89 : local89 + 4096;
				@Pc(109) int local109 = local56 >= -2048 ? local56 : local56 + 4096;
				@Pc(120) int local120 = local100 > 2048 ? local100 - 4096 : local100;
				@Pc(129) int local129 = local109 <= 2048 ? local109 : local109 - 4096;
				local7[local23] = this.method3282(local129, local74) || this.method3286(local120, local83) ? 4096 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(III)Z")
	private boolean method3286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = (arg1 + arg0) * this.anInt4482 >> 12;
		@Pc(18) int local18 = Static55.anIntArray169[local8 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local18 << 12) / this.anInt4482;
		@Pc(36) int local36 = (local29 << 12) / this.anInt4473;
		@Pc(43) int local43 = this.anInt4483 * local36 >> 12;
		return local43 > arg0 - arg1 && -local43 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		Static189.method2977();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4486 = arg0.method946();
		} else if (arg1 == 1) {
			this.anInt4488 = arg0.method946();
		} else if (arg1 == 2) {
			this.anInt4476 = arg0.method946();
		} else if (arg1 == 3) {
			this.anInt4472 = arg0.method946();
		} else if (arg1 == 4) {
			this.anInt4482 = arg0.method946();
		} else if (arg1 == 5) {
			this.anInt4483 = arg0.method946();
		} else if (arg1 == 6) {
			this.anInt4473 = arg0.method946();
		}
	}
}
