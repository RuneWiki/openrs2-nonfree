import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class3_Sub4_Sub9 extends Class3_Sub4 {

	@OriginalMember(owner = "client!dw", name = "L", descriptor = "I")
	private int anInt1465 = 4096;

	@OriginalMember(owner = "client!dw", name = "T", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1465 = arg0.method4083();
		} else if (arg1 == 1) {
			this.aBoolean98 = arg0.method4096() == 1;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(25) int[] local25 = this.method6139(0, arg0 - 1 & Static165.anInt2326);
			@Pc(31) int[] local31 = this.method6139(0, arg0);
			@Pc(41) int[] local41 = this.method6139(0, arg0 + 1 & Static165.anInt2326);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static148.anInt2687; local55++) {
				@Pc(68) int local68 = this.anInt1465 * (local41[local55] - local25[local55]);
				@Pc(87) int local87 = (local31[local55 + 1 & Static225.anInt3793] - local31[Static225.anInt3793 & local55 - 1]) * this.anInt1465;
				@Pc(91) int local91 = local87 >> 12;
				@Pc(95) int local95 = local68 >> 12;
				@Pc(101) int local101 = local91 * local91 >> 12;
				@Pc(107) int local107 = local95 * local95 >> 12;
				@Pc(121) int local121 = (int) (Math.sqrt((double) ((float) (local101 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127;
				@Pc(131) int local131;
				@Pc(135) int local135;
				if (local121 == 0) {
					local131 = 0;
					local135 = 0;
					local127 = 0;
				} else {
					local127 = local87 / local121;
					local131 = local68 / local121;
					local135 = 16777216 / local121;
				}
				if (this.aBoolean98) {
					local131 = (local131 >> 1) + 2048;
					local127 = (local127 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
				}
				local45[local55] = local127;
				local49[local55] = local131;
				local53[local55] = local135;
			}
		}
		return local11;
	}
}
