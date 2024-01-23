import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "[Lclient!hc;")
	private Class68[] aClass68Array1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(25) int local25 = Static75.anInt1848;
			@Pc(27) int local27 = Static6.anInt2264;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = this.aClass70_41.method1658();
			this.method2964(local31);
			for (@Pc(42) int local42 = 0; local42 < Static6.anInt2264; local42++) {
				@Pc(53) int[] local53 = local31[local42];
				@Pc(57) int[][] local57 = local36[local42];
				@Pc(61) int[] local61 = local57[0];
				@Pc(65) int[] local65 = local57[1];
				@Pc(69) int[] local69 = local57[2];
				for (@Pc(71) int local71 = 0; local71 < Static75.anInt1848; local71++) {
					@Pc(78) int local78 = local53[local71];
					local69[local71] = (local78 & 0xFF) << 4;
					local65[local71] = local78 >> 4 & 0xFF0;
					local61[local71] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			this.method2964(this.aClass114_41.method3365());
		}
		return local9;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[[I)V")
	private void method2964(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static6.anInt2264;
		@Pc(9) int local9 = Static75.anInt1848;
		Static180.method3279(arg0);
		Static244.method4189(Static145.anInt3482, Static178.anInt4007);
		if (this.aClass68Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass68Array1.length; local30++) {
			@Pc(40) Class68 local40 = this.aClass68Array1[local30];
			@Pc(43) int local43 = local40.anInt6056;
			@Pc(46) int local46 = local40.anInt6058;
			if (local43 >= 0) {
				if (local46 >= 0) {
					local40.method4687(local9, local7);
				} else {
					local40.method4686(local7, local9);
				}
			} else if (local46 >= 0) {
				local40.method4690(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass68Array1 = new Class68[arg0.method2655()];
			for (@Pc(19) int local19 = 0; local19 < this.aClass68Array1.length; local19++) {
				@Pc(34) int local34 = arg0.method2655();
				if (local34 == 0) {
					this.aClass68Array1[local19] = Static104.method837(arg0);
				} else if (local34 == 1) {
					this.aClass68Array1[local19] = Static55.method1118(arg0);
				} else if (local34 == 2) {
					this.aClass68Array1[local19] = Static164.method3043(arg0);
				} else if (local34 == 3) {
					this.aClass68Array1[local19] = Static134.method2294(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}
}
