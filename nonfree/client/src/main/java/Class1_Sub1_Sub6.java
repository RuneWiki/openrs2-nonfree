import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "[I")
	public static final int[] anIntArray60 = new int[256];

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
	private int anInt800 = 1;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
	private int anInt798 = 1;

	static {
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(16) int local16 = local13;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1) == 1) {
					local16 = local16 >>> 1 ^ 0xEDB88320;
				} else {
					local16 >>>= 0x1;
				}
			}
			anIntArray60[local13] = local16;
		}
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(24) int local24 = this.anInt800 + this.anInt800 + 1;
			@Pc(32) int local32 = this.anInt798 + this.anInt798 + 1;
			@Pc(36) int local36 = 65536 / local24;
			@Pc(40) int local40 = 65536 / local32;
			@Pc(43) int[][][] local43 = new int[local24][][];
			@Pc(67) int local67;
			@Pc(69) int local69;
			for (@Pc(49) int local49 = arg0 - this.anInt800; local49 <= arg0 + this.anInt800; local49++) {
				@Pc(59) int[][] local59 = this.method3397(0, Static15.anInt388 & local49);
				@Pc(63) int[][] local63 = new int[3][Static107.anInt2321];
				@Pc(65) int local65 = 0;
				local67 = 0;
				local69 = 0;
				@Pc(73) int[] local73 = local59[0];
				@Pc(77) int[] local77 = local59[2];
				@Pc(81) int[] local81 = local59[1];
				for (@Pc(85) int local85 = -this.anInt798; local85 <= this.anInt798; local85++) {
					@Pc(91) int local91 = local85 & Static144.anInt2893;
					local69 += local77[local91];
					local67 += local81[local91];
					local65 += local73[local91];
				}
				@Pc(122) int[] local122 = local63[1];
				@Pc(126) int[] local126 = local63[0];
				@Pc(130) int[] local130 = local63[2];
				@Pc(132) int local132 = 0;
				while (Static107.anInt2321 > local132) {
					local126[local132] = local65 * local40 >> 16;
					local122[local132] = local67 * local40 >> 16;
					local130[local132] = local40 * local69 >> 16;
					@Pc(166) int local166 = local132 - this.anInt798 & Static144.anInt2893;
					local69 -= local77[local166];
					local67 -= local81[local166];
					local65 -= local73[local166];
					local132++;
					@Pc(192) int local192 = this.anInt798 + local132 & Static144.anInt2893;
					local67 += local81[local192];
					local69 += local77[local192];
					local65 += local73[local192];
				}
				local43[local49 + this.anInt800 - arg0] = local63;
			}
			@Pc(237) int[] local237 = local12[1];
			@Pc(241) int[] local241 = local12[2];
			@Pc(245) int[] local245 = local12[0];
			for (local67 = 0; local67 < Static107.anInt2321; local67++) {
				local69 = 0;
				@Pc(253) int local253 = 0;
				@Pc(255) int local255 = 0;
				for (@Pc(257) int local257 = 0; local257 < local24; local257++) {
					@Pc(263) int[][] local263 = local43[local257];
					local255 += local263[2][local67];
					local69 += local263[0][local67];
					local253 += local263[1][local67];
				}
				local245[local67] = local69 * local36 >> 16;
				local237[local67] = local253 * local36 >> 16;
				local241[local67] = local36 * local255 >> 16;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt798 = arg0.method3010();
		} else if (arg1 == 1) {
			this.anInt800 = arg0.method3010();
		} else if (arg1 == 2) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(23) int local23 = this.anInt800 + this.anInt800 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt798 + this.anInt798 + 1;
			@Pc(38) int[][] local38 = new int[local23][];
			@Pc(42) int local42 = 65536 / local35;
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt800; local48 <= arg0 + this.anInt800; local48++) {
				@Pc(58) int[] local58 = this.method3393(Static15.anInt388 & local48, 0);
				@Pc(61) int[] local61 = new int[Static107.anInt2321];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt798; local67 <= this.anInt798; local67++) {
					local63 += local58[local67 & Static144.anInt2893];
				}
				@Pc(88) int local88 = 0;
				while (local88 < Static107.anInt2321) {
					local61[local88] = local42 * local63 >> 16;
					local63 -= local58[local88 - this.anInt798 & Static144.anInt2893];
					local88++;
					local63 += local58[this.anInt798 + local88 & Static144.anInt2893];
				}
				local38[local48 + this.anInt800 - arg0] = local61;
			}
			for (@Pc(144) int local144 = 0; local144 < Static107.anInt2321; local144++) {
				@Pc(148) int local148 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local148 += local38[local63][local144];
				}
				local7[local144] = local27 * local148 >> 16;
			}
		}
		return local7;
	}
}
