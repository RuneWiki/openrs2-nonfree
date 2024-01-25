import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class6_Sub1_Sub36 extends Class6_Sub1 {

	@OriginalMember(owner = "client!us", name = "J", descriptor = "[F")
	public static final float[] aFloatArray75 = new float[16384];

	@OriginalMember(owner = "client!us", name = "D", descriptor = "[F")
	public static final float[] aFloatArray74 = new float[16384];

	@OriginalMember(owner = "client!us", name = "K", descriptor = "[Lclient!hm;")
	private Class35[] aClass35Array1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray75[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray74[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.aClass35Array1 = new Class35[arg1.method8246()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass35Array1.length; local11++) {
				@Pc(17) int local17 = arg1.method8246();
				if (local17 == 0) {
					this.aClass35Array1[local11] = Static448.method6824(arg1);
				} else if (local17 == 1) {
					this.aClass35Array1[local11] = Static209.method3768(arg1);
				} else if (local17 == 2) {
					this.aClass35Array1[local11] = Static455.method6885(arg1);
				} else if (local17 == 3) {
					this.aClass35Array1[local11] = Static522.method7448(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean842 = arg1.method8246() == 1;
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(25) int local25 = Static53.anInt1787;
			@Pc(27) int local27 = Static123.anInt3099;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass239_41.method6265();
			this.method8075(local31);
			for (@Pc(42) int local42 = 0; local42 < Static123.anInt3099; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static53.anInt1787; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z[[I)V")
	private void method8075(@OriginalArg(1) int[][] arg0) {
		@Pc(11) int local11 = Static53.anInt1787;
		@Pc(13) int local13 = Static123.anInt3099;
		Static267.method4827(arg0);
		Static421.method2402(Static564.anInt9697, Static117.anInt3013);
		if (this.aClass35Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass35Array1.length; local27++) {
			@Pc(34) Class35 local34 = this.aClass35Array1[local27];
			@Pc(37) int local37 = local34.anInt9246;
			@Pc(40) int local40 = local34.anInt9243;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method7552(local13, local11);
				}
			} else if (local40 >= 0) {
				local34.method7547(local11, local13);
			} else {
				local34.method7551(local11, local13);
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			this.method8075(super.aClass24_41.method789());
		}
		return local9;
	}
}
