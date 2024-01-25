import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class3_Sub2_Sub14 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(25) int[][] local25 = this.method5899(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			for (@Pc(39) int local39 = 0; local39 < Static406.anInt6694; local39++) {
				local15[local39] = (local37[local39] + local29[local39] + local33[local39]) / 3;
			}
		}
		return local15;
	}
}
