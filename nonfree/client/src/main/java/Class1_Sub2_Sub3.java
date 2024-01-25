import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!aq", name = "O", descriptor = "[I")
	private final int[] anIntArray28 = new int[3];

	@OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
	private int anInt281 = 4096;

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
	private int anInt277 = 3216;

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "I")
	private int anInt275 = 3216;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(27) int local27 = Static362.anInt5842 * this.anInt281 >> 12;
			@Pc(37) int[] local37 = this.method5510(arg0 - 1 & Static13.anInt189, 0);
			@Pc(45) int[] local45 = this.method5510(arg0, 0);
			@Pc(55) int[] local55 = this.method5510(arg0 + 1 & Static13.anInt189, 0);
			for (@Pc(57) int local57 = 0; local57 < Static158.anInt2658; local57++) {
				@Pc(72) int local72 = (local55[local57] - local37[local57]) * local27 >> 12;
				@Pc(92) int local92 = local27 * (local45[Static271.anInt4721 & local57 - 1] - local45[local57 + 1 & Static271.anInt4721]) >> 12;
				@Pc(96) int local96 = local92 >> 4;
				@Pc(100) int local100 = local72 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(134) int local134 = Class170.aByteArray70[local96 + ((local100 + 1) * local100 >> 1)] & 0xFF;
				@Pc(140) int local140 = local134 * 4096 >> 8;
				@Pc(146) int local146 = local134 * local92 >> 8;
				@Pc(152) int local152 = local72 * local134 >> 8;
				@Pc(161) int local161 = local152 * this.anIntArray28[1] >> 12;
				@Pc(170) int local170 = local140 * this.anIntArray28[2] >> 12;
				@Pc(179) int local179 = this.anIntArray28[0] * local146 >> 12;
				local16[local57] = local170 + local179 + local161;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt281 = arg1.method5177();
		} else if (arg0 == 1) {
			this.anInt277 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt275 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "(I)V")
	private void method184() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt275 / 4096.0F));
		this.anIntArray28[0] = (int) (Math.sin((double) ((float) this.anInt277 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray28[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt277 / 4096.0F)));
		this.anIntArray28[2] = (int) (Math.sin((double) ((float) this.anInt275 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray28[0] * this.anIntArray28[0] >> 12;
		@Pc(81) int local81 = this.anIntArray28[1] * this.anIntArray28[1] >> 12;
		@Pc(93) int local93 = this.anIntArray28[2] * this.anIntArray28[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local81 + local69 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray28[2] = (this.anIntArray28[2] << 12) / local106;
			this.anIntArray28[1] = (this.anIntArray28[1] << 12) / local106;
			this.anIntArray28[0] = (this.anIntArray28[0] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		this.method184();
	}
}
