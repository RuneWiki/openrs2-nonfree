import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class4_Sub4_Sub39 extends Class4_Sub4 {

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(25) int local25 = Static64.anIntArray148[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static124.anInt3576; local27++) {
				local11[local27] = this.method5396(local25, Static149.anIntArray298[local27]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(III)I")
	private int method5396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
