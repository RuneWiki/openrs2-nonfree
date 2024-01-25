import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class3_Sub2_Sub25 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rca", name = "A", descriptor = "I")
	private int anInt8417 = 4096;

	@OriginalMember(owner = "client!rca", name = "G", descriptor = "Z")
	private boolean aBoolean587 = true;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8417 = arg0.method4221();
		} else if (arg1 == 1) {
			this.aBoolean587 = arg0.method4225() == 1;
		}
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(35) int[] local35 = this.method8603(Class4_Sub1_Sub3_Sub2.lb & arg0 - 1, 0);
			@Pc(41) int[] local41 = this.method8603(arg0, 0);
			@Pc(51) int[] local51 = this.method8603(Class4_Sub1_Sub3_Sub2.lb & arg0 + 1, 0);
			@Pc(55) int[] local55 = local19[0];
			@Pc(59) int[] local59 = local19[1];
			@Pc(63) int[] local63 = local19[2];
			for (@Pc(65) int local65 = 0; local65 < Static491.anInt8519; local65++) {
				@Pc(79) int local79 = (local51[local65] - local35[local65]) * this.anInt8417;
				@Pc(99) int local99 = (local41[local65 + 1 & Static309.anInt5846] - local41[Static309.anInt5846 & local65 - 1]) * this.anInt8417;
				@Pc(103) int local103 = local99 >> 12;
				@Pc(107) int local107 = local79 >> 12;
				@Pc(113) int local113 = local103 * local103 >> 12;
				@Pc(119) int local119 = local107 * local107 >> 12;
				@Pc(133) int local133 = (int) (Math.sqrt((double) ((float) (local119 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(142) int local142;
				@Pc(144) int local144;
				@Pc(140) int local140;
				if (local133 == 0) {
					local140 = 0;
					local142 = 0;
					local144 = 0;
				} else {
					local142 = local99 / local133;
					local140 = 16777216 / local133;
					local144 = local79 / local133;
				}
				if (this.aBoolean587) {
					local140 = (local140 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
				}
				local55[local65] = local142;
				local59[local65] = local144;
				local63[local65] = local140;
			}
		}
		return local19;
	}
}
