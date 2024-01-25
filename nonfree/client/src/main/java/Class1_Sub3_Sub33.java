import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class1_Sub3_Sub33 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rq", name = "E", descriptor = "[Lclient!ss;")
	private Class10[] aClass10Array1;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[[I)V")
	private void method6196(@OriginalArg(1) int[][] arg0) {
		@Pc(15) int local15 = Static452.anInt7734;
		@Pc(17) int local17 = Static272.anInt5156;
		Static84.method1453(arg0);
		Static289.method4666(Static323.anInt5914, Static80.anInt1453);
		if (this.aClass10Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass10Array1.length; local31++) {
			@Pc(38) Class10 local38 = this.aClass10Array1[local31];
			@Pc(41) int local41 = local38.anInt7903;
			@Pc(44) int local44 = local38.anInt7906;
			if (local41 < 0) {
				if (local44 >= 0) {
					local38.method6571(local17, local15);
				}
			} else if (local44 < 0) {
				local38.method6568(local15, local17);
			} else {
				local38.method6570(local17, local15);
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass10Array1 = new Class10[arg0.method3922()];
			for (@Pc(18) int local18 = 0; local18 < this.aClass10Array1.length; local18++) {
				@Pc(24) int local24 = arg0.method3922();
				if (local24 == 0) {
					this.aClass10Array1[local18] = Static182.method2886(arg0);
				} else if (local24 == 1) {
					this.aClass10Array1[local18] = Static156.method2465(arg0);
				} else if (local24 == 2) {
					this.aClass10Array1[local18] = Static101.method6351(arg0);
				} else if (local24 == 3) {
					this.aClass10Array1[local18] = Static265.method4396(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean614 = arg0.method3922() == 1;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(22) int local22 = Static452.anInt7734;
			@Pc(24) int local24 = Static272.anInt5156;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass225_41.method5317();
			this.method6196(local28);
			for (@Pc(39) int local39 = 0; local39 < Static272.anInt5156; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static452.anInt7734; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			this.method6196(super.aClass12_41.method505());
		}
		return local19;
	}
}
