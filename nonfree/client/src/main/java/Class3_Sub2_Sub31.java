import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class3_Sub2_Sub31 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
	private int anInt3539;

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
	private int anInt3540;

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
	private int anInt3541;

	@OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
	private int anInt3543;

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
	private int anInt3545;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3541 = arg0.method1354();
		} else if (arg1 == 1) {
			this.anInt3545 = arg0.method1359();
		} else if (arg1 == 2) {
			this.anInt3543 = arg0.method1354();
		} else if (arg1 == 3) {
			this.anInt3539 = arg0.method1359();
		} else if (arg1 == 4) {
			this.anInt3540 = arg0.method1359();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(26) int local26 = this.anInt3540 >> 1;
			@Pc(31) int[][] local31 = super.aClass46_39.method1417();
			@Pc(38) Random local38 = new Random((long) this.anInt3541);
			for (@Pc(40) int local40 = 0; local40 < this.anInt3545; local40++) {
				@Pc(61) int local61 = this.anInt3540 <= 0 ? this.anInt3539 : this.anInt3539 + Static12.method194(local38, this.anInt3540) - local26;
				@Pc(67) int local67 = local61 >> 4 & 0xFF;
				@Pc(72) int local72 = Static12.method194(local38, Static86.anInt1942);
				@Pc(77) int local77 = Static12.method194(local38, Static152.anInt3405);
				@Pc(88) int local88 = (Static82.anIntArray188[local67] * this.anInt3543 >> 12) + local72;
				@Pc(99) int local99 = (Static57.anIntArray142[local67] * this.anInt3543 >> 12) + local77;
				@Pc(104) int local104 = local99 - local77;
				@Pc(109) int local109 = local88 - local72;
				if (local109 != 0 || local104 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(140) boolean local140 = local104 > local109;
					@Pc(144) int local144;
					@Pc(146) int local146;
					if (local140) {
						local144 = local72;
						local146 = local88;
						local72 = local77;
						local88 = local99;
						local99 = local146;
						local77 = local144;
					}
					if (local88 < local72) {
						local144 = local72;
						local146 = local77;
						local72 = local88;
						local88 = local144;
						local77 = local99;
						local99 = local146;
					}
					local146 = local88 - local72;
					@Pc(183) int local183 = local99 - local77;
					local144 = local77;
					if (local183 < 0) {
						local183 = -local183;
					}
					@Pc(195) int local195 = -local146 / 2;
					@Pc(199) int local199 = 2048 / local146;
					@Pc(209) int local209 = 1024 - (Static12.method194(local38, 4096) >> 2);
					@Pc(216) int local216 = local77 >= local99 ? -1 : 1;
					for (@Pc(218) int local218 = local72; local218 < local88; local218++) {
						local195 += local183;
						@Pc(228) int local228 = Static165.anInt321 & local218;
						@Pc(239) int local239 = local209 + (local218 + -local72) * local199 + 1024;
						@Pc(243) int local243 = Static124.anInt2869 & local144;
						if (local140) {
							local31[local243][local228] = local239;
						} else {
							local31[local228][local243] = local239;
						}
						if (local195 > 0) {
							local144 += local216;
							local195 += -local146;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		Static82.method1413();
	}
}
