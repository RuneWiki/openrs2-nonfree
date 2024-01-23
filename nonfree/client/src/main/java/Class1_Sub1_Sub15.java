import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!il", name = "W", descriptor = "I")
	private int anInt2616 = 0;

	@OriginalMember(owner = "client!il", name = "cb", descriptor = "I")
	private int anInt2618 = 4096;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(32) int[] local32 = this.method4746(0, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static75.anInt1848; local34++) {
				@Pc(41) int local41 = local32[local34];
				local11[local34] = local41 >= this.anInt2616 && this.anInt2618 >= local41 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2616 = arg0.method2652();
		} else if (arg1 == 1) {
			this.anInt2618 = arg0.method2652();
		}
	}
}
