import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
	private int anInt1903 = 0;

	@OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
	private int anInt1907 = 4096;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(26) int[] local26 = this.method3303(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static176.anInt3921; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt1903) {
					local12[local28] = this.anInt1903;
				} else if (local34 > this.anInt1907) {
					local12[local28] = this.anInt1907;
				} else {
					local12[local28] = local34;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1903 = arg1.method1753();
		} else if (arg0 == 1) {
			this.anInt1907 = arg1.method1753();
		} else if (arg0 == 2) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(19) int[][] local19 = this.method3307(0, arg0);
			@Pc(23) int[] local23 = local19[2];
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local9[0];
			@Pc(39) int[] local39 = local9[1];
			@Pc(43) int[] local43 = local9[2];
			for (@Pc(45) int local45 = 0; local45 < Static176.anInt3921; local45++) {
				@Pc(51) int local51 = local27[local45];
				@Pc(55) int local55 = local31[local45];
				@Pc(59) int local59 = local23[local45];
				if (this.anInt1903 > local51) {
					local35[local45] = this.anInt1903;
				} else if (this.anInt1907 < local51) {
					local35[local45] = this.anInt1907;
				} else {
					local35[local45] = local51;
				}
				if (this.anInt1903 > local55) {
					local39[local45] = this.anInt1903;
				} else if (local55 > this.anInt1907) {
					local39[local45] = this.anInt1907;
				} else {
					local39[local45] = local55;
				}
				if (this.anInt1903 > local59) {
					local43[local45] = this.anInt1903;
				} else if (this.anInt1907 < local59) {
					local43[local45] = this.anInt1907;
				} else {
					local43[local45] = local59;
				}
			}
		}
		return local9;
	}
}
