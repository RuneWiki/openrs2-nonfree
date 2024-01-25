import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class6_Sub4_Sub8 extends Class6_Sub4 {

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZI)I")
	private int method2434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local10 ^ local10 << 1;
		return 4096 - (Integer.MAX_VALUE & (local21 * 15731 * local21 + 789221) * local21 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(24) int local24 = Static629.anIntArray635[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static6.anInt111; local26++) {
				local11[local26] = this.method2434(Static284.anIntArray482[local26], local24) % 4096;
			}
		}
		return local11;
	}
}
