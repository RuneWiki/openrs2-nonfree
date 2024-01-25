import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class2_Sub4_Sub27 extends Class2_Sub4 {

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub27() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean763 = arg0.method2859() == 1;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(30) int[] local30 = this.method8892(arg0, 0);
			@Pc(36) int[] local36 = this.method8892(arg0, 1);
			@Pc(42) int[] local42 = this.method8892(arg0, 2);
			for (@Pc(44) int local44 = 0; local44 < Static395.anInt6816; local44++) {
				@Pc(50) int local50 = local42[local44];
				if (local50 == 4096) {
					local20[local44] = local30[local44];
				} else if (local50 == 0) {
					local20[local44] = local36[local44];
				} else {
					local20[local44] = local50 * local30[local44] + local36[local44] * (4096 - local50) >> 12;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(26) int[] local26 = this.method8892(arg0, 2);
			@Pc(32) int[][] local32 = this.method8898(0, arg0);
			@Pc(38) int[][] local38 = this.method8898(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static395.anInt6816; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(117) int local117 = 4096 - local82;
					local42[local76] = local54[local76] * local82 + local117 * local66[local76] >> 12;
					local46[local76] = local70[local76] * local117 + local82 * local58[local76] >> 12;
					local50[local76] = local117 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local16;
	}
}
