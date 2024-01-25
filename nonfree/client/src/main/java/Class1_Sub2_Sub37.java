import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class1_Sub2_Sub37 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(26) int[][] local26 = this.method5867(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static410.anInt7198; local40++) {
				local11[local40] = (local30[local40] + local34[local40] + local38[local40]) / 3;
			}
		}
		return local11;
	}
}
