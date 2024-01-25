import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class2_Sub6_Sub36 extends Class2_Sub6 {

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(24) int local24 = Static564.anIntArray630[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static51.anInt1085; local26++) {
				local16[local26] = this.method8263(Static586.anIntArray653[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIB)I")
	private int method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 << 1 ^ local10;
		return 4096 - (Integer.MAX_VALUE & (local16 * 15731 * local16 + 789221) * local16 + 1376312589) / 262144;
	}
}
