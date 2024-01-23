import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class44 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
	private int anInt1977 = Static130.method2477(16);

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	private int anInt1981 = Static130.method2477(24);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
	private int anInt1976 = Static130.method2477(24);

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	private int anInt1979 = Static130.method2477(24) + 1;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
	private int anInt1980 = Static130.method2477(6) + 1;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	private int anInt1978 = Static130.method2477(8);

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class44() {
		@Pc(33) int[] local33 = new int[this.anInt1980];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1980; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static130.method2477(3);
			@Pc(47) boolean local47 = Static130.method2478() != 0;
			if (local47) {
				local38 = Static130.method2477(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray149 = new int[this.anInt1980 * 8];
		for (local38 = 0; local38 < this.anInt1980 * 8; local38++) {
			this.anIntArray149[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static130.method2477(8);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([FIZ)V")
	public void method1445(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static130.aClass121Array1[this.anInt1978].anInt4637;
		@Pc(25) int local25 = this.anInt1976 - this.anInt1981;
		@Pc(30) int local30 = local25 / this.anInt1979;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static130.aClass121Array1[this.anInt1978].method3515();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt1980;
						}
						local47 /= this.anInt1980;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray149[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt1981 + local38 * this.anInt1979;
						@Pc(104) Class121 local104 = Static130.aClass121Array1[local90];
						@Pc(113) int local113;
						if (this.anInt1977 == 0) {
							local113 = this.anInt1979 / local104.anInt4637;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method3513();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt4637; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt1979) {
								@Pc(153) float[] local153 = local104.method3513();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt4637; local155++) {
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
