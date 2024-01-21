import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
	private int anInt2103;

	@OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
	private int anInt2107;

	@OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
	private int anInt2104;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			for (@Pc(23) int local23 = 0; local23 < Static86.anInt1942; local23++) {
				@Pc(29) int local29 = Static165.anIntArray17[local23];
				@Pc(33) int local33 = Static123.anIntArray308[arg0];
				@Pc(40) int local40 = this.anInt2104 * local33 >> 12;
				@Pc(47) int local47 = local29 * this.anInt2103 >> 12;
				@Pc(57) int local57 = local33 % (4096 / this.anInt2104) * this.anInt2104;
				@Pc(67) int local67 = local29 % (4096 / this.anInt2103) * this.anInt2103;
				if (this.anInt2107 > local57) {
					for (local47 -= local40; local47 < 0; local47 += 4) {
					}
					while (local47 > 3) {
						local47 -= 4;
					}
					if (local47 != 1) {
						local7[local23] = 0;
						continue;
					}
					if (local67 < this.anInt2107) {
						local7[local23] = 0;
						continue;
					}
				}
				if (this.anInt2107 > local67) {
					for (local47 -= local40; local47 < 0; local47 += 4) {
					}
					while (local47 > 3) {
						local47 -= 4;
					}
					if (local47 > 0) {
						local7[local23] = 0;
						continue;
					}
				}
				local7[local23] = 4096;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2103 = arg0.method1354();
		} else if (arg1 == 1) {
			this.anInt2104 = arg0.method1354();
		} else if (arg1 == 2) {
			this.anInt2107 = arg0.method1359();
		}
	}
}
