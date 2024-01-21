import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(24) int[][] local24 = this.method3390(arg0, 0);
			@Pc(28) int[] local28 = local24[0];
			@Pc(32) int[] local32 = local24[1];
			@Pc(36) int[] local36 = local24[2];
			for (@Pc(38) int local38 = 0; local38 < Static22.anInt596; local38++) {
				local14[local38] = (local36[local38] + local28[local38] + local32[local38]) / 3;
			}
		}
		return local14;
	}
}
