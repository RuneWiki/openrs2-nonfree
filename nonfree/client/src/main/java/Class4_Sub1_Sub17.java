import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class4_Sub1_Sub17 extends Class4_Sub1 {

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
	private int anInt3172;

	@OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
	private int anInt3174;

	@OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
	private int anInt3175;

	@OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
	private int anInt3186;

	@OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
	private int anInt3187;

	@OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
	private int anInt3176 = 0;

	@OriginalMember(owner = "client!lj", name = "hb", descriptor = "I")
	private int anInt3185 = 0;

	@OriginalMember(owner = "client!lj", name = "lb", descriptor = "I")
	private int anInt3189 = 0;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIB)V")
	private void method2607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(29) int local29 = arg1 > 2048 ? arg2 + arg1 - (arg1 * arg2 >> 12) : arg1 * (arg2 + 4096) >> 12;
		if (local29 <= 0) {
			this.anInt3172 = this.anInt3174 = this.anInt3187 = arg1;
			return;
		}
		@Pc(38) int local38 = arg1 + arg1 - local29;
		@Pc(47) int local47 = (local29 - local38 << 12) / local29;
		@Pc(51) int local51 = arg0 * 6;
		@Pc(55) int local55 = local51 >> 12;
		@Pc(64) int local64 = local51 - (local55 << 12);
		@Pc(70) int local70 = local47 * local29 >> 12;
		@Pc(76) int local76 = local70 * local64 >> 12;
		@Pc(81) int local81 = local29 - local76;
		@Pc(85) int local85 = local38 + local76;
		if (local55 == 0) {
			this.anInt3174 = local85;
			this.anInt3172 = local29;
			this.anInt3187 = local38;
		} else if (local55 == 1) {
			this.anInt3174 = local29;
			this.anInt3172 = local81;
			this.anInt3187 = local38;
		} else if (local55 == 2) {
			this.anInt3172 = local38;
			this.anInt3174 = local29;
			this.anInt3187 = local85;
		} else if (local55 == 3) {
			this.anInt3172 = local38;
			this.anInt3174 = local81;
			this.anInt3187 = local29;
		} else if (local55 == 4) {
			this.anInt3172 = local85;
			this.anInt3174 = local38;
			this.anInt3187 = local29;
		} else if (local55 == 5) {
			this.anInt3174 = local38;
			this.anInt3172 = local29;
			this.anInt3187 = local81;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3185 = arg0.method4613();
		} else if (arg1 == 1) {
			this.anInt3189 = (arg0.method4674() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3176 = (arg0.method4674() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
	private void method2609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(19) int local19 = local8 < arg0 ? arg0 : local8;
		@Pc(34) int local34 = arg2 < arg1 ? arg2 : arg1;
		@Pc(41) int local41 = local34 > arg0 ? arg0 : local34;
		this.anInt3179 = (local19 + local41) / 2;
		@Pc(62) int local62 = local19 - local41;
		if (local62 <= 0) {
			this.anInt3175 = 0;
		} else {
			@Pc(81) int local81 = (local19 - arg0 << 12) / local62;
			@Pc(90) int local90 = (local19 - arg2 << 12) / local62;
			@Pc(98) int local98 = (local19 - arg1 << 12) / local62;
			if (local19 == arg2) {
				this.anInt3175 = arg1 == local41 ? local81 + 20480 : -local98 + 4096;
			} else if (local19 == arg1) {
				this.anInt3175 = arg0 == local41 ? local90 + 4096 : -local81 + 12288;
			} else {
				this.anInt3175 = local41 == arg2 ? local98 + 12288 : -local90 + 20480;
			}
			this.anInt3175 /= 6;
		}
		if (this.anInt3179 > 0 && this.anInt3179 < 4096) {
			this.anInt3186 = (local62 << 12) / (this.anInt3179 <= 2048 ? this.anInt3179 * 2 : 8192 - (this.anInt3179 * 2));
		} else {
			this.anInt3186 = 0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(28) int[][] local28 = this.method4723(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local18[0];
			@Pc(44) int[] local44 = local28[2];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static73.anInt1626; local54++) {
				this.method2609(local44[local54], local36[local54], local32[local54]);
				this.anInt3179 += this.anInt3176;
				this.anInt3186 += this.anInt3189;
				if (this.anInt3186 < 0) {
					this.anInt3186 = 0;
				}
				this.anInt3175 += this.anInt3185;
				if (this.anInt3186 > 4096) {
					this.anInt3186 = 4096;
				}
				while (this.anInt3175 < 0) {
					this.anInt3175 += 4096;
				}
				if (this.anInt3179 < 0) {
					this.anInt3179 = 0;
				}
				if (this.anInt3179 > 4096) {
					this.anInt3179 = 4096;
				}
				while (this.anInt3175 > 4096) {
					this.anInt3175 -= 4096;
				}
				this.method2607(this.anInt3175, this.anInt3179, this.anInt3186);
				local40[local54] = this.anInt3172;
				local48[local54] = this.anInt3174;
				local52[local54] = this.anInt3187;
			}
		}
		return local18;
	}
}
