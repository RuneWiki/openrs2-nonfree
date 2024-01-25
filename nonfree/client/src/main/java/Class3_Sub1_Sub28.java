import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class3_Sub1_Sub28 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
	private int anInt8930 = 585;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(19) int local19 = Static121.anIntArray145[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static379.anInt5859; local21++) {
				@Pc(27) int local27 = Static497.anIntArray579[local21];
				@Pc(69) int local69;
				if (this.anInt8930 < local27 && 4096 - this.anInt8930 > local27 && 2048 - this.anInt8930 < local19 && local19 < this.anInt8930 + 2048) {
					local69 = 2048 - local27;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt8930;
					local11[local21] = 4096 - local69;
				} else if (local27 > 2048 - this.anInt8930 && local27 < this.anInt8930 + 2048) {
					local69 = local19 - 2048;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 -= this.anInt8930;
					local69 <<= 0xC;
					local11[local21] = local69 / (2048 - this.anInt8930);
				} else if (local19 < this.anInt8930 || local19 > 4096 - this.anInt8930) {
					local69 = local27 - 2048;
					@Pc(180) int local180 = local69 < 0 ? -local69 : local69;
					@Pc(185) int local185 = local180 - this.anInt8930;
					@Pc(189) int local189 = local185 << 12;
					local11[local21] = local189 / (2048 - this.anInt8930);
				} else if (local27 >= this.anInt8930 && 4096 - this.anInt8930 >= local27) {
					local11[local21] = 0;
				} else {
					local69 = 2048 - local19;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt8930;
					local11[local21] = 4096 - local69;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt8930 = arg1.method2028(-14795);
		}
	}
}
