import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class1_Sub2_Sub36 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
	private int anInt4357 = 4096;

	@OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
	private int anInt4359 = 409;

	@OriginalMember(owner = "client!uj", name = "bb", descriptor = "[I")
	private int[] anIntArray569 = new int[3];

	@OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
	private int anInt4354 = 4096;

	@OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
	private int anInt4361 = 4096;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4359 = arg0.method946();
		} else if (arg1 == 1) {
			this.anInt4357 = arg0.method946();
		} else if (arg1 == 2) {
			this.anInt4361 = arg0.method946();
		} else if (arg1 == 3) {
			this.anInt4354 = arg0.method946();
		} else if (arg1 == 4) {
			@Pc(58) int local58 = arg0.method920();
			this.anIntArray569[1] = local58 >> 4 & 0xFF0;
			this.anIntArray569[2] = local58 >> 12 & 0x0;
			this.anIntArray569[0] = (local58 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(26) int[][] local26 = this.method3501(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local26[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static105.anInt2391; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(65) int local65 = local58 - this.anIntArray569[0];
				if (local65 < 0) {
					local65 = -local65;
				}
				if (local65 > this.anInt4359) {
					local38[local52] = local58;
					local42[local52] = local46[local52];
					local50[local52] = local34[local52];
				} else {
					@Pc(96) int local96 = local46[local52];
					local65 = local96 - this.anIntArray569[1];
					if (local65 < 0) {
						local65 = -local65;
					}
					if (local65 > this.anInt4359) {
						local38[local52] = local58;
						local42[local52] = local96;
						local50[local52] = local34[local52];
					} else {
						@Pc(133) int local133 = local34[local52];
						local65 = local133 - this.anIntArray569[2];
						if (local65 < 0) {
							local65 = -local65;
						}
						if (this.anInt4359 < local65) {
							local38[local52] = local58;
							local42[local52] = local96;
							local50[local52] = local133;
						} else {
							local38[local52] = this.anInt4354 * local58 >> 12;
							local42[local52] = this.anInt4361 * local96 >> 12;
							local50[local52] = local133 * this.anInt4357 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}
}
