import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class4_Sub6_Sub35 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	private int anInt6657 = 409;

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "[I")
	private final int[] anIntArray506 = new int[3];

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
	private int anInt6661 = 4096;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
	private int anInt6663 = 4096;

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
	private int anInt6664 = 4096;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(26) int[][] local26 = this.method5516(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static80.anInt1616; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(65) int local65 = local58 - this.anIntArray506[0];
				if (local65 < 0) {
					local65 = -local65;
				}
				if (this.anInt6657 < local65) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(99) int local99 = local34[local52];
					local65 = local99 - this.anIntArray506[1];
					if (local65 < 0) {
						local65 = -local65;
					}
					if (this.anInt6657 < local65) {
						local42[local52] = local58;
						local46[local52] = local99;
						local50[local52] = local38[local52];
					} else {
						@Pc(139) int local139 = local38[local52];
						local65 = local139 - this.anIntArray506[2];
						if (local65 < 0) {
							local65 = -local65;
						}
						if (this.anInt6657 < local65) {
							local42[local52] = local58;
							local46[local52] = local99;
							local50[local52] = local139;
						} else {
							local42[local52] = this.anInt6661 * local58 >> 12;
							local46[local52] = local99 * this.anInt6663 >> 12;
							local50[local52] = this.anInt6664 * local139 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6657 = arg1.method2536();
		} else if (arg0 == 1) {
			this.anInt6664 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anInt6663 = arg1.method2536();
		} else if (arg0 == 3) {
			this.anInt6661 = arg1.method2536();
		} else if (arg0 == 4) {
			@Pc(55) int local55 = arg1.method2493();
			this.anIntArray506[1] = local55 >> 4 & 0xFF0;
			this.anIntArray506[0] = (local55 & 0xFF0000) << 4;
			this.anIntArray506[2] = local55 >> 12 & 0x0;
		}
	}
}
