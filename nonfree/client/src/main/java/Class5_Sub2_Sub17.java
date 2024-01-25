import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class5_Sub2_Sub17 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
	private int anInt4750 = 4096;

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
	private int anInt4749 = 3216;

	@OriginalMember(owner = "client!ij", name = "K", descriptor = "[I")
	private final int[] anIntArray249 = new int[3];

	@OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
	private int anInt4754 = 3216;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4750 = arg0.method7860();
		} else if (arg1 == 1) {
			this.anInt4754 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt4749 = arg0.method7860();
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		this.method4018();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(27) int local27 = Static318.anInt5992 * this.anInt4750 >> 12;
			@Pc(37) int[] local37 = this.method8945(arg0 - 1 & Static115.anInt2379, 0);
			@Pc(43) int[] local43 = this.method8945(arg0, 0);
			@Pc(53) int[] local53 = this.method8945(Static115.anInt2379 & arg0 + 1, 0);
			for (@Pc(55) int local55 = 0; local55 < Static195.anInt3759; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(91) int local91 = (local43[local55 - 1 & Static388.anInt6925] - local43[local55 + 1 & Static388.anInt6925]) * local27 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(107) int local107 = local70 >> 4;
				if (local95 > 255) {
					local95 = 255;
				}
				if (local107 < 0) {
					local107 = -local107;
				}
				if (local107 > 255) {
					local107 = 255;
				}
				@Pc(142) int local142 = Class140_Sub1.aByteArray80[local95 + (local107 * (local107 + 1) >> 1)] & 0xFF;
				@Pc(148) int local148 = local70 * local142 >> 8;
				@Pc(154) int local154 = local142 * local91 >> 8;
				@Pc(160) int local160 = local142 * 4096 >> 8;
				@Pc(169) int local169 = this.anIntArray249[1] * local148 >> 12;
				@Pc(178) int local178 = this.anIntArray249[0] * local154 >> 12;
				@Pc(187) int local187 = this.anIntArray249[2] * local160 >> 12;
				local11[local55] = local169 + local178 + local187;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
	private void method4018() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt4749 / 4096.0F));
		this.anIntArray249[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt4754 / 4096.0F)));
		this.anIntArray249[1] = (int) (local11 * Math.cos((double) ((float) this.anInt4754 / 4096.0F)) * 4096.0D);
		this.anIntArray249[2] = (int) (Math.sin((double) ((float) this.anInt4749 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray249[0] * this.anIntArray249[0] >> 12;
		@Pc(81) int local81 = this.anIntArray249[1] * this.anIntArray249[1] >> 12;
		@Pc(93) int local93 = this.anIntArray249[2] * this.anIntArray249[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local81 + local69 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray249[1] = (this.anIntArray249[1] << 12) / local106;
			this.anIntArray249[0] = (this.anIntArray249[0] << 12) / local106;
			this.anIntArray249[2] = (this.anIntArray249[2] << 12) / local106;
		}
	}
}
