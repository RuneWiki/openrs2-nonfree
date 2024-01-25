import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class3_Sub2_Sub34 extends Class3_Sub2 {

	@OriginalMember(owner = "client!sia", name = "J", descriptor = "I")
	private int anInt9055 = 1;

	@OriginalMember(owner = "client!sia", name = "I", descriptor = "I")
	private int anInt9054 = 1;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(31) int local31 = this.anInt9055 + this.anInt9055 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt9054 + this.anInt9054 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(56) int local56 = arg0 - this.anInt9055; local56 <= arg0 + this.anInt9055; local56++) {
				@Pc(66) int[][] local66 = this.method8337(0, local56 & Static46.anInt1029);
				@Pc(70) int[][] local70 = new int[3][Static164.anInt8839];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt9054; local92 <= this.anInt9054; local92++) {
					@Pc(98) int local98 = local92 & Static52.anInt1120;
					local72 += local80[local98];
					local74 += local84[local98];
					local76 += local88[local98];
				}
				@Pc(125) int[] local125 = local70[0];
				@Pc(129) int[] local129 = local70[1];
				@Pc(133) int[] local133 = local70[2];
				@Pc(135) int local135 = 0;
				while (local135 < Static164.anInt8839) {
					local125[local135] = local47 * local72 >> 16;
					local129[local135] = local47 * local74 >> 16;
					local133[local135] = local47 * local76 >> 16;
					@Pc(168) int local168 = local135 - this.anInt9054 & Static52.anInt1120;
					local135++;
					local76 -= local88[local168];
					local72 -= local80[local168];
					local74 -= local84[local168];
					@Pc(194) int local194 = Static52.anInt1120 & this.anInt9054 + local135;
					local74 += local84[local194];
					local72 += local80[local194];
					local76 += local88[local194];
				}
				local50[local56 + this.anInt9055 - arg0] = local70;
			}
			@Pc(241) int[] local241 = local11[0];
			@Pc(245) int[] local245 = local11[1];
			@Pc(249) int[] local249 = local11[2];
			for (local74 = 0; local74 < Static164.anInt8839; local74++) {
				local76 = 0;
				@Pc(257) int local257 = 0;
				@Pc(259) int local259 = 0;
				for (@Pc(261) int local261 = 0; local261 < local31; local261++) {
					@Pc(267) int[][] local267 = local50[local261];
					local257 += local267[1][local74];
					local259 += local267[2][local74];
					local76 += local267[0][local74];
				}
				local241[local74] = local35 * local76 >> 16;
				local245[local74] = local257 * local35 >> 16;
				local249[local74] = local259 * local35 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9054 = arg1.method8401();
		} else if (arg0 == 1) {
			this.anInt9055 = arg1.method8401();
		} else if (arg0 == 2) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(32) int local32 = this.anInt9055 + this.anInt9055 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(45) int local45 = this.anInt9054 + this.anInt9054 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(52) int[][] local52 = new int[local32][];
			@Pc(73) int local73;
			for (@Pc(58) int local58 = arg0 - this.anInt9055; local58 <= this.anInt9055 + arg0; local58++) {
				@Pc(68) int[] local68 = this.method8340(Static46.anInt1029 & local58, 0);
				@Pc(71) int[] local71 = new int[Static164.anInt8839];
				local73 = 0;
				for (@Pc(77) int local77 = -this.anInt9054; local77 <= this.anInt9054; local77++) {
					local73 += local68[local77 & Static52.anInt1120];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static164.anInt8839) {
					local71[local94] = local73 * local49 >> 16;
					local73 -= local68[local94 - this.anInt9054 & Static52.anInt1120];
					local94++;
					local73 += local68[local94 + this.anInt9054 & Static52.anInt1120];
				}
				local52[local58 + this.anInt9055 - arg0] = local71;
			}
			for (@Pc(151) int local151 = 0; local151 < Static164.anInt8839; local151++) {
				@Pc(155) int local155 = 0;
				for (local73 = 0; local73 < local32; local73++) {
					local155 += local52[local73][local151];
				}
				local11[local151] = local155 * local36 >> 16;
			}
		}
		return local11;
	}
}
