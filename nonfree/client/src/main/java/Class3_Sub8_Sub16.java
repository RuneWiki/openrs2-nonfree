import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class3_Sub8_Sub16 extends Class3_Sub8 {

	@OriginalMember(owner = "client!la", name = "F", descriptor = "I")
	private int anInt5413 = 585;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(19) int local19 = Static510.anIntArray172[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static91.anInt1849; local21++) {
				@Pc(27) int local27 = Static13.anIntArray11[local21];
				@Pc(54) int local54;
				if (this.anInt5413 < local27 && 4096 - this.anInt5413 > local27 && 2048 - this.anInt5413 < local19 && this.anInt5413 + 2048 > local19) {
					local54 = 2048 - local27;
					local54 = local54 >= 0 ? local54 : -local54;
					local54 <<= 0xC;
					local54 /= 2048 - this.anInt5413;
					local11[local21] = 4096 - local54;
				} else if (2048 - this.anInt5413 < local27 && this.anInt5413 + 2048 > local27) {
					local54 = local19 - 2048;
					local54 = local54 < 0 ? -local54 : local54;
					local54 -= this.anInt5413;
					local54 <<= 0xC;
					local11[local21] = local54 / (2048 - this.anInt5413);
				} else if (this.anInt5413 > local19 || 4096 - this.anInt5413 < local19) {
					local54 = local27 - 2048;
					@Pc(153) int local153 = local54 < 0 ? -local54 : local54;
					@Pc(158) int local158 = local153 - this.anInt5413;
					@Pc(162) int local162 = local158 << 12;
					local11[local21] = local162 / (2048 - this.anInt5413);
				} else if (local27 >= this.anInt5413 && local27 <= 4096 - this.anInt5413) {
					local11[local21] = 0;
				} else {
					local54 = 2048 - local19;
					local54 = local54 >= 0 ? local54 : -local54;
					local54 <<= 0xC;
					local54 /= 2048 - this.anInt5413;
					local11[local21] = 4096 - local54;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt5413 = arg1.method7951();
		}
	}
}
