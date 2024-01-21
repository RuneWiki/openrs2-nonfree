import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class5_Sub1_Sub38 extends Class5_Sub1 {

	@OriginalMember(owner = "client!wf", name = "T", descriptor = "[Lclient!sa;")
	private Class54[] aClass54Array1;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			this.method3177(super.aClass101_41.method2885());
		}
		return local9;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(18) int local18 = Static174.anInt3489;
			@Pc(20) int local20 = Static207.anInt4072;
			@Pc(25) int[][][] local25 = super.aClass105_41.method3108();
			@Pc(29) int[][] local29 = new int[local20][local18];
			this.method3177(local29);
			for (@Pc(35) int local35 = 0; local35 < Static207.anInt4072; local35++) {
				@Pc(41) int[][] local41 = local25[local35];
				@Pc(45) int[] local45 = local41[0];
				@Pc(49) int[] local49 = local29[local35];
				@Pc(53) int[] local53 = local41[2];
				@Pc(57) int[] local57 = local41[1];
				for (@Pc(59) int local59 = 0; local59 < Static174.anInt3489; local59++) {
					@Pc(65) int local65 = local49[local59];
					local53[local59] = (local65 & 0xFF) << 4;
					local57[local59] = local65 >> 4 & 0xFF0;
					local45[local59] = local65 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass54Array1 = new Class54[arg0.method3062()];
			for (@Pc(25) int local25 = 0; local25 < this.aClass54Array1.length; local25++) {
				@Pc(31) int local31 = arg0.method3062();
				if (local31 == 0) {
					this.aClass54Array1[local25] = Static172.method2768(arg0);
				} else if (local31 == 1) {
					this.aClass54Array1[local25] = Static111.method1784(arg0);
				} else if (local31 == 2) {
					this.aClass54Array1[local25] = Static144.method2237(arg0);
				} else if (local31 == 3) {
					this.aClass54Array1[local25] = Static213.method3131(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([[IB)V")
	private void method3177(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static174.anInt3489;
		@Pc(9) int local9 = Static207.anInt4072;
		Static105.method1714(arg0);
		Static157.method2389(Static189.anInt3753, Static3.anInt74);
		if (this.aClass54Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass54Array1.length; local30++) {
			@Pc(37) Class54 local37 = this.aClass54Array1[local30];
			@Pc(40) int local40 = local37.anInt3663;
			@Pc(43) int local43 = local37.anInt3666;
			if (local40 < 0) {
				if (local43 >= 0) {
					local37.method2770(local7, local9);
				}
			} else if (local43 >= 0) {
				local37.method2769(local7, local9);
			} else {
				local37.method2767(local9, local7);
			}
		}
	}
}
