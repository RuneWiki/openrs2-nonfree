import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class342 {

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
	private final int anInt9643 = Static63.method1144(16);

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
	private final int anInt9640 = Static63.method1144(24);

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
	private final int anInt9639 = Static63.method1144(24);

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
	private final int anInt9642 = Static63.method1144(24) + 1;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
	private final int anInt9644 = Static63.method1144(6) + 1;

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
	private final int anInt9641 = Static63.method1144(8);

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "[I")
	private final int[] anIntArray583;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V")
	public Class342() {
		@Pc(33) int[] local33 = new int[this.anInt9644];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt9644; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static63.method1144(3);
			@Pc(47) boolean local47 = Static63.method1137() != 0;
			if (local47) {
				local38 = Static63.method1144(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray583 = new int[this.anInt9644 * 8];
		for (local38 = 0; local38 < this.anInt9644 * 8; local38++) {
			this.anIntArray583[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static63.method1144(8);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "([FIZ)V")
	public void method8170(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static63.aClass379Array1[this.anInt9641].anInt10663;
		@Pc(25) int local25 = this.anInt9639 - this.anInt9640;
		@Pc(30) int local30 = local25 / this.anInt9642;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static63.aClass379Array1[this.anInt9641].method8963();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt9644;
						}
						local47 /= this.anInt9644;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray583[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt9640 + local38 * this.anInt9642;
						@Pc(104) Class379 local104 = Static63.aClass379Array1[local90];
						@Pc(113) int local113;
						if (this.anInt9643 == 0) {
							local113 = this.anInt9642 / local104.anInt10663;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method8966();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt10663; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt9642) {
								@Pc(153) float[] local153 = local104.method8966();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt10663; local155++) {
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
