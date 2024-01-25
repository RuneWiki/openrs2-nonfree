import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class5_Sub3_Sub19 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
	private int anInt3409 = 3216;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "[I")
	private final int[] anIntArray353 = new int[3];

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "I")
	private int anInt3411 = 4096;

	@OriginalMember(owner = "client!ko", name = "cb", descriptor = "I")
	private int anInt3419 = 3216;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
	private void method3096() {
		@Pc(17) double local17 = Math.cos((double) ((float) this.anInt3419 / 4096.0F));
		this.anIntArray353[0] = (int) (Math.sin((double) ((float) this.anInt3409 / 4096.0F)) * 4096.0D * local17);
		this.anIntArray353[1] = (int) (Math.cos((double) ((float) this.anInt3409 / 4096.0F)) * local17 * 4096.0D);
		this.anIntArray353[2] = (int) (Math.sin((double) ((float) this.anInt3419 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray353[0] * this.anIntArray353[0] >> 12;
		@Pc(87) int local87 = this.anIntArray353[1] * this.anIntArray353[1] >> 12;
		@Pc(99) int local99 = this.anIntArray353[2] * this.anIntArray353[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local75 + local87 + local99 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray353[2] = (this.anIntArray353[2] << 12) / local112;
			this.anIntArray353[0] = (this.anIntArray353[0] << 12) / local112;
			this.anIntArray353[1] = (this.anIntArray353[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(30) int local30 = Static193.anInt3689 * this.anInt3411 >> 12;
			@Pc(42) int[] local42 = this.method6020(0, Static221.anInt4359 & arg0 - 1);
			@Pc(50) int[] local50 = this.method6020(0, arg0);
			@Pc(62) int[] local62 = this.method6020(0, arg0 + 1 & Static221.anInt4359);
			for (@Pc(64) int local64 = 0; local64 < Static7.anInt129; local64++) {
				@Pc(79) int local79 = (local62[local64] - local42[local64]) * local30 >> 12;
				@Pc(99) int local99 = (local50[local64 - 1 & Static177.anInt3515] - local50[Static177.anInt3515 & local64 + 1]) * local30 >> 12;
				@Pc(103) int local103 = local99 >> 4;
				if (local103 < 0) {
					local103 = -local103;
				}
				@Pc(115) int local115 = local79 >> 4;
				if (local115 < 0) {
					local115 = -local115;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				if (local115 > 255) {
					local115 = 255;
				}
				@Pc(147) int local147 = Class5_Sub3_Sub36.aByteArray93[local103 + (local115 * (local115 + 1) >> 1)] & 0xFF;
				@Pc(153) int local153 = local147 * local99 >> 8;
				@Pc(159) int local159 = local147 * 4096 >> 8;
				@Pc(165) int local165 = local79 * local147 >> 8;
				@Pc(174) int local174 = this.anIntArray353[2] * local159 >> 12;
				@Pc(183) int local183 = this.anIntArray353[0] * local153 >> 12;
				@Pc(192) int local192 = this.anIntArray353[1] * local165 >> 12;
				local11[local64] = local183 + local192 + local174;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		this.method3096();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3411 = arg0.method5106();
		} else if (arg1 == 1) {
			this.anInt3409 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt3419 = arg0.method5106();
		}
	}
}
