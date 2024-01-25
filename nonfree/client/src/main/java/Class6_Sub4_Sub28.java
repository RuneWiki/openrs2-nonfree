import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class6_Sub4_Sub28 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
	private int anInt7391 = 1;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
	private int anInt7392 = 1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt7392 = arg1.method8604();
		} else if (arg0 == 1) {
			this.anInt7391 = arg1.method8604();
		} else if (arg0 == 2) {
			super.aBoolean674 = arg1.method8604() == 1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(29) int local29 = this.anInt7391 + this.anInt7391 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt7392 + this.anInt7392 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][][] local49 = new int[local29][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(55) int local55 = arg0 - this.anInt7391; local55 <= arg0 + this.anInt7391; local55++) {
				@Pc(65) int[][] local65 = this.method8319(0, Static2.anInt12 & local55);
				@Pc(69) int[][] local69 = new int[3][Static6.anInt111];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] local79 = local65[0];
				@Pc(83) int[] local83 = local65[1];
				@Pc(87) int[] local87 = local65[2];
				for (@Pc(91) int local91 = -this.anInt7392; local91 <= this.anInt7392; local91++) {
					@Pc(97) int local97 = Static325.anInt6209 & local91;
					local71 += local79[local97];
					local75 += local87[local97];
					local73 += local83[local97];
				}
				@Pc(128) int[] local128 = local69[0];
				@Pc(132) int[] local132 = local69[1];
				@Pc(136) int[] local136 = local69[2];
				@Pc(138) int local138 = 0;
				while (Static6.anInt111 > local138) {
					local128[local138] = local46 * local71 >> 16;
					local132[local138] = local46 * local73 >> 16;
					local136[local138] = local75 * local46 >> 16;
					@Pc(172) int local172 = local138 - this.anInt7392 & Static325.anInt6209;
					local73 -= local83[local172];
					local138++;
					local71 -= local79[local172];
					local75 -= local87[local172];
					@Pc(198) int local198 = Static325.anInt6209 & local138 + this.anInt7392;
					local71 += local79[local198];
					local75 += local87[local198];
					local73 += local83[local198];
				}
				local49[this.anInt7391 + local55 - arg0] = local69;
			}
			@Pc(240) int[] local240 = local17[0];
			@Pc(244) int[] local244 = local17[1];
			@Pc(248) int[] local248 = local17[2];
			for (local73 = 0; local73 < Static6.anInt111; local73++) {
				local75 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local29; local260++) {
					@Pc(266) int[][] local266 = local49[local260];
					local258 += local266[2][local73];
					local256 += local266[1][local73];
					local75 += local266[0][local73];
				}
				local240[local73] = local33 * local75 >> 16;
				local244[local73] = local33 * local256 >> 16;
				local248[local73] = local258 * local33 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(29) int local29 = this.anInt7391 + this.anInt7391 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt7392 + this.anInt7392 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt7391; local53 <= arg0 + this.anInt7391; local53++) {
				@Pc(63) int[] local63 = this.method8313(local53 & Static2.anInt12, 0);
				@Pc(66) int[] local66 = new int[Static6.anInt111];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt7392; local72 <= this.anInt7392; local72++) {
					local68 += local63[local72 & Static325.anInt6209];
				}
				@Pc(93) int local93 = 0;
				while (local93 < Static6.anInt111) {
					local66[local93] = local45 * local68 >> 16;
					local68 -= local63[Static325.anInt6209 & local93 - this.anInt7392];
					local93++;
					local68 += local63[Static325.anInt6209 & local93 + this.anInt7392];
				}
				local48[this.anInt7391 + local53 - arg0] = local66;
			}
			for (@Pc(151) int local151 = 0; local151 < Static6.anInt111; local151++) {
				@Pc(155) int local155 = 0;
				for (local68 = 0; local68 < local29; local68++) {
					local155 += local48[local68][local151];
				}
				local11[local151] = local33 * local155 >> 16;
			}
		}
		return local11;
	}
}
