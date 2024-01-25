import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class4_Sub4_Sub4 extends Class4_Sub4 {

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
	private int anInt723 = 1;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
	private int anInt726 = 1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(24) int local24 = this.anInt723 + this.anInt723 + 1;
			@Pc(28) int local28 = 65536 / local24;
			@Pc(36) int local36 = this.anInt726 + this.anInt726 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][][] local43 = new int[local24][][];
			@Pc(67) int local67;
			@Pc(69) int local69;
			for (@Pc(49) int local49 = arg0 - this.anInt723; local49 <= arg0 + this.anInt723; local49++) {
				@Pc(59) int[][] local59 = this.method6049(local49 & Static204.anInt3610, 0);
				@Pc(63) int[][] local63 = new int[3][Static419.anInt6404];
				@Pc(65) int local65 = 0;
				local67 = 0;
				local69 = 0;
				@Pc(73) int[] local73 = local59[0];
				@Pc(77) int[] local77 = local59[1];
				@Pc(81) int[] local81 = local59[2];
				for (@Pc(85) int local85 = -this.anInt726; local85 <= this.anInt726; local85++) {
					@Pc(91) int local91 = Static211.anInt3669 & local85;
					local69 += local81[local91];
					local67 += local77[local91];
					local65 += local73[local91];
				}
				@Pc(122) int[] local122 = local63[0];
				@Pc(126) int[] local126 = local63[1];
				@Pc(130) int[] local130 = local63[2];
				@Pc(132) int local132 = 0;
				while (local132 < Static419.anInt6404) {
					local122[local132] = local65 * local40 >> 16;
					local126[local132] = local40 * local67 >> 16;
					local130[local132] = local40 * local69 >> 16;
					@Pc(166) int local166 = Static211.anInt3669 & local132 - this.anInt726;
					local67 -= local77[local166];
					local132++;
					local69 -= local81[local166];
					local65 -= local73[local166];
					@Pc(192) int local192 = local132 + this.anInt726 & Static211.anInt3669;
					local65 += local73[local192];
					local67 += local77[local192];
					local69 += local81[local192];
				}
				local43[local49 + this.anInt723 - arg0] = local63;
			}
			@Pc(234) int[] local234 = local11[0];
			@Pc(238) int[] local238 = local11[1];
			@Pc(242) int[] local242 = local11[2];
			for (local67 = 0; local67 < Static419.anInt6404; local67++) {
				local69 = 0;
				@Pc(250) int local250 = 0;
				@Pc(252) int local252 = 0;
				for (@Pc(254) int local254 = 0; local254 < local24; local254++) {
					@Pc(260) int[][] local260 = local43[local254];
					local252 += local260[2][local67];
					local69 += local260[0][local67];
					local250 += local260[1][local67];
				}
				local234[local67] = local28 * local69 >> 16;
				local238[local67] = local250 * local28 >> 16;
				local242[local67] = local28 * local252 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt726 = arg1.method5007();
		} else if (arg0 == 1) {
			this.anInt723 = arg1.method5007();
		} else if (arg0 == 2) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(29) int local29 = this.anInt723 + this.anInt723 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt726 + this.anInt726 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt723; local54 <= this.anInt723 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method6040(local54 & Static204.anInt3610, 0);
				@Pc(67) int[] local67 = new int[Static419.anInt6404];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt726; local73 <= this.anInt726; local73++) {
					local69 += local64[Static211.anInt3669 & local73];
				}
				@Pc(90) int local90 = 0;
				while (Static419.anInt6404 > local90) {
					local67[local90] = local69 * local45 >> 16;
					local69 -= local64[local90 - this.anInt726 & Static211.anInt3669];
					local90++;
					local69 += local64[this.anInt726 + local90 & Static211.anInt3669];
				}
				local48[local54 + this.anInt723 - arg0] = local67;
			}
			for (@Pc(155) int local155 = 0; local155 < Static419.anInt6404; local155++) {
				@Pc(159) int local159 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local159 += local48[local69][local155];
				}
				local17[local155] = local33 * local159 >> 16;
			}
		}
		return local17;
	}
}
