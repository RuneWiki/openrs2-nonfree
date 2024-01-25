import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!g", name = "I", descriptor = "Z")
	private boolean aBoolean118 = true;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "I")
	private int anInt2189 = 4096;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2189 = arg0.method4093();
		} else if (arg1 == 1) {
			this.aBoolean118 = arg0.method4130() == 1;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(32) int[] local32 = this.method6076(0, arg0 - 1 & Static274.anInt4887);
			@Pc(38) int[] local38 = this.method6076(0, arg0);
			@Pc(48) int[] local48 = this.method6076(0, arg0 + 1 & Static274.anInt4887);
			@Pc(52) int[] local52 = local11[0];
			@Pc(56) int[] local56 = local11[1];
			@Pc(60) int[] local60 = local11[2];
			for (@Pc(62) int local62 = 0; local62 < Static347.anInt5974; local62++) {
				@Pc(75) int local75 = this.anInt2189 * (local48[local62] - local32[local62]);
				@Pc(95) int local95 = (local38[Static307.anInt5524 & local62 + 1] - local38[Static307.anInt5524 & local62 - 1]) * this.anInt2189;
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local75 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local109 + local115 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(138) int local138;
				@Pc(134) int local134;
				if (local130 == 0) {
					local134 = 0;
					local136 = 0;
					local138 = 0;
				} else {
					local138 = local75 / local130;
					local134 = 16777216 / local130;
					local136 = local95 / local130;
				}
				if (this.aBoolean118) {
					local134 = (local134 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
				}
				local52[local62] = local136;
				local56[local62] = local138;
				local60[local62] = local134;
			}
		}
		return local11;
	}
}
