import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class2_Sub3_Sub18 extends Class2_Sub3 {

	@OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
	private int anInt2822;

	@OriginalMember(owner = "client!oa", name = "lb", descriptor = "I")
	private int anInt2823;

	@OriginalMember(owner = "client!oa", name = "pb", descriptor = "I")
	private int anInt2824;

	@OriginalMember(owner = "client!oa", name = "tb", descriptor = "I")
	private int anInt2826;

	@OriginalMember(owner = "client!oa", name = "Db", descriptor = "I")
	private int anInt2831;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		Static150.method2329();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2822 = arg1.method1698();
		} else if (arg0 == 1) {
			this.anInt2823 = arg1.method1680();
		} else if (arg0 == 2) {
			this.anInt2826 = arg1.method1698();
		} else if (arg0 == 3) {
			this.anInt2824 = arg1.method1680();
		} else if (arg0 == 4) {
			this.anInt2831 = arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(25) int local25 = this.anInt2831 >> 1;
			@Pc(30) int[][] local30 = super.aClass33_39.method1303();
			@Pc(37) Random local37 = new Random((long) this.anInt2822);
			for (@Pc(39) int local39 = 0; local39 < this.anInt2823; local39++) {
				@Pc(61) int local61 = this.anInt2831 > 0 ? this.anInt2824 + Static90.method1619(local37, this.anInt2831) - local25 : this.anInt2824;
				@Pc(67) int local67 = local61 >> 4 & 0xFF;
				@Pc(72) int local72 = Static90.method1619(local37, Static54.anInt1423);
				@Pc(77) int local77 = Static90.method1619(local37, Static12.anInt558);
				@Pc(88) int local88 = (this.anInt2826 * Static31.anIntArray368[local67] >> 12) + local72;
				@Pc(100) int local100 = local77 + (this.anInt2826 * Static165.anIntArray339[local67] >> 12);
				@Pc(105) int local105 = local88 - local72;
				@Pc(110) int local110 = local100 - local77;
				if (local105 != 0 || local110 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(138) boolean local138 = local105 < local110;
					@Pc(142) int local142;
					@Pc(144) int local144;
					if (local138) {
						local142 = local72;
						local144 = local88;
						local72 = local77;
						local77 = local142;
						local88 = local100;
						local100 = local144;
					}
					if (local88 < local72) {
						local142 = local72;
						local72 = local88;
						local88 = local142;
						local144 = local77;
						local77 = local100;
						local100 = local144;
					}
					local144 = local88 - local72;
					local142 = local77;
					@Pc(182) int local182 = local100 - local77;
					@Pc(192) int local192 = 1024 - (Static90.method1619(local37, 4096) >> 2);
					if (local182 < 0) {
						local182 = -local182;
					}
					@Pc(204) int local204 = 2048 / local144;
					@Pc(209) int local209 = -local144 / 2;
					@Pc(216) int local216 = local100 > local77 ? 1 : -1;
					for (@Pc(218) int local218 = local72; local218 < local88; local218++) {
						local209 += local182;
						@Pc(235) int local235 = local192 + (-local72 + local218) * local204 + 1024;
						@Pc(239) int local239 = Static73.anInt1916 & local218;
						@Pc(243) int local243 = local142 & Static1.anInt2959;
						if (local138) {
							local30[local243][local239] = local235;
						} else {
							local30[local239][local243] = local235;
						}
						if (local209 > 0) {
							local209 += -local144;
							local142 += local216;
						}
					}
				}
			}
		}
		return local16;
	}
}
