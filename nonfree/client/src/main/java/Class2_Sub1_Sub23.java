import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(24) int local24 = Static81.anIntArray174[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static135.anInt2897; local26++) {
				local16[local26] = this.method2580(local24, Static107.anIntArray304[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZI)I")
	private int method2580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 << 1 ^ local10;
		return 4096 - (Integer.MAX_VALUE & local16 * (local16 * local16 * 15731 + 789221) + 1376312589) / 262144;
	}
}
