import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(24) int local24 = Static392.anIntArray673[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static254.anInt4973; local26++) {
				local16[local26] = this.method3787(local24, Static457.anIntArray732[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(III)I")
	private int method3787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589) / 262144;
	}
}
