import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class3_Sub2_Sub22 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
	private int anInt3075 = 3216;

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
	private int anInt3079 = 4096;

	@OriginalMember(owner = "client!lm", name = "R", descriptor = "[I")
	private int[] anIntArray353 = new int[3];

	@OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
	private int anInt3074 = 3216;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(28) int local28 = this.anInt3079 * Static73.anInt1379 >> 12;
			@Pc(38) int[] local38 = this.method4954(arg0 - 1 & Static148.anInt2810, 0);
			@Pc(44) int[] local44 = this.method4954(arg0, 0);
			@Pc(54) int[] local54 = this.method4954(arg0 + 1 & Static148.anInt2810, 0);
			for (@Pc(56) int local56 = 0; local56 < Static22.anInt421; local56++) {
				@Pc(76) int local76 = local28 * (local54[local56] - local38[local56]) >> 12;
				@Pc(97) int local97 = (local44[local56 - 1 & Static84.anInt1566] - local44[Static84.anInt1566 & local56 + 1]) * local28 >> 12;
				@Pc(101) int local101 = local76 >> 4;
				if (local101 < 0) {
					local101 = -local101;
				}
				@Pc(112) int local112 = local97 >> 4;
				if (local101 > 255) {
					local101 = 255;
				}
				if (local112 < 0) {
					local112 = -local112;
				}
				if (local112 > 255) {
					local112 = 255;
				}
				@Pc(145) int local145 = Class3_Sub2_Sub33.aByteArray54[((local101 + 1) * local101 >> 1) + local112] & 0xFF;
				@Pc(151) int local151 = local97 * local145 >> 8;
				@Pc(157) int local157 = local145 * 4096 >> 8;
				@Pc(166) int local166 = this.anIntArray353[0] * local151 >> 12;
				@Pc(175) int local175 = this.anIntArray353[2] * local157 >> 12;
				@Pc(181) int local181 = local145 * local76 >> 8;
				@Pc(190) int local190 = this.anIntArray353[1] * local181 >> 12;
				local11[local56] = local166 + local190 + local175;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3079 = arg1.method3948();
		} else if (arg0 == 1) {
			this.anInt3075 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt3074 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	private void method2720() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3074 / 4096.0F));
		this.anIntArray353[0] = (int) (Math.sin((double) ((float) this.anInt3075 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray353[1] = (int) (Math.cos((double) ((float) this.anInt3075 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray353[2] = (int) (Math.sin((double) ((float) this.anInt3074 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray353[0] * this.anIntArray353[0] >> 12;
		@Pc(81) int local81 = this.anIntArray353[2] * this.anIntArray353[2] >> 12;
		@Pc(93) int local93 = this.anIntArray353[1] * this.anIntArray353[1] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local81 + local93 + local69 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray353[1] = (this.anIntArray353[1] << 12) / local112;
			this.anIntArray353[0] = (this.anIntArray353[0] << 12) / local112;
			this.anIntArray353[2] = (this.anIntArray353[2] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		this.method2720();
	}
}
