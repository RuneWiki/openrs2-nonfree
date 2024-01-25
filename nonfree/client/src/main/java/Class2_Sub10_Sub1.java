import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
	private int anInt1127 = 4096;

	@OriginalMember(owner = "client!bu", name = "B", descriptor = "I")
	private int anInt1125 = 3216;

	@OriginalMember(owner = "client!bu", name = "G", descriptor = "[I")
	private final int[] anIntArray120 = new int[3];

	@OriginalMember(owner = "client!bu", name = "L", descriptor = "I")
	private int anInt1133 = 3216;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1127 = arg0.method6884();
		} else if (arg1 == 1) {
			this.anInt1125 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt1133 = arg0.method6884();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(27) int local27 = this.anInt1127 * Static346.anInt6409 >> 12;
			@Pc(37) int[] local37 = this.method8402(Static93.anInt1860 & arg0 - 1, 0);
			@Pc(43) int[] local43 = this.method8402(arg0, 0);
			@Pc(53) int[] local53 = this.method8402(Static93.anInt1860 & arg0 + 1, 0);
			for (@Pc(55) int local55 = 0; local55 < Static93.anInt1862; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(90) int local90 = local27 * (local43[local55 - 1 & Static603.anInt9994] - local43[Static603.anInt9994 & local55 + 1]) >> 12;
				@Pc(94) int local94 = local90 >> 4;
				@Pc(98) int local98 = local70 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				@Pc(135) int local135 = Class80_Sub1_Sub2.aByteArray89[(local98 * (local98 + 1) >> 1) + local94] & 0xFF;
				@Pc(141) int local141 = local135 * 4096 >> 8;
				@Pc(147) int local147 = local135 * local90 >> 8;
				@Pc(153) int local153 = local70 * local135 >> 8;
				@Pc(162) int local162 = this.anIntArray120[2] * local141 >> 12;
				@Pc(171) int local171 = local153 * this.anIntArray120[1] >> 12;
				@Pc(180) int local180 = this.anIntArray120[0] * local147 >> 12;
				local16[local55] = local162 + local171 + local180;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(B)V")
	private void method995() {
		@Pc(15) double local15 = Math.cos((double) ((float) this.anInt1133 / 4096.0F));
		this.anIntArray120[0] = (int) (Math.sin((double) ((float) this.anInt1125 / 4096.0F)) * local15 * 4096.0D);
		this.anIntArray120[1] = (int) (local15 * 4096.0D * Math.cos((double) ((float) this.anInt1125 / 4096.0F)));
		this.anIntArray120[2] = (int) (Math.sin((double) ((float) this.anInt1133 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray120[0] * this.anIntArray120[0] >> 12;
		@Pc(85) int local85 = this.anIntArray120[1] * this.anIntArray120[1] >> 12;
		@Pc(97) int local97 = this.anIntArray120[2] * this.anIntArray120[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local85 + local73 + local97 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray120[1] = (this.anIntArray120[1] << 12) / local110;
			this.anIntArray120[0] = (this.anIntArray120[0] << 12) / local110;
			this.anIntArray120[2] = (this.anIntArray120[2] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		this.method995();
	}
}
