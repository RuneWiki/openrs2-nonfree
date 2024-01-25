import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class196 {

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	private final int anInt6172 = Static538.method7652(16);

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	private final int anInt6170 = Static538.method7652(24);

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	private final int anInt6171 = Static538.method7652(24);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private final int anInt6167 = Static538.method7652(24) + 1;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private final int anInt6168 = Static538.method7652(6) + 1;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private final int anInt6169 = Static538.method7652(8);

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private final int[] anIntArray364;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class196() {
		@Pc(33) int[] local33 = new int[this.anInt6168];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt6168; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static538.method7652(3);
			@Pc(47) boolean local47 = Static538.method7646() != 0;
			if (local47) {
				local38 = Static538.method7652(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray364 = new int[this.anInt6168 * 8];
		for (local38 = 0; local38 < this.anInt6168 * 8; local38++) {
			this.anIntArray364[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static538.method7652(8);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([FIZ)V")
	public void method5223(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static538.aClass221Array1[this.anInt6169].anInt6955;
		@Pc(25) int local25 = this.anInt6171 - this.anInt6170;
		@Pc(30) int local30 = local25 / this.anInt6167;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static538.aClass221Array1[this.anInt6169].method5835();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt6168;
						}
						local47 /= this.anInt6168;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray364[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt6170 + local38 * this.anInt6167;
						@Pc(104) Class221 local104 = Static538.aClass221Array1[local90];
						@Pc(113) int local113;
						if (this.anInt6172 == 0) {
							local113 = this.anInt6167 / local104.anInt6955;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method5834();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt6955; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt6167) {
								@Pc(153) float[] local153 = local104.method5834();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt6955; local155++) {
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
