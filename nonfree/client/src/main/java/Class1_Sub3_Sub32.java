import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class1_Sub3_Sub32 extends Class1_Sub3 {

	@OriginalMember(owner = "client!se", name = "L", descriptor = "I")
	private int anInt4737 = 4;

	@OriginalMember(owner = "client!se", name = "P", descriptor = "I")
	private int anInt4739 = 4;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4737 = arg0.method2690();
		} else if (arg1 == 1) {
			this.anInt4739 = arg0.method2690();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(29) int local29 = Static227.anInt4511 / this.anInt4737;
			@Pc(34) int local34 = Static26.anInt632 / this.anInt4739;
			@Pc(53) int[][] local53;
			if (local34 > 0) {
				@Pc(43) int local43 = arg0 % local34;
				local53 = this.method4455(0, Static26.anInt632 * local43 / local34);
			} else {
				local53 = this.method4455(0, 0);
			}
			@Pc(65) int[] local65 = local53[0];
			@Pc(69) int[] local69 = local53[1];
			@Pc(73) int[] local73 = local19[1];
			@Pc(77) int[] local77 = local53[2];
			@Pc(81) int[] local81 = local19[2];
			@Pc(85) int[] local85 = local19[0];
			for (@Pc(87) int local87 = 0; local87 < Static227.anInt4511; local87++) {
				@Pc(107) int local107;
				if (local29 > 0) {
					@Pc(101) int local101 = local87 % local29;
					local107 = local101 * Static227.anInt4511 / local29;
				} else {
					local107 = 0;
				}
				local85[local87] = local65[local107];
				local73[local87] = local69[local107];
				local81[local87] = local77[local107];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(27) int local27 = Static227.anInt4511 / this.anInt4737;
			@Pc(32) int local32 = Static26.anInt632 / this.anInt4739;
			@Pc(43) int[] local43;
			@Pc(49) int local49;
			if (local32 <= 0) {
				local43 = this.method4450(0, 0);
			} else {
				local49 = arg0 % local32;
				local43 = this.method4450(0, local49 * Static26.anInt632 / local32);
			}
			for (local49 = 0; local49 < Static227.anInt4511; local49++) {
				if (local27 <= 0) {
					local17[local49] = local43[0];
				} else {
					@Pc(85) int local85 = local49 % local27;
					local17[local49] = local43[Static227.anInt4511 * local85 / local27];
				}
			}
		}
		return local17;
	}
}
