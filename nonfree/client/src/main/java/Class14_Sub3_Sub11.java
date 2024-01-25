import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class14_Sub3_Sub11 extends Class14_Sub3 {

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(27) int local27 = Static213.anIntArray381[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static294.anInt5657; local29++) {
				local11[local29] = this.method2322(Static346.anIntArray638[local29], local27) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(III)I")
	private int method2322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
