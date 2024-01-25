import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class5_Sub2_Sub7 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(25) int[][] local25 = this.method5818(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			for (@Pc(39) int local39 = 0; local39 < Static15.anInt493; local39++) {
				local15[local39] = (local37[local39] + local29[local39] + local33[local39]) / 3;
			}
		}
		return local15;
	}
}
