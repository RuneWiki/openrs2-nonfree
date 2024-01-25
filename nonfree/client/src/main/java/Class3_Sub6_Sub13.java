import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class3_Sub6_Sub13 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	private int anInt4487 = 585;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4487 = arg0.method6811();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(27) int local27 = Static231.anIntArray217[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static481.anInt8358; local29++) {
				@Pc(35) int local35 = Static595.anIntArray600[local29];
				@Pc(65) int local65;
				if (this.anInt4487 < local35 && 4096 - this.anInt4487 > local35 && 2048 - this.anInt4487 < local27 && local27 < this.anInt4487 + 2048) {
					local65 = 2048 - local35;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt4487;
					local19[local29] = 4096 - local65;
				} else if (2048 - this.anInt4487 < local35 && this.anInt4487 + 2048 > local35) {
					local65 = local27 - 2048;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 -= this.anInt4487;
					local65 <<= 0xC;
					local19[local29] = local65 / (2048 - this.anInt4487);
				} else if (local27 < this.anInt4487 || 4096 - this.anInt4487 < local27) {
					local65 = local35 - 2048;
					@Pc(167) int local167 = local65 >= 0 ? local65 : -local65;
					@Pc(172) int local172 = local167 - this.anInt4487;
					@Pc(176) int local176 = local172 << 12;
					local19[local29] = local176 / (2048 - this.anInt4487);
				} else if (local35 >= this.anInt4487 && local35 <= 4096 - this.anInt4487) {
					local19[local29] = 0;
				} else {
					local65 = 2048 - local27;
					local65 = local65 < 0 ? -local65 : local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt4487;
					local19[local29] = 4096 - local65;
				}
			}
		}
		return local19;
	}
}
