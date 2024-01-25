import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class6_Sub4_Sub34 extends Class6_Sub4 {

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(26) int[][] local26 = this.method8319(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static6.anInt111; local40++) {
				local16[local40] = (local38[local40] + local30[local40] + local34[local40]) / 3;
			}
		}
		return local16;
	}
}
