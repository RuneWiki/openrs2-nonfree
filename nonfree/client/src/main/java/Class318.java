import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class318 {

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
	private final int anInt8875 = Static338.method5170(16);

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
	private final int anInt8878 = Static338.method5170(24);

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
	private final int anInt8879 = Static338.method5170(24);

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
	private final int anInt8874 = Static338.method5170(24) + 1;

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
	private final int anInt8877 = Static338.method5170(6) + 1;

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
	private final int anInt8876 = Static338.method5170(8);

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "[I")
	private final int[] anIntArray494;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "()V")
	public Class318() {
		@Pc(33) int[] local33 = new int[this.anInt8877];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt8877; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static338.method5170(3);
			@Pc(47) boolean local47 = Static338.method5169() != 0;
			if (local47) {
				local38 = Static338.method5170(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray494 = new int[this.anInt8877 * 8];
		for (local38 = 0; local38 < this.anInt8877 * 8; local38++) {
			this.anIntArray494[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static338.method5170(8);
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "([FIZ)V")
	public void method7541(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static338.aClass158Array1[this.anInt8876].anInt4536;
		@Pc(25) int local25 = this.anInt8879 - this.anInt8878;
		@Pc(30) int local30 = local25 / this.anInt8874;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static338.aClass158Array1[this.anInt8876].method3843();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt8877;
						}
						local47 /= this.anInt8877;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray494[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt8878 + local38 * this.anInt8874;
						@Pc(104) Class158 local104 = Static338.aClass158Array1[local90];
						@Pc(113) int local113;
						if (this.anInt8875 == 0) {
							local113 = this.anInt8874 / local104.anInt4536;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method3846();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt4536; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt8874) {
								@Pc(153) float[] local153 = local104.method3846();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt4536; local155++) {
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
