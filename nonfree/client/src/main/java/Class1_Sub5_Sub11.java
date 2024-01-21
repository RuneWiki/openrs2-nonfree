import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class1_Sub5_Sub11 extends Class1_Sub5 {

	@OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
	private int anInt1430;

	@OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
	private int anInt1435;

	@OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
	private int anInt1438;

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
	private int anInt1436;

	@OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
	private int anInt1441;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		Static80.method1357();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(25) int local25 = this.anInt1436 >> 1;
			@Pc(30) int[][] local30 = super.aClass2_41.method18();
			@Pc(37) Random local37 = new Random((long) this.anInt1435);
			for (@Pc(39) int local39 = 0; local39 < this.anInt1441; local39++) {
				@Pc(59) int local59 = this.anInt1436 <= 0 ? this.anInt1430 : this.anInt1430 + Static103.method1706(this.anInt1436, local37) - local25;
				@Pc(64) int local64 = Static103.method1706(Static177.anInt4018, local37);
				@Pc(70) int local70 = local59 >> 4 & 0xFF;
				@Pc(75) int local75 = Static103.method1706(Static101.anInt2218, local37);
				@Pc(86) int local86 = (this.anInt1438 * Static61.anIntArray125[local70] >> 12) + local64;
				@Pc(97) int local97 = (this.anInt1438 * Static121.anIntArray285[local70] >> 12) + local75;
				@Pc(101) int local101 = local97 - local75;
				@Pc(106) int local106 = local86 - local64;
				if (local106 != 0 || local101 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local101 < 0) {
						local101 = -local101;
					}
					@Pc(140) boolean local140 = local101 > local106;
					@Pc(144) int local144;
					@Pc(146) int local146;
					if (local140) {
						local144 = local64;
						local146 = local86;
						local64 = local75;
						local86 = local97;
						local97 = local146;
						local75 = local144;
					}
					if (local64 > local86) {
						local144 = local64;
						local64 = local86;
						local86 = local144;
						local146 = local75;
						local75 = local97;
						local97 = local146;
					}
					local144 = local75;
					local146 = local86 - local64;
					@Pc(185) int local185 = -local146 / 2;
					@Pc(195) int local195 = 1024 - (Static103.method1706(4096, local37) >> 2);
					@Pc(200) int local200 = local97 - local75;
					@Pc(207) int local207 = local75 >= local97 ? -1 : 1;
					@Pc(211) int local211 = 2048 / local146;
					if (local200 < 0) {
						local200 = -local200;
					}
					for (@Pc(218) int local218 = local64; local218 < local86; local218++) {
						local185 += local200;
						@Pc(228) int local228 = local218 & Static47.anInt1130;
						@Pc(240) int local240 = local195 + (local218 + -local64) * local211 + 1024;
						@Pc(244) int local244 = Static151.anInt3420 & local144;
						if (local140) {
							local30[local244][local228] = local240;
						} else {
							local30[local228][local244] = local240;
						}
						if (local185 > 0) {
							local144 += local207;
							local185 += -local146;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1435 = arg0.method336();
		} else if (arg1 == 1) {
			this.anInt1441 = arg0.method359();
		} else if (arg1 == 2) {
			this.anInt1438 = arg0.method336();
		} else if (arg1 == 3) {
			this.anInt1430 = arg0.method359();
		} else if (arg1 == 4) {
			this.anInt1436 = arg0.method359();
		}
	}
}
