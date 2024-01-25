import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class2_Sub3_Sub16 extends Class2_Sub3 {

	@OriginalMember(owner = "client!jia", name = "I", descriptor = "Z")
	private boolean aBoolean435 = true;

	@OriginalMember(owner = "client!jia", name = "P", descriptor = "Z")
	private boolean aBoolean436 = true;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jia", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(29) int[][] local29 = this.method9147(this.aBoolean436 ? Static591.anInt6375 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean435) {
				for (local58 = 0; local58 < Static222.anInt4971; local58++) {
					local45[local58] = local33[Static620.anInt10845 - local58];
					local49[local58] = local37[Static620.anInt10845 - local58];
					local53[local58] = local41[Static620.anInt10845 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static222.anInt4971; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean435 = arg0.method8383() == 1;
		} else if (arg1 == 1) {
			this.aBoolean436 = arg0.method8383() == 1;
		} else if (arg1 == 2) {
			super.aBoolean748 = arg0.method8383() == 1;
		}
	}

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(35) int[] local35 = this.method9156(this.aBoolean436 ? Static591.anInt6375 - arg0 : arg0, 0);
			if (this.aBoolean435) {
				for (@Pc(48) int local48 = 0; local48 < Static222.anInt4971; local48++) {
					local16[local48] = local35[Static620.anInt10845 - local48];
				}
			} else {
				Static653.method7724(local35, 0, local16, 0, Static222.anInt4971);
			}
		}
		return local16;
	}
}
