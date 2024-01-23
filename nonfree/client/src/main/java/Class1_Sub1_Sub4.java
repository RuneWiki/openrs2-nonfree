import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "[Lclient!om;")
	private Class94[] aClass94Array1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(23) int local23 = Static6.anInt4960;
			@Pc(25) int local25 = Static213.anInt5511;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = this.aClass71_41.method1898();
			this.method212(local29);
			for (@Pc(40) int local40 = 0; local40 < Static213.anInt5511; local40++) {
				@Pc(47) int[] local47 = local29[local40];
				@Pc(51) int[][] local51 = local34[local40];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[2];
				@Pc(63) int[] local63 = local51[1];
				for (@Pc(65) int local65 = 0; local65 < Static6.anInt4960; local65++) {
					@Pc(76) int local76 = local47[local65];
					local59[local65] = (local76 & 0xFF) << 4;
					local63[local65] = local76 >> 4 & 0xFF0;
					local55[local65] = local76 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			this.method212(this.aClass190_41.method4649());
		}
		return local15;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([[IB)V")
	private void method212(@OriginalArg(0) int[][] arg0) {
		@Pc(3) int local3 = Static213.anInt5511;
		@Pc(9) int local9 = Static6.anInt4960;
		Static42.method781(arg0);
		Static4.method79(Static274.anInt5042, Static202.anInt3956);
		if (this.aClass94Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass94Array1.length; local28++) {
			@Pc(38) Class94 local38 = this.aClass94Array1[local28];
			@Pc(41) int local41 = local38.anInt3373;
			@Pc(44) int local44 = local38.anInt3369;
			if (local44 < 0) {
				if (local41 >= 0) {
					local38.method2965(local9, local3);
				}
			} else if (local41 < 0) {
				local38.method2964(local3, local9);
			} else {
				local38.method2966(local3, local9);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass94Array1 = new Class94[arg0.method1853()];
			for (@Pc(33) int local33 = 0; local33 < this.aClass94Array1.length; local33++) {
				@Pc(46) int local46 = arg0.method1853();
				if (local46 == 0) {
					this.aClass94Array1[local33] = Static193.method3323(arg0);
				} else if (local46 == 1) {
					this.aClass94Array1[local33] = Static68.method1299(arg0);
				} else if (local46 == 2) {
					this.aClass94Array1[local33] = Static28.method509(arg0);
				} else if (local46 == 3) {
					this.aClass94Array1[local33] = Static39.method672(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean505 = arg0.method1853() == 1;
		}
	}
}
