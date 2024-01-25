import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class7_Sub4_Sub18 extends Class7_Sub4 {

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "[Lclient!co;")
	private Class43[] aClass43Array1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(23) int local23 = Static201.anInt4174;
			@Pc(25) int local25 = Static216.anInt4322;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = super.aClass42_41.method1062();
			this.method3386(local29);
			for (@Pc(40) int local40 = 0; local40 < Static216.anInt4322; local40++) {
				@Pc(46) int[] local46 = local29[local40];
				@Pc(50) int[][] local50 = local34[local40];
				@Pc(54) int[] local54 = local50[0];
				@Pc(58) int[] local58 = local50[1];
				@Pc(62) int[] local62 = local50[2];
				for (@Pc(64) int local64 = 0; local64 < Static201.anInt4174; local64++) {
					@Pc(70) int local70 = local46[local64];
					local62[local64] = (local70 & 0xFF) << 4;
					local58[local64] = local70 >> 4 & 0xFF0;
					local54[local64] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			this.method3386(super.aClass219_41.method5704());
		}
		return local9;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B[[I)V")
	private void method3386(@OriginalArg(1) int[][] arg0) {
		@Pc(13) int local13 = Static201.anInt4174;
		@Pc(15) int local15 = Static216.anInt4322;
		Static339.method5513(arg0);
		Static204.method3623(Static153.anInt3263, Static110.anInt2508);
		if (this.aClass43Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass43Array1.length; local29++) {
			@Pc(36) Class43 local36 = this.aClass43Array1[local29];
			@Pc(39) int local39 = local36.anInt5550;
			@Pc(42) int local42 = local36.anInt5551;
			if (local39 >= 0) {
				if (local42 < 0) {
					local36.method4688(local13, local15);
				} else {
					local36.method4686(local13, local15);
				}
			} else if (local42 >= 0) {
				local36.method4692(local13, local15);
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass43Array1 = new Class43[arg0.method2772()];
			for (@Pc(26) int local26 = 0; local26 < this.aClass43Array1.length; local26++) {
				@Pc(32) int local32 = arg0.method2772();
				if (local32 == 0) {
					this.aClass43Array1[local26] = Static51.method1095(arg0);
				} else if (local32 == 1) {
					this.aClass43Array1[local26] = Static151.method2965(arg0);
				} else if (local32 == 2) {
					this.aClass43Array1[local26] = Static168.method3216(arg0);
				} else if (local32 == 3) {
					this.aClass43Array1[local26] = Static163.method3129(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean481 = arg0.method2772() == 1;
		}
	}
}
