import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(29) int[][] local29 = this.method4937(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static114.anInt1359; local43++) {
				local19[local43] = (local41[local43] + local37[local43] + local33[local43]) / 3;
			}
		}
		return local19;
	}
}
