import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
	private int anInt2524 = 4096;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
	private int anInt2529 = 3216;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
	private int anInt2526 = 3216;

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "[I")
	private int[] anIntArray201 = new int[3];

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		this.method2004();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2524 = arg0.method2593();
		} else if (arg1 == 1) {
			this.anInt2529 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt2526 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
	private void method2004() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2526 / 4096.0F));
		this.anIntArray201[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt2529 / 4096.0F)));
		this.anIntArray201[1] = (int) (local11 * Math.cos((double) ((float) this.anInt2529 / 4096.0F)) * 4096.0D);
		this.anIntArray201[2] = (int) (Math.sin((double) ((float) this.anInt2526 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray201[2] * this.anIntArray201[2] >> 12;
		@Pc(85) int local85 = this.anIntArray201[0] * this.anIntArray201[0] >> 12;
		@Pc(97) int local97 = this.anIntArray201[1] * this.anIntArray201[1] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local97 + local85 + local73 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray201[0] = (this.anIntArray201[0] << 12) / local111;
			this.anIntArray201[1] = (this.anIntArray201[1] << 12) / local111;
			this.anIntArray201[2] = (this.anIntArray201[2] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(18) int local18 = Static237.anInt3638 * this.anInt2524 >> 12;
			@Pc(28) int[] local28 = this.method4570(Static167.anInt3492 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method4570(arg0, 0);
			@Pc(46) int[] local46 = this.method4570(Static167.anInt3492 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static299.anInt5670; local48++) {
				@Pc(64) int local64 = (local46[local48] - local28[local48]) * local18 >> 12;
				@Pc(85) int local85 = (local36[local48 - 1 & Static142.anInt2791] - local36[local48 + 1 & Static142.anInt2791]) * local18 >> 12;
				@Pc(89) int local89 = local85 >> 4;
				@Pc(93) int local93 = local64 >> 4;
				if (local89 < 0) {
					local89 = -local89;
				}
				if (local93 < 0) {
					local93 = -local93;
				}
				if (local93 > 255) {
					local93 = 255;
				}
				if (local89 > 255) {
					local89 = 255;
				}
				@Pc(132) int local132 = Class1_Sub2_Sub11.aByteArray22[local89 + (local93 * (local93 + 1) >> 1)] & 0xFF;
				@Pc(138) int local138 = local64 * local132 >> 8;
				@Pc(144) int local144 = local132 * 4096 >> 8;
				@Pc(153) int local153 = this.anIntArray201[1] * local138 >> 12;
				@Pc(162) int local162 = local144 * this.anIntArray201[2] >> 12;
				@Pc(168) int local168 = local85 * local132 >> 8;
				@Pc(177) int local177 = this.anIntArray201[0] * local168 >> 12;
				local7[local48] = local153 + local177 + local162;
			}
		}
		return local7;
	}
}
