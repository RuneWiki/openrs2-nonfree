import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class3_Sub2_Sub35 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(III)I")
	private int method2973(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(19) int local19 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & (local19 * local19 * 15731 + 789221) * local19 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(27) int local27 = Static34.anIntArray37[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static190.anInt3865; local29++) {
				local19[local29] = this.method2973(local27, Static133.anIntArray187[local29]) % 4096;
			}
		}
		return local19;
	}
}
