import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub4_Sub3 extends Class2_Sub4 {

	@OriginalMember(owner = "client!be", name = "I", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(38) int[] local38 = this.method8892(this.aBoolean73 ? Static463.anInt7489 - arg0 : arg0, 0);
			if (this.aBoolean71) {
				for (@Pc(51) int local51 = 0; local51 < Static395.anInt6816; local51++) {
					local19[local51] = local38[Static104.anInt2340 - local51];
				}
			} else {
				Static650.method2270(local38, 0, local19, 0, Static395.anInt6816);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(34) int[][] local34 = this.method8898(0, this.aBoolean73 ? Static463.anInt7489 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(63) int local63;
			if (this.aBoolean71) {
				for (local63 = 0; local63 < Static395.anInt6816; local63++) {
					local50[local63] = local38[Static104.anInt2340 - local63];
					local54[local63] = local42[Static104.anInt2340 - local63];
					local58[local63] = local46[Static104.anInt2340 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static395.anInt6816; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean71 = arg0.method2859() == 1;
		} else if (arg1 == 1) {
			this.aBoolean73 = arg0.method2859() == 1;
		} else if (arg1 == 2) {
			super.aBoolean763 = arg0.method2859() == 1;
		}
	}
}
