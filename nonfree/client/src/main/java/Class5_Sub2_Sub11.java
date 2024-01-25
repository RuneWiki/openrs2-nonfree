import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class5_Sub2_Sub11 extends Class5_Sub2 {

	@OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
	private int anInt1759 = 4096;

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
	private int anInt1765 = 3216;

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "[I")
	private final int[] anIntArray83 = new int[3];

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
	private int anInt1766 = 3216;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(26) int local26 = this.anInt1759 * Static301.anInt5983 >> 12;
			@Pc(36) int[] local36 = this.method5808(0, arg0 - 1 & Static19.anInt547);
			@Pc(42) int[] local42 = this.method5808(0, arg0);
			@Pc(52) int[] local52 = this.method5808(0, Static19.anInt547 & arg0 + 1);
			for (@Pc(54) int local54 = 0; local54 < Static15.anInt493; local54++) {
				@Pc(69) int local69 = (local52[local54] - local36[local54]) * local26 >> 12;
				@Pc(90) int local90 = local26 * (local42[local54 - 1 & Static317.anInt6151] - local42[local54 + 1 & Static317.anInt6151]) >> 12;
				@Pc(94) int local94 = local90 >> 4;
				@Pc(98) int local98 = local69 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				@Pc(135) int local135 = Class25_Sub3_Sub2.aByteArray90[local94 + ((local98 + 1) * local98 >> 1)] & 0xFF;
				@Pc(141) int local141 = local135 * 4096 >> 8;
				@Pc(147) int local147 = local135 * local69 >> 8;
				@Pc(153) int local153 = local135 * local90 >> 8;
				@Pc(162) int local162 = this.anIntArray83[0] * local153 >> 12;
				@Pc(171) int local171 = local141 * this.anIntArray83[2] >> 12;
				@Pc(180) int local180 = local147 * this.anIntArray83[1] >> 12;
				local11[local54] = local180 + local162 + local171;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1759 = arg0.method1845();
		} else if (arg1 == 1) {
			this.anInt1766 = arg0.method1845();
		} else if (arg1 == 2) {
			this.anInt1765 = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)V")
	private void method1550() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt1765 / 4096.0F));
		this.anIntArray83[0] = (int) (local11 * Math.sin((double) ((float) this.anInt1766 / 4096.0F)) * 4096.0D);
		this.anIntArray83[1] = (int) (local11 * Math.cos((double) ((float) this.anInt1766 / 4096.0F)) * 4096.0D);
		this.anIntArray83[2] = (int) (Math.sin((double) ((float) this.anInt1765 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray83[0] * this.anIntArray83[0] >> 12;
		@Pc(87) int local87 = this.anIntArray83[1] * this.anIntArray83[1] >> 12;
		@Pc(99) int local99 = this.anIntArray83[2] * this.anIntArray83[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local75 + local87 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray83[1] = (this.anIntArray83[1] << 12) / local112;
			this.anIntArray83[2] = (this.anIntArray83[2] << 12) / local112;
			this.anIntArray83[0] = (this.anIntArray83[0] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		this.method1550();
	}
}
