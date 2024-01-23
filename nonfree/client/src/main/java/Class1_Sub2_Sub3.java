import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
	private int anInt609 = 2048;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
	private int anInt612 = 12288;

	@OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
	private int anInt615 = 8192;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
	private int anInt608 = 4096;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
	private int anInt610 = 0;

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	private int anInt611 = 2048;

	@OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
	private int anInt618 = 0;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIB)Z")
	private boolean method583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt612 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static36.anIntArray54[local8 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt612;
		@Pc(36) int local36 = (local29 << 12) / this.anInt615;
		@Pc(52) int local52 = this.anInt608 * local36 >> 12;
		return arg1 - arg0 < local52 && -local52 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt611 = arg0.method2593();
		} else if (arg1 == 1) {
			this.anInt618 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt610 = arg0.method2593();
		} else if (arg1 == 3) {
			this.anInt609 = arg0.method2593();
		} else if (arg1 == 4) {
			this.anInt612 = arg0.method2593();
		} else if (arg1 == 5) {
			this.anInt608 = arg0.method2593();
		} else if (arg1 == 6) {
			this.anInt615 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)Z")
	private boolean method584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = (arg0 - arg1) * this.anInt612 >> 12;
		@Pc(18) int local18 = Static36.anIntArray54[local8 * 255 >> 12 & 0xFF];
		@Pc(25) int local25 = (local18 << 12) / this.anInt612;
		@Pc(36) int local36 = (local25 << 12) / this.anInt615;
		@Pc(48) int local48 = local36 * this.anInt608 >> 12;
		return local48 > arg1 + arg0 && -local48 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		Static44.method777();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(23) int local23 = Static7.anIntArray13[arg0] - 2048;
			for (@Pc(25) int local25 = 0; local25 < Static299.anInt5670; local25++) {
				@Pc(34) int local34 = Static310.anIntArray108[local25] - 2048;
				@Pc(39) int local39 = local34 + this.anInt611;
				@Pc(50) int local50 = local39 >= -2048 ? local39 : local39 + 4096;
				@Pc(59) int local59 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(64) int local64 = this.anInt610 + local34;
				@Pc(69) int local69 = local23 + this.anInt618;
				@Pc(74) int local74 = this.anInt609 + local23;
				@Pc(83) int local83 = local74 >= -2048 ? local74 : local74 + 4096;
				@Pc(92) int local92 = local69 < -2048 ? local69 + 4096 : local69;
				@Pc(103) int local103 = local92 > 2048 ? local92 - 4096 : local92;
				@Pc(114) int local114 = local83 > 2048 ? local83 - 4096 : local83;
				@Pc(123) int local123 = local64 >= -2048 ? local64 : local64 + 4096;
				@Pc(134) int local134 = local123 <= 2048 ? local123 : local123 - 4096;
				local13[local25] = this.method584(local103, local59) || this.method583(local134, local114) ? 4096 : 0;
			}
		}
		return local13;
	}
}
