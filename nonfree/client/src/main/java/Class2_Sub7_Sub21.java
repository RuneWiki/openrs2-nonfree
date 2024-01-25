import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class2_Sub7_Sub21 extends Class2_Sub7 {

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(28) int[][] local28 = this.method7589(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static352.anInt6485; local54++) {
				local44[local54] = 4096 - local32[local54];
				local48[local54] = 4096 - local36[local54];
				local52[local54] = 4096 - local40[local54];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(26) int[] local26 = this.method7581(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static352.anInt6485; local28++) {
				local11[local28] = 4096 - local26[local28];
			}
		}
		return local11;
	}
}
