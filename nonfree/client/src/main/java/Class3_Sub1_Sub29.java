import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class3_Sub1_Sub29 extends Class3_Sub1 {

	@OriginalMember(owner = "client!oca", name = "K", descriptor = "I")
	private int anInt6574 = 8192;

	@OriginalMember(owner = "client!oca", name = "F", descriptor = "I")
	private int anInt6571 = 2048;

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "I")
	private int anInt6570 = 0;

	@OriginalMember(owner = "client!oca", name = "P", descriptor = "I")
	private int anInt6578 = 0;

	@OriginalMember(owner = "client!oca", name = "R", descriptor = "I")
	private int anInt6580 = 4096;

	@OriginalMember(owner = "client!oca", name = "U", descriptor = "I")
	private int anInt6582 = 2048;

	@OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
	private int anInt6572 = 12288;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		Static353.method5563();
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)Z")
	private boolean method5500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt6572 >> 12;
		@Pc(22) int local22 = Static247.anIntArray452[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt6572;
		@Pc(41) int local41 = (local29 << 12) / this.anInt6574;
		@Pc(48) int local48 = local41 * this.anInt6580 >> 12;
		return arg1 - arg0 < local48 && -local48 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(30) int local30 = Static402.anIntArray741[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static307.anInt4846; local32++) {
				@Pc(40) int local40 = Static241.anIntArray759[local32] - 2048;
				@Pc(45) int local45 = this.anInt6571 + local40;
				@Pc(56) int local56 = local45 >= -2048 ? local45 : local45 + 4096;
				@Pc(65) int local65 = local56 <= 2048 ? local56 : local56 - 4096;
				@Pc(70) int local70 = local30 + this.anInt6578;
				@Pc(79) int local79 = local70 < -2048 ? local70 + 4096 : local70;
				@Pc(90) int local90 = local79 > 2048 ? local79 - 4096 : local79;
				@Pc(95) int local95 = this.anInt6570 + local40;
				@Pc(106) int local106 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(117) int local117 = local106 > 2048 ? local106 - 4096 : local106;
				@Pc(123) int local123 = local30 + this.anInt6582;
				@Pc(134) int local134 = local123 < -2048 ? local123 + 4096 : local123;
				@Pc(143) int local143 = local134 <= 2048 ? local134 : local134 - 4096;
				local20[local32] = this.method5503(local90, local65) || this.method5500(local117, local143) ? 4096 : 0;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt6571 = arg1.method7591();
		} else if (arg0 == 1) {
			this.anInt6578 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt6570 = arg1.method7591();
		} else if (arg0 == 3) {
			this.anInt6582 = arg1.method7591();
		} else if (arg0 == 4) {
			this.anInt6572 = arg1.method7591();
		} else if (arg0 == 5) {
			this.anInt6580 = arg1.method7591();
		} else if (arg0 == 6) {
			this.anInt6574 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(III)Z")
	private boolean method5503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = (arg0 - arg1) * this.anInt6572 >> 12;
		@Pc(29) int local29 = Static247.anIntArray452[local19 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt6572;
		@Pc(43) int local43 = (local36 << 12) / this.anInt6574;
		@Pc(50) int local50 = this.anInt6580 * local43 >> 12;
		return local50 > arg1 + arg0 && arg1 + arg0 > -local50;
	}
}
