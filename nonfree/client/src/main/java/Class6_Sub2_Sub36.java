import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class6_Sub2_Sub36 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	private int anInt6551 = 1;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	private int anInt6553 = 1;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
	private int anInt6552 = 204;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			for (@Pc(17) int local17 = 0; local17 < Static185.anInt4925; local17++) {
				@Pc(23) int local23 = Static53.anIntArray95[local17];
				@Pc(27) int local27 = Static168.anIntArray278[arg0];
				@Pc(34) int local34 = this.anInt6553 * local23 >> 12;
				@Pc(41) int local41 = local27 * this.anInt6551 >> 12;
				@Pc(51) int local51 = this.anInt6553 * (local23 % (4096 / this.anInt6553));
				@Pc(61) int local61 = this.anInt6551 * (local27 % (4096 / this.anInt6551));
				if (this.anInt6552 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt6552) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt6552) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6553 = arg0.method3111();
		} else if (arg1 == 1) {
			this.anInt6551 = arg0.method3111();
		} else if (arg1 == 2) {
			this.anInt6552 = arg0.method3108();
		}
	}
}
