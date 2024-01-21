import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class3_Sub2_Sub27 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pi", name = "hb", descriptor = "[Lclient!fi;")
	private Class30[] aClass30Array1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I[[I)V")
	private void method2262(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static190.anInt3865;
		@Pc(9) int local9 = Static97.anInt2014;
		Static139.method3216(arg0);
		Static31.method566(Static134.anInt2681, Static170.anInt1101);
		if (this.aClass30Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass30Array1.length; local23++) {
			@Pc(30) Class30 local30 = this.aClass30Array1[local23];
			@Pc(33) int local33 = local30.anInt3269;
			@Pc(36) int local36 = local30.anInt3273;
			if (local33 < 0) {
				if (local36 >= 0) {
					local30.method2384(local7, local9);
				}
			} else if (local36 >= 0) {
				local30.method2391(local9, local7);
			} else {
				local30.method2390(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			this.method2262(super.aClass2_41.method11());
		}
		return local9;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(13) int local13 = Static190.anInt3865;
			@Pc(15) int local15 = Static97.anInt2014;
			@Pc(19) int[][] local19 = new int[local15][local13];
			@Pc(24) int[][][] local24 = super.aClass67_41.method1946();
			this.method2262(local19);
			for (@Pc(30) int local30 = 0; local30 < Static97.anInt2014; local30++) {
				@Pc(36) int[][] local36 = local24[local30];
				@Pc(40) int[] local40 = local36[1];
				@Pc(44) int[] local44 = local36[0];
				@Pc(48) int[] local48 = local19[local30];
				@Pc(52) int[] local52 = local36[2];
				for (@Pc(54) int local54 = 0; local54 < Static190.anInt3865; local54++) {
					@Pc(60) int local60 = local48[local54];
					local52[local54] = (local60 & 0xFF) << 4;
					local40[local54] = local60 >> 4 & 0xFF0;
					local44[local54] = local60 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass30Array1 = new Class30[arg0.method1278()];
			for (@Pc(16) int local16 = 0; local16 < this.aClass30Array1.length; local16++) {
				@Pc(22) int local22 = arg0.method1278();
				if (local22 == 0) {
					this.aClass30Array1[local16] = Static16.method301(arg0);
				} else if (local22 == 1) {
					this.aClass30Array1[local16] = Static207.method3297(arg0);
				} else if (local22 == 2) {
					this.aClass30Array1[local16] = Static174.method2692(arg0);
				} else if (local22 == 3) {
					this.aClass30Array1[local16] = Static131.method1841(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}
}
