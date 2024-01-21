import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(34) int[][] local34 = this.method3579(this.aBoolean45 ? Static91.anInt2110 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local12[1];
			@Pc(54) int[] local54 = local12[2];
			@Pc(58) int[] local58 = local12[0];
			@Pc(63) int local63;
			if (this.aBoolean44) {
				for (local63 = 0; local63 < Static115.anInt2578; local63++) {
					local58[local63] = local38[Static48.anInt1202 - local63];
					local50[local63] = local42[Static48.anInt1202 - local63];
					local54[local63] = local46[Static48.anInt1202 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static115.anInt2578; local63++) {
					local58[local63] = local38[local63];
					local50[local63] = local42[local63];
					local54[local63] = local46[local63];
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean44 = arg0.method2771() == 1;
		} else if (arg1 == 1) {
			this.aBoolean45 = arg0.method2771() == 1;
		} else if (arg1 == 2) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(33) int[] local33 = this.method3580(this.aBoolean45 ? Static91.anInt2110 - arg0 : arg0, 0);
			if (this.aBoolean44) {
				for (@Pc(38) int local38 = 0; local38 < Static115.anInt2578; local38++) {
					local11[local38] = local33[Static48.anInt1202 - local38];
				}
			} else {
				Static214.method350(local33, 0, local11, 0, Static115.anInt2578);
			}
		}
		return local11;
	}
}
