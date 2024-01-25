import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!al", name = "O", descriptor = "I")
	private int anInt314 = 12288;

	@OriginalMember(owner = "client!al", name = "S", descriptor = "I")
	private int anInt318 = 0;

	@OriginalMember(owner = "client!al", name = "T", descriptor = "I")
	private int anInt319 = 2048;

	@OriginalMember(owner = "client!al", name = "W", descriptor = "I")
	private int anInt321 = 4096;

	@OriginalMember(owner = "client!al", name = "Z", descriptor = "I")
	private int anInt324 = 8192;

	@OriginalMember(owner = "client!al", name = "bb", descriptor = "I")
	private int anInt326 = 0;

	@OriginalMember(owner = "client!al", name = "cb", descriptor = "I")
	private int anInt327 = 2048;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt319 = arg0.method3649();
		} else if (arg1 == 1) {
			this.anInt326 = arg0.method3649();
		} else if (arg1 == 2) {
			this.anInt318 = arg0.method3649();
		} else if (arg1 == 3) {
			this.anInt327 = arg0.method3649();
		} else if (arg1 == 4) {
			this.anInt314 = arg0.method3649();
		} else if (arg1 == 5) {
			this.anInt321 = arg0.method3649();
		} else if (arg1 == 6) {
			this.anInt324 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(BII)Z")
	private boolean method216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt314 * (arg1 + arg0) >> 12;
		@Pc(27) int local27 = Static113.anIntArray534[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt314;
		@Pc(41) int local41 = (local34 << 12) / this.anInt324;
		@Pc(48) int local48 = local41 * this.anInt321 >> 12;
		return arg0 - arg1 < local48 && -local48 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(30) int local30 = Static269.anIntArray433[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static131.anInt2755; local32++) {
				@Pc(40) int local40 = Static151.anIntArray211[local32] - 2048;
				@Pc(45) int local45 = this.anInt319 + local40;
				@Pc(54) int local54 = local45 < -2048 ? local45 + 4096 : local45;
				@Pc(65) int local65 = local54 <= 2048 ? local54 : local54 - 4096;
				@Pc(70) int local70 = this.anInt326 + local30;
				@Pc(81) int local81 = local70 < -2048 ? local70 + 4096 : local70;
				@Pc(92) int local92 = local81 > 2048 ? local81 - 4096 : local81;
				@Pc(98) int local98 = local40 + this.anInt318;
				@Pc(109) int local109 = local98 >= -2048 ? local98 : local98 + 4096;
				@Pc(118) int local118 = local109 <= 2048 ? local109 : local109 - 4096;
				@Pc(123) int local123 = local30 + this.anInt327;
				@Pc(132) int local132 = local123 < -2048 ? local123 + 4096 : local123;
				@Pc(143) int local143 = local132 <= 2048 ? local132 : local132 - 4096;
				local20[local32] = this.method217(local65, local92) || this.method216(local143, local118) ? 4096 : 0;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		Static336.method5504();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIB)Z")
	private boolean method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt314 * (arg1 - arg0) >> 12;
		@Pc(31) int local31 = Static113.anIntArray534[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt314;
		@Pc(45) int local45 = (local38 << 12) / this.anInt324;
		@Pc(52) int local52 = this.anInt321 * local45 >> 12;
		return local52 > arg1 + arg0 && -local52 < arg1 + arg0;
	}
}
