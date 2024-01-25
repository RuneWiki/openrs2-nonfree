import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class7_Sub4_Sub2 extends Class7_Sub4 {

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(29) int[][] local29 = this.method5638(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static201.anInt4174; local43++) {
				local11[local43] = (local41[local43] + local33[local43] + local37[local43]) / 3;
			}
		}
		return local11;
	}
}
