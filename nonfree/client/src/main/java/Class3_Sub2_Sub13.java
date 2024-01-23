import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "[Lclient!vh;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.aClass2Array1 = new Class2[arg1.method3915()];
			for (@Pc(42) int local42 = 0; local42 < this.aClass2Array1.length; local42++) {
				@Pc(55) int local55 = arg1.method3915();
				if (local55 == 0) {
					this.aClass2Array1[local42] = Static4.method3421(arg1);
				} else if (local55 == 1) {
					this.aClass2Array1[local42] = Static37.method554(arg1);
				} else if (local55 == 2) {
					this.aClass2Array1[local42] = Static183.method3084(arg1);
				} else if (local55 == 3) {
					this.aClass2Array1[local42] = Static82.method1263(arg1);
				}
			}
		} else if (arg0 == 1) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[[I)V")
	private void method1351(@OriginalArg(1) int[][] arg0) {
		@Pc(13) int local13 = Static22.anInt421;
		@Pc(15) int local15 = Static62.anInt1150;
		Static230.method3786(arg0);
		Static289.method4754(Static84.anInt1566, Static148.anInt2810);
		if (this.aClass2Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass2Array1.length; local30++) {
			@Pc(40) Class2 local40 = this.aClass2Array1[local30];
			@Pc(43) int local43 = local40.anInt4977;
			@Pc(46) int local46 = local40.anInt4979;
			if (local43 < 0) {
				if (local46 >= 0) {
					local40.method4157(local13, local15);
				}
			} else if (local46 < 0) {
				local40.method4154(local13, local15);
			} else {
				local40.method4158(local13, local15);
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(13) int local13 = Static22.anInt421;
			@Pc(15) int local15 = Static62.anInt1150;
			@Pc(20) int[][][] local20 = this.aClass150_41.method3992();
			@Pc(24) int[][] local24 = new int[local15][local13];
			this.method1351(local24);
			for (@Pc(30) int local30 = 0; local30 < Static62.anInt1150; local30++) {
				@Pc(37) int[][] local37 = local20[local30];
				@Pc(41) int[] local41 = local37[0];
				@Pc(45) int[] local45 = local37[1];
				@Pc(49) int[] local49 = local24[local30];
				@Pc(53) int[] local53 = local37[2];
				for (@Pc(55) int local55 = 0; local55 < Static22.anInt421; local55++) {
					@Pc(66) int local66 = local49[local55];
					local53[local55] = (local66 & 0xFF) << 4;
					local45[local55] = local66 >> 4 & 0xFF0;
					local41[local55] = local66 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			this.method1351(this.aClass168_41.method4361());
		}
		return local12;
	}
}
