import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class11_Sub2_Sub14 extends Class11_Sub2 {

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(19) int local19 = Static155.anIntArray196[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static339.anInt6549; local21++) {
				local11[local21] = this.method2061(Static73.anIntArray91[local21], local19) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(III)I")
	private int method2061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local10 << 1 ^ local10;
		return 4096 - (Integer.MAX_VALUE & local21 * (local21 * 15731 * local21 + 789221) + 1376312589) / 262144;
	}
}
