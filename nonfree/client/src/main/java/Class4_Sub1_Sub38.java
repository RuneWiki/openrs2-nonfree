import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class4_Sub1_Sub38 extends Class4_Sub1 {

	@OriginalMember(owner = "client!wq", name = "F", descriptor = "I")
	private int anInt10183 = 585;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(27) int local27 = Static442.anIntArray449[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static376.anInt7260; local29++) {
				@Pc(35) int local35 = Static292.anIntArray394[local29];
				@Pc(64) int local64;
				if (local35 > this.anInt10183 && 4096 - this.anInt10183 > local35 && local27 > 2048 - this.anInt10183 && local27 < this.anInt10183 + 2048) {
					local64 = 2048 - local35;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt10183;
					local11[local29] = 4096 - local64;
				} else if (2048 - this.anInt10183 < local35 && this.anInt10183 + 2048 > local35) {
					local64 = local27 - 2048;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 -= this.anInt10183;
					local64 <<= 0xC;
					local11[local29] = local64 / (2048 - this.anInt10183);
				} else if (local27 < this.anInt10183 || local27 > 4096 - this.anInt10183) {
					local64 = local35 - 2048;
					@Pc(167) int local167 = local64 < 0 ? -local64 : local64;
					@Pc(172) int local172 = local167 - this.anInt10183;
					@Pc(176) int local176 = local172 << 12;
					local11[local29] = local176 / (2048 - this.anInt10183);
				} else if (local35 >= this.anInt10183 && local35 <= 4096 - this.anInt10183) {
					local11[local29] = 0;
				} else {
					local64 = 2048 - local27;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt10183;
					local11[local29] = 4096 - local64;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt10183 = arg1.method4936();
		}
	}
}
