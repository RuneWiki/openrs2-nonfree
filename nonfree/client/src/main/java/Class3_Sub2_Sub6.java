import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "I")
	private int anInt2729 = 2048;

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
	private int anInt2739 = 0;

	@OriginalMember(owner = "client!eo", name = "C", descriptor = "I")
	private int anInt2731 = 4096;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
	private int anInt2728 = 12288;

	@OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
	private int anInt2738 = 8192;

	@OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
	private int anInt2743 = 0;

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "I")
	private int anInt2730 = 2048;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZII)Z")
	private boolean method2550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = (arg0 + arg1) * this.anInt2728 >> 12;
		@Pc(28) int local28 = Static587.anIntArray621[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt2728;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2738;
		@Pc(49) int local49 = local42 * this.anInt2731 >> 12;
		return local49 > arg1 - arg0 && arg1 - arg0 > -local49;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(III)Z")
	private boolean method2552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt2728 * (arg0 - arg1) >> 12;
		@Pc(32) int local32 = Static587.anIntArray621[local13 * 255 >> 12 & 0xFF];
		@Pc(39) int local39 = (local32 << 12) / this.anInt2728;
		@Pc(46) int local46 = (local39 << 12) / this.anInt2738;
		@Pc(53) int local53 = local46 * this.anInt2731 >> 12;
		return arg0 + arg1 < local53 && arg0 + arg1 > -local53;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(21) int local21 = Static372.anIntArray207[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static491.anInt8519; local23++) {
				@Pc(31) int local31 = Static546.anIntArray582[local23] - 2048;
				@Pc(36) int local36 = this.anInt2729 + local31;
				@Pc(47) int local47 = local36 < -2048 ? local36 + 4096 : local36;
				@Pc(58) int local58 = local47 <= 2048 ? local47 : local47 - 4096;
				@Pc(63) int local63 = local21 + this.anInt2743;
				@Pc(74) int local74 = local63 >= -2048 ? local63 : local63 + 4096;
				@Pc(85) int local85 = local74 > 2048 ? local74 - 4096 : local74;
				@Pc(90) int local90 = local31 + this.anInt2739;
				@Pc(99) int local99 = local90 >= -2048 ? local90 : local90 + 4096;
				@Pc(110) int local110 = local99 > 2048 ? local99 - 4096 : local99;
				@Pc(115) int local115 = this.anInt2730 + local21;
				@Pc(126) int local126 = local115 < -2048 ? local115 + 4096 : local115;
				@Pc(135) int local135 = local126 <= 2048 ? local126 : local126 - 4096;
				local11[local23] = this.method2552(local85, local58) || this.method2550(local110, local135) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2729 = arg0.method4221();
		} else if (arg1 == 1) {
			this.anInt2743 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anInt2739 = arg0.method4221();
		} else if (arg1 == 3) {
			this.anInt2730 = arg0.method4221();
		} else if (arg1 == 4) {
			this.anInt2728 = arg0.method4221();
		} else if (arg1 == 5) {
			this.anInt2731 = arg0.method4221();
		} else if (arg1 == 6) {
			this.anInt2738 = arg0.method4221();
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		Static511.method7631();
	}
}
