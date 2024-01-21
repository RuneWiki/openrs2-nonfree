import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(21) int local21 = Static22.anIntArray68[arg0];
			for (@Pc(23) int local23 = 0; local23 < Static176.anInt3921; local23++) {
				local13[local23] = this.method2849(local21, Static171.anIntArray439[local23]) % 4096;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZ)I")
	private int method2849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589) / 262144;
	}
}
