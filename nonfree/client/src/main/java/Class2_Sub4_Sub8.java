import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class2_Sub4_Sub8 extends Class2_Sub4 {

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "[Lclient!eb;")
	private Class24[] aClass24Array1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([[IZ)V")
	private void method883(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static118.anInt2608;
		@Pc(17) int local17 = Static38.anInt3056;
		Static82.method1167(arg0);
		Static89.method1270(Static167.anInt3559, Static82.anInt1734);
		if (this.aClass24Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass24Array1.length; local31++) {
			@Pc(38) Class24 local38 = this.aClass24Array1[local31];
			@Pc(41) int local41 = local38.anInt4287;
			@Pc(44) int local44 = local38.anInt4288;
			if (local44 >= 0) {
				if (local41 < 0) {
					local38.method3007(local17, local7);
				} else {
					local38.method3002(local17, local7);
				}
			} else if (local41 >= 0) {
				local38.method2999(local7, local17);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.aClass24Array1 = new Class24[arg1.method1534()];
			for (@Pc(23) int local23 = 0; local23 < this.aClass24Array1.length; local23++) {
				@Pc(31) int local31 = arg1.method1534();
				if (local31 == 0) {
					this.aClass24Array1[local23] = Static24.method435(arg1);
				} else if (local31 == 1) {
					this.aClass24Array1[local23] = Static28.method485(arg1);
				} else if (local31 == 2) {
					this.aClass24Array1[local23] = Static154.method2293(arg1);
				} else if (local31 == 3) {
					this.aClass24Array1[local23] = Static143.method2156(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			this.method883(super.aClass78_41.method2315());
		}
		return local5;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(22) int local22 = Static118.anInt2608;
			@Pc(24) int local24 = Static38.anInt3056;
			@Pc(31) int[][][] local31 = super.aClass99_41.method2749();
			@Pc(35) int[][] local35 = new int[local24][local22];
			this.method883(local35);
			for (@Pc(41) int local41 = 0; local41 < Static38.anInt3056; local41++) {
				@Pc(47) int[] local47 = local35[local41];
				@Pc(51) int[][] local51 = local31[local41];
				@Pc(55) int[] local55 = local51[2];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[0];
				for (@Pc(65) int local65 = 0; local65 < Static118.anInt2608; local65++) {
					@Pc(71) int local71 = local47[local65];
					local55[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local63[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
