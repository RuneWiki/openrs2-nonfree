import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class4_Sub6_Sub4 extends Class4_Sub6 {

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
	private int anInt1400 = 585;

	static {
		new Class83(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt1400 = arg1.method2536();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(19) int local19 = Static165.anIntArray209[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static80.anInt1616; local21++) {
				@Pc(27) int local27 = Static341.anIntArray504[local21];
				@Pc(68) int local68;
				if (local27 > this.anInt1400 && 4096 - this.anInt1400 > local27 && 2048 - this.anInt1400 < local19 && this.anInt1400 + 2048 > local19) {
					local68 = 2048 - local27;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt1400;
					local11[local21] = 4096 - local68;
				} else if (local27 > 2048 - this.anInt1400 && this.anInt1400 + 2048 > local27) {
					local68 = local19 - 2048;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 -= this.anInt1400;
					local68 <<= 0xC;
					local11[local21] = local68 / (2048 - this.anInt1400);
				} else if (local19 < this.anInt1400 || local19 > 4096 - this.anInt1400) {
					local68 = local27 - 2048;
					@Pc(179) int local179 = local68 < 0 ? -local68 : local68;
					@Pc(184) int local184 = local179 - this.anInt1400;
					@Pc(188) int local188 = local184 << 12;
					local11[local21] = local188 / (2048 - this.anInt1400);
				} else if (local27 >= this.anInt1400 && 4096 - this.anInt1400 >= local27) {
					local11[local21] = 0;
				} else {
					local68 = 2048 - local19;
					local68 = local68 < 0 ? -local68 : local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt1400;
					local11[local21] = 4096 - local68;
				}
			}
		}
		return local11;
	}
}
