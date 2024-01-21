import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class74 {

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	private final int anInt3074 = Static55.method976(16);

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	private final int anInt3072 = Static55.method976(24);

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	private final int anInt3073 = Static55.method976(24);

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	private final int anInt3075 = Static55.method976(24) + 1;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	private final int anInt3071 = Static55.method976(6) + 1;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	private final int anInt3070 = Static55.method976(8);

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
	private final int[] anIntArray330;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class74() {
		@Pc(33) int[] local33 = new int[this.anInt3071];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3071; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static55.method976(3);
			@Pc(47) boolean local47 = Static55.method986() != 0;
			if (local47) {
				local38 = Static55.method976(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray330 = new int[this.anInt3071 * 8];
		for (local38 = 0; local38 < this.anInt3071 * 8; local38++) {
			this.anIntArray330[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static55.method976(8);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([FIZ)V")
	public void method2370(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static55.aClass10Array1[this.anInt3070].anInt649;
		@Pc(25) int local25 = this.anInt3073 - this.anInt3072;
		@Pc(30) int local30 = local25 / this.anInt3075;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static55.aClass10Array1[this.anInt3070].method554();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt3071;
						}
						local47 /= this.anInt3071;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray330[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt3072 + local38 * this.anInt3075;
						@Pc(104) Class10 local104 = Static55.aClass10Array1[local90];
						@Pc(113) int local113;
						if (this.anInt3074 == 0) {
							local113 = this.anInt3075 / local104.anInt649;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method555();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt649; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt3075) {
								@Pc(153) float[] local153 = local104.method555();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt649; local155++) {
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
