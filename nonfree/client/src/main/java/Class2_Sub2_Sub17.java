import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!k", name = "I", descriptor = "I")
	private int anInt4866 = 1;

	@OriginalMember(owner = "client!k", name = "H", descriptor = "I")
	private int anInt4865 = 204;

	@OriginalMember(owner = "client!k", name = "O", descriptor = "I")
	private int anInt4871 = 1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			for (@Pc(25) int local25 = 0; local25 < Static153.anInt3070; local25++) {
				@Pc(31) int local31 = Static260.anIntArray327[local25];
				@Pc(35) int local35 = Static211.anIntArray576[arg0];
				@Pc(42) int local42 = this.anInt4866 * local31 >> 12;
				@Pc(49) int local49 = local35 * this.anInt4871 >> 12;
				@Pc(59) int local59 = this.anInt4866 * (local31 % (4096 / this.anInt4866));
				@Pc(69) int local69 = local35 % (4096 / this.anInt4871) * this.anInt4871;
				if (local69 < this.anInt4865) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (local59 < this.anInt4865) {
						local11[local25] = 0;
						continue;
					}
				}
				if (this.anInt4865 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local11[local25] = 0;
						continue;
					}
				}
				local11[local25] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4866 = arg0.method4325();
		} else if (arg1 == 1) {
			this.anInt4871 = arg0.method4325();
		} else if (arg1 == 2) {
			this.anInt4865 = arg0.method4294();
		}
	}
}
