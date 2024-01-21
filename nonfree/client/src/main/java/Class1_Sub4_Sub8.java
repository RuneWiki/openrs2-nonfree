import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class1_Sub4_Sub8 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hg", name = "ib", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!hg", name = "mb", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!hg", name = "gb", descriptor = "I")
	private int anInt1925;

	@OriginalMember(owner = "client!hg", name = "hb", descriptor = "I")
	private int anInt1926;

	@OriginalMember(owner = "client!hg", name = "sb", descriptor = "I")
	private int anInt1931;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	private void method1273() {
		this.anIntArray162 = new int[this.anInt1925 + 1];
		this.anIntArray161 = new int[this.anInt1925 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt1925;
		@Pc(33) int local33 = this.anInt1931 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1925; local35++) {
			this.anIntArray161[local35] = local21;
			this.anIntArray162[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray161[this.anInt1925] = 4096;
		this.anIntArray162[this.anInt1925] = this.anIntArray162[0] + 4096;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1925 = arg0.method544();
		} else if (arg1 == 1) {
			this.anInt1931 = arg0.method546();
		} else if (arg1 == 2) {
			this.anInt1926 = arg0.method544();
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(24) int local24 = Static150.anIntArray383[arg0];
			@Pc(34) int local34;
			if (this.anInt1926 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt1925; local34++) {
					if (local24 >= this.anIntArray161[local34] && this.anIntArray161[local34 + 1] > local24) {
						if (this.anIntArray162[local34] > local24) {
							local32 = 4096;
						}
						break;
					}
				}
				Static185.method2278(local16, 0, Static73.anInt1888, local32);
			} else {
				for (@Pc(82) int local82 = 0; local82 < Static73.anInt1888; local82++) {
					local34 = 0;
					@Pc(88) short local88 = 0;
					@Pc(92) int local92 = Static171.anIntArray421[local82];
					@Pc(95) int local95 = this.anInt1926;
					if (local95 == 1) {
						local34 = local92;
					} else if (local95 == 2) {
						local34 = (local24 + local92 - 4096 >> 1) + 2048;
					} else if (local95 == 3) {
						local34 = (local92 - local24 >> 1) + 2048;
					}
					for (local95 = 0; local95 < this.anInt1925; local95++) {
						if (local34 >= this.anIntArray161[local95] && local34 < this.anIntArray161[local95 + 1]) {
							if (this.anIntArray162[local95] > local34) {
								local88 = 4096;
							}
							break;
						}
					}
					local16[local82] = local88;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		this.method1273();
	}
}
