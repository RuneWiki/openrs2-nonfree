import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)I")
	private int method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 + arg1 * 57;
		@Pc(24) int local24 = local18 ^ local18 << 1;
		return 4096 - ((local24 * 15731 * local24 + 789221) * local24 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(23) int local23 = Class208.lb[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static339.anInt6735; local25++) {
				local15[local25] = this.method1186(Static212.anIntArray325[local25], local23) % 4096;
			}
		}
		return local15;
	}
}
