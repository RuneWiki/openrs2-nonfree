import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class4_Sub4_Sub24 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
	private int anInt5321 = 12288;

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
	private int anInt5325 = 2048;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
	private int anInt5326 = 2048;

	@OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
	private int anInt5323 = 8192;

	@OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
	private int anInt5329 = 4096;

	@OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
	private int anInt5328 = 0;

	@OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
	private int anInt5330 = 0;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)Z")
	private boolean method4325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt5321 * (arg1 + arg0) >> 12;
		@Pc(28) int local28 = Static214.anIntArray275[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt5321;
		@Pc(42) int local42 = (local35 << 12) / this.anInt5323;
		@Pc(49) int local49 = local42 * this.anInt5329 >> 12;
		return arg1 - arg0 < local49 && -local49 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(21) int local21 = Static334.anIntArray437[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static419.anInt6404; local23++) {
				@Pc(31) int local31 = Static226.anIntArray284[local23] - 2048;
				@Pc(36) int local36 = this.anInt5325 + local31;
				@Pc(47) int local47 = local36 >= -2048 ? local36 : local36 + 4096;
				@Pc(56) int local56 = local47 <= 2048 ? local47 : local47 - 4096;
				@Pc(61) int local61 = this.anInt5330 + local21;
				@Pc(72) int local72 = local61 < -2048 ? local61 + 4096 : local61;
				@Pc(83) int local83 = local72 <= 2048 ? local72 : local72 - 4096;
				@Pc(88) int local88 = this.anInt5328 + local31;
				@Pc(97) int local97 = local88 >= -2048 ? local88 : local88 + 4096;
				@Pc(108) int local108 = local97 <= 2048 ? local97 : local97 - 4096;
				@Pc(114) int local114 = local21 + this.anInt5326;
				@Pc(125) int local125 = local114 >= -2048 ? local114 : local114 + 4096;
				@Pc(134) int local134 = local125 <= 2048 ? local125 : local125 - 4096;
				local11[local23] = this.method4326(local83, local56) || this.method4325(local108, local134) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(III)Z")
	private boolean method4326(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt5321 * (arg0 - arg1) >> 12;
		@Pc(31) int local31 = Static214.anIntArray275[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt5321;
		@Pc(45) int local45 = (local38 << 12) / this.anInt5323;
		@Pc(52) int local52 = local45 * this.anInt5329 >> 12;
		return arg1 + arg0 < local52 && -local52 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt5325 = arg1.method5028();
		} else if (arg0 == 1) {
			this.anInt5330 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt5328 = arg1.method5028();
		} else if (arg0 == 3) {
			this.anInt5326 = arg1.method5028();
		} else if (arg0 == 4) {
			this.anInt5321 = arg1.method5028();
		} else if (arg0 == 5) {
			this.anInt5329 = arg1.method5028();
		} else if (arg0 == 6) {
			this.anInt5323 = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		Static232.method3165();
	}
}
