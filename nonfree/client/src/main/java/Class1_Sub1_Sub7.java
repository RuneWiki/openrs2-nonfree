import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(28) int[][] local28 = this.method3397(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[2];
			@Pc(40) int[] local40 = local28[1];
			for (@Pc(42) int local42 = 0; local42 < Static107.anInt2321; local42++) {
				local11[local42] = (local40[local42] + local32[local42] + local36[local42]) / 3;
			}
		}
		return local11;
	}
}
