import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class6_Sub1_Sub22 extends Class6_Sub1 {

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
	private int anInt6239 = 3216;

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "[I")
	private final int[] anIntArray368 = new int[3];

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
	private int anInt6241 = 3216;

	@OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
	private int anInt6245 = 4096;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6245 = arg0.method8363();
		} else if (arg1 == 1) {
			this.anInt6241 = arg0.method8363();
		} else if (arg1 == 2) {
			this.anInt6239 = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		this.method5271();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(29) int local29 = this.anInt6245 * Static643.anInt10390 >> 12;
			@Pc(39) int[] local39 = this.method8963(0, arg0 - 1 & Static476.anInt8174);
			@Pc(45) int[] local45 = this.method8963(0, arg0);
			@Pc(55) int[] local55 = this.method8963(0, arg0 + 1 & Static476.anInt8174);
			for (@Pc(57) int local57 = 0; local57 < Static479.anInt8231; local57++) {
				@Pc(72) int local72 = local29 * (local55[local57] - local39[local57]) >> 12;
				@Pc(92) int local92 = (local45[local57 - 1 & Static413.anInt7225] - local45[local57 + 1 & Static413.anInt7225]) * local29 >> 12;
				@Pc(96) int local96 = local92 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				@Pc(108) int local108 = local72 >> 4;
				if (local96 > 255) {
					local96 = 255;
				}
				if (local108 < 0) {
					local108 = -local108;
				}
				if (local108 > 255) {
					local108 = 255;
				}
				@Pc(138) int local138 = Class261.aByteArray83[local96 + (local108 * (local108 + 1) >> 1)] & 0xFF;
				@Pc(144) int local144 = local92 * local138 >> 8;
				@Pc(150) int local150 = local138 * local72 >> 8;
				@Pc(156) int local156 = local138 * 4096 >> 8;
				@Pc(165) int local165 = local144 * this.anIntArray368[0] >> 12;
				@Pc(174) int local174 = this.anIntArray368[1] * local150 >> 12;
				@Pc(183) int local183 = this.anIntArray368[2] * local156 >> 12;
				local11[local57] = local183 + local174 + local165;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	private void method5271() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6239 / 4096.0F));
		this.anIntArray368[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt6241 / 4096.0F)));
		this.anIntArray368[1] = (int) (Math.cos((double) ((float) this.anInt6241 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray368[2] = (int) (Math.sin((double) ((float) this.anInt6239 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray368[0] * this.anIntArray368[0] >> 12;
		@Pc(81) int local81 = this.anIntArray368[1] * this.anIntArray368[1] >> 12;
		@Pc(93) int local93 = this.anIntArray368[2] * this.anIntArray368[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local81 + local69 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray368[2] = (this.anIntArray368[2] << 12) / local106;
			this.anIntArray368[1] = (this.anIntArray368[1] << 12) / local106;
			this.anIntArray368[0] = (this.anIntArray368[0] << 12) / local106;
		}
	}
}
