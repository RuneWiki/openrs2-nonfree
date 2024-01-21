import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub1_Sub1_Sub7 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
	public int anInt4182;

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
	public int anInt4187;

	@OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
	private int anInt4186 = -32768;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class2_Sub1_Sub1_Sub4 local14 = Static88.method2046(this.anInt4182).method1148(null, this.anInt4187, 0);
		if (local14 != null) {
			local14.method3173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt4186 = local14.method3179();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()I")
	@Override
	public int method3179() {
		return this.anInt4186;
	}
}
