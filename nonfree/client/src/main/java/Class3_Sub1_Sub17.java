import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
	private int anInt2720;

	@OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
	private int anInt2722;

	@OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
	private int anInt2728;

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "I")
	private int anInt2723;

	@OriginalMember(owner = "client!nd", name = "gb", descriptor = "I")
	private int anInt2725;

	@OriginalMember(owner = "client!nd", name = "lb", descriptor = "I")
	private int anInt2729;

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
	private int anInt2721;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		Static160.method2981();
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)Z")
	private boolean method2156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt2722 * (arg0 - arg1) >> 12;
		@Pc(23) int local23 = Static61.anIntArray316[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2722;
		@Pc(37) int local37 = (local30 << 12) / this.anInt2728;
		@Pc(44) int local44 = local37 * this.anInt2729 >> 12;
		return arg0 + arg1 < local44 && arg0 + arg1 > -local44;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(IBI)Z")
	private boolean method2157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt2722 * (arg0 + arg1) >> 12;
		@Pc(30) int local30 = Static61.anIntArray316[local16 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt2722;
		@Pc(44) int local44 = (local37 << 12) / this.anInt2728;
		@Pc(51) int local51 = local44 * this.anInt2729 >> 12;
		return arg0 - arg1 < local51 && -local51 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2725 = arg1.method1510();
		} else if (arg0 == 1) {
			this.anInt2720 = arg1.method1510();
		} else if (arg0 == 2) {
			this.anInt2723 = arg1.method1510();
		} else if (arg0 == 3) {
			this.anInt2721 = arg1.method1510();
		} else if (arg0 == 4) {
			this.anInt2722 = arg1.method1510();
		} else if (arg0 == 5) {
			this.anInt2729 = arg1.method1510();
		} else if (arg0 == 6) {
			this.anInt2728 = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(21) int local21 = Static22.anIntArray152[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static129.anInt3285; local23++) {
				@Pc(31) int local31 = Static146.anIntArray618[local23] - 2048;
				@Pc(36) int local36 = local31 + this.anInt2725;
				@Pc(45) int local45 = local36 >= -2048 ? local36 : local36 + 4096;
				@Pc(54) int local54 = local45 > 2048 ? local45 - 4096 : local45;
				@Pc(59) int local59 = this.anInt2720 + local21;
				@Pc(68) int local68 = local59 < -2048 ? local59 + 4096 : local59;
				@Pc(77) int local77 = local68 > 2048 ? local68 - 4096 : local68;
				@Pc(82) int local82 = this.anInt2723 + local31;
				@Pc(87) int local87 = local21 + this.anInt2721;
				@Pc(96) int local96 = local87 < -2048 ? local87 + 4096 : local87;
				@Pc(107) int local107 = local96 > 2048 ? local96 - 4096 : local96;
				@Pc(118) int local118 = local82 < -2048 ? local82 + 4096 : local82;
				@Pc(129) int local129 = local118 <= 2048 ? local118 : local118 - 4096;
				local11[local23] = this.method2156(local77, local54) || this.method2157(local107, local129) ? 4096 : 0;
			}
		}
		return local11;
	}
}
