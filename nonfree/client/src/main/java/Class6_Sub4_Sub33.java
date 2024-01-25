import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class6_Sub4_Sub33 extends Class6_Sub4 {

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "[Lclient!ph;")
	private Class79[] aClass79Array1;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(25) int local25 = Static408.anInt7209;
			@Pc(27) int local27 = Static88.anInt1743;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass27_41.method907();
			this.method6820(local31);
			for (@Pc(42) int local42 = 0; local42 < Static88.anInt1743; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static408.anInt7209; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			this.method6820(super.aClass187_41.method4557());
		}
		return local9;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.aClass79Array1 = new Class79[arg1.method6069()];
			for (@Pc(26) int local26 = 0; local26 < this.aClass79Array1.length; local26++) {
				@Pc(32) int local32 = arg1.method6069();
				if (local32 == 0) {
					this.aClass79Array1[local26] = Static16.method369(arg1);
				} else if (local32 == 1) {
					this.aClass79Array1[local26] = Static455.method6425(arg1);
				} else if (local32 == 2) {
					this.aClass79Array1[local26] = Static308.method4872(arg1);
				} else if (local32 == 3) {
					this.aClass79Array1[local26] = Static71.method1414(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean728 = arg1.method6069() == 1;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B[[I)V")
	private void method6820(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static408.anInt7209;
		@Pc(9) int local9 = Static88.anInt1743;
		Static578.method7715(arg0);
		Static157.method2948(Static457.anInt7873, Static368.anInt6505);
		if (this.aClass79Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass79Array1.length; local27++) {
			@Pc(34) Class79 local34 = this.aClass79Array1[local27];
			@Pc(37) int local37 = local34.anInt9201;
			@Pc(40) int local40 = local34.anInt9202;
			if (local37 >= 0) {
				if (local40 < 0) {
					local34.method7541(local7, local9);
				} else {
					local34.method7540(local7, local9);
				}
			} else if (local40 >= 0) {
				local34.method7543(local9, local7);
			}
		}
	}
}
