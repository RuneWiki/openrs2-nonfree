import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class5_Sub1_Sub14 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
	private int anInt3571 = 4096;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
	private int anInt3578 = 4096;

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
	private int anInt3575 = 4096;

	static {
		new Class40("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)[[I")
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
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local65 == local69) {
					local45[local55] = this.anInt3578 * local61 >> 12;
					local49[local55] = local65 * this.anInt3571 >> 12;
					local53[local55] = this.anInt3575 * local69 >> 12;
				} else {
					local45[local55] = this.anInt3578;
					local49[local55] = this.anInt3571;
					local53[local55] = this.anInt3575;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3578 = arg1.method4227();
		} else if (arg0 == 1) {
			this.anInt3571 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt3575 = arg1.method4227();
		}
	}
}
