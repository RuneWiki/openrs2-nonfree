import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class3_Sub1_Sub33 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rp", name = "N", descriptor = "I")
	private int anInt7554 = 1;

	@OriginalMember(owner = "client!rp", name = "R", descriptor = "I")
	private int anInt7558 = 1;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(28) int local28 = this.anInt7554 + this.anInt7554 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt7558 + this.anInt7558 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt7554; local53 <= this.anInt7554 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method7766(0, local53 & Static469.anInt7679);
				@Pc(67) int[][] local67 = new int[3][Static206.anInt4182];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt7558; local89 <= this.anInt7558; local89++) {
					@Pc(95) int local95 = Static439.anInt7283 & local89;
					local69 += local77[local95];
					local71 += local81[local95];
					local73 += local85[local95];
				}
				@Pc(126) int[] local126 = local67[0];
				@Pc(130) int[] local130 = local67[1];
				@Pc(134) int[] local134 = local67[2];
				@Pc(136) int local136 = 0;
				while (Static206.anInt4182 > local136) {
					local126[local136] = local69 * local44 >> 16;
					local130[local136] = local44 * local71 >> 16;
					local134[local136] = local73 * local44 >> 16;
					@Pc(170) int local170 = local136 - this.anInt7558 & Static439.anInt7283;
					local73 -= local85[local170];
					local136++;
					local69 -= local77[local170];
					local71 -= local81[local170];
					@Pc(196) int local196 = this.anInt7558 + local136 & Static439.anInt7283;
					local69 += local77[local196];
					local73 += local85[local196];
					local71 += local81[local196];
				}
				local47[this.anInt7554 + local53 - arg0] = local67;
			}
			@Pc(242) int[] local242 = local16[0];
			@Pc(246) int[] local246 = local16[1];
			@Pc(250) int[] local250 = local16[2];
			for (local71 = 0; local71 < Static206.anInt4182; local71++) {
				local73 = 0;
				@Pc(258) int local258 = 0;
				@Pc(260) int local260 = 0;
				for (@Pc(262) int local262 = 0; local262 < local28; local262++) {
					@Pc(268) int[][] local268 = local47[local262];
					local73 += local268[0][local71];
					local258 += local268[1][local71];
					local260 += local268[2][local71];
				}
				local242[local71] = local32 * local73 >> 16;
				local246[local71] = local258 * local32 >> 16;
				local250[local71] = local32 * local260 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(23) int local23 = this.anInt7554 + this.anInt7554 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt7558 + this.anInt7558 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt7554; local48 <= this.anInt7554 + arg0; local48++) {
				@Pc(58) int[] local58 = this.method7765(0, Static469.anInt7679 & local48);
				@Pc(61) int[] local61 = new int[Static206.anInt4182];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt7558; local67 <= this.anInt7558; local67++) {
					local63 += local58[Static439.anInt7283 & local67];
				}
				@Pc(88) int local88 = 0;
				while (local88 < Static206.anInt4182) {
					local61[local88] = local63 * local39 >> 16;
					local63 -= local58[Static439.anInt7283 & local88 - this.anInt7558];
					local88++;
					local63 += local58[Static439.anInt7283 & local88 + this.anInt7558];
				}
				local42[this.anInt7554 + local48 - arg0] = local61;
			}
			for (@Pc(152) int local152 = 0; local152 < Static206.anInt4182; local152++) {
				@Pc(156) int local156 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local156 += local42[local63][local152];
				}
				local11[local152] = local156 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7558 = arg0.method3118();
		} else if (arg1 == 1) {
			this.anInt7554 = arg0.method3118();
		} else if (arg1 == 2) {
			super.aBoolean728 = arg0.method3118() == 1;
		}
	}
}
