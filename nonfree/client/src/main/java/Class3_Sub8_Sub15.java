import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class3_Sub8_Sub15 extends Class3_Sub8 {

	@OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
	private int anInt5234 = 0;

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
	private int anInt5231 = 4096;

	@OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
	private int anInt5236 = 8192;

	@OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
	private int anInt5240 = 2048;

	@OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
	private int anInt5241 = 0;

	@OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
	private int anInt5237 = 2048;

	@OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
	private int anInt5239 = 12288;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBI)Z")
	private boolean method4497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt5239 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static217.anIntArray548[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt5239;
		@Pc(36) int local36 = (local29 << 12) / this.anInt5236;
		@Pc(43) int local43 = this.anInt5231 * local36 >> 12;
		return local43 > arg1 - arg0 && -local43 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(26) int local26 = Static510.anIntArray172[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static91.anInt1849; local28++) {
				@Pc(36) int local36 = Static13.anIntArray11[local28] - 2048;
				@Pc(42) int local42 = local36 + this.anInt5237;
				@Pc(51) int local51 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(62) int local62 = local51 <= 2048 ? local51 : local51 - 4096;
				@Pc(67) int local67 = this.anInt5241 + local26;
				@Pc(76) int local76 = local67 >= -2048 ? local67 : local67 + 4096;
				@Pc(85) int local85 = local76 <= 2048 ? local76 : local76 - 4096;
				@Pc(90) int local90 = this.anInt5234 + local36;
				@Pc(99) int local99 = local90 < -2048 ? local90 + 4096 : local90;
				@Pc(110) int local110 = local99 > 2048 ? local99 - 4096 : local99;
				@Pc(116) int local116 = local26 + this.anInt5240;
				@Pc(127) int local127 = local116 < -2048 ? local116 + 4096 : local116;
				@Pc(136) int local136 = local127 <= 2048 ? local127 : local127 - 4096;
				local16[local28] = this.method4500(local85, local62) || this.method4497(local110, local136) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt5237 = arg1.method7951();
		} else if (arg0 == 1) {
			this.anInt5241 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt5234 = arg1.method7951();
		} else if (arg0 == 3) {
			this.anInt5240 = arg1.method7951();
		} else if (arg0 == 4) {
			this.anInt5239 = arg1.method7951();
		} else if (arg0 == 5) {
			this.anInt5231 = arg1.method7951();
		} else if (arg0 == 6) {
			this.anInt5236 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		Static427.method5897();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)Z")
	private boolean method4500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 - arg1) * this.anInt5239 >> 12;
		@Pc(22) int local22 = Static217.anIntArray548[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt5239;
		@Pc(36) int local36 = (local29 << 12) / this.anInt5236;
		@Pc(43) int local43 = local36 * this.anInt5231 >> 12;
		return arg1 + arg0 < local43 && arg1 + arg0 > -local43;
	}
}
