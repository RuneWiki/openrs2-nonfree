import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "[Lclient!rc;")
	private Class5[] aClass5Array1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(24) int local24 = Static176.anInt3921;
			@Pc(26) int local26 = Static112.anInt2736;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(37) int[][][] local37 = super.aClass39_41.method1378();
			this.method2873(local30);
			for (@Pc(45) int local45 = 0; local45 < Static112.anInt2736; local45++) {
				@Pc(51) int[] local51 = local30[local45];
				@Pc(55) int[][] local55 = local37[local45];
				@Pc(59) int[] local59 = local55[0];
				@Pc(63) int[] local63 = local55[2];
				@Pc(67) int[] local67 = local55[1];
				for (@Pc(69) int local69 = 0; local69 < Static176.anInt3921; local69++) {
					@Pc(75) int local75 = local51[local69];
					local63[local69] = (local75 & 0xFF) << 4;
					local67[local69] = local75 >> 4 & 0xFF0;
					local59[local69] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.aClass5Array1 = new Class5[arg1.method1738()];
			for (@Pc(35) int local35 = 0; local35 < this.aClass5Array1.length; local35++) {
				@Pc(41) int local41 = arg1.method1738();
				if (local41 == 0) {
					this.aClass5Array1[local35] = Static116.method2135(arg1);
				} else if (local41 == 1) {
					this.aClass5Array1[local35] = Static22.method403(arg1);
				} else if (local41 == 2) {
					this.aClass5Array1[local35] = Static108.method1980(arg1);
				} else if (local41 == 3) {
					this.aClass5Array1[local35] = Static82.method1440(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([[II)V")
	private void method2873(@OriginalArg(0) int[][] arg0) {
		@Pc(3) int local3 = Static176.anInt3921;
		@Pc(14) int local14 = Static112.anInt2736;
		Static2.method51(arg0);
		Static192.method3156(Static134.anInt3338, Static70.anInt1730);
		if (this.aClass5Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass5Array1.length; local28++) {
			@Pc(35) Class5 local35 = this.aClass5Array1[local28];
			@Pc(38) int local38 = local35.anInt2783;
			@Pc(41) int local41 = local35.anInt2786;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method2105(local14, local3);
				}
			} else if (local41 < 0) {
				local35.method2104(local14, local3);
			} else {
				local35.method2102(local3, local14);
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			this.method2873(super.aClass80_41.method2877());
		}
		return local5;
	}
}
