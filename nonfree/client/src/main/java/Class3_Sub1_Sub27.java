import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class3_Sub1_Sub27 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
	private int anInt8567 = 1;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
	private int anInt8566 = 1;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(32) int local32 = this.anInt8567 + this.anInt8567 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt8566 + this.anInt8566 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local32][][];
			@Pc(77) int local77;
			@Pc(79) int local79;
			for (@Pc(57) int local57 = arg0 - this.anInt8567; local57 <= this.anInt8567 + arg0; local57++) {
				@Pc(69) int[][] local69 = this.method9576(Static652.anInt2344 & local57, 0);
				@Pc(73) int[][] local73 = new int[3][Static379.anInt5859];
				@Pc(75) int local75 = 0;
				local77 = 0;
				local79 = 0;
				@Pc(83) int[] local83 = local69[0];
				@Pc(87) int[] local87 = local69[1];
				@Pc(91) int[] local91 = local69[2];
				for (@Pc(95) int local95 = -this.anInt8566; local95 <= this.anInt8566; local95++) {
					@Pc(103) int local103 = local95 & Static711.anInt10997;
					local77 += local87[local103];
					local79 += local91[local103];
					local75 += local83[local103];
				}
				@Pc(130) int[] local130 = local73[0];
				@Pc(134) int[] local134 = local73[1];
				@Pc(138) int[] local138 = local73[2];
				@Pc(142) int local142 = 0;
				while (Static379.anInt5859 > local142) {
					local130[local142] = local75 * local48 >> 16;
					local134[local142] = local48 * local77 >> 16;
					local138[local142] = local48 * local79 >> 16;
					@Pc(177) int local177 = Static711.anInt10997 & local142 - this.anInt8566;
					local77 -= local87[local177];
					local142++;
					local79 -= local91[local177];
					local75 -= local83[local177];
					@Pc(204) int local204 = Static711.anInt10997 & local142 + this.anInt8566;
					local75 += local83[local204];
					local77 += local87[local204];
					local79 += local91[local204];
				}
				local51[this.anInt8567 + local57 - arg0] = local73;
			}
			@Pc(254) int[] local254 = local13[0];
			@Pc(258) int[] local258 = local13[1];
			@Pc(264) int[] local264 = local13[2];
			for (local77 = 0; local77 < Static379.anInt5859; local77++) {
				local79 = 0;
				@Pc(272) int local272 = 0;
				@Pc(274) int local274 = 0;
				for (@Pc(276) int local276 = 0; local276 < local32; local276++) {
					@Pc(282) int[][] local282 = local51[local276];
					local274 += local282[2][local77];
					local79 += local282[0][local77];
					local272 += local282[1][local77];
				}
				local254[local77] = local79 * local36 >> 16;
				local258[local77] = local36 * local272 >> 16;
				local264[local77] = local274 * local36 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt8566 = arg1.method2048(255);
		} else if (arg0 == 1) {
			this.anInt8567 = arg1.method2048(255);
		} else if (arg0 == 2) {
			super.aBoolean773 = arg1.method2048(255) == 1;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(29) int local29 = this.anInt8567 + this.anInt8567 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt8566 + this.anInt8566 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt8567; local53 <= arg0 + this.anInt8567; local53++) {
				@Pc(63) int[] local63 = this.method9577(0, Static652.anInt2344 & local53);
				@Pc(66) int[] local66 = new int[Static379.anInt5859];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt8566; local72 <= this.anInt8566; local72++) {
					local68 += local63[local72 & Static711.anInt10997];
				}
				@Pc(93) int local93 = 0;
				while (Static379.anInt5859 > local93) {
					local66[local93] = local45 * local68 >> 16;
					local68 -= local63[Static711.anInt10997 & local93 - this.anInt8566];
					local93++;
					local68 += local63[Static711.anInt10997 & local93 + this.anInt8566];
				}
				local48[this.anInt8567 + local53 - arg0] = local66;
			}
			for (@Pc(154) int local154 = 0; local154 < Static379.anInt5859; local154++) {
				@Pc(158) int local158 = 0;
				for (local68 = 0; local68 < local29; local68++) {
					local158 += local48[local68][local154];
				}
				local11[local154] = local158 * local33 >> 16;
			}
		}
		return local11;
	}
}
