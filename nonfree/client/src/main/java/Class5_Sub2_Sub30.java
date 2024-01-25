import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class5_Sub2_Sub30 extends Class5_Sub2 {

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(23) int local23 = Static287.anIntArray413[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static15.anInt493; local25++) {
				local15[local25] = this.method4764(local23, Static257.anIntArray386[local25]) % 4096;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I")
	private int method4764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 1;
		return 4096 - (Integer.MAX_VALUE & (local21 * 15731 * local21 + 789221) * local21 + 1376312589) / 262144;
	}
}
