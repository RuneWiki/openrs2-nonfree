import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class3_Sub4_Sub8 extends Class3_Sub4 {

	@OriginalMember(owner = "client!du", name = "Q", descriptor = "I")
	private int anInt1436 = 1;

	@OriginalMember(owner = "client!du", name = "O", descriptor = "I")
	private int anInt1434 = 1;

	static {
		new Class174(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1436 = arg0.method4096();
		} else if (arg1 == 1) {
			this.anInt1434 = arg0.method4096();
		} else if (arg1 == 2) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(31) int local31 = this.anInt1434 + this.anInt1434 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt1436 + this.anInt1436 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt1434; local55 <= arg0 + this.anInt1434; local55++) {
				@Pc(65) int[] local65 = this.method6139(0, local55 & Static165.anInt2326);
				@Pc(68) int[] local68 = new int[Static148.anInt2687];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt1436; local74 <= this.anInt1436; local74++) {
					local70 += local65[local74 & Static225.anInt3793];
				}
				@Pc(95) int local95 = 0;
				while (local95 < Static148.anInt2687) {
					local68[local95] = local47 * local70 >> 16;
					local70 -= local65[Static225.anInt3793 & local95 - this.anInt1436];
					local95++;
					local70 += local65[Static225.anInt3793 & this.anInt1436 + local95];
				}
				local50[this.anInt1434 + local55 - arg0] = local68;
			}
			for (@Pc(154) int local154 = 0; local154 < Static148.anInt2687; local154++) {
				@Pc(158) int local158 = 0;
				for (local70 = 0; local70 < local31; local70++) {
					local158 += local50[local70][local154];
				}
				local11[local154] = local158 * local35 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(23) int local23 = this.anInt1434 + this.anInt1434 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt1436 + this.anInt1436 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(65) int local65;
			@Pc(67) int local67;
			for (@Pc(47) int local47 = arg0 - this.anInt1434; local47 <= arg0 + this.anInt1434; local47++) {
				@Pc(57) int[][] local57 = this.method6138(Static165.anInt2326 & local47, 0);
				@Pc(61) int[][] local61 = new int[3][Static148.anInt2687];
				@Pc(63) int local63 = 0;
				local65 = 0;
				local67 = 0;
				@Pc(71) int[] local71 = local57[0];
				@Pc(75) int[] local75 = local57[1];
				@Pc(79) int[] local79 = local57[2];
				for (@Pc(83) int local83 = -this.anInt1436; local83 <= this.anInt1436; local83++) {
					@Pc(89) int local89 = local83 & Static225.anInt3793;
					local65 += local75[local89];
					local63 += local71[local89];
					local67 += local79[local89];
				}
				@Pc(116) int[] local116 = local61[0];
				@Pc(120) int[] local120 = local61[1];
				@Pc(124) int[] local124 = local61[2];
				@Pc(126) int local126 = 0;
				while (local126 < Static148.anInt2687) {
					local116[local126] = local39 * local63 >> 16;
					local120[local126] = local39 * local65 >> 16;
					local124[local126] = local67 * local39 >> 16;
					@Pc(160) int local160 = Static225.anInt3793 & local126 - this.anInt1436;
					local67 -= local79[local160];
					local63 -= local71[local160];
					local126++;
					local65 -= local75[local160];
					@Pc(186) int local186 = Static225.anInt3793 & local126 + this.anInt1436;
					local67 += local79[local186];
					local63 += local71[local186];
					local65 += local75[local186];
				}
				local42[this.anInt1434 + local47 - arg0] = local61;
			}
			@Pc(236) int[] local236 = local11[0];
			@Pc(240) int[] local240 = local11[1];
			@Pc(244) int[] local244 = local11[2];
			for (local65 = 0; local65 < Static148.anInt2687; local65++) {
				local67 = 0;
				@Pc(252) int local252 = 0;
				@Pc(254) int local254 = 0;
				for (@Pc(256) int local256 = 0; local256 < local23; local256++) {
					@Pc(262) int[][] local262 = local42[local256];
					local254 += local262[2][local65];
					local67 += local262[0][local65];
					local252 += local262[1][local65];
				}
				local236[local65] = local27 * local67 >> 16;
				local240[local65] = local252 * local27 >> 16;
				local244[local65] = local27 * local254 >> 16;
			}
		}
		return local11;
	}
}
