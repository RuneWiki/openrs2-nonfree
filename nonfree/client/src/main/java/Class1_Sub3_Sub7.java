import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "[Lclient!tn;")
	private Class15[] aClass15Array1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			this.method1097(this.aClass122_41.method3153());
		}
		return local9;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[I)V")
	private void method1097(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static227.anInt4511;
		@Pc(9) int local9 = Static26.anInt632;
		Static171.method2930(arg0);
		Static135.method2307(Static202.anInt4099, Static229.anInt4527);
		if (this.aClass15Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass15Array1.length; local27++) {
			@Pc(37) Class15 local37 = this.aClass15Array1[local27];
			@Pc(40) int local40 = local37.anInt5624;
			@Pc(43) int local43 = local37.anInt5625;
			if (local40 < 0) {
				if (local43 >= 0) {
					local37.method4464(local7, local9);
				}
			} else if (local43 < 0) {
				local37.method4465(local9, local7);
			} else {
				local37.method4463(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(25) int local25 = Static227.anInt4511;
			@Pc(27) int local27 = Static26.anInt632;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = this.aClass56_41.method1594();
			this.method1097(local31);
			for (@Pc(42) int local42 = 0; local42 < Static26.anInt632; local42++) {
				@Pc(53) int[] local53 = local31[local42];
				@Pc(57) int[][] local57 = local36[local42];
				@Pc(61) int[] local61 = local57[0];
				@Pc(65) int[] local65 = local57[1];
				@Pc(69) int[] local69 = local57[2];
				for (@Pc(71) int local71 = 0; local71 < Static227.anInt4511; local71++) {
					@Pc(82) int local82 = local53[local71];
					local69[local71] = (local82 & 0xFF) << 4;
					local65[local71] = local82 >> 4 & 0xFF0;
					local61[local71] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass15Array1 = new Class15[arg0.method2690()];
			for (@Pc(23) int local23 = 0; local23 < this.aClass15Array1.length; local23++) {
				@Pc(32) int local32 = arg0.method2690();
				if (local32 == 0) {
					this.aClass15Array1[local23] = Static39.method821(arg0);
				} else if (local32 == 1) {
					this.aClass15Array1[local23] = Static125.method2184(arg0);
				} else if (local32 == 2) {
					this.aClass15Array1[local23] = Static109.method2011(arg0);
				} else if (local32 == 3) {
					this.aClass15Array1[local23] = Static284.method4272(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}
}
