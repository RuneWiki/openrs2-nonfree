import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class7_Sub4_Sub32 extends Class7_Sub4 {

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "Z")
	private boolean aBoolean416 = true;

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
	private int anInt5634 = 4096;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5634 = arg0.method2764();
		} else if (arg1 == 1) {
			this.aBoolean416 = arg0.method2772() == 1;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(34) int[] local34 = this.method5634(0, arg0 - 1 & Static153.anInt3263);
			@Pc(40) int[] local40 = this.method5634(0, arg0);
			@Pc(50) int[] local50 = this.method5634(0, Static153.anInt3263 & arg0 + 1);
			@Pc(54) int[] local54 = local20[0];
			@Pc(58) int[] local58 = local20[1];
			@Pc(62) int[] local62 = local20[2];
			for (@Pc(64) int local64 = 0; local64 < Static201.anInt4174; local64++) {
				@Pc(78) int local78 = this.anInt5634 * (local50[local64] - local34[local64]);
				@Pc(98) int local98 = (local40[local64 + 1 & Static110.anInt2508] - local40[Static110.anInt2508 & local64 - 1]) * this.anInt5634;
				@Pc(102) int local102 = local98 >> 12;
				@Pc(106) int local106 = local78 >> 12;
				@Pc(112) int local112 = local102 * local102 >> 12;
				@Pc(118) int local118 = local106 * local106 >> 12;
				@Pc(132) int local132 = (int) (Math.sqrt((double) ((float) (local118 + local112 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(141) int local141;
				@Pc(139) int local139;
				@Pc(143) int local143;
				if (local132 == 0) {
					local139 = 0;
					local141 = 0;
					local143 = 0;
				} else {
					local141 = local98 / local132;
					local143 = 16777216 / local132;
					local139 = local78 / local132;
				}
				if (this.aBoolean416) {
					local139 = (local139 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
				}
				local54[local64] = local141;
				local58[local64] = local139;
				local62[local64] = local143;
			}
		}
		return local20;
	}
}
