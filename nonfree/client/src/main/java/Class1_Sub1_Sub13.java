import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
	private int anInt1641 = 4096;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
	private int anInt1638 = 0;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(26) int[] local26 = this.method3580(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static115.anInt2578; local28++) {
				@Pc(34) int local34 = local26[local28];
				local12[local28] = this.anInt1638 <= local34 && this.anInt1641 >= local34 ? 4096 : 0;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1638 = arg0.method2765();
		} else if (arg1 == 1) {
			this.anInt1641 = arg0.method2765();
		}
	}
}
