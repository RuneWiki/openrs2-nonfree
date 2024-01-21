import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class2_Sub2_Sub33 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
	private int anInt3104;

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
	private int anInt3105;

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
	private int anInt3111;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3104 = arg1.method1461();
		} else if (arg0 == 1) {
			this.anInt3105 = arg1.method1456();
		} else if (arg0 == 2) {
			this.anInt3111 = arg1.method1461();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(26) int[][] local26 = super.aClass76_38.method2291();
			@Pc(33) Random local33 = new Random((long) this.anInt3104);
			@Pc(38) int local38 = this.anInt3111 << 1;
			for (@Pc(40) int local40 = 0; local40 < this.anInt3105; local40++) {
				@Pc(47) int local47 = Static137.method2174(local33, Static149.anInt3233);
				@Pc(54) int local54 = Static137.method2174(local33, Static2.anInt36);
				@Pc(68) int local68 = local47 + Static137.method2174(local33, local38) - this.anInt3111;
				@Pc(80) int local80 = local54 + Static137.method2174(local33, local38) - this.anInt3111;
				@Pc(85) int local85 = local80 - local54;
				@Pc(89) int local89 = local68 - local47;
				if (local89 != 0 || local85 != 0) {
					if (local89 < 0) {
						local89 = -local89;
					}
					if (local85 < 0) {
						local85 = -local85;
					}
					@Pc(120) boolean local120 = local85 > local89;
					@Pc(124) int local124;
					@Pc(126) int local126;
					if (local120) {
						local124 = local47;
						local126 = local68;
						local68 = local80;
						local80 = local126;
						local47 = local54;
						local54 = local124;
					}
					if (local68 < local47) {
						local124 = local47;
						local47 = local68;
						local68 = local124;
						local126 = local54;
						local54 = local80;
						local80 = local126;
					}
					local124 = local54;
					@Pc(160) int local160 = local80 - local54;
					if (local160 < 0) {
						local160 = -local160;
					}
					local126 = local68 - local47;
					@Pc(178) int local178 = -local126 / 2;
					@Pc(182) int local182 = 2048 / local126;
					@Pc(194) int local194 = 1024 - (Static137.method2174(local33, 4096) >> 2);
					@Pc(205) int local205 = local54 < local80 ? 1 : -1;
					for (@Pc(207) int local207 = local47; local207 < local68; local207++) {
						local178 += local160;
						@Pc(217) int local217 = local207 & Static145.anInt2636;
						@Pc(228) int local228 = (local207 - local47) * local182 + local194 + 1024;
						@Pc(232) int local232 = Static75.anInt1778 & local124;
						if (local120) {
							local26[local232][local217] = local228;
						} else {
							local26[local217][local232] = local228;
						}
						if (local178 > 0) {
							local178 += -local126;
							local124 -= -local205;
						}
					}
				}
			}
		}
		return local17;
	}
}
