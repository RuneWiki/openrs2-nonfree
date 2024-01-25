import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class6_Sub1_Sub33 extends Class6_Sub1 {

	@OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
	private int anInt9506 = 4096;

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "Z")
	private boolean aBoolean685 = true;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(25) int[] local25 = this.method8963(0, Static476.anInt8174 & arg0 - 1);
			@Pc(31) int[] local31 = this.method8963(0, arg0);
			@Pc(41) int[] local41 = this.method8963(0, Static476.anInt8174 & arg0 + 1);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static479.anInt8231; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt9506;
				@Pc(89) int local89 = this.anInt9506 * (local31[Static413.anInt7225 & local55 + 1] - local31[Static413.anInt7225 & local55 - 1]);
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(124) int local124 = (int) (Math.sqrt((double) ((float) (local103 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(131) int local131;
				@Pc(135) int local135;
				@Pc(133) int local133;
				if (local124 == 0) {
					local131 = 0;
					local133 = 0;
					local135 = 0;
				} else {
					local135 = local69 / local124;
					local133 = 16777216 / local124;
					local131 = local89 / local124;
				}
				if (this.aBoolean685) {
					local131 = (local131 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
				}
				local45[local55] = local131;
				local49[local55] = local135;
				local53[local55] = local133;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9506 = arg0.method8363();
		} else if (arg1 == 1) {
			this.aBoolean685 = arg0.method8374() == 1;
		}
	}
}
