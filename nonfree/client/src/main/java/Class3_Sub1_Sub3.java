import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
	private int anInt1041 = 1;

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
	private int anInt1044 = 1;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(28) int local28 = this.anInt1041 + this.anInt1041 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt1044 + this.anInt1044 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt1041; local53 <= this.anInt1041 + arg0; local53++) {
				@Pc(63) int[] local63 = this.method7778(0, Static485.anInt8693 & local53);
				@Pc(66) int[] local66 = new int[Static307.anInt4846];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt1044; local72 <= this.anInt1044; local72++) {
					local68 += local63[Static324.anInt6207 & local72];
				}
				@Pc(89) int local89 = 0;
				while (local89 < Static307.anInt4846) {
					local66[local89] = local44 * local68 >> 16;
					local68 -= local63[Static324.anInt6207 & local89 - this.anInt1044];
					local89++;
					local68 += local63[Static324.anInt6207 & this.anInt1044 + local89];
				}
				local47[local53 + this.anInt1041 - arg0] = local66;
			}
			for (@Pc(153) int local153 = 0; local153 < Static307.anInt4846; local153++) {
				@Pc(157) int local157 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local157 += local47[local68][local153];
				}
				local16[local153] = local32 * local157 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt1044 = arg1.method7548();
		} else if (arg0 == 1) {
			this.anInt1041 = arg1.method7548();
		} else if (arg0 == 2) {
			super.aBoolean687 = arg1.method7548() == 1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(31) int local31 = this.anInt1041 + this.anInt1041 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt1044 + this.anInt1044 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(56) int local56 = arg0 - this.anInt1041; local56 <= arg0 + this.anInt1041; local56++) {
				@Pc(66) int[][] local66 = this.method7779(0, local56 & Static485.anInt8693);
				@Pc(70) int[][] local70 = new int[3][Static307.anInt4846];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt1044; local92 <= this.anInt1044; local92++) {
					@Pc(98) int local98 = Static324.anInt6207 & local92;
					local74 += local84[local98];
					local72 += local80[local98];
					local76 += local88[local98];
				}
				@Pc(125) int[] local125 = local70[0];
				@Pc(129) int[] local129 = local70[1];
				@Pc(133) int[] local133 = local70[2];
				@Pc(135) int local135 = 0;
				while (local135 < Static307.anInt4846) {
					local125[local135] = local72 * local47 >> 16;
					local129[local135] = local74 * local47 >> 16;
					local133[local135] = local47 * local76 >> 16;
					@Pc(168) int local168 = Static324.anInt6207 & local135 - this.anInt1044;
					local76 -= local88[local168];
					local72 -= local80[local168];
					local74 -= local84[local168];
					local135++;
					@Pc(194) int local194 = Static324.anInt6207 & this.anInt1044 + local135;
					local76 += local88[local194];
					local72 += local80[local194];
					local74 += local84[local194];
				}
				local50[this.anInt1041 + local56 - arg0] = local70;
			}
			@Pc(240) int[] local240 = local11[0];
			@Pc(244) int[] local244 = local11[1];
			@Pc(248) int[] local248 = local11[2];
			for (local74 = 0; local74 < Static307.anInt4846; local74++) {
				local76 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local31; local260++) {
					@Pc(266) int[][] local266 = local50[local260];
					local256 += local266[1][local74];
					local76 += local266[0][local74];
					local258 += local266[2][local74];
				}
				local240[local74] = local76 * local35 >> 16;
				local244[local74] = local35 * local256 >> 16;
				local248[local74] = local35 * local258 >> 16;
			}
		}
		return local11;
	}
}
