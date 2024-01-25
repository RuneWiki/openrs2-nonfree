import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class4_Sub6_Sub8 extends Class4_Sub6 {

	@OriginalMember(owner = "client!er", name = "G", descriptor = "[Lclient!cc;")
	private Class27[] aClass27Array1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(23) int local23 = Static80.anInt1616;
			@Pc(25) int local25 = Static262.anInt4939;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = super.aClass153_41.method3680();
			this.method1699(local29);
			for (@Pc(40) int local40 = 0; local40 < Static262.anInt4939; local40++) {
				@Pc(46) int[] local46 = local29[local40];
				@Pc(50) int[][] local50 = local34[local40];
				@Pc(54) int[] local54 = local50[0];
				@Pc(58) int[] local58 = local50[1];
				@Pc(62) int[] local62 = local50[2];
				for (@Pc(64) int local64 = 0; local64 < Static80.anInt1616; local64++) {
					@Pc(70) int local70 = local46[local64];
					local62[local64] = (local70 & 0xFF) << 4;
					local58[local64] = local70 >> 4 & 0xFF0;
					local54[local64] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			this.method1699(super.aClass82_41.method2263());
		}
		return local9;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([[IB)V")
	private void method1699(@OriginalArg(0) int[][] arg0) {
		@Pc(11) int local11 = Static80.anInt1616;
		@Pc(13) int local13 = Static262.anInt4939;
		Static343.method747(arg0);
		Static451.method5012(Static203.anInt3883, Static211.anInt3929);
		if (this.aClass27Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass27Array1.length; local27++) {
			@Pc(34) Class27 local34 = this.aClass27Array1[local27];
			@Pc(37) int local37 = local34.anInt5155;
			@Pc(40) int local40 = local34.anInt5152;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method3935(local13, local11);
				}
			} else if (local40 >= 0) {
				local34.method3936(local13, local11);
			} else {
				local34.method3939(local13, local11);
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.aClass27Array1 = new Class27[arg1.method2490()];
			for (@Pc(41) int local41 = 0; local41 < this.aClass27Array1.length; local41++) {
				@Pc(47) int local47 = arg1.method2490();
				if (local47 == 0) {
					this.aClass27Array1[local41] = Static61.method994(arg1);
				} else if (local47 == 1) {
					this.aClass27Array1[local41] = Static393.method5149(arg1);
				} else if (local47 == 2) {
					this.aClass27Array1[local41] = Static78.method1389(arg1);
				} else if (local47 == 3) {
					this.aClass27Array1[local41] = Static386.method3235(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean665 = arg1.method2490() == 1;
			return;
		}
	}
}
