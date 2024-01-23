import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class2_Sub1_Sub37 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
	private int anInt6076 = 0;

	@OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
	private int anInt6077 = 4096;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(22) int[][] local22 = this.method4937(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local22[2];
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			for (@Pc(48) int local48 = 0; local48 < Static114.anInt1359; local48++) {
				@Pc(59) int local59 = local30[local48];
				@Pc(63) int local63 = local34[local48];
				@Pc(67) int local67 = local26[local48];
				if (local67 < this.anInt6076) {
					local38[local48] = this.anInt6076;
				} else if (local67 <= this.anInt6077) {
					local38[local48] = local67;
				} else {
					local38[local48] = this.anInt6077;
				}
				if (local59 < this.anInt6076) {
					local42[local48] = this.anInt6076;
				} else if (local59 > this.anInt6077) {
					local42[local48] = this.anInt6077;
				} else {
					local42[local48] = local59;
				}
				if (this.anInt6076 > local63) {
					local46[local48] = this.anInt6076;
				} else if (local63 <= this.anInt6077) {
					local46[local48] = local63;
				} else {
					local46[local48] = this.anInt6077;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6076 = arg0.method4242();
		} else if (arg1 == 1) {
			this.anInt6077 = arg0.method4242();
		} else if (arg1 == 2) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(30) int[] local30 = this.method4946(arg0, 0);
			for (@Pc(32) int local32 = 0; local32 < Static114.anInt1359; local32++) {
				@Pc(43) int local43 = local30[local32];
				if (this.anInt6076 > local43) {
					local19[local32] = this.anInt6076;
				} else if (local43 > this.anInt6077) {
					local19[local32] = this.anInt6077;
				} else {
					local19[local32] = local43;
				}
			}
		}
		return local19;
	}
}
