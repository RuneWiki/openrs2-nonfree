import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
	private int anInt2276;

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
	private int anInt2277;

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
	private int anInt2278;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
	private int anInt2284;

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		Static68.method1457();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(16) int local16 = this.anInt2284 >> 1;
			@Pc(21) int[][] local21 = super.aClass80_41.method2740();
			@Pc(28) Random local28 = new Random((long) this.anInt2281);
			for (@Pc(30) int local30 = 0; local30 < this.anInt2278; local30++) {
				@Pc(50) int local50 = this.anInt2284 > 0 ? this.anInt2276 + Static164.method2805(this.anInt2284, local28) - local16 : this.anInt2276;
				@Pc(56) int local56 = local50 >> 4 & 0xFF;
				@Pc(61) int local61 = Static164.method2805(Static65.anInt1933, local28);
				@Pc(66) int local66 = Static164.method2805(Static30.anInt1097, local28);
				@Pc(77) int local77 = local61 + (Static3.anIntArray6[local56] * this.anInt2277 >> 12);
				@Pc(88) int local88 = local66 + (this.anInt2277 * Static45.anIntArray153[local56] >> 12);
				@Pc(93) int local93 = local77 - local61;
				@Pc(98) int local98 = local88 - local66;
				if (local93 != 0 || local98 != 0) {
					if (local93 < 0) {
						local93 = -local93;
					}
					if (local98 < 0) {
						local98 = -local98;
					}
					@Pc(125) boolean local125 = local93 < local98;
					@Pc(129) int local129;
					@Pc(135) int local135;
					if (local125) {
						local129 = local61;
						local61 = local66;
						local66 = local129;
						local135 = local77;
						local77 = local88;
						local88 = local135;
					}
					if (local77 < local61) {
						local129 = local61;
						local61 = local77;
						local77 = local129;
						local135 = local66;
						local66 = local88;
						local88 = local135;
					}
					local129 = local66;
					local135 = local77 - local61;
					@Pc(166) int local166 = local88 - local66;
					if (local166 < 0) {
						local166 = -local166;
					}
					@Pc(178) int local178 = 2048 / local135;
					@Pc(183) int local183 = -local135 / 2;
					@Pc(195) int local195 = 1024 - (Static164.method2805(4096, local28) >> 2);
					@Pc(206) int local206 = local88 > local66 ? 1 : -1;
					for (@Pc(208) int local208 = local61; local208 < local77; local208++) {
						local183 += local166;
						@Pc(225) int local225 = (local208 - local61) * local178 + local195 + 1024;
						@Pc(229) int local229 = Static64.anInt1922 & local208;
						@Pc(233) int local233 = Static93.anInt2716 & local129;
						if (local125) {
							local21[local233][local229] = local225;
						} else {
							local21[local229][local233] = local225;
						}
						if (local183 > 0) {
							local183 += -local135;
							local129 += local206;
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2281 = arg1.method1607();
		} else if (arg0 == 1) {
			this.anInt2278 = arg1.method1642();
		} else if (arg0 == 2) {
			this.anInt2277 = arg1.method1607();
		} else if (arg0 == 3) {
			this.anInt2276 = arg1.method1642();
		} else if (arg0 == 4) {
			this.anInt2284 = arg1.method1642();
		}
	}
}
