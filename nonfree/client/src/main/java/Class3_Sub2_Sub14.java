import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class3_Sub2_Sub14 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hg", name = "jb", descriptor = "I")
	private int anInt1591 = 12288;

	@OriginalMember(owner = "client!hg", name = "hb", descriptor = "I")
	private int anInt1590 = 2048;

	@OriginalMember(owner = "client!hg", name = "fb", descriptor = "I")
	private int anInt1589 = 0;

	@OriginalMember(owner = "client!hg", name = "bb", descriptor = "I")
	private int anInt1585 = 2048;

	@OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
	private int anInt1584 = 0;

	@OriginalMember(owner = "client!hg", name = "pb", descriptor = "I")
	private int anInt1596 = 8192;

	@OriginalMember(owner = "client!hg", name = "rb", descriptor = "I")
	private int anInt1597 = 4096;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int local29 = Static34.anIntArray37[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static190.anInt3865; local31++) {
				@Pc(39) int local39 = Static133.anIntArray187[local31] - 2048;
				@Pc(44) int local44 = local29 + this.anInt1584;
				@Pc(55) int local55 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(60) int local60 = this.anInt1590 + local39;
				@Pc(69) int local69 = local55 > 2048 ? local55 - 4096 : local55;
				@Pc(80) int local80 = local60 >= -2048 ? local60 : local60 + 4096;
				@Pc(91) int local91 = local80 <= 2048 ? local80 : local80 - 4096;
				@Pc(97) int local97 = local39 + this.anInt1589;
				@Pc(108) int local108 = local97 >= -2048 ? local97 : local97 + 4096;
				@Pc(117) int local117 = local108 > 2048 ? local108 - 4096 : local108;
				@Pc(122) int local122 = this.anInt1585 + local29;
				@Pc(133) int local133 = local122 >= -2048 ? local122 : local122 + 4096;
				@Pc(142) int local142 = local133 <= 2048 ? local133 : local133 - 4096;
				local19[local31] = this.method1168(local91, local69) || this.method1167(local117, local142) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1590 = arg0.method1270();
		} else if (arg1 == 1) {
			this.anInt1584 = arg0.method1270();
		} else if (arg1 == 2) {
			this.anInt1589 = arg0.method1270();
		} else if (arg1 == 3) {
			this.anInt1585 = arg0.method1270();
		} else if (arg1 == 4) {
			this.anInt1591 = arg0.method1270();
		} else if (arg1 == 5) {
			this.anInt1597 = arg0.method1270();
		} else if (arg1 == 6) {
			this.anInt1596 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)Z")
	private boolean method1167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt1591 * (arg0 + arg1) >> 12;
		@Pc(27) int local27 = Static1.anIntArray93[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt1591;
		@Pc(41) int local41 = (local34 << 12) / this.anInt1596;
		@Pc(48) int local48 = this.anInt1597 * local41 >> 12;
		return local48 > arg1 - arg0 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		Static198.method3152();
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(III)Z")
	private boolean method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt1591 * (arg1 - arg0) >> 12;
		@Pc(27) int local27 = Static1.anIntArray93[local8 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt1591;
		@Pc(41) int local41 = (local34 << 12) / this.anInt1596;
		@Pc(48) int local48 = this.anInt1597 * local41 >> 12;
		return local48 > arg1 + arg0 && -local48 < arg1 + arg0;
	}
}
