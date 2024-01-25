import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class2_Sub6_Sub30 extends Class2_Sub6 {

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(28) int[][] local28 = this.method8465(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			for (@Pc(42) int local42 = 0; local42 < Static51.anInt1085; local42++) {
				local16[local42] = (local40[local42] + local36[local42] + local32[local42]) / 3;
			}
		}
		return local16;
	}
}
