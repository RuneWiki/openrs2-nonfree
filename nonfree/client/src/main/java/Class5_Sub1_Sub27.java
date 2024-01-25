import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class5_Sub1_Sub27 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "Z")
	private boolean aBoolean497 = true;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "Z")
	private boolean aBoolean498 = true;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(29) int[][] local29 = this.method7154(0, this.aBoolean498 ? Static160.anInt3274 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean497) {
				for (local58 = 0; local58 < Static147.anInt3075; local58++) {
					local45[local58] = local33[Static497.anInt9138 - local58];
					local49[local58] = local37[Static497.anInt9138 - local58];
					local53[local58] = local41[Static497.anInt9138 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static147.anInt3075; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.aBoolean497 = arg1.method4220() == 1;
		} else if (arg0 == 1) {
			this.aBoolean498 = arg1.method4220() == 1;
		} else if (arg0 == 2) {
			super.aBoolean642 = arg1.method4220() == 1;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(37) int[] local37 = this.method7160(0, this.aBoolean498 ? Static160.anInt3274 - arg0 : arg0);
			if (this.aBoolean497) {
				for (@Pc(42) int local42 = 0; local42 < Static147.anInt3075; local42++) {
					local19[local42] = local37[Static497.anInt9138 - local42];
				}
			} else {
				Static553.method2529(local37, 0, local19, 0, Static147.anInt3075);
			}
		}
		return local19;
	}
}
