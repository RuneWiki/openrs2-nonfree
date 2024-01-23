import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
	private int anInt3791 = 1;

	@OriginalMember(owner = "client!mi", name = "fb", descriptor = "I")
	private int anInt3794 = 1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(31) int local31 = this.anInt3791 + this.anInt3791 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(38) int[][][] local38 = new int[local31][][];
			@Pc(46) int local46 = this.anInt3794 + this.anInt3794 + 1;
			@Pc(50) int local50 = 65536 / local46;
			@Pc(68) int local68;
			@Pc(88) int local88;
			@Pc(86) int local86;
			for (@Pc(56) int local56 = arg0 - this.anInt3791; local56 <= this.anInt3791 + arg0; local56++) {
				local68 = 0;
				@Pc(76) int[][] local76 = this.method4758(0, local56 & Static178.anInt4007);
				@Pc(80) int[][] local80 = new int[3][Static75.anInt1848];
				@Pc(84) int[] local84 = local76[0];
				local86 = 0;
				local88 = 0;
				@Pc(92) int[] local92 = local76[1];
				@Pc(96) int[] local96 = local76[2];
				for (@Pc(100) int local100 = -this.anInt3794; local100 <= this.anInt3794; local100++) {
					@Pc(108) int local108 = local100 & Static145.anInt3482;
					local86 += local96[local108];
					local88 += local92[local108];
					local68 += local84[local108];
				}
				@Pc(133) int[] local133 = local80[0];
				@Pc(137) int[] local137 = local80[2];
				@Pc(141) int[] local141 = local80[1];
				@Pc(143) int local143 = 0;
				while (local143 < Static75.anInt1848) {
					local133[local143] = local50 * local68 >> 16;
					local141[local143] = local50 * local88 >> 16;
					local137[local143] = local50 * local86 >> 16;
					@Pc(181) int local181 = Static145.anInt3482 & local143 - this.anInt3794;
					local68 -= local84[local181];
					local143++;
					local88 -= local92[local181];
					local86 -= local96[local181];
					@Pc(207) int local207 = this.anInt3794 + local143 & Static145.anInt3482;
					local88 += local92[local207];
					local68 += local84[local207];
					local86 += local96[local207];
				}
				local38[this.anInt3791 + local56 - arg0] = local80;
			}
			@Pc(244) int[] local244 = local19[0];
			@Pc(248) int[] local248 = local19[2];
			@Pc(252) int[] local252 = local19[1];
			for (local68 = 0; local68 < Static75.anInt1848; local68++) {
				local88 = 0;
				local86 = 0;
				@Pc(267) int local267 = 0;
				for (@Pc(269) int local269 = 0; local269 < local31; local269++) {
					@Pc(276) int[][] local276 = local38[local269];
					local88 += local276[0][local68];
					local267 += local276[2][local68];
					local86 += local276[1][local68];
				}
				local244[local68] = local88 * local35 >> 16;
				local252[local68] = local35 * local86 >> 16;
				local248[local68] = local35 * local267 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3794 = arg0.method2655();
		} else if (arg1 == 1) {
			this.anInt3791 = arg0.method2655();
		} else if (arg1 == 2) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(30) int local30 = this.anInt3791 + this.anInt3791 + 1;
			@Pc(33) int[][] local33 = new int[local30][];
			@Pc(37) int local37 = 65536 / local30;
			@Pc(45) int local45 = this.anInt3794 + this.anInt3794 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(55) int local55;
			for (local55 = arg0 - this.anInt3791; local55 <= arg0 + this.anInt3791; local55++) {
				@Pc(70) int[] local70 = this.method4746(0, local55 & Static178.anInt4007);
				@Pc(73) int[] local73 = new int[Static75.anInt1848];
				@Pc(75) int local75 = 0;
				@Pc(79) int local79;
				for (local79 = -this.anInt3794; local79 <= this.anInt3794; local79++) {
					local75 += local70[Static145.anInt3482 & local79];
				}
				local79 = 0;
				while (Static75.anInt1848 > local79) {
					local73[local79] = local49 * local75 >> 16;
					local75 -= local70[Static145.anInt3482 & local79 - this.anInt3794];
					local79++;
					local75 += local70[local79 + this.anInt3794 & Static145.anInt3482];
				}
				local33[this.anInt3791 + local55 - arg0] = local73;
			}
			for (local55 = 0; local55 < Static75.anInt1848; local55++) {
				@Pc(158) int local158 = 0;
				for (@Pc(160) int local160 = 0; local160 < local30; local160++) {
					local158 += local33[local160][local55];
				}
				local13[local55] = local37 * local158 >> 16;
			}
		}
		return local13;
	}
}
