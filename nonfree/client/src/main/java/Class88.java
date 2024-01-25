import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class88 {

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
	private final int anInt3178 = Static220.method4248(16);

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
	private final int anInt3179 = Static220.method4248(24);

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
	private final int anInt3180 = Static220.method4248(24);

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
	private final int anInt3177 = Static220.method4248(24) + 1;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
	private final int anInt3176 = Static220.method4248(6) + 1;

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
	private final int anInt3181 = Static220.method4248(8);

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "[I")
	private final int[] anIntArray155;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	public Class88() {
		@Pc(33) int[] local33 = new int[this.anInt3176];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3176; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static220.method4248(3);
			@Pc(47) boolean local47 = Static220.method4247() != 0;
			if (local47) {
				local38 = Static220.method4248(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray155 = new int[this.anInt3176 * 8];
		for (local38 = 0; local38 < this.anInt3176 * 8; local38++) {
			this.anIntArray155[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static220.method4248(8);
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([FIZ)V")
	public void method2930(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static220.aClass111Array1[this.anInt3181].anInt4016;
		@Pc(25) int local25 = this.anInt3180 - this.anInt3179;
		@Pc(30) int local30 = local25 / this.anInt3177;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static220.aClass111Array1[this.anInt3181].method3527();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt3176;
						}
						local47 /= this.anInt3176;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray155[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt3179 + local38 * this.anInt3177;
						@Pc(104) Class111 local104 = Static220.aClass111Array1[local90];
						@Pc(113) int local113;
						if (this.anInt3178 == 0) {
							local113 = this.anInt3177 / local104.anInt4016;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method3528();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt4016; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt3177) {
								@Pc(153) float[] local153 = local104.method3528();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt4016; local155++) {
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
