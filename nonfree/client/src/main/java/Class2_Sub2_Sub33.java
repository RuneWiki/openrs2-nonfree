import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class2_Sub2_Sub33 extends Class2_Sub2 {

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(27) int local27 = Static211.anIntArray576[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static153.anInt3070; local29++) {
				local11[local29] = this.method7435(local27, Static260.anIntArray327[local29]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IZI)I")
	private int method7435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 + arg0 * 57;
		@Pc(25) int local25 = local19 << 1 ^ local19;
		return 4096 - (local25 * (local25 * local25 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
