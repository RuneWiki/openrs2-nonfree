import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub2_Sub30 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
	private int anInt3262;

	@OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
	private int anInt3263;

	@OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
	private int anInt3270;

	@OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
	private int anInt3267;

	@OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
	private int anInt3265;

	@OriginalMember(owner = "client!pc", name = "sb", descriptor = "I")
	private int anInt3274;

	@OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		Static142.method2472();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(26) int local26 = Static37.anIntArray125[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static110.anInt2825; local28++) {
				@Pc(36) int local36 = Static86.anIntArray294[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt3263;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(56) int local56 = local26 + this.anInt3267;
				@Pc(67) int local67 = local56 >= -2048 ? local56 : local56 + 4096;
				@Pc(78) int local78 = local67 > 2048 ? local67 - 4096 : local67;
				@Pc(87) int local87 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(92) int local92 = local36 + this.anInt3270;
				@Pc(97) int local97 = this.anInt3265 + local26;
				@Pc(108) int local108 = local92 < -2048 ? local92 + 4096 : local92;
				@Pc(117) int local117 = local97 < -2048 ? local97 + 4096 : local97;
				@Pc(126) int local126 = local117 > 2048 ? local117 - 4096 : local117;
				@Pc(137) int local137 = local108 <= 2048 ? local108 : local108 - 4096;
				local12[local28] = this.method2226(local78, local87) || this.method2225(local137, local126) ? 4096 : 0;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIB)Z")
	private boolean method2225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.anInt3274 * (arg1 + arg0) >> 12;
		@Pc(30) int local30 = Static110.anIntArray379[local20 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt3274;
		@Pc(44) int local44 = (local37 << 12) / this.anInt3262;
		@Pc(51) int local51 = this.anInt3275 * local44 >> 12;
		return arg1 - arg0 < local51 && arg1 - arg0 > -local51;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)Z")
	private boolean method2226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt3274 * (arg0 - arg1) >> 12;
		@Pc(28) int local28 = Static110.anIntArray379[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt3274;
		@Pc(42) int local42 = (local35 << 12) / this.anInt3262;
		@Pc(49) int local49 = this.anInt3275 * local42 >> 12;
		return local49 > arg1 + arg0 && arg0 + arg1 > -local49;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3263 = arg0.method878();
		} else if (arg1 == 1) {
			this.anInt3267 = arg0.method878();
		} else if (arg1 == 2) {
			this.anInt3270 = arg0.method878();
		} else if (arg1 == 3) {
			this.anInt3265 = arg0.method878();
		} else if (arg1 == 4) {
			this.anInt3274 = arg0.method878();
		} else if (arg1 == 5) {
			this.anInt3275 = arg0.method878();
		} else if (arg1 == 6) {
			this.anInt3262 = arg0.method878();
		}
	}
}
