import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class1_Sub4_Sub34 extends Class1_Sub4 {

	@OriginalMember(owner = "client!sv", name = "E", descriptor = "[Lclient!ge;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			this.method5130(super.aClass15_41.method507());
		}
		return local11;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.aClass85Array1 = new Class85[arg1.method5366()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass85Array1.length; local11++) {
				@Pc(17) int local17 = arg1.method5366();
				if (local17 == 0) {
					this.aClass85Array1[local11] = Static37.method689(arg1);
				} else if (local17 == 1) {
					this.aClass85Array1[local11] = Static189.method2963(arg1);
				} else if (local17 == 2) {
					this.aClass85Array1[local11] = Static327.method4648(arg1);
				} else if (local17 == 3) {
					this.aClass85Array1[local11] = Static391.method5235(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z[[I)V")
	private void method5130(@OriginalArg(1) int[][] arg0) {
		@Pc(11) int local11 = Static66.anInt1511;
		@Pc(13) int local13 = Static61.anInt1456;
		Static96.method1724(arg0);
		Static161.method2622(Static393.anInt6315, Static67.anInt1514);
		if (this.aClass85Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass85Array1.length; local27++) {
			@Pc(34) Class85 local34 = this.aClass85Array1[local27];
			@Pc(37) int local37 = local34.anInt7166;
			@Pc(40) int local40 = local34.anInt7170;
			if (local37 >= 0) {
				if (local40 < 0) {
					local34.method5867(local11, local13);
				} else {
					local34.method5870(local13, local11);
				}
			} else if (local40 >= 0) {
				local34.method5869(local11, local13);
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(25) int local25 = Static66.anInt1511;
			@Pc(27) int local27 = Static61.anInt1456;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass34_41.method817();
			this.method5130(local31);
			for (@Pc(42) int local42 = 0; local42 < Static61.anInt1456; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static66.anInt1511; local66++) {
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
