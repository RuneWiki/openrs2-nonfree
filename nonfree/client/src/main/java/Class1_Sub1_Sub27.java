import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!q", name = "T", descriptor = "I")
	private int anInt3334 = 585;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(19) int local19 = Static187.anIntArray362[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static115.anInt2578; local21++) {
				@Pc(27) int local27 = Static45.anIntArray97[local21];
				@Pc(54) int local54;
				if (local27 > this.anInt3334 && local27 < 4096 - this.anInt3334 && local19 > 2048 - this.anInt3334 && local19 < this.anInt3334 + 2048) {
					local54 = 2048 - local27;
					local54 = local54 < 0 ? -local54 : local54;
					local54 <<= 0xC;
					local54 /= 2048 - this.anInt3334;
					local11[local21] = 4096 - local54;
				} else if (2048 - this.anInt3334 < local27 && local27 < this.anInt3334 + 2048) {
					local54 = local19 - 2048;
					local54 = local54 < 0 ? -local54 : local54;
					local54 -= this.anInt3334;
					local54 <<= 0xC;
					local11[local21] = local54 / (2048 - this.anInt3334);
				} else if (this.anInt3334 > local19 || local19 > 4096 - this.anInt3334) {
					local54 = local27 - 2048;
					@Pc(166) int local166 = local54 < 0 ? -local54 : local54;
					@Pc(171) int local171 = local166 - this.anInt3334;
					@Pc(175) int local175 = local171 << 12;
					local11[local21] = local175 / (2048 - this.anInt3334);
				} else if (local27 >= this.anInt3334 && 4096 - this.anInt3334 >= local27) {
					local11[local21] = 0;
				} else {
					local54 = 2048 - local19;
					local54 = local54 < 0 ? -local54 : local54;
					local54 <<= 0xC;
					local54 /= 2048 - this.anInt3334;
					local11[local21] = 4096 - local54;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3334 = arg0.method2765();
		}
	}
}
