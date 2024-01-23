import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!f", name = "K", descriptor = "Z")
	private boolean aBoolean103 = true;

	@OriginalMember(owner = "client!f", name = "R", descriptor = "Z")
	private boolean aBoolean104 = true;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(35) int[] local35 = this.method4450(0, this.aBoolean104 ? Static202.anInt4099 - arg0 : arg0);
			if (this.aBoolean103) {
				for (@Pc(40) int local40 = 0; local40 < Static227.anInt4511; local40++) {
					local17[local40] = local35[Static229.anInt4527 - local40];
				}
			} else {
				Static304.method2606(local35, 0, local17, 0, Static227.anInt4511);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean103 = arg0.method2690() == 1;
		} else if (arg1 == 1) {
			this.aBoolean104 = arg0.method2690() == 1;
		} else if (arg1 == 2) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(38) int[][] local38 = this.method4455(0, this.aBoolean104 ? Static202.anInt4099 - arg0 : arg0);
			@Pc(42) int[] local42 = local38[0];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local38[2];
			@Pc(58) int[] local58 = local11[2];
			@Pc(62) int[] local62 = local38[1];
			@Pc(67) int local67;
			if (this.aBoolean103) {
				for (local67 = 0; local67 < Static227.anInt4511; local67++) {
					local46[local67] = local42[Static229.anInt4527 - local67];
					local50[local67] = local62[Static229.anInt4527 - local67];
					local58[local67] = local54[Static229.anInt4527 - local67];
				}
			} else {
				for (local67 = 0; local67 < Static227.anInt4511; local67++) {
					local46[local67] = local42[local67];
					local50[local67] = local62[local67];
					local58[local67] = local54[local67];
				}
			}
		}
		return local11;
	}
}
