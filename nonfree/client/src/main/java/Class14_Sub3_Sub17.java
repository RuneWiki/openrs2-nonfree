import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class14_Sub3_Sub17 extends Class14_Sub3 {

	@OriginalMember(owner = "client!ig", name = "M", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!ig", name = "P", descriptor = "Z")
	private boolean aBoolean190 = true;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(34) int[][] local34 = this.method5997(this.aBoolean190 ? Static179.anInt3689 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(63) int local63;
			if (this.aBoolean189) {
				for (local63 = 0; local63 < Static294.anInt5657; local63++) {
					local50[local63] = local38[Static329.anInt6352 - local63];
					local54[local63] = local42[Static329.anInt6352 - local63];
					local58[local63] = local46[Static329.anInt6352 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static294.anInt5657; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean189 = arg0.method2548() == 1;
		} else if (arg1 == 1) {
			this.aBoolean190 = arg0.method2548() == 1;
		} else if (arg1 == 2) {
			super.aBoolean446 = arg0.method2548() == 1;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(34) int[] local34 = this.method6004(0, this.aBoolean190 ? Static179.anInt3689 - arg0 : arg0);
			if (this.aBoolean189) {
				for (@Pc(39) int local39 = 0; local39 < Static294.anInt5657; local39++) {
					local16[local39] = local34[Static329.anInt6352 - local39];
				}
			} else {
				Static358.method763(local34, 0, local16, 0, Static294.anInt5657);
			}
		}
		return local16;
	}
}
