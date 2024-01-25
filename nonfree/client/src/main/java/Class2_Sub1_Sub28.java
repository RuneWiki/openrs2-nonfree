import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub1_Sub28 extends Class2_Sub1 {

	@OriginalMember(owner = "client!q", name = "M", descriptor = "[Lclient!lf;")
	private Class43[] aClass43Array1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([[II)V")
	private void method4613(@OriginalArg(0) int[][] arg0) {
		@Pc(12) int local12 = Static391.anInt7118;
		@Pc(14) int local14 = Static299.anInt5583;
		Static287.method4735(arg0);
		Static85.method1458(Static67.anInt1510, Static235.anInt4676);
		if (this.aClass43Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass43Array1.length; local30++) {
			@Pc(37) Class43 local37 = this.aClass43Array1[local30];
			@Pc(40) int local40 = local37.anInt2476;
			@Pc(43) int local43 = local37.anInt2475;
			if (local40 < 0) {
				if (local43 >= 0) {
					local37.method2017(local14, local12);
				}
			} else if (local43 < 0) {
				local37.method2013(local12, local14);
			} else {
				local37.method2016(local12, local14);
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			this.method4613(super.aClass156_41.method3898());
		}
		return local9;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(22) int local22 = Static391.anInt7118;
			@Pc(24) int local24 = Static299.anInt5583;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass26_41.method353();
			this.method4613(local28);
			for (@Pc(41) int local41 = 0; local41 < Static299.anInt5583; local41++) {
				@Pc(47) int[] local47 = local28[local41];
				@Pc(51) int[][] local51 = local33[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static391.anInt7118; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.aClass43Array1 = new Class43[arg1.method5732()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass43Array1.length; local11++) {
				@Pc(17) int local17 = arg1.method5732();
				if (local17 == 0) {
					this.aClass43Array1[local11] = Static67.method1229(arg1);
				} else if (local17 == 1) {
					this.aClass43Array1[local11] = Static279.method4640(arg1);
				} else if (local17 == 2) {
					this.aClass43Array1[local11] = Static375.method5961(arg1);
				} else if (local17 == 3) {
					this.aClass43Array1[local11] = Static97.method1699(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean498 = arg1.method5732() == 1;
		}
	}
}
