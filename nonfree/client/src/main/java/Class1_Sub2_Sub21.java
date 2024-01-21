import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(19) int local19 = Static37.anIntArray125[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static110.anInt2825; local21++) {
				local11[local21] = this.method1524(local19, Static86.anIntArray294[local21]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)I")
	private int method1524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - (Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589) / 262144;
	}
}
