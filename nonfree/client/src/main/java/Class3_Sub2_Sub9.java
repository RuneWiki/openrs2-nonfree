import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fb", name = "W", descriptor = "[I")
	public static final int[] anIntArray186 = new int[32];

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
	private int anInt3571 = 12288;

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
	private int anInt3577 = 0;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
	private int anInt3574 = 2048;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
	private int anInt3572 = 0;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
	private int anInt3576 = 8192;

	@OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
	private int anInt3580 = 2048;

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
	private int anInt3570 = 4096;

	static {
		@Pc(16) int local16 = 2;
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			anIntArray186[local18] = local16 - 1;
			local16 += local16;
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZI)Z")
	private boolean method3155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt3571 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static365.anIntArray410[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local22 << 12) / this.anInt3571;
		@Pc(44) int local44 = (local37 << 12) / this.anInt3576;
		@Pc(51) int local51 = this.anInt3570 * local44 >> 12;
		return arg1 - arg0 < local51 && arg1 - arg0 > -local51;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		Static468.method6978();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(29) int local29 = Static328.anIntArray387[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static164.anInt8839; local31++) {
				@Pc(39) int local39 = Static352.anIntArray400[local31] - 2048;
				@Pc(44) int local44 = this.anInt3574 + local39;
				@Pc(55) int local55 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(64) int local64 = local55 <= 2048 ? local55 : local55 - 4096;
				@Pc(70) int local70 = local29 + this.anInt3577;
				@Pc(79) int local79 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(90) int local90 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(95) int local95 = this.anInt3572 + local39;
				@Pc(106) int local106 = local95 < -2048 ? local95 + 4096 : local95;
				@Pc(117) int local117 = local106 <= 2048 ? local106 : local106 - 4096;
				@Pc(122) int local122 = this.anInt3580 + local29;
				@Pc(133) int local133 = local122 < -2048 ? local122 + 4096 : local122;
				@Pc(142) int local142 = local133 <= 2048 ? local133 : local133 - 4096;
				local19[local31] = this.method3160(local90, local64) || this.method3155(local117, local142) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3574 = arg1.method8414();
		} else if (arg0 == 1) {
			this.anInt3577 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt3572 = arg1.method8414();
		} else if (arg0 == 3) {
			this.anInt3580 = arg1.method8414();
		} else if (arg0 == 4) {
			this.anInt3571 = arg1.method8414();
		} else if (arg0 == 5) {
			this.anInt3570 = arg1.method8414();
		} else if (arg0 == 6) {
			this.anInt3576 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(III)Z")
	private boolean method3160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt3571 >> 12;
		@Pc(23) int local23 = Static365.anIntArray410[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local23 << 12) / this.anInt3571;
		@Pc(42) int local42 = (local35 << 12) / this.anInt3576;
		@Pc(49) int local49 = local42 * this.anInt3570 >> 12;
		return local49 > arg0 + arg1 && -local49 < arg0 + arg1;
	}
}
