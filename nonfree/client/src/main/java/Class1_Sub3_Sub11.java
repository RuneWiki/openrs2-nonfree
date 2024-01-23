import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
	private int anInt1943 = 4096;

	@OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
	private int anInt1945 = 0;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(21) int[] local21 = this.method4450(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static227.anInt4511; local23++) {
				@Pc(34) int local34 = local21[local23];
				local11[local23] = this.anInt1945 <= local34 && local34 <= this.anInt1943 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1945 = arg0.method2691();
		} else if (arg1 == 1) {
			this.anInt1943 = arg0.method2691();
		}
	}
}
