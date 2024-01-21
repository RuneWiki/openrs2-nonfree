import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "client!b", name = "Bb", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
	private int anInt541;

	@OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
	private int anInt542;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(25) int local25 = Static21.anIntArray50[arg0] - 2048;
			for (@Pc(27) int local27 = 0; local27 < Static54.anInt1423; local27++) {
				@Pc(35) int local35 = Static36.anIntArray74[local27] - 2048;
				@Pc(40) int local40 = this.anInt530 + local35;
				@Pc(49) int local49 = local40 < -2048 ? local40 + 4096 : local40;
				@Pc(54) int local54 = local25 + this.anInt531;
				@Pc(63) int local63 = local49 <= 2048 ? local49 : local49 - 4096;
				@Pc(74) int local74 = local54 >= -2048 ? local54 : local54 + 4096;
				@Pc(83) int local83 = local74 > 2048 ? local74 - 4096 : local74;
				@Pc(88) int local88 = local25 + this.anInt542;
				@Pc(99) int local99 = local88 >= -2048 ? local88 : local88 + 4096;
				@Pc(108) int local108 = local99 <= 2048 ? local99 : local99 - 4096;
				@Pc(113) int local113 = local35 + this.anInt529;
				@Pc(124) int local124 = local113 >= -2048 ? local113 : local113 + 4096;
				@Pc(135) int local135 = local124 <= 2048 ? local124 : local124 - 4096;
				local7[local27] = this.method349(local83, local63) || this.method353(local108, local135) ? 4096 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		Static150.method2329();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt530 = arg1.method1680();
		} else if (arg0 == 1) {
			this.anInt531 = arg1.method1680();
		} else if (arg0 == 2) {
			this.anInt529 = arg1.method1680();
		} else if (arg0 == 3) {
			this.anInt542 = arg1.method1680();
		} else if (arg0 == 4) {
			this.anInt533 = arg1.method1680();
		} else if (arg0 == 5) {
			this.anInt541 = arg1.method1680();
		} else if (arg0 == 6) {
			this.anInt540 = arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(III)Z")
	private boolean method349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = (arg0 - arg1) * this.anInt533 >> 12;
		@Pc(24) int local24 = Static31.anIntArray368[local14 * 255 >> 12 & 0xFF];
		@Pc(31) int local31 = (local24 << 12) / this.anInt533;
		@Pc(38) int local38 = (local31 << 12) / this.anInt540;
		@Pc(45) int local45 = local38 * this.anInt541 >> 12;
		return local45 > arg1 + arg0 && arg1 + arg0 > -local45;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(BII)Z")
	private boolean method353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt533 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static31.anIntArray368[local8 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt533;
		@Pc(36) int local36 = (local29 << 12) / this.anInt540;
		@Pc(48) int local48 = this.anInt541 * local36 >> 12;
		return local48 > arg0 - arg1 && -local48 < arg0 - arg1;
	}
}
