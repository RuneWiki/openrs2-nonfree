import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(III)I")
	private int method3301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 * 57 + arg0;
		@Pc(19) int local19 = local13 ^ local13 << 1;
		return 4096 - ((local19 * 15731 * local19 + 789221) * local19 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(19) int local19 = Static305.anIntArray416[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static236.anInt4609; local21++) {
				local11[local21] = this.method3301(Static201.anIntArray324[local21], local19) % 4096;
			}
		}
		return local11;
	}
}
