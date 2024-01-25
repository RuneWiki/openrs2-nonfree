import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub4_Sub20 extends Class1_Sub4 {

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
	private int anInt4359 = 3072;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	private int anInt4356 = 1024;

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
	private int anInt4364 = 2048;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		this.anInt4364 = this.anInt4359 - this.anInt4356;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(29) int[][] local29 = this.method5956(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static66.anInt1511; local55++) {
				local45[local55] = this.anInt4356 + (this.anInt4364 * local33[local55] >> 12);
				local49[local55] = (this.anInt4364 * local37[local55] >> 12) + this.anInt4356;
				local53[local55] = (this.anInt4364 * local41[local55] >> 12) + this.anInt4356;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt4356 = arg1.method5362();
		} else if (arg0 == 1) {
			this.anInt4359 = arg1.method5362();
		} else if (arg0 == 2) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(26) int[] local26 = this.method5958(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static66.anInt1511; local28++) {
				local16[local28] = this.anInt4356 + (this.anInt4364 * local26[local28] >> 12);
			}
		}
		return local16;
	}
}
