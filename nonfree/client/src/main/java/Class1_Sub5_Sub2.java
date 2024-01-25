import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!be", name = "U", descriptor = "I")
	private int anInt430 = 4096;

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
	private int anInt431 = 3216;

	@OriginalMember(owner = "client!be", name = "L", descriptor = "I")
	private int anInt422 = 3216;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "[I")
	private final int[] anIntArray21 = new int[3];

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt430 = arg0.method5715();
		} else if (arg1 == 1) {
			this.anInt431 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt422 = arg0.method5715();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(27) int local27 = Static192.anInt3988 * this.anInt430 >> 12;
			@Pc(37) int[] local37 = this.method5802(0, arg0 - 1 & Static42.anInt1137);
			@Pc(43) int[] local43 = this.method5802(0, arg0);
			@Pc(53) int[] local53 = this.method5802(0, arg0 + 1 & Static42.anInt1137);
			for (@Pc(55) int local55 = 0; local55 < Static75.anInt1566; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(91) int local91 = (local43[local55 - 1 & Static239.anInt2816] - local43[Static239.anInt2816 & local55 + 1]) * local27 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(104) int local104 = local70 >> 4;
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local104 > 255) {
					local104 = 255;
				}
				@Pc(139) int local139 = Class1_Sub1.aByteArray1[local95 + ((local104 + 1) * local104 >> 1)] & 0xFF;
				@Pc(145) int local145 = local139 * local91 >> 8;
				@Pc(151) int local151 = local139 * 4096 >> 8;
				@Pc(157) int local157 = local139 * local70 >> 8;
				@Pc(166) int local166 = this.anIntArray21[1] * local157 >> 12;
				@Pc(175) int local175 = local145 * this.anIntArray21[0] >> 12;
				@Pc(184) int local184 = local151 * this.anIntArray21[2] >> 12;
				local11[local55] = local184 + local175 + local166;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		this.method398();
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)V")
	private void method398() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt422 / 4096.0F));
		this.anIntArray21[0] = (int) (Math.sin((double) ((float) this.anInt431 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray21[1] = (int) (local11 * Math.cos((double) ((float) this.anInt431 / 4096.0F)) * 4096.0D);
		this.anIntArray21[2] = (int) (Math.sin((double) ((float) this.anInt422 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray21[0] * this.anIntArray21[0] >> 12;
		@Pc(81) int local81 = this.anIntArray21[1] * this.anIntArray21[1] >> 12;
		@Pc(93) int local93 = this.anIntArray21[2] * this.anIntArray21[2] >> 12;
		@Pc(113) int local113 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local113 != 0) {
			this.anIntArray21[2] = (this.anIntArray21[2] << 12) / local113;
			this.anIntArray21[1] = (this.anIntArray21[1] << 12) / local113;
			this.anIntArray21[0] = (this.anIntArray21[0] << 12) / local113;
		}
	}
}
