import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class2_Sub4_Sub11 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(35) int[] local35 = this.method5600(this.aBoolean127 ? Static283.anInt4900 - arg0 : arg0, 0);
			if (this.aBoolean128) {
				for (@Pc(48) int local48 = 0; local48 < Static76.anInt1458; local48++) {
					local11[local48] = local35[Static269.anInt4657 - local48];
				}
			} else {
				Static399.method2489(local35, 0, local11, 0, Static76.anInt1458);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(29) int[][] local29 = this.method5591(this.aBoolean127 ? Static283.anInt4900 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean128) {
				for (local58 = 0; local58 < Static76.anInt1458; local58++) {
					local45[local58] = local33[Static269.anInt4657 - local58];
					local49[local58] = local37[Static269.anInt4657 - local58];
					local53[local58] = local41[Static269.anInt4657 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static76.anInt1458; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean128 = arg0.method5350() == 1;
		} else if (arg1 == 1) {
			this.aBoolean127 = arg0.method5350() == 1;
		} else if (arg1 == 2) {
			super.aBoolean465 = arg0.method5350() == 1;
		}
	}
}
