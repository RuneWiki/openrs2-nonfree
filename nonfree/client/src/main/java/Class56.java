import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class56 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "I")
	private final int anInt2316 = Static35.method675(16);

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	private final int anInt2318 = Static35.method675(24);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	private final int anInt2315 = Static35.method675(24);

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	private final int anInt2319 = Static35.method675(24) + 1;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	private final int anInt2320 = Static35.method675(6) + 1;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	private final int anInt2317 = Static35.method675(8);

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
	private final int[] anIntArray351;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	public Class56() {
		@Pc(33) int[] local33 = new int[this.anInt2320];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2320; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static35.method675(3);
			@Pc(47) boolean local47 = Static35.method668() != 0;
			if (local47) {
				local38 = Static35.method675(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray351 = new int[this.anInt2320 * 8];
		for (local38 = 0; local38 < this.anInt2320 * 8; local38++) {
			this.anIntArray351[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static35.method675(8);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([FIZ)V")
	public void method1582(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static35.aClass61Array1[this.anInt2317].anInt2401;
		@Pc(25) int local25 = this.anInt2315 - this.anInt2318;
		@Pc(30) int local30 = local25 / this.anInt2319;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static35.aClass61Array1[this.anInt2317].method1643();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt2320;
						}
						local47 /= this.anInt2320;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray351[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt2318 + local38 * this.anInt2319;
						@Pc(104) Class61 local104 = Static35.aClass61Array1[local90];
						@Pc(113) int local113;
						if (this.anInt2316 == 0) {
							local113 = this.anInt2319 / local104.anInt2401;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method1644();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt2401; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt2319) {
								@Pc(153) float[] local153 = local104.method1644();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt2401; local155++) {
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
