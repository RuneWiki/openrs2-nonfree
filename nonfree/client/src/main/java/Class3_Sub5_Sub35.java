import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class3_Sub5_Sub35 extends Class3_Sub5 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(27) int local27 = Static94.anIntArray277[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static104.anInt2195; local29++) {
				local19[local29] = this.method2995(local27, Static124.anIntArray355[local29]) % 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(III)I")
	private int method2995(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
