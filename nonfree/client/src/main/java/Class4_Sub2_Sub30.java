import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class4_Sub2_Sub30 extends Class4_Sub2 {

	@OriginalMember(owner = "client!to", name = "E", descriptor = "I")
	private int anInt9030 = 585;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9030 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(19) int local19 = Static429.anIntArray465[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static269.anInt4330; local21++) {
				@Pc(27) int local27 = Static312.anIntArray370[local21];
				@Pc(64) int local64;
				if (this.anInt9030 < local27 && 4096 - this.anInt9030 > local27 && 2048 - this.anInt9030 < local19 && local19 < this.anInt9030 + 2048) {
					local64 = 2048 - local27;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt9030;
					local11[local21] = 4096 - local64;
				} else if (local27 > 2048 - this.anInt9030 && local27 < this.anInt9030 + 2048) {
					local64 = local19 - 2048;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 -= this.anInt9030;
					local64 <<= 0xC;
					local11[local21] = local64 / (2048 - this.anInt9030);
				} else if (local19 < this.anInt9030 || 4096 - this.anInt9030 < local19) {
					local64 = local27 - 2048;
					@Pc(176) int local176 = local64 >= 0 ? local64 : -local64;
					@Pc(181) int local181 = local176 - this.anInt9030;
					@Pc(185) int local185 = local181 << 12;
					local11[local21] = local185 / (2048 - this.anInt9030);
				} else if (local27 >= this.anInt9030 && 4096 - this.anInt9030 >= local27) {
					local11[local21] = 0;
				} else {
					local64 = 2048 - local19;
					local64 = local64 < 0 ? -local64 : local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt9030;
					local11[local21] = 4096 - local64;
				}
			}
		}
		return local11;
	}
}
