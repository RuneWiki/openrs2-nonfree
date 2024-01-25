import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class5_Sub2_Sub25 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ps", name = "D", descriptor = "Z")
	private boolean aBoolean622 = true;

	@OriginalMember(owner = "client!ps", name = "R", descriptor = "Z")
	private boolean aBoolean623 = true;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(34) int[] local34 = this.method8821(this.aBoolean622 ? Static271.anInt4487 - arg0 : arg0, 0);
			if (this.aBoolean623) {
				for (@Pc(39) int local39 = 0; local39 < Static314.anInt6320; local39++) {
					local16[local39] = local34[Static550.anInt6610 - local39];
				}
			} else {
				Static655.method4105(local34, 0, local16, 0, Static314.anInt6320);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean623 = arg0.method8645() == 1;
		} else if (arg1 == 1) {
			this.aBoolean622 = arg0.method8645() == 1;
		} else if (arg1 == 2) {
			super.aBoolean834 = arg0.method8645() == 1;
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(34) int[][] local34 = this.method8823(this.aBoolean622 ? Static271.anInt4487 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean623) {
				for (local63 = 0; local63 < Static314.anInt6320; local63++) {
					local50[local63] = local38[Static550.anInt6610 - local63];
					local54[local63] = local42[Static550.anInt6610 - local63];
					local58[local63] = local46[Static550.anInt6610 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static314.anInt6320; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}
}
