import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class3_Sub2_Sub32 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIB)I")
	private int method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local10 << 1 ^ local10;
		return 4096 - (Integer.MAX_VALUE & local21 * (local21 * 15731 * local21 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(19) int local19 = Static328.anIntArray387[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static164.anInt8839; local21++) {
				local11[local21] = this.method7239(Static352.anIntArray400[local21], local19) % 4096;
			}
		}
		return local11;
	}
}
