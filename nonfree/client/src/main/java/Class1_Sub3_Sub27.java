import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub3_Sub27 extends Class1_Sub3 {

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
	private int anInt6832 = 3216;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
	private int anInt6833 = 4096;

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "[I")
	private final int[] anIntArray515 = new int[3];

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
	private int anInt6835 = 3216;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	private void method5909() {
		@Pc(22) double local22 = Math.cos((double) ((float) this.anInt6832 / 4096.0F));
		this.anIntArray515[0] = (int) (Math.sin((double) ((float) this.anInt6835 / 4096.0F)) * 4096.0D * local22);
		this.anIntArray515[1] = (int) (Math.cos((double) ((float) this.anInt6835 / 4096.0F)) * 4096.0D * local22);
		this.anIntArray515[2] = (int) (Math.sin((double) ((float) this.anInt6832 / 4096.0F)) * 4096.0D);
		@Pc(80) int local80 = this.anIntArray515[0] * this.anIntArray515[0] >> 12;
		@Pc(92) int local92 = this.anIntArray515[1] * this.anIntArray515[1] >> 12;
		@Pc(104) int local104 = this.anIntArray515[2] * this.anIntArray515[2] >> 12;
		@Pc(117) int local117 = (int) (Math.sqrt((double) (local104 + local92 + local80 >> 12)) * 4096.0D);
		if (local117 != 0) {
			this.anIntArray515[0] = (this.anIntArray515[0] << 12) / local117;
			this.anIntArray515[1] = (this.anIntArray515[1] << 12) / local117;
			this.anIntArray515[2] = (this.anIntArray515[2] << 12) / local117;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6833 = arg0.method3056();
		} else if (arg1 == 1) {
			this.anInt6835 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt6832 = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		this.method5909();
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(22) int local22 = Static340.anInt6358 * this.anInt6833 >> 12;
			@Pc(32) int[] local32 = this.method7911(arg0 - 1 & Static226.anInt4534, 0);
			@Pc(38) int[] local38 = this.method7911(arg0, 0);
			@Pc(48) int[] local48 = this.method7911(Static226.anInt4534 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static236.anInt4609; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(85) int local85 = local22 * (local38[local50 - 1 & Static36.anInt1319] - local38[Static36.anInt1319 & local50 + 1]) >> 12;
				@Pc(89) int local89 = local85 >> 4;
				if (local89 < 0) {
					local89 = -local89;
				}
				@Pc(101) int local101 = local65 >> 4;
				if (local89 > 255) {
					local89 = 255;
				}
				if (local101 < 0) {
					local101 = -local101;
				}
				if (local101 > 255) {
					local101 = 255;
				}
				@Pc(133) int local133 = Class214.aByteArray78[local89 + ((local101 + 1) * local101 >> 1)] & 0xFF;
				@Pc(139) int local139 = local133 * local65 >> 8;
				@Pc(145) int local145 = local133 * 4096 >> 8;
				@Pc(151) int local151 = local133 * local85 >> 8;
				@Pc(160) int local160 = local139 * this.anIntArray515[1] >> 12;
				@Pc(169) int local169 = this.anIntArray515[0] * local151 >> 12;
				@Pc(178) int local178 = local145 * this.anIntArray515[2] >> 12;
				local11[local50] = local169 + local160 + local178;
			}
		}
		return local11;
	}
}
