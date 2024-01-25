import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class2_Sub7_Sub25 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
	private int anInt5991 = 585;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(27) int local27 = Static313.anIntArray521[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static352.anInt6485; local29++) {
				@Pc(35) int local35 = Static427.anIntArray602[local29];
				@Pc(72) int local72;
				if (local35 > this.anInt5991 && local35 < 4096 - this.anInt5991 && 2048 - this.anInt5991 < local27 && local27 < this.anInt5991 + 2048) {
					local72 = 2048 - local35;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt5991;
					local19[local29] = 4096 - local72;
				} else if (local35 > 2048 - this.anInt5991 && local35 < this.anInt5991 + 2048) {
					local72 = local27 - 2048;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 -= this.anInt5991;
					local72 <<= 0xC;
					local19[local29] = local72 / (2048 - this.anInt5991);
				} else if (local27 < this.anInt5991 || 4096 - this.anInt5991 < local27) {
					local72 = local35 - 2048;
					@Pc(174) int local174 = local72 < 0 ? -local72 : local72;
					@Pc(179) int local179 = local174 - this.anInt5991;
					@Pc(183) int local183 = local179 << 12;
					local19[local29] = local183 / (2048 - this.anInt5991);
				} else if (local35 >= this.anInt5991 && 4096 - this.anInt5991 >= local35) {
					local19[local29] = 0;
				} else {
					local72 = 2048 - local27;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt5991;
					local19[local29] = 4096 - local72;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt5991 = arg1.method5229();
		}
	}
}
