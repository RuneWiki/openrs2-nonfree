import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class5_Sub6_Sub6 extends Class5_Sub6 {

	@OriginalMember(owner = "client!df", name = "A", descriptor = "I")
	private int anInt1778 = 585;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1778 = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(25) int local25 = Static508.anIntArray471[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static421.anInt7443; local27++) {
				@Pc(33) int local33 = Static207.anIntArray185[local27];
				@Pc(68) int local68;
				if (this.anInt1778 < local33 && local33 < 4096 - this.anInt1778 && 2048 - this.anInt1778 < local25 && local25 < this.anInt1778 + 2048) {
					local68 = 2048 - local33;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt1778;
					local11[local27] = 4096 - local68;
				} else if (local33 > 2048 - this.anInt1778 && local33 < this.anInt1778 + 2048) {
					local68 = local25 - 2048;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 -= this.anInt1778;
					local68 <<= 0xC;
					local11[local27] = local68 / (2048 - this.anInt1778);
				} else if (local25 < this.anInt1778 || 4096 - this.anInt1778 < local25) {
					local68 = local33 - 2048;
					@Pc(173) int local173 = local68 >= 0 ? local68 : -local68;
					@Pc(178) int local178 = local173 - this.anInt1778;
					@Pc(182) int local182 = local178 << 12;
					local11[local27] = local182 / (2048 - this.anInt1778);
				} else if (this.anInt1778 <= local33 && local33 <= 4096 - this.anInt1778) {
					local11[local27] = 0;
				} else {
					local68 = 2048 - local25;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt1778;
					local11[local27] = 4096 - local68;
				}
			}
		}
		return local11;
	}
}
