import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
	private int anInt7836 = 4;

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
	private int anInt7839 = 4;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(28) int local28 = Static279.anInt4906 / this.anInt7839;
			@Pc(33) int local33 = Static52.anInt1010 / this.anInt7836;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local33 <= 0) {
				local44 = this.method7709(0, 0);
			} else {
				local50 = arg0 % local33;
				local44 = this.method7709(Static52.anInt1010 * local50 / local33, 0);
			}
			for (local50 = 0; local50 < Static279.anInt4906; local50++) {
				if (local28 <= 0) {
					local11[local50] = local44[0];
				} else {
					@Pc(78) int local78 = local50 % local28;
					local11[local50] = local44[local78 * Static279.anInt4906 / local28];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7839 = arg0.method5750();
		} else if (arg1 == 1) {
			this.anInt7836 = arg0.method5750();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(20) int local20 = Static279.anInt4906 / this.anInt7839;
			@Pc(25) int local25 = Static52.anInt1010 / this.anInt7836;
			@Pc(41) int[][] local41;
			if (local25 > 0) {
				@Pc(31) int local31 = arg0 % local25;
				local41 = this.method7700(local31 * Static52.anInt1010 / local25, 0);
			} else {
				local41 = this.method7700(0, 0);
			}
			@Pc(55) int[] local55 = local41[0];
			@Pc(59) int[] local59 = local41[1];
			@Pc(63) int[] local63 = local41[2];
			@Pc(67) int[] local67 = local11[0];
			@Pc(71) int[] local71 = local11[1];
			@Pc(75) int[] local75 = local11[2];
			for (@Pc(77) int local77 = 0; local77 < Static279.anInt4906; local77++) {
				@Pc(83) int local83;
				if (local20 <= 0) {
					local83 = 0;
				} else {
					@Pc(89) int local89 = local77 % local20;
					local83 = Static279.anInt4906 * local89 / local20;
				}
				local67[local77] = local55[local83];
				local71[local77] = local59[local83];
				local75[local77] = local63[local83];
			}
		}
		return local11;
	}
}
