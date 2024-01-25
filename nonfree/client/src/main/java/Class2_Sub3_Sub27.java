import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class2_Sub3_Sub27 extends Class2_Sub3 {

	static {
		new Class350("", 73);
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(III)I")
	private int method7666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 1;
		return 4096 - ((local21 * 15731 * local21 + 789221) * local21 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(19) int local19 = Static547.anIntArray641[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static222.anInt4971; local21++) {
				local11[local21] = this.method7666(local19, Static464.anIntArray556[local21]) % 4096;
			}
		}
		return local11;
	}
}
