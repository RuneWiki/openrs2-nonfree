import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class3_Sub3_Sub25 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
	private int anInt4231 = 1;

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
	private int anInt4234 = 1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4234 = arg0.method3643();
		} else if (arg1 == 1) {
			this.anInt4231 = arg0.method3643();
		} else if (arg1 == 2) {
			super.aBoolean454 = arg0.method3643() == 1;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(29) int local29 = this.anInt4231 + this.anInt4231 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt4234 + this.anInt4234 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local29][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt4231; local55 <= arg0 + this.anInt4231; local55++) {
				@Pc(65) int[] local65 = this.method5733(local55 & Static351.anInt6821, 0);
				@Pc(68) int[] local68 = new int[Static131.anInt2755];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt4234; local74 <= this.anInt4234; local74++) {
					local70 += local65[Static167.anInt3460 & local74];
				}
				@Pc(91) int local91 = 0;
				while (Static131.anInt2755 > local91) {
					local68[local91] = local70 * local46 >> 16;
					local70 -= local65[Static167.anInt3460 & local91 - this.anInt4234];
					local91++;
					local70 += local65[Static167.anInt3460 & this.anInt4234 + local91];
				}
				local49[local55 + this.anInt4231 - arg0] = local68;
			}
			for (@Pc(156) int local156 = 0; local156 < Static131.anInt2755; local156++) {
				@Pc(160) int local160 = 0;
				for (local70 = 0; local70 < local29; local70++) {
					local160 += local49[local70][local156];
				}
				local17[local156] = local33 * local160 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(23) int local23 = this.anInt4231 + this.anInt4231 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt4234 + this.anInt4234 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(65) int local65;
			@Pc(67) int local67;
			for (@Pc(47) int local47 = arg0 - this.anInt4231; local47 <= this.anInt4231 + arg0; local47++) {
				@Pc(57) int[][] local57 = this.method5729(0, Static351.anInt6821 & local47);
				@Pc(61) int[][] local61 = new int[3][Static131.anInt2755];
				@Pc(63) int local63 = 0;
				local65 = 0;
				local67 = 0;
				@Pc(71) int[] local71 = local57[0];
				@Pc(75) int[] local75 = local57[1];
				@Pc(79) int[] local79 = local57[2];
				for (@Pc(83) int local83 = -this.anInt4234; local83 <= this.anInt4234; local83++) {
					@Pc(89) int local89 = Static167.anInt3460 & local83;
					local65 += local75[local89];
					local63 += local71[local89];
					local67 += local79[local89];
				}
				@Pc(116) int[] local116 = local61[0];
				@Pc(120) int[] local120 = local61[1];
				@Pc(124) int[] local124 = local61[2];
				@Pc(126) int local126 = 0;
				while (Static131.anInt2755 > local126) {
					local116[local126] = local63 * local39 >> 16;
					local120[local126] = local39 * local65 >> 16;
					local124[local126] = local67 * local39 >> 16;
					@Pc(160) int local160 = local126 - this.anInt4234 & Static167.anInt3460;
					local67 -= local79[local160];
					local65 -= local75[local160];
					local63 -= local71[local160];
					local126++;
					@Pc(186) int local186 = Static167.anInt3460 & local126 + this.anInt4234;
					local63 += local71[local186];
					local65 += local75[local186];
					local67 += local79[local186];
				}
				local42[local47 + this.anInt4231 - arg0] = local61;
			}
			@Pc(236) int[] local236 = local11[0];
			@Pc(240) int[] local240 = local11[1];
			@Pc(244) int[] local244 = local11[2];
			for (local65 = 0; local65 < Static131.anInt2755; local65++) {
				local67 = 0;
				@Pc(252) int local252 = 0;
				@Pc(254) int local254 = 0;
				for (@Pc(256) int local256 = 0; local256 < local23; local256++) {
					@Pc(262) int[][] local262 = local42[local256];
					local67 += local262[0][local65];
					local254 += local262[2][local65];
					local252 += local262[1][local65];
				}
				local236[local65] = local67 * local27 >> 16;
				local240[local65] = local27 * local252 >> 16;
				local244[local65] = local27 * local254 >> 16;
			}
		}
		return local11;
	}
}
