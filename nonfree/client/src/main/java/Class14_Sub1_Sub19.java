import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class14_Sub1_Sub19 extends Class14_Sub1 {

	@OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
	private int anInt4712 = 1;

	@OriginalMember(owner = "client!jea", name = "I", descriptor = "I")
	private int anInt4714 = 1;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(28) int local28 = this.anInt4714 + this.anInt4714 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt4712 + this.anInt4712 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local28][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt4714; local54 <= arg0 + this.anInt4714; local54++) {
				@Pc(64) int[][] local64 = this.method8904(0, local54 & Static52.anInt1266);
				@Pc(68) int[][] local68 = new int[3][Static371.anInt6835];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt4712; local90 <= this.anInt4712; local90++) {
					@Pc(96) int local96 = local90 & Static192.anInt3590;
					local74 += local86[local96];
					local70 += local78[local96];
					local72 += local82[local96];
				}
				@Pc(123) int[] local123 = local68[0];
				@Pc(127) int[] local127 = local68[1];
				@Pc(131) int[] local131 = local68[2];
				@Pc(133) int local133 = 0;
				while (local133 < Static371.anInt6835) {
					local123[local133] = local70 * local45 >> 16;
					local127[local133] = local45 * local72 >> 16;
					local131[local133] = local74 * local45 >> 16;
					@Pc(166) int local166 = local133 - this.anInt4712 & Static192.anInt3590;
					local72 -= local82[local166];
					local133++;
					local74 -= local86[local166];
					local70 -= local78[local166];
					@Pc(192) int local192 = this.anInt4712 + local133 & Static192.anInt3590;
					local72 += local82[local192];
					local74 += local86[local192];
					local70 += local78[local192];
				}
				local48[local54 + this.anInt4714 - arg0] = local68;
			}
			@Pc(244) int[] local244 = local16[0];
			@Pc(248) int[] local248 = local16[1];
			@Pc(252) int[] local252 = local16[2];
			for (local72 = 0; local72 < Static371.anInt6835; local72++) {
				local74 = 0;
				@Pc(260) int local260 = 0;
				@Pc(262) int local262 = 0;
				for (@Pc(264) int local264 = 0; local264 < local28; local264++) {
					@Pc(270) int[][] local270 = local48[local264];
					local262 += local270[2][local72];
					local260 += local270[1][local72];
					local74 += local270[0][local72];
				}
				local244[local72] = local74 * local32 >> 16;
				local248[local72] = local32 * local260 >> 16;
				local252[local72] = local262 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(28) int local28 = this.anInt4714 + this.anInt4714 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt4712 + this.anInt4712 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(67) int local67;
			for (@Pc(52) int local52 = arg0 - this.anInt4714; local52 <= this.anInt4714 + arg0; local52++) {
				@Pc(62) int[] local62 = this.method8897(0, Static52.anInt1266 & local52);
				@Pc(65) int[] local65 = new int[Static371.anInt6835];
				local67 = 0;
				for (@Pc(71) int local71 = -this.anInt4712; local71 <= this.anInt4712; local71++) {
					local67 += local62[local71 & Static192.anInt3590];
				}
				@Pc(88) int local88 = 0;
				while (local88 < Static371.anInt6835) {
					local65[local88] = local44 * local67 >> 16;
					local67 -= local62[Static192.anInt3590 & local88 - this.anInt4712];
					local88++;
					local67 += local62[Static192.anInt3590 & this.anInt4712 + local88];
				}
				local47[this.anInt4714 + local52 - arg0] = local65;
			}
			for (@Pc(151) int local151 = 0; local151 < Static371.anInt6835; local151++) {
				@Pc(155) int local155 = 0;
				for (local67 = 0; local67 < local28; local67++) {
					local155 += local47[local67][local151];
				}
				local16[local151] = local155 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4712 = arg0.method5866();
		} else if (arg1 == 1) {
			this.anInt4714 = arg0.method5866();
		} else if (arg1 == 2) {
			super.aBoolean734 = arg0.method5866() == 1;
		}
	}
}
