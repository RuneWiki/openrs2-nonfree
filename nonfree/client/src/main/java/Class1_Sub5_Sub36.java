import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class1_Sub5_Sub36 extends Class1_Sub5 {

	@OriginalMember(owner = "client!uk", name = "N", descriptor = "[I")
	private final int[] anIntArray630 = new int[3];

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
	private int anInt6277 = 409;

	@OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
	private int anInt6273 = 4096;

	@OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
	private int anInt6284 = 4096;

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
	private int anInt6276 = 4096;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6277 = arg0.method5715();
		} else if (arg1 == 1) {
			this.anInt6276 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt6284 = arg0.method5715();
		} else if (arg1 == 3) {
			this.anInt6273 = arg0.method5715();
		} else if (arg1 == 4) {
			@Pc(70) int local70 = arg0.method5705();
			this.anIntArray630[2] = local70 >> 12 & 0x0;
			this.anIntArray630[1] = local70 >> 4 & 0xFF0;
			this.anIntArray630[0] = (local70 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(26) int[][] local26 = this.method5807(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static75.anInt1566; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray630[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt6277) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(97) int local97 = local34[local52];
					local66 = local97 - this.anIntArray630[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt6277) {
						local42[local52] = local58;
						local46[local52] = local97;
						local50[local52] = local38[local52];
					} else {
						@Pc(138) int local138 = local38[local52];
						local66 = local138 - this.anIntArray630[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt6277) {
							local42[local52] = local58;
							local46[local52] = local97;
							local50[local52] = local138;
						} else {
							local42[local52] = local58 * this.anInt6273 >> 12;
							local46[local52] = local97 * this.anInt6284 >> 12;
							local50[local52] = local138 * this.anInt6276 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
