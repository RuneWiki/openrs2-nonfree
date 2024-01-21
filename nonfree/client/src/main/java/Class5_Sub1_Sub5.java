import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class5_Sub1_Sub5 extends Class5_Sub1 {

	@OriginalMember(owner = "client!d", name = "M", descriptor = "I")
	private int anInt693 = 585;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt693 = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(23) int local23 = Static147.anIntArray321[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static174.anInt3489; local25++) {
				@Pc(31) int local31 = Static117.anIntArray274[local25];
				@Pc(63) int local63;
				if (local31 > this.anInt693 && local31 < 4096 - this.anInt693 && local23 > 2048 - this.anInt693 && local23 < this.anInt693 + 2048) {
					local63 = 2048 - local31;
					local63 = local63 >= 0 ? local63 : -local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt693;
					local15[local25] = 4096 - local63;
				} else if (2048 - this.anInt693 < local31 && local31 < this.anInt693 + 2048) {
					local63 = local23 - 2048;
					local63 = local63 < 0 ? -local63 : local63;
					local63 -= this.anInt693;
					local63 <<= 0xC;
					local15[local25] = local63 / (2048 - this.anInt693);
				} else if (local23 < this.anInt693 || local23 > 4096 - this.anInt693) {
					local63 = local31 - 2048;
					@Pc(159) int local159 = local63 >= 0 ? local63 : -local63;
					@Pc(164) int local164 = local159 - this.anInt693;
					@Pc(168) int local168 = local164 << 12;
					local15[local25] = local168 / (2048 - this.anInt693);
				} else if (local31 >= this.anInt693 && local31 <= 4096 - this.anInt693) {
					local15[local25] = 0;
				} else {
					local63 = 2048 - local23;
					local63 = local63 < 0 ? -local63 : local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt693;
					local15[local25] = 4096 - local63;
				}
			}
		}
		return local15;
	}
}
