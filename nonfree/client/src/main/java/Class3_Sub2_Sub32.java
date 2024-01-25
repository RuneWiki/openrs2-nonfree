import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class3_Sub2_Sub32 extends Class3_Sub2 {

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIB)I")
	private int method4890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 1;
		return 4096 - ((local16 * 15731 * local16 + 789221) * local16 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(27) int local27 = Static441.anIntArray522[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static406.anInt6694; local29++) {
				local11[local29] = this.method4890(local27, Static86.anIntArray125[local29]) % 4096;
			}
		}
		return local11;
	}
}
