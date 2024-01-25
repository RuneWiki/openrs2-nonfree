import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class2_Sub10_Sub37 extends Class2_Sub10 {

	@OriginalMember(owner = "client!vea", name = "H", descriptor = "Z")
	private boolean aBoolean718 = true;

	@OriginalMember(owner = "client!vea", name = "K", descriptor = "Z")
	private boolean aBoolean719 = true;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(34) int[][] local34 = this.method8408(this.aBoolean719 ? Static93.anInt1860 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean718) {
				for (local63 = 0; local63 < Static93.anInt1862; local63++) {
					local50[local63] = local38[Static603.anInt9994 - local63];
					local54[local63] = local42[Static603.anInt9994 - local63];
					local58[local63] = local46[Static603.anInt9994 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static93.anInt1862; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean718 = arg0.method6904() == 1;
		} else if (arg1 == 1) {
			this.aBoolean719 = arg0.method6904() == 1;
		} else if (arg1 == 2) {
			super.aBoolean741 = arg0.method6904() == 1;
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(35) int[] local35 = this.method8402(this.aBoolean719 ? Static93.anInt1860 - arg0 : arg0, 0);
			if (this.aBoolean718) {
				for (@Pc(40) int local40 = 0; local40 < Static93.anInt1862; local40++) {
					local11[local40] = local35[Static603.anInt9994 - local40];
				}
			} else {
				Static649.method4862(local35, 0, local11, 0, Static93.anInt1862);
			}
		}
		return local11;
	}
}
