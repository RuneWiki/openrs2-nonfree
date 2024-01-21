import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class3_Sub1_Sub25 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
	private int anInt2859;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	private int anInt2856;

	@OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
	private int anInt2860;

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
	private int anInt2864;

	@OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
	private int anInt2862;

	@OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
	private int anInt2868;

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
	private int anInt2865;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)Z")
	private boolean method2061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt2868 * (arg0 + arg1) >> 12;
		@Pc(28) int local28 = Static25.anIntArray445[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt2868;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2865;
		@Pc(49) int local49 = this.anInt2859 * local42 >> 12;
		return local49 > arg0 - arg1 && arg0 - arg1 > -local49;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIZ)Z")
	private boolean method2062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt2868 * (arg0 - arg1) >> 12;
		@Pc(23) int local23 = Static25.anIntArray445[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local23 << 12) / this.anInt2868;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2865;
		@Pc(49) int local49 = this.anInt2859 * local42 >> 12;
		return arg1 + arg0 < local49 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2864 = arg1.method208();
		} else if (arg0 == 1) {
			this.anInt2856 = arg1.method208();
		} else if (arg0 == 2) {
			this.anInt2862 = arg1.method208();
		} else if (arg0 == 3) {
			this.anInt2860 = arg1.method208();
		} else if (arg0 == 4) {
			this.anInt2868 = arg1.method208();
		} else if (arg0 == 5) {
			this.anInt2859 = arg1.method208();
		} else if (arg0 == 6) {
			this.anInt2865 = arg1.method208();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(21) int local21 = Static125.anIntArray336[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static141.anInt3261; local23++) {
				@Pc(31) int local31 = Static85.anIntArray47[local23] - 2048;
				@Pc(36) int local36 = local31 + this.anInt2864;
				@Pc(47) int local47 = local36 >= -2048 ? local36 : local36 + 4096;
				@Pc(52) int local52 = local21 + this.anInt2856;
				@Pc(61) int local61 = local52 >= -2048 ? local52 : local52 + 4096;
				@Pc(72) int local72 = local61 <= 2048 ? local61 : local61 - 4096;
				@Pc(83) int local83 = local47 > 2048 ? local47 - 4096 : local47;
				@Pc(88) int local88 = this.anInt2862 + local31;
				@Pc(93) int local93 = this.anInt2860 + local21;
				@Pc(104) int local104 = local93 >= -2048 ? local93 : local93 + 4096;
				@Pc(113) int local113 = local104 <= 2048 ? local104 : local104 - 4096;
				@Pc(124) int local124 = local88 >= -2048 ? local88 : local88 + 4096;
				@Pc(135) int local135 = local124 <= 2048 ? local124 : local124 - 4096;
				local11[local23] = this.method2062(local72, local83) || this.method2061(local113, local135) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		Static6.method99();
	}
}
