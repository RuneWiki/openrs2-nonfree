import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gw", name = "F", descriptor = "I")
	private int anInt2545 = 4096;

	@OriginalMember(owner = "client!gw", name = "J", descriptor = "I")
	private int anInt2546 = 0;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(28) int[] local28 = this.method5472(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static217.anInt3574; local30++) {
				@Pc(36) int local36 = local28[local30];
				local18[local30] = this.anInt2546 <= local36 && this.anInt2545 >= local36 ? 4096 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2546 = arg0.method3555();
		} else if (arg1 == 1) {
			this.anInt2545 = arg0.method3555();
		}
	}
}
