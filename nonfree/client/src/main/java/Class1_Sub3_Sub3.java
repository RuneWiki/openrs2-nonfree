import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(17) int[] local17 = this.method3468(arg0, 0);
			for (@Pc(19) int local19 = 0; local19 < Static76.anInt1531; local19++) {
				local7[local19] = 4096 - local17[local19];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(26) int[][] local26 = this.method3465(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local16[1];
			@Pc(42) int[] local42 = local26[2];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[0];
			for (@Pc(52) int local52 = 0; local52 < Static76.anInt1531; local52++) {
				local50[local52] = 4096 - local30[local52];
				local38[local52] = 4096 - local34[local52];
				local46[local52] = 4096 - local42[local52];
			}
		}
		return local16;
	}
}
