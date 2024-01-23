import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sh", name = "fb", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!sh", name = "Y", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean189 = arg0.method3793() == 1;
		} else if (arg1 == 1) {
			this.aBoolean188 = arg0.method3793() == 1;
		} else if (arg1 == 2) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(34) int[][] local34 = this.method3737(0, this.aBoolean188 ? Static148.anInt3213 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[1];
			@Pc(42) int[] local42 = local34[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local34[2];
			@Pc(54) int[] local54 = local16[0];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean189) {
				for (local63 = 0; local63 < Static157.anInt3431; local63++) {
					local54[local63] = local42[Static74.anInt1679 - local63];
					local46[local63] = local38[Static74.anInt1679 - local63];
					local58[local63] = local50[Static74.anInt1679 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static157.anInt3431; local63++) {
					local54[local63] = local42[local63];
					local46[local63] = local38[local63];
					local58[local63] = local50[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(37) int[] local37 = this.method3733(this.aBoolean188 ? Static148.anInt3213 - arg0 : arg0, 0);
			if (this.aBoolean189) {
				for (@Pc(50) int local50 = 0; local50 < Static157.anInt3431; local50++) {
					local19[local50] = local37[Static74.anInt1679 - local50];
				}
			} else {
				Static233.method867(local37, 0, local19, 0, Static157.anInt3431);
			}
		}
		return local19;
	}
}
