import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cda", name = "J", descriptor = "[Lclient!tr;")
	private Class82[] aClass82Array1;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			this.method1547(super.aClass227_41.method5675());
		}
		return local9;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I[[I)V")
	private void method1547(@OriginalArg(1) int[][] arg0) {
		@Pc(12) int local12 = Static236.anInt4609;
		@Pc(14) int local14 = Static95.anInt2365;
		Static96.method2190(arg0);
		Static13.method705(Static36.anInt1319, Static226.anInt4534);
		if (this.aClass82Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass82Array1.length; local28++) {
			@Pc(35) Class82 local35 = this.aClass82Array1[local28];
			@Pc(38) int local38 = local35.anInt6513;
			@Pc(41) int local41 = local35.anInt6516;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method5660(local14, local12);
				}
			} else if (local41 >= 0) {
				local35.method5661(local14, local12);
			} else {
				local35.method5659(local12, local14);
			}
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass82Array1 = new Class82[arg0.method3043()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass82Array1.length; local14++) {
				@Pc(20) int local20 = arg0.method3043();
				if (local20 == 0) {
					this.aClass82Array1[local14] = Static389.method5865(arg0);
				} else if (local20 == 1) {
					this.aClass82Array1[local14] = Static515.method7352(arg0);
				} else if (local20 == 2) {
					this.aClass82Array1[local14] = Static401.method6050(arg0);
				} else if (local20 == 3) {
					this.aClass82Array1[local14] = Static429.method6339(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean652 = arg0.method3043() == 1;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(22) int local22 = Static236.anInt4609;
			@Pc(24) int local24 = Static95.anInt2365;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass233_41.method5784();
			this.method1547(local28);
			for (@Pc(39) int local39 = 0; local39 < Static95.anInt2365; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static236.anInt4609; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
