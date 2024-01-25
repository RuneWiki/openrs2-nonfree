import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class2_Sub4_Sub25 extends Class2_Sub4 {

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BII)I")
	private int method3994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local9 ^ local9 << 1;
		return 4096 - (local23 * (local23 * local23 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(27) int local27 = Static347.anIntArray1193[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static76.anInt1458; local29++) {
				local19[local29] = this.method3994(local27, Static40.anIntArray173[local29]) % 4096;
			}
		}
		return local19;
	}
}
