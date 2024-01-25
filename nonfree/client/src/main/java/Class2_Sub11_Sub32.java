import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class2_Sub11_Sub32 extends Class2_Sub11 {

	@OriginalMember(owner = "client!vba", name = "G", descriptor = "I")
	private int anInt10367 = 585;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(21) int local21 = Static137.anIntArray170[arg0];
			for (@Pc(23) int local23 = 0; local23 < Static301.anInt10214; local23++) {
				@Pc(29) int local29 = Static523.anIntArray461[local23];
				@Pc(68) int local68;
				if (local29 > this.anInt10367 && local29 < 4096 - this.anInt10367 && local21 > 2048 - this.anInt10367 && local21 < this.anInt10367 + 2048) {
					local68 = 2048 - local29;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt10367;
					local13[local23] = 4096 - local68;
				} else if (2048 - this.anInt10367 < local29 && this.anInt10367 + 2048 > local29) {
					local68 = local21 - 2048;
					local68 = local68 < 0 ? -local68 : local68;
					local68 -= this.anInt10367;
					local68 <<= 0xC;
					local13[local23] = local68 / (2048 - this.anInt10367);
				} else if (local21 < this.anInt10367 || local21 > 4096 - this.anInt10367) {
					local68 = local29 - 2048;
					@Pc(188) int local188 = local68 < 0 ? -local68 : local68;
					@Pc(193) int local193 = local188 - this.anInt10367;
					@Pc(197) int local197 = local193 << 12;
					local13[local23] = local197 / (2048 - this.anInt10367);
				} else if (local29 >= this.anInt10367 && local29 <= 4096 - this.anInt10367) {
					local13[local23] = 0;
				} else {
					local68 = 2048 - local21;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt10367;
					local13[local23] = 4096 - local68;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt10367 = arg1.method8575();
		}
	}
}
