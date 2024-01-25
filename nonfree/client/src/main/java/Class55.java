import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class55 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
	private final int anInt1299 = Static239.method4061(16);

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	private final int anInt1297 = Static239.method4061(24);

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
	private final int anInt1296 = Static239.method4061(24);

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
	private final int anInt1298 = Static239.method4061(24) + 1;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
	private final int anInt1300 = Static239.method4061(6) + 1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
	private final int anInt1295 = Static239.method4061(8);

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
	private final int[] anIntArray154;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class55() {
		@Pc(33) int[] local33 = new int[this.anInt1300];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1300; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static239.method4061(3);
			@Pc(47) boolean local47 = Static239.method4069() != 0;
			if (local47) {
				local38 = Static239.method4061(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray154 = new int[this.anInt1300 * 8];
		for (local38 = 0; local38 < this.anInt1300 * 8; local38++) {
			this.anIntArray154[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static239.method4061(8);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([FIZ)V")
	public void method1121(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static239.aClass272Array1[this.anInt1295].anInt7178;
		@Pc(25) int local25 = this.anInt1296 - this.anInt1297;
		@Pc(30) int local30 = local25 / this.anInt1298;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static239.aClass272Array1[this.anInt1295].method5949();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt1300;
						}
						local47 /= this.anInt1300;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray154[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt1297 + local38 * this.anInt1298;
						@Pc(104) Class272 local104 = Static239.aClass272Array1[local90];
						@Pc(113) int local113;
						if (this.anInt1299 == 0) {
							local113 = this.anInt1298 / local104.anInt7178;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method5947();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt7178; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt1298) {
								@Pc(153) float[] local153 = local104.method5947();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt7178; local155++) {
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
