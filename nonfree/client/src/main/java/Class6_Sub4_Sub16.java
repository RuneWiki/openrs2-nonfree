import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class6_Sub4_Sub16 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
	private int anInt4753 = 8192;

	@OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
	private int anInt4760 = 12288;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
	private int anInt4759 = 0;

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
	private int anInt4758 = 0;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
	private int anInt4754 = 2048;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
	private int anInt4761 = 4096;

	@OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
	private int anInt4764 = 2048;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt4764 = arg1.method8571();
		} else if (arg0 == 1) {
			this.anInt4758 = arg1.method8571();
		} else if (arg0 == 2) {
			this.anInt4759 = arg1.method8571();
		} else if (arg0 == 3) {
			this.anInt4754 = arg1.method8571();
		} else if (arg0 == 4) {
			this.anInt4760 = arg1.method8571();
		} else if (arg0 == 5) {
			this.anInt4761 = arg1.method8571();
		} else if (arg0 == 6) {
			this.anInt4753 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)Z")
	private boolean method4123(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt4760 * (arg0 + arg1) >> 12;
		@Pc(27) int local27 = Static407.anIntArray406[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt4760;
		@Pc(41) int local41 = (local34 << 12) / this.anInt4753;
		@Pc(48) int local48 = this.anInt4761 * local41 >> 12;
		return arg0 - arg1 < local48 && arg0 - arg1 > -local48;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(III)Z")
	private boolean method4124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg1 - arg0) * this.anInt4760 >> 12;
		@Pc(27) int local27 = Static407.anIntArray406[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt4760;
		@Pc(41) int local41 = (local34 << 12) / this.anInt4753;
		@Pc(48) int local48 = local41 * this.anInt4761 >> 12;
		return arg0 + arg1 < local48 && arg0 + arg1 > -local48;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		Static381.method5939();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(26) int local26 = Static629.anIntArray635[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static6.anInt111; local28++) {
				@Pc(36) int local36 = Static284.anIntArray482[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt4764;
				@Pc(52) int local52 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(61) int local61 = local52 <= 2048 ? local52 : local52 - 4096;
				@Pc(66) int local66 = local26 + this.anInt4758;
				@Pc(77) int local77 = local66 >= -2048 ? local66 : local66 + 4096;
				@Pc(86) int local86 = local77 > 2048 ? local77 - 4096 : local77;
				@Pc(92) int local92 = local36 + this.anInt4759;
				@Pc(103) int local103 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(112) int local112 = local103 <= 2048 ? local103 : local103 - 4096;
				@Pc(117) int local117 = local26 + this.anInt4754;
				@Pc(126) int local126 = local117 < -2048 ? local117 + 4096 : local117;
				@Pc(135) int local135 = local126 > 2048 ? local126 - 4096 : local126;
				local16[local28] = this.method4124(local61, local86) || this.method4123(local135, local112) ? 4096 : 0;
			}
		}
		return local16;
	}
}
