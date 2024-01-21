import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
	private int anInt2162;

	@OriginalMember(owner = "client!la", name = "cb", descriptor = "I")
	private int anInt2167;

	@OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
	private int anInt2169;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			for (@Pc(17) int local17 = 0; local17 < Static141.anInt3261; local17++) {
				@Pc(23) int local23 = Static85.anIntArray47[local17];
				@Pc(30) int local30 = local23 * this.anInt2167 >> 12;
				@Pc(34) int local34 = Static125.anIntArray336[arg0];
				@Pc(41) int local41 = this.anInt2162 * local34 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt2167) * this.anInt2167;
				@Pc(61) int local61 = this.anInt2162 * (local34 % (4096 / this.anInt2162));
				if (local61 < this.anInt2169) {
					for (local30 -= local41; local30 < 0; local30 += 4) {
					}
					while (local30 > 3) {
						local30 -= 4;
					}
					if (local30 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt2169) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt2169 > local51) {
					for (local30 -= local41; local30 < 0; local30 += 4) {
					}
					while (local30 > 3) {
						local30 -= 4;
					}
					if (local30 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2167 = arg1.method191();
		} else if (arg0 == 1) {
			this.anInt2162 = arg1.method191();
		} else if (arg0 == 2) {
			this.anInt2169 = arg1.method208();
		}
	}
}
