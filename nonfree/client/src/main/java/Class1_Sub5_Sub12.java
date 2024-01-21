import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class1_Sub5_Sub12 extends Class1_Sub5 {

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
	private int anInt1633;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
	private int anInt1635;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
	private int anInt1636;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			for (@Pc(13) int local13 = 0; local13 < Static177.anInt4018; local13++) {
				@Pc(19) int local19 = Static116.anIntArray275[local13];
				@Pc(23) int local23 = Static34.anIntArray75[arg0];
				@Pc(30) int local30 = this.anInt1633 * local19 >> 12;
				@Pc(37) int local37 = local23 * this.anInt1635 >> 12;
				@Pc(47) int local47 = local19 % (4096 / this.anInt1633) * this.anInt1633;
				@Pc(57) int local57 = local23 % (4096 / this.anInt1635) * this.anInt1635;
				if (this.anInt1636 > local57) {
					for (local30 -= local37; local30 < 0; local30 += 4) {
					}
					while (local30 > 3) {
						local30 -= 4;
					}
					if (local30 != 1) {
						local7[local13] = 0;
						continue;
					}
					if (this.anInt1636 > local47) {
						local7[local13] = 0;
						continue;
					}
				}
				if (local47 < this.anInt1636) {
					for (local30 -= local37; local30 < 0; local30 += 4) {
					}
					while (local30 > 3) {
						local30 -= 4;
					}
					if (local30 > 0) {
						local7[local13] = 0;
						continue;
					}
				}
				local7[local13] = 4096;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1633 = arg0.method336();
		} else if (arg1 == 1) {
			this.anInt1635 = arg0.method336();
		} else if (arg1 == 2) {
			this.anInt1636 = arg0.method359();
		}
	}
}
