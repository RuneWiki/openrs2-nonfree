import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class2_Sub1_Sub30 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
	private int anInt5304 = 3216;

	@OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
	private int anInt5305 = 4096;

	@OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
	private int anInt5306 = 3216;

	@OriginalMember(owner = "client!qk", name = "W", descriptor = "[I")
	private final int[] anIntArray457 = new int[3];

	static {
		new Class62("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	private void method4730() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5304 / 4096.0F));
		this.anIntArray457[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt5306 / 4096.0F)));
		this.anIntArray457[1] = (int) (Math.cos((double) ((float) this.anInt5306 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray457[2] = (int) (Math.sin((double) ((float) this.anInt5304 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray457[0] * this.anIntArray457[0] >> 12;
		@Pc(81) int local81 = this.anIntArray457[1] * this.anIntArray457[1] >> 12;
		@Pc(93) int local93 = this.anIntArray457[2] * this.anIntArray457[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray457[2] = (this.anIntArray457[2] << 12) / local112;
			this.anIntArray457[1] = (this.anIntArray457[1] << 12) / local112;
			this.anIntArray457[0] = (this.anIntArray457[0] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(27) int local27 = Static87.anInt1877 * this.anInt5305 >> 12;
			@Pc(37) int[] local37 = this.method6069(0, Static67.anInt1510 & arg0 - 1);
			@Pc(43) int[] local43 = this.method6069(0, arg0);
			@Pc(53) int[] local53 = this.method6069(0, arg0 + 1 & Static67.anInt1510);
			for (@Pc(55) int local55 = 0; local55 < Static391.anInt7118; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(90) int local90 = local27 * (local43[Static235.anInt4676 & local55 - 1] - local43[Static235.anInt4676 & local55 + 1]) >> 12;
				@Pc(94) int local94 = local90 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				@Pc(103) int local103 = local70 >> 4;
				if (local94 > 255) {
					local94 = 255;
				}
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(135) int local135 = Class7_Sub1.aByteArray18[local94 + ((local103 + 1) * local103 >> 1)] & 0xFF;
				@Pc(141) int local141 = local135 * 4096 >> 8;
				@Pc(147) int local147 = local135 * local90 >> 8;
				@Pc(153) int local153 = local135 * local70 >> 8;
				@Pc(162) int local162 = local141 * this.anIntArray457[2] >> 12;
				@Pc(171) int local171 = local147 * this.anIntArray457[0] >> 12;
				@Pc(180) int local180 = this.anIntArray457[1] * local153 >> 12;
				local11[local55] = local171 + local180 + local162;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		this.method4730();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt5305 = arg1.method5753();
		} else if (arg0 == 1) {
			this.anInt5306 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt5304 = arg1.method5753();
		}
	}
}
