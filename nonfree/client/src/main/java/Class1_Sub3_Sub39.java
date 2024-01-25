import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class1_Sub3_Sub39 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
	private int anInt8706 = 1;

	@OriginalMember(owner = "client!vp", name = "O", descriptor = "I")
	private int anInt8710 = 1;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(23) int local23 = this.anInt8710 + this.anInt8710 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(36) int local36 = this.anInt8706 + this.anInt8706 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][][] local43 = new int[local23][][];
			@Pc(67) int local67;
			@Pc(69) int local69;
			for (@Pc(49) int local49 = arg0 - this.anInt8710; local49 <= arg0 + this.anInt8710; local49++) {
				@Pc(59) int[][] local59 = this.method7130(local49 & Static323.anInt5914, 0);
				@Pc(63) int[][] local63 = new int[3][Static452.anInt7734];
				@Pc(65) int local65 = 0;
				local67 = 0;
				local69 = 0;
				@Pc(73) int[] local73 = local59[0];
				@Pc(77) int[] local77 = local59[1];
				@Pc(81) int[] local81 = local59[2];
				for (@Pc(85) int local85 = -this.anInt8706; local85 <= this.anInt8706; local85++) {
					@Pc(91) int local91 = local85 & Static80.anInt1453;
					local69 += local81[local91];
					local67 += local77[local91];
					local65 += local73[local91];
				}
				@Pc(122) int[] local122 = local63[0];
				@Pc(126) int[] local126 = local63[1];
				@Pc(130) int[] local130 = local63[2];
				@Pc(132) int local132 = 0;
				while (local132 < Static452.anInt7734) {
					local122[local132] = local65 * local40 >> 16;
					local126[local132] = local67 * local40 >> 16;
					local130[local132] = local69 * local40 >> 16;
					@Pc(166) int local166 = local132 - this.anInt8706 & Static80.anInt1453;
					local69 -= local81[local166];
					local132++;
					local65 -= local73[local166];
					local67 -= local77[local166];
					@Pc(192) int local192 = local132 + this.anInt8706 & Static80.anInt1453;
					local69 += local81[local192];
					local67 += local77[local192];
					local65 += local73[local192];
				}
				local43[this.anInt8710 + local49 - arg0] = local63;
			}
			@Pc(238) int[] local238 = local11[0];
			@Pc(242) int[] local242 = local11[1];
			@Pc(246) int[] local246 = local11[2];
			for (local67 = 0; local67 < Static452.anInt7734; local67++) {
				local69 = 0;
				@Pc(254) int local254 = 0;
				@Pc(256) int local256 = 0;
				for (@Pc(258) int local258 = 0; local258 < local23; local258++) {
					@Pc(264) int[][] local264 = local43[local258];
					local256 += local264[2][local67];
					local69 += local264[0][local67];
					local254 += local264[1][local67];
				}
				local238[local67] = local27 * local69 >> 16;
				local242[local67] = local27 * local254 >> 16;
				local246[local67] = local256 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(28) int local28 = this.anInt8710 + this.anInt8710 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt8706 + this.anInt8706 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local28][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt8710; local54 <= arg0 + this.anInt8710; local54++) {
				@Pc(64) int[] local64 = this.method7128(0, Static323.anInt5914 & local54);
				@Pc(67) int[] local67 = new int[Static452.anInt7734];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt8706; local73 <= this.anInt8706; local73++) {
					local69 += local64[Static80.anInt1453 & local73];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static452.anInt7734) {
					local67[local94] = local69 * local45 >> 16;
					local69 -= local64[local94 - this.anInt8706 & Static80.anInt1453];
					local94++;
					local69 += local64[local94 + this.anInt8706 & Static80.anInt1453];
				}
				local48[this.anInt8710 + local54 - arg0] = local67;
			}
			for (@Pc(160) int local160 = 0; local160 < Static452.anInt7734; local160++) {
				@Pc(164) int local164 = 0;
				for (local69 = 0; local69 < local28; local69++) {
					local164 += local48[local69][local160];
				}
				local16[local160] = local164 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8706 = arg0.method3922();
		} else if (arg1 == 1) {
			this.anInt8710 = arg0.method3922();
		} else if (arg1 == 2) {
			super.aBoolean614 = arg0.method3922() == 1;
		}
	}
}
