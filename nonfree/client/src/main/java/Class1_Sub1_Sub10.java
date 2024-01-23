import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gl", name = "Z", descriptor = "I")
	private int anInt2139 = 4096;

	@OriginalMember(owner = "client!gl", name = "fb", descriptor = "I")
	private int anInt2144 = 0;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(30) int[] local30 = this.method4746(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static75.anInt1848; local32++) {
				@Pc(43) int local43 = local30[local32];
				if (local43 < this.anInt2144) {
					local19[local32] = this.anInt2144;
				} else if (this.anInt2139 < local43) {
					local19[local32] = this.anInt2139;
				} else {
					local19[local32] = local43;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(30) int[][] local30 = this.method4758(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local30[2];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static75.anInt1848; local56++) {
				@Pc(67) int local67 = local34[local56];
				@Pc(71) int local71 = local38[local56];
				@Pc(75) int local75 = local46[local56];
				if (this.anInt2144 > local67) {
					local42[local56] = this.anInt2144;
				} else if (this.anInt2139 < local67) {
					local42[local56] = this.anInt2139;
				} else {
					local42[local56] = local67;
				}
				if (this.anInt2144 > local71) {
					local50[local56] = this.anInt2144;
				} else if (this.anInt2139 >= local71) {
					local50[local56] = local71;
				} else {
					local50[local56] = this.anInt2139;
				}
				if (local75 < this.anInt2144) {
					local54[local56] = this.anInt2144;
				} else if (local75 > this.anInt2139) {
					local54[local56] = this.anInt2139;
				} else {
					local54[local56] = local75;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2144 = arg0.method2652();
		} else if (arg1 == 1) {
			this.anInt2139 = arg0.method2652();
		} else if (arg1 == 2) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}
}
