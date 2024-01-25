import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class5_Sub2_Sub27 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
	private int anInt7889 = 1;

	@OriginalMember(owner = "client!qba", name = "K", descriptor = "I")
	private int anInt7892 = 204;

	@OriginalMember(owner = "client!qba", name = "J", descriptor = "I")
	private int anInt7891 = 1;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			for (@Pc(25) int local25 = 0; local25 < Static195.anInt3759; local25++) {
				@Pc(31) int local31 = Static554.anIntArray510[local25];
				@Pc(35) int local35 = Static369.anIntArray377[arg0];
				@Pc(42) int local42 = local31 * this.anInt7891 >> 12;
				@Pc(49) int local49 = local35 * this.anInt7889 >> 12;
				@Pc(59) int local59 = this.anInt7891 * (local31 % (4096 / this.anInt7891));
				@Pc(69) int local69 = this.anInt7889 * (local35 % (4096 / this.anInt7889));
				if (this.anInt7892 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (local59 < this.anInt7892) {
						local19[local25] = 0;
						continue;
					}
				}
				if (this.anInt7892 > local59) {
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

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7891 = arg0.method7816();
		} else if (arg1 == 1) {
			this.anInt7889 = arg0.method7816();
		} else if (arg1 == 2) {
			this.anInt7892 = arg0.method7860();
		}
	}
}
