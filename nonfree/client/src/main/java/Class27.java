import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class27 {

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	private int anInt723 = Static223.method3731(16);

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	private int anInt720 = Static223.method3731(24);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	private int anInt719 = Static223.method3731(24);

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	private int anInt721 = Static223.method3731(24) + 1;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
	private int anInt724 = Static223.method3731(6) + 1;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	private int anInt722 = Static223.method3731(8);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class27() {
		@Pc(33) int[] local33 = new int[this.anInt724];
		@Pc(35) int local35;
		for (local35 = 0; local35 < this.anInt724; local35++) {
			@Pc(41) int local41 = 0;
			@Pc(44) int local44 = Static223.method3731(3);
			@Pc(50) boolean local50 = Static223.method3738() != 0;
			if (local50) {
				local41 = Static223.method3731(5);
			}
			local33[local35] = local41 << 3 | local44;
		}
		this.anIntArray47 = new int[this.anInt724 * 8];
		for (local35 = 0; local35 < this.anInt724 * 8; local35++) {
			this.anIntArray47[local35] = (local33[local35 >> 3] & 0x1 << (local35 & 0x7)) == 0 ? -1 : Static223.method3731(8);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([FIZ)V")
	public void method638(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		local1 = Static223.aClass18Array1[this.anInt722].anInt473;
		@Pc(25) int local25 = this.anInt719 - this.anInt720;
		@Pc(30) int local30 = local25 / this.anInt721;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(40) int local40 = 0;
			while (local40 < local30) {
				@Pc(51) int local51;
				@Pc(55) int local55;
				if (local35 == 0) {
					local51 = Static223.aClass18Array1[this.anInt722].method422();
					for (local55 = local1 - 1; local55 >= 0; local55--) {
						if (local40 + local55 < local30) {
							local33[local40 + local55] = local51 % this.anInt724;
						}
						local51 /= this.anInt724;
					}
				}
				for (local51 = 0; local51 < local1; local51++) {
					local55 = local33[local40];
					@Pc(96) int local96 = this.anIntArray47[local55 * 8 + local35];
					if (local96 >= 0) {
						@Pc(106) int local106 = this.anInt720 + local40 * this.anInt721;
						@Pc(110) Class18 local110 = Static223.aClass18Array1[local96];
						@Pc(119) int local119;
						if (this.anInt723 == 0) {
							local119 = this.anInt721 / local110.anInt473;
							for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
								@Pc(127) float[] local127 = local110.method419();
								for (@Pc(129) int local129 = 0; local129 < local110.anInt473; local129++) {
									arg0[local106 + local121 + local129 * local119] += local127[local129];
								}
							}
						} else {
							local119 = 0;
							while (local119 < this.anInt721) {
								@Pc(162) float[] local162 = local110.method419();
								for (@Pc(164) int local164 = 0; local164 < local110.anInt473; local164++) {
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
