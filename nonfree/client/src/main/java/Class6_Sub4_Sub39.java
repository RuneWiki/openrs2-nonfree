import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class6_Sub4_Sub39 extends Class6_Sub4 {

	@OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
	private int anInt9863 = 585;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt9863 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(27) int local27 = Static629.anIntArray635[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static6.anInt111; local29++) {
				@Pc(35) int local35 = Static284.anIntArray482[local29];
				@Pc(77) int local77;
				if (local35 > this.anInt9863 && 4096 - this.anInt9863 > local35 && 2048 - this.anInt9863 < local27 && local27 < this.anInt9863 + 2048) {
					local77 = 2048 - local35;
					local77 = local77 >= 0 ? local77 : -local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt9863;
					local19[local29] = 4096 - local77;
				} else if (2048 - this.anInt9863 < local35 && local35 < this.anInt9863 + 2048) {
					local77 = local27 - 2048;
					local77 = local77 >= 0 ? local77 : -local77;
					local77 -= this.anInt9863;
					local77 <<= 0xC;
					local19[local29] = local77 / (2048 - this.anInt9863);
				} else if (this.anInt9863 > local27 || local27 > 4096 - this.anInt9863) {
					local77 = local35 - 2048;
					@Pc(189) int local189 = local77 >= 0 ? local77 : -local77;
					@Pc(194) int local194 = local189 - this.anInt9863;
					@Pc(198) int local198 = local194 << 12;
					local19[local29] = local198 / (2048 - this.anInt9863);
				} else if (local35 >= this.anInt9863 && 4096 - this.anInt9863 >= local35) {
					local19[local29] = 0;
				} else {
					local77 = 2048 - local27;
					local77 = local77 >= 0 ? local77 : -local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt9863;
					local19[local29] = 4096 - local77;
				}
			}
		}
		return local19;
	}
}
