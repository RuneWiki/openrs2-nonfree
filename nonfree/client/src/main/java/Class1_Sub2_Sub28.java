import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class1_Sub2_Sub28 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
	private int anInt4549 = 4096;

	@OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
	private int anInt4547 = 0;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(25) int[][] local25 = this.method4575(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local7[0];
			@Pc(41) int[] local41 = local25[2];
			@Pc(45) int[] local45 = local7[1];
			@Pc(49) int[] local49 = local7[2];
			for (@Pc(51) int local51 = 0; local51 < Static299.anInt5670; local51++) {
				@Pc(62) int local62 = local29[local51];
				@Pc(66) int local66 = local41[local51];
				@Pc(70) int local70 = local33[local51];
				if (local62 < this.anInt4547) {
					local37[local51] = this.anInt4547;
				} else if (local62 <= this.anInt4549) {
					local37[local51] = local62;
				} else {
					local37[local51] = this.anInt4549;
				}
				if (this.anInt4547 > local70) {
					local45[local51] = this.anInt4547;
				} else if (local70 > this.anInt4549) {
					local45[local51] = this.anInt4549;
				} else {
					local45[local51] = local70;
				}
				if (this.anInt4547 > local66) {
					local49[local51] = this.anInt4547;
				} else if (this.anInt4549 >= local66) {
					local49[local51] = local66;
				} else {
					local49[local51] = this.anInt4549;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4547 = arg0.method2593();
		} else if (arg1 == 1) {
			this.anInt4549 = arg0.method2593();
		} else if (arg1 == 2) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(31) int[] local31 = this.method4570(arg0, 0);
			for (@Pc(33) int local33 = 0; local33 < Static299.anInt5670; local33++) {
				@Pc(44) int local44 = local31[local33];
				if (local44 < this.anInt4547) {
					local18[local33] = this.anInt4547;
				} else if (this.anInt4549 < local44) {
					local18[local33] = this.anInt4549;
				} else {
					local18[local33] = local44;
				}
			}
		}
		return local18;
	}
}
