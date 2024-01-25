import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class14_Sub1_Sub32 extends Class14_Sub1 {

	@OriginalMember(owner = "client!rda", name = "G", descriptor = "I")
	private int anInt8897 = 585;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8897 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(27) int local27 = Static336.anIntArray458[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static371.anInt6835; local29++) {
				@Pc(35) int local35 = Static160.anIntArray258[local29];
				@Pc(67) int local67;
				if (this.anInt8897 < local35 && 4096 - this.anInt8897 > local35 && 2048 - this.anInt8897 < local27 && local27 < this.anInt8897 + 2048) {
					local67 = 2048 - local35;
					local67 = local67 < 0 ? -local67 : local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt8897;
					local11[local29] = 4096 - local67;
				} else if (local35 > 2048 - this.anInt8897 && this.anInt8897 + 2048 > local35) {
					local67 = local27 - 2048;
					local67 = local67 < 0 ? -local67 : local67;
					local67 -= this.anInt8897;
					local67 <<= 0xC;
					local11[local29] = local67 / (2048 - this.anInt8897);
				} else if (local27 < this.anInt8897 || local27 > 4096 - this.anInt8897) {
					local67 = local35 - 2048;
					@Pc(178) int local178 = local67 >= 0 ? local67 : -local67;
					@Pc(183) int local183 = local178 - this.anInt8897;
					@Pc(187) int local187 = local183 << 12;
					local11[local29] = local187 / (2048 - this.anInt8897);
				} else if (this.anInt8897 <= local35 && 4096 - this.anInt8897 >= local35) {
					local11[local29] = 0;
				} else {
					local67 = 2048 - local27;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt8897;
					local11[local29] = 4096 - local67;
				}
			}
		}
		return local11;
	}
}
