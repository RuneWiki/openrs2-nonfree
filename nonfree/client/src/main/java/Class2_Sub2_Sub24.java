import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!no", name = "J", descriptor = "I")
	private int anInt5090 = 0;

	@OriginalMember(owner = "client!no", name = "I", descriptor = "I")
	private int anInt5089 = 0;

	@OriginalMember(owner = "client!no", name = "R", descriptor = "I")
	private int anInt5097 = 8192;

	@OriginalMember(owner = "client!no", name = "U", descriptor = "I")
	private int anInt5100 = 12288;

	@OriginalMember(owner = "client!no", name = "Q", descriptor = "I")
	private int anInt5096 = 2048;

	@OriginalMember(owner = "client!no", name = "W", descriptor = "I")
	private int anInt5102 = 4096;

	@OriginalMember(owner = "client!no", name = "V", descriptor = "I")
	private int anInt5101 = 2048;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(III)Z")
	private boolean method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt5100 >> 12;
		@Pc(22) int local22 = Static314.anIntArray477[local12 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local22 << 12) / this.anInt5100;
		@Pc(45) int local45 = (local38 << 12) / this.anInt5097;
		@Pc(52) int local52 = this.anInt5102 * local45 >> 12;
		return local52 > arg0 - arg1 && -local52 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		Static193.method2769();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZII)Z")
	private boolean method4018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt5100 * (arg0 - arg1) >> 12;
		@Pc(29) int local29 = Static314.anIntArray477[local13 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt5100;
		@Pc(43) int local43 = (local36 << 12) / this.anInt5097;
		@Pc(50) int local50 = local43 * this.anInt5102 >> 12;
		return local50 > arg0 + arg1 && arg0 + arg1 > -local50;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(28) int local28 = Static168.anIntArray524[arg0] - 2048;
			for (@Pc(30) int local30 = 0; local30 < Static398.anInt6955; local30++) {
				@Pc(38) int local38 = Static427.anIntArray587[local30] - 2048;
				@Pc(43) int local43 = this.anInt5096 + local38;
				@Pc(54) int local54 = local43 >= -2048 ? local43 : local43 + 4096;
				@Pc(65) int local65 = local54 > 2048 ? local54 - 4096 : local54;
				@Pc(70) int local70 = this.anInt5090 + local28;
				@Pc(81) int local81 = local70 < -2048 ? local70 + 4096 : local70;
				@Pc(92) int local92 = local81 <= 2048 ? local81 : local81 - 4096;
				@Pc(97) int local97 = local38 + this.anInt5089;
				@Pc(108) int local108 = local97 < -2048 ? local97 + 4096 : local97;
				@Pc(117) int local117 = local108 > 2048 ? local108 - 4096 : local108;
				@Pc(122) int local122 = this.anInt5101 + local28;
				@Pc(131) int local131 = local122 >= -2048 ? local122 : local122 + 4096;
				@Pc(142) int local142 = local131 <= 2048 ? local131 : local131 - 4096;
				local18[local30] = this.method4018(local92, local65) || this.method4013(local142, local117) ? 4096 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5096 = arg0.method6148();
		} else if (arg1 == 1) {
			this.anInt5090 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt5089 = arg0.method6148();
		} else if (arg1 == 3) {
			this.anInt5101 = arg0.method6148();
		} else if (arg1 == 4) {
			this.anInt5100 = arg0.method6148();
		} else if (arg1 == 5) {
			this.anInt5102 = arg0.method6148();
		} else if (arg1 == 6) {
			this.anInt5097 = arg0.method6148();
		}
	}
}
