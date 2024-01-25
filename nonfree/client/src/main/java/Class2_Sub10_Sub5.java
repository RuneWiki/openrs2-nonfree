import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class2_Sub10_Sub5 extends Class2_Sub10 {

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZII)I")
	private int method1525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = arg0 * 57 + arg1;
		@Pc(28) int local28 = local22 << 1 ^ local22;
		return 4096 - (local28 * (local28 * local28 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(24) int local24 = Static353.anIntArray424[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static93.anInt1862; local26++) {
				local16[local26] = this.method1525(local24, Static561.anIntArray649[local26]) % 4096;
			}
		}
		return local16;
	}
}
