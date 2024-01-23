import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(26) int[][] local26 = this.method3737(0, arg0);
			@Pc(30) int[] local30 = local16[2];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local26[2];
			@Pc(46) int[] local46 = local16[0];
			@Pc(50) int[] local50 = local26[0];
			for (@Pc(52) int local52 = 0; local52 < Static157.anInt3431; local52++) {
				local46[local52] = 4096 - local50[local52];
				local34[local52] = 4096 - local38[local52];
				local30[local52] = 4096 - local42[local52];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(17) int[] local17 = this.method3733(arg0, 0);
			for (@Pc(19) int local19 = 0; local19 < Static157.anInt3431; local19++) {
				local7[local19] = 4096 - local17[local19];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}
}
