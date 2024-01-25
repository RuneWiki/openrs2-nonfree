import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class8_Sub2_Sub21 extends Class8_Sub2 {

	@OriginalMember(owner = "client!jea", name = "H", descriptor = "I")
	private int anInt5501 = 0;

	@OriginalMember(owner = "client!jea", name = "I", descriptor = "I")
	private int anInt5502 = 12288;

	@OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
	private int anInt5500 = 2048;

	@OriginalMember(owner = "client!jea", name = "P", descriptor = "I")
	private int anInt5509 = 4096;

	@OriginalMember(owner = "client!jea", name = "O", descriptor = "I")
	private int anInt5508 = 2048;

	@OriginalMember(owner = "client!jea", name = "K", descriptor = "I")
	private int anInt5504 = 8192;

	@OriginalMember(owner = "client!jea", name = "N", descriptor = "I")
	private int anInt5507 = 0;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(29) int local29 = Static426.anIntArray424[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static538.anInt9297; local31++) {
				@Pc(39) int local39 = Static93.anIntArray111[local31] - 2048;
				@Pc(45) int local45 = local39 + this.anInt5508;
				@Pc(54) int local54 = local45 >= -2048 ? local45 : local45 + 4096;
				@Pc(65) int local65 = local54 > 2048 ? local54 - 4096 : local54;
				@Pc(70) int local70 = this.anInt5507 + local29;
				@Pc(81) int local81 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(92) int local92 = local81 <= 2048 ? local81 : local81 - 4096;
				@Pc(98) int local98 = local39 + this.anInt5501;
				@Pc(107) int local107 = local98 >= -2048 ? local98 : local98 + 4096;
				@Pc(118) int local118 = local107 <= 2048 ? local107 : local107 - 4096;
				@Pc(123) int local123 = this.anInt5500 + local29;
				@Pc(134) int local134 = local123 < -2048 ? local123 + 4096 : local123;
				@Pc(145) int local145 = local134 > 2048 ? local134 - 4096 : local134;
				local11[local31] = this.method4525(local65, local92) || this.method4526(local118, local145) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(III)Z")
	private boolean method4525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = this.anInt5502 * (arg1 - arg0) >> 12;
		@Pc(29) int local29 = Static308.anIntArray360[local19 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt5502;
		@Pc(43) int local43 = (local36 << 12) / this.anInt5504;
		@Pc(50) int local50 = this.anInt5509 * local43 >> 12;
		return arg0 + arg1 < local50 && -local50 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5508 = arg1.method8578();
		} else if (arg0 == 1) {
			this.anInt5507 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt5501 = arg1.method8578();
		} else if (arg0 == 3) {
			this.anInt5500 = arg1.method8578();
		} else if (arg0 == 4) {
			this.anInt5502 = arg1.method8578();
		} else if (arg0 == 5) {
			this.anInt5509 = arg1.method8578();
		} else if (arg0 == 6) {
			this.anInt5504 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IBI)Z")
	private boolean method4526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 + arg0) * this.anInt5502 >> 12;
		@Pc(23) int local23 = Static308.anIntArray360[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5502;
		@Pc(37) int local37 = (local30 << 12) / this.anInt5504;
		@Pc(50) int local50 = local37 * this.anInt5509 >> 12;
		return local50 > arg1 - arg0 && arg1 - arg0 > -local50;
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		Static282.method4762();
	}
}
