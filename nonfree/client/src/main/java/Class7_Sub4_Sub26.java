import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class7_Sub4_Sub26 extends Class7_Sub4 {

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub26() {
		super(3, false);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean481 = arg0.method2772() == 1;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(21) int[] local21 = this.method5634(0, arg0);
			@Pc(27) int[] local27 = this.method5634(1, arg0);
			@Pc(33) int[] local33 = this.method5634(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static201.anInt4174; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = local21[local35] * local41 + local27[local35] * (4096 - local41) >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(26) int[] local26 = this.method5634(2, arg0);
			@Pc(32) int[][] local32 = this.method5638(arg0, 0);
			@Pc(38) int[][] local38 = this.method5638(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static201.anInt4174; local76++) {
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
					@Pc(132) int local132 = 4096 - local82;
					local42[local76] = local54[local76] * local82 + local66[local76] * local132 >> 12;
					local46[local76] = local82 * local58[local76] + local132 * local70[local76] >> 12;
					local50[local76] = local62[local76] * local82 + local132 * local74[local76] >> 12;
				}
			}
		}
		return local16;
	}
}
