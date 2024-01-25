import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)I")
	private int method1056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(24) int[] local24 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(32) int local32 = Static7.anIntArray20[arg0];
			for (@Pc(34) int local34 = 0; local34 < Static452.anInt7734; local34++) {
				local24[local34] = this.method1056(local32, Static228.anIntArray442[local34]) % 4096;
			}
		}
		return local24;
	}
}
