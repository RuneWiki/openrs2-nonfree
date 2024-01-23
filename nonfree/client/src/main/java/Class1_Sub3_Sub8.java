import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
	private int anInt1337 = 4096;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
	private int anInt1334 = 0;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(26) int[][] local26 = this.method4455(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local15[1];
			@Pc(46) int[] local46 = local15[2];
			@Pc(50) int[] local50 = local15[0];
			for (@Pc(52) int local52 = 0; local52 < Static227.anInt4511; local52++) {
				@Pc(63) int local63 = local30[local52];
				@Pc(67) int local67 = local34[local52];
				@Pc(71) int local71 = local38[local52];
				if (this.anInt1334 > local63) {
					local50[local52] = this.anInt1334;
				} else if (local63 <= this.anInt1337) {
					local50[local52] = local63;
				} else {
					local50[local52] = this.anInt1337;
				}
				if (local67 < this.anInt1334) {
					local42[local52] = this.anInt1334;
				} else if (this.anInt1337 < local67) {
					local42[local52] = this.anInt1337;
				} else {
					local42[local52] = local67;
				}
				if (local71 < this.anInt1334) {
					local46[local52] = this.anInt1334;
				} else if (this.anInt1337 < local71) {
					local46[local52] = this.anInt1337;
				} else {
					local46[local52] = local71;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1334 = arg0.method2691();
		} else if (arg1 == 1) {
			this.anInt1337 = arg0.method2691();
		} else if (arg1 == 2) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(17) int[] local17 = this.method4450(0, arg0);
			for (@Pc(19) int local19 = 0; local19 < Static227.anInt4511; local19++) {
				@Pc(26) int local26 = local17[local19];
				if (this.anInt1334 > local26) {
					local7[local19] = this.anInt1334;
				} else if (local26 > this.anInt1337) {
					local7[local19] = this.anInt1337;
				} else {
					local7[local19] = local26;
				}
			}
		}
		return local7;
	}
}
