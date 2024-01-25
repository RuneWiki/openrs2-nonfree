import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(III)I")
	private int method356(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 ^ local9 << 1;
		return 4096 - (Integer.MAX_VALUE & local15 * (local15 * local15 * 15731 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(26) int local26 = Static346.anIntArray401[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static148.anInt2666; local28++) {
				local18[local28] = this.method356(Static224.anIntArray234[local28], local26) % 4096;
			}
		}
		return local18;
	}
}
