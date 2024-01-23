import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "Z")
	private boolean aBoolean366 = true;

	@OriginalMember(owner = "client!rf", name = "gb", descriptor = "Z")
	private boolean aBoolean367 = true;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(37) int[][] local37 = this.method3713(this.aBoolean366 ? Static30.anInt589 - arg0 : arg0, 0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local37[2];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean367) {
				for (local66 = 0; local66 < Static11.anInt294; local66++) {
					local53[local66] = local41[Static147.anInt3169 - local66];
					local49[local66] = local45[Static147.anInt3169 - local66];
					local61[local66] = local57[Static147.anInt3169 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static11.anInt294; local66++) {
					local53[local66] = local41[local66];
					local49[local66] = local45[local66];
					local61[local66] = local57[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(37) int[] local37 = this.method3706(this.aBoolean366 ? Static30.anInt589 - arg0 : arg0, 0);
			if (this.aBoolean367) {
				for (@Pc(50) int local50 = 0; local50 < Static11.anInt294; local50++) {
					local19[local50] = local37[Static147.anInt3169 - local50];
				}
			} else {
				Static236.method299(local37, 0, local19, 0, Static11.anInt294);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean367 = arg0.method2945() == 1;
		} else if (arg1 == 1) {
			this.aBoolean366 = arg0.method2945() == 1;
		} else if (arg1 == 2) {
			super.aBoolean442 = arg0.method2945() == 1;
		}
	}
}
