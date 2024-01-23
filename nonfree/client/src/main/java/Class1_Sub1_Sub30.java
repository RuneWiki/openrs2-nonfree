import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	private int anInt4551 = 4096;

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "Z")
	private boolean aBoolean407 = true;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4551 = arg0.method2964();
		} else if (arg1 == 1) {
			this.aBoolean407 = arg0.method2945() == 1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(30) int[] local30 = this.method3706(Static30.anInt589 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method3706(arg0, 0);
			@Pc(48) int[] local48 = this.method3706(arg0 + 1 & Static30.anInt589, 0);
			@Pc(52) int[] local52 = local16[1];
			@Pc(56) int[] local56 = local16[0];
			@Pc(60) int[] local60 = local16[2];
			for (@Pc(62) int local62 = 0; local62 < Static11.anInt294; local62++) {
				@Pc(75) int local75 = this.anInt4551 * (local48[local62] - local30[local62]);
				@Pc(95) int local95 = this.anInt4551 * (local38[local62 + 1 & Static147.anInt3169] - local38[Static147.anInt3169 & local62 - 1]);
				@Pc(99) int local99 = local95 >> 12;
				@Pc(105) int local105 = local99 * local99 >> 12;
				@Pc(109) int local109 = local75 >> 12;
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local105 + local115 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(143) int local143;
				@Pc(147) int local147;
				@Pc(139) int local139;
				if (local130 == 0) {
					local139 = 0;
					local143 = 0;
					local147 = 0;
				} else {
					local139 = 16777216 / local130;
					local143 = local95 / local130;
					local147 = local75 / local130;
				}
				if (this.aBoolean407) {
					local147 = (local147 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
				}
				local56[local62] = local143;
				local52[local62] = local147;
				local60[local62] = local139;
			}
		}
		return local16;
	}
}
