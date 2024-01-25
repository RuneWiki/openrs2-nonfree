import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class1_Sub3_Sub23 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
	private int anInt4148 = 204;

	@OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
	private int anInt4150 = 1;

	@OriginalMember(owner = "client!mn", name = "T", descriptor = "I")
	private int anInt4152 = 1;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			for (@Pc(25) int local25 = 0; local25 < Static153.anInt3378; local25++) {
				@Pc(31) int local31 = Static107.anIntArray234[local25];
				@Pc(35) int local35 = Static266.anIntArray454[arg0];
				@Pc(42) int local42 = local31 * this.anInt4152 >> 12;
				@Pc(49) int local49 = this.anInt4150 * local35 >> 12;
				@Pc(59) int local59 = local31 % (4096 / this.anInt4152) * this.anInt4152;
				@Pc(69) int local69 = this.anInt4150 * (local35 % (4096 / this.anInt4150));
				if (this.anInt4148 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (this.anInt4148 > local59) {
						local19[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt4148) {
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

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4152 = arg1.method4532();
		} else if (arg0 == 1) {
			this.anInt4150 = arg1.method4532();
		} else if (arg0 == 2) {
			this.anInt4148 = arg1.method4556();
		}
	}
}
