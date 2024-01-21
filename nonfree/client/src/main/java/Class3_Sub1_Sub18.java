import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
	private int anInt2793;

	@OriginalMember(owner = "client!ng", name = "bb", descriptor = "I")
	private int anInt2795;

	@OriginalMember(owner = "client!ng", name = "kb", descriptor = "I")
	private int anInt2802;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2802 = arg1.method1545();
		} else if (arg0 == 1) {
			this.anInt2795 = arg1.method1545();
		} else if (arg0 == 2) {
			this.anInt2793 = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			for (@Pc(17) int local17 = 0; local17 < Static129.anInt3285; local17++) {
				@Pc(23) int local23 = Static22.anIntArray152[arg0];
				@Pc(27) int local27 = Static146.anIntArray618[local17];
				@Pc(34) int local34 = this.anInt2802 * local27 >> 12;
				@Pc(44) int local44 = local27 % (4096 / this.anInt2802) * this.anInt2802;
				@Pc(54) int local54 = local23 % (4096 / this.anInt2795) * this.anInt2795;
				@Pc(61) int local61 = local23 * this.anInt2795 >> 12;
				if (this.anInt2793 > local54) {
					for (local34 -= local61; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local44 < this.anInt2793) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt2793 > local44) {
					for (local34 -= local61; local34 < 0; local34 += 4) {
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
}
