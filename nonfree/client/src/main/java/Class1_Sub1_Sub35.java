import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
	private int anInt6451 = 585;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6451 = arg1.method4485();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(25) int local25 = Static221.anIntArray194[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static434.anInt4326; local27++) {
				@Pc(33) int local33 = Static280.anIntArray238[local27];
				@Pc(72) int local72;
				if (local33 > this.anInt6451 && 4096 - this.anInt6451 > local33 && 2048 - this.anInt6451 < local25 && local25 < this.anInt6451 + 2048) {
					local72 = 2048 - local33;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt6451;
					local17[local27] = 4096 - local72;
				} else if (2048 - this.anInt6451 < local33 && this.anInt6451 + 2048 > local33) {
					local72 = local25 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt6451;
					local72 <<= 0xC;
					local17[local27] = local72 / (2048 - this.anInt6451);
				} else if (local25 < this.anInt6451 || local25 > 4096 - this.anInt6451) {
					local72 = local33 - 2048;
					@Pc(179) int local179 = local72 < 0 ? -local72 : local72;
					@Pc(184) int local184 = local179 - this.anInt6451;
					@Pc(188) int local188 = local184 << 12;
					local17[local27] = local188 / (2048 - this.anInt6451);
				} else if (local33 >= this.anInt6451 && local33 <= 4096 - this.anInt6451) {
					local17[local27] = 0;
				} else {
					local72 = 2048 - local25;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt6451;
					local17[local27] = 4096 - local72;
				}
			}
		}
		return local17;
	}
}
