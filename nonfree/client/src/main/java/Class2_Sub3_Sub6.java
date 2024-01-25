import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class2_Sub3_Sub6 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
	private int anInt2681 = 3216;

	@OriginalMember(owner = "client!dda", name = "Q", descriptor = "I")
	private int anInt2683 = 3216;

	@OriginalMember(owner = "client!dda", name = "R", descriptor = "I")
	private int anInt2684 = 4096;

	@OriginalMember(owner = "client!dda", name = "S", descriptor = "[I")
	private final int[] anIntArray128 = new int[3];

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)V")
	private void method2529() {
		@Pc(17) double local17 = Math.cos((double) ((float) this.anInt2681 / 4096.0F));
		this.anIntArray128[0] = (int) (local17 * Math.sin((double) ((float) this.anInt2683 / 4096.0F)) * 4096.0D);
		this.anIntArray128[1] = (int) (local17 * Math.cos((double) ((float) this.anInt2683 / 4096.0F)) * 4096.0D);
		this.anIntArray128[2] = (int) (Math.sin((double) ((float) this.anInt2681 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray128[0] * this.anIntArray128[0] >> 12;
		@Pc(87) int local87 = this.anIntArray128[1] * this.anIntArray128[1] >> 12;
		@Pc(99) int local99 = this.anIntArray128[2] * this.anIntArray128[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local87 + local75 + local99 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray128[1] = (this.anIntArray128[1] << 12) / local112;
			this.anIntArray128[0] = (this.anIntArray128[0] << 12) / local112;
			this.anIntArray128[2] = (this.anIntArray128[2] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(22) int local22 = Static542.anInt9757 * this.anInt2684 >> 12;
			@Pc(32) int[] local32 = this.method9156(Static591.anInt6375 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method9156(arg0, 0);
			@Pc(50) int[] local50 = this.method9156(Static591.anInt6375 & arg0 + 1, 0);
			for (@Pc(52) int local52 = 0; local52 < Static222.anInt4971; local52++) {
				@Pc(66) int local66 = local22 * (local50[local52] - local32[local52]) >> 12;
				@Pc(87) int local87 = local22 * (local38[local52 - 1 & Static620.anInt10845] - local38[Static620.anInt10845 & local52 + 1]) >> 12;
				@Pc(91) int local91 = local87 >> 4;
				@Pc(95) int local95 = local66 >> 4;
				if (local91 < 0) {
					local91 = -local91;
				}
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local91 > 255) {
					local91 = 255;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				@Pc(136) int local136 = Class24.aByteArray16[local91 + (local95 * (local95 + 1) >> 1)] & 0xFF;
				@Pc(142) int local142 = local136 * 4096 >> 8;
				@Pc(148) int local148 = local136 * local87 >> 8;
				@Pc(154) int local154 = local66 * local136 >> 8;
				@Pc(163) int local163 = local154 * this.anIntArray128[1] >> 12;
				@Pc(172) int local172 = local148 * this.anIntArray128[0] >> 12;
				@Pc(181) int local181 = this.anIntArray128[2] * local142 >> 12;
				local11[local52] = local181 + local172 + local163;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		this.method2529();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2684 = arg0.method8326();
		} else if (arg1 == 1) {
			this.anInt2683 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt2681 = arg0.method8326();
		}
	}
}
