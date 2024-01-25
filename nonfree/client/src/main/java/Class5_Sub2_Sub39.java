import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class5_Sub2_Sub39 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wq", name = "G", descriptor = "I")
	private int anInt10393 = 4096;

	@OriginalMember(owner = "client!wq", name = "F", descriptor = "I")
	private int anInt10392 = 2048;

	@OriginalMember(owner = "client!wq", name = "M", descriptor = "I")
	private int anInt10399 = 0;

	@OriginalMember(owner = "client!wq", name = "I", descriptor = "I")
	private int anInt10395 = 2048;

	@OriginalMember(owner = "client!wq", name = "L", descriptor = "I")
	private int anInt10398 = 8192;

	@OriginalMember(owner = "client!wq", name = "O", descriptor = "I")
	private int anInt10401 = 0;

	@OriginalMember(owner = "client!wq", name = "S", descriptor = "I")
	private int anInt10403 = 12288;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIZ)Z")
	private boolean method8832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt10403 >> 12;
		@Pc(28) int local28 = Static46.anIntArray61[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt10403;
		@Pc(42) int local42 = (local35 << 12) / this.anInt10398;
		@Pc(49) int local49 = local42 * this.anInt10393 >> 12;
		return arg1 + arg0 < local49 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(27) int local27 = Static61.anIntArray80[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static314.anInt6320; local29++) {
				@Pc(37) int local37 = Static68.anIntArray94[local29] - 2048;
				@Pc(42) int local42 = this.anInt10395 + local37;
				@Pc(53) int local53 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(62) int local62 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(67) int local67 = this.anInt10399 + local27;
				@Pc(76) int local76 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(85) int local85 = local76 <= 2048 ? local76 : local76 - 4096;
				@Pc(90) int local90 = local37 + this.anInt10401;
				@Pc(99) int local99 = local90 >= -2048 ? local90 : local90 + 4096;
				@Pc(108) int local108 = local99 <= 2048 ? local99 : local99 - 4096;
				@Pc(113) int local113 = this.anInt10392 + local27;
				@Pc(122) int local122 = local113 < -2048 ? local113 + 4096 : local113;
				@Pc(131) int local131 = local122 <= 2048 ? local122 : local122 - 4096;
				local17[local29] = this.method8832(local85, local62) || this.method8833(local131, local108) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10395 = arg0.method8631();
		} else if (arg1 == 1) {
			this.anInt10399 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt10401 = arg0.method8631();
		} else if (arg1 == 3) {
			this.anInt10392 = arg0.method8631();
		} else if (arg1 == 4) {
			this.anInt10403 = arg0.method8631();
		} else if (arg1 == 5) {
			this.anInt10393 = arg0.method8631();
		} else if (arg1 == 6) {
			this.anInt10398 = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(IIZ)Z")
	private boolean method8833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt10403 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static46.anIntArray61[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt10403;
		@Pc(36) int local36 = (local29 << 12) / this.anInt10398;
		@Pc(43) int local43 = local36 * this.anInt10393 >> 12;
		return local43 > arg0 - arg1 && arg0 - arg1 > -local43;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		Static606.method8449();
	}
}
