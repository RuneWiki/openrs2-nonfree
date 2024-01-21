import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class2_Sub1_Sub25 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "[Lclient!pe;")
	private Class35[] aClass35Array1;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(22) int local22 = Static135.anInt2897;
			@Pc(24) int local24 = Static102.anInt2347;
			@Pc(29) int[][][] local29 = super.aClass43_41.method1431();
			@Pc(33) int[][] local33 = new int[local24][local22];
			this.method2638(local33);
			for (@Pc(39) int local39 = 0; local39 < Static102.anInt2347; local39++) {
				@Pc(45) int[] local45 = local33[local39];
				@Pc(49) int[][] local49 = local29[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static135.anInt2897; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([[II)V")
	private void method2638(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static102.anInt2347;
		@Pc(17) int local17 = Static135.anInt2897;
		Static171.method2653(arg0);
		Static92.method1592(Static207.anInt4078, Static201.anInt3995);
		if (this.aClass35Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass35Array1.length; local31++) {
			@Pc(38) Class35 local38 = this.aClass35Array1[local31];
			@Pc(41) int local41 = local38.anInt4070;
			@Pc(44) int local44 = local38.anInt4071;
			if (local41 < 0) {
				if (local44 >= 0) {
					local38.method3111(local7, local17);
				}
			} else if (local44 >= 0) {
				local38.method3115(local17, local7);
			} else {
				local38.method3114(local17, local7);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			this.method2638(super.aClass52_41.method1597());
		}
		return local17;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass35Array1 = new Class35[arg0.method260()];
			for (@Pc(18) int local18 = 0; local18 < this.aClass35Array1.length; local18++) {
				@Pc(24) int local24 = arg0.method260();
				if (local24 == 0) {
					this.aClass35Array1[local18] = Static22.method434(arg0);
				} else if (local24 == 1) {
					this.aClass35Array1[local18] = Static182.method2819(arg0);
				} else if (local24 == 2) {
					this.aClass35Array1[local18] = Static76.method3253(arg0);
				} else if (local24 == 3) {
					this.aClass35Array1[local18] = Static107.method2361(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}
}
