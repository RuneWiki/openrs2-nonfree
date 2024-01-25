import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class6_Sub3_Sub39 extends Class6_Sub3 {

	@OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
	private int anInt9596 = 585;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(27) int local27 = Static564.anIntArray703[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static447.anInt8568; local29++) {
				@Pc(35) int local35 = Static157.anIntArray321[local29];
				@Pc(72) int local72;
				if (this.anInt9596 < local35 && local35 < 4096 - this.anInt9596 && 2048 - this.anInt9596 < local27 && this.anInt9596 + 2048 > local27) {
					local72 = 2048 - local35;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt9596;
					local11[local29] = 4096 - local72;
				} else if (local35 > 2048 - this.anInt9596 && local35 < this.anInt9596 + 2048) {
					local72 = local27 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt9596;
					local72 <<= 0xC;
					local11[local29] = local72 / (2048 - this.anInt9596);
				} else if (this.anInt9596 > local27 || 4096 - this.anInt9596 < local27) {
					local72 = local35 - 2048;
					@Pc(182) int local182 = local72 < 0 ? -local72 : local72;
					@Pc(187) int local187 = local182 - this.anInt9596;
					@Pc(191) int local191 = local187 << 12;
					local11[local29] = local191 / (2048 - this.anInt9596);
				} else if (this.anInt9596 <= local35 && 4096 - this.anInt9596 >= local35) {
					local11[local29] = 0;
				} else {
					local72 = 2048 - local27;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt9596;
					local11[local29] = 4096 - local72;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt9596 = arg1.method6006();
		}
	}
}
