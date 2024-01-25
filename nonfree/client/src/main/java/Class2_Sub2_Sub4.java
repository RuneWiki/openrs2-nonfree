import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!br", name = "N", descriptor = "I")
	private int anInt580 = 3216;

	@OriginalMember(owner = "client!br", name = "V", descriptor = "I")
	private int anInt584 = 4096;

	@OriginalMember(owner = "client!br", name = "P", descriptor = "[I")
	private final int[] anIntArray39 = new int[3];

	@OriginalMember(owner = "client!br", name = "X", descriptor = "I")
	private int anInt586 = 3216;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt584 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt586 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt580 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(26) int local26 = this.anInt584 * Static295.anInt5968 >> 12;
			@Pc(36) int[] local36 = this.method5876(0, arg0 - 1 & Static285.anInt5782);
			@Pc(42) int[] local42 = this.method5876(0, arg0);
			@Pc(52) int[] local52 = this.method5876(0, arg0 + 1 & Static285.anInt5782);
			for (@Pc(54) int local54 = 0; local54 < Static339.anInt6735; local54++) {
				@Pc(69) int local69 = (local52[local54] - local36[local54]) * local26 >> 12;
				@Pc(89) int local89 = (local42[Static25.anInt1346 & local54 - 1] - local42[local54 + 1 & Static25.anInt1346]) * local26 >> 12;
				@Pc(93) int local93 = local89 >> 4;
				if (local93 < 0) {
					local93 = -local93;
				}
				@Pc(105) int local105 = local69 >> 4;
				if (local93 > 255) {
					local93 = 255;
				}
				if (local105 < 0) {
					local105 = -local105;
				}
				if (local105 > 255) {
					local105 = 255;
				}
				@Pc(140) int local140 = Class2_Sub4.aByteArray8[local93 + ((local105 + 1) * local105 >> 1)] & 0xFF;
				@Pc(146) int local146 = local140 * local69 >> 8;
				@Pc(152) int local152 = local89 * local140 >> 8;
				@Pc(158) int local158 = local140 * 4096 >> 8;
				@Pc(167) int local167 = local158 * this.anIntArray39[2] >> 12;
				@Pc(176) int local176 = this.anIntArray39[0] * local152 >> 12;
				@Pc(185) int local185 = this.anIntArray39[1] * local146 >> 12;
				local15[local54] = local176 + local185 + local167;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(B)V")
	private void method793() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt580 / 4096.0F));
		this.anIntArray39[0] = (int) (local11 * Math.sin((double) ((float) this.anInt586 / 4096.0F)) * 4096.0D);
		this.anIntArray39[1] = (int) (local11 * Math.cos((double) ((float) this.anInt586 / 4096.0F)) * 4096.0D);
		this.anIntArray39[2] = (int) (Math.sin((double) ((float) this.anInt580 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray39[0] * this.anIntArray39[0] >> 12;
		@Pc(81) int local81 = this.anIntArray39[1] * this.anIntArray39[1] >> 12;
		@Pc(98) int local98 = this.anIntArray39[2] * this.anIntArray39[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local81 + local69 + local98 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray39[0] = (this.anIntArray39[0] << 12) / local112;
			this.anIntArray39[1] = (this.anIntArray39[1] << 12) / local112;
			this.anIntArray39[2] = (this.anIntArray39[2] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		this.method793();
	}
}
