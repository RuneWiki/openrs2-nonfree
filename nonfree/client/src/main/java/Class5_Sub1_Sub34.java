import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class5_Sub1_Sub34 extends Class5_Sub1 {

	@OriginalMember(owner = "client!uga", name = "D", descriptor = "I")
	private int anInt10054 = 585;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt10054 = arg1.method8519();
		}
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(26) int local26 = Static23.anIntArray27[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static648.anInt9588; local28++) {
				@Pc(34) int local34 = Static293.anIntArray288[local28];
				@Pc(80) int local80;
				if (this.anInt10054 < local34 && 4096 - this.anInt10054 > local34 && 2048 - this.anInt10054 < local26 && local26 < this.anInt10054 + 2048) {
					local80 = 2048 - local34;
					local80 = local80 < 0 ? -local80 : local80;
					local80 <<= 0xC;
					local80 /= 2048 - this.anInt10054;
					local11[local28] = 4096 - local80;
				} else if (local34 > 2048 - this.anInt10054 && this.anInt10054 + 2048 > local34) {
					local80 = local26 - 2048;
					local80 = local80 >= 0 ? local80 : -local80;
					local80 -= this.anInt10054;
					local80 <<= 0xC;
					local11[local28] = local80 / (2048 - this.anInt10054);
				} else if (local26 < this.anInt10054 || 4096 - this.anInt10054 < local26) {
					local80 = local34 - 2048;
					@Pc(202) int local202 = local80 >= 0 ? local80 : -local80;
					@Pc(207) int local207 = local202 - this.anInt10054;
					@Pc(211) int local211 = local207 << 12;
					local11[local28] = local211 / (2048 - this.anInt10054);
				} else if (local34 >= this.anInt10054 && local34 <= 4096 - this.anInt10054) {
					local11[local28] = 0;
				} else {
					local80 = 2048 - local26;
					local80 = local80 < 0 ? -local80 : local80;
					local80 <<= 0xC;
					local80 /= 2048 - this.anInt10054;
					local11[local28] = 4096 - local80;
				}
			}
		}
		return local11;
	}
}
