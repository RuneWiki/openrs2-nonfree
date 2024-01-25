import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(29) int[][] local29 = this.method6006(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static85.anInt1910; local43++) {
				local19[local43] = (local33[local43] + local37[local43] + local41[local43]) / 3;
			}
		}
		return local19;
	}
}
