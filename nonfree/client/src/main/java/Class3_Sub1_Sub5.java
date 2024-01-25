import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	private int anInt722 = 4096;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "[I")
	private final int[] anIntArray69 = new int[3];

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	private int anInt726 = 3216;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
	private int anInt730 = 3216;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt722 = arg0.method2767();
		} else if (arg1 == 1) {
			this.anInt730 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt726 = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(27) int local27 = this.anInt722 * Static105.anInt2073 >> 12;
			@Pc(37) int[] local37 = this.method5547(arg0 - 1 & Static300.anInt5187, 0);
			@Pc(43) int[] local43 = this.method5547(arg0, 0);
			@Pc(53) int[] local53 = this.method5547(arg0 + 1 & Static300.anInt5187, 0);
			for (@Pc(55) int local55 = 0; local55 < Static238.anInt4221; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(91) int local91 = (local43[local55 - 1 & Static171.anInt3000] - local43[Static171.anInt3000 & local55 + 1]) * local27 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				@Pc(99) int local99 = local70 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(136) int local136 = Class150.aByteArray100[local95 + ((local99 + 1) * local99 >> 1)] & 0xFF;
				@Pc(142) int local142 = local136 * local91 >> 8;
				@Pc(148) int local148 = local136 * 4096 >> 8;
				@Pc(154) int local154 = local70 * local136 >> 8;
				@Pc(163) int local163 = local142 * this.anIntArray69[0] >> 12;
				@Pc(172) int local172 = local148 * this.anIntArray69[2] >> 12;
				@Pc(181) int local181 = this.anIntArray69[1] * local154 >> 12;
				local16[local55] = local172 + local181 + local163;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		this.method644();
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	private void method644() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt726 / 4096.0F));
		this.anIntArray69[0] = (int) (Math.sin((double) ((float) this.anInt730 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray69[1] = (int) (local11 * Math.cos((double) ((float) this.anInt730 / 4096.0F)) * 4096.0D);
		this.anIntArray69[2] = (int) (Math.sin((double) ((float) this.anInt726 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray69[0] * this.anIntArray69[0] >> 12;
		@Pc(89) int local89 = this.anIntArray69[1] * this.anIntArray69[1] >> 12;
		@Pc(101) int local101 = this.anIntArray69[2] * this.anIntArray69[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local77 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray69[1] = (this.anIntArray69[1] << 12) / local114;
			this.anIntArray69[2] = (this.anIntArray69[2] << 12) / local114;
			this.anIntArray69[0] = (this.anIntArray69[0] << 12) / local114;
		}
	}
}
