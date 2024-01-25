import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class5_Sub6_Sub35 extends Class5_Sub6 {

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZI)I")
	private int method7518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local10 ^ local10 << 1;
		return 4096 - (Integer.MAX_VALUE & local21 * (local21 * 15731 * local21 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(24) int local24 = Static508.anIntArray471[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static421.anInt7443; local26++) {
				local11[local26] = this.method7518(Static207.anIntArray185[local26], local24) % 4096;
			}
		}
		return local11;
	}
}
