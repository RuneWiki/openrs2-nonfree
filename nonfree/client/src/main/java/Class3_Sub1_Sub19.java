import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class3_Sub1_Sub19 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lda", name = "I", descriptor = "I")
	private int anInt5363 = 4096;

	@OriginalMember(owner = "client!lda", name = "K", descriptor = "I")
	private int anInt5365 = 0;

	@OriginalMember(owner = "client!lda", name = "L", descriptor = "I")
	private int anInt5366 = 2048;

	@OriginalMember(owner = "client!lda", name = "S", descriptor = "I")
	private int anInt5373 = 12288;

	@OriginalMember(owner = "client!lda", name = "U", descriptor = "I")
	private int anInt5375 = 0;

	@OriginalMember(owner = "client!lda", name = "P", descriptor = "I")
	private int anInt5370 = 2048;

	@OriginalMember(owner = "client!lda", name = "W", descriptor = "I")
	private int anInt5377 = 8192;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5366 = arg0.method3109();
		} else if (arg1 == 1) {
			this.anInt5375 = arg0.method3109();
		} else if (arg1 == 2) {
			this.anInt5365 = arg0.method3109();
		} else if (arg1 == 3) {
			this.anInt5370 = arg0.method3109();
		} else if (arg1 == 4) {
			this.anInt5373 = arg0.method3109();
		} else if (arg1 == 5) {
			this.anInt5363 = arg0.method3109();
		} else if (arg1 == 6) {
			this.anInt5377 = arg0.method3109();
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		Static79.method1728();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(28) int local28 = Static9.anIntArray15[arg0] - 2048;
			for (@Pc(30) int local30 = 0; local30 < Static206.anInt4182; local30++) {
				@Pc(38) int local38 = Static329.anIntArray456[local30] - 2048;
				@Pc(43) int local43 = this.anInt5366 + local38;
				@Pc(52) int local52 = local43 < -2048 ? local43 + 4096 : local43;
				@Pc(61) int local61 = local52 > 2048 ? local52 - 4096 : local52;
				@Pc(66) int local66 = this.anInt5375 + local28;
				@Pc(75) int local75 = local66 >= -2048 ? local66 : local66 + 4096;
				@Pc(86) int local86 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(91) int local91 = this.anInt5365 + local38;
				@Pc(100) int local100 = local91 < -2048 ? local91 + 4096 : local91;
				@Pc(109) int local109 = local100 <= 2048 ? local100 : local100 - 4096;
				@Pc(114) int local114 = local28 + this.anInt5370;
				@Pc(123) int local123 = local114 >= -2048 ? local114 : local114 + 4096;
				@Pc(132) int local132 = local123 > 2048 ? local123 - 4096 : local123;
				local18[local30] = this.method4708(local61, local86) || this.method4707(local109, local132) ? 4096 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(III)Z")
	private boolean method4707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt5373 >> 12;
		@Pc(22) int local22 = Static548.anIntArray648[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt5373;
		@Pc(36) int local36 = (local29 << 12) / this.anInt5377;
		@Pc(48) int local48 = this.anInt5363 * local36 >> 12;
		return arg1 - arg0 < local48 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "(III)Z")
	private boolean method4708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt5373 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static548.anIntArray648[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5373;
		@Pc(37) int local37 = (local30 << 12) / this.anInt5377;
		@Pc(49) int local49 = this.anInt5363 * local37 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg0 + arg1;
	}
}
