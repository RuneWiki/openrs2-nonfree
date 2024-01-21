import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "[I")
	private final int[] anIntArray360 = new int[3];

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
	private int anInt3168 = 4096;

	@OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
	private int anInt3166 = 3216;

	@OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
	private int anInt3174 = 3216;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
	private void method2493() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3174 / 4096.0F));
		this.anIntArray360[0] = (int) (Math.sin((double) ((float) this.anInt3166 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray360[1] = (int) (Math.cos((double) ((float) this.anInt3166 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray360[2] = (int) (Math.sin((double) ((float) this.anInt3174 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray360[1] * this.anIntArray360[1] >> 12;
		@Pc(86) int local86 = this.anIntArray360[0] * this.anIntArray360[0] >> 12;
		@Pc(98) int local98 = this.anIntArray360[2] * this.anIntArray360[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local74 + local86 + local98 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray360[2] = (this.anIntArray360[2] << 12) / local111;
			this.anIntArray360[0] = (this.anIntArray360[0] << 12) / local111;
			this.anIntArray360[1] = (this.anIntArray360[1] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(22) int local22 = Static146.anInt3812 * this.anInt3168 >> 12;
			@Pc(32) int[] local32 = this.method3569(arg0 - 1 & Static53.anInt1668, 0);
			@Pc(38) int[] local38 = this.method3569(arg0, 0);
			@Pc(48) int[] local48 = this.method3569(arg0 + 1 & Static53.anInt1668, 0);
			for (@Pc(50) int local50 = 0; local50 < Static106.anInt3045; local50++) {
				@Pc(72) int local72 = (local38[Static96.anInt3099 & local50 - 1] - local38[Static96.anInt3099 & local50 + 1]) * local22 >> 12;
				@Pc(85) int local85 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(89) int local89 = local85 >> 4;
				if (local89 < 0) {
					local89 = -local89;
				}
				if (local89 > 255) {
					local89 = 255;
				}
				@Pc(108) int local108 = local72 >> 4;
				if (local108 < 0) {
					local108 = -local108;
				}
				if (local108 > 255) {
					local108 = 255;
				}
				@Pc(136) int local136 = Class2_Sub2_Sub13.aByteArray22[local108 + (local89 * (local89 + 1) >> 1)] & 0xFF;
				@Pc(142) int local142 = local136 * local85 >> 8;
				@Pc(148) int local148 = local136 * 4096 >> 8;
				@Pc(157) int local157 = local148 * this.anIntArray360[2] >> 12;
				@Pc(163) int local163 = local136 * local72 >> 8;
				@Pc(172) int local172 = local163 * this.anIntArray360[0] >> 12;
				@Pc(181) int local181 = local142 * this.anIntArray360[1] >> 12;
				local11[local50] = local157 + local172 + local181;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3168 = arg1.method234();
		} else if (arg0 == 1) {
			this.anInt3166 = arg1.method234();
		} else if (arg0 == 2) {
			this.anInt3174 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		this.method2493();
	}
}
