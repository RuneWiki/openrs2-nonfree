import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class2_Sub7_Sub10 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "[Lclient!oh;")
	private Class116[] aClass116Array1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.aClass116Array1 = new Class116[arg1.method5170()];
			for (@Pc(15) int local15 = 0; local15 < this.aClass116Array1.length; local15++) {
				@Pc(21) int local21 = arg1.method5170();
				if (local21 == 0) {
					this.aClass116Array1[local15] = Static104.method1937(arg1);
				} else if (local21 == 1) {
					this.aClass116Array1[local15] = Static71.method1452(arg1);
				} else if (local21 == 2) {
					this.aClass116Array1[local15] = Static282.method4469(arg1);
				} else if (local21 == 3) {
					this.aClass116Array1[local15] = Static392.method6273(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[[I)V")
	private void method2561(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static352.anInt6485;
		@Pc(9) int local9 = Static79.anInt1658;
		Static466.method7018(arg0);
		Static223.method3512(Static38.anInt733, Static126.anInt7690);
		if (this.aClass116Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass116Array1.length; local23++) {
			@Pc(30) Class116 local30 = this.aClass116Array1[local23];
			@Pc(33) int local33 = local30.anInt7709;
			@Pc(36) int local36 = local30.anInt7706;
			if (local33 >= 0) {
				if (local36 >= 0) {
					local30.method6465(local7, local9);
				} else {
					local30.method6467(local7, local9);
				}
			} else if (local36 >= 0) {
				local30.method6462(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(24) int local24 = Static352.anInt6485;
			@Pc(26) int local26 = Static79.anInt1658;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(35) int[][][] local35 = super.aClass180_41.method4530();
			this.method2561(local30);
			for (@Pc(41) int local41 = 0; local41 < Static79.anInt1658; local41++) {
				@Pc(47) int[] local47 = local30[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static352.anInt6485; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			this.method2561(super.aClass221_41.method5900());
		}
		return local9;
	}
}
