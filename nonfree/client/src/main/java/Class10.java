import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class10 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	private int anInt404 = Static169.method2754(16);

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	private int anInt405 = Static169.method2754(24);

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	private int anInt406 = Static169.method2754(24);

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	private int anInt407 = Static169.method2754(24) + 1;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	private int anInt409 = Static169.method2754(6) + 1;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	private int anInt408 = Static169.method2754(8);

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class10() {
		@Pc(33) int[] local33 = new int[this.anInt409];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt409; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static169.method2754(3);
			@Pc(47) boolean local47 = Static169.method2758() != 0;
			if (local47) {
				local38 = Static169.method2754(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray64 = new int[this.anInt409 * 8];
		for (local38 = 0; local38 < this.anInt409 * 8; local38++) {
			this.anIntArray64[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static169.method2754(8);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([FIZ)V")
	public void method294(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static169.aClass61Array1[this.anInt408].anInt2451;
		@Pc(25) int local25 = this.anInt406 - this.anInt405;
		@Pc(30) int local30 = local25 / this.anInt407;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static169.aClass61Array1[this.anInt408].method1845();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt409;
						}
						local47 /= this.anInt409;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray64[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt405 + local38 * this.anInt407;
						@Pc(104) Class61 local104 = Static169.aClass61Array1[local90];
						@Pc(113) int local113;
						if (this.anInt404 == 0) {
							local113 = this.anInt407 / local104.anInt2451;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method1844();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt2451; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt407) {
								@Pc(153) float[] local153 = local104.method1844();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt2451; local155++) {
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
