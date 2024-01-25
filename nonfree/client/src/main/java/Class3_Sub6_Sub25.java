import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class3_Sub6_Sub25 extends Class3_Sub6 {

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(29) int[] local29 = this.method8001(0, arg0);
			@Pc(35) int[] local35 = this.method8001(1, arg0);
			@Pc(41) int[] local41 = this.method8001(2, arg0);
			for (@Pc(43) int local43 = 0; local43 < Static481.anInt8358; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local11[local43] = local29[local43];
				} else if (local49 == 0) {
					local11[local43] = local35[local43];
				} else {
					local11[local43] = local49 * local29[local43] + local35[local43] * (4096 - local49) >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(26) int[] local26 = this.method8001(2, arg0);
			@Pc(32) int[][] local32 = this.method8005(0, arg0);
			@Pc(38) int[][] local38 = this.method8005(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static481.anInt8358; local76++) {
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
					@Pc(133) int local133 = 4096 - local82;
					local42[local76] = local133 * local66[local76] + local54[local76] * local82 >> 12;
					local46[local76] = local70[local76] * local133 + local58[local76] * local82 >> 12;
					local50[local76] = local133 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}
}
