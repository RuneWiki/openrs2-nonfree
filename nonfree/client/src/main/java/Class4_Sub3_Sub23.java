import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class4_Sub3_Sub23 extends Class4_Sub3 {

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	private int anInt2576;

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
	private int anInt2582;

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
	private int anInt2581;

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
	private int anInt2580;

	@OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
	private int anInt2584;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2582 = arg1.method1253();
		} else if (arg0 == 1) {
			this.anInt2584 = arg1.method1252();
		} else if (arg0 == 2) {
			this.anInt2576 = arg1.method1253();
		} else if (arg0 == 3) {
			this.anInt2581 = arg1.method1252();
		} else if (arg0 == 4) {
			this.anInt2580 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(28) int local28 = this.anInt2580 >> 1;
			@Pc(33) int[][] local33 = super.aClass64_41.method2208();
			@Pc(40) Random local40 = new Random((long) this.anInt2582);
			for (@Pc(42) int local42 = 0; local42 < this.anInt2584; local42++) {
				@Pc(62) int local62 = this.anInt2580 > 0 ? this.anInt2581 + Static38.method679(this.anInt2580, local40) - local28 : this.anInt2581;
				@Pc(67) int local67 = Static38.method679(Static134.anInt3188, local40);
				@Pc(73) int local73 = local62 >> 4 & 0xFF;
				@Pc(78) int local78 = Static38.method679(Static61.anInt1639, local40);
				@Pc(89) int local89 = (Static49.anIntArray123[local73] * this.anInt2576 >> 12) + local78;
				@Pc(94) int local94 = local89 - local78;
				@Pc(105) int local105 = (Static22.anIntArray59[local73] * this.anInt2576 >> 12) + local67;
				@Pc(109) int local109 = local105 - local67;
				if (local109 != 0 || local94 != 0) {
					if (local94 < 0) {
						local94 = -local94;
					}
					if (local109 < 0) {
						local109 = -local109;
					}
					@Pc(134) boolean local134 = local109 < local94;
					@Pc(138) int local138;
					@Pc(140) int local140;
					if (local134) {
						local138 = local67;
						local140 = local105;
						local67 = local78;
						local105 = local89;
						local89 = local140;
						local78 = local138;
					}
					if (local105 < local67) {
						local140 = local78;
						local138 = local67;
						local67 = local105;
						local78 = local89;
						local105 = local138;
						local89 = local140;
					}
					local140 = local105 - local67;
					local138 = local78;
					@Pc(179) int local179 = local89 - local78;
					if (local179 < 0) {
						local179 = -local179;
					}
					@Pc(197) int local197 = 1024 - (Static38.method679(4096, local40) >> 2);
					@Pc(202) int local202 = -local140 / 2;
					@Pc(213) int local213 = local89 <= local78 ? -1 : 1;
					@Pc(217) int local217 = 2048 / local140;
					for (@Pc(219) int local219 = local67; local219 < local105; local219++) {
						local202 += local179;
						@Pc(236) int local236 = local217 * (local219 - local67) + local197 + 1024;
						@Pc(240) int local240 = Static5.anInt216 & local138;
						if (local202 > 0) {
							local202 += -local140;
							local138 -= -local213;
						}
						@Pc(259) int local259 = Static2.anInt80 & local219;
						if (local134) {
							local33[local240][local259] = local236;
						} else {
							local33[local259][local240] = local236;
						}
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		Static97.method1889();
	}
}
