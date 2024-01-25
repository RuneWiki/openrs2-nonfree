import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
	private int anInt1169 = 204;

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
	private int anInt1168 = 1;

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
	private int anInt1167 = 1;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1168 = arg0.method3922();
		} else if (arg1 == 1) {
			this.anInt1167 = arg0.method3922();
		} else if (arg1 == 2) {
			this.anInt1169 = arg0.method3967();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			for (@Pc(25) int local25 = 0; local25 < Static452.anInt7734; local25++) {
				@Pc(31) int local31 = Static228.anIntArray442[local25];
				@Pc(35) int local35 = Static7.anIntArray20[arg0];
				@Pc(42) int local42 = local31 * this.anInt1168 >> 12;
				@Pc(49) int local49 = this.anInt1167 * local35 >> 12;
				@Pc(59) int local59 = this.anInt1168 * (local31 % (4096 / this.anInt1168));
				@Pc(69) int local69 = local35 % (4096 / this.anInt1167) * this.anInt1167;
				if (local69 < this.anInt1169) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (local59 < this.anInt1169) {
						local19[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt1169) {
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
