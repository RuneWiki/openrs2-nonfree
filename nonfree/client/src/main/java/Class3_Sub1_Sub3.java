import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "[I")
	private final int[] anIntArray35 = new int[3];

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
	private int anInt287 = 4096;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
	private int anInt292 = 4096;

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
	private int anInt288 = 409;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
	private int anInt290 = 4096;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(26) int[][] local26 = this.method5551(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static238.anInt4221; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray35[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt288 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(100) int local100 = local34[local52];
					local66 = local100 - this.anIntArray35[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt288) {
						local42[local52] = local58;
						local46[local52] = local100;
						local50[local52] = local38[local52];
					} else {
						@Pc(144) int local144 = local38[local52];
						local66 = local144 - this.anIntArray35[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt288) {
							local42[local52] = local58;
							local46[local52] = local100;
							local50[local52] = local144;
						} else {
							local42[local52] = this.anInt290 * local58 >> 12;
							local46[local52] = this.anInt287 * local100 >> 12;
							local50[local52] = local144 * this.anInt292 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt288 = arg0.method2767();
		} else if (arg1 == 1) {
			this.anInt292 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt287 = arg0.method2767();
		} else if (arg1 == 3) {
			this.anInt290 = arg0.method2767();
		} else if (arg1 == 4) {
			@Pc(59) int local59 = arg0.method2786();
			this.anIntArray35[1] = local59 >> 4 & 0xFF0;
			this.anIntArray35[2] = local59 >> 12 & 0x0;
			this.anIntArray35[0] = (local59 & 0xFF0000) << 4;
		}
	}
}
