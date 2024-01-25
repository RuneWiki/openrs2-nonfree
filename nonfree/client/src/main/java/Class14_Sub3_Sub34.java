import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class14_Sub3_Sub34 extends Class14_Sub3 {

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "[I")
	public static final int[] anIntArray546 = new int[16384];

	@OriginalMember(owner = "client!uf", name = "O", descriptor = "[I")
	public static final int[] anIntArray547 = new int[16384];

	@OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
	private int anInt6126 = 1;

	@OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
	private int anInt6127 = 1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray547[local9] = (int) (Math.sin((double) local9 * local7) * 32768.0D);
			anIntArray546[local9] = (int) (Math.cos(local7 * (double) local9) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(23) int local23 = this.anInt6127 + this.anInt6127 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt6126 + this.anInt6126 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(68) int local68;
			@Pc(70) int local70;
			for (@Pc(48) int local48 = arg0 - this.anInt6127; local48 <= arg0 + this.anInt6127; local48++) {
				@Pc(60) int[][] local60 = this.method5997(local48 & Static179.anInt3689, 0);
				@Pc(64) int[][] local64 = new int[3][Static294.anInt5657];
				@Pc(66) int local66 = 0;
				local68 = 0;
				local70 = 0;
				@Pc(74) int[] local74 = local60[0];
				@Pc(78) int[] local78 = local60[1];
				@Pc(82) int[] local82 = local60[2];
				for (@Pc(86) int local86 = -this.anInt6126; local86 <= this.anInt6126; local86++) {
					@Pc(92) int local92 = local86 & Static329.anInt6352;
					local66 += local74[local92];
					local70 += local82[local92];
					local68 += local78[local92];
				}
				@Pc(119) int[] local119 = local64[0];
				@Pc(123) int[] local123 = local64[1];
				@Pc(127) int[] local127 = local64[2];
				@Pc(129) int local129 = 0;
				while (Static294.anInt5657 > local129) {
					local119[local129] = local66 * local39 >> 16;
					local123[local129] = local68 * local39 >> 16;
					local127[local129] = local39 * local70 >> 16;
					@Pc(163) int local163 = Static329.anInt6352 & local129 - this.anInt6126;
					local129++;
					local66 -= local74[local163];
					local68 -= local78[local163];
					local70 -= local82[local163];
					@Pc(190) int local190 = local129 + this.anInt6126 & Static329.anInt6352;
					local70 += local82[local190];
					local68 += local78[local190];
					local66 += local74[local190];
				}
				local42[local48 + this.anInt6127 - arg0] = local64;
			}
			@Pc(232) int[] local232 = local11[0];
			@Pc(236) int[] local236 = local11[1];
			@Pc(240) int[] local240 = local11[2];
			for (local68 = 0; local68 < Static294.anInt5657; local68++) {
				local70 = 0;
				@Pc(248) int local248 = 0;
				@Pc(250) int local250 = 0;
				for (@Pc(252) int local252 = 0; local252 < local23; local252++) {
					@Pc(258) int[][] local258 = local42[local252];
					local248 += local258[1][local68];
					local250 += local258[2][local68];
					local70 += local258[0][local68];
				}
				local232[local68] = local27 * local70 >> 16;
				local236[local68] = local27 * local248 >> 16;
				local240[local68] = local27 * local250 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6126 = arg0.method2548();
		} else if (arg1 == 1) {
			this.anInt6127 = arg0.method2548();
		} else if (arg1 == 2) {
			super.aBoolean446 = arg0.method2548() == 1;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(28) int local28 = this.anInt6127 + this.anInt6127 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt6126 + this.anInt6126 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(67) int local67;
			for (@Pc(52) int local52 = arg0 - this.anInt6127; local52 <= this.anInt6127 + arg0; local52++) {
				@Pc(62) int[] local62 = this.method6004(0, Static179.anInt3689 & local52);
				@Pc(65) int[] local65 = new int[Static294.anInt5657];
				local67 = 0;
				for (@Pc(71) int local71 = -this.anInt6126; local71 <= this.anInt6126; local71++) {
					local67 += local62[local71 & Static329.anInt6352];
				}
				@Pc(92) int local92 = 0;
				while (local92 < Static294.anInt5657) {
					local65[local92] = local44 * local67 >> 16;
					local67 -= local62[local92 - this.anInt6126 & Static329.anInt6352];
					local92++;
					local67 += local62[local92 + this.anInt6126 & Static329.anInt6352];
				}
				local47[this.anInt6127 + local52 - arg0] = local65;
			}
			for (@Pc(148) int local148 = 0; local148 < Static294.anInt5657; local148++) {
				@Pc(152) int local152 = 0;
				for (local67 = 0; local67 < local28; local67++) {
					local152 += local47[local67][local148];
				}
				local16[local148] = local32 * local152 >> 16;
			}
		}
		return local16;
	}
}
