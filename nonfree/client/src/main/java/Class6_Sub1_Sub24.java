import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class6_Sub1_Sub24 extends Class6_Sub1 {

	@OriginalMember(owner = "client!od", name = "E", descriptor = "I")
	private int anInt7392 = 1;

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
	private int anInt7399 = 1;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(29) int local29 = this.anInt7392 + this.anInt7392 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt7399 + this.anInt7399 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(71) int local71;
			for (@Pc(54) int local54 = arg0 - this.anInt7392; local54 <= this.anInt7392 + arg0; local54++) {
				@Pc(66) int[] local66 = this.method8731(local54 & Static117.anInt3013, 0);
				@Pc(69) int[] local69 = new int[Static53.anInt1787];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt7399; local75 <= this.anInt7399; local75++) {
					local71 += local66[Static564.anInt9697 & local75];
				}
				@Pc(96) int local96 = 0;
				while (local96 < Static53.anInt1787) {
					local69[local96] = local71 * local45 >> 16;
					local71 -= local66[Static564.anInt9697 & local96 - this.anInt7399];
					local96++;
					local71 += local66[Static564.anInt9697 & local96 + this.anInt7399];
				}
				local48[local54 + this.anInt7392 - arg0] = local69;
			}
			for (@Pc(157) int local157 = 0; local157 < Static53.anInt1787; local157++) {
				@Pc(161) int local161 = 0;
				for (local71 = 0; local71 < local29; local71++) {
					local161 += local48[local71][local157];
				}
				local11[local157] = local33 * local161 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7399 = arg1.method8246();
		} else if (arg0 == 1) {
			this.anInt7392 = arg1.method8246();
		} else if (arg0 == 2) {
			super.aBoolean842 = arg1.method8246() == 1;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(28) int local28 = this.anInt7392 + this.anInt7392 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt7399 + this.anInt7399 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt7392; local53 <= arg0 + this.anInt7392; local53++) {
				@Pc(63) int[][] local63 = this.method8725(local53 & Static117.anInt3013, 0);
				@Pc(67) int[][] local67 = new int[3][Static53.anInt1787];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt7399; local89 <= this.anInt7399; local89++) {
					@Pc(95) int local95 = Static564.anInt9697 & local89;
					local69 += local77[local95];
					local71 += local81[local95];
					local73 += local85[local95];
				}
				@Pc(126) int[] local126 = local67[0];
				@Pc(130) int[] local130 = local67[1];
				@Pc(134) int[] local134 = local67[2];
				@Pc(136) int local136 = 0;
				while (Static53.anInt1787 > local136) {
					local126[local136] = local44 * local69 >> 16;
					local130[local136] = local44 * local71 >> 16;
					local134[local136] = local44 * local73 >> 16;
					@Pc(170) int local170 = Static564.anInt9697 & local136 - this.anInt7399;
					local71 -= local81[local170];
					local73 -= local85[local170];
					local69 -= local77[local170];
					local136++;
					@Pc(197) int local197 = Static564.anInt9697 & local136 + this.anInt7399;
					local69 += local77[local197];
					local73 += local85[local197];
					local71 += local81[local197];
				}
				local47[local53 + this.anInt7392 - arg0] = local67;
			}
			@Pc(245) int[] local245 = local16[0];
			@Pc(249) int[] local249 = local16[1];
			@Pc(253) int[] local253 = local16[2];
			for (local71 = 0; local71 < Static53.anInt1787; local71++) {
				local73 = 0;
				@Pc(261) int local261 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local28; local265++) {
					@Pc(271) int[][] local271 = local47[local265];
					local263 += local271[2][local71];
					local261 += local271[1][local71];
					local73 += local271[0][local71];
				}
				local245[local71] = local73 * local32 >> 16;
				local249[local71] = local261 * local32 >> 16;
				local253[local71] = local32 * local263 >> 16;
			}
		}
		return local16;
	}
}
