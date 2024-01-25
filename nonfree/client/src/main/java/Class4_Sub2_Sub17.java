import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class4_Sub2_Sub17 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(25) int[][] local25 = this.method8772(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			for (@Pc(39) int local39 = 0; local39 < Static269.anInt4330; local39++) {
				local11[local39] = (local37[local39] + local33[local39] + local29[local39]) / 3;
			}
		}
		return local11;
	}
}
