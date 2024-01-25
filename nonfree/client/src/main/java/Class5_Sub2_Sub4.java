import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!as", name = "O", descriptor = "I")
	private int anInt456 = 4096;

	@OriginalMember(owner = "client!as", name = "U", descriptor = "I")
	private int anInt462 = 8192;

	@OriginalMember(owner = "client!as", name = "R", descriptor = "I")
	private int anInt459 = 2048;

	@OriginalMember(owner = "client!as", name = "S", descriptor = "I")
	private int anInt460 = 12288;

	@OriginalMember(owner = "client!as", name = "N", descriptor = "I")
	private int anInt455 = 0;

	@OriginalMember(owner = "client!as", name = "Z", descriptor = "I")
	private int anInt467 = 0;

	@OriginalMember(owner = "client!as", name = "Y", descriptor = "I")
	private int anInt466 = 2048;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(23) int local23 = Static287.anIntArray413[arg0] - 2048;
			for (@Pc(25) int local25 = 0; local25 < Static15.anInt493; local25++) {
				@Pc(33) int local33 = Static257.anIntArray386[local25] - 2048;
				@Pc(38) int local38 = local33 + this.anInt459;
				@Pc(47) int local47 = local38 >= -2048 ? local38 : local38 + 4096;
				@Pc(56) int local56 = local47 > 2048 ? local47 - 4096 : local47;
				@Pc(61) int local61 = this.anInt467 + local23;
				@Pc(72) int local72 = local61 < -2048 ? local61 + 4096 : local61;
				@Pc(81) int local81 = local72 > 2048 ? local72 - 4096 : local72;
				@Pc(87) int local87 = local33 + this.anInt455;
				@Pc(96) int local96 = local87 >= -2048 ? local87 : local87 + 4096;
				@Pc(107) int local107 = local96 > 2048 ? local96 - 4096 : local96;
				@Pc(112) int local112 = this.anInt466 + local23;
				@Pc(121) int local121 = local112 >= -2048 ? local112 : local112 + 4096;
				@Pc(130) int local130 = local121 > 2048 ? local121 - 4096 : local121;
				local13[local25] = this.method492(local56, local81) || this.method490(local107, local130) ? 4096 : 0;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z")
	private boolean method490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt460 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static73.anIntArray94[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local22 << 12) / this.anInt460;
		@Pc(41) int local41 = (local34 << 12) / this.anInt462;
		@Pc(48) int local48 = this.anInt456 * local41 >> 12;
		return arg1 - arg0 < local48 && -local48 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt459 = arg0.method1845();
		} else if (arg1 == 1) {
			this.anInt467 = arg0.method1845();
		} else if (arg1 == 2) {
			this.anInt455 = arg0.method1845();
		} else if (arg1 == 3) {
			this.anInt466 = arg0.method1845();
		} else if (arg1 == 4) {
			this.anInt460 = arg0.method1845();
		} else if (arg1 == 5) {
			this.anInt456 = arg0.method1845();
		} else if (arg1 == 6) {
			this.anInt462 = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		Static10.method307();
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(III)Z")
	private boolean method492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt460 * (arg1 - arg0) >> 12;
		@Pc(28) int local28 = Static73.anIntArray94[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt460;
		@Pc(42) int local42 = (local35 << 12) / this.anInt462;
		@Pc(49) int local49 = this.anInt456 * local42 >> 12;
		return arg0 + arg1 < local49 && -local49 < arg1 + arg0;
	}
}
