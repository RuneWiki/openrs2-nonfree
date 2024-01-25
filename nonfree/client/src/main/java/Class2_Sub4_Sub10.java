import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class2_Sub4_Sub10 extends Class2_Sub4 {

	@OriginalMember(owner = "client!er", name = "O", descriptor = "[Lclient!sr;")
	private Class65[] aClass65Array1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I[[I)V")
	private void method1259(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static76.anInt1458;
		@Pc(9) int local9 = Static193.anInt3629;
		Static335.method4943(arg0);
		Static247.method4892(Static269.anInt4657, Static283.anInt4900);
		if (this.aClass65Array1 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < this.aClass65Array1.length; local25++) {
			@Pc(32) Class65 local32 = this.aClass65Array1[local25];
			@Pc(35) int local35 = local32.anInt5511;
			@Pc(38) int local38 = local32.anInt5514;
			if (local35 >= 0) {
				if (local38 < 0) {
					local32.method4776(local9, local7);
				} else {
					local32.method4775(local7, local9);
				}
			} else if (local38 >= 0) {
				local32.method4777(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass65Array1 = new Class65[arg0.method5350()];
			for (@Pc(25) int local25 = 0; local25 < this.aClass65Array1.length; local25++) {
				@Pc(31) int local31 = arg0.method5350();
				if (local31 == 0) {
					this.aClass65Array1[local25] = Static245.method3912(arg0);
				} else if (local31 == 1) {
					this.aClass65Array1[local25] = Static139.method2655(arg0);
				} else if (local31 == 2) {
					this.aClass65Array1[local25] = Static94.method1871(arg0);
				} else if (local31 == 3) {
					this.aClass65Array1[local25] = Static380.method5564(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean465 = arg0.method5350() == 1;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			this.method1259(super.aClass237_41.method5429());
		}
		return local14;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(22) int local22 = Static76.anInt1458;
			@Pc(24) int local24 = Static193.anInt3629;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass170_41.method3730();
			this.method1259(local28);
			for (@Pc(39) int local39 = 0; local39 < Static193.anInt3629; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static76.anInt1458; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
