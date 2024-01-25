import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class3_Sub1_Sub33 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
	private int anInt7422 = 585;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt7422 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(19) int local19 = Static402.anIntArray741[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static307.anInt4846; local21++) {
				@Pc(27) int local27 = Static241.anIntArray759[local21];
				@Pc(65) int local65;
				if (this.anInt7422 < local27 && 4096 - this.anInt7422 > local27 && 2048 - this.anInt7422 < local19 && this.anInt7422 + 2048 > local19) {
					local65 = 2048 - local27;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt7422;
					local11[local21] = 4096 - local65;
				} else if (local27 > 2048 - this.anInt7422 && local27 < this.anInt7422 + 2048) {
					local65 = local19 - 2048;
					local65 = local65 < 0 ? -local65 : local65;
					local65 -= this.anInt7422;
					local65 <<= 0xC;
					local11[local21] = local65 / (2048 - this.anInt7422);
				} else if (local19 < this.anInt7422 || local19 > 4096 - this.anInt7422) {
					local65 = local27 - 2048;
					@Pc(170) int local170 = local65 < 0 ? -local65 : local65;
					@Pc(175) int local175 = local170 - this.anInt7422;
					@Pc(179) int local179 = local175 << 12;
					local11[local21] = local179 / (2048 - this.anInt7422);
				} else if (this.anInt7422 <= local27 && local27 <= 4096 - this.anInt7422) {
					local11[local21] = 0;
				} else {
					local65 = 2048 - local19;
					local65 = local65 < 0 ? -local65 : local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt7422;
					local11[local21] = 4096 - local65;
				}
			}
		}
		return local11;
	}
}
