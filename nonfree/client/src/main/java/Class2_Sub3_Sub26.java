import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub3_Sub26 extends Class2_Sub3 {

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "[Lclient!ch;")
	private Class15[] aClass15Array1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(10) int[] local10 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			this.method2314(super.aClass51_41.method1728());
		}
		return local10;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(18) int local18 = Static53.anInt1184;
			@Pc(20) int local20 = Static34.anInt889;
			@Pc(24) int[][] local24 = new int[local20][local18];
			@Pc(29) int[][][] local29 = super.aClass43_41.method1443();
			this.method2314(local24);
			for (@Pc(35) int local35 = 0; local35 < Static34.anInt889; local35++) {
				@Pc(41) int[] local41 = local24[local35];
				@Pc(45) int[][] local45 = local29[local35];
				@Pc(49) int[] local49 = local45[1];
				@Pc(53) int[] local53 = local45[0];
				@Pc(57) int[] local57 = local45[2];
				for (@Pc(59) int local59 = 0; local59 < Static53.anInt1184; local59++) {
					@Pc(65) int local65 = local41[local59];
					local57[local59] = (local65 & 0xFF) << 4;
					local49[local59] = local65 >> 4 & 0xFF0;
					local53[local59] = local65 >> 12 & 0xFF0;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[[I)V")
	private void method2314(@OriginalArg(1) int[][] arg0) {
		@Pc(3) int local3 = Static53.anInt1184;
		@Pc(9) int local9 = Static34.anInt889;
		Static8.method1794(arg0);
		Static86.method2729(Static134.anInt2915, Static27.anInt588);
		if (this.aClass15Array1 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < this.aClass15Array1.length; local25++) {
			@Pc(32) Class15 local32 = this.aClass15Array1[local25];
			@Pc(35) int local35 = local32.anInt587;
			@Pc(38) int local38 = local32.anInt586;
			if (local35 >= 0) {
				if (local38 >= 0) {
					local32.method481(local9, local3);
				} else {
					local32.method483(local9, local3);
				}
			} else if (local38 >= 0) {
				local32.method486(local3, local9);
			}
		}
	}
}
