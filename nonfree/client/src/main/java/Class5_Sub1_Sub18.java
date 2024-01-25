import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class5_Sub1_Sub18 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ls", name = "K", descriptor = "Z")
	private boolean aBoolean458 = true;

	@OriginalMember(owner = "client!ls", name = "H", descriptor = "Z")
	private boolean aBoolean459 = true;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(32) int[] local32 = this.method9210(0, this.aBoolean459 ? Static542.anInt9254 - arg0 : arg0);
			if (this.aBoolean458) {
				for (@Pc(37) int local37 = 0; local37 < Static648.anInt9588; local37++) {
					local11[local37] = local32[Static116.anInt3312 - local37];
				}
			} else {
				Static682.method796(local32, 0, local11, 0, Static648.anInt9588);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(38) int[][] local38 = this.method9203(0, this.aBoolean459 ? Static542.anInt9254 - arg0 : arg0);
			@Pc(42) int[] local42 = local38[0];
			@Pc(46) int[] local46 = local38[1];
			@Pc(50) int[] local50 = local38[2];
			@Pc(54) int[] local54 = local18[0];
			@Pc(58) int[] local58 = local18[1];
			@Pc(62) int[] local62 = local18[2];
			@Pc(67) int local67;
			if (this.aBoolean458) {
				for (local67 = 0; local67 < Static648.anInt9588; local67++) {
					local54[local67] = local42[Static116.anInt3312 - local67];
					local58[local67] = local46[Static116.anInt3312 - local67];
					local62[local67] = local50[Static116.anInt3312 - local67];
				}
			} else {
				for (local67 = 0; local67 < Static648.anInt9588; local67++) {
					local54[local67] = local42[local67];
					local58[local67] = local46[local67];
					local62[local67] = local50[local67];
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.aBoolean458 = arg1.method8529() == 1;
		} else if (arg0 == 1) {
			this.aBoolean459 = arg1.method8529() == 1;
		} else if (arg0 == 2) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}
}
