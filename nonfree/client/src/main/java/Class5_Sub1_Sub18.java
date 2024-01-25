import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class5_Sub1_Sub18 extends Class5_Sub1 {

	@OriginalMember(owner = "client!je", name = "P", descriptor = "I")
	private int anInt3221 = 1;

	@OriginalMember(owner = "client!je", name = "G", descriptor = "I")
	private int anInt3214 = 1;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(28) int local28 = this.anInt3214 + this.anInt3214 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3221 + this.anInt3221 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(70) int local70;
			@Pc(72) int local72;
			for (@Pc(52) int local52 = arg0 - this.anInt3214; local52 <= this.anInt3214 + arg0; local52++) {
				@Pc(62) int[][] local62 = this.method5764(0, local52 & Static157.anInt2733);
				@Pc(66) int[][] local66 = new int[3][Static148.anInt2666];
				@Pc(68) int local68 = 0;
				local70 = 0;
				local72 = 0;
				@Pc(76) int[] local76 = local62[0];
				@Pc(80) int[] local80 = local62[1];
				@Pc(84) int[] local84 = local62[2];
				for (@Pc(88) int local88 = -this.anInt3221; local88 <= this.anInt3221; local88++) {
					@Pc(94) int local94 = Static273.anInt4299 & local88;
					local72 += local84[local94];
					local68 += local76[local94];
					local70 += local80[local94];
				}
				@Pc(125) int[] local125 = local66[0];
				@Pc(129) int[] local129 = local66[1];
				@Pc(133) int[] local133 = local66[2];
				@Pc(135) int local135 = 0;
				while (Static148.anInt2666 > local135) {
					local125[local135] = local44 * local68 >> 16;
					local129[local135] = local44 * local70 >> 16;
					local133[local135] = local72 * local44 >> 16;
					@Pc(169) int local169 = Static273.anInt4299 & local135 - this.anInt3221;
					local72 -= local84[local169];
					local70 -= local80[local169];
					local135++;
					local68 -= local76[local169];
					@Pc(195) int local195 = Static273.anInt4299 & this.anInt3221 + local135;
					local72 += local84[local195];
					local70 += local80[local195];
					local68 += local76[local195];
				}
				local47[this.anInt3214 + local52 - arg0] = local66;
			}
			@Pc(241) int[] local241 = local16[0];
			@Pc(245) int[] local245 = local16[1];
			@Pc(249) int[] local249 = local16[2];
			for (local70 = 0; local70 < Static148.anInt2666; local70++) {
				local72 = 0;
				@Pc(257) int local257 = 0;
				@Pc(259) int local259 = 0;
				for (@Pc(261) int local261 = 0; local261 < local28; local261++) {
					@Pc(267) int[][] local267 = local47[local261];
					local259 += local267[2][local70];
					local257 += local267[1][local70];
					local72 += local267[0][local70];
				}
				local241[local70] = local32 * local72 >> 16;
				local245[local70] = local257 * local32 >> 16;
				local249[local70] = local32 * local259 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(33) int local33 = this.anInt3214 + this.anInt3214 + 1;
			@Pc(37) int local37 = 65536 / local33;
			@Pc(45) int local45 = this.anInt3221 + this.anInt3221 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(52) int[][] local52 = new int[local33][];
			@Pc(73) int local73;
			for (@Pc(58) int local58 = arg0 - this.anInt3214; local58 <= arg0 + this.anInt3214; local58++) {
				@Pc(68) int[] local68 = this.method5772(0, local58 & Static157.anInt2733);
				@Pc(71) int[] local71 = new int[Static148.anInt2666];
				local73 = 0;
				for (@Pc(77) int local77 = -this.anInt3221; local77 <= this.anInt3221; local77++) {
					local73 += local68[local77 & Static273.anInt4299];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static148.anInt2666) {
					local71[local94] = local49 * local73 >> 16;
					local73 -= local68[Static273.anInt4299 & local94 - this.anInt3221];
					local94++;
					local73 += local68[local94 + this.anInt3221 & Static273.anInt4299];
				}
				local52[local58 + this.anInt3214 - arg0] = local71;
			}
			for (@Pc(155) int local155 = 0; local155 < Static148.anInt2666; local155++) {
				@Pc(159) int local159 = 0;
				for (local73 = 0; local73 < local33; local73++) {
					local159 += local52[local73][local155];
				}
				local21[local155] = local37 * local159 >> 16;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3221 = arg1.method5539();
		} else if (arg0 == 1) {
			this.anInt3214 = arg1.method5539();
		} else if (arg0 == 2) {
			super.aBoolean486 = arg1.method5539() == 1;
		}
	}
}
