import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class3_Sub4_Sub19 extends Class3_Sub4 {

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
	private int anInt3665 = 2048;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
	private int anInt3658 = 0;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
	private int anInt3662 = 10;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3662 = arg0.method4096();
		} else if (arg1 == 1) {
			this.anInt3665 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt3658 = arg0.method4096();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(27) int local27 = Static317.anIntArray337[arg0];
			@Pc(37) int local37;
			if (this.anInt3658 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt3662; local37++) {
					if (local27 >= this.anIntArray229[local37] && this.anIntArray229[local37 + 1] > local27) {
						if (this.anIntArray228[local37] > local27) {
							local35 = 4096;
						}
						break;
					}
				}
				Static466.method206(local11, 0, Static148.anInt2687, local35);
			} else {
				for (@Pc(85) int local85 = 0; local85 < Static148.anInt2687; local85++) {
					local37 = 0;
					@Pc(91) short local91 = 0;
					@Pc(95) int local95 = Static401.anIntArray419[local85];
					@Pc(98) int local98 = this.anInt3658;
					if (local98 == 1) {
						local37 = local95;
					} else if (local98 == 2) {
						local37 = (local95 + local27 - 4096 >> 1) + 2048;
					} else if (local98 == 3) {
						local37 = (local95 - local27 >> 1) + 2048;
					}
					for (local98 = 0; local98 < this.anInt3662; local98++) {
						if (local37 >= this.anIntArray229[local98] && this.anIntArray229[local98 + 1] > local37) {
							if (local37 < this.anIntArray228[local98]) {
								local91 = 4096;
							}
							break;
						}
					}
					local11[local85] = local91;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		this.method3156();
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
	private void method3156() {
		@Pc(7) int local7 = 0;
		this.anIntArray229 = new int[this.anInt3662 + 1];
		this.anIntArray228 = new int[this.anInt3662 + 1];
		@Pc(26) int local26 = 4096 / this.anInt3662;
		@Pc(33) int local33 = this.anInt3665 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3662; local35++) {
			this.anIntArray229[local35] = local7;
			this.anIntArray228[local35] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray229[this.anInt3662] = 4096;
		this.anIntArray228[this.anInt3662] = this.anIntArray228[0] + 4096;
	}
}
