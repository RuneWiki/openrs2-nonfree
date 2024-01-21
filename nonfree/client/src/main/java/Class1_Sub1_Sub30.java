import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mh", name = "hb", descriptor = "I")
	private int anInt3056;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3056 = arg1.method1642();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(25) int local25 = Static18.anIntArray101[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static65.anInt1933; local27++) {
				@Pc(33) int local33 = Static106.anIntArray284[local27];
				@Pc(65) int local65;
				if (this.anInt3056 < local33 && local33 < 4096 - this.anInt3056 && 2048 - this.anInt3056 < local25 && local25 < this.anInt3056 + 2048) {
					local65 = 2048 - local33;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt3056;
					local11[local27] = 4096 - local65;
				} else if (local33 > 2048 - this.anInt3056 && this.anInt3056 + 2048 > local33) {
					local65 = local25 - 2048;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 -= this.anInt3056;
					local65 <<= 0xC;
					local11[local27] = local65 / (2048 - this.anInt3056);
				} else if (local25 < this.anInt3056 || 4096 - this.anInt3056 < local25) {
					local65 = local33 - 2048;
					@Pc(175) int local175 = local65 >= 0 ? local65 : -local65;
					@Pc(180) int local180 = local175 - this.anInt3056;
					@Pc(184) int local184 = local180 << 12;
					local11[local27] = local184 / (2048 - this.anInt3056);
				} else if (this.anInt3056 <= local33 && local33 <= 4096 - this.anInt3056) {
					local11[local27] = 0;
				} else {
					local65 = 2048 - local25;
					local65 = local65 < 0 ? -local65 : local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt3056;
					local11[local27] = 4096 - local65;
				}
			}
		}
		return local11;
	}
}
