import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class6_Sub5_Sub31 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
	private int anInt6817 = 0;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	private int anInt6822 = 4096;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(21) int[] local21 = this.method6543(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static240.anInt4386; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt6817 <= local29 && this.anInt6822 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt6817 = arg1.method6485();
		} else if (arg0 == 1) {
			this.anInt6822 = arg1.method6485();
		}
	}
}
