import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class3_Sub2_Sub37 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vt", name = "H", descriptor = "I")
	private int anInt9900 = 12288;

	@OriginalMember(owner = "client!vt", name = "P", descriptor = "I")
	private int anInt9906 = 0;

	@OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
	private int anInt9903 = 4096;

	@OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
	private int anInt9904 = 0;

	@OriginalMember(owner = "client!vt", name = "R", descriptor = "I")
	private int anInt9907 = 2048;

	@OriginalMember(owner = "client!vt", name = "N", descriptor = "I")
	private int anInt9905 = 8192;

	@OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
	private int anInt9901 = 2048;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(III)Z")
	private boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt9900 * (arg1 - arg0) >> 12;
		@Pc(28) int local28 = Static57.anIntArray535[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt9900;
		@Pc(42) int local42 = (local35 << 12) / this.anInt9905;
		@Pc(49) int local49 = this.anInt9903 * local42 >> 12;
		return arg1 + arg0 < local49 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		Static3.method41();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(26) int local26 = Static376.anIntArray665[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static201.anInt3738; local28++) {
				@Pc(36) int local36 = Static57.anIntArray536[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt9907;
				@Pc(52) int local52 = local41 >= -2048 ? local41 : local41 + 4096;
				@Pc(63) int local63 = local52 <= 2048 ? local52 : local52 - 4096;
				@Pc(68) int local68 = local26 + this.anInt9906;
				@Pc(77) int local77 = local68 >= -2048 ? local68 : local68 + 4096;
				@Pc(88) int local88 = local77 <= 2048 ? local77 : local77 - 4096;
				@Pc(93) int local93 = this.anInt9904 + local36;
				@Pc(102) int local102 = local93 < -2048 ? local93 + 4096 : local93;
				@Pc(111) int local111 = local102 > 2048 ? local102 - 4096 : local102;
				@Pc(116) int local116 = this.anInt9901 + local26;
				@Pc(125) int local125 = local116 < -2048 ? local116 + 4096 : local116;
				@Pc(134) int local134 = local125 <= 2048 ? local125 : local125 - 4096;
				local16[local28] = this.method8411(local63, local88) || this.method8412(local111, local134) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(IIB)Z")
	private boolean method8412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt9900 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static57.anIntArray535[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt9900;
		@Pc(36) int local36 = (local29 << 12) / this.anInt9905;
		@Pc(52) int local52 = local36 * this.anInt9903 >> 12;
		return local52 > arg1 - arg0 && -local52 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9907 = arg0.method5610();
		} else if (arg1 == 1) {
			this.anInt9906 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt9904 = arg0.method5610();
		} else if (arg1 == 3) {
			this.anInt9901 = arg0.method5610();
		} else if (arg1 == 4) {
			this.anInt9900 = arg0.method5610();
		} else if (arg1 == 5) {
			this.anInt9903 = arg0.method5610();
		} else if (arg1 == 6) {
			this.anInt9905 = arg0.method5610();
		}
	}
}
