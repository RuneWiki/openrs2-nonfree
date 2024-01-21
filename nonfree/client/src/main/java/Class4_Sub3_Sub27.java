import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class4_Sub3_Sub27 extends Class4_Sub3 {

	@OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
	private int anInt3130;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
	private int anInt3128;

	@OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
	private int anInt3132;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			for (@Pc(25) int local25 = 0; local25 < Static134.anInt3188; local25++) {
				@Pc(31) int local31 = Static67.anIntArray170[local25];
				@Pc(38) int local38 = this.anInt3130 * local31 >> 12;
				@Pc(42) int local42 = Static148.anIntArray321[arg0];
				@Pc(52) int local52 = local31 % (4096 / this.anInt3130) * this.anInt3130;
				@Pc(59) int local59 = this.anInt3132 * local42 >> 12;
				@Pc(69) int local69 = local42 % (4096 / this.anInt3132) * this.anInt3132;
				if (this.anInt3128 > local69) {
					for (local38 -= local59; local38 < 0; local38 += 4) {
					}
					while (local38 > 3) {
						local38 -= 4;
					}
					if (local38 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (this.anInt3128 > local52) {
						local19[local25] = 0;
						continue;
					}
				}
				if (local52 < this.anInt3128) {
					for (local38 -= local59; local38 < 0; local38 += 4) {
					}
					while (local38 > 3) {
						local38 -= 4;
					}
					if (local38 > 0) {
						local19[local25] = 0;
						continue;
					}
				}
				local19[local25] = 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3130 = arg1.method1253();
		} else if (arg0 == 1) {
			this.anInt3132 = arg1.method1253();
		} else if (arg0 == 2) {
			this.anInt3128 = arg1.method1252();
		}
	}
}
