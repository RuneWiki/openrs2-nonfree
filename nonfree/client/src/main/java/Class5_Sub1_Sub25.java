import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class5_Sub1_Sub25 extends Class5_Sub1 {

	@OriginalMember(owner = "client!oba", name = "C", descriptor = "I")
	private int anInt6499 = 4096;

	@OriginalMember(owner = "client!oba", name = "E", descriptor = "[I")
	private final int[] anIntArray483 = new int[3];

	@OriginalMember(owner = "client!oba", name = "F", descriptor = "I")
	private int anInt6500 = 3216;

	@OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
	private int anInt6501 = 3216;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6499 = arg1.method4227();
		} else if (arg0 == 1) {
			this.anInt6501 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt6500 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		this.method5386();
	}

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "(I)V")
	private void method5386() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6500 / 4096.0F));
		this.anIntArray483[0] = (int) (Math.sin((double) ((float) this.anInt6501 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray483[1] = (int) (Math.cos((double) ((float) this.anInt6501 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray483[2] = (int) (Math.sin((double) ((float) this.anInt6500 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray483[0] * this.anIntArray483[0] >> 12;
		@Pc(81) int local81 = this.anIntArray483[1] * this.anIntArray483[1] >> 12;
		@Pc(93) int local93 = this.anIntArray483[2] * this.anIntArray483[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray483[1] = (this.anIntArray483[1] << 12) / local107;
			this.anIntArray483[0] = (this.anIntArray483[0] << 12) / local107;
			this.anIntArray483[2] = (this.anIntArray483[2] << 12) / local107;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(22) int local22 = this.anInt6499 * Static169.anInt3417 >> 12;
			@Pc(32) int[] local32 = this.method7160(0, arg0 - 1 & Static160.anInt3274);
			@Pc(38) int[] local38 = this.method7160(0, arg0);
			@Pc(48) int[] local48 = this.method7160(0, Static160.anInt3274 & arg0 + 1);
			for (@Pc(50) int local50 = 0; local50 < Static147.anInt3075; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(86) int local86 = (local38[local50 - 1 & Static497.anInt9138] - local38[local50 + 1 & Static497.anInt9138]) * local22 >> 12;
				@Pc(90) int local90 = local86 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				@Pc(99) int local99 = local65 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(134) int local134 = Class109.aByteArray47[local90 + (local99 * (local99 + 1) >> 1)] & 0xFF;
				@Pc(140) int local140 = local134 * local86 >> 8;
				@Pc(146) int local146 = local134 * local65 >> 8;
				@Pc(152) int local152 = local134 * 4096 >> 8;
				@Pc(161) int local161 = local146 * this.anIntArray483[1] >> 12;
				@Pc(170) int local170 = this.anIntArray483[2] * local152 >> 12;
				@Pc(179) int local179 = this.anIntArray483[0] * local140 >> 12;
				local11[local50] = local170 + local161 + local179;
			}
		}
		return local11;
	}
}
