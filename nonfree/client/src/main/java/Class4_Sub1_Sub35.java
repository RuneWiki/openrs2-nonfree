import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class4_Sub1_Sub35 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(18) int[][] local18 = this.method4723(0, arg0);
			@Pc(22) int[] local22 = local18[2];
			@Pc(26) int[] local26 = local18[1];
			@Pc(30) int[] local30 = local18[0];
			for (@Pc(32) int local32 = 0; local32 < Static73.anInt1626; local32++) {
				local7[local32] = (local26[local32] + local30[local32] + local22[local32]) / 3;
			}
		}
		return local7;
	}
}
