import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class1_Sub3_Sub24 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
	private int anInt4748 = 1;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
	private int anInt4749 = 1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4749 = arg0.method4130();
		} else if (arg1 == 1) {
			this.anInt4748 = arg0.method4130();
		} else if (arg1 == 2) {
			super.aBoolean494 = arg0.method4130() == 1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(25) int local25 = this.anInt4748 + this.anInt4748 + 1;
			@Pc(29) int local29 = 65536 / local25;
			@Pc(37) int local37 = this.anInt4749 + this.anInt4749 + 1;
			@Pc(41) int local41 = 65536 / local37;
			@Pc(44) int[][] local44 = new int[local25][];
			@Pc(66) int local66;
			for (@Pc(49) int local49 = arg0 - this.anInt4748; local49 <= this.anInt4748 + arg0; local49++) {
				@Pc(61) int[] local61 = this.method6076(0, local49 & Static274.anInt4887);
				@Pc(64) int[] local64 = new int[Static347.anInt5974];
				local66 = 0;
				for (@Pc(70) int local70 = -this.anInt4749; local70 <= this.anInt4749; local70++) {
					local66 += local61[Static307.anInt5524 & local70];
				}
				@Pc(87) int local87 = 0;
				while (Static347.anInt5974 > local87) {
					local64[local87] = local41 * local66 >> 16;
					local66 -= local61[local87 - this.anInt4749 & Static307.anInt5524];
					local87++;
					local66 += local61[this.anInt4749 + local87 & Static307.anInt5524];
				}
				local44[local49 + this.anInt4748 - arg0] = local64;
			}
			for (@Pc(142) int local142 = 0; local142 < Static347.anInt5974; local142++) {
				@Pc(146) int local146 = 0;
				for (local66 = 0; local66 < local25; local66++) {
					local146 += local44[local66][local142];
				}
				local13[local142] = local146 * local29 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(32) int local32 = this.anInt4748 + this.anInt4748 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(45) int local45 = this.anInt4749 + this.anInt4749 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(52) int[][][] local52 = new int[local32][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt4748; local57 <= this.anInt4748 + arg0; local57++) {
				@Pc(67) int[][] local67 = this.method6072(0, Static274.anInt4887 & local57);
				@Pc(71) int[][] local71 = new int[3][Static347.anInt5974];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt4749; local93 <= this.anInt4749; local93++) {
					@Pc(99) int local99 = Static307.anInt5524 & local93;
					local73 += local81[local99];
					local77 += local89[local99];
					local75 += local85[local99];
				}
				@Pc(126) int[] local126 = local71[0];
				@Pc(130) int[] local130 = local71[1];
				@Pc(134) int[] local134 = local71[2];
				@Pc(136) int local136 = 0;
				while (Static347.anInt5974 > local136) {
					local126[local136] = local49 * local73 >> 16;
					local130[local136] = local75 * local49 >> 16;
					local134[local136] = local77 * local49 >> 16;
					@Pc(169) int local169 = local136 - this.anInt4749 & Static307.anInt5524;
					local73 -= local81[local169];
					local77 -= local89[local169];
					local75 -= local85[local169];
					local136++;
					@Pc(195) int local195 = this.anInt4749 + local136 & Static307.anInt5524;
					local75 += local85[local195];
					local77 += local89[local195];
					local73 += local81[local195];
				}
				local52[local57 + this.anInt4748 - arg0] = local71;
			}
			@Pc(240) int[] local240 = local19[0];
			@Pc(244) int[] local244 = local19[1];
			@Pc(248) int[] local248 = local19[2];
			for (local75 = 0; local75 < Static347.anInt5974; local75++) {
				local77 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local32; local260++) {
					@Pc(266) int[][] local266 = local52[local260];
					local77 += local266[0][local75];
					local258 += local266[2][local75];
					local256 += local266[1][local75];
				}
				local240[local75] = local77 * local36 >> 16;
				local244[local75] = local36 * local256 >> 16;
				local248[local75] = local36 * local258 >> 16;
			}
		}
		return local19;
	}
}
