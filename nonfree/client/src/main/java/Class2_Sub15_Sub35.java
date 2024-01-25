import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class2_Sub15_Sub35 extends Class2_Sub15 {

	@OriginalMember(owner = "client!uca", name = "H", descriptor = "I")
	private int anInt10329 = 2048;

	@OriginalMember(owner = "client!uca", name = "E", descriptor = "I")
	private int anInt10327 = 0;

	@OriginalMember(owner = "client!uca", name = "G", descriptor = "I")
	private int anInt10328 = 12288;

	@OriginalMember(owner = "client!uca", name = "I", descriptor = "I")
	private int anInt10330 = 8192;

	@OriginalMember(owner = "client!uca", name = "J", descriptor = "I")
	private int anInt10331 = 4096;

	@OriginalMember(owner = "client!uca", name = "P", descriptor = "I")
	private int anInt10335 = 2048;

	@OriginalMember(owner = "client!uca", name = "R", descriptor = "I")
	private int anInt10337 = 0;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(III)Z")
	private boolean method8928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt10328 * (arg0 + arg1) >> 12;
		@Pc(28) int local28 = Static464.anIntArray420[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt10328;
		@Pc(42) int local42 = (local35 << 12) / this.anInt10330;
		@Pc(49) int local49 = local42 * this.anInt10331 >> 12;
		return local49 > arg0 - arg1 && -local49 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		Static410.method6766();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt10329 = arg1.method5211();
		} else if (arg0 == 1) {
			this.anInt10337 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt10327 = arg1.method5211();
		} else if (arg0 == 3) {
			this.anInt10335 = arg1.method5211();
		} else if (arg0 == 4) {
			this.anInt10328 = arg1.method5211();
		} else if (arg0 == 5) {
			this.anInt10331 = arg1.method5211();
		} else if (arg0 == 6) {
			this.anInt10330 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZI)Z")
	private boolean method8929(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt10328 >> 12;
		@Pc(28) int local28 = Static464.anIntArray420[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt10328;
		@Pc(42) int local42 = (local35 << 12) / this.anInt10330;
		@Pc(49) int local49 = local42 * this.anInt10331 >> 12;
		return local49 > arg0 + arg1 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(27) int local27 = Static401.anIntArray357[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static329.anInt6017; local29++) {
				@Pc(37) int local37 = Static537.anIntArray480[local29] - 2048;
				@Pc(42) int local42 = local37 + this.anInt10329;
				@Pc(51) int local51 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local51 <= 2048 ? local51 : local51 - 4096;
				@Pc(67) int local67 = this.anInt10337 + local27;
				@Pc(78) int local78 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(87) int local87 = local78 > 2048 ? local78 - 4096 : local78;
				@Pc(92) int local92 = this.anInt10327 + local37;
				@Pc(101) int local101 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(112) int local112 = local101 > 2048 ? local101 - 4096 : local101;
				@Pc(117) int local117 = this.anInt10335 + local27;
				@Pc(128) int local128 = local117 >= -2048 ? local117 : local117 + 4096;
				@Pc(139) int local139 = local128 <= 2048 ? local128 : local128 - 4096;
				local17[local29] = this.method8929(local62, local87) || this.method8928(local139, local112) ? 4096 : 0;
			}
		}
		return local17;
	}
}
