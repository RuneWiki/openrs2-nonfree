import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class2_Sub1_Sub31 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
	private int anInt3346;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
	private int anInt3348;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
	private int anInt3350;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3350 = arg0.method1402();
		} else if (arg1 == 1) {
			this.anInt3346 = arg0.method1402();
		} else if (arg1 == 3) {
			this.anInt3348 = arg0.method1402();
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		Static51.method913();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(25) int local25 = Static11.anIntArray8[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static120.anInt2812; local33++) {
				@Pc(39) int local39 = Static69.anIntArray117[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(59) int local59;
				if (this.anInt3350 == 0) {
					local59 = this.anInt3348 * (local39 - local25);
				} else {
					@Pc(71) int local71 = local31 * local31 + local45 * local45 >> 12;
					local59 = (int) (Math.sqrt((double) (local71 / 4096)) * 4096.0D);
					local59 = (int) ((double) (local59 * this.anInt3348) * 3.141592653589793D);
				}
				local59 -= local59 & 0xFFFFF000;
				if (this.anInt3346 == 0) {
					local59 = Static174.anIntArray388[local59 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3346 == 2) {
					local59 -= 2048;
					if (local59 < 0) {
						local59 = -local59;
					}
					local59 = 2048 - local59 << 1;
				}
				local7[local33] = local59;
			}
		}
		return local7;
	}
}
