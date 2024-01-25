import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class2_Sub6_Sub30 extends Class2_Sub6 {

	@OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
	private int anInt5012 = 4096;

	@OriginalMember(owner = "client!pr", name = "S", descriptor = "I")
	private int anInt5016 = 0;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5016 = arg0.method4245();
		} else if (arg1 == 1) {
			this.anInt5012 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(34) int[] local34 = this.method5635(arg0, 0);
			for (@Pc(36) int local36 = 0; local36 < Static151.anInt2711; local36++) {
				@Pc(42) int local42 = local34[local36];
				local11[local36] = this.anInt5016 <= local42 && this.anInt5012 >= local42 ? 4096 : 0;
			}
		}
		return local11;
	}
}
