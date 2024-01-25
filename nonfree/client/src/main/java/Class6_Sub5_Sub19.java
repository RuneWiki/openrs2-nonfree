import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class6_Sub5_Sub19 extends Class6_Sub5 {

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "Z")
	private boolean aBoolean258 = true;

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.aBoolean259 = arg1.method6433() == 1;
		} else if (arg0 == 1) {
			this.aBoolean258 = arg1.method6433() == 1;
		} else if (arg0 == 2) {
			super.aBoolean495 = arg1.method6433() == 1;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(34) int[][] local34 = this.method6544(this.aBoolean258 ? Static52.anInt1464 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean259) {
				for (local63 = 0; local63 < Static240.anInt4386; local63++) {
					local50[local63] = local38[Static408.anInt7338 - local63];
					local54[local63] = local42[Static408.anInt7338 - local63];
					local58[local63] = local46[Static408.anInt7338 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static240.anInt4386; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(29) int[] local29 = this.method6543(0, this.aBoolean258 ? Static52.anInt1464 - arg0 : arg0);
			if (this.aBoolean259) {
				for (@Pc(42) int local42 = 0; local42 < Static240.anInt4386; local42++) {
					local11[local42] = local29[Static408.anInt7338 - local42];
				}
			} else {
				Static459.method6341(local29, 0, local11, 0, Static240.anInt4386);
			}
		}
		return local11;
	}
}
