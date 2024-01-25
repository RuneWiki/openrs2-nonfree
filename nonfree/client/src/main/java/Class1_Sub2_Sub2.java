import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)I")
	private int method81(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(24) int local24 = Static394.anIntArray751[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static158.anInt2658; local26++) {
				local16[local26] = this.method81(Static87.anIntArray211[local26], local24) % 4096;
			}
		}
		return local16;
	}
}
