import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class2_Sub2_Sub31 extends Class2_Sub2 {

	@OriginalMember(owner = "client!s", name = "W", descriptor = "[Lclient!dc;")
	private Class4[] aClass4Array1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[[I)V")
	private void method3067(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static57.anInt1795;
		@Pc(9) int local9 = Static106.anInt3045;
		Static37.method833(arg0);
		Static144.method2913(Static96.anInt3099, Static53.anInt1668);
		if (this.aClass4Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass4Array1.length; local23++) {
			@Pc(30) Class4 local30 = this.aClass4Array1[local23];
			@Pc(33) int local33 = local30.anInt3069;
			@Pc(36) int local36 = local30.anInt3072;
			if (local36 < 0) {
				if (local33 >= 0) {
					local30.method2413(local7, local9);
				}
			} else if (local33 < 0) {
				local30.method2415(local9, local7);
			} else {
				local30.method2411(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			this.method3067(super.aClass57_41.method2572());
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.aClass4Array1 = new Class4[arg1.method218()];
			for (@Pc(19) int local19 = 0; local19 < this.aClass4Array1.length; local19++) {
				@Pc(25) int local25 = arg1.method218();
				if (local25 == 0) {
					this.aClass4Array1[local19] = Static25.method621(arg1);
				} else if (local25 == 1) {
					this.aClass4Array1[local19] = Static43.method945(arg1);
				} else if (local25 == 2) {
					this.aClass4Array1[local19] = Static100.method2284(arg1);
				} else if (local25 == 3) {
					this.aClass4Array1[local19] = Static116.method2529(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(25) int local25 = Static57.anInt1795;
			@Pc(27) int local27 = Static106.anInt3045;
			@Pc(32) int[][][] local32 = super.aClass90_41.method3441();
			@Pc(36) int[][] local36 = new int[local25][local27];
			this.method3067(local36);
			for (@Pc(42) int local42 = 0; local42 < Static57.anInt1795; local42++) {
				@Pc(48) int[] local48 = local36[local42];
				@Pc(52) int[][] local52 = local32[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static106.anInt3045; local66++) {
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
