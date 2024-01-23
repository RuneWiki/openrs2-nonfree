import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gg", name = "gb", descriptor = "I")
	private int anInt1631 = 1;

	@OriginalMember(owner = "client!gg", name = "pb", descriptor = "I")
	private int anInt1637 = 1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1631 = arg0.method2945();
		} else if (arg1 == 1) {
			this.anInt1637 = arg0.method2945();
		} else if (arg1 == 2) {
			super.aBoolean442 = arg0.method2945() == 1;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(28) int local28 = this.anInt1631 + this.anInt1631 + 1;
			@Pc(36) int local36 = this.anInt1637 + this.anInt1637 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][] local43 = new int[local36][];
			@Pc(47) int local47 = 65536 / local28;
			@Pc(67) int local67;
			for (@Pc(52) int local52 = arg0 - this.anInt1637; local52 <= arg0 + this.anInt1637; local52++) {
				@Pc(62) int[] local62 = this.method3706(local52 & Static30.anInt589, 0);
				@Pc(65) int[] local65 = new int[Static11.anInt294];
				local67 = 0;
				for (@Pc(71) int local71 = -this.anInt1631; local71 <= this.anInt1631; local71++) {
					local67 += local62[local71 & Static147.anInt3169];
				}
				@Pc(92) int local92 = 0;
				while (local92 < Static11.anInt294) {
					local65[local92] = local47 * local67 >> 16;
					local67 -= local62[Static147.anInt3169 & local92 - this.anInt1631];
					local92++;
					local67 += local62[local92 + this.anInt1631 & Static147.anInt3169];
				}
				local43[local52 + this.anInt1637 - arg0] = local65;
			}
			for (@Pc(151) int local151 = 0; local151 < Static11.anInt294; local151++) {
				@Pc(155) int local155 = 0;
				for (local67 = 0; local67 < local36; local67++) {
					local155 += local43[local67][local151];
				}
				local16[local151] = local40 * local155 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(28) int local28 = this.anInt1637 + this.anInt1637 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt1631 + this.anInt1631 + 1;
			@Pc(43) int[][][] local43 = new int[local28][][];
			@Pc(47) int local47 = 65536 / local40;
			@Pc(71) int local71;
			@Pc(77) int local77;
			for (@Pc(53) int local53 = arg0 - this.anInt1637; local53 <= arg0 + this.anInt1637; local53++) {
				@Pc(63) int[][] local63 = this.method3713(Static30.anInt589 & local53, 0);
				@Pc(67) int[][] local67 = new int[3][Static11.anInt294];
				@Pc(69) int local69 = 0;
				local71 = 0;
				@Pc(75) int[] local75 = local63[1];
				local77 = 0;
				@Pc(81) int[] local81 = local63[2];
				@Pc(85) int[] local85 = local63[0];
				for (@Pc(89) int local89 = -this.anInt1631; local89 <= this.anInt1631; local89++) {
					@Pc(95) int local95 = Static147.anInt3169 & local89;
					local71 += local75[local95];
					local69 += local85[local95];
					local77 += local81[local95];
				}
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[0];
				@Pc(134) int[] local134 = local67[2];
				@Pc(136) int local136 = 0;
				while (Static11.anInt294 > local136) {
					local130[local136] = local69 * local47 >> 16;
					local126[local136] = local47 * local71 >> 16;
					local134[local136] = local77 * local47 >> 16;
					@Pc(169) int local169 = local136 - this.anInt1631 & Static147.anInt3169;
					local69 -= local85[local169];
					local71 -= local75[local169];
					local136++;
					local77 -= local81[local169];
					@Pc(196) int local196 = local136 + this.anInt1631 & Static147.anInt3169;
					local77 += local81[local196];
					local69 += local85[local196];
					local71 += local75[local196];
				}
				local43[this.anInt1637 + local53 - arg0] = local67;
			}
			@Pc(241) int[] local241 = local7[0];
			@Pc(245) int[] local245 = local7[2];
			@Pc(249) int[] local249 = local7[1];
			for (local71 = 0; local71 < Static11.anInt294; local71++) {
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				local77 = 0;
				for (@Pc(261) int local261 = 0; local261 < local28; local261++) {
					@Pc(267) int[][] local267 = local43[local261];
					local77 += local267[0][local71];
					local257 += local267[2][local71];
					local255 += local267[1][local71];
				}
				local241[local71] = local77 * local32 >> 16;
				local249[local71] = local255 * local32 >> 16;
				local245[local71] = local257 * local32 >> 16;
			}
		}
		return local7;
	}
}
