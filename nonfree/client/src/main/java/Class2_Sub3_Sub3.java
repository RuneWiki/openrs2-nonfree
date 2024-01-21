import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!c", name = "S", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
	private int anInt453;

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!c", name = "hb", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
	private int anInt459;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt454 = arg1.method2933();
		} else if (arg0 == 1) {
			this.anInt448 = arg1.method2933();
		} else if (arg0 == 2) {
			this.anInt450 = arg1.method2933();
		} else if (arg0 == 3) {
			this.anInt453 = arg1.method2933();
		} else if (arg0 == 4) {
			this.anInt459 = arg1.method2933();
		} else if (arg0 == 5) {
			this.anInt441 = arg1.method2933();
		} else if (arg0 == 6) {
			this.anInt440 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)Z")
	private boolean method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.anInt459 * (arg0 + arg1) >> 12;
		@Pc(27) int local27 = Static96.anIntArray205[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt459;
		@Pc(41) int local41 = (local34 << 12) / this.anInt440;
		@Pc(48) int local48 = this.anInt441 * local41 >> 12;
		return arg1 - arg0 < local48 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(26) int local26 = Static50.anIntArray106[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static53.anInt1184; local28++) {
				@Pc(36) int local36 = Static43.anIntArray102[local28] - 2048;
				@Pc(41) int local41 = this.anInt448 + local26;
				@Pc(46) int local46 = local36 + this.anInt454;
				@Pc(57) int local57 = local46 >= -2048 ? local46 : local46 + 4096;
				@Pc(62) int local62 = this.anInt453 + local26;
				@Pc(71) int local71 = local57 > 2048 ? local57 - 4096 : local57;
				@Pc(76) int local76 = local36 + this.anInt450;
				@Pc(85) int local85 = local62 < -2048 ? local62 + 4096 : local62;
				@Pc(94) int local94 = local85 <= 2048 ? local85 : local85 - 4096;
				@Pc(103) int local103 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(112) int local112 = local103 > 2048 ? local103 - 4096 : local103;
				@Pc(123) int local123 = local76 >= -2048 ? local76 : local76 + 4096;
				@Pc(132) int local132 = local123 > 2048 ? local123 - 4096 : local123;
				local7[local28] = this.method392(local112, local71) || this.method390(local132, local94) ? 4096 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)Z")
	private boolean method392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.anInt459 * (arg0 - arg1) >> 12;
		@Pc(31) int local31 = Static96.anIntArray205[local9 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt459;
		@Pc(45) int local45 = (local38 << 12) / this.anInt440;
		@Pc(52) int local52 = this.anInt441 * local45 >> 12;
		return local52 > arg0 + arg1 && -local52 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		Static157.method2659();
	}
}
