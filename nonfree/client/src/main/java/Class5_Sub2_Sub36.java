import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class5_Sub2_Sub36 extends Class5_Sub2 {

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
	private int anInt9717 = 4096;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
	private int anInt9719 = 409;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "[I")
	private final int[] anIntArray785 = new int[3];

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt9721 = 4096;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	private int anInt9720 = 4096;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9719 = arg0.method8631();
		} else if (arg1 == 1) {
			this.anInt9717 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt9720 = arg0.method8631();
		} else if (arg1 == 3) {
			this.anInt9721 = arg0.method8631();
		} else if (arg1 == 4) {
			@Pc(53) int local53 = arg0.method8657();
			this.anIntArray785[2] = local53 >> 12 & 0x0;
			this.anIntArray785[0] = (local53 & 0xFF0000) << 4;
			this.anIntArray785[1] = local53 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(26) int[][] local26 = this.method8823(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static314.anInt6320; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray785[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt9719 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(101) int local101 = local34[local52];
					local66 = local101 - this.anIntArray785[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt9719) {
						local42[local52] = local58;
						local46[local52] = local101;
						local50[local52] = local38[local52];
					} else {
						@Pc(142) int local142 = local38[local52];
						local66 = local142 - this.anIntArray785[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt9719 < local66) {
							local42[local52] = local58;
							local46[local52] = local101;
							local50[local52] = local142;
						} else {
							local42[local52] = this.anInt9721 * local58 >> 12;
							local46[local52] = local101 * this.anInt9720 >> 12;
							local50[local52] = local142 * this.anInt9717 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}
}
