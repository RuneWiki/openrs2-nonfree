import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(29) int[] local29 = this.method9042(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static597.anInt10025; local31++) {
				local11[local31] = 4096 - local29[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(29) int[][] local29 = this.method9033(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static597.anInt10025; local55++) {
				local45[local55] = 4096 - local33[local55];
				local49[local55] = 4096 - local37[local55];
				local53[local55] = 4096 - local41[local55];
			}
		}
		return local11;
	}
}
