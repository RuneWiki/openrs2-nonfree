import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class2_Sub2_Sub29 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
	private int anInt8020 = 585;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(27) int local27 = Static211.anIntArray576[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static153.anInt3070; local29++) {
				@Pc(35) int local35 = Static260.anIntArray327[local29];
				@Pc(67) int local67;
				if (local35 > this.anInt8020 && local35 < 4096 - this.anInt8020 && 2048 - this.anInt8020 < local27 && this.anInt8020 + 2048 > local27) {
					local67 = 2048 - local35;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt8020;
					local11[local29] = 4096 - local67;
				} else if (local35 > 2048 - this.anInt8020 && local35 < this.anInt8020 + 2048) {
					local67 = local27 - 2048;
					local67 = local67 < 0 ? -local67 : local67;
					local67 -= this.anInt8020;
					local67 <<= 0xC;
					local11[local29] = local67 / (2048 - this.anInt8020);
				} else if (local27 < this.anInt8020 || local27 > 4096 - this.anInt8020) {
					local67 = local35 - 2048;
					@Pc(163) int local163 = local67 >= 0 ? local67 : -local67;
					@Pc(168) int local168 = local163 - this.anInt8020;
					@Pc(172) int local172 = local168 << 12;
					local11[local29] = local172 / (2048 - this.anInt8020);
				} else if (local35 >= this.anInt8020 && local35 <= 4096 - this.anInt8020) {
					local11[local29] = 0;
				} else {
					local67 = 2048 - local27;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt8020;
					local11[local29] = 4096 - local67;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8020 = arg0.method4294();
		}
	}
}
