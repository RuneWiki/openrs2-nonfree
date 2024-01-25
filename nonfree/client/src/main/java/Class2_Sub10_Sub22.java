import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class2_Sub10_Sub22 extends Class2_Sub10 {

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
	private int anInt6868 = 8192;

	@OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
	private int anInt6871 = 2048;

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
	private int anInt6875 = 4096;

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
	private int anInt6870 = 2048;

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
	private int anInt6874 = 0;

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
	private int anInt6872 = 0;

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
	private int anInt6873 = 12288;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZII)Z")
	private boolean method5766(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = (arg1 + arg0) * this.anInt6873 >> 12;
		@Pc(31) int local31 = Static68.anIntArray145[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt6873;
		@Pc(45) int local45 = (local38 << 12) / this.anInt6868;
		@Pc(52) int local52 = this.anInt6875 * local45 >> 12;
		return local52 > arg0 - arg1 && -local52 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)Z")
	private boolean method5767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt6873 >> 12;
		@Pc(23) int local23 = Static68.anIntArray145[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt6873;
		@Pc(37) int local37 = (local30 << 12) / this.anInt6868;
		@Pc(44) int local44 = this.anInt6875 * local37 >> 12;
		return local44 > arg1 + arg0 && arg1 + arg0 > -local44;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		Static385.method5800();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(21) int local21 = Static353.anIntArray424[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static93.anInt1862; local23++) {
				@Pc(31) int local31 = Static561.anIntArray649[local23] - 2048;
				@Pc(36) int local36 = this.anInt6870 + local31;
				@Pc(47) int local47 = local36 < -2048 ? local36 + 4096 : local36;
				@Pc(56) int local56 = local47 > 2048 ? local47 - 4096 : local47;
				@Pc(62) int local62 = local21 + this.anInt6872;
				@Pc(71) int local71 = local62 >= -2048 ? local62 : local62 + 4096;
				@Pc(80) int local80 = local71 <= 2048 ? local71 : local71 - 4096;
				@Pc(85) int local85 = local31 + this.anInt6874;
				@Pc(96) int local96 = local85 < -2048 ? local85 + 4096 : local85;
				@Pc(105) int local105 = local96 > 2048 ? local96 - 4096 : local96;
				@Pc(110) int local110 = this.anInt6871 + local21;
				@Pc(119) int local119 = local110 >= -2048 ? local110 : local110 + 4096;
				@Pc(128) int local128 = local119 <= 2048 ? local119 : local119 - 4096;
				local11[local23] = this.method5767(local80, local56) || this.method5766(local128, local105) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6870 = arg0.method6884();
		} else if (arg1 == 1) {
			this.anInt6872 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt6874 = arg0.method6884();
		} else if (arg1 == 3) {
			this.anInt6871 = arg0.method6884();
		} else if (arg1 == 4) {
			this.anInt6873 = arg0.method6884();
		} else if (arg1 == 5) {
			this.anInt6875 = arg0.method6884();
		} else if (arg1 == 6) {
			this.anInt6868 = arg0.method6884();
		}
	}
}
