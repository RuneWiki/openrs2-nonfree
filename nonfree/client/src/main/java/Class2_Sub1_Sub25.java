import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub1_Sub25 extends Class2_Sub1 {

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(29) int[][] local29 = this.method3205(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[0];
			for (@Pc(43) int local43 = 0; local43 < Static62.anInt1675; local43++) {
				local19[local43] = (local33[local43] + local41[local43] + local37[local43]) / 3;
			}
		}
		return local19;
	}
}
