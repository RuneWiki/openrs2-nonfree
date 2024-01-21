import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
	private int anInt2708;

	@OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
	private int anInt2712;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2712 = arg1.method1642();
		} else if (arg0 == 1) {
			this.anInt2708 = arg1.method1642();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(21) int[] local21 = this.method3012(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static65.anInt1933; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt2712 && local29 <= this.anInt2708 ? 4096 : 0;
			}
		}
		return local11;
	}
}
