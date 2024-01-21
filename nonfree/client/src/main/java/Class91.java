import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class91 {

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	private final int anInt4546 = Static28.method688(16);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	private final int anInt4542 = Static28.method688(24);

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	private final int anInt4543 = Static28.method688(24);

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	private final int anInt4547 = Static28.method688(24) + 1;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	private final int anInt4544 = Static28.method688(6) + 1;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	private final int anInt4545 = Static28.method688(8);

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
	private final int[] anIntArray492;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class91() {
		@Pc(33) int[] local33 = new int[this.anInt4544];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4544; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static28.method688(3);
			@Pc(47) boolean local47 = Static28.method687() != 0;
			if (local47) {
				local38 = Static28.method688(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray492 = new int[this.anInt4544 * 8];
		for (local38 = 0; local38 < this.anInt4544 * 8; local38++) {
			this.anIntArray492[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static28.method688(8);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([FIZ)V")
	public void method3489(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static28.aClass33Array1[this.anInt4545].anInt2102;
		@Pc(25) int local25 = this.anInt4543 - this.anInt4542;
		@Pc(30) int local30 = local25 / this.anInt4547;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static28.aClass33Array1[this.anInt4545].method1588();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt4544;
						}
						local47 /= this.anInt4544;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray492[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt4542 + local38 * this.anInt4547;
						@Pc(104) Class33 local104 = Static28.aClass33Array1[local90];
						@Pc(113) int local113;
						if (this.anInt4546 == 0) {
							local113 = this.anInt4547 / local104.anInt2102;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method1585();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt2102; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt4547) {
								@Pc(153) float[] local153 = local104.method1585();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt2102; local155++) {
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
