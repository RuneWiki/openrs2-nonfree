import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "[Lclient!ef;")
	private Class13[] aClass13Array1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([[II)V")
	private void method1521(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static76.anInt1531;
		@Pc(9) int local9 = Static30.anInt572;
		Static21.method306(arg0);
		Static38.method612(Static121.anInt2385, Static171.anInt3496);
		if (this.aClass13Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass13Array1.length; local27++) {
			@Pc(34) Class13 local34 = this.aClass13Array1[local27];
			@Pc(37) int local37 = local34.anInt3315;
			@Pc(40) int local40 = local34.anInt3322;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method2677(local7, local9);
				}
			} else if (local40 >= 0) {
				local34.method2676(local7, local9);
			} else {
				local34.method2680(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.aClass13Array1 = new Class13[arg1.method2142()];
			for (@Pc(18) int local18 = 0; local18 < this.aClass13Array1.length; local18++) {
				@Pc(24) int local24 = arg1.method2142();
				if (local24 == 0) {
					this.aClass13Array1[local18] = Static147.method2485(arg1);
				} else if (local24 == 1) {
					this.aClass13Array1[local18] = Static174.method3386(arg1);
				} else if (local24 == 2) {
					this.aClass13Array1[local18] = Static68.method1006(arg1);
				} else if (local24 == 3) {
					this.aClass13Array1[local18] = Static11.method178(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			this.method1521(super.aClass79_41.method2343());
		}
		return local11;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(25) int local25 = Static76.anInt1531;
			@Pc(27) int local27 = Static30.anInt572;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass56_41.method1555();
			this.method1521(local31);
			for (@Pc(42) int local42 = 0; local42 < Static30.anInt572; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static76.anInt1531; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}
}
