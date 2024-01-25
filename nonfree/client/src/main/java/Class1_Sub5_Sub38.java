import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class1_Sub5_Sub38 extends Class1_Sub5 {

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIB)I")
	private int method5636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 1;
		return 4096 - (local16 * (local16 * 15731 * local16 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(25) int local25 = Static191.anIntArray379[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static75.anInt1566; local27++) {
				local11[local27] = this.method5636(local25, Static49.anIntArray492[local27]) % 4096;
			}
		}
		return local11;
	}
}
