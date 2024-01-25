import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class5_Sub6_Sub34 extends Class5_Sub6 {

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
	private int anInt8603 = 204;

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
	private int anInt8605 = 1;

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
	private int anInt8604 = 1;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			for (@Pc(25) int local25 = 0; local25 < Static421.anInt7443; local25++) {
				@Pc(31) int local31 = Static207.anIntArray185[local25];
				@Pc(35) int local35 = Static508.anIntArray471[arg0];
				@Pc(42) int local42 = local31 * this.anInt8604 >> 12;
				@Pc(49) int local49 = this.anInt8605 * local35 >> 12;
				@Pc(59) int local59 = local31 % (4096 / this.anInt8604) * this.anInt8604;
				@Pc(69) int local69 = local35 % (4096 / this.anInt8605) * this.anInt8605;
				if (local69 < this.anInt8603) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (this.anInt8603 > local59) {
						local19[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt8603) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local19[local25] = 0;
						continue;
					}
				}
				local19[local25] = 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8604 = arg0.method3642();
		} else if (arg1 == 1) {
			this.anInt8605 = arg0.method3642();
		} else if (arg1 == 2) {
			this.anInt8603 = arg0.method3698();
		}
	}
}
