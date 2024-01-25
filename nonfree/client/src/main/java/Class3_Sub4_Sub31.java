import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class3_Sub4_Sub31 extends Class3_Sub4 {

	@OriginalMember(owner = "client!qr", name = "N", descriptor = "[I")
	private final int[] anIntArray356 = new int[3];

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
	private int anInt5809 = 4096;

	@OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
	private int anInt5810 = 3216;

	@OriginalMember(owner = "client!qr", name = "O", descriptor = "I")
	private int anInt5811 = 3216;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
	private void method4825() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5810 / 4096.0F));
		this.anIntArray356[0] = (int) (local11 * Math.sin((double) ((float) this.anInt5811 / 4096.0F)) * 4096.0D);
		this.anIntArray356[1] = (int) (Math.cos((double) ((float) this.anInt5811 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray356[2] = (int) (Math.sin((double) ((float) this.anInt5810 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray356[0] * this.anIntArray356[0] >> 12;
		@Pc(87) int local87 = this.anIntArray356[1] * this.anIntArray356[1] >> 12;
		@Pc(99) int local99 = this.anIntArray356[2] * this.anIntArray356[2] >> 12;
		@Pc(113) int local113 = (int) (Math.sqrt((double) (local99 + local69 + local87 >> 12)) * 4096.0D);
		if (local113 != 0) {
			this.anIntArray356[0] = (this.anIntArray356[0] << 12) / local113;
			this.anIntArray356[2] = (this.anIntArray356[2] << 12) / local113;
			this.anIntArray356[1] = (this.anIntArray356[1] << 12) / local113;
		}
	}

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		this.method4825();
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(27) int local27 = this.anInt5809 * Static37.anInt628 >> 12;
			@Pc(37) int[] local37 = this.method6139(0, Static165.anInt2326 & arg0 - 1);
			@Pc(43) int[] local43 = this.method6139(0, arg0);
			@Pc(53) int[] local53 = this.method6139(0, Static165.anInt2326 & arg0 + 1);
			for (@Pc(55) int local55 = 0; local55 < Static148.anInt2687; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(91) int local91 = local27 * (local43[Static225.anInt3793 & local55 - 1] - local43[local55 + 1 & Static225.anInt3793]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				@Pc(99) int local99 = local70 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(143) int local143 = Class157.aByteArray77[((local99 + 1) * local99 >> 1) + local95] & 0xFF;
				@Pc(149) int local149 = local70 * local143 >> 8;
				@Pc(155) int local155 = local91 * local143 >> 8;
				@Pc(161) int local161 = local143 * 4096 >> 8;
				@Pc(170) int local170 = local161 * this.anIntArray356[2] >> 12;
				@Pc(179) int local179 = local149 * this.anIntArray356[1] >> 12;
				@Pc(188) int local188 = this.anIntArray356[0] * local155 >> 12;
				local11[local55] = local170 + local179 + local188;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5809 = arg0.method4083();
		} else if (arg1 == 1) {
			this.anInt5811 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt5810 = arg0.method4083();
		}
	}
}
