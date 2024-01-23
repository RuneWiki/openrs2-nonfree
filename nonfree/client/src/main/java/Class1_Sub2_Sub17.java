import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)I")
	private int method2260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(29) int local29 = local9 ^ local9 << 1;
		return 4096 - (Integer.MAX_VALUE & local29 * (local29 * local29 * 15731 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(28) int local28 = Static7.anIntArray13[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static299.anInt5670; local30++) {
				local19[local30] = this.method2260(Static310.anIntArray108[local30], local28) % 4096;
			}
		}
		return local19;
	}
}
