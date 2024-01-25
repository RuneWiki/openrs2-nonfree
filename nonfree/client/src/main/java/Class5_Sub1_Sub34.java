import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class5_Sub1_Sub34 extends Class5_Sub1 {

	@OriginalMember(owner = "client!td", name = "K", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[16384];

	@OriginalMember(owner = "client!td", name = "B", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[16384];

	@OriginalMember(owner = "client!td", name = "E", descriptor = "[Lclient!sn;")
	private Class52[] aClass52Array1;

	static {
		@Pc(11) double local11 = 3.834951969714103E-4D;
		for (@Pc(13) int local13 = 0; local13 < 16384; local13++) {
			aFloatArray65[local13] = (float) Math.sin(local11 * (double) local13);
			aFloatArray66[local13] = (float) Math.cos(local11 * (double) local13);
		}
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.aClass52Array1 = new Class52[arg1.method4220()];
			for (@Pc(15) int local15 = 0; local15 < this.aClass52Array1.length; local15++) {
				@Pc(21) int local21 = arg1.method4220();
				if (local21 == 0) {
					this.aClass52Array1[local15] = Static239.method4075(arg1);
				} else if (local21 == 1) {
					this.aClass52Array1[local15] = Static185.method3137(arg1);
				} else if (local21 == 2) {
					this.aClass52Array1[local15] = Static11.method320(arg1);
				} else if (local21 == 3) {
					this.aClass52Array1[local15] = Static536.method7294(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean642 = arg1.method4220() == 1;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[[I)V")
	private void method6501(@OriginalArg(1) int[][] arg0) {
		@Pc(11) int local11 = Static147.anInt3075;
		@Pc(13) int local13 = Static250.anInt5057;
		Static229.method3770(arg0);
		Static397.method5786(Static497.anInt9138, Static160.anInt3274);
		if (this.aClass52Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass52Array1.length; local27++) {
			@Pc(34) Class52 local34 = this.aClass52Array1[local27];
			@Pc(37) int local37 = local34.anInt6838;
			@Pc(40) int local40 = local34.anInt6843;
			if (local37 >= 0) {
				if (local40 >= 0) {
					local34.method5581(local11, local13);
				} else {
					local34.method5586(local11, local13);
				}
			} else if (local40 >= 0) {
				local34.method5584(local11, local13);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(25) int local25 = Static147.anInt3075;
			@Pc(27) int local27 = Static250.anInt5057;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass249_41.method5985();
			this.method6501(local31);
			for (@Pc(42) int local42 = 0; local42 < Static250.anInt5057; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static147.anInt3075; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			this.method6501(super.aClass104_41.method2754());
		}
		return local17;
	}
}
