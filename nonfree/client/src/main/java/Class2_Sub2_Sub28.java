import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class2_Sub2_Sub28 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
	private int anInt6030 = 3216;

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
	private int anInt6032 = 4096;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
	private int anInt6033 = 3216;

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "[I")
	private final int[] anIntArray516 = new int[3];

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6032 = arg0.method5500();
		} else if (arg1 == 1) {
			this.anInt6030 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt6033 = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(22) int local22 = this.anInt6032 * Static238.anInt4577 >> 12;
			@Pc(32) int[] local32 = this.method5839(arg0 - 1 & Static246.anInt4669, 0);
			@Pc(38) int[] local38 = this.method5839(arg0, 0);
			@Pc(48) int[] local48 = this.method5839(Static246.anInt4669 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static429.anInt6518; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(86) int local86 = local22 * (local38[Static303.anInt5406 & local50 - 1] - local38[Static303.anInt5406 & local50 + 1]) >> 12;
				@Pc(90) int local90 = local86 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				@Pc(102) int local102 = local65 >> 4;
				if (local90 > 255) {
					local90 = 255;
				}
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(138) int local138 = Class6.aByteArray7[(local102 * (local102 + 1) >> 1) + local90] & 0xFF;
				@Pc(144) int local144 = local86 * local138 >> 8;
				@Pc(150) int local150 = local138 * 4096 >> 8;
				@Pc(156) int local156 = local65 * local138 >> 8;
				@Pc(165) int local165 = local150 * this.anIntArray516[2] >> 12;
				@Pc(174) int local174 = this.anIntArray516[1] * local156 >> 12;
				@Pc(183) int local183 = this.anIntArray516[0] * local144 >> 12;
				local11[local50] = local165 + local183 + local174;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		this.method4857();
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
	private void method4857() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6033 / 4096.0F));
		this.anIntArray516[0] = (int) (Math.sin((double) ((float) this.anInt6030 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray516[1] = (int) (local11 * Math.cos((double) ((float) this.anInt6030 / 4096.0F)) * 4096.0D);
		this.anIntArray516[2] = (int) (Math.sin((double) ((float) this.anInt6033 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray516[0] * this.anIntArray516[0] >> 12;
		@Pc(81) int local81 = this.anIntArray516[1] * this.anIntArray516[1] >> 12;
		@Pc(93) int local93 = this.anIntArray516[2] * this.anIntArray516[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray516[1] = (this.anIntArray516[1] << 12) / local112;
			this.anIntArray516[2] = (this.anIntArray516[2] << 12) / local112;
			this.anIntArray516[0] = (this.anIntArray516[0] << 12) / local112;
		}
	}
}
