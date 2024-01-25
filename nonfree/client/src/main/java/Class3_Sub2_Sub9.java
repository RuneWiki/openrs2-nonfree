import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
	private int anInt3657 = 1;

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
	private int anInt3654 = 1;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(28) int local28 = this.anInt3657 + this.anInt3657 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3654 + this.anInt3654 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt3657; local53 <= this.anInt3657 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method8718(0, local53 & Static622.anInt9680);
				@Pc(67) int[][] local67 = new int[3][Static30.anInt908];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt3654; local89 <= this.anInt3654; local89++) {
					@Pc(95) int local95 = Static241.anInt4556 & local89;
					local69 += local77[local95];
					local73 += local85[local95];
					local71 += local81[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static30.anInt908 > local132) {
					local122[local132] = local44 * local69 >> 16;
					local126[local132] = local44 * local71 >> 16;
					local130[local132] = local44 * local73 >> 16;
					@Pc(166) int local166 = Static241.anInt4556 & local132 - this.anInt3654;
					local73 -= local85[local166];
					local132++;
					local69 -= local77[local166];
					local71 -= local81[local166];
					@Pc(192) int local192 = this.anInt3654 + local132 & Static241.anInt4556;
					local73 += local85[local192];
					local71 += local81[local192];
					local69 += local77[local192];
				}
				local47[local53 + this.anInt3657 - arg0] = local67;
			}
			@Pc(242) int[] local242 = local16[0];
			@Pc(246) int[] local246 = local16[1];
			@Pc(250) int[] local250 = local16[2];
			for (local71 = 0; local71 < Static30.anInt908; local71++) {
				local73 = 0;
				@Pc(258) int local258 = 0;
				@Pc(260) int local260 = 0;
				for (@Pc(262) int local262 = 0; local262 < local28; local262++) {
					@Pc(268) int[][] local268 = local47[local262];
					local73 += local268[0][local71];
					local258 += local268[1][local71];
					local260 += local268[2][local71];
				}
				local242[local71] = local73 * local32 >> 16;
				local246[local71] = local32 * local258 >> 16;
				local250[local71] = local260 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(28) int local28 = this.anInt3657 + this.anInt3657 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3654 + this.anInt3654 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt3657; local53 <= this.anInt3657 + arg0; local53++) {
				@Pc(63) int[] local63 = this.method8716(0, local53 & Static622.anInt9680);
				@Pc(66) int[] local66 = new int[Static30.anInt908];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt3654; local72 <= this.anInt3654; local72++) {
					local68 += local63[Static241.anInt4556 & local72];
				}
				@Pc(89) int local89 = 0;
				while (local89 < Static30.anInt908) {
					local66[local89] = local44 * local68 >> 16;
					local68 -= local63[Static241.anInt4556 & local89 - this.anInt3654];
					local89++;
					local68 += local63[local89 + this.anInt3654 & Static241.anInt4556];
				}
				local47[local53 + this.anInt3657 - arg0] = local66;
			}
			for (@Pc(151) int local151 = 0; local151 < Static30.anInt908; local151++) {
				@Pc(155) int local155 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local155 += local47[local68][local151];
				}
				local16[local151] = local155 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3654 = arg0.method4888();
		} else if (arg1 == 1) {
			this.anInt3657 = arg0.method4888();
		} else if (arg1 == 2) {
			super.aBoolean761 = arg0.method4888() == 1;
		}
	}
}
