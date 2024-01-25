import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class Class59 {

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
	private final int anInt1659 = Static99.method1791(16);

	@OriginalMember(owner = "client!cka", name = "f", descriptor = "I")
	private final int anInt1662 = Static99.method1791(24);

	@OriginalMember(owner = "client!cka", name = "g", descriptor = "I")
	private final int anInt1663 = Static99.method1791(24);

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
	private final int anInt1658 = Static99.method1791(24) + 1;

	@OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
	private final int anInt1661 = Static99.method1791(6) + 1;

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "I")
	private final int anInt1660 = Static99.method1791(8);

	@OriginalMember(owner = "client!cka", name = "e", descriptor = "[I")
	private final int[] anIntArray128;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "()V")
	public Class59() {
		@Pc(33) int[] local33 = new int[this.anInt1661];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1661; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static99.method1791(3);
			@Pc(47) boolean local47 = Static99.method1797() != 0;
			if (local47) {
				local38 = Static99.method1791(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray128 = new int[this.anInt1661 * 8];
		for (local38 = 0; local38 < this.anInt1661 * 8; local38++) {
			this.anIntArray128[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static99.method1791(8);
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "([FIZ)V")
	public void method1434(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static99.aClass314Array1[this.anInt1660].anInt9233;
		@Pc(25) int local25 = this.anInt1663 - this.anInt1662;
		@Pc(30) int local30 = local25 / this.anInt1658;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static99.aClass314Array1[this.anInt1660].method7636();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt1661;
						}
						local47 /= this.anInt1661;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray128[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt1662 + local38 * this.anInt1658;
						@Pc(104) Class314 local104 = Static99.aClass314Array1[local90];
						@Pc(113) int local113;
						if (this.anInt1659 == 0) {
							local113 = this.anInt1658 / local104.anInt9233;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method7635();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt9233; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt1658) {
								@Pc(153) float[] local153 = local104.method7635();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt9233; local155++) {
									arg0[local100 + local113] += local153[local155];
									local113++;
								}
							}
						}
					}
					local38++;
					if (local38 >= local30) {
						break;
					}
				}
			}
		}
	}
}
