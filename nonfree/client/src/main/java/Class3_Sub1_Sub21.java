import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class3_Sub1_Sub21 extends Class3_Sub1 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean191 = arg1.method1545() == 1;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(26) int[] local26 = this.method3120(2, arg0);
			@Pc(32) int[][] local32 = this.method3124(0, arg0);
			@Pc(38) int[][] local38 = this.method3124(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local38[0];
			@Pc(66) int[] local66 = local32[2];
			@Pc(70) int[] local70 = local38[2];
			@Pc(74) int[] local74 = local38[1];
			for (@Pc(76) int local76 = 0; local76 < Static129.anInt3285; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local66[local76];
				} else if (local82 == 0) {
					local42[local76] = local62[local76];
					local46[local76] = local74[local76];
					local50[local76] = local70[local76];
				} else {
					@Pc(135) int local135 = 4096 - local82;
					local42[local76] = local135 * local62[local76] + local54[local76] * local82 >> 12;
					local46[local76] = local74[local76] * local135 + local82 * local58[local76] >> 12;
					local50[local76] = local66[local76] * local82 + local135 * local70[local76] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(26) int[] local26 = this.method3120(0, arg0);
			@Pc(32) int[] local32 = this.method3120(1, arg0);
			@Pc(38) int[] local38 = this.method3120(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static129.anInt3285; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local32[local40] * (4096 - local46) + local46 * local26[local40] >> 12;
				}
			}
		}
		return local16;
	}
}
