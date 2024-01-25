import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class2_Sub2_Sub30 extends Class2_Sub2 {

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(19) int local19 = Static318.anIntArray565[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static429.anInt6518; local21++) {
				local11[local21] = this.method5038(Static365.anIntArray535[local21], local19) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(III)I")
	private int method5038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 + arg1 * 57;
		@Pc(24) int local24 = local18 << 1 ^ local18;
		return 4096 - (Integer.MAX_VALUE & (local24 * local24 * 15731 + 789221) * local24 + 1376312589) / 262144;
	}
}
