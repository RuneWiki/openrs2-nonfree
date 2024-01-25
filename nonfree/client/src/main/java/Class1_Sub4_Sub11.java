import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub4_Sub11 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	private int anInt1599 = 0;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	private int anInt1607 = 4096;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt1602 = 12288;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	private int anInt1608 = 2048;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt1603 = 0;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	private int anInt1600 = 2048;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
	private int anInt1610 = 8192;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(21) int local21 = Static419.anIntArray472[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static395.anInt6592; local23++) {
				@Pc(31) int local31 = Static119.anIntArray146[local23] - 2048;
				@Pc(37) int local37 = local31 + this.anInt1608;
				@Pc(46) int local46 = local37 < -2048 ? local37 + 4096 : local37;
				@Pc(55) int local55 = local46 > 2048 ? local46 - 4096 : local46;
				@Pc(60) int local60 = local21 + this.anInt1599;
				@Pc(69) int local69 = local60 < -2048 ? local60 + 4096 : local60;
				@Pc(78) int local78 = local69 <= 2048 ? local69 : local69 - 4096;
				@Pc(83) int local83 = this.anInt1603 + local31;
				@Pc(92) int local92 = local83 >= -2048 ? local83 : local83 + 4096;
				@Pc(101) int local101 = local92 > 2048 ? local92 - 4096 : local92;
				@Pc(107) int local107 = local21 + this.anInt1600;
				@Pc(118) int local118 = local107 < -2048 ? local107 + 4096 : local107;
				@Pc(127) int local127 = local118 <= 2048 ? local118 : local118 - 4096;
				local11[local23] = this.method1403(local78, local55) || this.method1404(local127, local101) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(III)Z")
	private boolean method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt1602 >> 12;
		@Pc(28) int local28 = Static98.anIntArray123[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt1602;
		@Pc(42) int local42 = (local35 << 12) / this.anInt1610;
		@Pc(49) int local49 = local42 * this.anInt1607 >> 12;
		return arg1 + arg0 < local49 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		Static431.method5702();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1608 = arg0.method5335();
		} else if (arg1 == 1) {
			this.anInt1599 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anInt1603 = arg0.method5335();
		} else if (arg1 == 3) {
			this.anInt1600 = arg0.method5335();
		} else if (arg1 == 4) {
			this.anInt1602 = arg0.method5335();
		} else if (arg1 == 5) {
			this.anInt1607 = arg0.method5335();
		} else if (arg1 == 6) {
			this.anInt1610 = arg0.method5335();
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(III)Z")
	private boolean method1404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = (arg1 + arg0) * this.anInt1602 >> 12;
		@Pc(28) int local28 = Static98.anIntArray123[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt1602;
		@Pc(42) int local42 = (local35 << 12) / this.anInt1610;
		@Pc(49) int local49 = this.anInt1607 * local42 >> 12;
		return local49 > arg0 - arg1 && -local49 < arg0 - arg1;
	}
}
