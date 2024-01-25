import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class5_Sub1_Sub5 extends Class5_Sub1 {

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIB)I")
	private int method1705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local17 ^ local17 << 1;
		return 4096 - (Integer.MAX_VALUE & local23 * (local23 * local23 * 15731 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(19) int local19 = Static23.anIntArray27[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static648.anInt9588; local21++) {
				local11[local21] = this.method1705(Static293.anIntArray288[local21], local19) % 4096;
			}
		}
		return local11;
	}
}
