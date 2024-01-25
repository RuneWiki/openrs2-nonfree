import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	private int anInt1557 = 1;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "I")
	private int anInt1559 = 1;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	private int anInt1562 = 204;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt1559 = arg1.method4220();
		} else if (arg0 == 1) {
			this.anInt1557 = arg1.method4220();
		} else if (arg0 == 2) {
			this.anInt1562 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			for (@Pc(25) int local25 = 0; local25 < Static147.anInt3075; local25++) {
				@Pc(31) int local31 = Static315.anIntArray425[local25];
				@Pc(35) int local35 = Static295.anIntArray403[arg0];
				@Pc(42) int local42 = local31 * this.anInt1559 >> 12;
				@Pc(49) int local49 = local35 * this.anInt1557 >> 12;
				@Pc(59) int local59 = local31 % (4096 / this.anInt1559) * this.anInt1559;
				@Pc(69) int local69 = this.anInt1557 * (local35 % (4096 / this.anInt1557));
				if (local69 < this.anInt1562) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (local59 < this.anInt1562) {
						local19[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt1562) {
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
