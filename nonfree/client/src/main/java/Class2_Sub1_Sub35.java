import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ro", name = "Q", descriptor = "[Lclient!nd;")
	private Class13[] aClass13Array1;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			this.method3952(this.aClass174_41.method4335());
		}
		return local9;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(24) int local24 = Static64.anInt1560;
			@Pc(26) int local26 = Static281.anInt5558;
			@Pc(30) int[][] local30 = new int[local24][local26];
			@Pc(35) int[][][] local35 = this.aClass25_41.method657();
			this.method3952(local30);
			for (@Pc(41) int local41 = 0; local41 < Static64.anInt1560; local41++) {
				@Pc(52) int[] local52 = local30[local41];
				@Pc(56) int[][] local56 = local35[local41];
				@Pc(60) int[] local60 = local56[0];
				@Pc(64) int[] local64 = local56[1];
				@Pc(68) int[] local68 = local56[2];
				for (@Pc(70) int local70 = 0; local70 < Static281.anInt5558; local70++) {
					@Pc(81) int local81 = local52[local70];
					local68[local70] = (local81 & 0xFF) << 4;
					local64[local70] = local81 >> 4 & 0xFF0;
					local60[local70] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass13Array1 = new Class13[arg0.method2146()];
			for (@Pc(12) int local12 = 0; local12 < this.aClass13Array1.length; local12++) {
				@Pc(21) int local21 = arg0.method2146();
				if (local21 == 0) {
					this.aClass13Array1[local12] = Static87.method1549(arg0);
				} else if (local21 == 1) {
					this.aClass13Array1[local12] = Static89.method1575(arg0);
				} else if (local21 == 2) {
					this.aClass13Array1[local12] = Static41.method754(arg0);
				} else if (local21 == 3) {
					this.aClass13Array1[local12] = Static106.method1816(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([[IB)V")
	private void method3952(@OriginalArg(0) int[][] arg0) {
		@Pc(3) int local3 = Static64.anInt1560;
		@Pc(5) int local5 = Static281.anInt5558;
		Static268.method4229(arg0);
		Static188.method4590(Static107.anInt2459, Static226.anInt6054);
		if (this.aClass13Array1 == null) {
			return;
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass13Array1.length; local26++) {
			@Pc(40) Class13 local40 = this.aClass13Array1[local26];
			@Pc(43) int local43 = local40.anInt5540;
			@Pc(46) int local46 = local40.anInt5542;
			if (local46 >= 0) {
				if (local43 >= 0) {
					local40.method4389(local5, local3);
				} else {
					local40.method4392(local5, local3);
				}
			} else if (local43 >= 0) {
				local40.method4390(local3, local5);
			}
		}
	}
}
