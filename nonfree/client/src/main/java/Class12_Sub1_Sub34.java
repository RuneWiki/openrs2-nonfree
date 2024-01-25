import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class12_Sub1_Sub34 extends Class12_Sub1 {

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(25) int[][] local25 = this.method7790(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			for (@Pc(39) int local39 = 0; local39 < Static357.anInt6670; local39++) {
				local11[local39] = (local29[local39] + local33[local39] + local37[local39]) / 3;
			}
		}
		return local11;
	}
}
