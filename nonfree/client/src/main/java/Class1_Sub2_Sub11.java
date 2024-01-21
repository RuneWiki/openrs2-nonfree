import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!db", name = "db", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(23) int local23 = Static160.anIntArray399[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static22.anInt596; local25++) {
				@Pc(31) int local31 = Static167.anIntArray417[local25];
				@Pc(68) int local68;
				if (local31 > this.anInt1076 && 4096 - this.anInt1076 > local31 && 2048 - this.anInt1076 < local23 && local23 < this.anInt1076 + 2048) {
					local68 = 2048 - local31;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt1076;
					local15[local25] = 4096 - local68;
				} else if (local31 > 2048 - this.anInt1076 && this.anInt1076 + 2048 > local31) {
					local68 = local23 - 2048;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 -= this.anInt1076;
					local68 <<= 0xC;
					local15[local25] = local68 / (2048 - this.anInt1076);
				} else if (local23 < this.anInt1076 || 4096 - this.anInt1076 < local23) {
					local68 = local31 - 2048;
					@Pc(172) int local172 = local68 < 0 ? -local68 : local68;
					@Pc(177) int local177 = local172 - this.anInt1076;
					@Pc(181) int local181 = local177 << 12;
					local15[local25] = local181 / (2048 - this.anInt1076);
				} else if (this.anInt1076 <= local31 && 4096 - this.anInt1076 >= local31) {
					local15[local25] = 0;
				} else {
					local68 = 2048 - local23;
					local68 = local68 < 0 ? -local68 : local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt1076;
					local15[local25] = 4096 - local68;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt1076 = arg1.method1280();
		}
	}
}
