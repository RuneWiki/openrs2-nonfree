import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class5_Sub2_Sub14 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
	private int anInt2461 = 1;

	@OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
	private int anInt2460 = 1;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(25) int local25 = this.anInt2461 + this.anInt2461 + 1;
			@Pc(29) int local29 = 65536 / local25;
			@Pc(37) int local37 = this.anInt2460 + this.anInt2460 + 1;
			@Pc(41) int local41 = 65536 / local37;
			@Pc(44) int[][] local44 = new int[local25][];
			@Pc(65) int local65;
			for (@Pc(50) int local50 = arg0 - this.anInt2461; local50 <= arg0 + this.anInt2461; local50++) {
				@Pc(60) int[] local60 = this.method5808(0, Static19.anInt547 & local50);
				@Pc(63) int[] local63 = new int[Static15.anInt493];
				local65 = 0;
				for (@Pc(69) int local69 = -this.anInt2460; local69 <= this.anInt2460; local69++) {
					local65 += local60[local69 & Static317.anInt6151];
				}
				@Pc(90) int local90 = 0;
				while (local90 < Static15.anInt493) {
					local63[local90] = local65 * local41 >> 16;
					local65 -= local60[local90 - this.anInt2460 & Static317.anInt6151];
					local90++;
					local65 += local60[this.anInt2460 + local90 & Static317.anInt6151];
				}
				local44[local50 + this.anInt2461 - arg0] = local63;
			}
			for (@Pc(149) int local149 = 0; local149 < Static15.anInt493; local149++) {
				@Pc(153) int local153 = 0;
				for (local65 = 0; local65 < local25; local65++) {
					local153 += local44[local65][local149];
				}
				local13[local149] = local29 * local153 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2460 = arg0.method1832();
		} else if (arg1 == 1) {
			this.anInt2461 = arg0.method1832();
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method1832() == 1;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(24) int local24 = this.anInt2461 + this.anInt2461 + 1;
			@Pc(28) int local28 = 65536 / local24;
			@Pc(36) int local36 = this.anInt2460 + this.anInt2460 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][][] local43 = new int[local24][][];
			@Pc(67) int local67;
			@Pc(69) int local69;
			for (@Pc(49) int local49 = arg0 - this.anInt2461; local49 <= this.anInt2461 + arg0; local49++) {
				@Pc(59) int[][] local59 = this.method5818(local49 & Static19.anInt547, 0);
				@Pc(63) int[][] local63 = new int[3][Static15.anInt493];
				@Pc(65) int local65 = 0;
				local67 = 0;
				local69 = 0;
				@Pc(73) int[] local73 = local59[0];
				@Pc(77) int[] local77 = local59[1];
				@Pc(81) int[] local81 = local59[2];
				for (@Pc(85) int local85 = -this.anInt2460; local85 <= this.anInt2460; local85++) {
					@Pc(91) int local91 = local85 & Static317.anInt6151;
					local65 += local73[local91];
					local67 += local77[local91];
					local69 += local81[local91];
				}
				@Pc(122) int[] local122 = local63[0];
				@Pc(126) int[] local126 = local63[1];
				@Pc(130) int[] local130 = local63[2];
				@Pc(132) int local132 = 0;
				while (local132 < Static15.anInt493) {
					local122[local132] = local65 * local40 >> 16;
					local126[local132] = local67 * local40 >> 16;
					local130[local132] = local40 * local69 >> 16;
					@Pc(165) int local165 = Static317.anInt6151 & local132 - this.anInt2460;
					local65 -= local73[local165];
					local69 -= local81[local165];
					local67 -= local77[local165];
					local132++;
					@Pc(191) int local191 = Static317.anInt6151 & local132 + this.anInt2460;
					local67 += local77[local191];
					local65 += local73[local191];
					local69 += local81[local191];
				}
				local43[this.anInt2461 + local49 - arg0] = local63;
			}
			@Pc(237) int[] local237 = local11[0];
			@Pc(241) int[] local241 = local11[1];
			@Pc(245) int[] local245 = local11[2];
			for (local67 = 0; local67 < Static15.anInt493; local67++) {
				local69 = 0;
				@Pc(253) int local253 = 0;
				@Pc(255) int local255 = 0;
				for (@Pc(257) int local257 = 0; local257 < local24; local257++) {
					@Pc(263) int[][] local263 = local43[local257];
					local253 += local263[1][local67];
					local69 += local263[0][local67];
					local255 += local263[2][local67];
				}
				local237[local67] = local28 * local69 >> 16;
				local241[local67] = local28 * local253 >> 16;
				local245[local67] = local255 * local28 >> 16;
			}
		}
		return local11;
	}
}
