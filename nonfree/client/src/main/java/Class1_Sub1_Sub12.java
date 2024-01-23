import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
	private int anInt2451 = 585;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(21) int local21 = Static98.anIntArray221[arg0];
			for (@Pc(23) int local23 = 0; local23 < Static75.anInt1848; local23++) {
				@Pc(30) int local30 = Static157.anIntArray331[local23];
				@Pc(67) int local67;
				if (local30 > this.anInt2451 && local30 < 4096 - this.anInt2451 && local21 > 2048 - this.anInt2451 && local21 < this.anInt2451 + 2048) {
					local67 = 2048 - local30;
					local67 = local67 < 0 ? -local67 : local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt2451;
					local12[local23] = 4096 - local67;
				} else if (local30 > 2048 - this.anInt2451 && local30 < this.anInt2451 + 2048) {
					local67 = local21 - 2048;
					local67 = local67 < 0 ? -local67 : local67;
					local67 -= this.anInt2451;
					local67 <<= 0xC;
					local12[local23] = local67 / (2048 - this.anInt2451);
				} else if (local21 < this.anInt2451 || local21 > 4096 - this.anInt2451) {
					local67 = local30 - 2048;
					@Pc(170) int local170 = local67 >= 0 ? local67 : -local67;
					@Pc(175) int local175 = local170 - this.anInt2451;
					@Pc(179) int local179 = local175 << 12;
					local12[local23] = local179 / (2048 - this.anInt2451);
				} else if (this.anInt2451 <= local30 && local30 <= 4096 - this.anInt2451) {
					local12[local23] = 0;
				} else {
					local67 = 2048 - local21;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt2451;
					local12[local23] = 4096 - local67;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2451 = arg0.method2652();
		}
	}
}
