import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class11_Sub2_Sub12 extends Class11_Sub2 {

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
	private int anInt2276 = 3216;

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "I")
	private int anInt2283 = 4096;

	@OriginalMember(owner = "client!hs", name = "O", descriptor = "I")
	private int anInt2284 = 3216;

	@OriginalMember(owner = "client!hs", name = "T", descriptor = "[I")
	private final int[] anIntArray161 = new int[3];

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(22) int local22 = Static57.anInt1090 * this.anInt2283 >> 12;
			@Pc(32) int[] local32 = this.method5710(0, Static75.anInt1419 & arg0 - 1);
			@Pc(38) int[] local38 = this.method5710(0, arg0);
			@Pc(48) int[] local48 = this.method5710(0, arg0 + 1 & Static75.anInt1419);
			for (@Pc(50) int local50 = 0; local50 < Static339.anInt6549; local50++) {
				@Pc(64) int local64 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(85) int local85 = local22 * (local38[Static323.anInt6272 & local50 - 1] - local38[Static323.anInt6272 & local50 + 1]) >> 12;
				@Pc(89) int local89 = local85 >> 4;
				if (local89 < 0) {
					local89 = -local89;
				}
				@Pc(101) int local101 = local64 >> 4;
				if (local101 < 0) {
					local101 = -local101;
				}
				if (local89 > 255) {
					local89 = 255;
				}
				if (local101 > 255) {
					local101 = 255;
				}
				@Pc(137) int local137 = Class78.aByteArray96[((local101 + 1) * local101 >> 1) + local89] & 0xFF;
				@Pc(143) int local143 = local137 * 4096 >> 8;
				@Pc(149) int local149 = local85 * local137 >> 8;
				@Pc(155) int local155 = local137 * local64 >> 8;
				@Pc(164) int local164 = this.anIntArray161[0] * local149 >> 12;
				@Pc(173) int local173 = local155 * this.anIntArray161[1] >> 12;
				@Pc(182) int local182 = local143 * this.anIntArray161[2] >> 12;
				local11[local50] = local182 + local164 + local173;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
	private void method1899() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2284 / 4096.0F));
		this.anIntArray161[0] = (int) (Math.sin((double) ((float) this.anInt2276 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray161[1] = (int) (Math.cos((double) ((float) this.anInt2276 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray161[2] = (int) (Math.sin((double) ((float) this.anInt2284 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray161[0] * this.anIntArray161[0] >> 12;
		@Pc(85) int local85 = this.anIntArray161[1] * this.anIntArray161[1] >> 12;
		@Pc(97) int local97 = this.anIntArray161[2] * this.anIntArray161[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local97 + local85 + local73 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray161[1] = (this.anIntArray161[1] << 12) / local110;
			this.anIntArray161[2] = (this.anIntArray161[2] << 12) / local110;
			this.anIntArray161[0] = (this.anIntArray161[0] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2283 = arg0.method5187();
		} else if (arg1 == 1) {
			this.anInt2276 = arg0.method5187();
		} else if (arg1 == 2) {
			this.anInt2284 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.method1899();
	}
}
