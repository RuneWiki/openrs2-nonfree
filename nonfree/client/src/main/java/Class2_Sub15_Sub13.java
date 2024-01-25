import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class2_Sub15_Sub13 extends Class2_Sub15 {

	@OriginalMember(owner = "client!hr", name = "H", descriptor = "[Lclient!tfa;")
	private Class26[] aClass26Array1;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			this.method4234(super.aClass338_41.method8467());
		}
		return local14;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.aClass26Array1 = new Class26[arg1.method5203()];
			for (@Pc(35) int local35 = 0; local35 < this.aClass26Array1.length; local35++) {
				@Pc(41) int local41 = arg1.method5203();
				if (local41 == 0) {
					this.aClass26Array1[local35] = Static590.method8899(arg1);
				} else if (local41 == 1) {
					this.aClass26Array1[local35] = Static456.method7306(arg1);
				} else if (local41 == 2) {
					this.aClass26Array1[local35] = Static60.method1140(arg1);
				} else if (local41 == 3) {
					this.aClass26Array1[local35] = Static385.method6488(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[[I)V")
	private void method4234(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static329.anInt6017;
		@Pc(9) int local9 = Static667.anInt10615;
		Static147.method2546(arg0);
		Static182.method3546(Static386.anInt7302, Static426.anInt11132);
		if (this.aClass26Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass26Array1.length; local28++) {
			@Pc(35) Class26 local35 = this.aClass26Array1[local28];
			@Pc(38) int local38 = local35.anInt4744;
			@Pc(41) int local41 = local35.anInt4745;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method4303(local9, local7);
				}
			} else if (local41 >= 0) {
				local35.method4306(local9, local7);
			} else {
				local35.method4304(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(17) int local17 = Static329.anInt6017;
			@Pc(19) int local19 = Static667.anInt10615;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass38_41.method1078();
			this.method4234(local23);
			for (@Pc(34) int local34 = 0; local34 < Static667.anInt10615; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static329.anInt6017; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
