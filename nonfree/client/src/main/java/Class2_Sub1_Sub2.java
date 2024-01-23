import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(27) int[] local27 = this.method4946(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static114.anInt1359; local29++) {
				local13[local29] = 4096 - local27[local29];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(30) int[][] local30 = this.method4937(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local19[1];
			@Pc(50) int[] local50 = local19[2];
			@Pc(54) int[] local54 = local19[0];
			for (@Pc(56) int local56 = 0; local56 < Static114.anInt1359; local56++) {
				local54[local56] = 4096 - local34[local56];
				local46[local56] = 4096 - local38[local56];
				local50[local56] = 4096 - local42[local56];
			}
		}
		return local19;
	}
}
