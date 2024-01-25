import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class1_Sub3_Sub34 extends Class1_Sub3 {

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5532(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static153.anInt3378; local31++) {
				local11[local31] = 4096 - local29[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(28) int[][] local28 = this.method5528(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			for (@Pc(54) int local54 = 0; local54 < Static153.anInt3378; local54++) {
				local44[local54] = 4096 - local32[local54];
				local48[local54] = 4096 - local36[local54];
				local52[local54] = 4096 - local40[local54];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}
}
