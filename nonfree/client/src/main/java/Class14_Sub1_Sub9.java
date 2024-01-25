import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class14_Sub1_Sub9 extends Class14_Sub1 {

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "[Lclient!ku;")
	private Class86[] aClass86Array1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass86Array1 = new Class86[arg0.method5866()];
			for (@Pc(25) int local25 = 0; local25 < this.aClass86Array1.length; local25++) {
				@Pc(31) int local31 = arg0.method5866();
				if (local31 == 0) {
					this.aClass86Array1[local25] = Static69.method1360(arg0);
				} else if (local31 == 1) {
					this.aClass86Array1[local25] = Static208.method3267(arg0);
				} else if (local31 == 2) {
					this.aClass86Array1[local25] = Static674.method9283(arg0);
				} else if (local31 == 3) {
					this.aClass86Array1[local25] = Static283.method4062(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean734 = arg0.method5866() == 1;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			this.method2507(super.aClass211_41.method5139());
		}
		return local14;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[[I)V")
	private void method2507(@OriginalArg(1) int[][] arg0) {
		@Pc(12) int local12 = Static371.anInt6835;
		@Pc(14) int local14 = Static535.anInt9239;
		Static36.method838(arg0);
		Static339.method5270(Static192.anInt3590, Static52.anInt1266);
		if (this.aClass86Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass86Array1.length; local28++) {
			@Pc(35) Class86 local35 = this.aClass86Array1[local28];
			@Pc(38) int local38 = local35.anInt11134;
			@Pc(41) int local41 = local35.anInt11131;
			if (local38 >= 0) {
				if (local41 < 0) {
					local35.method9265(local12, local14);
				} else {
					local35.method9264(local12, local14);
				}
			} else if (local41 >= 0) {
				local35.method9263(local14, local12);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(17) int local17 = Static371.anInt6835;
			@Pc(19) int local19 = Static535.anInt9239;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass279_41.method6837();
			this.method2507(local23);
			for (@Pc(34) int local34 = 0; local34 < Static535.anInt9239; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static371.anInt6835; local58++) {
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
