import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class192 {

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	private final int anInt6053 = Static127.method1939(16);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	private final int anInt6052 = Static127.method1939(24);

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	private final int anInt6056 = Static127.method1939(24);

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	private final int anInt6055 = Static127.method1939(24) + 1;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	private final int anInt6054 = Static127.method1939(6) + 1;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	private final int anInt6057 = Static127.method1939(8);

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "[I")
	private final int[] anIntArray497;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class192() {
		@Pc(33) int[] local33 = new int[this.anInt6054];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt6054; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static127.method1939(3);
			@Pc(47) boolean local47 = Static127.method1940() != 0;
			if (local47) {
				local38 = Static127.method1939(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray497 = new int[this.anInt6054 * 8];
		for (local38 = 0; local38 < this.anInt6054 * 8; local38++) {
			this.anIntArray497[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static127.method1939(8);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([FIZ)V")
	public void method5160(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static127.aClass85Array1[this.anInt6057].anInt2038;
		@Pc(25) int local25 = this.anInt6056 - this.anInt6052;
		@Pc(30) int local30 = local25 / this.anInt6055;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static127.aClass85Array1[this.anInt6057].method1649();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt6054;
						}
						local47 /= this.anInt6054;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray497[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt6052 + local38 * this.anInt6055;
						@Pc(104) Class85 local104 = Static127.aClass85Array1[local90];
						@Pc(113) int local113;
						if (this.anInt6053 == 0) {
							local113 = this.anInt6055 / local104.anInt2038;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method1646();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt2038; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt6055) {
								@Pc(153) float[] local153 = local104.method1646();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt2038; local155++) {
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
