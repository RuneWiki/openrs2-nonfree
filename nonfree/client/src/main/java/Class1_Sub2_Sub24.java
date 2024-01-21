import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
	private int anInt3033;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
	private int anInt3038;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
	private int anInt3039;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
	private int anInt3032;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(26) int[][] local26 = this.method3390(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static22.anInt596; local52++) {
				@Pc(58) int local58 = local34[local52];
				@Pc(66) int local66 = local58 - this.anIntArray295[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt3032 < local66) {
					local42[local52] = local58;
					local46[local52] = local30[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(101) int local101 = local30[local52];
					local66 = local101 - this.anIntArray295[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt3032) {
						local42[local52] = local58;
						local46[local52] = local101;
						local50[local52] = local38[local52];
					} else {
						@Pc(140) int local140 = local38[local52];
						local66 = local140 - this.anIntArray295[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt3032) {
							local42[local52] = local58;
							local46[local52] = local101;
							local50[local52] = local140;
						} else {
							local42[local52] = local58 * this.anInt3033 >> 12;
							local46[local52] = this.anInt3038 * local101 >> 12;
							local50[local52] = this.anInt3039 * local140 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3032 = arg1.method1280();
		} else if (arg0 == 1) {
			this.anInt3039 = arg1.method1280();
		} else if (arg0 == 2) {
			this.anInt3038 = arg1.method1280();
		} else if (arg0 == 3) {
			this.anInt3033 = arg1.method1280();
		} else if (arg0 == 4) {
			@Pc(55) int local55 = arg1.method1230();
			this.anIntArray295[0] = (local55 & 0xFF0000) << 4;
			this.anIntArray295[2] = local55 >> 12 & 0x0;
			this.anIntArray295[1] = local55 >> 4 & 0xFF0;
		}
	}
}
