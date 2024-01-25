import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class2_Sub4_Sub7 extends Class2_Sub4 {

	@OriginalMember(owner = "client!cl", name = "I", descriptor = "[I")
	private final int[] anIntArray147 = new int[3];

	@OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
	private int anInt1988 = 3216;

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
	private int anInt1986 = 4096;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
	private int anInt1983 = 3216;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		this.method1683();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(22) int local22 = Static276.anInt8845 * this.anInt1986 >> 12;
			@Pc(32) int[] local32 = this.method8892(arg0 - 1 & Static463.anInt7489, 0);
			@Pc(38) int[] local38 = this.method8892(arg0, 0);
			@Pc(48) int[] local48 = this.method8892(arg0 + 1 & Static463.anInt7489, 0);
			for (@Pc(50) int local50 = 0; local50 < Static395.anInt6816; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(86) int local86 = (local38[Static104.anInt2340 & local50 - 1] - local38[local50 + 1 & Static104.anInt2340]) * local22 >> 12;
				@Pc(90) int local90 = local86 >> 4;
				@Pc(94) int local94 = local65 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				@Pc(132) int local132 = Class261.aByteArray71[(local94 * (local94 + 1) >> 1) + local90] & 0xFF;
				@Pc(138) int local138 = local65 * local132 >> 8;
				@Pc(144) int local144 = local132 * local86 >> 8;
				@Pc(150) int local150 = local132 * 4096 >> 8;
				@Pc(159) int local159 = this.anIntArray147[0] * local144 >> 12;
				@Pc(168) int local168 = this.anIntArray147[1] * local138 >> 12;
				@Pc(177) int local177 = local150 * this.anIntArray147[2] >> 12;
				local11[local50] = local159 + local168 + local177;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
	private void method1683() {
		@Pc(17) double local17 = Math.cos((double) ((float) this.anInt1988 / 4096.0F));
		this.anIntArray147[0] = (int) (local17 * Math.sin((double) ((float) this.anInt1983 / 4096.0F)) * 4096.0D);
		this.anIntArray147[1] = (int) (local17 * 4096.0D * Math.cos((double) ((float) this.anInt1983 / 4096.0F)));
		this.anIntArray147[2] = (int) (Math.sin((double) ((float) this.anInt1988 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray147[0] * this.anIntArray147[0] >> 12;
		@Pc(87) int local87 = this.anIntArray147[1] * this.anIntArray147[1] >> 12;
		@Pc(99) int local99 = this.anIntArray147[2] * this.anIntArray147[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local75 + local87 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray147[2] = (this.anIntArray147[2] << 12) / local112;
			this.anIntArray147[0] = (this.anIntArray147[0] << 12) / local112;
			this.anIntArray147[1] = (this.anIntArray147[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1986 = arg0.method2825();
		} else if (arg1 == 1) {
			this.anInt1983 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anInt1988 = arg0.method2825();
		}
	}
}
