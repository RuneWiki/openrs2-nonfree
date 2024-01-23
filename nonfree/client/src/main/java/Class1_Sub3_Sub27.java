import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub3_Sub27 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
	private int anInt4128 = 4096;

	@OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
	private int anInt4133 = 4096;

	@OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
	private int anInt4132 = 4096;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4132 = arg0.method2691();
		} else if (arg1 == 1) {
			this.anInt4128 = arg0.method2691();
		} else if (arg1 == 2) {
			this.anInt4133 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(29) int[][] local29 = this.method4455(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local29[2];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static227.anInt4511; local55++) {
				@Pc(66) int local66 = local37[local55];
				@Pc(70) int local70 = local33[local55];
				@Pc(74) int local74 = local45[local55];
				if (local74 == local66 && local70 == local74) {
					local41[local55] = local66 * this.anInt4132 >> 12;
					local49[local55] = local74 * this.anInt4128 >> 12;
					local53[local55] = local70 * this.anInt4133 >> 12;
				} else {
					local41[local55] = this.anInt4132;
					local49[local55] = this.anInt4128;
					local53[local55] = this.anInt4133;
				}
			}
		}
		return local19;
	}
}
