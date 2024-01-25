import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
	private int anInt1060 = 3216;

	@OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
	private int anInt1062 = 4096;

	@OriginalMember(owner = "client!cfa", name = "O", descriptor = "I")
	private int anInt1066 = 3216;

	@OriginalMember(owner = "client!cfa", name = "P", descriptor = "[I")
	private final int[] anIntArray90 = new int[3];

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)V")
	private void method1103() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt1060 / 4096.0F));
		this.anIntArray90[0] = (int) (Math.sin((double) ((float) this.anInt1066 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray90[1] = (int) (Math.cos((double) ((float) this.anInt1066 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray90[2] = (int) (Math.sin((double) ((float) this.anInt1060 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray90[0] * this.anIntArray90[0] >> 12;
		@Pc(85) int local85 = this.anIntArray90[1] * this.anIntArray90[1] >> 12;
		@Pc(97) int local97 = this.anIntArray90[2] * this.anIntArray90[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local97 + local73 + local85 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray90[2] = (this.anIntArray90[2] << 12) / local110;
			this.anIntArray90[1] = (this.anIntArray90[1] << 12) / local110;
			this.anIntArray90[0] = (this.anIntArray90[0] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(27) int local27 = this.anInt1062 * Static574.anInt9473 >> 12;
			@Pc(37) int[] local37 = this.method8821(Static271.anInt4487 & arg0 - 1, 0);
			@Pc(43) int[] local43 = this.method8821(arg0, 0);
			@Pc(53) int[] local53 = this.method8821(arg0 + 1 & Static271.anInt4487, 0);
			for (@Pc(55) int local55 = 0; local55 < Static314.anInt6320; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(91) int local91 = local27 * (local43[local55 - 1 & Static550.anInt6610] - local43[Static550.anInt6610 & local55 + 1]) >> 12;
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
				@Pc(139) int local139 = Class5_Sub2_Sub1.aByteArray14[local95 + ((local99 + 1) * local99 >> 1)] & 0xFF;
				@Pc(145) int local145 = local91 * local139 >> 8;
				@Pc(151) int local151 = local139 * local70 >> 8;
				@Pc(157) int local157 = local139 * 4096 >> 8;
				@Pc(166) int local166 = local151 * this.anIntArray90[1] >> 12;
				@Pc(175) int local175 = this.anIntArray90[0] * local145 >> 12;
				@Pc(184) int local184 = local157 * this.anIntArray90[2] >> 12;
				local16[local55] = local184 + local175 + local166;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1062 = arg0.method8631();
		} else if (arg1 == 1) {
			this.anInt1066 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt1060 = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		this.method1103();
	}
}
