import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class10_Sub2_Sub30 extends Class10_Sub2 {

	@OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
	private int anInt6076 = 4096;

	@OriginalMember(owner = "client!rr", name = "K", descriptor = "I")
	private int anInt6078 = 3216;

	@OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
	private int anInt6077 = 3216;

	@OriginalMember(owner = "client!rr", name = "S", descriptor = "[I")
	private final int[] anIntArray580 = new int[3];

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(27) int local27 = this.anInt6076 * Static344.anInt5861 >> 12;
			@Pc(37) int[] local37 = this.method6041(arg0 - 1 & Static140.anInt2877, 0);
			@Pc(43) int[] local43 = this.method6041(arg0, 0);
			@Pc(53) int[] local53 = this.method6041(Static140.anInt2877 & arg0 + 1, 0);
			for (@Pc(55) int local55 = 0; local55 < Static121.anInt2458; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(91) int local91 = (local43[Static429.anInt7203 & local55 - 1] - local43[Static429.anInt7203 & local55 + 1]) * local27 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(107) int local107 = local70 >> 4;
				if (local95 > 255) {
					local95 = 255;
				}
				if (local107 < 0) {
					local107 = -local107;
				}
				if (local107 > 255) {
					local107 = 255;
				}
				@Pc(139) int local139 = Class61.aByteArray14[local95 + ((local107 + 1) * local107 >> 1)] & 0xFF;
				@Pc(145) int local145 = local139 * local91 >> 8;
				@Pc(151) int local151 = local139 * local70 >> 8;
				@Pc(157) int local157 = local139 * 4096 >> 8;
				@Pc(166) int local166 = this.anIntArray580[1] * local151 >> 12;
				@Pc(175) int local175 = this.anIntArray580[2] * local157 >> 12;
				@Pc(184) int local184 = this.anIntArray580[0] * local145 >> 12;
				local11[local55] = local166 + local184 + local175;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		this.method4803();
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)V")
	private void method4803() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6078 / 4096.0F));
		this.anIntArray580[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt6077 / 4096.0F)));
		this.anIntArray580[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt6077 / 4096.0F)));
		this.anIntArray580[2] = (int) (Math.sin((double) ((float) this.anInt6078 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray580[0] * this.anIntArray580[0] >> 12;
		@Pc(87) int local87 = this.anIntArray580[1] * this.anIntArray580[1] >> 12;
		@Pc(99) int local99 = this.anIntArray580[2] * this.anIntArray580[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local75 + local87 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray580[2] = (this.anIntArray580[2] << 12) / local112;
			this.anIntArray580[0] = (this.anIntArray580[0] << 12) / local112;
			this.anIntArray580[1] = (this.anIntArray580[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6076 = arg1.method2485();
		} else if (arg0 == 1) {
			this.anInt6077 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt6078 = arg1.method2485();
		}
	}
}
