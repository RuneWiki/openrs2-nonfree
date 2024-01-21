import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
	private int anInt402 = 1;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
	private int anInt409 = 204;

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
	private int anInt408 = 1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			for (@Pc(25) int local25 = 0; local25 < Static190.anInt3865; local25++) {
				@Pc(31) int local31 = Static133.anIntArray187[local25];
				@Pc(35) int local35 = Static34.anIntArray37[arg0];
				@Pc(42) int local42 = this.anInt408 * local31 >> 12;
				@Pc(49) int local49 = local35 * this.anInt402 >> 12;
				@Pc(59) int local59 = local35 % (4096 / this.anInt402) * this.anInt402;
				@Pc(69) int local69 = this.anInt408 * (local31 % (4096 / this.anInt408));
				if (this.anInt409 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local15[local25] = 0;
						continue;
					}
					if (this.anInt409 > local69) {
						local15[local25] = 0;
						continue;
					}
				}
				if (local69 < this.anInt409) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local15[local25] = 0;
						continue;
					}
				}
				local15[local25] = 4096;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt408 = arg0.method1278();
		} else if (arg1 == 1) {
			this.anInt402 = arg0.method1278();
		} else if (arg1 == 2) {
			this.anInt409 = arg0.method1270();
		}
	}
}
