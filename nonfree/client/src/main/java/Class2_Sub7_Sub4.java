import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class2_Sub7_Sub4 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(24) int local24 = Static313.anIntArray521[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static352.anInt6485; local26++) {
				local16[local26] = this.method899(local24, Static427.anIntArray602[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZII)I")
	private int method899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 1;
		return 4096 - (local16 * (local16 * 15731 * local16 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
