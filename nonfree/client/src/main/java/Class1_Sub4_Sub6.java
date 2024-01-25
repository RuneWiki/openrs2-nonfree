import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class1_Sub4_Sub6 extends Class1_Sub4 {

	static {
		new Class7(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(29) int[][] local29 = this.method5956(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static66.anInt1511; local55++) {
				local45[local55] = 4096 - local33[local55];
				local49[local55] = 4096 - local37[local55];
				local53[local55] = 4096 - local41[local55];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(29) int[] local29 = this.method5958(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static66.anInt1511; local31++) {
				local19[local31] = 4096 - local29[local31];
			}
		}
		return local19;
	}
}
