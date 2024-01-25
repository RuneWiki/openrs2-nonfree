import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
	private int anInt4046 = 1;

	@OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
	private int anInt4045 = 1;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(23) int local23 = this.anInt4046 + this.anInt4046 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt4045 + this.anInt4045 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt4046; local48 <= arg0 + this.anInt4046; local48++) {
				@Pc(58) int[] local58 = this.method5964(local48 & Static464.anInt6761, 0);
				@Pc(61) int[] local61 = new int[Static218.anInt3990];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt4045; local67 <= this.anInt4045; local67++) {
					local63 += local58[local67 & Static147.anInt2302];
				}
				@Pc(88) int local88 = 0;
				while (local88 < Static218.anInt3990) {
					local61[local88] = local39 * local63 >> 16;
					local63 -= local58[local88 - this.anInt4045 & Static147.anInt2302];
					local88++;
					local63 += local58[local88 + this.anInt4045 & Static147.anInt2302];
				}
				local42[this.anInt4046 + local48 - arg0] = local61;
			}
			for (@Pc(149) int local149 = 0; local149 < Static218.anInt3990; local149++) {
				@Pc(153) int local153 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local153 += local42[local63][local149];
				}
				local11[local149] = local27 * local153 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(24) int[][] local24 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(36) int local36 = this.anInt4046 + this.anInt4046 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(48) int local48 = this.anInt4045 + this.anInt4045 + 1;
			@Pc(52) int local52 = 65536 / local48;
			@Pc(55) int[][][] local55 = new int[local36][][];
			@Pc(81) int local81;
			@Pc(83) int local83;
			for (@Pc(61) int local61 = arg0 - this.anInt4046; local61 <= this.anInt4046 + arg0; local61++) {
				@Pc(73) int[][] local73 = this.method5968(0, local61 & Static464.anInt6761);
				@Pc(77) int[][] local77 = new int[3][Static218.anInt3990];
				@Pc(79) int local79 = 0;
				local81 = 0;
				local83 = 0;
				@Pc(87) int[] local87 = local73[0];
				@Pc(91) int[] local91 = local73[1];
				@Pc(95) int[] local95 = local73[2];
				for (@Pc(99) int local99 = -this.anInt4045; local99 <= this.anInt4045; local99++) {
					@Pc(105) int local105 = Static147.anInt2302 & local99;
					local81 += local91[local105];
					local79 += local87[local105];
					local83 += local95[local105];
				}
				@Pc(136) int[] local136 = local77[0];
				@Pc(140) int[] local140 = local77[1];
				@Pc(144) int[] local144 = local77[2];
				@Pc(146) int local146 = 0;
				while (Static218.anInt3990 > local146) {
					local136[local146] = local52 * local79 >> 16;
					local140[local146] = local52 * local81 >> 16;
					local144[local146] = local83 * local52 >> 16;
					@Pc(180) int local180 = Static147.anInt2302 & local146 - this.anInt4045;
					local81 -= local91[local180];
					local146++;
					local83 -= local95[local180];
					local79 -= local87[local180];
					@Pc(206) int local206 = Static147.anInt2302 & local146 + this.anInt4045;
					local79 += local87[local206];
					local83 += local95[local206];
					local81 += local91[local206];
				}
				local55[local61 + this.anInt4046 - arg0] = local77;
			}
			@Pc(252) int[] local252 = local24[0];
			@Pc(256) int[] local256 = local24[1];
			@Pc(260) int[] local260 = local24[2];
			for (local81 = 0; local81 < Static218.anInt3990; local81++) {
				local83 = 0;
				@Pc(268) int local268 = 0;
				@Pc(270) int local270 = 0;
				for (@Pc(272) int local272 = 0; local272 < local36; local272++) {
					@Pc(278) int[][] local278 = local55[local272];
					local270 += local278[2][local81];
					local268 += local278[1][local81];
					local83 += local278[0][local81];
				}
				local252[local81] = local83 * local40 >> 16;
				local256[local81] = local40 * local268 >> 16;
				local260[local81] = local40 * local270 >> 16;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4045 = arg0.method2915();
		} else if (arg1 == 1) {
			this.anInt4046 = arg0.method2915();
		} else if (arg1 == 2) {
			super.aBoolean650 = arg0.method2915() == 1;
		}
	}
}
