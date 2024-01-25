import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class6_Sub4_Sub19 extends Class6_Sub4 {

	@OriginalMember(owner = "client!im", name = "z", descriptor = "I")
	private int anInt4248 = 585;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(27) int local27 = Static501.anIntArray637[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static408.anInt7209; local29++) {
				@Pc(35) int local35 = Static398.anIntArray514[local29];
				@Pc(66) int local66;
				if (this.anInt4248 < local35 && 4096 - this.anInt4248 > local35 && local27 > 2048 - this.anInt4248 && this.anInt4248 + 2048 > local27) {
					local66 = 2048 - local35;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt4248;
					local19[local29] = 4096 - local66;
				} else if (2048 - this.anInt4248 < local35 && this.anInt4248 + 2048 > local35) {
					local66 = local27 - 2048;
					local66 = local66 < 0 ? -local66 : local66;
					local66 -= this.anInt4248;
					local66 <<= 0xC;
					local19[local29] = local66 / (2048 - this.anInt4248);
				} else if (this.anInt4248 > local27 || local27 > 4096 - this.anInt4248) {
					local66 = local35 - 2048;
					@Pc(169) int local169 = local66 >= 0 ? local66 : -local66;
					@Pc(174) int local174 = local169 - this.anInt4248;
					@Pc(178) int local178 = local174 << 12;
					local19[local29] = local178 / (2048 - this.anInt4248);
				} else if (this.anInt4248 <= local35 && local35 <= 4096 - this.anInt4248) {
					local19[local29] = 0;
				} else {
					local66 = 2048 - local27;
					local66 = local66 >= 0 ? local66 : -local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt4248;
					local19[local29] = 4096 - local66;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt4248 = arg1.method6003();
		}
	}
}
