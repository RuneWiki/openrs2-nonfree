import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class3_Sub4_Sub7 extends Class3_Sub4 {

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIB)I")
	private int method1297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (Integer.MAX_VALUE & (local20 * 15731 * local20 + 789221) * local20 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(24) int local24 = Static317.anIntArray337[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static148.anInt2687; local26++) {
				local16[local26] = this.method1297(Static401.anIntArray419[local26], local24) % 4096;
			}
		}
		return local16;
	}
}
