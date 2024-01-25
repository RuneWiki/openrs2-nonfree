import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
	private int anInt464 = 4096;

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
	private int anInt469 = 0;

	@OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
	private int anInt471 = 8192;

	@OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
	private int anInt470 = 12288;

	@OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
	private int anInt466 = 0;

	@OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
	private int anInt474 = 2048;

	@OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
	private int anInt475 = 2048;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(III)Z")
	private boolean method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt470 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static411.anIntArray438[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt470;
		@Pc(37) int local37 = (local30 << 12) / this.anInt471;
		@Pc(44) int local44 = local37 * this.anInt464 >> 12;
		return local44 > arg0 - arg1 && arg0 - arg1 > -local44;
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(III)Z")
	private boolean method427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = this.anInt470 * (arg0 - arg1) >> 12;
		@Pc(29) int local29 = Static411.anIntArray438[local19 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt470;
		@Pc(43) int local43 = (local36 << 12) / this.anInt471;
		@Pc(50) int local50 = this.anInt464 * local43 >> 12;
		return arg1 + arg0 < local50 && arg0 + arg1 > -local50;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt475 = arg0.method5198();
		} else if (arg1 == 1) {
			this.anInt469 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt466 = arg0.method5198();
		} else if (arg1 == 3) {
			this.anInt474 = arg0.method5198();
		} else if (arg1 == 4) {
			this.anInt470 = arg0.method5198();
		} else if (arg1 == 5) {
			this.anInt464 = arg0.method5198();
		} else if (arg1 == 6) {
			this.anInt471 = arg0.method5198();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		Static195.method3275();
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(27) int local27 = Static525.anIntArray553[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static521.anInt8383; local29++) {
				@Pc(37) int local37 = Static73.anIntArray76[local29] - 2048;
				@Pc(42) int local42 = this.anInt475 + local37;
				@Pc(51) int local51 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(60) int local60 = local51 <= 2048 ? local51 : local51 - 4096;
				@Pc(65) int local65 = this.anInt469 + local27;
				@Pc(74) int local74 = local65 < -2048 ? local65 + 4096 : local65;
				@Pc(85) int local85 = local74 <= 2048 ? local74 : local74 - 4096;
				@Pc(90) int local90 = local37 + this.anInt466;
				@Pc(101) int local101 = local90 < -2048 ? local90 + 4096 : local90;
				@Pc(110) int local110 = local101 > 2048 ? local101 - 4096 : local101;
				@Pc(115) int local115 = this.anInt474 + local27;
				@Pc(124) int local124 = local115 >= -2048 ? local115 : local115 + 4096;
				@Pc(135) int local135 = local124 <= 2048 ? local124 : local124 - 4096;
				local11[local29] = this.method427(local85, local60) || this.method426(local135, local110) ? 4096 : 0;
			}
		}
		return local11;
	}
}
