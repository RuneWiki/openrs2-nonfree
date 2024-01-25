import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class1_Sub3_Sub25 extends Class1_Sub3 {

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(26) int[] local26 = this.method7911(arg0, 2);
			@Pc(32) int[][] local32 = this.method7910(0, arg0);
			@Pc(38) int[][] local38 = this.method7910(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static236.anInt4609; local76++) {
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
					@Pc(115) int local115 = 4096 - local82;
					local42[local76] = local82 * local54[local76] + local115 * local66[local76] >> 12;
					local46[local76] = local115 * local70[local76] + local58[local76] * local82 >> 12;
					local50[local76] = local74[local76] * local115 + local62[local76] * local82 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(27) int[] local27 = this.method7911(arg0, 0);
			@Pc(33) int[] local33 = this.method7911(arg0, 1);
			@Pc(39) int[] local39 = this.method7911(arg0, 2);
			for (@Pc(41) int local41 = 0; local41 < Static236.anInt4609; local41++) {
				@Pc(47) int local47 = local39[local41];
				if (local47 == 4096) {
					local17[local41] = local27[local41];
				} else if (local47 == 0) {
					local17[local41] = local33[local41];
				} else {
					local17[local41] = (4096 - local47) * local33[local41] + local47 * local27[local41] >> 12;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean652 = arg0.method3043() == 1;
		}
	}
}
