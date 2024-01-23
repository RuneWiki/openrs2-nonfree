import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class1_Sub3_Sub24 extends Class1_Sub3 {

	@OriginalMember(owner = "client!li", name = "T", descriptor = "Z")
	private boolean aBoolean109 = true;

	@OriginalMember(owner = "client!li", name = "R", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.aBoolean109 = arg1.method2142() == 1;
		} else if (arg0 == 1) {
			this.aBoolean108 = arg1.method2142() == 1;
		} else if (arg0 == 2) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(41) int[] local41 = this.method3468(this.aBoolean108 ? Static171.anInt3496 - arg0 : arg0, 0);
			if (this.aBoolean109) {
				for (@Pc(46) int local46 = 0; local46 < Static76.anInt1531; local46++) {
					local13[local46] = local41[Static121.anInt2385 - local46];
				}
			} else {
				Static235.method865(local41, 0, local13, 0, Static76.anInt1531);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(34) int[][] local34 = this.method3465(this.aBoolean108 ? Static171.anInt3496 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[1];
			@Pc(42) int[] local42 = local34[0];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[0];
			@Pc(63) int local63;
			if (this.aBoolean109) {
				for (local63 = 0; local63 < Static76.anInt1531; local63++) {
					local58[local63] = local42[Static121.anInt2385 - local63];
					local54[local63] = local38[Static121.anInt2385 - local63];
					local50[local63] = local46[Static121.anInt2385 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static76.anInt1531; local63++) {
					local58[local63] = local42[local63];
					local54[local63] = local38[local63];
					local50[local63] = local46[local63];
				}
			}
		}
		return local16;
	}
}
