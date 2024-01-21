import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class2_Sub4_Sub5 extends Class2_Sub4 {

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
	private int anInt821 = 4096;

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
	private int anInt820 = 0;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(21) int[] local21 = this.method3129(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static118.anInt2608; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt820 && local29 <= this.anInt821 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt820 = arg1.method1557();
		} else if (arg0 == 1) {
			this.anInt821 = arg1.method1557();
		}
	}
}
