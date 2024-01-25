import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class4_Sub6_Sub36 extends Class4_Sub6 {

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "[Lclient!gm;")
	private Class26[] aClass26Array1;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(22) int local22 = Static31.anInt797;
			@Pc(24) int local24 = Static223.anInt4562;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(35) int[][][] local35 = super.aClass90_41.method2573();
			this.method5236(local28);
			for (@Pc(41) int local41 = 0; local41 < Static223.anInt4562; local41++) {
				@Pc(47) int[] local47 = local28[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static31.anInt797; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			this.method5236(super.aClass133_41.method3736());
		}
		return local9;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[[I)V")
	private void method5236(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static31.anInt797;
		@Pc(9) int local9 = Static223.anInt4562;
		Static65.method1354(arg0);
		Static65.method1353(Static341.anInt266, Static335.anInt6403);
		if (this.aClass26Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass26Array1.length; local28++) {
			@Pc(35) Class26 local35 = this.aClass26Array1[local28];
			@Pc(38) int local38 = local35.anInt6410;
			@Pc(41) int local41 = local35.anInt6415;
			if (local38 >= 0) {
				if (local41 < 0) {
					local35.method5417(local7, local9);
				} else {
					local35.method5412(local9, local7);
				}
			} else if (local41 >= 0) {
				local35.method5411(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aClass26Array1 = new Class26[arg1.method3440()];
			for (@Pc(35) int local35 = 0; local35 < this.aClass26Array1.length; local35++) {
				@Pc(41) int local41 = arg1.method3440();
				if (local41 == 0) {
					this.aClass26Array1[local35] = Static88.method2154(arg1);
				} else if (local41 == 1) {
					this.aClass26Array1[local35] = Static26.method445(arg1);
				} else if (local41 == 2) {
					this.aClass26Array1[local35] = Static80.method1998(arg1);
				} else if (local41 == 3) {
					this.aClass26Array1[local35] = Static193.method3861(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean489 = arg1.method3440() == 1;
		}
	}
}
