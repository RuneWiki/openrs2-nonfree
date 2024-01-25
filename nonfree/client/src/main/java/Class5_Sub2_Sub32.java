import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class5_Sub2_Sub32 extends Class5_Sub2 {

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "[Lclient!sk;")
	private Class56[] aClass56Array1;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			this.method7855(super.aClass379_41.method9009());
		}
		return local11;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass56Array1 = new Class56[arg0.method5966()];
			for (@Pc(35) int local35 = 0; local35 < this.aClass56Array1.length; local35++) {
				@Pc(41) int local41 = arg0.method5966();
				if (local41 == 0) {
					this.aClass56Array1[local35] = Static46.method799(arg0);
				} else if (local41 == 1) {
					this.aClass56Array1[local35] = Static177.method2709(arg0);
				} else if (local41 == 2) {
					this.aClass56Array1[local35] = Static250.method4151(arg0);
				} else if (local41 == 3) {
					this.aClass56Array1[local35] = Static267.method4305(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(17) int local17 = Static597.anInt10025;
			@Pc(19) int local19 = Static591.anInt9907;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(30) int[][][] local30 = super.aClass160_41.method3858();
			this.method7855(local23);
			for (@Pc(36) int local36 = 0; local36 < Static591.anInt9907; local36++) {
				@Pc(42) int[] local42 = local23[local36];
				@Pc(46) int[][] local46 = local30[local36];
				@Pc(50) int[] local50 = local46[0];
				@Pc(54) int[] local54 = local46[1];
				@Pc(58) int[] local58 = local46[2];
				for (@Pc(60) int local60 = 0; local60 < Static597.anInt10025; local60++) {
					@Pc(66) int local66 = local42[local60];
					local58[local60] = (local66 & 0xFF) << 4;
					local54[local60] = local66 >> 4 & 0xFF0;
					local50[local60] = local66 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B[[I)V")
	private void method7855(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static597.anInt10025;
		@Pc(9) int local9 = Static591.anInt9907;
		Static474.method7017(arg0);
		Static621.method8828(Static273.anInt4903, Static28.anInt365);
		if (this.aClass56Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass56Array1.length; local31++) {
			@Pc(38) Class56 local38 = this.aClass56Array1[local31];
			@Pc(41) int local41 = local38.anInt5406;
			@Pc(44) int local44 = local38.anInt5408;
			if (local41 >= 0) {
				if (local44 >= 0) {
					local38.method4856(local9, local7);
				} else {
					local38.method4858(local7, local9);
				}
			} else if (local44 >= 0) {
				local38.method4857(local9, local7);
			}
		}
	}
}
