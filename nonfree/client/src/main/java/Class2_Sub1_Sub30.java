import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub1_Sub30 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(29) int[] local29 = this.method2796(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static120.anInt2812; local31++) {
				local7[local31] = 4096 - local29[local31];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean175 = arg0.method1402() == 1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(26) int[][] local26 = this.method2794(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static120.anInt2812; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local38[local52];
				local50[local52] = 4096 - local34[local52];
			}
		}
		return local16;
	}
}
