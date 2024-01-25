import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class6_Sub2_Sub31 extends Class6_Sub2 {

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
	private int anInt5315 = 585;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(27) int local27 = Static168.anIntArray278[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static185.anInt4925; local29++) {
				@Pc(35) int local35 = Static53.anIntArray95[local29];
				@Pc(68) int local68;
				if (this.anInt5315 < local35 && 4096 - this.anInt5315 > local35 && 2048 - this.anInt5315 < local27 && this.anInt5315 + 2048 > local27) {
					local68 = 2048 - local35;
					local68 = local68 < 0 ? -local68 : local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt5315;
					local19[local29] = 4096 - local68;
				} else if (2048 - this.anInt5315 < local35 && local35 < this.anInt5315 + 2048) {
					local68 = local27 - 2048;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 -= this.anInt5315;
					local68 <<= 0xC;
					local19[local29] = local68 / (2048 - this.anInt5315);
				} else if (this.anInt5315 > local27 || 4096 - this.anInt5315 < local27) {
					local68 = local35 - 2048;
					@Pc(174) int local174 = local68 >= 0 ? local68 : -local68;
					@Pc(179) int local179 = local174 - this.anInt5315;
					@Pc(183) int local183 = local179 << 12;
					local19[local29] = local183 / (2048 - this.anInt5315);
				} else if (local35 >= this.anInt5315 && local35 <= 4096 - this.anInt5315) {
					local19[local29] = 0;
				} else {
					local68 = 2048 - local27;
					local68 = local68 < 0 ? -local68 : local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt5315;
					local19[local29] = 4096 - local68;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5315 = arg0.method3108();
		}
	}
}
