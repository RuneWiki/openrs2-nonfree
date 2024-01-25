import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pba", name = "E", descriptor = "I")
	private int anInt6957 = 4096;

	@OriginalMember(owner = "client!pba", name = "K", descriptor = "I")
	private int anInt6961 = 3216;

	@OriginalMember(owner = "client!pba", name = "I", descriptor = "I")
	private int anInt6959 = 3216;

	@OriginalMember(owner = "client!pba", name = "H", descriptor = "[I")
	private final int[] anIntArray409 = new int[3];

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "(I)V")
	private void method5619() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6961 / 4096.0F));
		this.anIntArray409[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt6959 / 4096.0F)));
		this.anIntArray409[1] = (int) (local11 * Math.cos((double) ((float) this.anInt6959 / 4096.0F)) * 4096.0D);
		this.anIntArray409[2] = (int) (Math.sin((double) ((float) this.anInt6961 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray409[0] * this.anIntArray409[0] >> 12;
		@Pc(81) int local81 = this.anIntArray409[1] * this.anIntArray409[1] >> 12;
		@Pc(93) int local93 = this.anIntArray409[2] * this.anIntArray409[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray409[0] = (this.anIntArray409[0] << 12) / local112;
			this.anIntArray409[2] = (this.anIntArray409[2] << 12) / local112;
			this.anIntArray409[1] = (this.anIntArray409[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		this.method5619();
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(22) int local22 = this.anInt6957 * Static258.anInt4723 >> 12;
			@Pc(32) int[] local32 = this.method7836(arg0 - 1 & Static98.anInt1743, 0);
			@Pc(38) int[] local38 = this.method7836(arg0, 0);
			@Pc(48) int[] local48 = this.method7836(arg0 + 1 & Static98.anInt1743, 0);
			for (@Pc(50) int local50 = 0; local50 < Static501.anInt8748; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(85) int local85 = local22 * (local38[Static326.anInt4973 & local50 - 1] - local38[local50 + 1 & Static326.anInt4973]) >> 12;
				@Pc(89) int local89 = local85 >> 4;
				@Pc(93) int local93 = local65 >> 4;
				if (local89 < 0) {
					local89 = -local89;
				}
				if (local93 < 0) {
					local93 = -local93;
				}
				if (local89 > 255) {
					local89 = 255;
				}
				if (local93 > 255) {
					local93 = 255;
				}
				@Pc(132) int local132 = Class62_Sub1.aByteArray13[local89 + ((local93 + 1) * local93 >> 1)] & 0xFF;
				@Pc(138) int local138 = local65 * local132 >> 8;
				@Pc(144) int local144 = local132 * local85 >> 8;
				@Pc(150) int local150 = local132 * 4096 >> 8;
				@Pc(159) int local159 = this.anIntArray409[1] * local138 >> 12;
				@Pc(168) int local168 = local144 * this.anIntArray409[0] >> 12;
				@Pc(177) int local177 = this.anIntArray409[2] * local150 >> 12;
				local11[local50] = local159 + local168 + local177;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6957 = arg1.method7945();
		} else if (arg0 == 1) {
			this.anInt6959 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt6961 = arg1.method7945();
		}
	}
}
