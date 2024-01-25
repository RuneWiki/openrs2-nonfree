import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class3_Sub1_Sub32 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
	private int anInt8907 = 585;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(27) int local27 = Static324.anIntArray440[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static131.anInt2935; local29++) {
				@Pc(35) int local35 = Static361.anIntArray460[local29];
				@Pc(72) int local72;
				if (local35 > this.anInt8907 && 4096 - this.anInt8907 > local35 && 2048 - this.anInt8907 < local27 && this.anInt8907 + 2048 > local27) {
					local72 = 2048 - local35;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt8907;
					local11[local29] = 4096 - local72;
				} else if (2048 - this.anInt8907 < local35 && this.anInt8907 + 2048 > local35) {
					local72 = local27 - 2048;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 -= this.anInt8907;
					local72 <<= 0xC;
					local11[local29] = local72 / (2048 - this.anInt8907);
				} else if (this.anInt8907 > local27 || 4096 - this.anInt8907 < local27) {
					local72 = local35 - 2048;
					@Pc(180) int local180 = local72 < 0 ? -local72 : local72;
					@Pc(185) int local185 = local180 - this.anInt8907;
					@Pc(189) int local189 = local185 << 12;
					local11[local29] = local189 / (2048 - this.anInt8907);
				} else if (this.anInt8907 <= local35 && 4096 - this.anInt8907 >= local35) {
					local11[local29] = 0;
				} else {
					local72 = 2048 - local27;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt8907;
					local11[local29] = 4096 - local72;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt8907 = arg1.method6535();
		}
	}
}
