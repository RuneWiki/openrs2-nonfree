import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class7_Sub3_Sub31 extends Class7_Sub3 {

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(21) int[] local21 = this.method5591(0, arg0);
			@Pc(27) int[] local27 = this.method5591(1, arg0);
			@Pc(33) int[] local33 = this.method5591(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static58.anInt1052; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = (4096 - local41) * local27[local35] + local41 * local21[local35] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			super.aBoolean490 = arg1.method3981() == 1;
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(26) int[] local26 = this.method5591(2, arg0);
			@Pc(32) int[][] local32 = this.method5597(0, arg0);
			@Pc(38) int[][] local38 = this.method5597(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static58.anInt1052; local76++) {
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
					@Pc(131) int local131 = 4096 - local82;
					local42[local76] = local66[local76] * local131 + local82 * local54[local76] >> 12;
					local46[local76] = local58[local76] * local82 + local70[local76] * local131 >> 12;
					local50[local76] = local131 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local11;
	}
}
