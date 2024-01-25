import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
	private int anInt188 = 4096;

	@OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
	private int anInt186 = 409;

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
	private int anInt187 = 4096;

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "[I")
	private final int[] anIntArray4 = new int[3];

	@OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
	private int anInt190 = 4096;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(26) int[][] local26 = this.method5899(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static406.anInt6694; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray4[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt186) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(97) int local97 = local34[local52];
					local66 = local97 - this.anIntArray4[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt186) {
						local42[local52] = local58;
						local46[local52] = local97;
						local50[local52] = local38[local52];
					} else {
						@Pc(134) int local134 = local38[local52];
						local66 = local134 - this.anIntArray4[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt186 < local66) {
							local42[local52] = local58;
							local46[local52] = local97;
							local50[local52] = local134;
						} else {
							local42[local52] = local58 * this.anInt187 >> 12;
							local46[local52] = this.anInt188 * local97 >> 12;
							local50[local52] = this.anInt190 * local134 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt186 = arg0.method2588();
		} else if (arg1 == 1) {
			this.anInt190 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt188 = arg0.method2588();
		} else if (arg1 == 3) {
			this.anInt187 = arg0.method2588();
		} else if (arg1 == 4) {
			@Pc(61) int local61 = arg0.method2604();
			this.anIntArray4[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray4[1] = local61 >> 4 & 0xFF0;
			this.anIntArray4[2] = local61 >> 12 & 0x0;
		}
	}
}
