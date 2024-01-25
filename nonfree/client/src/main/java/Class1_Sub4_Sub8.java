import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub4_Sub8 extends Class1_Sub4 {

	@OriginalMember(owner = "client!de", name = "H", descriptor = "I")
	private int anInt1619 = 1;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "I")
	private int anInt1615 = 1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt1619 = arg1.method5366();
		} else if (arg0 == 1) {
			this.anInt1615 = arg1.method5366();
		} else if (arg0 == 2) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(32) int local32 = this.anInt1615 + this.anInt1615 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt1619 + this.anInt1619 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local32][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt1615; local57 <= this.anInt1615 + arg0; local57++) {
				@Pc(67) int[][] local67 = this.method5956(local57 & Static67.anInt1514, 0);
				@Pc(71) int[][] local71 = new int[3][Static66.anInt1511];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt1619; local93 <= this.anInt1619; local93++) {
					@Pc(99) int local99 = Static393.anInt6315 & local93;
					local75 += local85[local99];
					local73 += local81[local99];
					local77 += local89[local99];
				}
				@Pc(126) int[] local126 = local71[0];
				@Pc(130) int[] local130 = local71[1];
				@Pc(134) int[] local134 = local71[2];
				@Pc(136) int local136 = 0;
				while (Static66.anInt1511 > local136) {
					local126[local136] = local48 * local73 >> 16;
					local130[local136] = local48 * local75 >> 16;
					local134[local136] = local77 * local48 >> 16;
					@Pc(169) int local169 = Static393.anInt6315 & local136 - this.anInt1619;
					local73 -= local81[local169];
					local136++;
					local77 -= local89[local169];
					local75 -= local85[local169];
					@Pc(195) int local195 = this.anInt1619 + local136 & Static393.anInt6315;
					local75 += local85[local195];
					local77 += local89[local195];
					local73 += local81[local195];
				}
				local51[local57 + this.anInt1615 - arg0] = local71;
			}
			@Pc(245) int[] local245 = local19[0];
			@Pc(249) int[] local249 = local19[1];
			@Pc(253) int[] local253 = local19[2];
			for (local75 = 0; local75 < Static66.anInt1511; local75++) {
				local77 = 0;
				@Pc(261) int local261 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local32; local265++) {
					@Pc(271) int[][] local271 = local51[local265];
					local261 += local271[1][local75];
					local263 += local271[2][local75];
					local77 += local271[0][local75];
				}
				local245[local75] = local36 * local77 >> 16;
				local249[local75] = local261 * local36 >> 16;
				local253[local75] = local263 * local36 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(28) int local28 = this.anInt1615 + this.anInt1615 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt1619 + this.anInt1619 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt1615; local53 <= this.anInt1615 + arg0; local53++) {
				@Pc(63) int[] local63 = this.method5958(local53 & Static67.anInt1514, 0);
				@Pc(66) int[] local66 = new int[Static66.anInt1511];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt1619; local72 <= this.anInt1619; local72++) {
					local68 += local63[Static393.anInt6315 & local72];
				}
				@Pc(93) int local93 = 0;
				while (Static66.anInt1511 > local93) {
					local66[local93] = local44 * local68 >> 16;
					local68 -= local63[Static393.anInt6315 & local93 - this.anInt1619];
					local93++;
					local68 += local63[local93 + this.anInt1619 & Static393.anInt6315];
				}
				local47[local53 + this.anInt1615 - arg0] = local66;
			}
			for (@Pc(149) int local149 = 0; local149 < Static66.anInt1511; local149++) {
				@Pc(153) int local153 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local153 += local47[local68][local149];
				}
				local16[local149] = local32 * local153 >> 16;
			}
		}
		return local16;
	}
}
