import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class1_Sub3_Sub38 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
	private int anInt9294 = 4096;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
	private int anInt9297 = 2048;

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
	private int anInt9298 = 0;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
	private int anInt9301 = 2048;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
	private int anInt9296 = 0;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
	private int anInt9295 = 12288;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
	private int anInt9300 = 8192;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IBI)Z")
	private boolean method7844(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt9295 * (arg1 + arg0) >> 12;
		@Pc(23) int local23 = Static82.anIntArray177[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt9295;
		@Pc(37) int local37 = (local30 << 12) / this.anInt9300;
		@Pc(50) int local50 = this.anInt9294 * local37 >> 12;
		return arg1 - arg0 < local50 && -local50 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(32) int local32 = Static305.anIntArray416[arg0] - 2048;
			for (@Pc(34) int local34 = 0; local34 < Static236.anInt4609; local34++) {
				@Pc(42) int local42 = Static201.anIntArray324[local34] - 2048;
				@Pc(47) int local47 = this.anInt9301 + local42;
				@Pc(58) int local58 = local47 < -2048 ? local47 + 4096 : local47;
				@Pc(69) int local69 = local58 > 2048 ? local58 - 4096 : local58;
				@Pc(74) int local74 = this.anInt9296 + local32;
				@Pc(85) int local85 = local74 >= -2048 ? local74 : local74 + 4096;
				@Pc(94) int local94 = local85 <= 2048 ? local85 : local85 - 4096;
				@Pc(99) int local99 = this.anInt9298 + local42;
				@Pc(110) int local110 = local99 >= -2048 ? local99 : local99 + 4096;
				@Pc(119) int local119 = local110 > 2048 ? local110 - 4096 : local110;
				@Pc(124) int local124 = this.anInt9297 + local32;
				@Pc(135) int local135 = local124 >= -2048 ? local124 : local124 + 4096;
				@Pc(146) int local146 = local135 <= 2048 ? local135 : local135 - 4096;
				local13[local34] = this.method7845(local94, local69) || this.method7844(local119, local146) ? 4096 : 0;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9301 = arg0.method3056();
		} else if (arg1 == 1) {
			this.anInt9296 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt9298 = arg0.method3056();
		} else if (arg1 == 3) {
			this.anInt9297 = arg0.method3056();
		} else if (arg1 == 4) {
			this.anInt9295 = arg0.method3056();
		} else if (arg1 == 5) {
			this.anInt9294 = arg0.method3056();
		} else if (arg1 == 6) {
			this.anInt9300 = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		Static401.method6051();
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)Z")
	private boolean method7845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt9295 * (arg0 - arg1) >> 12;
		@Pc(28) int local28 = Static82.anIntArray177[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt9295;
		@Pc(42) int local42 = (local35 << 12) / this.anInt9300;
		@Pc(49) int local49 = local42 * this.anInt9294 >> 12;
		return local49 > arg0 + arg1 && arg1 + arg0 > -local49;
	}
}
