import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class115 {

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	private int anInt4139 = Static167.method2751(16);

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt4135 = Static167.method2751(24);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	private int anInt4134 = Static167.method2751(24);

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	private int anInt4137 = Static167.method2751(24) + 1;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	private int anInt4138 = Static167.method2751(6) + 1;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt4136 = Static167.method2751(8);

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class115() {
		@Pc(33) int[] local33 = new int[this.anInt4138];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4138; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static167.method2751(3);
			@Pc(47) boolean local47 = Static167.method2754() != 0;
			if (local47) {
				local38 = Static167.method2751(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray469 = new int[this.anInt4138 * 8];
		for (local38 = 0; local38 < this.anInt4138 * 8; local38++) {
			this.anIntArray469[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static167.method2751(8);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([FIZ)V")
	public void method3266(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static167.aClass54Array1[this.anInt4136].anInt1909;
		@Pc(25) int local25 = this.anInt4134 - this.anInt4135;
		@Pc(30) int local30 = local25 / this.anInt4137;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static167.aClass54Array1[this.anInt4136].method1468();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt4138;
						}
						local47 /= this.anInt4138;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray469[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt4135 + local38 * this.anInt4137;
						@Pc(104) Class54 local104 = Static167.aClass54Array1[local90];
						@Pc(113) int local113;
						if (this.anInt4139 == 0) {
							local113 = this.anInt4137 / local104.anInt1909;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method1467();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt1909; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt4137) {
								@Pc(153) float[] local153 = local104.method1467();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt1909; local155++) {
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
