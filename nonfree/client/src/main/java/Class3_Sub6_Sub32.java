import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class3_Sub6_Sub32 extends Class3_Sub6 {

	@OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
	private int anInt8327 = 3216;

	@OriginalMember(owner = "client!tp", name = "K", descriptor = "I")
	private int anInt8330 = 4096;

	@OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
	private int anInt8332 = 3216;

	@OriginalMember(owner = "client!tp", name = "L", descriptor = "[I")
	private final int[] anIntArray532 = new int[3];

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		this.method6921();
	}

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "(I)V")
	private void method6921() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt8327 / 4096.0F));
		this.anIntArray532[0] = (int) (Math.sin((double) ((float) this.anInt8332 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray532[1] = (int) (local11 * Math.cos((double) ((float) this.anInt8332 / 4096.0F)) * 4096.0D);
		this.anIntArray532[2] = (int) (Math.sin((double) ((float) this.anInt8327 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray532[0] * this.anIntArray532[0] >> 12;
		@Pc(89) int local89 = this.anIntArray532[1] * this.anIntArray532[1] >> 12;
		@Pc(101) int local101 = this.anIntArray532[2] * this.anIntArray532[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local77 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray532[2] = (this.anIntArray532[2] << 12) / local114;
			this.anIntArray532[0] = (this.anIntArray532[0] << 12) / local114;
			this.anIntArray532[1] = (this.anIntArray532[1] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(22) int local22 = Static317.anInt5421 * this.anInt8330 >> 12;
			@Pc(32) int[] local32 = this.method7769(Static68.anInt1579 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method7769(arg0, 0);
			@Pc(48) int[] local48 = this.method7769(arg0 + 1 & Static68.anInt1579, 0);
			for (@Pc(50) int local50 = 0; local50 < Static521.anInt8383; local50++) {
				@Pc(65) int local65 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(86) int local86 = (local38[Static296.anInt5049 & local50 - 1] - local38[local50 + 1 & Static296.anInt5049]) * local22 >> 12;
				@Pc(90) int local90 = local86 >> 4;
				@Pc(94) int local94 = local65 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				@Pc(134) int local134 = Class3_Sub6_Sub27.aByteArray75[local90 + (local94 * (local94 + 1) >> 1)] & 0xFF;
				@Pc(140) int local140 = local134 * 4096 >> 8;
				@Pc(146) int local146 = local65 * local134 >> 8;
				@Pc(152) int local152 = local134 * local86 >> 8;
				@Pc(161) int local161 = this.anIntArray532[2] * local140 >> 12;
				@Pc(170) int local170 = this.anIntArray532[1] * local146 >> 12;
				@Pc(179) int local179 = local152 * this.anIntArray532[0] >> 12;
				local11[local50] = local161 + local179 + local170;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8330 = arg0.method5198();
		} else if (arg1 == 1) {
			this.anInt8332 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt8327 = arg0.method5198();
		}
	}
}
