import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jja")
public final class Class2_Sub15_Sub16 extends Class2_Sub15 {

	@OriginalMember(owner = "client!jja", name = "G", descriptor = "I")
	private int anInt5286 = 4096;

	@OriginalMember(owner = "client!jja", name = "E", descriptor = "I")
	private int anInt5285 = 3216;

	@OriginalMember(owner = "client!jja", name = "K", descriptor = "I")
	private int anInt5290 = 3216;

	@OriginalMember(owner = "client!jja", name = "R", descriptor = "[I")
	private final int[] anIntArray270 = new int[3];

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		this.method4805();
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(28) int local28 = this.anInt5286 * Static549.anInt9613 >> 12;
			@Pc(38) int[] local38 = this.method9725(0, arg0 - 1 & Static426.anInt11132);
			@Pc(44) int[] local44 = this.method9725(0, arg0);
			@Pc(54) int[] local54 = this.method9725(0, arg0 + 1 & Static426.anInt11132);
			for (@Pc(56) int local56 = 0; local56 < Static329.anInt6017; local56++) {
				@Pc(71) int local71 = local28 * (local54[local56] - local38[local56]) >> 12;
				@Pc(92) int local92 = (local44[local56 - 1 & Static386.anInt7302] - local44[local56 + 1 & Static386.anInt7302]) * local28 >> 12;
				@Pc(96) int local96 = local92 >> 4;
				@Pc(100) int local100 = local71 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(134) int local134 = Class4_Sub22.aByteArray72[(local100 * (local100 + 1) >> 1) + local96] & 0xFF;
				@Pc(140) int local140 = local134 * 4096 >> 8;
				@Pc(146) int local146 = local134 * local92 >> 8;
				@Pc(152) int local152 = local71 * local134 >> 8;
				@Pc(161) int local161 = this.anIntArray270[2] * local140 >> 12;
				@Pc(170) int local170 = this.anIntArray270[0] * local146 >> 12;
				@Pc(179) int local179 = this.anIntArray270[1] * local152 >> 12;
				local11[local56] = local161 + local170 + local179;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5286 = arg1.method5211();
		} else if (arg0 == 1) {
			this.anInt5290 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt5285 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!jja", name = "g", descriptor = "(I)V")
	private void method4805() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5285 / 4096.0F));
		this.anIntArray270[0] = (int) (local11 * Math.sin((double) ((float) this.anInt5290 / 4096.0F)) * 4096.0D);
		this.anIntArray270[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt5290 / 4096.0F)));
		this.anIntArray270[2] = (int) (Math.sin((double) ((float) this.anInt5285 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray270[0] * this.anIntArray270[0] >> 12;
		@Pc(81) int local81 = this.anIntArray270[1] * this.anIntArray270[1] >> 12;
		@Pc(93) int local93 = this.anIntArray270[2] * this.anIntArray270[2] >> 12;
		@Pc(108) int local108 = (int) (Math.sqrt((double) (local69 + local81 + local93 >> 12)) * 4096.0D);
		if (local108 != 0) {
			this.anIntArray270[1] = (this.anIntArray270[1] << 12) / local108;
			this.anIntArray270[0] = (this.anIntArray270[0] << 12) / local108;
			this.anIntArray270[2] = (this.anIntArray270[2] << 12) / local108;
		}
	}
}
