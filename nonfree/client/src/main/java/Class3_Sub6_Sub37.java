import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class3_Sub6_Sub37 extends Class3_Sub6 {

	@OriginalMember(owner = "client!waa", name = "M", descriptor = "[Lclient!ft;")
	private Class110[] aClass110Array1;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(17) int local17 = Static481.anInt8358;
			@Pc(19) int local19 = Static465.anInt8091;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass339_41.method7668();
			this.method7815(local23);
			for (@Pc(34) int local34 = 0; local34 < Static465.anInt8091; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static481.anInt8358; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			this.method7815(super.aClass170_41.method4101());
		}
		return local14;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([[II)V")
	private void method7815(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static481.anInt8358;
		@Pc(9) int local9 = Static465.anInt8091;
		Static272.method4146(arg0);
		Static11.method7289(Static527.anInt10285, Static325.anInt5932);
		if (this.aClass110Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass110Array1.length; local29++) {
			@Pc(36) Class110 local36 = this.aClass110Array1[local29];
			@Pc(39) int local39 = local36.anInt9843;
			@Pc(42) int local42 = local36.anInt9840;
			if (local39 >= 0) {
				if (local42 >= 0) {
					local36.method7738(local9, local7);
				} else {
					local36.method7735(local7, local9);
				}
			} else if (local42 >= 0) {
				local36.method7737(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass110Array1 = new Class110[arg0.method6814()];
			for (@Pc(34) int local34 = 0; local34 < this.aClass110Array1.length; local34++) {
				@Pc(40) int local40 = arg0.method6814();
				if (local40 == 0) {
					this.aClass110Array1[local34] = Static174.method6966(arg0);
				} else if (local40 == 1) {
					this.aClass110Array1[local34] = Static253.method3966(arg0);
				} else if (local40 == 2) {
					this.aClass110Array1[local34] = Static371.method5234(arg0);
				} else if (local40 == 3) {
					this.aClass110Array1[local34] = Static62.method1514(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}
}
