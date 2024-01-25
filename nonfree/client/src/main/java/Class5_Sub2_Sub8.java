import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public final class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dha", name = "J", descriptor = "I")
	private int anInt2308 = 1;

	@OriginalMember(owner = "client!dha", name = "I", descriptor = "I")
	private int anInt2307 = 1;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(29) int local29 = this.anInt2307 + this.anInt2307 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt2308 + this.anInt2308 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][][] local49 = new int[local29][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(55) int local55 = arg0 - this.anInt2307; local55 <= this.anInt2307 + arg0; local55++) {
				@Pc(65) int[][] local65 = this.method8952(0, local55 & Static115.anInt2379);
				@Pc(69) int[][] local69 = new int[3][Static195.anInt3759];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] local79 = local65[0];
				@Pc(83) int[] local83 = local65[1];
				@Pc(87) int[] local87 = local65[2];
				for (@Pc(91) int local91 = -this.anInt2308; local91 <= this.anInt2308; local91++) {
					@Pc(97) int local97 = local91 & Static388.anInt6925;
					local73 += local83[local97];
					local75 += local87[local97];
					local71 += local79[local97];
				}
				@Pc(128) int[] local128 = local69[0];
				@Pc(132) int[] local132 = local69[1];
				@Pc(136) int[] local136 = local69[2];
				@Pc(138) int local138 = 0;
				while (local138 < Static195.anInt3759) {
					local128[local138] = local46 * local71 >> 16;
					local132[local138] = local73 * local46 >> 16;
					local136[local138] = local75 * local46 >> 16;
					@Pc(171) int local171 = Static388.anInt6925 & local138 - this.anInt2308;
					local138++;
					local73 -= local83[local171];
					local71 -= local79[local171];
					local75 -= local87[local171];
					@Pc(198) int local198 = Static388.anInt6925 & local138 + this.anInt2308;
					local71 += local79[local198];
					local75 += local87[local198];
					local73 += local83[local198];
				}
				local49[local55 + this.anInt2307 - arg0] = local69;
			}
			@Pc(240) int[] local240 = local16[0];
			@Pc(244) int[] local244 = local16[1];
			@Pc(248) int[] local248 = local16[2];
			for (local73 = 0; local73 < Static195.anInt3759; local73++) {
				local75 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local29; local260++) {
					@Pc(266) int[][] local266 = local49[local260];
					local75 += local266[0][local73];
					local256 += local266[1][local73];
					local258 += local266[2][local73];
				}
				local240[local73] = local75 * local33 >> 16;
				local244[local73] = local33 * local256 >> 16;
				local248[local73] = local258 * local33 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2308 = arg0.method7816();
		} else if (arg1 == 1) {
			this.anInt2307 = arg0.method7816();
		} else if (arg1 == 2) {
			super.aBoolean910 = arg0.method7816() == 1;
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(28) int local28 = this.anInt2307 + this.anInt2307 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt2308 + this.anInt2308 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local28][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt2307; local54 <= this.anInt2307 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method8945(Static115.anInt2379 & local54, 0);
				@Pc(67) int[] local67 = new int[Static195.anInt3759];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt2308; local73 <= this.anInt2308; local73++) {
					local69 += local64[local73 & Static388.anInt6925];
				}
				@Pc(90) int local90 = 0;
				while (local90 < Static195.anInt3759) {
					local67[local90] = local69 * local45 >> 16;
					local69 -= local64[local90 - this.anInt2308 & Static388.anInt6925];
					local90++;
					local69 += local64[local90 + this.anInt2308 & Static388.anInt6925];
				}
				local48[this.anInt2307 + local54 - arg0] = local67;
			}
			for (@Pc(149) int local149 = 0; local149 < Static195.anInt3759; local149++) {
				@Pc(153) int local153 = 0;
				for (local69 = 0; local69 < local28; local69++) {
					local153 += local48[local69][local149];
				}
				local16[local149] = local153 * local32 >> 16;
			}
		}
		return local16;
	}
}
