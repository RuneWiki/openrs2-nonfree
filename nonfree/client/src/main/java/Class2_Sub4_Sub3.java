import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class2_Sub4_Sub3 extends Class2_Sub4 {

	@OriginalMember(owner = "client!b", name = "O", descriptor = "I")
	private int anInt422 = 3216;

	@OriginalMember(owner = "client!b", name = "P", descriptor = "I")
	private int anInt423 = 3216;

	@OriginalMember(owner = "client!b", name = "T", descriptor = "[I")
	private final int[] anIntArray91 = new int[3];

	@OriginalMember(owner = "client!b", name = "V", descriptor = "I")
	private int anInt427 = 4096;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(28) int local28 = Static16.anInt386 * this.anInt427 >> 12;
			@Pc(38) int[] local38 = this.method5600(Static283.anInt4900 & arg0 - 1, 0);
			@Pc(44) int[] local44 = this.method5600(arg0, 0);
			@Pc(54) int[] local54 = this.method5600(arg0 + 1 & Static283.anInt4900, 0);
			for (@Pc(56) int local56 = 0; local56 < Static76.anInt1458; local56++) {
				@Pc(70) int local70 = local28 * (local54[local56] - local38[local56]) >> 12;
				@Pc(90) int local90 = (local44[Static269.anInt4657 & local56 - 1] - local44[Static269.anInt4657 & local56 + 1]) * local28 >> 12;
				@Pc(94) int local94 = local90 >> 4;
				@Pc(98) int local98 = local70 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				@Pc(139) int local139 = Class2_Sub10.aByteArray116[((local98 + 1) * local98 >> 1) + local94] & 0xFF;
				@Pc(145) int local145 = local139 * local70 >> 8;
				@Pc(151) int local151 = local90 * local139 >> 8;
				@Pc(157) int local157 = local139 * 4096 >> 8;
				@Pc(166) int local166 = this.anIntArray91[0] * local151 >> 12;
				@Pc(175) int local175 = this.anIntArray91[2] * local157 >> 12;
				@Pc(184) int local184 = this.anIntArray91[1] * local145 >> 12;
				local17[local56] = local175 + local184 + local166;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	private void method341() {
		@Pc(17) double local17 = Math.cos((double) ((float) this.anInt423 / 4096.0F));
		this.anIntArray91[0] = (int) (Math.sin((double) ((float) this.anInt422 / 4096.0F)) * local17 * 4096.0D);
		this.anIntArray91[1] = (int) (Math.cos((double) ((float) this.anInt422 / 4096.0F)) * 4096.0D * local17);
		this.anIntArray91[2] = (int) (Math.sin((double) ((float) this.anInt423 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray91[0] * this.anIntArray91[0] >> 12;
		@Pc(87) int local87 = this.anIntArray91[1] * this.anIntArray91[1] >> 12;
		@Pc(99) int local99 = this.anIntArray91[2] * this.anIntArray91[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local87 + local75 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray91[2] = (this.anIntArray91[2] << 12) / local112;
			this.anIntArray91[1] = (this.anIntArray91[1] << 12) / local112;
			this.anIntArray91[0] = (this.anIntArray91[0] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt427 = arg0.method5312();
		} else if (arg1 == 1) {
			this.anInt422 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt423 = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		this.method341();
	}
}
