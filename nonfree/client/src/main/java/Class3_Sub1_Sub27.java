import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class3_Sub1_Sub27 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
	private int anInt6291 = 4096;

	@OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
	private int anInt6296 = 3216;

	@OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
	private int anInt6299 = 3216;

	@OriginalMember(owner = "client!nj", name = "E", descriptor = "[I")
	private final int[] anIntArray545 = new int[3];

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "(I)V")
	private void method5265() {
		@Pc(19) double local19 = Math.cos((double) ((float) this.anInt6299 / 4096.0F));
		this.anIntArray545[0] = (int) (Math.sin((double) ((float) this.anInt6296 / 4096.0F)) * local19 * 4096.0D);
		this.anIntArray545[1] = (int) (Math.cos((double) ((float) this.anInt6296 / 4096.0F)) * 4096.0D * local19);
		this.anIntArray545[2] = (int) (Math.sin((double) ((float) this.anInt6299 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray545[0] * this.anIntArray545[0] >> 12;
		@Pc(89) int local89 = this.anIntArray545[1] * this.anIntArray545[1] >> 12;
		@Pc(101) int local101 = this.anIntArray545[2] * this.anIntArray545[2] >> 12;
		@Pc(116) int local116 = (int) (Math.sqrt((double) (local77 + local89 + local101 >> 12)) * 4096.0D);
		if (local116 != 0) {
			this.anIntArray545[1] = (this.anIntArray545[1] << 12) / local116;
			this.anIntArray545[2] = (this.anIntArray545[2] << 12) / local116;
			this.anIntArray545[0] = (this.anIntArray545[0] << 12) / local116;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt6291 = arg1.method7591();
		} else if (arg0 == 1) {
			this.anInt6296 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt6299 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(28) int local28 = Static113.anInt2476 * this.anInt6291 >> 12;
			@Pc(38) int[] local38 = this.method7778(0, arg0 - 1 & Static485.anInt8693);
			@Pc(44) int[] local44 = this.method7778(0, arg0);
			@Pc(54) int[] local54 = this.method7778(0, arg0 + 1 & Static485.anInt8693);
			for (@Pc(56) int local56 = 0; local56 < Static307.anInt4846; local56++) {
				@Pc(70) int local70 = local28 * (local54[local56] - local38[local56]) >> 12;
				@Pc(91) int local91 = (local44[Static324.anInt6207 & local56 - 1] - local44[local56 + 1 & Static324.anInt6207]) * local28 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(107) int local107 = local70 >> 4;
				if (local107 < 0) {
					local107 = -local107;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local107 > 255) {
					local107 = 255;
				}
				@Pc(141) int local141 = Class3_Sub1_Sub16.aByteArray45[local95 + (local107 * (local107 + 1) >> 1)] & 0xFF;
				@Pc(147) int local147 = local141 * 4096 >> 8;
				@Pc(153) int local153 = local70 * local141 >> 8;
				@Pc(159) int local159 = local91 * local141 >> 8;
				@Pc(168) int local168 = local159 * this.anIntArray545[0] >> 12;
				@Pc(177) int local177 = local153 * this.anIntArray545[1] >> 12;
				@Pc(186) int local186 = local147 * this.anIntArray545[2] >> 12;
				local17[local56] = local177 + local168 + local186;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		this.method5265();
	}
}
