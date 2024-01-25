import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class248 {

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	private final int anInt6788 = Static132.method2558(16);

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
	private final int anInt6789 = Static132.method2558(24);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	private final int anInt6791 = Static132.method2558(24);

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	private final int anInt6792 = Static132.method2558(24) + 1;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	private final int anInt6793 = Static132.method2558(6) + 1;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	private final int anInt6790 = Static132.method2558(8);

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
	private final int[] anIntArray407;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class248() {
		@Pc(33) int[] local33 = new int[this.anInt6793];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt6793; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static132.method2558(3);
			@Pc(47) boolean local47 = Static132.method2552() != 0;
			if (local47) {
				local38 = Static132.method2558(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray407 = new int[this.anInt6793 * 8];
		for (local38 = 0; local38 < this.anInt6793 * 8; local38++) {
			this.anIntArray407[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static132.method2558(8);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([FIZ)V")
	public void method6036(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static132.aClass333Array1[this.anInt6790].anInt9141;
		@Pc(25) int local25 = this.anInt6791 - this.anInt6789;
		@Pc(30) int local30 = local25 / this.anInt6792;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static132.aClass333Array1[this.anInt6790].method7977();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt6793;
						}
						local47 /= this.anInt6793;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray407[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt6789 + local38 * this.anInt6792;
						@Pc(104) Class333 local104 = Static132.aClass333Array1[local90];
						@Pc(113) int local113;
						if (this.anInt6788 == 0) {
							local113 = this.anInt6792 / local104.anInt9141;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method7979();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt9141; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt6792) {
								@Pc(153) float[] local153 = local104.method7979();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt9141; local155++) {
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
