import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!v", name = "U", descriptor = "[Lclient!ad;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass3Array1 = new Class3[arg0.method2945()];
			for (@Pc(20) int local20 = 0; local20 < this.aClass3Array1.length; local20++) {
				@Pc(26) int local26 = arg0.method2945();
				if (local26 == 0) {
					this.aClass3Array1[local20] = Static119.method2049(arg0);
				} else if (local26 == 1) {
					this.aClass3Array1[local20] = Static7.method239(arg0);
				} else if (local26 == 2) {
					this.aClass3Array1[local20] = Static1.method53(arg0);
				} else if (local26 == 3) {
					this.aClass3Array1[local20] = Static159.method2578(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean442 = arg0.method2945() == 1;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			this.method3531(super.aClass37_41.method1165());
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B[[I)V")
	private void method3531(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static11.anInt294;
		@Pc(14) int local14 = Static116.anInt2571;
		Static133.method2214(arg0);
		Static6.method2293(Static30.anInt589, Static147.anInt3169);
		if (this.aClass3Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass3Array1.length; local28++) {
			@Pc(35) Class3 local35 = this.aClass3Array1[local28];
			@Pc(38) int local38 = local35.anInt4874;
			@Pc(41) int local41 = local35.anInt4875;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method3663(local7, local14);
				}
			} else if (local41 >= 0) {
				local35.method3660(local7, local14);
			} else {
				local35.method3661(local14, local7);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(22) int local22 = Static11.anInt294;
			@Pc(24) int local24 = Static116.anInt2571;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass71_41.method2053();
			this.method3531(local28);
			for (@Pc(39) int local39 = 0; local39 < Static116.anInt2571; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static11.anInt294; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local12;
	}
}
