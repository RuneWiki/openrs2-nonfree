import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wja")
public final class Class6_Sub8_Sub39 extends Class6_Sub8 {

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(29) int[][] local29 = this.method8928(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static83.anInt1268; local43++) {
				local19[local43] = (local41[local43] + local33[local43] + local37[local43]) / 3;
			}
		}
		return local19;
	}
}
