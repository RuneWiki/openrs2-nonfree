import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
	private int anInt2053 = 3216;

	@OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
	private int anInt2046 = 4096;

	@OriginalMember(owner = "client!fm", name = "S", descriptor = "[I")
	private final int[] anIntArray97 = new int[3];

	@OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
	private int anInt2048 = 3216;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(22) int local22 = this.anInt2046 * Static406.anInt6568 >> 12;
			@Pc(32) int[] local32 = this.method5620(arg0 - 1 & Static249.anInt4068, 0);
			@Pc(38) int[] local38 = this.method5620(arg0, 0);
			@Pc(48) int[] local48 = this.method5620(Static249.anInt4068 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static434.anInt4326; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(86) int local86 = local22 * (local38[Static429.anInt7144 & local50 - 1] - local38[Static429.anInt7144 & local50 + 1]) >> 12;
				@Pc(90) int local90 = local86 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				@Pc(102) int local102 = local65 >> 4;
				if (local90 > 255) {
					local90 = 255;
				}
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(131) int local131 = Class164.aByteArray45[local90 + ((local102 + 1) * local102 >> 1)] & 0xFF;
				@Pc(137) int local137 = local86 * local131 >> 8;
				@Pc(143) int local143 = local131 * 4096 >> 8;
				@Pc(149) int local149 = local65 * local131 >> 8;
				@Pc(158) int local158 = local137 * this.anIntArray97[0] >> 12;
				@Pc(167) int local167 = local149 * this.anIntArray97[1] >> 12;
				@Pc(176) int local176 = this.anIntArray97[2] * local143 >> 12;
				local11[local50] = local167 + local158 + local176;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
	private void method1630() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2048 / 4096.0F));
		this.anIntArray97[0] = (int) (Math.sin((double) ((float) this.anInt2053 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray97[1] = (int) (Math.cos((double) ((float) this.anInt2053 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray97[2] = (int) (Math.sin((double) ((float) this.anInt2048 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray97[0] * this.anIntArray97[0] >> 12;
		@Pc(81) int local81 = this.anIntArray97[1] * this.anIntArray97[1] >> 12;
		@Pc(93) int local93 = this.anIntArray97[2] * this.anIntArray97[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local81 + local69 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray97[0] = (this.anIntArray97[0] << 12) / local106;
			this.anIntArray97[2] = (this.anIntArray97[2] << 12) / local106;
			this.anIntArray97[1] = (this.anIntArray97[1] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		this.method1630();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2046 = arg1.method4485();
		} else if (arg0 == 1) {
			this.anInt2053 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anInt2048 = arg1.method4485();
		}
	}
}
