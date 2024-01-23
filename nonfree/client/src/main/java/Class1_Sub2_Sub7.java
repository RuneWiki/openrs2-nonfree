import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
	private int anInt1052 = 585;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1052 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(34) int local34 = Static128.anIntArray362[arg0];
			for (@Pc(36) int local36 = 0; local36 < Static105.anInt2391; local36++) {
				@Pc(42) int local42 = Static63.anIntArray182[local36];
				@Pc(83) int local83;
				if (local42 > this.anInt1052 && 4096 - this.anInt1052 > local42 && local34 > 2048 - this.anInt1052 && local34 < this.anInt1052 + 2048) {
					local83 = 2048 - local42;
					local83 = local83 < 0 ? -local83 : local83;
					local83 <<= 0xC;
					local83 /= 2048 - this.anInt1052;
					local11[local36] = 4096 - local83;
				} else if (2048 - this.anInt1052 < local42 && this.anInt1052 + 2048 > local42) {
					local83 = local34 - 2048;
					local83 = local83 < 0 ? -local83 : local83;
					local83 -= this.anInt1052;
					local83 <<= 0xC;
					local11[local36] = local83 / (2048 - this.anInt1052);
				} else if (local34 < this.anInt1052 || 4096 - this.anInt1052 < local34) {
					local83 = local42 - 2048;
					@Pc(189) int local189 = local83 < 0 ? -local83 : local83;
					@Pc(194) int local194 = local189 - this.anInt1052;
					@Pc(198) int local198 = local194 << 12;
					local11[local36] = local198 / (2048 - this.anInt1052);
				} else if (this.anInt1052 <= local42 && local42 <= 4096 - this.anInt1052) {
					local11[local36] = 0;
				} else {
					local83 = 2048 - local34;
					local83 = local83 >= 0 ? local83 : -local83;
					local83 <<= 0xC;
					local83 /= 2048 - this.anInt1052;
					local11[local36] = 4096 - local83;
				}
			}
		}
		return local11;
	}
}
