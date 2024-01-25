import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class3_Sub2_Sub32 extends Class3_Sub2 {

	@OriginalMember(owner = "client!si", name = "z", descriptor = "I")
	private int anInt8882 = 3216;

	@OriginalMember(owner = "client!si", name = "D", descriptor = "[I")
	private final int[] anIntArray580 = new int[3];

	@OriginalMember(owner = "client!si", name = "J", descriptor = "I")
	private int anInt8891 = 3216;

	@OriginalMember(owner = "client!si", name = "I", descriptor = "I")
	private int anInt8890 = 4096;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8890 = arg0.method4858();
		} else if (arg1 == 1) {
			this.anInt8882 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt8891 = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		this.method7551();
	}

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V")
	private void method7551() {
		@Pc(19) double local19 = Math.cos((double) ((float) this.anInt8891 / 4096.0F));
		this.anIntArray580[0] = (int) (local19 * Math.sin((double) ((float) this.anInt8882 / 4096.0F)) * 4096.0D);
		this.anIntArray580[1] = (int) (Math.cos((double) ((float) this.anInt8882 / 4096.0F)) * 4096.0D * local19);
		this.anIntArray580[2] = (int) (Math.sin((double) ((float) this.anInt8891 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray580[0] * this.anIntArray580[0] >> 12;
		@Pc(89) int local89 = this.anIntArray580[1] * this.anIntArray580[1] >> 12;
		@Pc(101) int local101 = this.anIntArray580[2] * this.anIntArray580[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local77 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray580[1] = (this.anIntArray580[1] << 12) / local114;
			this.anIntArray580[0] = (this.anIntArray580[0] << 12) / local114;
			this.anIntArray580[2] = (this.anIntArray580[2] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(30) int local30 = Static396.anInt6822 * this.anInt8890 >> 12;
			@Pc(40) int[] local40 = this.method8716(0, arg0 - 1 & Static622.anInt9680);
			@Pc(46) int[] local46 = this.method8716(0, arg0);
			@Pc(56) int[] local56 = this.method8716(0, arg0 + 1 & Static622.anInt9680);
			for (@Pc(58) int local58 = 0; local58 < Static30.anInt908; local58++) {
				@Pc(73) int local73 = local30 * (local56[local58] - local40[local58]) >> 12;
				@Pc(94) int local94 = local30 * (local46[Static241.anInt4556 & local58 - 1] - local46[Static241.anInt4556 & local58 + 1]) >> 12;
				@Pc(98) int local98 = local94 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				@Pc(107) int local107 = local73 >> 4;
				if (local107 < 0) {
					local107 = -local107;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				if (local107 > 255) {
					local107 = 255;
				}
				@Pc(141) int local141 = Class258.aByteArray69[local98 + ((local107 + 1) * local107 >> 1)] & 0xFF;
				@Pc(147) int local147 = local94 * local141 >> 8;
				@Pc(153) int local153 = local141 * 4096 >> 8;
				@Pc(159) int local159 = local73 * local141 >> 8;
				@Pc(168) int local168 = this.anIntArray580[2] * local153 >> 12;
				@Pc(177) int local177 = local159 * this.anIntArray580[1] >> 12;
				@Pc(186) int local186 = local147 * this.anIntArray580[0] >> 12;
				local19[local58] = local186 + local177 + local168;
			}
		}
		return local19;
	}
}
