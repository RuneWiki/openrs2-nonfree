import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class7_Sub4_Sub28 extends Class7_Sub4 {

	@OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
	private int anInt4993 = 2048;

	@OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
	private int anInt4991 = 4096;

	@OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
	private int anInt4989 = 0;

	@OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
	private int anInt5001 = 12288;

	@OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
	private int anInt4997 = 2048;

	@OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
	private int anInt4990 = 0;

	@OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
	private int anInt5004 = 8192;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(21) int local21 = Static314.anIntArray756[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static201.anInt4174; local23++) {
				@Pc(31) int local31 = Static129.anIntArray375[local23] - 2048;
				@Pc(36) int local36 = this.anInt4993 + local31;
				@Pc(45) int local45 = local36 < -2048 ? local36 + 4096 : local36;
				@Pc(56) int local56 = local45 > 2048 ? local45 - 4096 : local45;
				@Pc(62) int local62 = local21 + this.anInt4989;
				@Pc(71) int local71 = local62 < -2048 ? local62 + 4096 : local62;
				@Pc(82) int local82 = local71 <= 2048 ? local71 : local71 - 4096;
				@Pc(87) int local87 = local31 + this.anInt4990;
				@Pc(96) int local96 = local87 >= -2048 ? local87 : local87 + 4096;
				@Pc(105) int local105 = local96 <= 2048 ? local96 : local96 - 4096;
				@Pc(111) int local111 = local21 + this.anInt4997;
				@Pc(122) int local122 = local111 < -2048 ? local111 + 4096 : local111;
				@Pc(133) int local133 = local122 > 2048 ? local122 - 4096 : local122;
				local11[local23] = this.method4348(local56, local82) || this.method4346(local105, local133) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)Z")
	private boolean method4346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = (arg0 + arg1) * this.anInt5001 >> 12;
		@Pc(28) int local28 = Static279.anIntArray848[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt5001;
		@Pc(42) int local42 = (local35 << 12) / this.anInt5004;
		@Pc(49) int local49 = local42 * this.anInt4991 >> 12;
		return local49 > arg1 - arg0 && arg1 - arg0 > -local49;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZI)Z")
	private boolean method4348(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = (arg1 - arg0) * this.anInt5001 >> 12;
		@Pc(28) int local28 = Static279.anIntArray848[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt5001;
		@Pc(42) int local42 = (local35 << 12) / this.anInt5004;
		@Pc(49) int local49 = this.anInt4991 * local42 >> 12;
		return local49 > arg0 + arg1 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4993 = arg0.method2764();
		} else if (arg1 == 1) {
			this.anInt4989 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt4990 = arg0.method2764();
		} else if (arg1 == 3) {
			this.anInt4997 = arg0.method2764();
		} else if (arg1 == 4) {
			this.anInt5001 = arg0.method2764();
		} else if (arg1 == 5) {
			this.anInt4991 = arg0.method2764();
		} else if (arg1 == 6) {
			this.anInt5004 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		Static14.method201();
	}
}
