import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class5_Sub1_Sub18 extends Class5_Sub1 {

	@OriginalMember(owner = "client!it", name = "H", descriptor = "I")
	private int anInt4146 = 0;

	@OriginalMember(owner = "client!it", name = "K", descriptor = "I")
	private int anInt4148 = 4096;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4146 = arg1.method4227();
		} else if (arg0 == 1) {
			this.anInt4148 = arg1.method4227();
		} else if (arg0 == 2) {
			super.aBoolean642 = arg1.method4220() == 1;
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(29) int[][] local29 = this.method7154(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static147.anInt3075; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt4146 > local61) {
					local45[local55] = this.anInt4146;
				} else if (this.anInt4148 >= local61) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt4148;
				}
				if (local65 < this.anInt4146) {
					local49[local55] = this.anInt4146;
				} else if (this.anInt4148 < local65) {
					local49[local55] = this.anInt4148;
				} else {
					local49[local55] = local65;
				}
				if (local69 < this.anInt4146) {
					local53[local55] = this.anInt4146;
				} else if (this.anInt4148 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt4148;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(29) int[] local29 = this.method7160(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static147.anInt3075; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt4146 > local37) {
					local11[local31] = this.anInt4146;
				} else if (this.anInt4148 >= local37) {
					local11[local31] = local37;
				} else {
					local11[local31] = this.anInt4148;
				}
			}
		}
		return local11;
	}
}
