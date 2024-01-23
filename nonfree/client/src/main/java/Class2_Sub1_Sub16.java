import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub16() {
		super(3, false);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(30) int[] local30 = this.method4601(arg0, 2);
			@Pc(36) int[][] local36 = this.method4600(arg0, 0);
			@Pc(42) int[][] local42 = this.method4600(arg0, 1);
			@Pc(46) int[] local46 = local20[2];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local36[1];
			@Pc(58) int[] local58 = local36[0];
			@Pc(62) int[] local62 = local36[2];
			@Pc(66) int[] local66 = local42[0];
			@Pc(70) int[] local70 = local20[0];
			@Pc(74) int[] local74 = local42[1];
			@Pc(78) int[] local78 = local42[2];
			for (@Pc(80) int local80 = 0; local80 < Static281.anInt5558; local80++) {
				@Pc(87) int local87 = local30[local80];
				if (local87 == 4096) {
					local70[local80] = local58[local80];
					local50[local80] = local54[local80];
					local46[local80] = local62[local80];
				} else if (local87 == 0) {
					local70[local80] = local66[local80];
					local50[local80] = local74[local80];
					local46[local80] = local78[local80];
				} else {
					@Pc(99) int local99 = 4096 - local87;
					local70[local80] = local58[local80] * local87 + local66[local80] * local99 >> 12;
					local50[local80] = local99 * local74[local80] + local54[local80] * local87 >> 12;
					local46[local80] = local87 * local62[local80] + local78[local80] * local99 >> 12;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(26) int[] local26 = this.method4601(arg0, 0);
			@Pc(32) int[] local32 = this.method4601(arg0, 1);
			@Pc(38) int[] local38 = this.method4601(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static281.anInt5558; local40++) {
				@Pc(47) int local47 = local38[local40];
				if (local47 == 4096) {
					local16[local40] = local26[local40];
				} else if (local47 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local32[local40] * (4096 - local47) + local26[local40] * local47 >> 12;
				}
			}
		}
		return local16;
	}
}
