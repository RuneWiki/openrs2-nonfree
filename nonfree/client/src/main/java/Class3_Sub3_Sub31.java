import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class3_Sub3_Sub31 extends Class3_Sub3 {

	@OriginalMember(owner = "client!re", name = "M", descriptor = "[Lclient!ff;")
	private Class35[] aClass35Array1;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[[I)V")
	private void method4505(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static131.anInt2755;
		@Pc(9) int local9 = Static182.anInt3888;
		Static263.method4428(arg0);
		Static104.method1769(Static167.anInt3460, Static351.anInt6821);
		if (this.aClass35Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass35Array1.length; local27++) {
			@Pc(34) Class35 local34 = this.aClass35Array1[local27];
			@Pc(37) int local37 = local34.anInt6706;
			@Pc(40) int local40 = local34.anInt6704;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method5622(local9, local7);
				}
			} else if (local40 < 0) {
				local34.method5617(local9, local7);
			} else {
				local34.method5619(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(17) int local17 = Static131.anInt2755;
			@Pc(19) int local19 = Static182.anInt3888;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass84_41.method2094();
			this.method4505(local23);
			for (@Pc(34) int local34 = 0; local34 < Static182.anInt3888; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static131.anInt2755; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass35Array1 = new Class35[arg0.method3643()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass35Array1.length; local11++) {
				@Pc(17) int local17 = arg0.method3643();
				if (local17 == 0) {
					this.aClass35Array1[local11] = Static185.method3372(arg0);
				} else if (local17 == 1) {
					this.aClass35Array1[local11] = Static283.method3806(arg0);
				} else if (local17 == 2) {
					this.aClass35Array1[local11] = Static168.method2716(arg0);
				} else if (local17 == 3) {
					this.aClass35Array1[local11] = Static328.method5353(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean454 = arg0.method3643() == 1;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			this.method4505(super.aClass217_41.method5706());
		}
		return local14;
	}
}
