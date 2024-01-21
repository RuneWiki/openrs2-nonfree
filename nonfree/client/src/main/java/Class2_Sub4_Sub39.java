import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub4_Sub39 extends Class2_Sub4 {

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
	private int anInt4407 = 585;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4407 = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(21) int local21 = Static2.anIntArray5[arg0];
			for (@Pc(23) int local23 = 0; local23 < Static118.anInt2608; local23++) {
				@Pc(29) int local29 = Static141.anIntArray130[local23];
				@Pc(61) int local61;
				if (this.anInt4407 < local29 && 4096 - this.anInt4407 > local29 && 2048 - this.anInt4407 < local21 && this.anInt4407 + 2048 > local21) {
					local61 = 2048 - local29;
					local61 = local61 < 0 ? -local61 : local61;
					local61 <<= 0xC;
					local61 /= 2048 - this.anInt4407;
					local13[local23] = 4096 - local61;
				} else if (2048 - this.anInt4407 < local29 && this.anInt4407 + 2048 > local29) {
					local61 = local21 - 2048;
					local61 = local61 < 0 ? -local61 : local61;
					local61 -= this.anInt4407;
					local61 <<= 0xC;
					local13[local23] = local61 / (2048 - this.anInt4407);
				} else if (local21 < this.anInt4407 || local21 > 4096 - this.anInt4407) {
					local61 = local29 - 2048;
					@Pc(165) int local165 = local61 < 0 ? -local61 : local61;
					@Pc(170) int local170 = local165 - this.anInt4407;
					@Pc(174) int local174 = local170 << 12;
					local13[local23] = local174 / (2048 - this.anInt4407);
				} else if (this.anInt4407 <= local29 && local29 <= 4096 - this.anInt4407) {
					local13[local23] = 0;
				} else {
					local61 = 2048 - local21;
					local61 = local61 < 0 ? -local61 : local61;
					local61 <<= 0xC;
					local61 /= 2048 - this.anInt4407;
					local13[local23] = 4096 - local61;
				}
			}
		}
		return local13;
	}
}
