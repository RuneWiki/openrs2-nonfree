import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "I")
	private int anInt2518 = 4096;

	@OriginalMember(owner = "client!dga", name = "G", descriptor = "I")
	private int anInt2519 = 4096;

	@OriginalMember(owner = "client!dga", name = "K", descriptor = "[I")
	private final int[] anIntArray95 = new int[3];

	@OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
	private int anInt2521 = 409;

	@OriginalMember(owner = "client!dga", name = "E", descriptor = "I")
	private int anInt2517 = 4096;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt2521 = arg1.method8414();
		} else if (arg0 == 1) {
			this.anInt2517 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt2518 = arg1.method8414();
		} else if (arg0 == 3) {
			this.anInt2519 = arg1.method8414();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method8421();
			this.anIntArray95[2] = local59 >> 12 & 0x0;
			this.anIntArray95[0] = (local59 & 0xFF0000) << 4;
			this.anIntArray95[1] = local59 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(26) int[][] local26 = this.method8337(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static164.anInt8839; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray95[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt2521 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(101) int local101 = local34[local52];
					local66 = local101 - this.anIntArray95[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt2521 < local66) {
						local42[local52] = local58;
						local46[local52] = local101;
						local50[local52] = local38[local52];
					} else {
						@Pc(142) int local142 = local38[local52];
						local66 = local142 - this.anIntArray95[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt2521 < local66) {
							local42[local52] = local58;
							local46[local52] = local101;
							local50[local52] = local142;
						} else {
							local42[local52] = local58 * this.anInt2519 >> 12;
							local46[local52] = this.anInt2518 * local101 >> 12;
							local50[local52] = this.anInt2517 * local142 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}
}
