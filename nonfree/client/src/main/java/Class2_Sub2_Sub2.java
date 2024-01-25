import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
	private int anInt110 = 0;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
	private int anInt107 = 4096;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(21) int[][] local21 = this.method5887(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static339.anInt6735; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt110 > local53) {
					local37[local47] = this.anInt110;
				} else if (this.anInt107 < local53) {
					local37[local47] = this.anInt107;
				} else {
					local37[local47] = local53;
				}
				if (this.anInt110 > local57) {
					local41[local47] = this.anInt110;
				} else if (this.anInt107 < local57) {
					local41[local47] = this.anInt107;
				} else {
					local41[local47] = local57;
				}
				if (this.anInt110 > local61) {
					local45[local47] = this.anInt110;
				} else if (local61 <= this.anInt107) {
					local45[local47] = local61;
				} else {
					local45[local47] = this.anInt107;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(21) int[] local21 = this.method5876(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static339.anInt6735; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt110) {
					local11[local23] = this.anInt110;
				} else if (local29 > this.anInt107) {
					local11[local23] = this.anInt107;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt110 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt107 = arg1.method4464();
		} else if (arg0 == 2) {
			super.aBoolean597 = arg1.method4421() == 1;
		}
	}
}
