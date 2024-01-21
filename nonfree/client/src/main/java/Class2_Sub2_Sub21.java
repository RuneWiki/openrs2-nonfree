import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class2_Sub2_Sub21 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
	private int anInt2912 = 12288;

	@OriginalMember(owner = "client!lb", name = "qb", descriptor = "I")
	private int anInt2921 = 0;

	@OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
	private int anInt2914 = 0;

	@OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
	private int anInt2917 = 8192;

	@OriginalMember(owner = "client!lb", name = "kb", descriptor = "I")
	private int anInt2918 = 2048;

	@OriginalMember(owner = "client!lb", name = "zb", descriptor = "I")
	private int anInt2927 = 2048;

	@OriginalMember(owner = "client!lb", name = "Ab", descriptor = "I")
	private int anInt2928 = 4096;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(27) int local27 = Static160.anIntArray187[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static106.anInt3045; local29++) {
				@Pc(37) int local37 = Static15.anIntArray41[local29] - 2048;
				@Pc(43) int local43 = local27 + this.anInt2914;
				@Pc(54) int local54 = local43 >= -2048 ? local43 : local43 + 4096;
				@Pc(65) int local65 = local54 <= 2048 ? local54 : local54 - 4096;
				@Pc(70) int local70 = this.anInt2918 + local27;
				@Pc(76) int local76 = local37 + this.anInt2921;
				@Pc(87) int local87 = local76 >= -2048 ? local76 : local76 + 4096;
				@Pc(92) int local92 = local37 + this.anInt2927;
				@Pc(103) int local103 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(114) int local114 = local87 > 2048 ? local87 - 4096 : local87;
				@Pc(123) int local123 = local103 <= 2048 ? local103 : local103 - 4096;
				@Pc(134) int local134 = local92 < -2048 ? local92 + 4096 : local92;
				@Pc(145) int local145 = local134 <= 2048 ? local134 : local134 - 4096;
				local11[local29] = this.method2311(local65, local145) || this.method2312(local114, local123) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2927 = arg1.method234();
		} else if (arg0 == 1) {
			this.anInt2914 = arg1.method234();
		} else if (arg0 == 2) {
			this.anInt2921 = arg1.method234();
		} else if (arg0 == 3) {
			this.anInt2918 = arg1.method234();
		} else if (arg0 == 4) {
			this.anInt2912 = arg1.method234();
		} else if (arg0 == 5) {
			this.anInt2928 = arg1.method234();
		} else if (arg0 == 6) {
			this.anInt2917 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)Z")
	private boolean method2311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt2912 * (arg0 - arg1) >> 12;
		@Pc(23) int local23 = Static122.anIntArray389[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2912;
		@Pc(37) int local37 = (local30 << 12) / this.anInt2917;
		@Pc(49) int local49 = this.anInt2928 * local37 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		Static53.method1249();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)Z")
	private boolean method2312(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt2912 * (arg1 + arg0) >> 12;
		@Pc(28) int local28 = Static122.anIntArray389[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt2912;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2917;
		@Pc(49) int local49 = this.anInt2928 * local42 >> 12;
		return arg1 - arg0 < local49 && arg1 - arg0 > -local49;
	}
}
