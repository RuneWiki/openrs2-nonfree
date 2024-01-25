import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class3_Sub2_Sub31 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tda", name = "B", descriptor = "[Lclient!pu;")
	private Class141[] aClass141Array1;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(22) int[] local22 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			this.method7920(super.aClass40_41.method1571());
		}
		return local22;
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(22) int local22 = Static491.anInt8519;
			@Pc(24) int local24 = Static336.anInt6310;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass193_41.method4795();
			this.method7920(local28);
			for (@Pc(39) int local39 = 0; local39 < Static336.anInt6310; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static491.anInt8519; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "([[II)V")
	private void method7920(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static491.anInt8519;
		@Pc(9) int local9 = Static336.anInt6310;
		Static542.method7934(arg0);
		Static520.method8085(Class4_Sub1_Sub3_Sub2.lb, Static309.anInt5846);
		if (this.aClass141Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass141Array1.length; local23++) {
			@Pc(30) Class141 local30 = this.aClass141Array1[local23];
			@Pc(33) int local33 = local30.anInt8957;
			@Pc(36) int local36 = local30.anInt8951;
			if (local33 >= 0) {
				if (local36 < 0) {
					local30.method7715(local7, local9);
				} else {
					local30.method7716(local7, local9);
				}
			} else if (local36 >= 0) {
				local30.method7719(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass141Array1 = new Class141[arg0.method4225()];
			for (@Pc(16) int local16 = 0; local16 < this.aClass141Array1.length; local16++) {
				@Pc(22) int local22 = arg0.method4225();
				if (local22 == 0) {
					this.aClass141Array1[local16] = Static7.method2303(arg0);
				} else if (local22 == 1) {
					this.aClass141Array1[local16] = Static155.method2827(arg0);
				} else if (local22 == 2) {
					this.aClass141Array1[local16] = Static399.method6440(arg0);
				} else if (local22 == 3) {
					this.aClass141Array1[local16] = Static219.method3680(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean720 = arg0.method4225() == 1;
		}
	}
}
