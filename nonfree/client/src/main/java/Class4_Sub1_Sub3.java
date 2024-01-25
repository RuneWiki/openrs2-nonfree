import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	private int anInt465 = 4096;

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
	private int anInt467 = 0;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
	private int anInt472 = 8192;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
	private int anInt466 = 12288;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
	private int anInt475 = 2048;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
	private int anInt476 = 2048;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
	private int anInt473 = 0;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt475 = arg1.method4936();
		} else if (arg0 == 1) {
			this.anInt467 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt473 = arg1.method4936();
		} else if (arg0 == 3) {
			this.anInt476 = arg1.method4936();
		} else if (arg0 == 4) {
			this.anInt466 = arg1.method4936();
		} else if (arg0 == 5) {
			this.anInt465 = arg1.method4936();
		} else if (arg0 == 6) {
			this.anInt472 = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(29) int local29 = Static442.anIntArray449[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static376.anInt7260; local31++) {
				@Pc(39) int local39 = Static292.anIntArray394[local31] - 2048;
				@Pc(44) int local44 = local39 + this.anInt475;
				@Pc(55) int local55 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(64) int local64 = local55 <= 2048 ? local55 : local55 - 4096;
				@Pc(69) int local69 = local29 + this.anInt467;
				@Pc(78) int local78 = local69 >= -2048 ? local69 : local69 + 4096;
				@Pc(87) int local87 = local78 > 2048 ? local78 - 4096 : local78;
				@Pc(92) int local92 = local39 + this.anInt473;
				@Pc(101) int local101 = local92 < -2048 ? local92 + 4096 : local92;
				@Pc(112) int local112 = local101 <= 2048 ? local101 : local101 - 4096;
				@Pc(117) int local117 = this.anInt476 + local29;
				@Pc(128) int local128 = local117 >= -2048 ? local117 : local117 + 4096;
				@Pc(139) int local139 = local128 <= 2048 ? local128 : local128 - 4096;
				local11[local31] = this.method425(local64, local87) || this.method427(local139, local112) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)Z")
	private boolean method425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt466 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static239.anIntArray474[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt466;
		@Pc(37) int local37 = (local30 << 12) / this.anInt472;
		@Pc(44) int local44 = this.anInt465 * local37 >> 12;
		return local44 > arg0 + arg1 && -local44 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		Static165.method3014();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZII)Z")
	private boolean method427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = (arg1 + arg0) * this.anInt466 >> 12;
		@Pc(27) int local27 = Static239.anIntArray474[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt466;
		@Pc(41) int local41 = (local34 << 12) / this.anInt472;
		@Pc(48) int local48 = this.anInt465 * local41 >> 12;
		return local48 > arg0 - arg1 && -local48 < arg0 - arg1;
	}
}
