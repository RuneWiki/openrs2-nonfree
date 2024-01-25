import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class291 {

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
	private final int anInt8786 = Static311.method5011(16);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
	private final int anInt8782 = Static311.method5011(24);

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
	private final int anInt8784 = Static311.method5011(24);

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
	private final int anInt8785 = Static311.method5011(24) + 1;

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
	private final int anInt8787 = Static311.method5011(6) + 1;

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
	private final int anInt8783 = Static311.method5011(8);

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "[I")
	private final int[] anIntArray651;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V")
	public Class291() {
		@Pc(33) int[] local33 = new int[this.anInt8787];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt8787; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static311.method5011(3);
			@Pc(47) boolean local47 = Static311.method5015() != 0;
			if (local47) {
				local38 = Static311.method5011(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray651 = new int[this.anInt8787 * 8];
		for (local38 = 0; local38 < this.anInt8787 * 8; local38++) {
			this.anIntArray651[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static311.method5011(8);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "([FIZ)V")
	public void method7209(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static311.aClass297Array1[this.anInt8783].anInt8879;
		@Pc(25) int local25 = this.anInt8784 - this.anInt8782;
		@Pc(30) int local30 = local25 / this.anInt8785;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static311.aClass297Array1[this.anInt8783].method7302();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt8787;
						}
						local47 /= this.anInt8787;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray651[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt8782 + local38 * this.anInt8785;
						@Pc(104) Class297 local104 = Static311.aClass297Array1[local90];
						@Pc(113) int local113;
						if (this.anInt8786 == 0) {
							local113 = this.anInt8785 / local104.anInt8879;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method7303();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt8879; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt8785) {
								@Pc(153) float[] local153 = local104.method7303();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt8879; local155++) {
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
