import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class5_Sub6_Sub14 extends Class5_Sub6 {

	@OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
	private int anInt2847 = 4096;

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "[I")
	private final int[] anIntArray164 = new int[3];

	@OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
	private int anInt2845 = 3216;

	@OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
	private int anInt2848 = 3216;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
	private void method2555() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2848 / 4096.0F));
		this.anIntArray164[0] = (int) (Math.sin((double) ((float) this.anInt2845 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray164[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt2845 / 4096.0F)));
		this.anIntArray164[2] = (int) (Math.sin((double) ((float) this.anInt2848 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray164[0] * this.anIntArray164[0] >> 12;
		@Pc(87) int local87 = this.anIntArray164[1] * this.anIntArray164[1] >> 12;
		@Pc(99) int local99 = this.anIntArray164[2] * this.anIntArray164[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local75 + local87 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray164[2] = (this.anIntArray164[2] << 12) / local112;
			this.anIntArray164[0] = (this.anIntArray164[0] << 12) / local112;
			this.anIntArray164[1] = (this.anIntArray164[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		this.method2555();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(27) int local27 = this.anInt2847 * Static146.anInt2428 >> 12;
			@Pc(37) int[] local37 = this.method8117(arg0 - 1 & Static442.anInt7781, 0);
			@Pc(43) int[] local43 = this.method8117(arg0, 0);
			@Pc(53) int[] local53 = this.method8117(arg0 + 1 & Static442.anInt7781, 0);
			for (@Pc(55) int local55 = 0; local55 < Static421.anInt7443; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(90) int local90 = (local43[Static575.anInt9380 & local55 - 1] - local43[Static575.anInt9380 & local55 + 1]) * local27 >> 12;
				@Pc(94) int local94 = local90 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				@Pc(103) int local103 = local70 >> 4;
				if (local94 > 255) {
					local94 = 255;
				}
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(132) int local132 = Class289.aByteArray80[local94 + ((local103 + 1) * local103 >> 1)] & 0xFF;
				@Pc(138) int local138 = local132 * 4096 >> 8;
				@Pc(144) int local144 = local90 * local132 >> 8;
				@Pc(150) int local150 = local70 * local132 >> 8;
				@Pc(159) int local159 = local150 * this.anIntArray164[1] >> 12;
				@Pc(168) int local168 = this.anIntArray164[2] * local138 >> 12;
				@Pc(177) int local177 = this.anIntArray164[0] * local144 >> 12;
				local11[local55] = local168 + local177 + local159;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2847 = arg0.method3698();
		} else if (arg1 == 1) {
			this.anInt2845 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt2848 = arg0.method3698();
		}
	}
}
