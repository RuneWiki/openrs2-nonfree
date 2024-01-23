import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class1_Sub2_Sub34 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tj", name = "V", descriptor = "[Lclient!td;")
	private Class12[] aClass12Array1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass12Array1 = new Class12[arg0.method2595()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass12Array1.length; local14++) {
				@Pc(27) int local27 = arg0.method2595();
				if (local27 == 0) {
					this.aClass12Array1[local14] = Static177.method1743(arg0);
				} else if (local27 == 1) {
					this.aClass12Array1[local14] = Static87.method1299(arg0);
				} else if (local27 == 2) {
					this.aClass12Array1[local14] = Static106.method1766(arg0);
				} else if (local27 == 3) {
					this.aClass12Array1[local14] = Static228.method624(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			this.method4067(this.aClass65_41.method1365());
		}
		return local15;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(19) int local19 = Static202.anInt4038;
			@Pc(21) int local21 = Static299.anInt5670;
			@Pc(26) int[][][] local26 = this.aClass151_41.method3755();
			@Pc(30) int[][] local30 = new int[local19][local21];
			this.method4067(local30);
			for (@Pc(36) int local36 = 0; local36 < Static202.anInt4038; local36++) {
				@Pc(43) int[][] local43 = local26[local36];
				@Pc(47) int[] local47 = local43[0];
				@Pc(51) int[] local51 = local43[1];
				@Pc(55) int[] local55 = local30[local36];
				@Pc(59) int[] local59 = local43[2];
				for (@Pc(61) int local61 = 0; local61 < Static299.anInt5670; local61++) {
					@Pc(72) int local72 = local55[local61];
					local59[local61] = (local72 & 0xFF) << 4;
					local51[local61] = local72 >> 4 & 0xFF0;
					local47[local61] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z[[I)V")
	private void method4067(@OriginalArg(1) int[][] arg0) {
		@Pc(11) int local11 = Static299.anInt5670;
		@Pc(13) int local13 = Static202.anInt4038;
		Static203.method3252(arg0);
		Static80.method1226(Static142.anInt2791, Static167.anInt3492);
		if (this.aClass12Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass12Array1.length; local29++) {
			@Pc(43) Class12 local43 = this.aClass12Array1[local29];
			@Pc(46) int local46 = local43.anInt5927;
			@Pc(49) int local49 = local43.anInt5930;
			if (local46 >= 0) {
				if (local49 < 0) {
					local43.method4660(local11, local13);
				} else {
					local43.method4665(local11, local13);
				}
			} else if (local49 >= 0) {
				local43.method4663(local13, local11);
			}
		}
	}
}
