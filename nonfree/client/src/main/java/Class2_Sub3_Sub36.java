import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub3_Sub36 extends Class2_Sub3 {

	@OriginalMember(owner = "client!va", name = "J", descriptor = "I")
	private int anInt6576 = 8192;

	@OriginalMember(owner = "client!va", name = "N", descriptor = "I")
	private int anInt6579 = 12288;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	private int anInt6580 = 0;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "I")
	private int anInt6581 = 2048;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "I")
	private int anInt6586 = 2048;

	@OriginalMember(owner = "client!va", name = "K", descriptor = "I")
	private int anInt6577 = 4096;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	private int anInt6585 = 0;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(26) int local26 = Static76.anIntArray121[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static263.anInt5504; local28++) {
				@Pc(36) int local36 = Static269.anIntArray507[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt6586;
				@Pc(52) int local52 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(63) int local63 = local52 > 2048 ? local52 - 4096 : local52;
				@Pc(69) int local69 = local26 + this.anInt6580;
				@Pc(80) int local80 = local69 < -2048 ? local69 + 4096 : local69;
				@Pc(89) int local89 = local80 <= 2048 ? local80 : local80 - 4096;
				@Pc(94) int local94 = this.anInt6585 + local36;
				@Pc(105) int local105 = local94 >= -2048 ? local94 : local94 + 4096;
				@Pc(116) int local116 = local105 > 2048 ? local105 - 4096 : local105;
				@Pc(122) int local122 = local26 + this.anInt6581;
				@Pc(133) int local133 = local122 >= -2048 ? local122 : local122 + 4096;
				@Pc(144) int local144 = local133 > 2048 ? local133 - 4096 : local133;
				local16[local28] = this.method5526(local89, local63) || this.method5524(local116, local144) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		Static224.method5493();
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(III)Z")
	private boolean method5524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt6579 * (arg1 + arg0) >> 12;
		@Pc(31) int local31 = Static45.anIntArray70[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt6579;
		@Pc(45) int local45 = (local38 << 12) / this.anInt6576;
		@Pc(52) int local52 = local45 * this.anInt6577 >> 12;
		return local52 > arg1 - arg0 && -local52 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(III)Z")
	private boolean method5526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = (arg0 - arg1) * this.anInt6579 >> 12;
		@Pc(31) int local31 = Static45.anIntArray70[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt6579;
		@Pc(45) int local45 = (local38 << 12) / this.anInt6576;
		@Pc(52) int local52 = local45 * this.anInt6577 >> 12;
		return local52 > arg0 + arg1 && arg0 + arg1 > -local52;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6586 = arg1.method3104();
		} else if (arg0 == 1) {
			this.anInt6580 = arg1.method3104();
		} else if (arg0 == 2) {
			this.anInt6585 = arg1.method3104();
		} else if (arg0 == 3) {
			this.anInt6581 = arg1.method3104();
		} else if (arg0 == 4) {
			this.anInt6579 = arg1.method3104();
		} else if (arg0 == 5) {
			this.anInt6577 = arg1.method3104();
		} else if (arg0 == 6) {
			this.anInt6576 = arg1.method3104();
		}
	}
}
