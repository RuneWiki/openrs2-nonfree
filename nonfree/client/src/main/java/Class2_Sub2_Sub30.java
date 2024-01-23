import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class2_Sub2_Sub30 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rf", name = "db", descriptor = "[Lclient!ch;")
	private Class14[] aClass14Array1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(22) int local22 = Static11.anInt313;
			@Pc(24) int local24 = Static54.anInt953;
			@Pc(29) int[][][] local29 = super.aClass51_41.method1698();
			@Pc(33) int[][] local33 = new int[local22][local24];
			this.method3246(local33);
			for (@Pc(39) int local39 = 0; local39 < Static11.anInt313; local39++) {
				@Pc(45) int[] local45 = local33[local39];
				@Pc(49) int[][] local49 = local29[local39];
				@Pc(53) int[] local53 = local49[1];
				@Pc(57) int[] local57 = local49[0];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static54.anInt953; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local53[local63] = local69 >> 4 & 0xFF0;
					local57[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([[II)V")
	private void method3246(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static11.anInt313;
		@Pc(9) int local9 = Static54.anInt953;
		Static183.method3363(arg0);
		Static194.method3536(Static156.anInt3604, Static74.anInt1601);
		if (this.aClass14Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass14Array1.length; local23++) {
			@Pc(30) Class14 local30 = this.aClass14Array1[local23];
			@Pc(33) int local33 = local30.anInt4048;
			@Pc(36) int local36 = local30.anInt4055;
			if (local36 >= 0) {
				if (local33 >= 0) {
					local30.method3211(local9, local7);
				} else {
					local30.method3207(local7, local9);
				}
			} else if (local33 >= 0) {
				local30.method3208(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			this.method3246(super.aClass16_41.method299());
		}
		return local9;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass14Array1 = new Class14[arg0.method2122()];
			for (@Pc(26) int local26 = 0; local26 < this.aClass14Array1.length; local26++) {
				@Pc(32) int local32 = arg0.method2122();
				if (local32 == 0) {
					this.aClass14Array1[local26] = Static158.method2846(arg0);
				} else if (local32 == 1) {
					this.aClass14Array1[local26] = Static167.method3049(arg0);
				} else if (local32 == 2) {
					this.aClass14Array1[local26] = Static113.method1929(arg0);
				} else if (local32 == 3) {
					this.aClass14Array1[local26] = Static5.method100(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}
}
