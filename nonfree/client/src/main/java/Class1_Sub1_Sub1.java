import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "X", descriptor = "I")
	private int anInt53 = 585;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt53 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(19) int local19 = Static193.anIntArray277[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static107.anInt2321; local21++) {
				@Pc(27) int local27 = Static204.anIntArray179[local21];
				@Pc(63) int local63;
				if (this.anInt53 < local27 && 4096 - this.anInt53 > local27 && local19 > 2048 - this.anInt53 && local19 < this.anInt53 + 2048) {
					local63 = 2048 - local27;
					local63 = local63 < 0 ? -local63 : local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt53;
					local11[local21] = 4096 - local63;
				} else if (local27 > 2048 - this.anInt53 && local27 < this.anInt53 + 2048) {
					local63 = local19 - 2048;
					local63 = local63 >= 0 ? local63 : -local63;
					local63 -= this.anInt53;
					local63 <<= 0xC;
					local11[local21] = local63 / (2048 - this.anInt53);
				} else if (this.anInt53 > local19 || local19 > 4096 - this.anInt53) {
					local63 = local27 - 2048;
					@Pc(167) int local167 = local63 >= 0 ? local63 : -local63;
					@Pc(172) int local172 = local167 - this.anInt53;
					@Pc(176) int local176 = local172 << 12;
					local11[local21] = local176 / (2048 - this.anInt53);
				} else if (local27 >= this.anInt53 && 4096 - this.anInt53 >= local27) {
					local11[local21] = 0;
				} else {
					local63 = 2048 - local19;
					local63 = local63 < 0 ? -local63 : local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt53;
					local11[local21] = 4096 - local63;
				}
			}
		}
		return local11;
	}
}
