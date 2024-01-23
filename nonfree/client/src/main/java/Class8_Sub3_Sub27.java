import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class8_Sub3_Sub27 extends Class8_Sub3 {

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
	private int anInt3647 = 3216;

	@OriginalMember(owner = "client!od", name = "S", descriptor = "I")
	private int anInt3649 = 3216;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "[I")
	private int[] anIntArray272 = new int[3];

	@OriginalMember(owner = "client!od", name = "W", descriptor = "I")
	private int anInt3651 = 4096;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	private void method2845() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3647 / 4096.0F));
		this.anIntArray272[0] = (int) (local11 * Math.sin((double) ((float) this.anInt3649 / 4096.0F)) * 4096.0D);
		this.anIntArray272[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt3649 / 4096.0F)));
		this.anIntArray272[2] = (int) (Math.sin((double) ((float) this.anInt3647 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray272[2] * this.anIntArray272[2] >> 12;
		@Pc(86) int local86 = this.anIntArray272[1] * this.anIntArray272[1] >> 12;
		@Pc(98) int local98 = this.anIntArray272[0] * this.anIntArray272[0] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local74 + local98 + local86 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray272[0] = (this.anIntArray272[0] << 12) / local112;
			this.anIntArray272[2] = (this.anIntArray272[2] << 12) / local112;
			this.anIntArray272[1] = (this.anIntArray272[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(22) int local22 = this.anInt3651 * Static37.anInt3862 >> 12;
			@Pc(32) int[] local32 = this.method4230(arg0 - 1 & Static51.anInt1120, 0);
			@Pc(38) int[] local38 = this.method4230(arg0, 0);
			@Pc(48) int[] local48 = this.method4230(Static51.anInt1120 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static239.anInt4789; local50++) {
				@Pc(70) int local70 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(91) int local91 = (local38[local50 - 1 & Static214.anInt4402] - local38[Static214.anInt4402 & local50 + 1]) * local22 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				@Pc(99) int local99 = local70 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				@Pc(141) int local141 = Class8_Sub3_Sub4.aByteArray4[local95 + (local99 * (local99 + 1) >> 1)] & 0xFF;
				@Pc(147) int local147 = local141 * local91 >> 8;
				@Pc(153) int local153 = local141 * 4096 >> 8;
				@Pc(159) int local159 = local141 * local70 >> 8;
				@Pc(168) int local168 = local153 * this.anIntArray272[2] >> 12;
				@Pc(177) int local177 = this.anIntArray272[0] * local147 >> 12;
				@Pc(186) int local186 = local159 * this.anIntArray272[1] >> 12;
				local11[local50] = local168 + local177 + local186;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		this.method2845();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3651 = arg1.method2375();
		} else if (arg0 == 1) {
			this.anInt3649 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anInt3647 = arg1.method2375();
		}
	}
}
