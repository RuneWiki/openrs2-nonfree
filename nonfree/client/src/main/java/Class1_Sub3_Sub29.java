import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class1_Sub3_Sub29 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "[Lclient!wb;")
	private Class14[] aClass14Array1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B[[I)V")
	private void method4736(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static153.anInt3378;
		@Pc(9) int local9 = Static319.anInt6144;
		Static233.method4788(arg0);
		Static73.method1693(Static49.anInt1526, Static250.anInt5127);
		if (this.aClass14Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass14Array1.length; local27++) {
			@Pc(34) Class14 local34 = this.aClass14Array1[local27];
			@Pc(37) int local37 = local34.anInt6452;
			@Pc(40) int local40 = local34.anInt6450;
			if (local37 >= 0) {
				if (local40 < 0) {
					local34.method5442(local9, local7);
				} else {
					local34.method5443(local7, local9);
				}
			} else if (local40 >= 0) {
				local34.method5440(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.aClass14Array1 = new Class14[arg1.method4532()];
			for (@Pc(26) int local26 = 0; local26 < this.aClass14Array1.length; local26++) {
				@Pc(32) int local32 = arg1.method4532();
				if (local32 == 0) {
					this.aClass14Array1[local26] = Static13.method383(arg1);
				} else if (local32 == 1) {
					this.aClass14Array1[local26] = Static291.method4934(arg1);
				} else if (local32 == 2) {
					this.aClass14Array1[local26] = Static305.method5133(arg1);
				} else if (local32 == 3) {
					this.aClass14Array1[local26] = Static102.method2114(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(17) int local17 = Static153.anInt3378;
			@Pc(19) int local19 = Static319.anInt6144;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass144_41.method3949();
			this.method4736(local23);
			for (@Pc(34) int local34 = 0; local34 < Static319.anInt6144; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static153.anInt3378; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			this.method4736(super.aClass122_41.method3384());
		}
		return local9;
	}
}
