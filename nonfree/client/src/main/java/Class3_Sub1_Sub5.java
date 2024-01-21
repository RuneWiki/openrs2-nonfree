import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!db", name = "V", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
	private int anInt730;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt727 = arg1.method191();
		} else if (arg0 == 1) {
			this.anInt730 = arg1.method191();
		} else if (arg0 == 2) {
			super.aBoolean171 = arg1.method191() == 1;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(23) int local23 = this.anInt730 + this.anInt730 + 1;
			@Pc(31) int local31 = this.anInt727 + this.anInt727 + 1;
			@Pc(34) int[][] local34 = new int[local23][];
			@Pc(55) int local55;
			for (@Pc(40) int local40 = arg0 - this.anInt730; local40 <= arg0 + this.anInt730; local40++) {
				@Pc(50) int[] local50 = this.method2904(0, Static169.anInt3754 & local40);
				@Pc(53) int[] local53 = new int[Static141.anInt3261];
				local55 = 0;
				for (@Pc(59) int local59 = -this.anInt727; local59 <= this.anInt727; local59++) {
					local55 += local50[local59 & Static67.anInt1764];
				}
				@Pc(80) int local80 = 0;
				while (local80 < Static141.anInt3261) {
					local53[local80] = local55 / local31;
					local55 -= local50[local80 - this.anInt727 & Static67.anInt1764];
					local80++;
					local55 += local50[Static67.anInt1764 & this.anInt727 + local80];
				}
				local34[local40 + this.anInt730 - arg0] = local53;
			}
			for (@Pc(142) int local142 = 0; local142 < Static141.anInt3261; local142++) {
				@Pc(146) int local146 = 0;
				for (local55 = 0; local55 < local23; local55++) {
					local146 += local34[local55][local142];
				}
				local11[local142] = local146 / local23;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(31) int local31 = this.anInt730 + this.anInt730 + 1;
			@Pc(34) int[][][] local34 = new int[local31][][];
			@Pc(43) int local43 = this.anInt727 + this.anInt727 + 1;
			@Pc(65) int local65;
			@Pc(69) int local69;
			for (@Pc(49) int local49 = arg0 - this.anInt730; local49 <= arg0 + this.anInt730; local49++) {
				@Pc(59) int[][] local59 = this.method2913(Static169.anInt3754 & local49, 0);
				@Pc(63) int[][] local63 = new int[3][Static141.anInt3261];
				local65 = 0;
				@Pc(67) int local67 = 0;
				local69 = 0;
				@Pc(73) int[] local73 = local59[0];
				@Pc(77) int[] local77 = local59[2];
				@Pc(81) int[] local81 = local59[1];
				for (@Pc(85) int local85 = -this.anInt727; local85 <= this.anInt727; local85++) {
					@Pc(91) int local91 = local85 & Static67.anInt1764;
					local67 += local73[local91];
					local69 += local77[local91];
					local65 += local81[local91];
				}
				@Pc(118) int[] local118 = local63[0];
				@Pc(122) int[] local122 = local63[1];
				@Pc(126) int[] local126 = local63[2];
				@Pc(128) int local128 = 0;
				while (local128 < Static141.anInt3261) {
					local118[local128] = local67 / local43;
					local122[local128] = local65 / local43;
					local126[local128] = local69 / local43;
					@Pc(155) int local155 = Static67.anInt1764 & local128 - this.anInt727;
					local69 -= local77[local155];
					local67 -= local73[local155];
					local65 -= local81[local155];
					local128++;
					@Pc(181) int local181 = local128 + this.anInt727 & Static67.anInt1764;
					local67 += local73[local181];
					local65 += local81[local181];
					local69 += local77[local181];
				}
				local34[this.anInt730 + local49 - arg0] = local63;
			}
			@Pc(228) int[] local228 = local11[0];
			@Pc(232) int[] local232 = local11[2];
			@Pc(236) int[] local236 = local11[1];
			for (local65 = 0; local65 < Static141.anInt3261; local65++) {
				@Pc(242) int local242 = 0;
				local69 = 0;
				@Pc(246) int local246 = 0;
				for (@Pc(248) int local248 = 0; local248 < local31; local248++) {
					@Pc(254) int[][] local254 = local34[local248];
					local246 += local254[2][local65];
					local242 += local254[1][local65];
					local69 += local254[0][local65];
				}
				local228[local65] = local69 / local31;
				local236[local65] = local242 / local31;
				local232[local65] = local246 / local31;
			}
		}
		return local11;
	}
}
