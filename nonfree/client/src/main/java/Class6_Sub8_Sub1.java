import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class6_Sub8_Sub1 extends Class6_Sub8 {

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(IIB)I")
	private int method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local23 * (local23 * 15731 * local23 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(27) int local27 = Static424.anIntArray466[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static83.anInt1268; local29++) {
				local11[local29] = this.method525(Static2.anIntArray1[local29], local27) % 4096;
			}
		}
		return local11;
	}
}
