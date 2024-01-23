import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class158 {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	private int anInt4799 = Static231.method3674(16);

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	private int anInt4801 = Static231.method3674(24);

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	private int anInt4797 = Static231.method3674(24);

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	private int anInt4796 = Static231.method3674(24) + 1;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	private int anInt4800 = Static231.method3674(6) + 1;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	private int anInt4798 = Static231.method3674(8);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "[I")
	private int[] anIntArray518;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class158() {
		@Pc(33) int[] local33 = new int[this.anInt4800];
		@Pc(35) int local35;
		for (local35 = 0; local35 < this.anInt4800; local35++) {
			@Pc(41) int local41 = 0;
			@Pc(44) int local44 = Static231.method3674(3);
			@Pc(50) boolean local50 = Static231.method3669() != 0;
			if (local50) {
				local41 = Static231.method3674(5);
			}
			local33[local35] = local41 << 3 | local44;
		}
		this.anIntArray518 = new int[this.anInt4800 * 8];
		for (local35 = 0; local35 < this.anInt4800 * 8; local35++) {
			this.anIntArray518[local35] = (local33[local35 >> 3] & 0x1 << (local35 & 0x7)) == 0 ? -1 : Static231.method3674(8);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([FIZ)V")
	public void method3992(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		local1 = Static231.aClass134Array1[this.anInt4798].anInt4110;
		@Pc(25) int local25 = this.anInt4797 - this.anInt4801;
		@Pc(30) int local30 = local25 / this.anInt4796;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(40) int local40 = 0;
			while (local40 < local30) {
				@Pc(51) int local51;
				@Pc(55) int local55;
				if (local35 == 0) {
					local51 = Static231.aClass134Array1[this.anInt4798].method3408();
					for (local55 = local1 - 1; local55 >= 0; local55--) {
						if (local40 + local55 < local30) {
							local33[local40 + local55] = local51 % this.anInt4800;
						}
						local51 /= this.anInt4800;
					}
				}
				for (local51 = 0; local51 < local1; local51++) {
					local55 = local33[local40];
					@Pc(96) int local96 = this.anIntArray518[local55 * 8 + local35];
					if (local96 >= 0) {
						@Pc(106) int local106 = this.anInt4801 + local40 * this.anInt4796;
						@Pc(110) Class134 local110 = Static231.aClass134Array1[local96];
						@Pc(119) int local119;
						if (this.anInt4799 == 0) {
							local119 = this.anInt4796 / local110.anInt4110;
							for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
								@Pc(127) float[] local127 = local110.method3405();
								for (@Pc(129) int local129 = 0; local129 < local110.anInt4110; local129++) {
									arg0[local106 + local121 + local129 * local119] += local127[local129];
								}
							}
						} else {
							local119 = 0;
							while (local119 < this.anInt4796) {
								@Pc(162) float[] local162 = local110.method3405();
								for (@Pc(164) int local164 = 0; local164 < local110.anInt4110; local164++) {
									arg0[local106 + local119] += local162[local164];
									local119++;
								}
							}
						}
					}
					local40++;
					if (local40 >= local30) {
						break;
					}
				}
			}
		}
	}
}
