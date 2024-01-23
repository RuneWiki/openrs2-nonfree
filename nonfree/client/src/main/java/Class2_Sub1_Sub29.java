import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class2_Sub1_Sub29 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
	private int anInt3782 = 585;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3782 = arg0.method163();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(25) int local25 = Static97.anIntArray240[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static62.anInt1675; local27++) {
				@Pc(33) int local33 = Static20.anIntArray45[local27];
				@Pc(69) int local69;
				if (local33 > this.anInt3782 && 4096 - this.anInt3782 > local33 && local25 > 2048 - this.anInt3782 && local25 < this.anInt3782 + 2048) {
					local69 = 2048 - local33;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt3782;
					local11[local27] = 4096 - local69;
				} else if (2048 - this.anInt3782 < local33 && this.anInt3782 + 2048 > local33) {
					local69 = local25 - 2048;
					local69 = local69 < 0 ? -local69 : local69;
					local69 -= this.anInt3782;
					local69 <<= 0xC;
					local11[local27] = local69 / (2048 - this.anInt3782);
				} else if (local25 < this.anInt3782 || local25 > 4096 - this.anInt3782) {
					local69 = local33 - 2048;
					@Pc(180) int local180 = local69 < 0 ? -local69 : local69;
					@Pc(185) int local185 = local180 - this.anInt3782;
					@Pc(189) int local189 = local185 << 12;
					local11[local27] = local189 / (2048 - this.anInt3782);
				} else if (this.anInt3782 <= local33 && local33 <= 4096 - this.anInt3782) {
					local11[local27] = 0;
				} else {
					local69 = 2048 - local25;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt3782;
					local11[local27] = 4096 - local69;
				}
			}
		}
		return local11;
	}
}
