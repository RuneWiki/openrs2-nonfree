import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
	private int anInt685 = 0;

	@OriginalMember(owner = "client!bca", name = "E", descriptor = "I")
	private int anInt683 = 8192;

	@OriginalMember(owner = "client!bca", name = "L", descriptor = "I")
	private int anInt690 = 12288;

	@OriginalMember(owner = "client!bca", name = "Q", descriptor = "I")
	private int anInt695 = 2048;

	@OriginalMember(owner = "client!bca", name = "S", descriptor = "I")
	private int anInt696 = 0;

	@OriginalMember(owner = "client!bca", name = "P", descriptor = "I")
	private int anInt694 = 2048;

	@OriginalMember(owner = "client!bca", name = "U", descriptor = "I")
	private int anInt698 = 4096;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		Static154.method2691();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt694 = arg0.method2825();
		} else if (arg1 == 1) {
			this.anInt696 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anInt685 = arg0.method2825();
		} else if (arg1 == 3) {
			this.anInt695 = arg0.method2825();
		} else if (arg1 == 4) {
			this.anInt690 = arg0.method2825();
		} else if (arg1 == 5) {
			this.anInt698 = arg0.method2825();
		} else if (arg1 == 6) {
			this.anInt683 = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "(III)Z")
	private boolean method760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt690 >> 12;
		@Pc(22) int local22 = Static511.anIntArray605[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt690;
		@Pc(41) int local41 = (local29 << 12) / this.anInt683;
		@Pc(48) int local48 = this.anInt698 * local41 >> 12;
		return arg1 - arg0 < local48 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(21) int local21 = Static415.anIntArray482[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static395.anInt6816; local23++) {
				@Pc(31) int local31 = Static20.anIntArray40[local23] - 2048;
				@Pc(36) int local36 = local31 + this.anInt694;
				@Pc(45) int local45 = local36 >= -2048 ? local36 : local36 + 4096;
				@Pc(54) int local54 = local45 > 2048 ? local45 - 4096 : local45;
				@Pc(59) int local59 = this.anInt696 + local21;
				@Pc(68) int local68 = local59 >= -2048 ? local59 : local59 + 4096;
				@Pc(77) int local77 = local68 > 2048 ? local68 - 4096 : local68;
				@Pc(83) int local83 = local31 + this.anInt685;
				@Pc(94) int local94 = local83 < -2048 ? local83 + 4096 : local83;
				@Pc(103) int local103 = local94 > 2048 ? local94 - 4096 : local94;
				@Pc(109) int local109 = local21 + this.anInt695;
				@Pc(118) int local118 = local109 < -2048 ? local109 + 4096 : local109;
				@Pc(127) int local127 = local118 <= 2048 ? local118 : local118 - 4096;
				local11[local23] = this.method763(local77, local54) || this.method760(local103, local127) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIB)Z")
	private boolean method763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt690 >> 12;
		@Pc(23) int local23 = Static511.anIntArray605[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt690;
		@Pc(37) int local37 = (local30 << 12) / this.anInt683;
		@Pc(44) int local44 = local37 * this.anInt698 >> 12;
		return local44 > arg1 + arg0 && arg0 + arg1 > -local44;
	}
}
