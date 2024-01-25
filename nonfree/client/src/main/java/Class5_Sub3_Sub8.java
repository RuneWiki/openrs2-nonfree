import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public final class Class5_Sub3_Sub8 extends Class5_Sub3 {

	@OriginalMember(owner = "client!eia", name = "H", descriptor = "I")
	private int anInt2115 = 1;

	@OriginalMember(owner = "client!eia", name = "O", descriptor = "I")
	private int anInt2119 = 1;

	@OriginalMember(owner = "client!eia", name = "M", descriptor = "I")
	private int anInt2117 = 204;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2119 = arg0.method7291();
		} else if (arg1 == 1) {
			this.anInt2115 = arg0.method7291();
		} else if (arg1 == 2) {
			this.anInt2117 = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			for (@Pc(25) int local25 = 0; local25 < Static7.anInt102; local25++) {
				@Pc(31) int local31 = Static382.anIntArray368[local25];
				@Pc(35) int local35 = Static458.anIntArray438[arg0];
				@Pc(42) int local42 = this.anInt2119 * local31 >> 12;
				@Pc(49) int local49 = this.anInt2115 * local35 >> 12;
				@Pc(59) int local59 = this.anInt2119 * (local31 % (4096 / this.anInt2119));
				@Pc(69) int local69 = this.anInt2115 * (local35 % (4096 / this.anInt2115));
				if (this.anInt2117 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (local59 < this.anInt2117) {
						local19[local25] = 0;
						continue;
					}
				}
				if (this.anInt2117 > local59) {
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
}
