import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class3_Sub2_Sub31 extends Class3_Sub2 {

	@OriginalMember(owner = "client!om", name = "L", descriptor = "I")
	private int anInt4048 = 0;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "I")
	private int anInt4049 = 4096;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt4048 = arg1.method3948();
		} else if (arg0 == 1) {
			this.anInt4049 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(28) int[] local28 = this.method4954(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static22.anInt421; local30++) {
				@Pc(37) int local37 = local28[local30];
				local17[local30] = this.anInt4048 <= local37 && local37 <= this.anInt4049 ? 4096 : 0;
			}
		}
		return local17;
	}
}
