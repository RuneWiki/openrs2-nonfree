import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class14_Sub3_Sub33 extends Class14_Sub3 {

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(26) int[][] local26 = this.method5997(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static294.anInt5657; local40++) {
				local11[local40] = (local38[local40] + local34[local40] + local30[local40]) / 3;
			}
		}
		return local11;
	}
}
