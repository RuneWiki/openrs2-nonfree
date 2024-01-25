import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class2_Sub6_Sub23 extends Class2_Sub6 {

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
	private int anInt7160 = 32768;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(25) int[] local25 = this.method8461(1, arg0);
			@Pc(31) int[] local31 = this.method8461(2, arg0);
			@Pc(35) int[] local35 = local15[0];
			@Pc(39) int[] local39 = local15[1];
			@Pc(43) int[] local43 = local15[2];
			for (@Pc(45) int local45 = 0; local45 < Static51.anInt1085; local45++) {
				@Pc(57) int local57 = local25[local45] * 255 >> 12 & 0xFF;
				@Pc(66) int local66 = local31[local45] * this.anInt7160 >> 12;
				@Pc(74) int local74 = local66 * Static111.anIntArray141[local57] >> 12;
				@Pc(82) int local82 = local66 * Static123.anIntArray155[local57] >> 12;
				@Pc(90) int local90 = Static332.anInt5256 & local45 + (local74 >> 12);
				@Pc(98) int local98 = Static53.anInt1098 & (local82 >> 12) + arg0;
				@Pc(104) int[][] local104 = this.method8465(0, local98);
				local35[local45] = local104[0][local90];
				local39[local45] = local104[1][local90];
				local43[local45] = local104[2][local90];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		Static212.method2948();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt7160 = arg1.method8546() << 4;
		} else if (arg0 == 1) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(27) int[] local27 = this.method8461(1, arg0);
			@Pc(33) int[] local33 = this.method8461(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static51.anInt1085; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = local33[local35] * this.anInt7160 >> 12;
				@Pc(62) int local62 = Static111.anIntArray141[local45] * local54 >> 12;
				@Pc(70) int local70 = local54 * Static123.anIntArray155[local45] >> 12;
				@Pc(78) int local78 = (local62 >> 12) + local35 & Static332.anInt5256;
				@Pc(86) int local86 = Static53.anInt1098 & (local70 >> 12) + arg0;
				@Pc(92) int[] local92 = this.method8461(0, local86);
				local17[local35] = local92[local78];
			}
		}
		return local17;
	}
}
