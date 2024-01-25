import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class1_Sub5_Sub33 extends Class1_Sub5 {

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	private int anInt5899 = 4096;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Z")
	private boolean aBoolean490 = true;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5899 = arg0.method5715();
		} else if (arg1 == 1) {
			this.aBoolean490 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(33) int[] local33 = this.method5802(0, arg0 - 1 & Static42.anInt1137);
			@Pc(39) int[] local39 = this.method5802(0, arg0);
			@Pc(51) int[] local51 = this.method5802(0, Static42.anInt1137 & arg0 + 1);
			@Pc(55) int[] local55 = local11[0];
			@Pc(59) int[] local59 = local11[1];
			@Pc(63) int[] local63 = local11[2];
			for (@Pc(65) int local65 = 0; local65 < Static75.anInt1566; local65++) {
				@Pc(79) int local79 = (local51[local65] - local33[local65]) * this.anInt5899;
				@Pc(99) int local99 = this.anInt5899 * (local39[Static239.anInt2816 & local65 + 1] - local39[Static239.anInt2816 & local65 - 1]);
				@Pc(103) int local103 = local99 >> 12;
				@Pc(107) int local107 = local79 >> 12;
				@Pc(113) int local113 = local103 * local103 >> 12;
				@Pc(119) int local119 = local107 * local107 >> 12;
				@Pc(133) int local133 = (int) (Math.sqrt((double) ((float) (local119 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(143) int local143;
				@Pc(139) int local139;
				@Pc(147) int local147;
				if (local133 == 0) {
					local143 = 0;
					local139 = 0;
					local147 = 0;
				} else {
					local139 = local79 / local133;
					local143 = local99 / local133;
					local147 = 16777216 / local133;
				}
				if (this.aBoolean490) {
					local143 = (local143 >> 1) + 2048;
					local147 = (local147 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
				}
				local55[local65] = local143;
				local59[local65] = local139;
				local63[local65] = local147;
			}
		}
		return local11;
	}
}
