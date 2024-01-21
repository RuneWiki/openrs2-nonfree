import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class2_Sub3_Sub20 extends Class2_Sub3 {

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "Z")
	private boolean aBoolean107;

	@OriginalMember(owner = "client!oa", name = "gb", descriptor = "Z")
	private boolean aBoolean108;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(34) int[] local34 = this.method3011(this.aBoolean107 ? Static134.anInt2915 - arg0 : arg0, 0);
			if (this.aBoolean108) {
				for (@Pc(47) int local47 = 0; local47 < Static53.anInt1184; local47++) {
					local12[local47] = local34[Static27.anInt588 - local47];
				}
			} else {
				Static191.method1827(local34, 0, local12, 0, Static53.anInt1184);
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(34) int[][] local34 = this.method3017(this.aBoolean107 ? Static134.anInt2915 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean108) {
				for (local63 = 0; local63 < Static53.anInt1184; local63++) {
					local50[local63] = local38[Static27.anInt588 - local63];
					local54[local63] = local42[Static27.anInt588 - local63];
					local58[local63] = local46[Static27.anInt588 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static53.anInt1184; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.aBoolean108 = arg1.method2962() == 1;
		} else if (arg0 == 1) {
			this.aBoolean107 = arg1.method2962() == 1;
		} else if (arg0 == 2) {
			super.aBoolean175 = arg1.method2962() == 1;
		}
	}
}
