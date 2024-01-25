import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class3_Sub2_Sub20 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZI)I")
	private int method4599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 1;
		return 4096 - (Integer.MAX_VALUE & (local15 * local15 * 15731 + 789221) * local15 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(19) int local19 = Static376.anIntArray665[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static201.anInt3738; local21++) {
				local11[local21] = this.method4599(Static57.anIntArray536[local21], local19) % 4096;
			}
		}
		return local11;
	}
}
