import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class2_Sub7_Sub27 extends Class2_Sub7 {

	@OriginalMember(owner = "client!oo", name = "I", descriptor = "I")
	private int anInt6477 = 0;

	@OriginalMember(owner = "client!oo", name = "W", descriptor = "I")
	private int anInt6487 = 12288;

	@OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
	private int anInt6482 = 8192;

	@OriginalMember(owner = "client!oo", name = "S", descriptor = "I")
	private int anInt6484 = 4096;

	@OriginalMember(owner = "client!oo", name = "eb", descriptor = "I")
	private int anInt6494 = 2048;

	@OriginalMember(owner = "client!oo", name = "R", descriptor = "I")
	private int anInt6483 = 0;

	@OriginalMember(owner = "client!oo", name = "cb", descriptor = "I")
	private int anInt6493 = 2048;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(21) int local21 = Static313.anIntArray521[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static352.anInt6485; local23++) {
				@Pc(31) int local31 = Static427.anIntArray602[local23] - 2048;
				@Pc(36) int local36 = this.anInt6493 + local31;
				@Pc(47) int local47 = local36 >= -2048 ? local36 : local36 + 4096;
				@Pc(58) int local58 = local47 <= 2048 ? local47 : local47 - 4096;
				@Pc(63) int local63 = local21 + this.anInt6483;
				@Pc(72) int local72 = local63 < -2048 ? local63 + 4096 : local63;
				@Pc(83) int local83 = local72 <= 2048 ? local72 : local72 - 4096;
				@Pc(89) int local89 = local31 + this.anInt6477;
				@Pc(98) int local98 = local89 < -2048 ? local89 + 4096 : local89;
				@Pc(109) int local109 = local98 <= 2048 ? local98 : local98 - 4096;
				@Pc(114) int local114 = this.anInt6494 + local21;
				@Pc(125) int local125 = local114 < -2048 ? local114 + 4096 : local114;
				@Pc(136) int local136 = local125 > 2048 ? local125 - 4096 : local125;
				local11[local23] = this.method5541(local83, local58) || this.method5542(local136, local109) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		Static50.method896();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt6493 = arg1.method5229();
		} else if (arg0 == 1) {
			this.anInt6483 = arg1.method5229();
		} else if (arg0 == 2) {
			this.anInt6477 = arg1.method5229();
		} else if (arg0 == 3) {
			this.anInt6494 = arg1.method5229();
		} else if (arg0 == 4) {
			this.anInt6487 = arg1.method5229();
		} else if (arg0 == 5) {
			this.anInt6484 = arg1.method5229();
		} else if (arg0 == 6) {
			this.anInt6482 = arg1.method5229();
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(III)Z")
	private boolean method5541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = this.anInt6487 * (arg0 - arg1) >> 12;
		@Pc(29) int local29 = Static314.anIntArray485[local19 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt6487;
		@Pc(43) int local43 = (local36 << 12) / this.anInt6482;
		@Pc(50) int local50 = local43 * this.anInt6484 >> 12;
		return local50 > arg1 + arg0 && arg1 + arg0 > -local50;
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(IBI)Z")
	private boolean method5542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt6487 >> 12;
		@Pc(22) int local22 = Static314.anIntArray485[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt6487;
		@Pc(36) int local36 = (local29 << 12) / this.anInt6482;
		@Pc(43) int local43 = local36 * this.anInt6484 >> 12;
		return local43 > arg0 - arg1 && arg0 - arg1 > -local43;
	}
}
