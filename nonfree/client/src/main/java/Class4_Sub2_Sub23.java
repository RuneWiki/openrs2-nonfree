import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class4_Sub2_Sub23 extends Class4_Sub2 {

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
	private int anInt4475 = 2048;

	@OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
	private int anInt4478 = 0;

	@OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
	private int anInt4479 = 12288;

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
	private int anInt4480 = 4096;

	@OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
	private int anInt4476 = 8192;

	@OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
	private int anInt4483 = 0;

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
	private int anInt4486 = 2048;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)Z")
	private boolean method3379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt4479 * (arg1 + arg0) >> 12;
		@Pc(28) int local28 = Static100.anIntArray135[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt4479;
		@Pc(42) int local42 = (local35 << 12) / this.anInt4476;
		@Pc(49) int local49 = local42 * this.anInt4480 >> 12;
		return local49 > arg1 - arg0 && arg1 - arg0 > -local49;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt4475 = arg1.method4877();
		} else if (arg0 == 1) {
			this.anInt4483 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt4478 = arg1.method4877();
		} else if (arg0 == 3) {
			this.anInt4486 = arg1.method4877();
		} else if (arg0 == 4) {
			this.anInt4479 = arg1.method4877();
		} else if (arg0 == 5) {
			this.anInt4480 = arg1.method4877();
		} else if (arg0 == 6) {
			this.anInt4476 = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(III)Z")
	private boolean method3382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt4479 >> 12;
		@Pc(23) int local23 = Static100.anIntArray135[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local23 << 12) / this.anInt4479;
		@Pc(42) int local42 = (local35 << 12) / this.anInt4476;
		@Pc(49) int local49 = this.anInt4480 * local42 >> 12;
		return local49 > arg1 + arg0 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(27) int local27 = Static293.anIntArray461[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static350.anInt6330; local29++) {
				@Pc(37) int local37 = Static197.anIntArray566[local29] - 2048;
				@Pc(42) int local42 = this.anInt4475 + local37;
				@Pc(51) int local51 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(60) int local60 = local51 <= 2048 ? local51 : local51 - 4096;
				@Pc(66) int local66 = local27 + this.anInt4483;
				@Pc(75) int local75 = local66 >= -2048 ? local66 : local66 + 4096;
				@Pc(84) int local84 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(90) int local90 = local37 + this.anInt4478;
				@Pc(99) int local99 = local90 < -2048 ? local90 + 4096 : local90;
				@Pc(108) int local108 = local99 <= 2048 ? local99 : local99 - 4096;
				@Pc(113) int local113 = this.anInt4486 + local27;
				@Pc(122) int local122 = local113 >= -2048 ? local113 : local113 + 4096;
				@Pc(133) int local133 = local122 > 2048 ? local122 - 4096 : local122;
				local11[local29] = this.method3382(local60, local84) || this.method3379(local108, local133) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		Static47.method995();
	}
}
