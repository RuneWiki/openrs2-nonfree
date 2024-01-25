import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class3_Sub2_Sub20 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
	private int anInt6562 = 2048;

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
	private int anInt6561 = 0;

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
	private int anInt6566 = 12288;

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
	private int anInt6565 = 4096;

	@OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
	private int anInt6570 = 8192;

	@OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
	private int anInt6572 = 2048;

	@OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
	private int anInt6569 = 0;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(III)Z")
	private boolean method5492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = (arg0 + arg1) * this.anInt6566 >> 12;
		@Pc(27) int local27 = Static540.anIntArray454[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt6566;
		@Pc(41) int local41 = (local34 << 12) / this.anInt6570;
		@Pc(48) int local48 = this.anInt6565 * local41 >> 12;
		return arg1 - arg0 < local48 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6562 = arg0.method4858();
		} else if (arg1 == 1) {
			this.anInt6569 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt6561 = arg0.method4858();
		} else if (arg1 == 3) {
			this.anInt6572 = arg0.method4858();
		} else if (arg1 == 4) {
			this.anInt6566 = arg0.method4858();
		} else if (arg1 == 5) {
			this.anInt6565 = arg0.method4858();
		} else if (arg1 == 6) {
			this.anInt6570 = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		Static272.method4337();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BII)Z")
	private boolean method5495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt6566 * (arg1 - arg0) >> 12;
		@Pc(22) int local22 = Static540.anIntArray454[local12 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local22 << 12) / this.anInt6566;
		@Pc(42) int local42 = (local35 << 12) / this.anInt6570;
		@Pc(49) int local49 = this.anInt6565 * local42 >> 12;
		return local49 > arg1 + arg0 && arg0 + arg1 > -local49;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(27) int local27 = Static201.anIntArray251[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static30.anInt908; local29++) {
				@Pc(37) int local37 = Static26.anIntArray20[local29] - 2048;
				@Pc(42) int local42 = this.anInt6562 + local37;
				@Pc(51) int local51 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(62) int local62 = local51 <= 2048 ? local51 : local51 - 4096;
				@Pc(68) int local68 = local27 + this.anInt6569;
				@Pc(79) int local79 = local68 < -2048 ? local68 + 4096 : local68;
				@Pc(88) int local88 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(94) int local94 = local37 + this.anInt6561;
				@Pc(103) int local103 = local94 < -2048 ? local94 + 4096 : local94;
				@Pc(112) int local112 = local103 > 2048 ? local103 - 4096 : local103;
				@Pc(117) int local117 = this.anInt6572 + local27;
				@Pc(128) int local128 = local117 < -2048 ? local117 + 4096 : local117;
				@Pc(137) int local137 = local128 > 2048 ? local128 - 4096 : local128;
				local17[local29] = this.method5495(local62, local88) || this.method5492(local112, local137) ? 4096 : 0;
			}
		}
		return local17;
	}
}
