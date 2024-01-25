import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(29) int[][] local29 = this.method8672(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static201.anInt3738; local43++) {
				local19[local43] = (local37[local43] + local33[local43] + local41[local43]) / 3;
			}
		}
		return local19;
	}
}
