import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub2_Sub35 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
	private int anInt6589 = 585;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(25) int local25 = Static285.anIntArray17[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static410.anInt7198; local27++) {
				@Pc(33) int local33 = Static400.anIntArray525[local27];
				@Pc(69) int local69;
				if (local33 > this.anInt6589 && 4096 - this.anInt6589 > local33 && 2048 - this.anInt6589 < local25 && this.anInt6589 + 2048 > local25) {
					local69 = 2048 - local33;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt6589;
					local11[local27] = 4096 - local69;
				} else if (local33 > 2048 - this.anInt6589 && local33 < this.anInt6589 + 2048) {
					local69 = local25 - 2048;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 -= this.anInt6589;
					local69 <<= 0xC;
					local11[local27] = local69 / (2048 - this.anInt6589);
				} else if (this.anInt6589 > local25 || local25 > 4096 - this.anInt6589) {
					local69 = local33 - 2048;
					@Pc(179) int local179 = local69 < 0 ? -local69 : local69;
					@Pc(184) int local184 = local179 - this.anInt6589;
					@Pc(188) int local188 = local184 << 12;
					local11[local27] = local188 / (2048 - this.anInt6589);
				} else if (local33 >= this.anInt6589 && 4096 - this.anInt6589 >= local33) {
					local11[local27] = 0;
				} else {
					local69 = 2048 - local25;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt6589;
					local11[local27] = 4096 - local69;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6589 = arg0.method4498();
		}
	}
}
